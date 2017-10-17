package com.nativedemo;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Admin on 2017/7/20.
 */

public class ReactNativeModule extends ReactContextBaseJavaModule {
    public ReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        //对应 NativeModules.XXXX
        return "XXXX";
    }

    @ReactMethod//对应 NativeModules.XXXX.getMessage
    public void getMessage(String myMsg, Promise promise) {
        String msg = "我接收到的myMsg:" + myMsg;
        promise.resolve(msg);
    }

}
