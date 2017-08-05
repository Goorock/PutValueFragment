package app.ewtc.masterung.putvaluefragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import app.ewtc.masterung.putvaluefragment.R;

/**
 * Created by masterung on 8/4/2017 AD.
 */

public class SecondFragment extends Fragment{

    private String showNameString;

    public static SecondFragment secondInstance(String strName) {

        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Name", strName);
        secondFragment.setArguments(bundle);
        return secondFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Read From Argument
        showNameString = getArguments().getString("Name");
        Log.d("4AugustV1", "showName ==> " + showNameString);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Show Name
        showName();

        //Back Controller
        backController();

    }

    private void backController() {
        Button button = getView().findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    private void showName() {
        TextView textView = getView().findViewById(R.id.txtShowResult);
        textView.setText(showNameString);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }
}
