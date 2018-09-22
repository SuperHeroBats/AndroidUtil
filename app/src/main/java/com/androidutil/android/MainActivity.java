package com.androidutil.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androidutil.android.util.LogUtil;
import com.androidutil.android.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //各种测试Test
        TextView testText = findViewById(R.id.test_text);
        testText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtil.d("测试打印");
                ToastUtil.showShortToast("测试提醒");
            }
        });

    }
}
