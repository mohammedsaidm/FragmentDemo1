package com.example.mohammedsaid.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mohammed Said on 27-Jan-18.
 */

public class FragmentB extends Fragment {

    private TextView tResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        tResult=(TextView)view.findViewById(R.id.txvResultB);
        return view;
    }

    public void addNumbersInFragB(int x,int y){
        int result=x+y;
        tResult.setText("Result : "+result);
    }
}
