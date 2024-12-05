package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes2.dex */
public class DefaultClock implements Clock {
    private static final DefaultClock a = new DefaultClock();

    private DefaultClock() {
    }

    @KeepForSdk
    public static Clock c() {
        return a;
    }

    @Override // com.google.android.gms.common.util.Clock
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public long nanoTime() {
        return System.nanoTime();
    }
}
