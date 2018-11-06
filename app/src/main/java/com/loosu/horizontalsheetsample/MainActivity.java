package com.loosu.horizontalsheetsample;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.loosu.drawersheet.DrawerSheetBehavior;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View mBottomSheet;
    private View mDrawerSheet;

    private BottomSheetBehavior mBehavior;
    private DrawerSheetBehavior mDrawerBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView(savedInstanceState);
        initView(savedInstanceState);
        initListener(savedInstanceState);
    }


    private void findView(Bundle savedInstanceState) {
        mBottomSheet = findViewById(R.id.bottom_sheet);
        mDrawerSheet = findViewById(R.id.drawer_sheet);
    }

    private void initView(Bundle savedInstanceState) {
        mBehavior = BottomSheetBehavior.from(mBottomSheet);
        mBehavior.setPeekHeight(100);

        mDrawerBehavior = DrawerSheetBehavior.from(mDrawerSheet);
    }

    private void initListener(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_expanded:
                mBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;
            case R.id.btn_collapsed:
                mBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                break;
            case R.id.btn_hidden:
                mBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                break;

            case R.id.btn_drawer_expanded:
                mDrawerBehavior.setState(DrawerSheetBehavior.STATE_EXPANDED);
                break;
            case R.id.btn_drawer_collapsed:
                mDrawerBehavior.setState(DrawerSheetBehavior.STATE_COLLAPSED);
                break;
            case R.id.btn_drawer_hidden:
                mDrawerBehavior.setState(DrawerSheetBehavior.STATE_HIDDEN);
                break;
        }
    }
}
