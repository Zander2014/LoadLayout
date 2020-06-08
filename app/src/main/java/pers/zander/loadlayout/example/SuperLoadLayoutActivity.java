package pers.zander.loadlayout.example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import pers.zander.loadlayout.example.superbuilder.IFetchData;
import pers.zander.loadlayout.example.superbuilder.SuperLoadLayoutBuilder;
import pers.zander.loadlayout.quick.QuickLoadLayout;
import pers.zander.loadlayout.supers.SuperLoadLayout;

public class SuperLoadLayoutActivity extends AppCompatActivity implements IFetchData {

    private SuperLoadLayout mSuperLoadLayout;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_load_layout);
        mSuperLoadLayout = findViewById(R.id.mSuperLoadLayout);
        mSuperLoadLayout.setBuilder(SuperLoadLayoutBuilder.create(this));
        mSuperLoadLayout.setLoadMode(SuperLoadLayout.LoadMode.LOADING);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSuperLoadLayout.setLoadMode(QuickLoadLayout.LoadMode.NO_NETWORK);
            }
        }, 2000);
    }

    @Override
    public void fetchData() {
        mSuperLoadLayout.setLoadMode(SuperLoadLayout.LoadMode.LOADING);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSuperLoadLayout.setLoadMode(SuperLoadLayout.LoadMode.SUCCESS);
            }
        }, 3000);
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, SuperLoadLayoutActivity.class);
        context.startActivity(intent);
    }
}
