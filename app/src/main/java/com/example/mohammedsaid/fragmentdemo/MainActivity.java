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
    private int firstNum=0,secondNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        addFragmentA();
        addFragmentB();
    }

    private void addFragmentA() {
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.containerA,fragmentA,"fragA");
        transaction.commit();
    }
    private void addFragmentB() {
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.containerB,fragmentB,"fragB");
        transaction.commit();
    }

    @Override
    public void addTwoNumbers(int num1, int num2) {

        this.firstNum=num1;
        this.secondNum=num2;

        Toast.makeText(this,"Data in Activity is : "+num1+" , "+num2,Toast.LENGTH_SHORT).show();
    }

    public void sendDataToB(View view) {

        FragmentB fragmentB=(FragmentB)manager.findFragmentByTag("fragB");
        fragmentB.addNumbersInFragB(firstNum,secondNum);

    }
}
