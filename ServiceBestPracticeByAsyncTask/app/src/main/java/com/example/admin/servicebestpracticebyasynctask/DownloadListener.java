package com.example.admin.servicebestpracticebyasynctask;

/**
 * Created by admin on 2018/8/31.
 */

public interface DownloadListener {

    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
