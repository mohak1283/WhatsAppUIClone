package com.example.manikgupta.whatsappuiclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {

    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_status, container, false);

        ImageView myImage = view.findViewById(R.id.circular_image);
        TextView myStatusTextView = view.findViewById(R.id.myStatusView);
        TextView statusDescptxtView = view.findViewById(R.id.statusDescriptiontxtView);
        TextView recentStatusTxtView = view.findViewById(R.id.recentUpdates);
        ImageView someOneImgView = view.findViewById(R.id.imageView2);
        TextView smOneTxtView = view.findViewById(R.id.someOneTxtView);
        TextView timeTextView = view.findViewById(R.id.timeTextView);

        myImage.setImageResource(R.drawable.image);
        myStatusTextView.setText(R.string.myStatustxtView);
        statusDescptxtView.setText(R.string.statusDescription);
        recentStatusTxtView.setText(R.string.recentUpdates);
        someOneImgView.setImageResource(R.drawable.someone);
        smOneTxtView.setText(R.string.someone);
        timeTextView.setText(R.string.timeTxtView);

        return view;

    }

}
