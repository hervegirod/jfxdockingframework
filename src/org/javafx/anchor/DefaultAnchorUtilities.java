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

import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * A default AnchorUtilities. This class manage the following Node types:
 * <ul>
 * <li>{@link javafx.scene.layout.Region}</li>
 * <li>{@link javafx.scene.shape.Rectangle}</li>
 * <li>{@link javafx.scene.shape.Circle}</li>
 * <li>{@link javafx.scene.shape.Ellipse}</li>
 * <li>{@link javafx.scene.shape.Arc}</li>
 * <li>{@link javafx.scene.text.Text}</li>
 * </ul>
 *
 * @since 0.1
 */
public class DefaultAnchorUtilities implements AnchorUtilities {
   /**
    * Return the Y position of a Node.
    *
    * @param node the Node
    * @return the Y position of the Node
    */
   @Override
   public double getY(Node node) {
      if (node instanceof Region) {
         return ((Region) node).getLayoutY();
      } else if (node instanceof Rectangle) {
         return ((Rectangle) node).getY();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         return circle.getCenterY() - circle.getRadius();
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         return el.getCenterY() - el.getRadiusY();
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         return arc.getCenterY() - arc.getRadiusY();
      } else if (node instanceof Text) {
         Text text = (Text) node;
         return text.getY();
      } else {
         return node.layoutBoundsProperty().get().getMinY();
      }
   }

   /**
    * Return the X position of a Node.
    *
    * @param node the Node
    * @return the X position of the Node
    */
   @Override
   public double getX(Node node) {
      if (node instanceof Region) {
         return ((Region) node).getLayoutX();
      } else if (node instanceof Rectangle) {
         return ((Rectangle) node).getX();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         return circle.getCenterX() - circle.getRadius();
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         return el.getCenterX() - el.getRadiusX();
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         return arc.getCenterX() - arc.getRadiusX();
      } else if (node instanceof Text) {
         Text text = (Text) node;
         return text.getX();
      } else {
         return node.layoutBoundsProperty().get().getMinX();
      }
   }

   /**
    * Set the X position of a Node.
    *
    * @param node the Node
    * @param value the X position
    */
   @Override
   public void setX(Node node, double value) {
      if (node instanceof Region) {
         ((Region) node).setLayoutX(value);
      } else if (node instanceof Rectangle) {
         ((Rectangle) node).setX(value);
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         circle.setCenterX(value + circle.getRadius());
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         el.setCenterX(value + el.getRadiusX());
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         arc.setCenterX(value + arc.getRadiusX());
      } else if (node instanceof Text) {
         Text text = (Text) node;
         text.setX(value);
      } else {
         node.setLayoutX(value);
      }
   }

   /**
    * Set the Y position of a Node.
    *
    * @param node the Node
    * @param value the Y position
    */
   @Override
   public void setY(Node node, double value) {
      if (node instanceof Region) {
         ((Region) node).setLayoutY(value);
      } else if (node instanceof Rectangle) {
         ((Rectangle) node).setY(value);
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         circle.setCenterY(value + circle.getRadius());
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         el.setCenterY(value + el.getRadiusY());
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         arc.setCenterY(value + arc.getRadiusY());
      } else if (node instanceof Text) {
         Text text = (Text) node;
         text.setY(value);
      } else {
         node.setLayoutY(value);
      }
   }

   /**
    * Set the height of a Node.
    *
    * @param node the Node
    * @param value the height
    */
   @Override
   public void setHeight(Node node, double value) {
      if (node instanceof Region) {
         ((Region) node).setMinHeight(value);
         ((Region) node).setMaxHeight(value);
         ((Region) node).setPrefHeight(value);
      } else if (node instanceof Rectangle) {
         ((Rectangle) node).setHeight(value);
      } else if (node instanceof Circle) {
         ((Circle) node).setRadius(value / 2d);
      } else if (node instanceof Ellipse) {
         ((Ellipse) node).setRadiusY(value / 2d);
      } else if (node instanceof Arc) {
         ((Arc) node).setRadiusY(value / 2d);
      }
   }

   /**
    * Return the height of a Node.
    *
    * @param node the Node
    * @return the height of the Node
    */
   @Override
   public double getHeight(Node node) {
      if (node instanceof Region) {
         return ((Region) node).getPrefHeight();
      } else if (node instanceof Rectangle) {
         return ((Rectangle) node).getHeight();
      } else if (node instanceof Circle) {
         return ((Circle) node).getRadius() * 2d;
      } else if (node instanceof Ellipse) {
         return ((Ellipse) node).getRadiusY() * 2d;
      } else if (node instanceof Arc) {
         return ((Arc) node).getRadiusY() * 2d;
      } else {
         return node.layoutBoundsProperty().get().getHeight();
      }
   }

