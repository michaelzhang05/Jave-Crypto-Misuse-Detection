package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f21156a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (u.class) {
            try {
                if (f21156a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    f21156a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().c().getSystemService("connectivity");
                }
            } catch (Exception e8) {
                ad.b("NetManager", e8.getMessage());
            }
            connectivityManager = f21156a;
        }
        return connectivityManager;
    }
}
