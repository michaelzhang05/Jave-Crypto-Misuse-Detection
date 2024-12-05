package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* loaded from: classes2.dex */
public class Wrappers {
    private static Wrappers a = new Wrappers();

    /* renamed from: b, reason: collision with root package name */
    private PackageManagerWrapper f11016b = null;

    @KeepForSdk
    public static PackageManagerWrapper a(Context context) {
        return a.b(context);
    }

    @VisibleForTesting
    private final synchronized PackageManagerWrapper b(Context context) {
        if (this.f11016b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f11016b = new PackageManagerWrapper(context);
        }
        return this.f11016b;
    }
}
