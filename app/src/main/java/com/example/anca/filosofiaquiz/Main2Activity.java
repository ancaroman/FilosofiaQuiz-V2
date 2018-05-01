package com.example.anca.filosofiaquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    double finalScore;
    String playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent nameIntent = getIntent();
        playerName = nameIntent.getStringExtra("player_name");
    }

    /**
     * Set the radio buttons
     */

    public void onClickQ2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q2a1:
                if (checked)
                    break;
            case R.id.radio_button_q2a2:
                if (checked)
                    break;
            case R.id.radio_button_q2a3:
                if (checked)
                    break;
            case R.id.radio_button_q2a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q3a1:
                if (checked)
                    break;
            case R.id.radio_button_q3a2:
                if (checked)
                    break;
            case R.id.radio_button_q3a3:
                if (checked)
                    break;
            case R.id.radio_button_q3a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q4a1:
                if (checked)
                    break;
            case R.id.radio_button_q4a2:
                if (checked)
                    break;
            case R.id.radio_button_q4a3:
                if (checked)
                    break;
            case R.id.radio_button_q4a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q5a1:
                if (checked)
                    break;
            case R.id.radio_button_q5a2:
                if (checked)
                    break;
            case R.id.radio_button_q5a3:
                if (checked)
                    break;
            case R.id.radio_button_q5a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q6a1:
                if (checked)
                    break;
            case R.id.radio_button_q6a2:
                if (checked)
                    break;
            case R.id.radio_button_q6a3:
                if (checked)
                    break;
            case R.id.radio_button_q6a4:
                if (checked)
                    break;
        }
    }

    public void onClickQ8(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q8a1:
                if (checked)
                    break;
            case R.id.radio_button_q8a2:
                if (checked)
                    break;
            case R.id.radio_button_q8a3:
                if (checked)
                    break;
        }
    }

    public void onClickQ9(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (view.getId() == R.id.radio_button_q9a1) {
            if (checked);

            else if (view.getId() == R.id.radio_button_q9a2) {
                if (checked);

            }
        }
    }

    public void onClickQ10(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_button_q10a1:
                if (checked)
                    break;
            case R.id.radio_button_q10a2:
                if (checked)
                    break;
            case R.id.radio_button_q10a3:
                if (checked)
                    break;
            case R.id.radio_button_q10a4:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void seeScore(View view) {
        finalScore = 0;

        /**
         * 1st question (EditText)
         */
        EditText author;
        author = (EditText) findViewById(R.id.edit_text_q1);
        String authorBook = author.getText().toString();
        if (authorBook.equalsIgnoreCase("Karl Marx")) {
            finalScore++;
        }

        /**
         * 2nd question (RadioButton)
         */
        RadioButton q2a2 = (RadioButton) findViewById(R.id.radio_button_q2a2);
        boolean q2a2Checked = q2a2.isChecked();
        if (q2a2Checked) {
            finalScore++;
        }

        /**
         * 3rd question (RadioButton)
         */
        RadioButton q3a1 = (RadioButton) findViewById(R.id.radio_button_q3a1);
        boolean q3a1Checked = q3a1.isChecked();
        if (q3a1Checked) {
            finalScore++;
        }

        /**
         * 4th question (RadioButton)
         */
        RadioButton q4a2 = (RadioButton) findViewById(R.id.radio_button_q4a2);
        boolean q4a2Checked = q4a2.isChecked();
        if (q4a2Checked) {
            finalScore++;
        }

        /**
         * 5th question (RadioButton)
         */
        RadioButton q5a3 = (RadioButton) findViewById(R.id.radio_button_q5a3);
        boolean q5a3Checked = q5a3.isChecked();
        if (q5a3Checked) {
            finalScore++;
        }

        /**
         * 6th question (RadioButton)
         */
        RadioButton q6a4 = (RadioButton) findViewById(R.id.radio_button_q6a4);
        boolean q6a4Checked = q6a4.isChecked();
        if (q6a4Checked) {
            finalScore++;
        }

        /**
         * 7th question (CheckBox)
         */
        CheckBox q7a1 = (CheckBox) findViewById(R.id.check_box_q7a1);
        boolean q7a1Checked = q7a1.isChecked();

        CheckBox q7a2 = (CheckBox) findViewById(R.id.check_box_q7a2);
        boolean q7a2Checked = q7a2.isChecked();

        if (q7a1Checked && q7a2Checked) {
            finalScore++;
        }

        /**
         * 8th question (RadioButton)
         */
        RadioButton q8a2 = (RadioButton) findViewById(R.id.radio_button_q8a2);
        boolean q8a2Checked = q8a2.isChecked();
        if (q8a2Checked) {
            finalScore++;
        }

        /**
         * 9th question (RadioButton)
         */
        RadioButton q9a2 = (RadioButton) findViewById(R.id.radio_button_q9a2);
        boolean q9a2Checked = q9a2.isChecked();
        if (q9a2Checked) {
            finalScore++;
        }

        /**
         * 10th question (RadioButton)
         */
        RadioButton q10a1 = (RadioButton) findViewById(R.id.radio_button_q10a1);
        boolean q10a1Checked = q10a1.isChecked();
        if (q10a1Checked) {
            finalScore++;
        }

        /**
         * Displays score on a toast button
         */
        String text = playerName + ", your score is " + finalScore + "/10 !";
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        Intent i = getIntent();
        playerName = i.getStringExtra("player_name");
    }
        /**Restart Method resets the values so the player turns to default and Buttons &
         * data is restored to default
        */
        public void restart(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}





