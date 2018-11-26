//AUTHOR BY : Malik Chaudhary
//CREATED   : 03-09-2018


package com.lesson.mcm_pc.lesson_1_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    TextView txtOperator, txtValueSatu, txtValueDua, txtHasil, txtHistory;
    String txtOptr, txtVSatu, txtVDua, setKoma = "", txtVHistory;
    Boolean delKomaSatu = false, delKomaDua = false, komaSatu = true, komaDua = true, plusSatu = true, plusDua = true, statusOptr = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtValueSatu    = findViewById(R.id.txtValueSatu);
        txtOperator     = findViewById(R.id.txtOperator);
        txtValueDua     = findViewById(R.id.txtValueDua);
        txtHasil        = findViewById(R.id.txtHasil);
        txtHistory      = findViewById(R.id.txtHistory);
        btnNol();
        btnSatu();
        btnDua();
        btnTiga();
        btnEmpat();
        btnLima();
        btnEnam();
        btnTujuh();
        btnDelapan();
        btnSembilan();
        btnBagi();
        btnKali();
        btnTambah();
        btnKurang();
        btnHasil();
        btnClear();
        btnDelete();
        btnKoma();
        btnPlusMinus();

    }

//    Method untuk nomer

    public void btnNol(){
        Button btnNol = findViewById(R.id.btnNol);
        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.isEmpty()){
                        txtValueSatu.setText("0");
                    }if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("0").toString());
                    }
                }else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("0");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("0").toString());
                    }
                }
            }
        });
    }

    public void btnSatu(){
        Button btnSatu = findViewById(R.id.btnSatu);
        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("1");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("1").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("1");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("1").toString());
                    }
                }
            }
        });
    }

    public void btnDua(){
        Button btnDua = findViewById(R.id.btnDua);
        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("2");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("2").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("2");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("2").toString());
                    }
                }
            }
        });
    }

    public void btnTiga(){
        Button btnTiga = findViewById(R.id.btnTiga);
        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("3");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("3").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("3");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("3").toString());
                    }
                }
            }
        });
    }

    public void btnEmpat(){
        Button btnEmpat = findViewById(R.id.btnEmpat);
        btnEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("4");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("4").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("4");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("4").toString());
                    }
                }
            }
        });
    }

    public void btnLima(){
        Button btnLima = findViewById(R.id.btnLima);
        btnLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("5");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("5").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("5");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("5").toString());
                    }
                }
            }
        });
    }

    public void btnEnam(){
        Button btnEnam = findViewById(R.id.btnEnam);
        btnEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("6");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("6").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("6");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("6").toString());
                    }
                }
            }
        });
    }

    public void btnTujuh(){
        Button btnTujuh = findViewById(R.id.btnTujuh);
        btnTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("7");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("7").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("7");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("7").toString());
                    }
                }
            }
        });
    }

    public void btnDelapan(){
        Button btnDelapan = findViewById(R.id.btnDelapan);
        btnDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("8");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("8").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("8");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("8").toString());
                    }
                }
            }
        });
    }

    public void btnSembilan(){
        Button btnSembilan = findViewById(R.id.btnSembilan);
        btnSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (txtVSatu.equals("0")){
                        txtValueSatu.setText("9");
                    }
                    if (!txtVSatu.equals("0")){
                        txtValueSatu.setText(new StringBuilder().append(txtVSatu).append("9").toString());
                    }
                }
                else {
                    if (txtVDua.equals("0")){
                        txtValueDua.setText("9");
                    }
                    if (!txtVDua.equals("0")){
                        txtValueDua.setText(new StringBuilder().append(txtVDua).append("9").toString());
                    }
                }
            }
        });
    }

