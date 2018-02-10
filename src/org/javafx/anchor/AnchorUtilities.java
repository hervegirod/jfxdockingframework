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
import javafx.scene.Node;

/**
 * This interface compute positions and sizes for Nodes.
 *
 * @since 0.1
 */
public interface AnchorUtilities {
   /**
    * Return the Y position of a Node.
    *
    * @param node the Node
    * @return the Y position of the Node
    */
   public double getY(Node node);

   /**
    * Return the X position of a Node.
    *
    * @param node the Node
    * @return the X position of the Node
    */
   public double getX(Node node);

   /**
    * Set the X position of a Node.
    *
    * @param node the Node
    * @param value the X position
    */
   public void setX(Node node, double value);

   /**
    * Set the Y position of a Node.
    *
    * @param node the Node
    * @param value the Y position
    */
   public void setY(Node node, double value);

   /**
    * Set the height of a Node.
    *
    * @param node the Node
    * @param value the height
    */
   public void setHeight(Node node, double value);

   /**
    * Return the height of a Node.
    *
    * @param node the Node
    * @return the height of the Node
    */
   public double getHeight(Node node);

   /**
    * Set the width of a Node.
    *
    * @param node the Node
    * @param value the width
    */
   public void setWidth(Node node, double value);

   /**
    * Return the width of a Node.
    *
    * @param node the Node
    * @return the width of the Node
    */
   public double getWidth(Node node);

   /**
    * Return the X property of a Node.
    *
    * @param node the Node
    * @return the X property of the Node
    */
   public DoubleExpression getXProperty(Node node);

   /**
    * Return the Y property of a Node.
    *
    * @param node the Node
    * @return the Y property of the Node
    */
   public DoubleExpression getYProperty(Node node);

   /**
    * Return the height property of a Node.
    *
    * @param node the Node
    * @return the height property of the Node
    */
   public DoubleExpression getHeightProperty(Node node);

   /**
    * Return the width property of a Node.
    *
    * @param node the Node
    * @return the width property of the Node
    */
   public DoubleExpression getWidthProperty(Node node);
}
