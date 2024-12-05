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
    private static String f21233a = "a";

    /* renamed from: b, reason: collision with root package name */
    private int f21234b;

    /* renamed from: d, reason: collision with root package name */
    private String f21236d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21237e;

    /* renamed from: f, reason: collision with root package name */
    private BaseTrackingListener f21238f;

    /* renamed from: g, reason: collision with root package name */
    private BrowserView f21239g;

    /* renamed from: h, reason: collision with root package name */
    private CampaignEx f21240h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.click.a f21241i;

    /* renamed from: j, reason: collision with root package name */
    private Context f21242j;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f21244l;

    /* renamed from: o, reason: collision with root package name */
    private long f21247o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21235c = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21245m = false;

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f21246n = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.1
        @Override // java.lang.Runnable
        public final void run() {
            ad.b(a.f21233a, "webview js！超时上限：" + a.this.f21234b + "ms");
            if (a.this.f21241i != null && a.this.f21244l != null) {
                a.this.f21244l.setSuccess(false);
                a.this.f21244l.setUrl(a.this.f21236d);
                a.this.f21244l.setType(2);
                a.this.f21244l.setExceptionMsg("linktype 8 time out");
                a.this.f21241i.a(a.this.f21244l, a.this.f21240h, 1, false);
            }
            a aVar = a.this;
            if (aVar.d(null, aVar.f21236d) && !a.this.f21245m) {
                a.this.f21245m = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f21242j, a.this.f21236d, a.this.f21240h);
            }
            if (a.this.f21238f != null) {
                a.this.f21238f.onFinishRedirection(a.this.f21240h, a.this.f21236d);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private Handler f21243k = new Handler(Looper.getMainLooper());

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f21234b = 10000;
        this.f21244l = null;
        this.f21242j = context;
        this.f21240h = campaignEx;
        this.f21239g = browserView;
        this.f21238f = baseTrackingListener;
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        this.f21241i = aVar;
        this.f21244l = new JumpLoaderResult();
        this.f21234b = (int) b8.aq();
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
                            if (this.f21242j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th) {
                        ad.b(f21233a, th.getMessage());
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
                        ad.b(f21233a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f21242j, str)) {
                    ad.b(f21233a, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            ad.b(f21233a, th3.getMessage());
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
                        if (!TextUtils.isEmpty(str2) && this.f21242j.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.setFlags(268435456);
                            this.f21242j.startActivity(parseUri);
                            this.f21245m = true;
                            return true;
                        }
                    } catch (Throwable th) {
                        ad.b(f21233a, th.getMessage());
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
                        ad.b(f21233a, th2.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f21242j, str)) {
                    ad.b(f21233a, "openDeepLink");
                    this.f21245m = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th3) {
            ad.b(f21233a, th3.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void c(WebView webView, final String str) {
        ad.b(f21233a, "onPageFinished1  " + str);
        if (this.f21235c) {
            this.f21247o = 0L;
            this.f21235c = false;
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f21238f != null) {
                        a.this.f21238f.onFinishRedirection(a.this.f21240h, str);
                    }
                    if (a.this.f21241i != null && a.this.f21244l != null) {
                        a.this.f21244l.setSuccess(true);
                        a.this.f21244l.setUrl(str);
                        a.this.f21244l.setType(2);
                        a.this.f21241i.a(a.this.f21244l, a.this.f21240h, 1, true);
                    }
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri parse = Uri.parse(str);
            if ((parse.getScheme().equals("http") || parse.getScheme().equals("https")) && !this.f21245m) {
                this.f21245m = true;
                a(this.f21242j, str, this.f21240h);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final boolean b(WebView webView, final String str) {
        ad.b(f21233a, "shouldOverrideUrlLoading1  " + str);
        this.f21235c = false;
        if (ah.a.b(str) && ah.a.a(this.f21242j, str, null)) {
            this.f21245m = true;
        }
        boolean e8 = e(webView, str);
        if (e8) {
            this.f21247o = 0L;
            this.f21235c = false;
            c();
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.f21241i != null && a.this.f21244l != null) {
                        a.this.f21244l.setSuccess(true);
                        a.this.f21244l.setUrl(str);
                        a.this.f21244l.setType(2);
                        a.this.f21241i.a(a.this.f21244l, a.this.f21240h, 1, true);
                    }
                    if (a.this.f21238f != null) {
                        a.this.f21238f.onFinishRedirection(a.this.f21240h, str);
                    }
                }
            });
        }
        return e8;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str) {
        if (this.f21247o == 0) {
            this.f21247o = System.currentTimeMillis();
            if (!this.f21237e) {
                this.f21237e = true;
                d();
            }
        }
        this.f21236d = str;
        this.f21235c = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f21247o == 0) {
            this.f21247o = System.currentTimeMillis();
            if (!this.f21237e) {
                this.f21237e = true;
                d();
            }
            this.f21245m = false;
        }
        this.f21236d = str;
        this.f21235c = true;
    }

    private void c() {
        this.f21243k.removeCallbacks(this.f21246n);
    }

    private void d() {
        this.f21243k.postDelayed(this.f21246n, this.f21234b);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
    public final void a(WebView webView, int i8, final String str, final String str2) {
        ad.d(f21233a, str);
        c();
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.f21238f != null) {
                    a.this.f21238f.onFinishRedirection(a.this.f21240h, str2);
                }
                if (a.this.f21241i != null && a.this.f21244l != null) {
                    a.this.f21244l.setSuccess(false);
                    a.this.f21244l.setUrl(str2);
                    a.this.f21244l.setType(2);
                    a.this.f21244l.setExceptionMsg(str);
                    a.this.f21241i.a(a.this.f21244l, a.this.f21240h, 1, true);
                }
            }
        });
        if (!d(webView, str2) || this.f21245m) {
            return;
        }
        this.f21245m = true;
        a(this.f21242j, str2, this.f21240h);
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
            int i8 = MBCommonActivity.f18922d;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b.f21256a.put(str, this.f21239g);
            if (ah.a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            ad.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            ah.a(context, str, this.f21238f, campaignEx, new ArrayList());
        }
    }
}
