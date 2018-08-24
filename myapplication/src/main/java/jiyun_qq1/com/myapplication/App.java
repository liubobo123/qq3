package jiyun_qq1.com.myapplication;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by Lenovo on 2018/8/23.
 *
 * @ClassName:App
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
