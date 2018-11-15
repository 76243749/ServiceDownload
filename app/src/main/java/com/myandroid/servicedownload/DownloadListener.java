package com.myandroid.servicedownload;

/**
 * Created by Huochai on 2018/11/14.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
