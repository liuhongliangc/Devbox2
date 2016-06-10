package com.xxxifan.devbox.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xxxifan.devbox.R;
import com.xxxifan.devbox.library.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by xifan on 6/8/16.
 */
public class TestFragment2 extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_test2;
    }

    @Override
    protected void onSetupFragment(View view, Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        TextView textView = ButterKnife.findById(view, R.id.text2);
        textView.setText("Text2\n" + toString());
    }

    @Override
    public String getSimpleName() {
        return "TestFragment2";
    }
}