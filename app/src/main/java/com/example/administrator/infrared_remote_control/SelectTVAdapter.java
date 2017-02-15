package com.example.administrator.infrared_remote_control;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/2/14.
 */

public class SelectTVAdapter extends BaseAdapter {
    private Context context;
    private List<String> tvList;
    public SelectTVAdapter(Context context, List<String> tvList){
        this.context = context;
        this.tvList = tvList;

    }

    @Override
    public int getCount() {
        return tvList.size();
    }

    @Override
    public Object getItem(int i) {
        return tvList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