//    Method untuk operator

    public void btnBagi(){
        Button btnBagi = findViewById(R.id.btnPembagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusOptr){
                    if (!txtValueSatu.getText().toString().equals("")){
                        txtOperator.setText("/");
                        statusOptr = false;
                    }
                }else{
                    txtVSatu        = txtValueSatu.getText().toString();
                    txtOptr         = txtOperator.getText().toString();
                    txtVDua         = txtValueDua.getText().toString();
                    txtVHistory     = txtHistory.getText().toString();
                    if (txtVHistory.isEmpty()){
                        txtHasil.setText("");
                        String txtHstr  = txtVSatu+txtOptr+txtVDua;
                        txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("/");
                    }else{
                        txtHasil.setText("");
                        String txtHstr  = txtOptr+txtVDua;
                        if (!txtVDua.equals(""))
                            txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("/");
                    }

                }
            }
        });

    }

    public void btnKali(){
        Button btnPerkali = findViewById(R.id.btnPerkali);
        btnPerkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusOptr){
                    if (!txtValueSatu.getText().toString().equals("")){
                        txtOperator.setText("X");
                        statusOptr = false;
                    }
                }else{

                    txtVSatu        = txtValueSatu.getText().toString();
                    txtOptr         = txtOperator.getText().toString();
                    txtVDua         = txtValueDua.getText().toString();
                    txtVHistory     = txtHistory.getText().toString();
                    if (txtVHistory.isEmpty()){
                        txtHasil.setText("");
                        String txtHstr  = txtVSatu+txtOptr+txtVDua;
                        txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("X");
                    }else{
                        txtHasil.setText("");
                        String txtHstr  = txtOptr+txtVDua;
                        if (!txtVDua.equals(""))
                            txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("X");
                    }

                }
            }
        });

    }

    public void btnTambah(){
        Button btnPenambah = findViewById(R.id.btnPenambah);
        btnPenambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusOptr){
                    if (!txtValueSatu.getText().toString().equals("")){
                        txtOperator.setText("+");
                        statusOptr = false;
                    }
                }else{
                    txtVSatu        = txtValueSatu.getText().toString();
                    txtOptr         = txtOperator.getText().toString();
                    txtVDua         = txtValueDua.getText().toString();
                    txtVHistory     = txtHistory.getText().toString();
                    if (txtVHistory.isEmpty()){
                        txtHasil.setText("");
                        String txtHstr  = txtVSatu+txtOptr+txtVDua;
                        txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("+");
                    }else{
                        txtHasil.setText("");
                        String txtHstr  = txtOptr+txtVDua;
                        if (!txtVDua.equals(""))
                            txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("+");
                    }

                }

            }
        });

    }

    public void hasilOperator(){
        if (txtValueSatu.getText().toString().equals(""))
            Toast.makeText(getApplicationContext(), "Harap isi value pertama", Toast.LENGTH_LONG).show();
        else if (txtValueDua.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Harap isi value kedua", Toast.LENGTH_LONG).show();
        }else{
        if (txtValueDua.getText().toString().equals("0")){
            txtHasil.setText("Tidak terdefinisi");
        }else if (setKoma.equals(".") ||  ((( Integer.parseInt(txtValueSatu.getText().toString())%Integer.parseInt(txtValueDua.getText().toString()))>=1) && txtOperator.getText().toString().equals("/")) ){
                double angkaSatu = Double.parseDouble(txtValueSatu.getText().toString());
                double angkaDua = Double.parseDouble(txtValueDua.getText().toString());
                double hasil = 0;
                switch (txtOperator.getText().toString()){
                    case "/" :
                        hasil = (angkaSatu/angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "X" :
                        hasil = (angkaSatu*angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "+" :
                        hasil = (angkaSatu+angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "-" :
                        hasil = (angkaSatu-angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                }
            }else if(setKoma.equals("")){
                long angkaSatu = Integer.parseInt(txtValueSatu.getText().toString());
                long angkaDua = Integer.parseInt(txtValueDua.getText().toString());
                long hasil = 0;
                switch (txtOperator.getText().toString()){
                    case "/" :
                            hasil = (angkaSatu/angkaDua);
                            txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "X" :
                        hasil = (angkaSatu*angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "+" :
                        hasil = (angkaSatu+angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                    case "-" :
                        hasil = (angkaSatu-angkaDua);
                        txtValueSatu.setText(String.valueOf(hasil));
                        break;
                }
            }
        }
        txtValueDua.setText("");
    }

    public void btnKurang(){
        Button btnPengurang = findViewById(R.id.btnPengurang);
        btnPengurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusOptr){
                    if (!txtValueSatu.getText().toString().equals("")){
                        txtOperator.setText("-");
                        statusOptr = false;
                    }
                }else{
                    txtVSatu        = txtValueSatu.getText().toString();
                    txtOptr         = txtOperator.getText().toString();
                    txtVDua         = txtValueDua.getText().toString();
                    txtVHistory     = txtHistory.getText().toString();
                    if (txtVHistory.isEmpty()){
//                        if (txtVDua.substring(0,1).equals("-")){
//                            txtVDua = "("+txtVDua+")";
//                        }else if (txtVSatu.substring(0,1).equals("-")){
//                            txtVSatu = "("+txtVSatu+")";
//                        }
                        txtHasil.setText("");
                        String txtHstr  = txtVSatu+txtOptr+txtVDua;
                        txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("-");
                    }else{
                        txtHasil.setText("");
                        String txtHstr  = txtOptr+txtVDua;
                        if (!txtVDua.equals(""))
                            txtHistory.setText(new StringBuilder().append(txtVHistory).append(txtHstr).toString());
                        hasilOperator();
                        txtOperator.setText("-");
                    }

                }
            }
        });
    }

    public void btnKoma(){
        Button btnKoma = findViewById(R.id.btnKoma);
        btnKoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKoma         = ".";
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();

                    if (txtOperator.getText().toString().isEmpty() && komaSatu && !txtVSatu.isEmpty()){
                        txtValueSatu.setText(String.format("%s.", new StringBuilder().append(txtVSatu).toString()));
                        komaSatu = false;
                    }else if(!txtOperator.getText().toString().isEmpty() && komaDua && !txtVDua.isEmpty()){
                        txtValueDua.setText(String.format("%s.", new StringBuilder().append(txtVDua).toString()));
                        komaDua = false;
                    }



            }
        });
    }

