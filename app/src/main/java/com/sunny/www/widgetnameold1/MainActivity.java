package com.sunny.www.widgetnameold1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, View.OnKeyListener{

    RadioGroup manwoman, job;
    RadioButton woman, man, student, office;
    EditText text1, text2;
    TextView last;
    String gender, jobstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(EditText)findViewById(R.id.text1);
        text2=(EditText)findViewById(R.id.text2);
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        last=(TextView)findViewById(R.id.last);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);



        manwoman=(RadioGroup)findViewById(R.id.manwoman);
        job=(RadioGroup)findViewById(R.id.job);
        manwoman.setOnCheckedChangeListener(this);
        job.setOnCheckedChangeListener(this);

        woman=(RadioButton)findViewById(R.id.woman);
        man=(RadioButton)findViewById(R.id.man);
        student=(RadioButton)findViewById(R.id.student);
        office=(RadioButton)findViewById(R.id.officer);

    }

    @Override
    public void onClick(View v) {
        String nameText=text1.getText().toString();
        String ageText=text2.getText().toString();
        String text=nameText+":"+ageText;
        switch (v.getId()){
            case R.id.button1:
                break;
            case R.id.button2:
                text=text+":"+gender+":"+jobstr;
                break;

        }
        last.setText(text);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.woman:
                gender=woman.getText().toString();
                break;
            case R.id.man:
                gender=man.getText().toString();
                break;

            case R.id.student:
                jobstr=student.getText().toString();
                break;

            case R.id.officer:
                jobstr=office.getText().toString();
                break;

        }
    }
}
