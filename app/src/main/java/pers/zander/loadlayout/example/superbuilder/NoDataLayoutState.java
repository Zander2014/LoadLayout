package pers.zander.loadlayout.example.superbuilder;

import android.util.Log;
import android.view.View;

import pers.zander.loadlayout.example.R;
import pers.zander.loadlayout.supers.ISuperLoadLayoutState;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public class NoDataLayoutState implements ISuperLoadLayoutState {

    //或者通过接口来实现
    private IFetchData iFetchData;

    public NoDataLayoutState(IFetchData iFetchData) {
        this.iFetchData = iFetchData;
    }

    @Override
    public int onCreateLayoutId() {
        return R.layout.layout_load_no_data;
    }

    @Override
    public void onCreateView(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("zyh", "点击layout_load_no_data");
                iFetchData.fetchData();
            }
        });
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onHide() {

    }
}
