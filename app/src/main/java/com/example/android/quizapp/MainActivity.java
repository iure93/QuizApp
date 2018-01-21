package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean q1A;
    boolean q1B;
    boolean q1C;
    boolean q1D;
    boolean q2A;
    boolean q2B;
    boolean q3A;
    boolean q3B;
    boolean q3C;
    boolean q3D;
    boolean q4A;
    boolean q4B;
    boolean q5A;
    boolean q5B;
    boolean q5C;
    boolean q5D;
    boolean q6A;
    boolean q6B;
    boolean q7A;
    boolean q7B;
    boolean q7C;
    boolean q7D;

    int sq1;
    int sq2;
    int sq3;
    int sq4;
    int sq5;
    int sq6;
    int sq7;




    int point = 0;
    String string_name=null;
    EditText name;

    CheckBox q1A_check_box;
    CheckBox q1B_check_box;
    CheckBox q1C_check_box;
    CheckBox q1D_check_box;
    RadioButton q2A_radio_button;
    RadioButton q2B_radio_button;
    CheckBox q3A_check_box;
    CheckBox q3B_check_box;
    CheckBox q3C_check_box;
    CheckBox q3D_check_box;
    RadioButton q4A_radio_button;
    RadioButton q4B_radio_button;
    CheckBox q5A_check_box;
    CheckBox q5B_check_box;
    CheckBox q5C_check_box;
    CheckBox q5D_check_box;
    RadioButton q6A_radio_button;
    RadioButton q6B_radio_button;
    CheckBox q7A_check_box;
    CheckBox q7B_check_box;
    CheckBox q7C_check_box;
    CheckBox q7D_check_box;


    TextView correct1;
    TextView correct2;
    TextView correct3;
    TextView correct4;
    TextView correct5 ;
    TextView correct6;
    TextView correct7 ;
    TextView wrong1;
    TextView wrong2;
    TextView wrong3;
    TextView wrong4;
    TextView wrong5;
    TextView wrong6;
    TextView wrong7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog, null);
        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);

        //find hidden view
         correct1 = findViewById(R.id.correct1);
         correct2 = findViewById(R.id.correct2);
         correct3 = findViewById(R.id.correct3);
         correct4 = findViewById(R.id.correct4);
         correct5 = findViewById(R.id.correct5);
         correct6 = findViewById(R.id.correct6);
         correct7 = findViewById(R.id.correct7);
         wrong1 = findViewById(R.id.wrong1);
         wrong2 = findViewById(R.id.wrong2);
         wrong3 = findViewById(R.id.wrong3);
         wrong4 = findViewById(R.id.wrong4);
         wrong5 = findViewById(R.id.wrong5);
         wrong6 = findViewById(R.id.wrong6);
         wrong7 = findViewById(R.id.wrong7);


        //classi
        name = mView.findViewById(R.id.name_dialog);
        Button submit = mView.findViewById(R.id.submit);
        q1A_check_box = findViewById(R.id.q1A);
        q1B_check_box = findViewById(R.id.q1B);
        q1C_check_box = findViewById(R.id.q1C);
        q1D_check_box = findViewById(R.id.q1D);
        q2A_radio_button = findViewById(R.id.q2A);
        q2B_radio_button = findViewById(R.id.q2B);
        q3A_check_box = findViewById(R.id.q3A);
        q3B_check_box = findViewById(R.id.q3B);
        q3C_check_box = findViewById(R.id.q3C);
        q3D_check_box = findViewById(R.id.q3D);
        q4A_radio_button = findViewById(R.id.q4A);
        q4B_radio_button = findViewById(R.id.q4B);
        q5A_check_box = findViewById(R.id.q5A);
        q5B_check_box = findViewById(R.id.q5B);
        q5C_check_box = findViewById(R.id.q5C);
        q5D_check_box = findViewById(R.id.q5D);
        q6A_radio_button = findViewById(R.id.q6A);
        q6B_radio_button = findViewById(R.id.q6B);
        q7A_check_box = findViewById(R.id.q7A);
        q7B_check_box = findViewById(R.id.q7B);
        q7C_check_box = findViewById(R.id.q7C);
        q7D_check_box = findViewById(R.id.q7D);


        if(sq1==1){
            correct1.setVisibility(View.VISIBLE);
        }
        if(sq1==2) {
            wrong1.setVisibility(View.VISIBLE);
        }
        if(sq2==1){
            correct2.setVisibility(View.VISIBLE);
        }
        if(sq2==2) {
            wrong2.setVisibility(View.VISIBLE);
        }
        if(sq3==1){
            correct3.setVisibility(View.VISIBLE);
        }
        if(sq3==2){
            wrong3.setVisibility(View.VISIBLE);
        }
        if(sq4==1){
            correct4.setVisibility(View.VISIBLE);
        }
        if(sq4==2) {
            wrong4.setVisibility(View.VISIBLE);
        }
        if(sq5==1){
            correct5.setVisibility(View.VISIBLE);
        }
        if(sq5==2){
            wrong5.setVisibility(View.VISIBLE);
        }
        if(sq6==1){
            correct6.setVisibility(View.VISIBLE);
        }
        if(sq6==2){
            wrong6.setVisibility(View.VISIBLE);
        }
        if(sq7==1){
            correct7.setVisibility(View.VISIBLE);
        }
        if(sq7==2){
            wrong7.setVisibility(View.VISIBLE);
        }



        if (savedInstanceState != null) {
            q1A = savedInstanceState.getBoolean("q1A");
            q1B = savedInstanceState.getBoolean("q1B");
            q1C = savedInstanceState.getBoolean("q1C");
            q1D = savedInstanceState.getBoolean("q1D");
            q2A = savedInstanceState.getBoolean("q2A");
            q2B = savedInstanceState.getBoolean("q2B");
            q3A = savedInstanceState.getBoolean("q3A");
            q3B = savedInstanceState.getBoolean("q3B");
            q3C = savedInstanceState.getBoolean("q3C");
            q3D = savedInstanceState.getBoolean("q3D");
            q4A = savedInstanceState.getBoolean("q4A");
            q4B = savedInstanceState.getBoolean("q4B");
            q5A = savedInstanceState.getBoolean("q5A");
            q5B = savedInstanceState.getBoolean("q5B");
            q5C = savedInstanceState.getBoolean("q5C");
            q5D = savedInstanceState.getBoolean("q5D");
            q6A = savedInstanceState.getBoolean("q6A");
            q6B = savedInstanceState.getBoolean("q6B");
            q7A = savedInstanceState.getBoolean("q7A");
            q7B = savedInstanceState.getBoolean("q7B");
            q7C = savedInstanceState.getBoolean("q7C");
            q7D = savedInstanceState.getBoolean("q7D");
            string_name = savedInstanceState.getString("string_name");
            point = savedInstanceState.getInt("point");

            sq1= savedInstanceState.getInt("sq1");
            sq2= savedInstanceState.getInt("sq2");
            sq3= savedInstanceState.getInt("sq3");
            sq4= savedInstanceState.getInt("sq4");
            sq5= savedInstanceState.getInt("sq5");
            sq6= savedInstanceState.getInt("sq6");
            sq7= savedInstanceState.getInt("sq7");
        }

        checkResult(null);

        if (string_name!=null){
            dialog.dismiss();
            TextView name_text_view = (TextView) findViewById(R.id.welcome_message);
            name_text_view.setText("Welcome " + string_name);}

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView name_text_view = (TextView) findViewById(R.id.welcome_message);
                string_name = name.getText().toString();
                name_text_view.setText("Welcome " + string_name);

                if (!name.getText().toString().isEmpty()) {
                    dialog.dismiss();
                    Toast.makeText(MainActivity.this, R.string.succes, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    //save the data
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putBoolean("q1A", q1A);
        savedInstanceState.putBoolean("q1B", q1B);
        savedInstanceState.putBoolean("q1C", q1C);
        savedInstanceState.putBoolean("q1D", q1D);
        savedInstanceState.putBoolean("q2A", q2A);
        savedInstanceState.putBoolean("q2B", q2B);
        savedInstanceState.putBoolean("q3A", q3A);
        savedInstanceState.putBoolean("q3B", q3B);
        savedInstanceState.putBoolean("q3C", q3C);
        savedInstanceState.putBoolean("q3D", q3D);
        savedInstanceState.putBoolean("q4A", q4A);
        savedInstanceState.putBoolean("q4B", q4B);
        savedInstanceState.putBoolean("q5A", q5A);
        savedInstanceState.putBoolean("q5B", q5B);
        savedInstanceState.putBoolean("q5C", q5C);
        savedInstanceState.putBoolean("q5D", q5D);
        savedInstanceState.putBoolean("q6A", q6A);
        savedInstanceState.putBoolean("q6B", q6B);
        savedInstanceState.putBoolean("q7A", q7A);
        savedInstanceState.putBoolean("q7B", q7B);
        savedInstanceState.putBoolean("q7C", q7C);
        savedInstanceState.putBoolean("q7D", q7D);
        savedInstanceState.putString("string_name", string_name);
        savedInstanceState.putInt("point", point);
        savedInstanceState.putInt("sq1", sq1);
        savedInstanceState.putInt("sq2", sq2);
        savedInstanceState.putInt("sq3", sq3);
        savedInstanceState.putInt("sq4", sq4);
        savedInstanceState.putInt("sq5", sq5);
        savedInstanceState.putInt("sq6", sq6);
        savedInstanceState.putInt("sq7", sq7);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void submit_button(View view) {

        //correct answer 1: q1B
        //correct answer 2: q2A
        //correct answer 3: q3D
        //correct answer 4: q4A
        //correct answer 5: q5C
        //correct answer 6: q6A
        //correct answer 7: q7A e q7D

        q1A = q1A_check_box.isChecked();
        q1B = q1B_check_box.isChecked();
        q1C = q1C_check_box.isChecked();
        q1D = q1D_check_box.isChecked();
        q2A = q2A_radio_button.isChecked();
        q2B = q2B_radio_button.isChecked();
        q3A = q3A_check_box.isChecked();
        q3B = q3B_check_box.isChecked();
        q3C = q3C_check_box.isChecked();
        q3D = q3D_check_box.isChecked();
        q4A = q4A_radio_button.isChecked();
        q4B = q4B_radio_button.isChecked();
        q5A = q5A_check_box.isChecked();
        q5B = q5B_check_box.isChecked();
        q5C = q5C_check_box.isChecked();
        q5D = q5D_check_box.isChecked();
        q6A = q6A_radio_button.isChecked();
        q6B = q6B_radio_button.isChecked();
        q7A = q7A_check_box.isChecked();
        q7B = q7B_check_box.isChecked();
        q7C = q7C_check_box.isChecked();
        q7D = q7D_check_box.isChecked();


        if (q1D == false && q1C == false && q1B == true && q1A == false) {
            correct1.setVisibility(View.VISIBLE);
            sq1=1;

            point += 1;
        } else {
            wrong1.setVisibility(View.VISIBLE);
            sq1=2;
        }

        //question 2

        if (q2A == true && q2B == false) {
            correct2.setVisibility(View.VISIBLE);
            sq2=1;
            point += 1;
        } else {
            sq2=2;
            wrong2.setVisibility(View.VISIBLE);
        }

        //question 3

        if (q3A == false && q3B == false && q3C == false && q3D == true) {
            correct3.setVisibility(View.VISIBLE);
            sq3=1;
            point += 1;
        } else {
            sq3=2;
            wrong3.setVisibility(View.VISIBLE);
        }

        //question 4

        if (q4A == true && q4B == false) {
            correct4.setVisibility(View.VISIBLE);
            sq4=1;
            point += 1;
        } else {
            sq4=2;
            wrong4.setVisibility(View.VISIBLE);
        }

        //question 5

        if (q5A == false && q5B == false && q5C == true && q5D == false) {
            correct5.setVisibility(View.VISIBLE);
            sq5=1;
            point += 1;
        } else {
            sq5=2;
            wrong5.setVisibility(View.VISIBLE);
        }

        //question 6

        if (q6A == true && q6B == false) {
            correct6.setVisibility(View.VISIBLE);
            sq6=1;
            point += 1;
        } else {
            sq6=2;
            wrong6.setVisibility(View.VISIBLE);
        }

        //question 7

        if (q7A == true && q7B == false && q7C == false && q7D == true) {
            correct7.setVisibility(View.VISIBLE);
            sq7=1;
            point += 1;
        } else {
            sq7=2;
            wrong7.setVisibility(View.VISIBLE);
        }


        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
        View nView = getLayoutInflater().inflate(R.layout.dialog_final, null);
        mBuilder.setView(nView);
        final AlertDialog dialog = mBuilder.create();
        TextView scoreView = nView.findViewById(R.id.score);
        scoreView.setText(String.valueOf(point)+" out of 7");
        dialog.show();

    }

    public void checkResult(View view){
        if(sq1==1){
            correct1.setVisibility(View.VISIBLE);
        }
        if(sq1==2) {
            wrong1.setVisibility(View.VISIBLE);
        }
        if(sq2==1){
            correct2.setVisibility(View.VISIBLE);
        }
        if(sq2==2) {
            wrong2.setVisibility(View.VISIBLE);
        }
        if(sq3==1){
            correct3.setVisibility(View.VISIBLE);
        }
        if(sq3==2){
            wrong3.setVisibility(View.VISIBLE);
        }
        if(sq4==1){
            correct4.setVisibility(View.VISIBLE);
        }
        if(sq4==2) {
            wrong4.setVisibility(View.VISIBLE);
        }
        if(sq5==1){
            correct5.setVisibility(View.VISIBLE);
        }
        if(sq5==2){
            wrong5.setVisibility(View.VISIBLE);
        }
        if(sq6==1){
            correct6.setVisibility(View.VISIBLE);
        }
        if(sq6==2){
            wrong6.setVisibility(View.VISIBLE);
        }
        if(sq7==1){
            correct7.setVisibility(View.VISIBLE);
        }
        if(sq7==2){
            wrong7.setVisibility(View.VISIBLE);
        }

    }

    public void reset_button (View view){
         q1A=false;
         q1B=false;
         q1C=false;
         q1D=false;
         q2A=false;
         q2B=false;
         q3A=false;
         q3B=false;
         q3C=false;
         q3D=false;
         q4A=false;
         q4B=false;
         q5A=false;
         q5B=false;
         q5C=false;
         q5D=false;
         q6A=false;
         q6B=false;
         q7A=false;
         q7B=false;
         q7C=false;
         q7D=false;

        sq1 = 0;
        sq2 = 0;
        sq3 = 0;
        sq4 = 0;
        sq5 = 0;
        sq6 = 0;
        sq7 = 0;
        point = 0;
        q1A_check_box.setChecked(false);
        q1B_check_box.setChecked(false);
        q1D_check_box.setChecked(false);
        q2A_radio_button.setChecked(false);
        q2B_radio_button.setChecked(false);
        q3A_check_box.setChecked(false);
        q3B_check_box.setChecked(false);
        q3C_check_box.setChecked(false);
        q3D_check_box.setChecked(false);
        q4A_radio_button.setChecked(false);
        q4B_radio_button.setChecked(false);
        q5A_check_box.setChecked(false);
        q5B_check_box.setChecked(false);
        q5C_check_box.setChecked(false);
        q5D_check_box.setChecked(false);
        q6A_radio_button.setChecked(false);
        q6B_radio_button.setChecked(false);
        q7A_check_box.setChecked(false);
        q7B_check_box.setChecked(false);
        q7C_check_box.setChecked(false);
        q7D_check_box.setChecked(false);

            correct1.setVisibility(View.GONE);
            wrong1.setVisibility(View.GONE);
            correct2.setVisibility(View.GONE);
            wrong2.setVisibility(View.GONE);
            correct3.setVisibility(View.GONE);
            wrong3.setVisibility(View.GONE);
            correct4.setVisibility(View.GONE);
            wrong4.setVisibility(View.GONE);
            correct5.setVisibility(View.GONE);
            wrong5.setVisibility(View.GONE);
            correct6.setVisibility(View.GONE);
            wrong6.setVisibility(View.GONE);
            correct7.setVisibility(View.GONE);
            wrong7.setVisibility(View.GONE);




    }





}


