package pers.zander.loadlayout.example.superbuilder;

import android.view.View;

import pers.zander.loadlayout.example.R;
import pers.zander.loadlayout.supers.ISuperLoadLayoutState;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public class LoadingLayoutState implements ISuperLoadLayoutState {

    //或者通过接口来实现
    private IFetchData iFetchData;

    public LoadingLayoutState(IFetchData iFetchData) {
        this.iFetchData = iFetchData;
    }

    @Override
    public int onCreateLayoutId() {
        return R.layout.layout_load_loading;
    }

    @Override
    public void onCreateView(View view) {

    }

    @Override
    public void onShow() {

    }

    @Override
    public void onHide() {

    }
}
