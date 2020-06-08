package pers.zander.loadlayout.example.superbuilder;

import pers.zander.loadlayout.supers.SuperLoadLayout;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public class SuperLoadLayoutBuilder {
    public static SuperLoadLayout.Builder create(IFetchData iFetchData){
        return new SuperLoadLayout.Builder()
                .buildCreateErrorLayout(new ErrorILoadLayoutState(iFetchData))
                .buildCreateLoadingLayout(new ErrorILoadLayoutState(iFetchData))
                .buildCreateNoDataLayout(new ErrorILoadLayoutState(iFetchData))
                .buildCreateNoNetworkLayout(new ErrorILoadLayoutState(iFetchData))
                .build();
    }
}
