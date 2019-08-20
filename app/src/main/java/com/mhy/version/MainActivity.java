package com.mhy.version;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mhy.version.v1.V1Activity;
import com.mhy.version.v2.V2Activity;
import com.mhy.versionlib.v2.AllenVersionChecker;
import com.mhy.versionlib.v2.builder.UIData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkUpdata() {
        AllenVersionChecker
                .getInstance()
                .downloadOnly(UIData.create()
                        .setDownloadUrl("http://test-1251233192.coscd.myqcloud.com/1_1.apk")//"apk下载地址"
                        .setTitle("版本更新")
                        .setContent("点击下载新版本")
                ).executeMission(MainActivity.this);


    }
    public void mainOnClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_v0:
                checkUpdata();
                break;
                case R.id.btn_v1:
                intent = new Intent(this, V1Activity.class);
                startActivity(intent);

                break;
            case R.id.btn_v2:
                intent = new Intent(this, V2Activity.class);
                startActivity(intent);

                break;
        }
    }
}
