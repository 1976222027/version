package com.mhy.version;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mhy.versionlib.v2.AllenVersionChecker;
import com.mhy.versionlib.v2.builder.UIData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkUpdata();
    }
    public void checkUpdata() {
        AllenVersionChecker
                .getInstance()
                .downloadOnly(UIData.create()
                        .setDownloadUrl("https//:www.github.com/1976222027/version/app/release/app_release.apk")//"apk下载地址"
                        .setTitle("版本更新")
                        .setContent("点击下载新版本")
                ).executeMission(MainActivity.this);


    }
}
