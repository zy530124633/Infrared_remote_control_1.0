package com.example.administrator.infrared_remote_control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditRemoteControlActivity extends AppCompatActivity {
    private TextView tv_save;
    private EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_remote_control);
        initView();
        listener();
    }
    public void initView(){
        tv_save = (TextView) findViewById(R.id.tv_save);
        et_name = (EditText) findViewById(R.id.et_TV_name);

    }
    public void listener(){
        tv_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
