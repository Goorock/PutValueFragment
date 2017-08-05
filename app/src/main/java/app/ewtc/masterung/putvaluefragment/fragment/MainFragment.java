package app.ewtc.masterung.putvaluefragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import app.ewtc.masterung.putvaluefragment.R;

/**
 * Created by masterung on 8/4/2017 AD.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }   // onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Add Name Controller
        addNameController();

    }   // onActivityCreate

    private void addNameController() {
        final EditText editText = getView().findViewById(R.id.edtName);
        Button button = getView().findViewById(R.id.btnAddaName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameString = editText.getText().toString().trim();
                if (nameString.equals("")) {
                    nameString = "Not Thing";
                }   // if
                Log.d("4AugustV1", "Name ==> " + nameString);

                SecondFragment secondFragment = new SecondFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.linContent, SecondFragment.secondInstance(nameString))
                        .addToBackStack(null)
                        .commit();

            }   // onclick
        });
    }

}   // Main Class
