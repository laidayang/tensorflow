package org.laiyang.tensorflow2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.laiyang.tensorflow.R;

public class ScanfFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //引用创建好的xml布局
        View view = inflater.inflate(R.layout.activity_main, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(Bundle sacedInstanceState) {
        super.onActivityCreated(sacedInstanceState);
    }

    @Override
    public void onClick(View view) {
    }
}
