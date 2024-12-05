package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
final class a {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Context f10519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (a.class) {
            if (f10519b != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f10519b = context.getApplicationContext();
            }
        }
    }
}
