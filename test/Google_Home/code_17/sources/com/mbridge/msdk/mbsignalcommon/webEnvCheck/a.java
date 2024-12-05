package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.base.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f21623a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f21624b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f21625c;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView != null) {
            try {
                webView.destroy();
                return true;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBWebViewChecker", "destroy webview error", e8);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(final Context context) {
        g gVar;
        try {
            gVar = h.a().a(c.m().k());
        } catch (Exception unused) {
            gVar = null;
        }
        if (gVar != null) {
            f21625c = Boolean.valueOf(gVar.aE());
        } else {
            f21625c = Boolean.FALSE;
        }
        Boolean bool = f21625c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f21623a == null) {
                try {
                    f21623a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    f21623a = Boolean.FALSE;
                }
            }
            if (f21623a == null) {
                f21623a = new Boolean(false);
            }
            return f21623a.booleanValue();
        }
        if (f21623a == null && f21624b == null) {
            f21624b = new Handler(Looper.getMainLooper());
            f21624b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.f21623a == null) {
                        try {
                            Boolean unused3 = a.f21623a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.f21623a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f21623a == null) {
            return true;
        }
        return f21623a.booleanValue();
    }
}
