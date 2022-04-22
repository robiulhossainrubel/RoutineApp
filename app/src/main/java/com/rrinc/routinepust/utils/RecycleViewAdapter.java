package com.rrinc.routinepust.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rrinc.routinepust.R;
import com.rrinc.routinepust.model.Post;
import com.rrinc.routinepust.model.RoutineInfo;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    int id= -1 ;
    private Context nContext;
    private List<RoutineInfo> mRouineInfoList;

    public RecycleViewAdapter() {
    }

    public RecycleViewAdapter(Context nContext, List<RoutineInfo> mRouineInfoList) {
        this.nContext = nContext;
        this.mRouineInfoList = mRouineInfoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(nContext).inflate(R.layout.class_list,parent,false);
        return new RecycleViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final RoutineInfo routineInfo = mRouineInfoList.get(position);

        holder.tv_title.setText(mRouineInfoList.get(position).getClsTitl());
        holder.tv_code.setText(mRouineInfoList.get(position).getClsCode());
        holder.tv_time.setText(mRouineInfoList.get(position).getClsTime());
        holder.tv_tech.setText(mRouineInfoList.get(position).getClsTech());
        holder.tv_room.setText(mRouineInfoList.get(position).getClsRoom());

        holder.alarmclck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String al=mRouineInfoList.get(position).getClsTime();
                Toast.makeText(nContext,"Alarm Set to "+al,Toast.LENGTH_SHORT).show();
            }
        });




        holder.tv_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu=new PopupMenu(nContext,holder.tv_option);
                popupMenu.inflate(R.menu.routine_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(final MenuItem item) {

                        switch (item.getItemId()){
                            case R.id.rtEdit:
                                final Dialog dialog=new Dialog(nContext);
                                dialog.setContentView(R.layout.edit_routine);
                                TextView msg=(TextView)dialog.findViewById(R.id.tv);
                                msg.setText("Update Routine");
                                final EditText titl=(EditText)dialog.findViewById(R.id.etctl);
                                final EditText code=(EditText)dialog.findViewById(R.id.etcc);
                                final EditText time=(EditText)dialog.findViewById(R.id.ettime);
                                final EditText tch=(EditText)dialog.findViewById(R.id.etti);
                                final EditText room=(EditText)dialog.findViewById(R.id.etroom);

                                id=position;

                                titl.setText(mRouineInfoList.get(position).getClsTitl());
                                code.setText(mRouineInfoList.get(position).getClsCode());
                                time.setText(mRouineInfoList.get(position).getClsTime());
                                tch.setText(mRouineInfoList.get(position).getClsTech());
                                room.setText(mRouineInfoList.get(position).getClsRoom());

                                Button btn=(Button)dialog.findViewById(R.id.bt);

                                btn.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        String ctitl=titl.getText().toString();
                                        String ccode=code.getText().toString();
                                        String ctime=time.getText().toString();
                                        String ctch=tch.getText().toString();
                                        String croom=room.getText().toString();

                                        if(ctitl.isEmpty() || ccode.isEmpty()|| ctime.isEmpty()|| ctch.isEmpty() || croom.isEmpty()){
                                            Toast.makeText(nContext,"Field must be Fillup",Toast.LENGTH_SHORT).show();
                                        }else {
                                            RoutineInfo routineInfo=new RoutineInfo("",ctitl,ccode,ctime,ctch,croom);
                                            mRouineInfoList.set(id,routineInfo);
                                            id=-1;
                                            notifyDataSetChanged();
                                            dialog.dismiss();
                                            Toast.makeText(nContext,ccode+" Updated",Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                                dialog.show();
                                break;
                            case R.id.rtDelete:
                                String cd=mRouineInfoList.get(position).getClsCode();
                                mRouineInfoList.remove(position);
                                notifyDataSetChanged();

                                Toast.makeText(nContext,cd+" has been Deleted",Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mRouineInfoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title;
        TextView tv_code;
        TextView tv_time;
        TextView tv_tech;
        TextView tv_room;
        TextView tv_option;
        ImageView alarmclck;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title=(TextView) itemView.findViewById(R.id.clsttl);
            tv_code=(TextView) itemView.findViewById(R.id.clscd);
            tv_time=(TextView) itemView.findViewById(R.id.clstm);
            tv_tech=(TextView) itemView.findViewById(R.id.techcd);
            tv_room=(TextView) itemView.findViewById(R.id.roomno);
            tv_option=(TextView) itemView.findViewById(R.id.option);
            alarmclck=(ImageView)itemView.findViewById(R.id.alarm);


        }
    }
}
