package com.example.libo.redpackets;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by libo on 16/7/12.
 */
public class TwoActivity extends Activity {

    private Context mContext;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);
        mContext = this;
        imageView = (ImageView)findViewById(R.id.share_friend_iv_two);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}
