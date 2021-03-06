package com.aiton.administrator.shane_library.shane.utils;

import android.util.Log;

public class AppLog {
	public static boolean DEBUG = true;
	public static String TAG = "xyw";

	public static void v(String info) {
		v(TAG, info);
	}

	public static void d(String info) {
		d(TAG, info);
	}

	public static void i(String info) {
		i(TAG, info);
	}

	public static void w(String info) {
		w(TAG, info);
	}

	public static void e(String info) {
		e(TAG, info);
	}

	public static void v(String tag, String info) {
		Log(0, tag, info);
	}

	public static void d(String tag, String info) {
		Log(1, tag, info);
	}

	public static void i(String tag, String info) {
		Log(2, tag, info);
	}

	public static void w(String tag, String info) {
		Log(3, tag, info);
	}

	public static void e(String tag, String info) {
		Log(4, tag, info);
	}

	/**
	 * 分等级打印日志
	 * 
	 * @param infoType
	 *            日志等级：0-4依次严重
	 * @param tag
	 * @param info
	 * @return void
	 */
	private static void Log(int infoType, String tag, String info) {
		if (DEBUG) {
			switch (infoType) {
			case 0:
				Log.v(tag, info);
				break;
			case 1:
				Log.d(tag, info);
				break;
			case 2:
				Log.i(tag, info);
				break;
			case 3:
				Log.w(tag, info);
				break;
			case 4:
				Log.e(tag, info);
				break;
			default:
				break;
			}
		}
	}
}
