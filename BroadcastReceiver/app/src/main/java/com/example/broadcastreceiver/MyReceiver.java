package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String action=intent.getAction();
        if(action==Intent.ACTION_POWER_CONNECTED)
        {
            Toast.makeText(context, "power i conneted", Toast.LENGTH_SHORT).show();

        }
        else if(action==Intent.ACTION_POWER_DISCONNECTED)
            Toast.makeText(context, "power is disconecte", Toast.LENGTH_SHORT).show();


    }


}
