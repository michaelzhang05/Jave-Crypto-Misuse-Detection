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
    private static volatile Boolean f20568a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f20569b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f20570c;

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
            f20570c = Boolean.valueOf(gVar.aE());
        } else {
            f20570c = Boolean.FALSE;
        }
        Boolean bool = f20570c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f20568a == null) {
                try {
                    f20568a = Boolean.valueOf(c(context));
                } catch (Exception unused2) {
                    f20568a = Boolean.FALSE;
                }
            }
            if (f20568a == null) {
                f20568a = new Boolean(false);
            }
            return f20568a.booleanValue();
        }
        if (f20568a == null && f20569b == null) {
            f20569b = new Handler(Looper.getMainLooper());
            f20569b.post(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.f20568a == null) {
                        try {
                            Boolean unused3 = a.f20568a = Boolean.valueOf(a.c(context));
                        } catch (Exception unused4) {
                            Boolean unused5 = a.f20568a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f20568a == null) {
            return true;
        }
        return f20568a.booleanValue();
    }
}
