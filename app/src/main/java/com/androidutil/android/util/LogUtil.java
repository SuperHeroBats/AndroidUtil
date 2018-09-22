package com.androidutil.android.util;

import android.util.Log;

public class LogUtil {

    /*
    打印日志工具Log

    平常一样使用LogUtil打印工具
    可以通过level控制打印的日志 例如level等于WARN就可以打印Warn以上级别的日志
     */

    private static final String TAG = "LogUtil";
    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;

    private static int level = VERBOSE;   //开发阶段为VERBOSE打印所有日志 上线阶段为NOTHING屏蔽所有日志

    public static void v(String msg) {
        if (level <= VERBOSE) {
            Log.v(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (level <= DEBUG) {
            Log.d(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (level <= INFO) {
            Log.i(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (level <= WARN) {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (level <= ERROR) {
            Log.e(TAG, msg);
        }
    }

}
