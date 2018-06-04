package casualc.net.menu.retrofit;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.JsonObject;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.sharedpreferences.Pref;

import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


import casualc.net.menu.BuildIn.MyPref_;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;

@EBean(scope=EBean.Scope.Singleton)
public class ApiCaller {

    @RootContext
    Context context;
    @Pref
    MyPref_ pref;

    String serverUrl;
    long[] timeouts;
    OkHttpClient mClient;
    API services;

}