//    Method untuk aksi

    public void btnDelete(){
        Button btnDelete = findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                txtOptr         = txtOperator.getText().toString();
                if (txtOperator.getText().toString().isEmpty()){
                    if (!txtVSatu.equals("")) {
                        txtValueSatu.setText(txtVSatu.substring(0, txtVSatu.length() - 1));
                        for (int subSatu = 0; subSatu < txtVSatu.length(); subSatu++) {
                            if (!txtVSatu.substring(0, subSatu).equals(".")) {
                                delKomaSatu = true;
                            }
                        }
                    }
                }else{
                    if (!txtVDua.equals("")) {
                        txtValueDua.setText(txtVDua.substring(0, txtVDua.length() - 1));
                        for (int subDua = 0; subDua < txtVDua.length(); subDua++) {
                            if (!txtVDua.substring(0, subDua).equals(".")) {
                                delKomaDua = true;
                            }
                        }
                    }else
                        txtOperator.setText(txtOptr.substring(0, txtOptr.length()-1));
                }

                if (delKomaSatu && delKomaDua){
                    setKoma = "";
                }

            }
        });
    }

    public void btnClear(){
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtValueSatu.setText("");
                txtValueDua.setText("");
                txtOperator.setText("");
                txtHasil.setText("");
                txtHistory.setText("");
                setKoma     = "";
                komaSatu    = true;
                komaDua     = true;
                plusSatu    = true;
                plusDua     = true;
                statusOptr  = true;

            }
        });
    }

    public void btnPlusMinus(){
        Button btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVSatu        = txtValueSatu.getText().toString();
                txtVDua         = txtValueDua.getText().toString();
                if (txtOperator.getText().toString().isEmpty() && plusSatu){
                    txtValueSatu.setText(new StringBuilder().append("-").append(txtVSatu).toString());
                    plusSatu = false;
                }else if (!txtOperator.getText().toString().isEmpty() && plusDua){
                    txtValueDua.setText(new StringBuilder().append("-").append(txtVDua).toString());
                    plusDua = false;
                }else if (txtOperator.getText().toString().isEmpty()){
                    txtValueSatu.setText(txtVSatu.substring(1,txtVSatu.length()));
                    plusSatu = true;
                }else{
                    txtValueDua.setText(txtVDua.substring(1,txtVDua.length()));
                    plusDua = true;
                }
            }
        });
    }

    public void btnHasil(){
        Button btnHasil = findViewById(R.id.btnHasil);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtValueSatu.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "Harap isi value pertama", Toast.LENGTH_LONG).show();
                else if (txtValueDua.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Harap isi value kedua", Toast.LENGTH_LONG).show();
                }else{
//                    int modSatu = Integer.parseInt(txtValueSatu.getText().toString());
//                    int modDua = Integer.parseInt(txtValueDua.getText().toString());
                    if (txtValueDua.getText().toString().equals("0")){
                        txtHasil.setText("Tidak terdefinisi");
                    }else if (setKoma.equals(".") ||  ((( Integer.parseInt(txtValueSatu.getText().toString())%Integer.parseInt(txtValueDua.getText().toString()))>=1) && txtOperator.getText().toString().equals("/")) ){
                        double angkaSatu = Double.parseDouble(txtValueSatu.getText().toString());
                        double angkaDua = Double.parseDouble(txtValueDua.getText().toString());
                        double hasil = 0;
                        switch (txtOperator.getText().toString()){
                            case "/" :
                                hasil = (angkaSatu/angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                            case "X" :
                                hasil = (angkaSatu*angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                            case "+" :
                                hasil = (angkaSatu+angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                            case "-" :
                                hasil = (angkaSatu-angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                        }
                    }else if(setKoma.equals("")){
                        long angkaSatu = Integer.parseInt(txtValueSatu.getText().toString());
                        long angkaDua = Integer.parseInt(txtValueDua.getText().toString());
                        long hasil = 0;
                        switch (txtOperator.getText().toString()){
                            case "/" :
                                if (angkaDua == 0 ){
                                    txtHasil.setText("Tidak terdefinisi");
                                }else{
                                    hasil = (angkaSatu/angkaDua);
                                    txtHasil.setText(String.valueOf(hasil));
                                }
                                break;
                            case "X" :
                                hasil = (angkaSatu*angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                            case "+" :
                                hasil = (angkaSatu+angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                            case "-" :
                                hasil = (angkaSatu-angkaDua);
                                txtHasil.setText(String.valueOf(hasil));
                                break;
                        }
                    }
                }
            }
        });
    }
}
