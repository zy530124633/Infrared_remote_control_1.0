package com.example.administrator.infrared_remote_control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SelectTVbrandActivity extends AppCompatActivity {
    private ListView listView;
    private ImageView iv_back;
    private SelectTVAdapter tvAdapter;
    private List<String> tvList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tvbrand);
        initView();
        listener();
        getData();
    }

    public void initView(){
        listView = (ListView) findViewById(R.id.listView);
        iv_back = (ImageView) findViewById(R.id.iv_back);

//        tvAdapter = new SelectTVAdapter(this,tvList);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,tvList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SelectTVbrandActivity.this,AddTVRemoteControlActivity.class);
                intent.putExtra("brand",tvList.get(i));
                startActivity(intent);
            }
        });
    }

    public void listener(){
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectTVbrandActivity.this.finish();
            }
        });

    }

    public void getData(){
        for (int i=0;i<5;i++){
            tvList.add("电视品牌"+i);
        }
//        return tvList;
    }



}
