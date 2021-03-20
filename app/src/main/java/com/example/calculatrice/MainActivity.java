package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calc = null;

    Button btn_0 = null;
    Button btn_1 = null;
    Button btn_2 = null;
    Button btn_3 = null;
    Button btn_4 = null;
    Button btn_5 = null;
    Button btn_6 = null;
    Button btn_7 = null;
    Button btn_8 = null;
    Button btn_9 = null;

    Button btn_add = null;
    Button btn_sous = null;
    Button btn_mult = null;
    Button btn_div = null;

    Button btn_addsous = null;

    Button btn_decal = null;

    Button btn_point = null;

    Button btn_M = null;
    Button btn_MR = null;

    Button btn_egal = null;

    float memoire = 0.f;

    char operation = '+';

    boolean raz = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = (TextView) findViewById(R.id.tv_calc);

        btn_0 = (Button)findViewById(R.id.bt_0);
        btn_1 = (Button)findViewById(R.id.bt_1);
        btn_2 = (Button)findViewById(R.id.bt_2);
        btn_3 = (Button)findViewById(R.id.bt_3);
        btn_4 = (Button)findViewById(R.id.bt_4);
        btn_5 = (Button)findViewById(R.id.bt_5);
        btn_6 = (Button)findViewById(R.id.bt_6);
        btn_7 = (Button)findViewById(R.id.bt_7);
        btn_8 = (Button)findViewById(R.id.bt_8);
        btn_9 = (Button)findViewById(R.id.bt_9);

        btn_add = (Button)findViewById(R.id.bt_add);
        btn_sous = (Button)findViewById(R.id.bt_sous);
        btn_mult = (Button)findViewById(R.id.bt_mult);
        btn_div = (Button)findViewById(R.id.bt_div);

        btn_addsous = (Button)findViewById(R.id.bt_addsous);

        btn_decal = (Button)findViewById(R.id.bt_decal);

        btn_point = (Button)findViewById(R.id.bt_point);

        btn_M = (Button)findViewById(R.id.bt_M);
        btn_MR = (Button)findViewById(R.id.bt_MR);

        btn_egal = (Button)findViewById(R.id.bt_egale);

        btn_0.setOnClickListener(btn_0Listener);
        btn_1.setOnClickListener(btn_1Listener);
        btn_2.setOnClickListener(btn_2Listener);
        btn_3.setOnClickListener(btn_3Listener);
        btn_4.setOnClickListener(btn_4Listener);
        btn_5.setOnClickListener(btn_5Listener);
        btn_6.setOnClickListener(btn_6Listener);
        btn_7.setOnClickListener(btn_7Listener);
        btn_8.setOnClickListener(btn_8Listener);
        btn_9.setOnClickListener(btn_9Listener);

        btn_add.setOnClickListener(btn_addListener);
        btn_sous.setOnClickListener(btn_sousListener);
        btn_mult.setOnClickListener(btn_multListener);
        btn_div.setOnClickListener(btn_divListener);

        btn_addsous.setOnClickListener(btn_addsousListener);

        btn_decal.setOnClickListener(btn_decalListener);

        btn_point.setOnClickListener(btn_pointListener);

        btn_M.setOnClickListener(btn_MListener);
        btn_MR.setOnClickListener(btn_MRListener);

        btn_egal.setOnClickListener(btn_egalListener);
    }

    private void ajouterFin(String i) {
        String calcul = String.valueOf(calc.getText());
        if(raz){
            raz = false;
            calcul = "";
        }
        calcul = calcul + i;
        calc.setText(calcul);
    }

    private void ajouterDebut(String i) {
        String calcul = String.valueOf(calc.getText());
        calcul = i + calcul;
        calc.setText(calcul);
    }

    private View.OnClickListener btn_1Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
           ajouterFin("1");
        }
    };

    private View.OnClickListener btn_2Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("2");
        }
    };

    private View.OnClickListener btn_3Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("3");
        }
    };

    private View.OnClickListener btn_4Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("4");
        }
    };

    private View.OnClickListener btn_5Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("5");
        }
    };

    private View.OnClickListener btn_6Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("6");
        }
    };

    private View.OnClickListener btn_7Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("7");
        }
    };

    private View.OnClickListener btn_8Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("8");
        }
    };

    private View.OnClickListener btn_9Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("9");
        }
    };

    private View.OnClickListener btn_0Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin("0");
        }
    };

    private View.OnClickListener btn_addListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            faireOperation();
            operation = '+';
            calc.setText(String.valueOf(memoire));
            raz = true;
        }
    };

    private View.OnClickListener btn_sousListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            faireOperation();
            operation = '-';
            calc.setText(String.valueOf(memoire));
            raz = true;
        }
    };

    private View.OnClickListener btn_multListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            faireOperation();
            operation = '*';
            calc.setText(String.valueOf(memoire));
            raz = true;
        }
    };

    private View.OnClickListener btn_divListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            faireOperation();
            operation = '/';
            calc.setText(String.valueOf(memoire));
            raz = true;
        }
    };

    private View.OnClickListener btn_addsousListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String calcul = String.valueOf(calc.getText());
            float nb = Float.parseFloat(calcul);
            nb = -nb;
            calcul = String.valueOf(nb);
            calc.setText(calcul);
        }
    };

    private View.OnClickListener btn_decalListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String calcul = String.valueOf(calc.getText());
            calcul = calcul.substring(0,calcul.length()-1);
            calc.setText(calcul);
        }
    };

    private View.OnClickListener btn_pointListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            ajouterFin(".");
        }
    };

    private View.OnClickListener btn_MListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            calc.setText(String.valueOf(memoire));
        }
    };

    private View.OnClickListener btn_MRListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            memoire = 0;
        }
    };

    private View.OnClickListener btn_egalListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            faireOperation();
            calc.setText(String.valueOf(memoire));
            memoire = 0;
            raz = true;
        }
    };

    void faireOperation(){
        String calcul = String.valueOf(calc.getText());
        float nb = Float.parseFloat(calcul);
        if(operation == '+'){ memoire = memoire + nb;}
        else if(operation == '-'){ memoire = memoire - nb;}
        else if(operation == '/'){ memoire = memoire / nb;}
        else if(operation == '*'){ memoire = memoire * nb;}
        operation = '+';
    }

}