/*
Copyright (c) 2018, Herve Girod
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

The views and conclusions contained in the software and documentation are those
of the authors and should not be interpreted as representing official policies,
either expressed or implied, of the FreeBSD Project.

Alternatively if you have any questions about this project, you can visit
the project website at the project page on https://github.com/hervegirod/jfxdockingframework
 */
package org.javafx.anchor;

import static org.junit.Assert.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit tests for the NodeAnchor class, when using a Circle as the Node and a Rectangle as the Node reference.
 *
 * @since 0.1
 */
public class NodeAnchorCircleTest {
   private static final double DELTA = 0.2d;

   public NodeAnchorCircleTest() {
   }

   @BeforeClass
   public static void setUpClass() {
   }

   @AfterClass
   public static void tearDownClass() {
   }

   @Before
   public void setUp() {
   }

   @After
   public void tearDown() {
   }

   /**
    * Test of anchor method with RIGHT / LEFT parameters.
    */
   @Test
   public void testAnchorRightLeft() {
      System.out.println("NodeAnchor2Test : testAnchorRightLeft");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.RIGHT, AnchorPosition.LEFT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 150, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with LEFT / RIGHT parameters.
    */
   @Test
   public void testAnchorLeftRight() {
      System.out.println("NodeAnchor2Test : testAnchorLeftRight");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.LEFT, AnchorPosition.RIGHT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 350, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with BOTTOM / TOP parameters.
    */
   @Test
   public void testAnchorBottomTop() {
      System.out.println("NodeAnchor2Test : testAnchorBottomTop");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.BOTTOM, AnchorPosition.TOP);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 50, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with TOP / BOTTOM parameters.
    */
   @Test
   public void testAnchorTopBottom() {
      System.out.println("NodeAnchor2Test : testAnchorTopBottom");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.TOP, AnchorPosition.BOTTOM);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 250, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with TOP / TOP parameters.
    */
   @Test
   public void testAnchorTopTop() {
      System.out.println("NodeAnchor2Test : testAnchorTopTop");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.TOP, AnchorPosition.TOP);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with BOTTOM / BOTTOM parameters.
    */
   @Test
   public void testAnchorBottomBottom() {
      System.out.println("NodeAnchor2Test : testAnchorBottomBottom");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.BOTTOM, AnchorPosition.BOTTOM);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Rectangle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with LEFT / LEFT parameters.
    */
   @Test
   public void testAnchorLeftLeft() {
      System.out.println("NodeAnchor2Test : testAnchorLeftLeft");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.LEFT, AnchorPosition.LEFT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Circle is forced to the position of the first
      assertEquals("Relative Circle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Circle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Circle is forced to the width of the first
      assertEquals("Relative Circle size", 50, rec2.getRadius(), DELTA);
   }

   /**
    * Test of anchor method with RIGHT / RIGHT parameters.
    */
   @Test
   public void testAnchorRightRight() {
      System.out.println("NodeAnchor2Test : testAnchorRightRight");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Circle rec2 = new Circle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.RIGHT, AnchorPosition.RIGHT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setRadius(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Circle position", 250, rec2.getCenterX(), DELTA);
      assertEquals("Relative Circle position", 150, rec2.getCenterY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Circle size", 50, rec2.getRadius(), DELTA);
   }
}
