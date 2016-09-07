package com.bruce.mvpdemo.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bruce.mvpdemo.R;
import com.bruce.mvpdemo.presenter.TvDataPresenter;
import com.bruce.mvpdemo.view.intf.ItvView;

public class MainActivity extends AppCompatActivity implements ItvView {

    private TextView textView;
    private Button button;
    private TvDataPresenter tvDataPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.tv);

//
        tvDataPresenter = new TvDataPresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDataPresenter.fecthData();
            }
        });
        findViewById(R.id.type1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDataPresenter.setDataType(1);
            }
        });
        findViewById(R.id.type2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDataPresenter.setDataType(2);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void showData(Object object) {
        textView.setText(object.toString());
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载中", Toast.LENGTH_SHORT).show();
    }
}
