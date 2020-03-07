package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int qOne=0,qTwo=0,qThree=0,qFour=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void qOneButton(View view){

        if(qOne==1){
            displayOne("Correct");
        }
        else {
            displayOne("Wrong");
        }

    }

    public void qOneRadioB(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.qOneA:
                if (checked)
                    qOne=0;
                    break;
            case R.id.qOneB:
                if (checked)
                    qOne=0;
                    break;
            case R.id.qOneC:
                if (checked)
                    qOne=0;
                    break;
            case R.id.qOneD:
                if (checked)
                    qOne=1;
                    break;
        }
    }

    protected void displayOne(String st){
        Button bt1=(Button) findViewById(R.id.buttonOne);
        bt1.setText("Retry");
        TextView tv1=(TextView)findViewById(R.id.AnswerA);
        tv1.setText(st);
        if(qOne==1) {
            tv1.setBackgroundColor(Color.GREEN);
        }
        else
            tv1.setBackgroundColor(Color.RED);
    }



    public void qTwoButton(View view){

        if(qTwo==1){
            displayTwo("Correct");
        }
        else {
            displayTwo("Wrong");
        }

    }

    public void qTwoRadioB(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.qTwoA:
                if (checked)
                    qTwo=0;
                break;
            case R.id.qOneB:
                if (checked)
                    qTwo=0;
                break;
            case R.id.qTwoC:
                if (checked)
                    qTwo=1;
                break;
            case R.id.qTwoD:
                if (checked)
                    qTwo=0;
                break;
        }
    }

    protected void displayTwo(String st){
        Button bt1=(Button) findViewById(R.id.buttonTwo);
        bt1.setText("Retry");
        TextView tv1=(TextView)findViewById(R.id.Answer2);
        tv1.setText(st);
        if(qTwo==1) {
            tv1.setBackgroundColor(Color.GREEN);
        }
        else
            tv1.setBackgroundColor(Color.RED);
    }





// For Third Question

    public void qThreeButton(View view){

        if(qThree==1){
            displayThree("Correct");
        }
        else {
            displayThree("Wrong");
        }

    }

    public void qThreeRadioB(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.qThreeA:
                if (checked)
                    qThree=0;
                break;
            case R.id.qThreeB:
                if (checked)
                    qThree=1;
                break;
            case R.id.qTwoC:
                if (checked)
                    qThree=0;
                break;
            case R.id.qThreeD:
                if (checked)
                    qThree=0;
                break;
        }
    }

    protected void displayThree(String st){
        Button bt1=(Button) findViewById(R.id.buttonThree);
        bt1.setText("Retry");
        TextView tv1=(TextView)findViewById(R.id.Answer3);
        tv1.setText(st);
        if(qThree==1) {
            tv1.setBackgroundColor(Color.GREEN);
        }
        else
            tv1.setBackgroundColor(Color.RED);
    }




// For 4th Question

    public void qFourButton(View view){

        if(qFour==1){
            displayFour("Correct");
        }
        else {
            displayFour("Wrong");
        }

    }

    public void qFourRadioB(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.qFourA:
                if (checked)
                    qFour=0;
                break;
            case R.id.qFourB:
                if (checked)
                    qFour=0;
                break;
            case R.id.qFourC:
                if (checked)
                    qFour=1;
                break;
            case R.id.qFourD:
                if (checked)
                    qFour=0;
                break;
        }
    }

    protected void displayFour(String st){
        Button bt1=(Button) findViewById(R.id.buttonFour);
        bt1.setText("Retry");
        TextView tv1=(TextView)findViewById(R.id.Answer4);
        tv1.setText(st);
        if(qFour==1) {
            tv1.setBackgroundColor(Color.GREEN);
        }
        else
            tv1.setBackgroundColor(Color.RED);
    }

}
