package com.example.balu.bluetoothfun;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ConnectedAdapter extends ArrayAdapter<String> {

    ArrayList<String> connectedList=new ArrayList<>();
    public ConnectedAdapter(@NonNull Context context, int textViewResourceId,  @NonNull List<String> objects) {
        super(context, textViewResourceId, objects);
        for(int i=0;i<objects.size();i++){
            connectedList.add(objects.get(i));
        }
    }


    @Override
    public boolean hasStableIds() {
        return true;
    }
}
