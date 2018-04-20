package com.example.manikgupta.whatsappuiclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {

    private ChatsFragmentAdapter mAdapter;
    private static final int NUM_LIST_ITEMS = 10;

    public ChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.main, menu);

        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chats, container, false);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        RecyclerView mRecyclerView = view.findViewById(R.id.recView);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

       DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
          layoutManager.getOrientation());
       mRecyclerView.addItemDecoration(dividerItemDecoration);

        mAdapter = new ChatsFragmentAdapter(NUM_LIST_ITEMS);
        mRecyclerView.setAdapter(mAdapter);





       return view;
    }

}
