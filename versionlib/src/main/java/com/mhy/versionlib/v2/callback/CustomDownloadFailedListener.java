package com.mhy.versionlib.v2.callback;

import android.app.Dialog;
import android.content.Context;

import com.mhy.versionlib.v2.builder.UIData;

/**
 * Created by allenliu on 2018/1/18.
 */

public interface CustomDownloadFailedListener {
    Dialog getCustomDownloadFailed(Context context, UIData versionBundle);

}
