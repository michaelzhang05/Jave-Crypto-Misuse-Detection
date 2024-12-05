package org.apache.cordova.engine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import m5.f;
import m5.h;
import m5.j;
import m5.k;
import m5.m;
import m5.o;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.d;
import org.apache.cordova.e;

/* loaded from: classes.dex */
public class SystemWebViewEngine implements org.apache.cordova.d {
    public static final String TAG = "SystemWebViewEngine";

    /* renamed from: a, reason: collision with root package name */
    protected final SystemWebView f8396a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.cordova.engine.a f8397b;

    /* renamed from: c, reason: collision with root package name */
    protected j f8398c;

    /* renamed from: d, reason: collision with root package name */
    protected f f8399d;

    /* renamed from: e, reason: collision with root package name */
    protected d.a f8400e;

    /* renamed from: f, reason: collision with root package name */
    protected k f8401f;

    /* renamed from: g, reason: collision with root package name */
    protected h f8402g;

    /* renamed from: h, reason: collision with root package name */
    protected e f8403h;

    /* renamed from: i, reason: collision with root package name */
    protected org.apache.cordova.c f8404i;

    /* renamed from: j, reason: collision with root package name */
    protected NativeToJsMessageQueue f8405j;

    /* renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f8406k;

    /* loaded from: classes.dex */
    class a implements NativeToJsMessageQueue.OnlineEventsBridgeMode.c {
        a() {
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode.c
        public void a(Runnable runnable) {
            SystemWebViewEngine.this.f8402g.getActivity().runOnUiThread(runnable);
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.OnlineEventsBridgeMode.c
        public void b(boolean z5) {
            SystemWebView systemWebView = SystemWebViewEngine.this.f8396a;
            if (systemWebView != null) {
                systemWebView.setNetworkAvailable(z5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebSettings f8408a;

        b(WebSettings webSettings) {
            this.f8408a = webSettings;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f8408a.getUserAgentString();
        }
    }

    public SystemWebViewEngine(Context context, j jVar) {
        this(new SystemWebView(context), jVar);
    }

    private void a() {
        try {
            WebView.setWebContentsDebuggingEnabled(true);
        } catch (IllegalArgumentException e6) {
            o.a(TAG, "You have one job! To turn on Remote Web Debugging! YOU HAVE FAILED! ");
            e6.printStackTrace();
        }
    }

    private static void b(WebView webView, f fVar) {
        webView.addJavascriptInterface(new org.apache.cordova.engine.b(fVar), "_cordovaNative");
    }

    private void c() {
        this.f8396a.setInitialScale(0);
        this.f8396a.setVerticalScrollBarEnabled(false);
        WebSettings settings = this.f8396a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        o.a(TAG, "CordovaWebView is running on device made by: " + Build.MANUFACTURER);
        settings.setSaveFormData(false);
        if (this.f8398c.a("AndroidInsecureFileModeEnabled", false)) {
            o.a(TAG, "Enabled insecure file access");
            settings.setAllowFileAccess(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        String path = this.f8396a.getContext().getApplicationContext().getDir("database", 0).getPath();
        settings.setDatabaseEnabled(true);
        if ((this.f8396a.getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            a();
        }
        settings.setGeolocationDatabasePath(path);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        String userAgentString = settings.getUserAgentString();
        String c6 = this.f8398c.c("OverrideUserAgent", null);
        if (c6 != null) {
            settings.setUserAgentString(c6);
        } else {
            String c7 = this.f8398c.c("AppendUserAgent", null);
            if (c7 != null) {
                settings.setUserAgentString(userAgentString + " " + c7);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        if (this.f8406k == null) {
            this.f8406k = new b(settings);
            this.f8396a.getContext().registerReceiver(this.f8406k, intentFilter);
        }
    }

    @Override // org.apache.cordova.d
    public boolean canGoBack() {
        return this.f8396a.canGoBack();
    }

    @Override // org.apache.cordova.d
    public void clearCache() {
        this.f8396a.clearCache(true);
    }

    @Override // org.apache.cordova.d
    public void clearHistory() {
        this.f8396a.clearHistory();
    }

    @Override // org.apache.cordova.d
    public void destroy() {
        this.f8396a.f8393b.a();
        this.f8396a.destroy();
        if (this.f8406k != null) {
            try {
                this.f8396a.getContext().unregisterReceiver(this.f8406k);
            } catch (Exception e6) {
                o.d(TAG, "Error unregistering configuration receiver: " + e6.getMessage(), e6);
            }
        }
    }

    @Override // org.apache.cordova.d
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f8396a.evaluateJavascript(str, valueCallback);
    }

    @Override // org.apache.cordova.d
    public m getCookieManager() {
        return this.f8397b;
    }

    public k getCordovaWebView() {
        return this.f8401f;
    }

    @Override // org.apache.cordova.d
    public String getUrl() {
        return this.f8396a.getUrl();
    }

    @Override // org.apache.cordova.d
    public View getView() {
        return this.f8396a;
    }

    @Override // org.apache.cordova.d
    public boolean goBack() {
        if (!this.f8396a.canGoBack()) {
            return false;
        }
        this.f8396a.goBack();
        return true;
    }

    @Override // org.apache.cordova.d
    public void init(k kVar, h hVar, d.a aVar, org.apache.cordova.c cVar, e eVar, NativeToJsMessageQueue nativeToJsMessageQueue) {
        if (this.f8402g != null) {
            throw new IllegalStateException();
        }
        if (this.f8398c == null) {
            this.f8398c = kVar.getPreferences();
        }
        this.f8401f = kVar;
        this.f8402g = hVar;
        this.f8400e = aVar;
        this.f8404i = cVar;
        this.f8403h = eVar;
        this.f8405j = nativeToJsMessageQueue;
        this.f8396a.a(this, hVar);
        c();
        nativeToJsMessageQueue.a(new NativeToJsMessageQueue.OnlineEventsBridgeMode(new a()));
        nativeToJsMessageQueue.a(new NativeToJsMessageQueue.EvalBridgeMode(this, hVar));
        f fVar = new f(eVar, nativeToJsMessageQueue);
        this.f8399d = fVar;
        b(this.f8396a, fVar);
    }

    @Override // org.apache.cordova.d
    public void loadUrl(String str, boolean z5) {
        this.f8396a.loadUrl(str);
    }

    @Override // org.apache.cordova.d
    public void setPaused(boolean z5) {
        if (z5) {
            this.f8396a.onPause();
            this.f8396a.pauseTimers();
        } else {
            this.f8396a.onResume();
            this.f8396a.resumeTimers();
        }
    }

    public void stopLoading() {
        this.f8396a.stopLoading();
    }

    public SystemWebViewEngine(SystemWebView systemWebView) {
        this(systemWebView, (j) null);
    }

    public SystemWebViewEngine(SystemWebView systemWebView, j jVar) {
        this.f8398c = jVar;
        this.f8396a = systemWebView;
        this.f8397b = new org.apache.cordova.engine.a(systemWebView);
    }
}
