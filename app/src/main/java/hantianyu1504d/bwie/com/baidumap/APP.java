package hantianyu1504d.bwie.com.baidumap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * 类描述：
 * 创建人：韩天宇
 * 班级：移动通信1504D
 * 创建时间：2017/7/15 9:42
 */
public class APP extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());

    }
}
