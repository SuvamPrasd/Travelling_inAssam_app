package com.example.gotoassam;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PlaceAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new KamaKhyaTemple();
        }
        else if (position == 1){
            return new Umananda();
        }else if (position == 2){
            return new AssamZoo();
        }else if (position == 3){
            return new Srimanta();
        }else{
            return new Dipor();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.kamakhya_name);
        }
        else if (position == 1){
            return mContext.getString(R.string.Umananada_name);
        }else if (position == 2){
            return mContext.getString(R.string.Assamzoo_name);
        }else if (position == 3){
            return mContext.getString(R.string.Srimanta_name);
        }else{
            return mContext.getString(R.string.Dipor_name);
        }
    }
}
