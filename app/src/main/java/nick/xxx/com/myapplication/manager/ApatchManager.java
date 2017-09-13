package nick.xxx.com.myapplication.manager;

import android.content.Context;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by Nick on 2017/9/12.
 */

public class ApatchManager {


    private static ApatchManager mInstance = null;

    private static PatchManager mPatchManager = null;
    private ApatchManager(){}



    public static ApatchManager getInstance(){
        if (mInstance ==null){
            synchronized (ApatchManager.class){
                if (mInstance ==null){
                    mInstance = new ApatchManager();
                }
            }
        }
        return mInstance;
    }

    public void init(Context context){
        mPatchManager = new PatchManager(context);
        mPatchManager.init("version_name");
        mPatchManager.loadPatch();
    }

    public void addPatch(String path){
        try {
            mPatchManager.addPatch(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
