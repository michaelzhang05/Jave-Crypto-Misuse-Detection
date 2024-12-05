package org.apache.cordova;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.rjfun.cordova.plugin.nativeaudio.NativeAudio;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.h;
import m5.j;
import m5.k;
import m5.m;
import m5.o;
import m5.q;
import org.apache.cordova.NativeToJsMessageQueue;
import org.apache.cordova.d;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaWebViewImpl implements k {
    public static final String TAG = "CordovaWebViewImpl";

    /* renamed from: a, reason: collision with root package name */
    private e f8302a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.cordova.d f8303b;

    /* renamed from: c, reason: collision with root package name */
    private h f8304c;

    /* renamed from: e, reason: collision with root package name */
    private org.apache.cordova.c f8306e;

    /* renamed from: f, reason: collision with root package name */
    private j f8307f;

    /* renamed from: g, reason: collision with root package name */
    private CoreAndroid f8308g;

    /* renamed from: h, reason: collision with root package name */
    private NativeToJsMessageQueue f8309h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8311j;

    /* renamed from: k, reason: collision with root package name */
    String f8312k;

    /* renamed from: l, reason: collision with root package name */
    private View f8313l;

    /* renamed from: m, reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f8314m;

    /* renamed from: d, reason: collision with root package name */
    private int f8305d = 0;

    /* renamed from: i, reason: collision with root package name */
    private EngineClient f8310i = new EngineClient();

    /* renamed from: n, reason: collision with root package name */
    private Set f8315n = new HashSet();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public class EngineClient implements d.a {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: org.apache.cordova.CordovaWebViewImpl$EngineClient$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0128a implements Runnable {
                RunnableC0128a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    CordovaWebViewImpl.this.f8302a.v("spinner", NativeAudio.STOP);
                }
            }

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(2000L);
                    if (CordovaWebViewImpl.this.f8304c.getActivity() != null) {
                        CordovaWebViewImpl.this.f8304c.getActivity().runOnUiThread(new RunnableC0128a());
                    } else {
                        o.a(CordovaWebViewImpl.TAG, "Cordova activity does not exist.");
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        protected EngineClient() {
        }

        @Override // org.apache.cordova.d.a
        public void clearLoadTimeoutTimer() {
            CordovaWebViewImpl.c(CordovaWebViewImpl.this);
        }

        @Override // org.apache.cordova.d.a
        public Boolean onDispatchKeyEvent(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            boolean z5 = keyCode == 4;
            if (keyEvent.getAction() == 0) {
                if ((!z5 || CordovaWebViewImpl.this.f8313l == null) && !CordovaWebViewImpl.this.f8315n.contains(Integer.valueOf(keyCode))) {
                    if (z5) {
                        return Boolean.valueOf(CordovaWebViewImpl.this.f8303b.canGoBack());
                    }
                }
                return Boolean.TRUE;
            }
            if (keyEvent.getAction() == 1) {
                if (z5 && CordovaWebViewImpl.this.f8313l != null) {
                    CordovaWebViewImpl.this.hideCustomView();
                    return Boolean.TRUE;
                }
                if (CordovaWebViewImpl.this.f8315n.contains(Integer.valueOf(keyCode))) {
                    String str = keyCode != 4 ? keyCode != 82 ? keyCode != 84 ? keyCode != 24 ? keyCode != 25 ? null : "volumedownbutton" : "volumeupbutton" : "searchbutton" : "menubutton" : "backbutton";
                    if (str != null) {
                        CordovaWebViewImpl.this.h(str);
                        return Boolean.TRUE;
                    }
                } else if (z5) {
                    return Boolean.valueOf(CordovaWebViewImpl.this.f8303b.goBack());
                }
            }
            return null;
        }

        @Override // org.apache.cordova.d.a
        public boolean onNavigationAttempt(String str) {
            if (CordovaWebViewImpl.this.f8302a.m(str)) {
                return true;
            }
            if (CordovaWebViewImpl.this.f8302a.z(str)) {
                return false;
            }
            if (CordovaWebViewImpl.this.f8302a.B(str).booleanValue()) {
                CordovaWebViewImpl.this.showWebPage(str, true, false, null);
                return true;
            }
            o.g(CordovaWebViewImpl.TAG, "Blocked (possibly sub-frame) navigation to non-allowed URL: " + str);
            return true;
        }

        @Override // org.apache.cordova.d.a
        public void onPageFinishedLoading(String str) {
            o.a(CordovaWebViewImpl.TAG, "onPageFinished(" + str + ")");
            clearLoadTimeoutTimer();
            CordovaWebViewImpl.this.f8302a.v("onPageFinished", str);
            if (CordovaWebViewImpl.this.f8303b.getView().getVisibility() != 0) {
                new Thread(new a()).start();
            }
            if (str.equals("about:blank")) {
                CordovaWebViewImpl.this.f8302a.v("exit", null);
            }
        }

        @Override // org.apache.cordova.d.a
        public void onPageStarted(String str) {
            o.a(CordovaWebViewImpl.TAG, "onPageDidNavigate(" + str + ")");
            CordovaWebViewImpl.this.f8315n.clear();
            CordovaWebViewImpl.this.f8302a.q();
            CordovaWebViewImpl.this.f8302a.v("onPageStarted", str);
        }

        @Override // org.apache.cordova.d.a
        public void onReceivedError(int i6, String str, String str2) {
            clearLoadTimeoutTimer();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i6);
                jSONObject.put("description", str);
                jSONObject.put("url", str2);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            CordovaWebViewImpl.this.f8302a.v("onReceivedError", jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8319a;

        a(String str) {
            this.f8319a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CordovaWebViewImpl.this.stopLoading();
            o.c(CordovaWebViewImpl.TAG, "CordovaWebView: TIMEOUT ERROR!");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", -6);
                jSONObject.put("description", "The connection to the server was unsuccessful.");
                jSONObject.put("url", this.f8319a);
            } catch (JSONException unused) {
            }
            CordovaWebViewImpl.this.f8302a.v("onReceivedError", jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f8323c;

        b(int i6, int i7, Runnable runnable) {
            this.f8321a = i6;
            this.f8322b = i7;
            this.f8323c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (this) {
                    wait(this.f8321a);
                }
            } catch (InterruptedException e6) {
                e6.printStackTrace();
            }
            if (CordovaWebViewImpl.this.f8305d == this.f8322b && CordovaWebViewImpl.this.f8304c.getActivity() != null) {
                CordovaWebViewImpl.this.f8304c.getActivity().runOnUiThread(this.f8323c);
            } else if (CordovaWebViewImpl.this.f8304c.getActivity() == null) {
                o.a(CordovaWebViewImpl.TAG, "Cordova activity does not exist.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f8326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8328d;

        c(int i6, Runnable runnable, String str, boolean z5) {
            this.f8325a = i6;
            this.f8326b = runnable;
            this.f8327c = str;
            this.f8328d = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8325a > 0) {
                CordovaWebViewImpl.this.f8304c.getThreadPool().execute(this.f8326b);
            }
            CordovaWebViewImpl.this.f8303b.loadUrl(this.f8327c, this.f8328d);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends FrameLayout {

        /* renamed from: a, reason: collision with root package name */
        private final org.apache.cordova.d f8330a;

        public d(Context context, org.apache.cordova.d dVar) {
            super(context);
            this.f8330a = dVar;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean dispatchKeyEvent = this.f8330a.getView().dispatchKeyEvent(keyEvent);
            return !dispatchKeyEvent ? super.dispatchKeyEvent(keyEvent) : dispatchKeyEvent;
        }
    }

    public CordovaWebViewImpl(org.apache.cordova.d dVar) {
        this.f8303b = dVar;
    }

    static /* synthetic */ int c(CordovaWebViewImpl cordovaWebViewImpl) {
        int i6 = cordovaWebViewImpl.f8305d;
        cordovaWebViewImpl.f8305d = i6 + 1;
        return i6;
    }

    public static org.apache.cordova.d createEngine(Context context, j jVar) {
        try {
            return (org.apache.cordova.d) Class.forName(jVar.c("webview", SystemWebViewEngine.class.getCanonicalName())).getConstructor(Context.class, j.class).newInstance(context, jVar);
        } catch (Exception e6) {
            throw new RuntimeException("Failed to create webview. ", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        if (this.f8308g == null) {
            this.f8308g = (CoreAndroid) this.f8302a.f(CoreAndroid.PLUGIN_NAME);
        }
        CoreAndroid coreAndroid = this.f8308g;
        if (coreAndroid == null) {
            o.g(TAG, "Unable to fire event without existing plugin");
        } else {
            coreAndroid.fireJavascriptEvent(str);
        }
    }

    @Override // m5.k
    public boolean backHistory() {
        return this.f8303b.goBack();
    }

    public boolean canGoBack() {
        return this.f8303b.canGoBack();
    }

    @Override // m5.k
    public void clearCache() {
        this.f8303b.clearCache();
    }

    @Override // m5.k
    public void clearHistory() {
        this.f8303b.clearHistory();
    }

    @Override // m5.k
    public Context getContext() {
        return this.f8303b.getView().getContext();
    }

    public m getCookieManager() {
        return this.f8303b.getCookieManager();
    }

    public org.apache.cordova.d getEngine() {
        return this.f8303b;
    }

    @Override // m5.k
    public e getPluginManager() {
        return this.f8302a;
    }

    @Override // m5.k
    public j getPreferences() {
        return this.f8307f;
    }

    @Override // m5.k
    public org.apache.cordova.c getResourceApi() {
        return this.f8306e;
    }

    public String getUrl() {
        return this.f8303b.getUrl();
    }

    @Override // m5.k
    public View getView() {
        return this.f8303b.getView();
    }

    @Override // m5.k
    public void handleDestroy() {
        if (isInitialized()) {
            this.f8305d++;
            this.f8302a.k();
            loadUrl("about:blank");
            this.f8303b.destroy();
            hideCustomView();
        }
    }

    @Override // m5.k
    public void handlePause(boolean z5) {
        if (isInitialized()) {
            this.f8311j = true;
            this.f8302a.n(z5);
            h("pause");
            if (z5) {
                return;
            }
            this.f8303b.setPaused(true);
        }
    }

    @Override // m5.k
    public void handleResume(boolean z5) {
        if (isInitialized()) {
            this.f8303b.setPaused(false);
            this.f8302a.r(z5);
            if (this.f8311j) {
                h("resume");
            }
        }
    }

    @Override // m5.k
    public void handleStart() {
        if (isInitialized()) {
            this.f8302a.t();
        }
    }

    @Override // m5.k
    public void handleStop() {
        if (isInitialized()) {
            this.f8302a.u();
        }
    }

    @Override // m5.k
    @Deprecated
    public void hideCustomView() {
        if (this.f8313l == null) {
            return;
        }
        o.a(TAG, "Hiding Custom View");
        this.f8313l.setVisibility(8);
        ((ViewGroup) this.f8303b.getView().getParent()).removeView(this.f8313l);
        this.f8313l = null;
        this.f8314m.onCustomViewHidden();
        this.f8303b.getView().setVisibility(0);
        this.f8303b.getView().requestFocus();
    }

    public void init(h hVar) {
        init(hVar, new ArrayList(), new j());
    }

    @Override // m5.k
    public boolean isButtonPlumbedToJs(int i6) {
        return this.f8315n.contains(Integer.valueOf(i6));
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return this.f8313l != null;
    }

    public boolean isInitialized() {
        return this.f8304c != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z5) {
        o.a(TAG, ">>> loadUrl(" + str + ")");
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.f8303b.loadUrl(str, false);
            return;
        }
        boolean z6 = z5 || this.f8312k == null;
        if (z6) {
            if (this.f8312k != null) {
                this.f8308g = null;
                this.f8302a.h();
            }
            this.f8312k = str;
        }
        int i6 = this.f8305d;
        int b6 = this.f8307f.b("LoadUrlTimeoutValue", 20000);
        b bVar = new b(b6, i6, new a(str));
        if (this.f8304c.getActivity() != null) {
            this.f8304c.getActivity().runOnUiThread(new c(b6, bVar, str, z6));
        } else {
            o.a(TAG, "Cordova activity does not exist.");
        }
    }

    @Override // m5.k
    public void onNewIntent(Intent intent) {
        e eVar = this.f8302a;
        if (eVar != null) {
            eVar.l(intent);
        }
    }

    @Override // m5.k
    public Object postMessage(String str, Object obj) {
        return this.f8302a.v(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        this.f8309h.b(str);
    }

    @Override // m5.k
    public void sendPluginResult(f fVar, String str) {
        this.f8309h.c(fVar, str);
    }

    @Override // m5.k
    public void setButtonPlumbedToJs(int i6, boolean z5) {
        if (i6 != 4 && i6 != 82 && i6 != 24 && i6 != 25) {
            throw new IllegalArgumentException("Unsupported keycode: " + i6);
        }
        if (z5) {
            this.f8315n.add(Integer.valueOf(i6));
        } else {
            this.f8315n.remove(Integer.valueOf(i6));
        }
    }

    @Override // m5.k
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        o.a(TAG, "showing Custom View");
        if (this.f8313l != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        d dVar = new d(getContext(), this.f8303b);
        dVar.addView(view);
        this.f8313l = dVar;
        this.f8314m = customViewCallback;
        ViewGroup viewGroup = (ViewGroup) this.f8303b.getView().getParent();
        viewGroup.addView(dVar, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8303b.getView().setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup.bringToFront();
    }

    @Override // m5.k
    public void showWebPage(String str, boolean z5, boolean z6, Map<String, Object> map) {
        Intent intent;
        StringBuilder sb;
        String str2;
        o.b(TAG, "showWebPage(%s, %b, %b, HashMap)", str, Boolean.valueOf(z5), Boolean.valueOf(z6));
        if (z6) {
            this.f8303b.clearHistory();
        }
        if (z5) {
            if (this.f8302a.B(str).booleanValue()) {
                Intent intent2 = null;
                try {
                    try {
                        if (str.startsWith("intent://")) {
                            intent = Intent.parseUri(str, 1);
                        } else {
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            try {
                                intent3.addCategory("android.intent.category.BROWSABLE");
                                Uri parse = Uri.parse(str);
                                if ("file".equals(parse.getScheme())) {
                                    intent3.setDataAndType(parse, this.f8306e.f(parse));
                                } else {
                                    intent3.setData(parse);
                                }
                                intent = intent3;
                            } catch (ActivityNotFoundException e6) {
                                e = e6;
                                intent2 = intent3;
                                if (str.startsWith("intent://") && intent2 != null && intent2.getStringExtra("browser_fallback_url") != null) {
                                    showWebPage(intent2.getStringExtra("browser_fallback_url"), z5, z6, map);
                                    return;
                                }
                                o.d(TAG, "Error loading url " + str, e);
                                return;
                            }
                        }
                        if (this.f8304c.getActivity() != null) {
                            this.f8304c.getActivity().startActivity(intent);
                            return;
                        } else {
                            o.a(TAG, "Cordova activity does not exist.");
                            return;
                        }
                    } catch (URISyntaxException e7) {
                        o.d(TAG, "Error parsing url " + str, e7);
                        return;
                    }
                } catch (ActivityNotFoundException e8) {
                    e = e8;
                }
            } else {
                sb = new StringBuilder();
                str2 = "showWebPage: Refusing to send intent for URL since it is not in the <allow-intent> allow list. URL=";
            }
        } else if (this.f8302a.z(str)) {
            loadUrlIntoView(str, true);
            return;
        } else {
            sb = new StringBuilder();
            str2 = "showWebPage: Refusing to load URL into webview since it is not in the <allow-navigation> allow list. URL=";
        }
        sb.append(str2);
        sb.append(str);
        o.g(TAG, sb.toString());
    }

    public void stopLoading() {
        this.f8305d++;
    }

    @Deprecated
    public void clearCache(boolean z5) {
        this.f8303b.clearCache();
    }

    public void init(h hVar, List<q> list, j jVar) {
        if (this.f8304c != null) {
            throw new IllegalStateException();
        }
        this.f8304c = hVar;
        this.f8307f = jVar;
        this.f8302a = new e(this, this.f8304c, list);
        this.f8306e = new org.apache.cordova.c(this.f8303b.getView().getContext(), this.f8302a);
        NativeToJsMessageQueue nativeToJsMessageQueue = new NativeToJsMessageQueue();
        this.f8309h = nativeToJsMessageQueue;
        nativeToJsMessageQueue.a(new NativeToJsMessageQueue.NoOpBridgeMode());
        this.f8309h.a(new NativeToJsMessageQueue.LoadUrlBridgeMode(this.f8303b, hVar));
        if (jVar.a("DisallowOverscroll", false)) {
            this.f8303b.getView().setOverScrollMode(2);
        }
        this.f8303b.init(this, hVar, this.f8310i, this.f8306e, this.f8302a, this.f8309h);
        this.f8302a.b(CoreAndroid.PLUGIN_NAME, "org.apache.cordova.CoreAndroid");
        this.f8302a.h();
    }
}
