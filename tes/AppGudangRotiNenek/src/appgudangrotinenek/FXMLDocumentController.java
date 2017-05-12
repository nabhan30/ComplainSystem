/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgudangrotinenek;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modul.LemariA;

/**
 *
 * @author nabhan 
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lbNamaA, lbNamaB, lbNamaC;
    @FXML
    private Label lbStokA, lbStokB, lbStokC;
    @FXML
    private Label lbNoA, lbNoB, lbNoC;
    @FXML
    private TextField tfRakA, tfUnitA, tfGantiA, tfRotiA;
    @FXML
    private TextField tfRakB, tfUnitB, tfGantiB, tfRotiB;
    @FXML
    private TextField tfRakC, tfUnitC, tfGantiC, tfRotiC;

    public LemariA[] lmr1 = new LemariA[3];
    public LemariA[] lmr2 = new LemariA[3];
    public LemariA[] lmr3 = new LemariA[3];
    
    private void tampilA() {
        String dataNo, dataNama, dataStok;
        dataNo = dataNama = dataStok = "";
        
        for (int i=0;i<lmr1.length;i++) {
            dataNo = dataNo + String.valueOf(i+1) + "\n";
            dataNama = dataNama + lmr1[i].bacaNama() + "\n";
            dataStok = dataStok + String.valueOf(lmr1[i].bacaStok()) + "\n";
        }
        this.lbNoA.setText(dataNo);
        this.lbNamaA.setText(dataNama);
        this.lbStokA.setText(dataStok);
        
    }
    
    private void tampilB() {
        String dataNo, dataNama, dataStok;
        dataNo = dataNama = dataStok = "";
        
        for (int i=0;i<lmr2.length;i++) {
            dataNo = dataNo + String.valueOf(i+1) + "\n";
            dataNama = dataNama + lmr2[i].bacaNama() + "\n";
            dataStok = dataStok + String.valueOf(lmr2[i].bacaStok()) + "\n";
        }
        this.lbNoB.setText(dataNo);
        this.lbNamaB.setText(dataNama);
        this.lbStokB.setText(dataStok);
        
    }
    
    private void tampilC() {
        String dataNo, dataNama, dataStok;
        dataNo = dataNama = dataStok = "";
        
        for (int i=0;i<lmr3.length;i++) {
            dataNo = dataNo + String.valueOf(i+1) + "\n";
            dataNama = dataNama + lmr3[i].bacaNama() + "\n";
            dataStok = dataStok + String.valueOf(lmr3[i].bacaStok()) + "\n";
        }
        this.lbNoC.setText(dataNo);
        this.lbNamaC.setText(dataNama);
        this.lbStokC.setText(dataStok);
        
    }
    
    
    @FXML
    void eventTambahStokA(ActionEvent event) {
        int i = Integer.parseInt(tfRakA.getText()) - 1;
        int n = Integer.parseInt(tfUnitA.getText());
        tfRakA.setText("");
        tfUnitA.setText("");
        
        lmr1[i].Stok(lmr1[i].bacaStok() + n);
        this.tampilA();
    }

    @FXML
    private void eventKurangStokA(ActionEvent event) {
        int i = Integer.parseInt(tfRakA.getText()) - 1;
        int n = Integer.parseInt(tfUnitA.getText());
        tfRakA.setText("");
        tfUnitA.setText("");
        
        if (lmr1[i].bacaStok()>= n) {
        lmr1[i].Stok(lmr1[i].bacaStok() - n);}
        this.tampilA();
    }

    @FXML
    private void eventGantiRotiA(ActionEvent event) {
        int i = Integer.parseInt(tfGantiA.getText()) - 1;
        String n = tfRotiA.getText();
        tfGantiA.setText("");
        tfRotiA.setText("");
        
        lmr1[i].gantiNama(n);
        this.tampilA();
    }
    
    @FXML
    void eventTambahStokB(ActionEvent event) {
        int i = Integer.parseInt(tfRakB.getText()) - 1;
        int n = Integer.parseInt(tfUnitB.getText());
        tfRakB.setText("");
        tfUnitB.setText("");
        
        lmr2[i].Stok(lmr2[i].bacaStok() + n);
        this.tampilB();
    }

    @FXML
    private void eventKurangStokB(ActionEvent event) {
        int i = Integer.parseInt(tfRakB.getText()) - 1;
        int n = Integer.parseInt(tfUnitB.getText());
        tfRakB.setText("");
        tfUnitB.setText("");
        
        if (lmr2[i].bacaStok()>= n) {
        lmr2[i].Stok(lmr2[i].bacaStok() - n);}
        this.tampilB();
    }

    @FXML
    private void eventGantiRotiB(ActionEvent event) {
        int i = Integer.parseInt(tfGantiB.getText()) - 1;
        String n = tfRotiB.getText();
        tfGantiB.setText("");
        tfRotiB.setText("");
        
        lmr2[i].gantiNama(n);
        this.tampilB();
    }
    
    @FXML
    void eventTambahStokC(ActionEvent event) {
        int i = Integer.parseInt(tfRakC.getText()) - 1;
        int n = Integer.parseInt(tfUnitC.getText());
        tfRakC.setText("");
        tfUnitC.setText("");
        
        lmr3[i].Stok(lmr3[i].bacaStok() + n);
        this.tampilC();
    }

    @FXML
    private void eventKurangStokC(ActionEvent event) {
        int i = Integer.parseInt(tfRakC.getText()) - 1;
        int n = Integer.parseInt(tfUnitC.getText());
        tfRakC.setText("");
        tfUnitC.setText("");
        
        if (lmr3[i].bacaStok()>= n) {
        lmr3[i].Stok(lmr3[i].bacaStok() - n);}
        this.tampilC();
        
    }

    @FXML
    private void eventGantiRotiC(ActionEvent event) {
        int i = Integer.parseInt(tfGantiC.getText()) - 1;
        String n = tfRotiC.getText();
        tfGantiC.setText("");
        tfRotiC.setText("");
        
        lmr3[i].gantiNama(n);
        this.tampilC();
    }
    
    
    //=======================================================================\\
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    lmr1[0] = new LemariA("Roti Srikaya", 0);
    lmr1[1] = new LemariA("Roti Pepaya", 0);
    lmr1[2] = new LemariA("Roti Mangga", 0);
    
    lmr2[0] = new LemariA("Roti Coklat", 0);
    lmr2[1] = new LemariA("Roti Vanila", 0);
    lmr2[2] = new LemariA("Roti Susu", 0);
    
    lmr3[0] = new LemariA("Roti Kurma", 0);
    lmr3[1] = new LemariA("Roti Kismis", 0);
    lmr3[2] = new LemariA("Roti Kacang", 0);
    
    this.tampilA();
    this.tampilB();
    this.tampilC();
    }   


    
}
