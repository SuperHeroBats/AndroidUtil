package com.androidutil.android.util;

import android.widget.Toast;

public class ToastUtil {

    //提醒工具Toast
    private static Toast mToast;

    public static void showShortToast(String content) {
        if (mToast == null) {
            mToast = Toast.makeText(MyApplication.getContext(), content, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(content);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

}
