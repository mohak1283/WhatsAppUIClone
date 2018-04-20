package com.example.manikgupta.whatsappuiclone;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new CameraFragment();
        } else if (position == 1) {
            return new ChatsFragment();
        } else if (position == 2) {
            return new StatusFragment();
        } else {
            return new CallsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        if (position == 0) {
            return null;
        } else if (position == 1) {
             title = "Chats";
        } else if (position == 2){
            title = "Status";
        } else if (position == 3) {
            title = "Calls";
        }
        return title;
    }
}
