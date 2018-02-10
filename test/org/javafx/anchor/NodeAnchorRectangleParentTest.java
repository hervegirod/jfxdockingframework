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
 * Unit tests for the NodeAnchor class, when using a Rectangle as the Node and the Parent of the
 * Rectangle as the Node reference.
 *
 * @version 0.1
 */
public class NodeAnchorRectangleParentTest {
   private static final double DELTA = 0.2d;

   public NodeAnchorRectangleParentTest() {
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
    * Test of anchor method with TOP / BOTTOM parameters.
    */
   @Test
   public void testAnchorTopBottom() {
      System.out.println("NodeAnchorRectangleParentTest : testAnchorTopBottom");
      Pane rec1 = new Pane();
      rec1.setStyle("-fx-background-color: yellow;");

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      Pane root = new Pane();
      root.getChildren().add(rec1);
      rec1.getChildren().add(rec2);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.TOP, AnchorPosition.BOTTOM);

      rec1.setLayoutX(200);
      rec1.setLayoutY(100);
      rec1.setPrefWidth(100);
      rec1.setPrefHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 0, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", -1, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with BOTTOM / TOP parameters.
    */
   @Test
   public void testAnchorBottomTop() {
      System.out.println("NodeAnchorRectangleParentTest : testAnchorBottomTop");
      Pane rec1 = new Pane();
      rec1.setStyle("-fx-background-color: yellow;");

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      Pane root = new Pane();
      root.getChildren().add(rec1);
      rec1.getChildren().add(rec2);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.BOTTOM, AnchorPosition.TOP);

      rec1.setLayoutX(200);
      rec1.setLayoutY(100);
      rec1.setPrefWidth(100);
      rec1.setPrefHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", 0, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", -70, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 100, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 70, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with LEFT / RIGHT parameters.
    */
   @Test
   public void testAnchorLeftRight() {
      System.out.println("NodeAnchorRectangleParentTest : testAnchorLeftRight");
      Pane rec1 = new Pane();
      rec1.setStyle("-fx-background-color: yellow;");

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      Pane root = new Pane();
      root.getChildren().add(rec1);
      rec1.getChildren().add(rec2);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.LEFT, AnchorPosition.RIGHT);

      rec1.setLayoutX(200);
      rec1.setLayoutY(100);
      rec1.setPrefWidth(100);
      rec1.setPrefHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", -1, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 0, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }

   /**
    * Test of anchor method with RIGHT / LEFT parameters.
    */
   @Test
   public void testAnchorRightLeft() {
      System.out.println("NodeAnchorRectangleParentTest : testAnchorRightLeft");
      Pane rec1 = new Pane();
      rec1.setStyle("-fx-background-color: yellow;");

      Rectangle rec2 = new Rectangle();
      rec2.setFill(Color.RED);
      Pane root = new Pane();
      root.getChildren().add(rec1);
      rec1.getChildren().add(rec2);
      NodeAnchor anchor = new NodeAnchor(rec2);
      anchor.anchor(rec1, AnchorPosition.RIGHT, AnchorPosition.LEFT);

      rec1.setLayoutX(200);
      rec1.setLayoutY(100);
      rec1.setPrefWidth(100);
      rec1.setPrefHeight(100);
      rec2.setWidth(70);
      rec2.setHeight(70);

      // the position of the second Rectangle is forced to the position of the first
      assertEquals("Relative Rectangle position", -70, rec2.getX(), DELTA);
      assertEquals("Relative Rectangle position", 0, rec2.getY(), DELTA);
      // the widget of the second Rectangle is forced to the width of the first
      assertEquals("Relative Rectangle size", 70, rec2.getWidth(), DELTA);
      assertEquals("Relative Rectangle size", 100, rec2.getHeight(), DELTA);
   }
}
