/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kelas.*;

/**
 *
 * @author A S U S
 */
public class Inheritance extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        manajer m1 = new manajer ("Baek Ma Ri", 1500000, "Vempayya");
        //System.out.println(this.nama);
        //m1.tampilManajer();
        
        //pegawai p1 = new pegawai("Han Shi Hoo", 1500000);
        //p1.tampilPegawai();
        
        direktur d1 = new direktur("Jung Jae Min", 1500000, "Manusia", 500000);
        d1.tampilDirektur();
    }
}
