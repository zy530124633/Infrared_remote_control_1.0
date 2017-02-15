package com.example.administrator.infrared_remote_control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView ivAdd;
    private RelativeLayout layout,rLayout_Tv,rLayout_Kt,rLayout_Fs;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAdd = (ImageView) findViewById(R.id.ivAdd);
        layout=(RelativeLayout)findViewById(R.id.pop_layout);
        rLayout_Tv = (RelativeLayout) findViewById(R.id.rLayout_Tv);
        rLayout_Kt = (RelativeLayout) findViewById(R.id.rLayout_Kt);
        rLayout_Fs = (RelativeLayout) findViewById(R.id.rLayout_Fs);
        view = findViewById(R.id.view);
        //把文字控件添加监听，点击弹出自定义窗口
        ivAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layout.setVisibility(View.VISIBLE);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.GONE);
            }
        });

        rLayout_Tv.setOnClickListener(this);
        rLayout_Kt.setOnClickListener(this);
        rLayout_Fs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rLayout_Tv:
                Intent intent = new Intent(this,SelectTVbrandActivity.class);
                startActivity(intent);
                break;
            case R.id.rLayout_Kt:
                Toast.makeText(MainActivity.this, "空调", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rLayout_Fs:
                Toast.makeText(MainActivity.this, "风扇", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
