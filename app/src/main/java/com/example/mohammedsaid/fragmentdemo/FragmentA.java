package com.example.mohammedsaid.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mohammed Said on 27-Jan-18.
 */

public class FragmentA extends Fragment {

    private Button btnSend;
    private EditText etFirstNumber;
    private EditText etSecondNumber;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

       Bundle bundle=getArguments();

        View view=inflater.inflate(R.layout.fragment_a,container,false);

        etFirstNumber=(EditText)view.findViewById(R.id.etFirstNumber);
        etSecondNumber=(EditText)view.findViewById(R.id.etSecondNumber);

        btnSend=(Button) view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
       return view;
    }

    public void sendData() {

        int firstNumber=Integer.valueOf(etFirstNumber.getText().toString());
        int secondNumber=Integer.valueOf(etSecondNumber.getText().toString());

        MyListener myListener=(MyListener) getActivity();
        myListener.addTwoNumbers(firstNumber,secondNumber);
    }
}
