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
import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit tests for the NodeAnchor class, when using a Rectangle as the Node and the Node reference.
 *
 * @version 0.1
 */
public class NodeAnchorRectangleTest {
   private static final double DELTA = 0.2d;

   public NodeAnchorRectangleTest() {
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
    * Test of anchor method with TOP / TOP parameters.
    */
   @Test
   public void testAnchorTopTop() {
      System.out.println("NodeAnchorTest : testAnchorTopTop");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.TOP, AnchorPosition.TOP);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with BOTTOM / BOTTOM parameters.
    */
   @Test
   public void testAnchorBottomBottom() {
      System.out.println("NodeAnchorTest : testAnchorBottomBottom");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.BOTTOM, AnchorPosition.BOTTOM);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 130, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with LEFT / LEFT parameters.
    */
   @Test
   public void testAnchorLeftLeft() {
      System.out.println("NodeAnchorTest : testAnchorLeftLeft");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.LEFT, AnchorPosition.LEFT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with RIGHT / RIGHT parameters.
    */
   @Test
   public void testAnchorRightRight() {
      System.out.println("NodeAnchorTest : testAnchorRightRight");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.RIGHT, AnchorPosition.RIGHT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 230, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with TOP / BOTTOM parameters.
    */
   @Test
   public void testAnchorTopBottom() {
      System.out.println("NodeAnchorTest : testAnchorTopBottom");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.TOP, AnchorPosition.BOTTOM);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 200, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with BOTTOM / TOP parameters.
    */
   @Test
   public void testAnchorBottomTop() {
      System.out.println("NodeAnchorTest : testAnchorBottomTop");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.BOTTOM, AnchorPosition.TOP);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 30, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with LEFT / RIGHT parameters.
    */
   @Test
   public void testAnchorLeftRight() {
      System.out.println("NodeAnchorTest : testAnchorLeftRight");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.LEFT, AnchorPosition.RIGHT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 300, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with RIGHT / LEFT parameters.
    */
   @Test
   public void testAnchorRightLeft() {
      System.out.println("NodeAnchorTest : testAnchorRightLeft");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.RIGHT, AnchorPosition.LEFT);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 130, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with fill.
    */
   @Test
   public void testAnchorFill() {
      System.out.println("NodeAnchorTest : testAnchorFill");
      Rectangle rec1 = new Rectangle();
      rec1.setFill(Color.YELLOW);

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.fill(rec1);

      Pane root = new Pane();
      rec1.setX(200);
      rec1.setY(100);
      rec1.setWidth(100);
      rec1.setHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);
      root.getChildren().add(rec1);
      root.getChildren().add(rec2);

      // reference rectangle
      assertEquals("Reference Rectangle position", 200, rec1.getX(), DELTA);
      assertEquals("Reference Rectangle position", 100, rec1.getY(), DELTA);
      assertEquals("Reference Rectangle size", 100, rec1.getWidth(), DELTA);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 200, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 100, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }
}
