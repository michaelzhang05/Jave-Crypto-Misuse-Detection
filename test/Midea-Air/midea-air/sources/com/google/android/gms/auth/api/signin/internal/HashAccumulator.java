package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public class HashAccumulator {

    @VisibleForTesting
    private static int a = 31;

    /* renamed from: b, reason: collision with root package name */
    private int f10448b = 1;

    @KeepForSdk
    public HashAccumulator a(Object obj) {
        this.f10448b = (a * this.f10448b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int b() {
        return this.f10448b;
    }

    public final HashAccumulator c(boolean z) {
        this.f10448b = (a * this.f10448b) + (z ? 1 : 0);
        return this;
    }
}
