//package com.foxy.foxy_sdk.foxynativemodules.payment;
//
//import com.facebook.react.ReactPackage;
//import com.facebook.react.bridge.NativeModule;
//import com.facebook.react.bridge.ReactApplicationContext;
//import com.facebook.react.uimanager.ViewManager;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import javax.annotation.Nonnull;
//
//public class PayuPaymentPackageHandler implements ReactPackage {
//    @Nonnull
//    @Override
//    public List<NativeModule> createNativeModules(@Nonnull ReactApplicationContext reactContext) {
//        List<NativeModule> nativeModules = new ArrayList<NativeModule>();
//        nativeModules.add(new PayuPayment(reactContext));
//        nativeModules.add(new UpiIntentLauncher(reactContext));
//        return nativeModules;
//    }
//
//    @Nonnull
//    @Override
//    public List<ViewManager> createViewManagers(@Nonnull ReactApplicationContext reactContext) {
//        return Collections.emptyList();
//    }
//}
