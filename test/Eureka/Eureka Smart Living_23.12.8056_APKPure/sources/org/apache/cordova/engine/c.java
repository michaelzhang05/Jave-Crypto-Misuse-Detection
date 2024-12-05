package org.apache.cordova.engine;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;
import m5.g;
import m5.o;

/* loaded from: classes.dex */
public class c extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private long f8413a = 104857600;

    /* renamed from: b, reason: collision with root package name */
    protected final SystemWebViewEngine f8414b;

    /* renamed from: c, reason: collision with root package name */
    private View f8415c;

    /* renamed from: d, reason: collision with root package name */
    private g f8416d;

    /* renamed from: e, reason: collision with root package name */
    private Context f8417e;

    /* loaded from: classes.dex */
    class a implements g.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsResult f8418a;

        a(JsResult jsResult) {
            this.f8418a = jsResult;
        }

        @Override // m5.g.j
        public void a(boolean z5, String str) {
            if (z5) {
                this.f8418a.confirm();
            } else {
                this.f8418a.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements g.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsResult f8420a;

        b(JsResult jsResult) {
            this.f8420a = jsResult;
        }

        @Override // m5.g.j
        public void a(boolean z5, String str) {
            if (z5) {
                this.f8420a.confirm();
            } else {
                this.f8420a.cancel();
            }
        }
    }

    /* renamed from: org.apache.cordova.engine.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0129c implements g.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsPromptResult f8422a;

        C0129c(JsPromptResult jsPromptResult) {
            this.f8422a = jsPromptResult;
        }

        @Override // m5.g.j
        public void a(boolean z5, String str) {
            if (z5) {
                this.f8422a.confirm(str);
            } else {
                this.f8422a.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends org.apache.cordova.b {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueCallback f8424c;

        d(ValueCallback valueCallback) {
            this.f8424c = valueCallback;
        }

        @Override // org.apache.cordova.b
        public void onActivityResult(int i6, int i7, Intent intent) {
            Uri[] uriArr;
            if (i7 == -1 && intent != null) {
                if (intent.getClipData() != null) {
                    int itemCount = intent.getClipData().getItemCount();
                    uriArr = new Uri[itemCount];
                    for (int i8 = 0; i8 < itemCount; i8++) {
                        uriArr[i8] = intent.getClipData().getItemAt(i8).getUri();
                        o.a("SystemWebChromeClient", "Receive file chooser URL: " + uriArr[i8]);
                    }
                } else if (intent.getData() != null) {
                    uriArr = WebChromeClient.FileChooserParams.parseResult(i7, intent);
                    o.a("SystemWebChromeClient", "Receive file chooser URL: " + uriArr);
                }
                this.f8424c.onReceiveValue(uriArr);
            }
            uriArr = null;
            this.f8424c.onReceiveValue(uriArr);
        }
    }

    public c(SystemWebViewEngine systemWebViewEngine) {
        this.f8414b = systemWebViewEngine;
        Context context = systemWebViewEngine.f8396a.getContext();
        this.f8417e = context;
        this.f8416d = new g(context);
    }

    public void a() {
        this.f8416d.a();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        if (this.f8415c == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8414b.getView().getContext());
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            View progressBar = new ProgressBar(this.f8414b.getView().getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            progressBar.setLayoutParams(layoutParams2);
            linearLayout.addView(progressBar);
            this.f8415c = linearLayout;
        }
        return this.f8415c;
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j6, long j7, long j8, WebStorage.QuotaUpdater quotaUpdater) {
        o.b("SystemWebChromeClient", "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", Long.valueOf(j7), Long.valueOf(j6), Long.valueOf(j8));
        quotaUpdater.updateQuota(this.f8413a);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
        org.apache.cordova.b f6 = this.f8414b.f8403h.f("Geolocation");
        if (f6 == null || f6.hasPermisssion()) {
            return;
        }
        f6.requestPermissions(0);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.f8414b.getCordovaWebView().hideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        this.f8416d.b(str2, new a(jsResult));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.f8416d.c(str2, new b(jsResult));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String f6 = this.f8414b.f8399d.f(str, str2, str3);
        if (f6 != null) {
            jsPromptResult.confirm(f6);
            return true;
        }
        this.f8416d.d(str2, str3, new C0129c(jsPromptResult));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        o.a("SystemWebChromeClient", "onPermissionRequest: " + Arrays.toString(permissionRequest.getResources()));
        permissionRequest.grant(permissionRequest.getResources());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f8414b.getCordovaWebView().showCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Boolean bool = Boolean.FALSE;
        if (fileChooserParams.getMode() == 1) {
            bool = Boolean.TRUE;
        }
        Intent createIntent = fileChooserParams.createIntent();
        createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bool);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes.length > 1) {
            createIntent.setType("*/*");
            createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
        }
        try {
            this.f8414b.f8402g.startActivityForResult(new d(valueCallback), createIntent, 5173);
        } catch (ActivityNotFoundException e6) {
            o.i("No activity found to handle file chooser intent.", e6);
            valueCallback.onReceiveValue(null);
        }
        return true;
    }
}
