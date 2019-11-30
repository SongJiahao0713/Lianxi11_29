package com.bawei.lianxi11_29;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

/**
 * 时间：2019/11/30 0030
 * 作者：Songjiahao
 * 类的作用：
 */
public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=View.inflate(getContext(),R.layout.fragment_home,null);
        return view;
    }


}