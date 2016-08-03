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
public class OneActivity extends Activity {

    private Context mContext;
    private ImageView shareFriendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_one);
        mContext = this;
        shareFriendBtn = (ImageView)findViewById(R.id.share_friend_iv);
        shareFriendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, TwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
