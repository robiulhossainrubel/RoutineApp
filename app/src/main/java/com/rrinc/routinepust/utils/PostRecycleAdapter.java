package com.rrinc.routinepust.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.Post;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PostRecycleAdapter extends RecyclerView.Adapter<PostRecycleAdapter.RecyclerViewHolder> {

    public static final int NO_IMAGE = 0;
    public static final int IMAGE = 1;
    private Context mContext;
    private List<Post> postList;

    public PostRecycleAdapter() {
    }

    public PostRecycleAdapter(Context mContext, List<Post> postList) {
        this.mContext = mContext;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostRecycleAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(mContext).inflate(R.layout.announcement_item, parent, false);
            return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PostRecycleAdapter.RecyclerViewHolder holder, int position) {
        Post currentPost = postList.get(position);
        holder.name.setText(currentPost.getName());
        holder.time.setText(currentPost.getTime());
        holder.expandableTextView.setText(currentPost.getDescription());

        if (currentPost.getImageURL().equals("default")){
            holder.pstImg.setVisibility(View.GONE);
        }else {
            Picasso.with(mContext)
                    .load(currentPost.getImageURL())
                    .placeholder(R.drawable.gif)
                    .fit()
                    .centerCrop()
                    .into(holder.pstImg);
        }
        Picasso.with(mContext)
                .load(currentPost.getImageURL())
                .placeholder(R.drawable.gif)
                .fit()
                .centerCrop()
                .into(holder.pstImg);


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ExpandableTextView expandableTextView;
        TextView time,name;
        ImageView pstImg;

        RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            expandableTextView = (ExpandableTextView) itemView.findViewById(R.id.expand_text_view);
            name = (TextView) itemView.findViewById(R.id.namesposter);
            time = (TextView) itemView.findViewById(R.id.timePost);
            pstImg = (ImageView) itemView.findViewById(R.id.pstImg);
        }
    }


}
