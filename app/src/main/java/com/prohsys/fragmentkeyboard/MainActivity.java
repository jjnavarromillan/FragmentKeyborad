package com.prohsys.fragmentkeyboard;

import android.app.Activity;

import android.os.Bundle;
import android.widget.Toast;

import com.prohsys.fragmentkeyborad.R;

public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhvKeyboardFragment phvKeyboardFragment = new PhvKeyboardFragment();
        phvKeyboardFragment.SetActivity(this);
        getFragmentManager().beginTransaction().replace(R.id.main_container,phvKeyboardFragment)
                .addToBackStack("PhvKeyboardFragment").commit();

    }

    public void keyEventFromFragment(String value){
        Toast.makeText(getApplicationContext(), "Has generated an event! Value="+value, Toast.LENGTH_SHORT).show();
    }
}
