package com.example.libo.redpackets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        init();
        bindEvent();
    }

    private void init() {
        mContext = this;
        linearLayout = (LinearLayout) findViewById(R.id.ll_bottom);
    }

    private void bindEvent() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, OneActivity.class);
                startActivity(intent);
            }
        });
    }

}
