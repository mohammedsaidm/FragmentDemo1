package com.example.mohammedsaid.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener{


    FragmentManager manager;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        txvResult=(TextView)findViewById(R.id.txvResult);
        addFragmentA();
    }

    private void addFragmentA() {
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container,fragmentA,"fragA");
        transaction.commit();
    }

    @Override
    public void addTwoNumbers(int num1, int num2) {

        int result=num1+num2;
        txvResult.setText("Result : "+result);
    }

    public void sendDataToB(View view) {

    }
}
