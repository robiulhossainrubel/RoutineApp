package com.rrinc.routinepust.model;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    Context context;
    SharedPreferences sharedPreferences;
    String dept;
    String seme;

    public String getDept() {
        dept = sharedPreferences.getString("userdept","");
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
        sharedPreferences.edit().putString("userdept",dept).commit();
    }

    public String getSeme() {
        seme = sharedPreferences.getString("userseme","");
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
        sharedPreferences.edit().putString("userseme",seme).commit();
    }

    public User(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("userinfo",Context.MODE_PRIVATE);
    }

    public void removeUser(){
        sharedPreferences.edit().clear().commit();
    }
}
