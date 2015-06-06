package ua.sunshinea.dubovik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> data=new ArrayList<>();
        data.add("Sunny");
        data.add("Snow");
        data.add("Sunny");
        data.add("Sunny");
        data.add("Rain");
        data.add("Sunny");
        data.add("Sunny");
        data.add("Cloudy");



        return rootView;
    }

    public static MainActivityFragment newInstance() {
        MainActivityFragment fragment = new MainActivityFragment();
        return fragment;
    }
}
