package com.rrinc.routinepust.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.CT;

import java.util.List;

public class CTAdapter extends RecyclerView.Adapter<CTAdapter.ViewHolder> {

    private Context nContext;
    private List<CT> CtList;

    public CTAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(nContext).inflate(R.layout.ct_list,parent,false);
        return new CTAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final CT ct = CtList.get(position);

        holder.tv_title.setText(CtList.get(position).getCourse());
        holder.tv_code.setText(CtList.get(position).getCode());
        holder.tv_time.setText(CtList.get(position).getTime());
        holder.tv_tech.setText(CtList.get(position).getTech());
        holder.tv_room.setText(CtList.get(position).getRoom());
        holder.tv_date.setText(CtList.get(position).getDate());
        holder.tv_topic.setText(CtList.get(position).getTopic());

    }

    @Override
    public int getItemCount() {
        return CtList.size();
    }

    public CTAdapter(Context nContext, List<CT> ctList) {
        this.nContext = nContext;
        CtList = ctList;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title;
        TextView tv_code;
        TextView tv_time;
        TextView tv_tech;
        TextView tv_room;
        TextView tv_date;
        TextView tv_topic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title=(TextView) itemView.findViewById(R.id.clsttl);
            tv_code=(TextView) itemView.findViewById(R.id.clscd);
            tv_time=(TextView) itemView.findViewById(R.id.clstm);
            tv_tech=(TextView) itemView.findViewById(R.id.techcd);
            tv_room=(TextView) itemView.findViewById(R.id.roomno);
            tv_date=(TextView) itemView.findViewById(R.id.date);
            tv_topic=(TextView) itemView.findViewById(R.id.topic);

        }
    }
}
