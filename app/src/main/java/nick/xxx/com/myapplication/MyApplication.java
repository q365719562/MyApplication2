package nick.xxx.com.myapplication;

import android.app.Application;

import nick.xxx.com.myapplication.manager.ApatchManager;

/**
 * Created by Nick on 2017/9/5.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        initApatch();
    }
    private void initApatch(){
        ApatchManager.getInstance().init(this);
    }
}
