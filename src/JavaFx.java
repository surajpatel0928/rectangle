import com.sun.scenario.effect.impl.sw.java.JSWBlend_BLUEPeer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFx extends Application {


    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {
        // Create a pane to hold the circle
        Pane pane = new Pane();


        // Create a circle and set its properties
        Rectangle rectangle = new Rectangle();

        rectangle.xProperty().bind(pane.widthProperty().divide(6));
        rectangle.yProperty().bind(pane.heightProperty().divide(6));
        rectangle.heightProperty().bind(pane.heightProperty().divide(3));
        rectangle.widthProperty().bind(pane.widthProperty().divide(3));
        rectangle.setStroke(Color.BLUE);
        rectangle.setFill(Color.BLUE);
        pane.getChildren().add(rectangle);


        Rectangle rectangle1 = new Rectangle();

        rectangle1.xProperty().bind(pane.widthProperty().divide(2));
        rectangle1.yProperty().bind(pane.heightProperty().divide(2));
        rectangle1.heightProperty().bind(pane.heightProperty().divide(3));
        rectangle1.widthProperty().bind(pane.widthProperty().divide(3));
        rectangle1.setStroke(Color.GREEN);
        rectangle1.setFill(Color.GREEN);
        pane.getChildren().add(rectangle1);


        Rectangle rectangle2 = new Rectangle();

        rectangle2.xProperty().bind(pane.widthProperty().divide(2));
        rectangle2.yProperty().bind(pane.heightProperty().divide(6));
        rectangle2.heightProperty().bind(pane.heightProperty().divide(3));
        rectangle2.widthProperty().bind(pane.widthProperty().divide(3));
        rectangle2.setStroke(Color.RED);
        rectangle2.setFill(Color.RED);
        pane.getChildren().add(rectangle2);


        Rectangle rectangle3 = new Rectangle();

        rectangle3.xProperty().bind(pane.widthProperty().divide(6));
        rectangle3.yProperty().bind(pane.heightProperty().divide(2));
        rectangle3.heightProperty().bind(pane.heightProperty().divide(3));
        rectangle3.widthProperty().bind(pane.widthProperty().divide(3));
        rectangle3.setStroke(Color.LIGHTBLUE);
        rectangle3.setFill(Color.LIGHTBLUE);
        pane.getChildren().add(rectangle3);


        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("ShowRectangleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

}