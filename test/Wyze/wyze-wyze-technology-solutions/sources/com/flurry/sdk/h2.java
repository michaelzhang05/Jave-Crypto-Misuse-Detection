package com.flurry.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h2 {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9922b;

    public static synchronized void a() {
        synchronized (h2.class) {
            if (a) {
                return;
            }
            try {
                g1.c(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                d1.c(3, "FlurrySDK", "Ads module not available");
            }
            a = true;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (h2.class) {
            g1.d(context);
        }
    }

    public static synchronized void c(List<e.d.a.e> list) {
        synchronized (h2.class) {
            if (f9922b) {
                return;
            }
            if (list != null) {
                Iterator<e.d.a.e> it = list.iterator();
                while (it.hasNext()) {
                    g1.b((h1) it.next());
                }
            }
            f9922b = true;
        }
    }
}
