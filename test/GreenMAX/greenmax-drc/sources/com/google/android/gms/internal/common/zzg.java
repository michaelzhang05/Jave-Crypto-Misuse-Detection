package com.google.android.gms.internal.common;

import android.os.Build;

/* loaded from: classes2.dex */
public final class zzg {
    private static volatile boolean a = !a();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
