package m5;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebChromeClient;
import java.util.Map;

/* loaded from: classes.dex */
public interface k {
    boolean backHistory();

    void clearCache();

    void clearHistory();

    Context getContext();

    org.apache.cordova.e getPluginManager();

    j getPreferences();

    org.apache.cordova.c getResourceApi();

    View getView();

    void handleDestroy();

    void handlePause(boolean z5);

    void handleResume(boolean z5);

    void handleStart();

    void handleStop();

    void hideCustomView();

    boolean isButtonPlumbedToJs(int i6);

    void onNewIntent(Intent intent);

    Object postMessage(String str, Object obj);

    void sendPluginResult(org.apache.cordova.f fVar, String str);

    void setButtonPlumbedToJs(int i6, boolean z5);

    void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void showWebPage(String str, boolean z5, boolean z6, Map map);
}
