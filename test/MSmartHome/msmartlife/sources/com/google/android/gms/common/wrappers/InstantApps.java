package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
/* loaded from: classes2.dex */
public class InstantApps {
    private static Context a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f11015b;

    @KeepForSdk
    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = f11015b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f11015b = null;
            if (PlatformVersion.k()) {
                f11015b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f11015b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f11015b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return f11015b.booleanValue();
        }
    }
}
