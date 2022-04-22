package com.rrinc.routinepust.model;

import android.content.Context;
import android.content.SharedPreferences;

public class Admin {

    Context context;
    SharedPreferences sharedPreferences;
    String adept;
    String aseme;

    public String getAdept() {
        adept = sharedPreferences.getString("admindept","");
        return adept;
    }

    public void setAdept(String adept) {
        this.adept = adept;
        sharedPreferences.edit().putString("admindept",adept).commit();
    }

    public String getAseme() {
        aseme = sharedPreferences.getString("adminseme","");
        return aseme;
    }

    public void setAseme(String aseme) {
        this.aseme = aseme;
        sharedPreferences.edit().putString("adminseme",aseme).commit();
    }

    public Admin(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("userinfo",Context.MODE_PRIVATE);
    }

    public void removeAdmin(){
        sharedPreferences.edit().clear().commit();
    }
}
