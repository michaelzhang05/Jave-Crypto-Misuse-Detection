package com.getcapacitor.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import java.util.List;
import java.util.Map;
import m5.h;
import m5.j;
import m5.k;
import m5.m;
import m5.q;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.c;
import org.apache.cordova.d;
import org.apache.cordova.e;
import org.apache.cordova.f;

/* loaded from: classes.dex */
public class MockCordovaWebViewImpl implements k {

    /* renamed from: a, reason: collision with root package name */
    private Context f4345a;

    /* renamed from: b, reason: collision with root package name */
    private e f4346b;

    /* renamed from: c, reason: collision with root package name */
    private j f4347c;

    /* renamed from: d, reason: collision with root package name */
    private c f4348d;

    /* renamed from: e, reason: collision with root package name */
    private NativeToJsMessageQueue f4349e;

    /* renamed from: f, reason: collision with root package name */
    private h f4350f;

    /* renamed from: g, reason: collision with root package name */
    private a f4351g;

    /* renamed from: h, reason: collision with root package name */
    private WebView f4352h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4353i;

    /* loaded from: classes.dex */
    public static class CapacitorEvalBridgeMode extends NativeToJsMessageQueue.a {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f4354a;

        /* renamed from: b, reason: collision with root package name */
        private final h f4355b;

        public CapacitorEvalBridgeMode(WebView webView, h hVar) {
            this.f4354a = webView;
            this.f4355b = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(NativeToJsMessageQueue nativeToJsMessageQueue) {
            String j6 = nativeToJsMessageQueue.j();
            if (j6 != null) {
                this.f4354a.evaluateJavascript(j6, null);
            }
        }

        @Override // org.apache.cordova.NativeToJsMessageQueue.a
        public void onNativeToJsMessageAvailable(final NativeToJsMessageQueue nativeToJsMessageQueue) {
            this.f4355b.getActivity().runOnUiThread(new Runnable() { // from class: y0.c
                @Override // java.lang.Runnable
                public final void run() {
                    MockCordovaWebViewImpl.CapacitorEvalBridgeMode.this.b(nativeToJsMessageQueue);
                }
            });
        }
    }

    public MockCordovaWebViewImpl(Context context) {
        this.f4345a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, ValueCallback valueCallback) {
        this.f4352h.evaluateJavascript(str, valueCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(String str) {
    }

    @Override // m5.k
    public boolean backHistory() {
        return false;
    }

    public boolean canGoBack() {
        return false;
    }

    @Override // m5.k
    public void clearCache() {
    }

    @Override // m5.k
    public void clearHistory() {
    }

    public void eval(final String str, final ValueCallback<String> valueCallback) {
        new Handler(this.f4345a.getMainLooper()).post(new Runnable() { // from class: y0.a
            @Override // java.lang.Runnable
            public final void run() {
                MockCordovaWebViewImpl.this.c(str, valueCallback);
            }
        });
    }

    @Override // m5.k
    public Context getContext() {
        return this.f4352h.getContext();
    }

    public m getCookieManager() {
        return this.f4351g;
    }

    public d getEngine() {
        return null;
    }

    @Override // m5.k
    public e getPluginManager() {
        return this.f4346b;
    }

    @Override // m5.k
    public j getPreferences() {
        return this.f4347c;
    }

    @Override // m5.k
    public c getResourceApi() {
        return this.f4348d;
    }

    public String getUrl() {
        return this.f4352h.getUrl();
    }

    @Override // m5.k
    public View getView() {
        return this.f4352h;
    }

    @Override // m5.k
    public void handleDestroy() {
        if (isInitialized()) {
            this.f4346b.k();
        }
    }

    @Override // m5.k
    public void handlePause(boolean z5) {
        if (isInitialized()) {
            this.f4353i = true;
            this.f4346b.n(z5);
            triggerDocumentEvent("pause");
            if (z5) {
                return;
            }
            setPaused(true);
        }
    }

    @Override // m5.k
    public void handleResume(boolean z5) {
        if (isInitialized()) {
            setPaused(false);
            this.f4346b.r(z5);
            if (this.f4353i) {
                triggerDocumentEvent("resume");
            }
        }
    }

    @Override // m5.k
    public void handleStart() {
        if (isInitialized()) {
            this.f4346b.t();
        }
    }

    @Override // m5.k
    public void handleStop() {
        if (isInitialized()) {
            this.f4346b.u();
        }
    }

    @Override // m5.k
    @Deprecated
    public void hideCustomView() {
    }

    public void init(h hVar, List<q> list, j jVar) {
        this.f4350f = hVar;
        this.f4347c = jVar;
        this.f4346b = new e(this, this.f4350f, list);
        this.f4348d = new c(this.f4345a, this.f4346b);
        this.f4346b.h();
    }

    @Override // m5.k
    public boolean isButtonPlumbedToJs(int i6) {
        return false;
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return false;
    }

    public boolean isInitialized() {
        return this.f4350f != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z5) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.f4352h.loadUrl(str);
        }
    }

    @Override // m5.k
    public void onNewIntent(Intent intent) {
        e eVar = this.f4346b;
        if (eVar != null) {
            eVar.l(intent);
        }
    }

    @Override // m5.k
    public Object postMessage(String str, Object obj) {
        return this.f4346b.v(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        this.f4349e.b(str);
    }

    @Override // m5.k
    public void sendPluginResult(f fVar, String str) {
        this.f4349e.c(fVar, str);
    }

    @Override // m5.k
    public void setButtonPlumbedToJs(int i6, boolean z5) {
    }

    public void setPaused(boolean z5) {
        if (z5) {
            this.f4352h.onPause();
            this.f4352h.pauseTimers();
        } else {
            this.f4352h.onResume();
            this.f4352h.resumeTimers();
        }
    }

    @Override // m5.k
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // m5.k
    public void showWebPage(String str, boolean z5, boolean z6, Map<String, Object> map) {
    }

    public void stopLoading() {
    }

    public void triggerDocumentEvent(String str) {
        eval("window.Capacitor.triggerEvent('" + str + "', 'document');", new ValueCallback() { // from class: y0.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                MockCordovaWebViewImpl.d((String) obj);
            }
        });
    }

    @Deprecated
    public void clearCache(boolean z5) {
    }

    public void init(h hVar, List<q> list, j jVar, WebView webView) {
        this.f4350f = hVar;
        this.f4352h = webView;
        this.f4347c = jVar;
        this.f4346b = new e(this, this.f4350f, list);
        this.f4348d = new c(this.f4345a, this.f4346b);
        NativeToJsMessageQueue nativeToJsMessageQueue = new NativeToJsMessageQueue();
        this.f4349e = nativeToJsMessageQueue;
        nativeToJsMessageQueue.a(new CapacitorEvalBridgeMode(webView, this.f4350f));
        this.f4349e.l(0);
        this.f4351g = new a(webView);
        this.f4346b.h();
    }
}
