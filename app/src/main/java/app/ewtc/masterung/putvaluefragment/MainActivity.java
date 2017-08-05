package app.ewtc.masterung.putvaluefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.ewtc.masterung.putvaluefragment.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.linContent, mainFragment)
                    .commit();
        }   // if

    }   // Main Method
}   // Main Class
