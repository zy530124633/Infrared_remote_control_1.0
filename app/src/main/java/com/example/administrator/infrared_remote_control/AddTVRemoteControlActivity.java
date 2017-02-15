package com.example.administrator.infrared_remote_control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class AddTVRemoteControlActivity extends AppCompatActivity {
    private RelativeLayout TV_IsOpen,TV_IsOff,rLayout_JY;
    private LinearLayout line2;
    private Button btn_off,btn_open,btn_no,btn_yes;
    private ImageView iv_timg;
    private boolean tag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tvremote_control_acyivity);
        initView();
        listener();
    }

    public void initView(){
        TV_IsOpen = (RelativeLayout) findViewById(R.id.TV_IsOpen);
        TV_IsOff = (RelativeLayout) findViewById(R.id.TV_IsOff);
        rLayout_JY = (RelativeLayout) findViewById(R.id.rLayout_JY);
        line2 = (LinearLayout) findViewById(R.id.line2);
        btn_no = (Button) findViewById(R.id.btn_no);
        btn_off = (Button) findViewById(R.id.btn_off);
        btn_open = (Button) findViewById(R.id.btn_open);
        btn_yes = (Button) findViewById(R.id.btn_is);
        iv_timg = (ImageView) findViewById(R.id.iv_timg);
    }

    public void listener(){

        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_IsOpen.setVisibility(View.GONE);
                rLayout_JY.setVisibility(View.VISIBLE);
                Toast.makeText(AddTVRemoteControlActivity.this, "点击了", Toast.LENGTH_SHORT).show();
            }
        });
        btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TV_IsOpen.setVisibility(View.GONE);
                TV_IsOff.setVisibility(View.VISIBLE);
            }
        });

        iv_timg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                line2.setVisibility(View.VISIBLE);
            }
        });

        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTVRemoteControlActivity.this,EditRemoteControlActivity.class);
                startActivity(intent);
            }
        });



    }

}
