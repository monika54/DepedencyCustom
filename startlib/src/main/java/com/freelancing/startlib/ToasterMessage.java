package com.freelancing.startlib;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {


    public static void msgCustom(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }



}