   /**
    * Set the width of a Node.
    *
    * @param node the Node
    * @param value the width
    */
   @Override
   public void setWidth(Node node, double value) {
      if (node instanceof Region) {
         ((Region) node).setMinWidth(value);
         ((Region) node).setMaxWidth(value);
         ((Region) node).setPrefWidth(value);
      } else if (node instanceof Rectangle) {
         ((Rectangle) node).setWidth(value);
      } else if (node instanceof Circle) {
         ((Circle) node).setRadius(value / 2d);
      } else if (node instanceof Ellipse) {
         ((Ellipse) node).setRadiusX(value / 2d);
      } else if (node instanceof Arc) {
         ((Arc) node).setRadiusX(value / 2d);
      } else if (node instanceof Text) {
         ((Text) node).setWrappingWidth(value);
      }
   }

   /**
    * Return the width of a Node.
    *
    * @param node the Node
    * @return the width of the Node
    */
   @Override
   public double getWidth(Node node) {
      if (node instanceof Region) {
         return ((Region) node).getPrefWidth();
      } else if (node instanceof Rectangle) {
         return ((Rectangle) node).getWidth();
      } else if (node instanceof Circle) {
         return ((Circle) node).getRadius() * 2d;
      } else if (node instanceof Ellipse) {
         return ((Ellipse) node).getRadiusX() * 2d;
      } else if (node instanceof Text) {
         return ((Text) node).getWrappingWidth();
      } else if (node instanceof Arc) {
         return ((Arc) node).getRadiusX() * 2d;
      } else if (node instanceof Text) {
         return ((Text) node).getWrappingWidth();
      } else {
         return node.layoutBoundsProperty().get().getWidth();
      }
   }

   /**
    * Return the X property of a Node.
    *
    * @param node the Node
    * @return the X property of the Node
    */
   @Override
   public DoubleExpression getXProperty(Node node) {
      DoubleExpression property;
      if (node instanceof Region) {
         property = ((Region) node).layoutXProperty();
      } else if (node instanceof Rectangle) {
         property = ((Rectangle) node).xProperty();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         property = circle.centerXProperty().subtract(circle.radiusProperty());
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         property = el.centerXProperty().subtract(el.radiusXProperty());
      } else if (node instanceof Text) {
         property = ((Text) node).xProperty();
      } else {
         property = node.layoutXProperty();
      }
      return property;
   }

   /**
    * Return the Y property of a Node.
    *
    * @param node the Node
    * @return the Y property of the Node
    */
   @Override
   public DoubleExpression getYProperty(Node node) {
      DoubleExpression property;
      if (node instanceof Region) {
         property = ((Region) node).layoutYProperty();
      } else if (node instanceof Rectangle) {
         property = ((Rectangle) node).yProperty();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         property = circle.centerYProperty().subtract(circle.radiusProperty());
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         property = el.centerYProperty().subtract(el.radiusYProperty());
      } else if (node instanceof Text) {
         property = ((Text) node).yProperty();
      } else {
         property = node.layoutYProperty();
      }
      return property;
   }

   /**
    * Return the height property of a Node.
    *
    * @param node the Node
    * @return the height property of the Node
    */
   @Override
   public DoubleExpression getHeightProperty(Node node) {
      DoubleExpression property;
      if (node instanceof Region) {
         property = ((Region) node).heightProperty();
      } else if (node instanceof Rectangle) {
         property = ((Rectangle) node).heightProperty();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         property = circle.radiusProperty().multiply(2d);
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         property = el.radiusYProperty().multiply(2d);
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         property = arc.radiusYProperty().multiply(2d);
      } else {
         property = new SimpleDoubleProperty();
      }
      return property;
   }

   /**
    * Return the width property of a Node.
    *
    * @param node the Node
    * @return the width property of the Node
    */
   @Override
   public DoubleExpression getWidthProperty(Node node) {
      DoubleExpression property;
      if (node instanceof Region) {
         property = ((Region) node).widthProperty();
      } else if (node instanceof Rectangle) {
         property = ((Rectangle) node).widthProperty();
      } else if (node instanceof Circle) {
         Circle circle = (Circle) node;
         property = circle.radiusProperty().multiply(2d);
      } else if (node instanceof Ellipse) {
         Ellipse el = (Ellipse) node;
         property = el.radiusXProperty().multiply(2d);
      } else if (node instanceof Arc) {
         Arc arc = (Arc) node;
         property = arc.radiusXProperty().multiply(2d);
      } else if (node instanceof Text) {
         property = ((Text) node).wrappingWidthProperty();
      } else {
         property = new SimpleDoubleProperty();
      }
      return property;
   }
}
