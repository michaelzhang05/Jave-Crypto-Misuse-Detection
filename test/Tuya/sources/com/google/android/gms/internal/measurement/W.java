package com.google.android.gms.internal.measurement;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15592a;

    static {
        f15592a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
