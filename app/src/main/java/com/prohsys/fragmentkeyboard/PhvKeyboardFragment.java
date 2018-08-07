package com.prohsys.fragmentkeyboard;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.prohsys.fragmentkeyborad.R;


public class PhvKeyboardFragment extends Fragment implements View.OnClickListener,IPhvKeyboardEvent {
    Activity activity;
    PhvKeyboard phvKeyboard;
    TextView txtValue;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnBack;
    Button btnEnter;


    public PhvKeyboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_phv_keyboard, container, false);
        initComponents(view);
        return view;
    }

    public void initComponents(View view){

        phvKeyboard=new PhvKeyboard();

        txtValue = view.findViewById(R.id.txtValue);

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btn0 = view.findViewById(R.id.btn0);
        btnBack = view.findViewById(R.id.btnBack);
        btnEnter = view.findViewById(R.id.btnEnter);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnEnter.setOnClickListener(this);

        updateValue(phvKeyboard.getValue());

    }
    private void updateValue(String value){
        txtValue.setText(value);
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1){
            updateValue(phvKeyboard.addValue("1"));
        }
        if(view.getId() == R.id.btn2){
            updateValue(phvKeyboard.addValue("2"));
        }
        if(view.getId() == R.id.btn3){
            updateValue(phvKeyboard.addValue("3"));
        }
        if(view.getId() == R.id.btn4){
            updateValue(phvKeyboard.addValue("4"));
        }
        if(view.getId() == R.id.btn5){
            updateValue(phvKeyboard.addValue("5"));
        }
        if(view.getId() == R.id.btn6){
            updateValue(phvKeyboard.addValue("6"));
        }
        if(view.getId() == R.id.btn7){
            updateValue(phvKeyboard.addValue("7"));
        }
        if(view.getId() == R.id.btn8){
            updateValue(phvKeyboard.addValue("8"));
        }
        if(view.getId() == R.id.btn9){
            updateValue(phvKeyboard.addValue("9"));
        }
        if(view.getId() == R.id.btn0){
            updateValue(phvKeyboard.addValue("0"));
        }
        if(view.getId() == R.id.btnBack){
            updateValue(phvKeyboard.back());
        }
        if(view.getId() == R.id.btnEnter){
            KeyEvent(phvKeyboard.getValue());

        }

    }



    @Override
    public void SetActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void KeyEvent(String value) {
        ((MainActivity)getActivity()).keyEventFromFragment(value);
    }
}
