package com.example.user.loginexam2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mIdEditText;
    private EditText mpassEditText;
    private EditText mpass2EditText;
    private EditText memailEditText;
    private RadioGroup mGenderGroup;


    private ArrayList<EditText> mEditTextList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextList = new ArrayList<>();

        mIdEditText = findViewById(R.id.id_edit);
        mpassEditText = findViewById(R.id.pass_edit);
        mpass2EditText = findViewById(R.id.pass2_edit);
        memailEditText = findViewById(R.id.email_edit);

        mEditTextList.add(mIdEditText);
        mEditTextList.add(mpassEditText);
        mEditTextList.add(mpass2EditText);
        mEditTextList.add(memailEditText);

        mGenderGroup = findViewById(R.id.gender_group);
        mGenderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.male_radio){

                }else{

                }
            }
        });
       findViewById(R.id.reset_button).setOnClickListener(this);
       findViewById(R.id.sign_up_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.reset_button:
                reset();
                break;
            case R.id.sign_up_button:
                break;
        }
    }

    private void reset() {
        for (EditText editText : mEditTextList){
            editText.setText("");
        }
        mGenderGroup.clearCheck();
    }
}
