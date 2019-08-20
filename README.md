# version
一行代码更新App 安装
    public void checkUpdata() {
        AllenVersionChecker
                .getInstance()
                .downloadOnly(UIData.create()
                        .setDownloadUrl("http:xxxxxx.japk")//"apk下载地址"
                        .setTitle("版本更新")
                        .setContent("点击下载新版本")
                ).executeMission(SettingActivity.this);


    }
