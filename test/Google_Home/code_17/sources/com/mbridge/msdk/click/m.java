package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f19223a = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final String f19224d = "m";

    /* renamed from: b, reason: collision with root package name */
    boolean f19225b;

    /* renamed from: c, reason: collision with root package name */
    boolean f19226c;

    /* renamed from: e, reason: collision with root package name */
    private int f19227e;

    /* renamed from: f, reason: collision with root package name */
    private int f19228f;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.c.g f19230h;

    /* renamed from: i, reason: collision with root package name */
    private a f19231i;

    /* renamed from: j, reason: collision with root package name */
    private String f19232j;

    /* renamed from: k, reason: collision with root package name */
    private String f19233k;

    /* renamed from: l, reason: collision with root package name */
    private WebView f19234l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19235m;

    /* renamed from: n, reason: collision with root package name */
    private String f19236n;

    /* renamed from: o, reason: collision with root package name */
    private int f19237o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19239q;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19238p = false;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f19240r = new Runnable() { // from class: com.mbridge.msdk.click.m.4
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f19238p = true;
            m.this.f19237o = 1;
            m.m(m.this);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f19241s = new Runnable() { // from class: com.mbridge.msdk.click.m.5
        @Override // java.lang.Runnable
        public final void run() {
            m.this.f19238p = true;
            m.this.f19237o = 2;
            m.m(m.this);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Handler f19229g = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i8, String str, String str2, String str3);

        void a(String str, boolean z8, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public m() {
        this.f19227e = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
        this.f19228f = PathInterpolatorCompat.MAX_NUM_POINTS;
        com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.f19230h = b8;
        if (b8 == null) {
            com.mbridge.msdk.c.h.a();
            this.f19230h = com.mbridge.msdk.c.i.a();
        }
        this.f19235m = this.f19230h.aI();
        this.f19227e = (int) this.f19230h.aq();
        this.f19228f = (int) this.f19230h.aq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f19229g.removeCallbacks(this.f19241s);
    }

    static /* synthetic */ void e(m mVar) {
        mVar.c();
        mVar.f19229g.postDelayed(mVar.f19241s, mVar.f19227e);
    }

    static /* synthetic */ void l(m mVar) {
        mVar.d();
        mVar.f19229g.postDelayed(mVar.f19240r, mVar.f19228f);
    }

    static /* synthetic */ void m(m mVar) {
        synchronized (f19224d) {
            try {
                try {
                    mVar.b();
                    mVar.f19234l.destroy();
                    a aVar = mVar.f19231i;
                    if (aVar != null) {
                        aVar.a(mVar.f19232j, mVar.f19238p, mVar.f19236n);
                    }
                } catch (Exception e8) {
                    ad.b(f19224d, e8.getMessage());
                } catch (Throwable th) {
                    ad.b(f19224d, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void c(m mVar) {
        synchronized (f19224d) {
            try {
                try {
                    try {
                        mVar.b();
                        a aVar = mVar.f19231i;
                        if (aVar != null) {
                            aVar.a(mVar.f19232j, mVar.f19238p, mVar.f19236n);
                        }
                    } catch (Throwable th) {
                        ad.b(f19224d, th.getMessage());
                    }
                } catch (Exception e8) {
                    ad.b(f19224d, e8.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f19229g.removeCallbacks(this.f19240r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d();
        c();
    }

    public final void a(String str, String str2, Context context, String str3, String str4, a aVar) {
        if (aVar != null) {
            this.f19233k = str4;
            this.f19232j = str3;
            this.f19231i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public final void a(String str, String str2, Context context, String str3, a aVar) {
        if (aVar != null) {
            this.f19232j = str3;
            this.f19231i = aVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f19232j);
        } else {
            this.f19229g.post(new Runnable() { // from class: com.mbridge.msdk.click.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    mVar.a(str, str2, context, mVar.f19232j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f19233k)) {
                this.f19234l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f19228f = 2000;
                this.f19227e = 2000;
                ad.c(f19224d, this.f19233k);
                this.f19234l.loadDataWithBaseURL(str3, this.f19233k, "*/*", "utf-8", str3);
                return;
            }
            if (this.f19235m) {
                HashMap hashMap = new HashMap();
                if (this.f19234l.getUrl() != null) {
                    hashMap.put("Referer", this.f19234l.getUrl());
                }
                this.f19234l.loadUrl(str3, hashMap);
                return;
            }
            this.f19234l.loadUrl(str3);
        } catch (Throwable th) {
            try {
                a aVar = this.f19231i;
                if (aVar != null) {
                    aVar.a(0, this.f19232j, th.getMessage(), this.f19236n);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    private void a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f19234l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f19234l.getSettings().setCacheMode(2);
        this.f19234l.getSettings().setLoadsImagesAutomatically(false);
        this.f19234l.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.click.m.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (m.this.f19239q) {
                        m.this.f19237o = 0;
                        m.c(m.this);
                        return;
                    }
                    m.this.f19226c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        m.this.f19225b = true;
                    }
                    synchronized (m.f19224d) {
                        try {
                            m.this.f19232j = str3;
                            if (m.this.f19231i != null && m.this.f19231i.a(str3)) {
                                m.this.f19239q = true;
                                m.c(m.this);
                            } else {
                                m.e(m.this);
                            }
                        } finally {
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i8, String str3, String str4) {
                synchronized (m.f19224d) {
                    m.this.f19239q = true;
                    m.this.b();
                    m.c(m.this);
                }
                if (m.this.f19231i != null) {
                    m.this.f19231i.a(i8, webView2.getUrl(), str3, m.this.f19236n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        new com.mbridge.msdk.foundation.same.report.i(context).a(str, str2, webView2.getUrl());
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    synchronized (m.f19224d) {
                        m.this.f19239q = true;
                        m.this.b();
                        m.c(m.this);
                    }
                    if (m.this.f19231i != null) {
                        m.this.f19231i.a(-1, webView2.getUrl(), "WebView render process crash.", m.this.f19236n);
                    }
                    if (webView2 != null) {
                        webView2.destroy();
                    }
                    return true;
                } catch (Throwable th) {
                    ad.b(m.f19224d, th.getMessage());
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (m.f19224d) {
                    try {
                        m mVar = m.this;
                        mVar.f19226c = true;
                        mVar.d();
                        if (m.this.f19239q) {
                            m.this.c();
                            m.c(m.this);
                            return true;
                        }
                        m.this.f19232j = str3;
                        if (m.this.f19231i != null && m.this.f19231i.b(str3)) {
                            m.this.f19239q = true;
                            m.this.c();
                            m.c(m.this);
                            return true;
                        }
                        if (m.this.f19235m) {
                            HashMap hashMap = new HashMap();
                            if (m.this.f19234l.getUrl() != null) {
                                hashMap.put("Referer", m.this.f19234l.getUrl());
                            }
                            m.this.f19234l.loadUrl(str3, hashMap);
                        } else {
                            m.this.f19234l.loadUrl(str3);
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        this.f19234l.setWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.click.m.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i8) {
                if (i8 == 100) {
                    try {
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!m.this.f19239q) {
                            m mVar = m.this;
                            if (!mVar.f19226c) {
                                m.l(mVar);
                            }
                        }
                        if (m.this.f19231i != null) {
                            m.this.f19231i.c(webView2.getUrl());
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        });
    }
}
