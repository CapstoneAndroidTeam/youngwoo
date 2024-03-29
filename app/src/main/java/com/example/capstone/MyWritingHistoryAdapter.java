package com.example.capstone;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyWritingHistoryAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Integer> profileimg;
    private ArrayList<String> nickname;
    private ArrayList<String> storytext;
    private LayoutInflater inflater;


    public MyWritingHistoryAdapter(MyWritingHistory myWritingHistory, ArrayList<Integer> profileimg, ArrayList<String> nickname, ArrayList<String> storytext) {
        this.context = myWritingHistory;
        this.profileimg = profileimg;
        this.nickname = nickname;
        this.storytext = storytext;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return storytext.size();
    }

    @Override
    public Object getItem(int position) {
        return storytext.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        TextView nickname;
        TextView storytext;
        ImageView profileimg;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.writinghistory_listview, parent, false);

            holder = new ViewHolder();
            holder.profileimg = convertView.findViewById(R.id.profileimg);
            holder.storytext = convertView.findViewById(R.id.story);
            holder.nickname = convertView.findViewById(R.id.NickName);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        View finalConvertView = convertView;

        holder.nickname.setText(nickname.get(position));
        holder.storytext.setText(storytext.get(position));
        holder.profileimg.setImageResource(profileimg.get(position));

        return convertView;
    }
}

