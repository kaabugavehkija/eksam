import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille värvi saab kasutaja muuta
 */
public class JavaFX extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox layout = new VBox();
        Scene scene = new Scene(layout,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
        Circle ring = new Circle();
        ring.setCenterX(0);
        ring.setCenterY(0);
        ring.setRadius(100);
        Label label = new Label("Värv");
        TextField muuda = new TextField();
        Button nupp = new Button("Muuda varvi");


        nupp.setOnAction(e -> ring.setFill(Paint.valueOf(muuda.getText())));
        //ring.setFill(Color.valueOf(k));
        layout.getChildren().addAll(ring, label, muuda, nupp);
    }
}
