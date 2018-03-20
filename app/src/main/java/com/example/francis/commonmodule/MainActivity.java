package com.example.francis.commonmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ioc_annotation.BindView;
import com.example.ioc_api.ViewInjector;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_common)
    TextView tvCommon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewInjector.injectView(this);

        tvCommon.setText("hello");
    }
}
