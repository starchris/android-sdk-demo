package com.demo.app.androidsdkdemo.fragment;

import android.view.View;

public class SecondPostFragment extends FirstPostFragment {

    int getContentIndex() {
        return 1;
    }

    void test() {
        View a = getView();
        if (a != null) {
            a.setOnClickListener(View::toString);
        }
    }
}

