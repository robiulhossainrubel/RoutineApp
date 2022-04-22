package com.rrinc.routinepust.utils;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.Post;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private final Context mContext;
    private final SparseBooleanArray mCollapsedStatus;
    private final List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        mContext  = context;
        mCollapsedStatus = new SparseBooleanArray();
        this.postList = postList;
    }


    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.announcement_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.expandableTextView = (ExpandableTextView) convertView.findViewById(R.id.expand_text_view);
            viewHolder.time = (TextView) convertView.findViewById(R.id.timePost);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Post post = postList.get(position);
        viewHolder.expandableTextView.setText(postList.get(position).getDescription(), mCollapsedStatus, position);
        viewHolder.time.setText(postList.get(position).getTime());

        return convertView;
    }


    private static class ViewHolder{
        ExpandableTextView expandableTextView;
        TextView time;
        ImageView pstImg;
    }
}
