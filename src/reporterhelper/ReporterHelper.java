/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporterhelper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import reporterhelper.controlls.TimePicker;
import reporterhelper.controlls.TimeSlotEntry;
import reporterhelper.controlls.TimeSlotEntryHeader;

/**
 *
 * @author sandeepkumar
 */
public class ReporterHelper extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        BorderPane root = new BorderPane();

//        TimePicker timePicker = new TimePicker();
//        root.setCenter(timePicker);
        VBox vbTimeSlots = new VBox();
//        vbTimeSlots.setPadding(new In/sets(4, 0, 4, 0));

        TimeSlotEntryHeader entryHeader = new TimeSlotEntryHeader(800);
        vbTimeSlots.getChildren().add(entryHeader);

        for (int i = 0; i < 10; i++) {
            TimeSlotEntry entry = new TimeSlotEntry(800, "Group" + i);
            vbTimeSlots.getChildren().add(entry);
        }

        root.setCenter(vbTimeSlots);

        root.setTop(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        maximizeScreen(primaryStage);
        primaryStage.show();
    }

    private void maximizeScreen(Stage primaryStage) {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
