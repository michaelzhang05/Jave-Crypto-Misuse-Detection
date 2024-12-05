package org.apache.cordova;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import m5.h;
import m5.k;
import m5.m;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public interface a {
        void clearLoadTimeoutTimer();

        Boolean onDispatchKeyEvent(KeyEvent keyEvent);

        boolean onNavigationAttempt(String str);

        void onPageFinishedLoading(String str);

        void onPageStarted(String str);

        void onReceivedError(int i6, String str, String str2);
    }

    boolean canGoBack();

    void clearCache();

    void clearHistory();

    void destroy();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    m getCookieManager();

    String getUrl();

    View getView();

    boolean goBack();

    void init(k kVar, h hVar, a aVar, c cVar, e eVar, NativeToJsMessageQueue nativeToJsMessageQueue);

    void loadUrl(String str, boolean z5);

    void setPaused(boolean z5);
}
