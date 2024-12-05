package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class a implements BrowserView.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f20178a = "a";

    /* renamed from: b, reason: collision with root package name */
    private int f20179b;

    /* renamed from: d, reason: collision with root package name */
    private String f20181d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20182e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f20183f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f20184g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f20185h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f20186i;

    /* renamed from: j, reason: collision with root package name */
    private Context f20187j;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f20189l;

    /* renamed from: o, reason: collision with root package name */
    private long f20192o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20180c = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20190m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f20191n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.f20178a, "webview js！超时上限：" + a.this.f20179b + "ms");
            if (a.this.f20186i != null && a.this.f20189l != null) {
                a.this.f20189l.setSuccess(false);
                a.this.f20189l.setUrl(a.this.f20181d);
                a.this.f20189l.setType(2);
                a.this.f20189l.setExceptionMsg("linktype 8 time out");
                a.this.f20186i.a(a.this.f20189l, a.this.f20185h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f20181d) && !a.this.f20190m) {
                a.this.f20190m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f20187j, a.this.f20181d, a.this.f20185h);
            }
            if (a.this.f20183f != null) {
                a.this.f20183f.onFinishRedirection(a.this.f20185h, a.this.f20181d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f20188k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f20179b = 10000;
        this.f20189l = null;
        this.f20187j = context;
        this.f20185h = campaignEx;
        this.f20184g = browserView;
        this.f20183f = baseTrackingListener;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        this.f20186i = aVar;
        this.f20189l = new JumpLoaderResult();
        this.f20179b = (int) b8.aq();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f20187j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f20178a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http")) {
                                if (!parse2.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th2) {
                        ad.b(f20178a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f20187j, str)) {
                    ad.b(f20178a, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            ad.b(f20178a, th3.getMessage());
            return true;
        }
    }

    private boolean e(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f20187j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            this.f20187j.startActivity(parseUri);
                            this.f20190m = true;
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b(f20178a, th.getMessage());
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        ad.b(f20178a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f20187j, str)) {
                    ad.b(f20178a, "openDeepLink");
                    this.f20190m = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b(f20178a, th3.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        ad.b(f20178a, "onPageFinished1  " + str);
        if (this.f20180c) {
            this.f20192o = 0L;
            this.f20180c = false;
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f20183f != null) {
                        a.this.f20183f.onFinishRedirection(a.this.f20185h, str);
                    }
                    if (a.this.f20186i != null && a.this.f20189l != null) {
                        a.this.f20189l.setSuccess(true);
                        a.this.f20189l.setUrl(str);
                        a.this.f20189l.setType(2);
                        a.this.f20186i.a(a.this.f20189l, a.this.f20185h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if ((parse.getScheme().equals("http") || parse.getScheme().equals("https")) && !this.f20190m) {
                this.f20190m = true;
                a(this.f20187j, str, this.f20185h);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        ad.b(f20178a, "shouldOverrideUrlLoading1  " + str);
        this.f20180c = false;
        if (ah.a.b(str) && ah.a.a(this.f20187j, str, null)) {
            this.f20190m = true;
        }
        boolean e8 = e(webView, str);
        if (e8) {
            this.f20192o = 0L;
            this.f20180c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f20186i != null && a.this.f20189l != null) {
                        a.this.f20189l.setSuccess(true);
                        a.this.f20189l.setUrl(str);
                        a.this.f20189l.setType(2);
                        a.this.f20186i.a(a.this.f20189l, a.this.f20185h, 1, true);
                    }
                    if (a.this.f20183f != null) {
                        a.this.f20183f.onFinishRedirection(a.this.f20185h, str);
                    }
                }
            });
        }
        return e8;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f20192o == 0) {
            this.f20192o = System.currentTimeMillis();
            if (!this.f20182e) {
                this.f20182e = true;
                d();
            }
        }
        this.f20181d = str;
        this.f20180c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f20192o == 0) {
            this.f20192o = System.currentTimeMillis();
            if (!this.f20182e) {
                this.f20182e = true;
                d();
            }
            this.f20190m = false;
        }
        this.f20181d = str;
        this.f20180c = true;
    }

    private void c() {
        this.f20188k.removeCallbacks(this.f20191n);
    }

    private void d() {
        this.f20188k.postDelayed(this.f20191n, this.f20179b);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i8, final String str, final String str2) {
        ad.d(f20178a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f20183f != null) {
                    a.this.f20183f.onFinishRedirection(a.this.f20185h, str2);
                }
                if (a.this.f20186i != null && a.this.f20189l != null) {
                    a.this.f20189l.setSuccess(false);
                    a.this.f20189l.setUrl(str2);
                    a.this.f20189l.setType(2);
                    a.this.f20189l.setExceptionMsg(str);
                    a.this.f20186i.a(a.this.f20189l, a.this.f20185h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.f20190m) {
            return;
        }
        this.f20190m = true;
        a(this.f20187j, str2, this.f20185h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i8 = MBCommonActivity.f17867d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f20201a.put(str, this.f20184g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f20183f, campaignEx, new ArrayList());
        }
    }
}
