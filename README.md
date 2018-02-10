# jfxdockingframework
A JavaFX docking framework experiment, a la QML. Maybe one time such a framework will be integrated in JavaFX.

It adds new layouts such as those already available in the javafx.scene.layout package, but which work similar to 
the [QML anchor-based 
layouts](http://doc.qt.io/archives/qt-4.8/qml-anchor-layout.html).

## Overview
The principal class of the package is the NodeAnchor class. It provides an anchor mechanism similar to the one which is used in QML. 
However, contrary to QML, it also manages several Shape classes. Shapes which are natively managed are:

+ javafx.scene.layout.Region
+ javafx.scene.shape.Rectangle
+ javafx.scene.shape.Circle
+  javafx.scene.shape.Ellipse
+ javafx.scene.shape.Arc
+ javafx.scene.text.Text

## Usage
This class defines bindings between Nodes. To use this class, you should:

+ Use the NodeAnchor class to define the anchors between the Nodes. The usual way to perform this is to create an instance of the class and specify the reference Node at the class creation,a d specify the ancoring of other Nodes relative to this Node
+ Put the Nodes normally in a Pane

## Example
In the following example, a rectangle and a text are put on top of each other:

      Rectangle rec = new Rectangle();  
      rec.setFill(Color.YELLOW);  
  
      Text text = new Text();  
      text.setFill(Color.RED);  
      text.setText("TOTO");  
      text.setTextOrigin(VPos.CENTER);  
      text.setTextAlignment(TextAlignment.CENTER);    
      NodeAnchor anchor = new NodeAnchor(text);  
      // the Rectangle will be put on the bottom of the text  
      anchor.anchor(rec, AnchorPosition.BOTTOM, AnchorPosition.TOP);  
  
      Pane root = new Pane();  
      rec.setX(200);  
      rec.setY(100);  
      rec.setWidth(100);  
      rec.setHeight(100);  
      text.setWrappingWidth(70);  
      root.getChildren().add(rec);  
      root.getChildren().add(text);  
