package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x4 {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f12373b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f12374c;

    private x4() {
        this.a = new Object();
        this.f12373b = y4.a;
        this.f12374c = 0L;
    }

    public final void a() {
        int i2;
        long a = zzk.zzln().a();
        synchronized (this.a) {
            int i3 = this.f12373b;
            i2 = y4.f12430b;
            if (i3 == i2) {
                if (this.f12374c + ((Long) zzyt.e().c(zzacu.L4)).longValue() <= a) {
                    this.f12373b = y4.a;
                }
            }
        }
        long a2 = zzk.zzln().a();
        synchronized (this.a) {
            if (this.f12373b != 2) {
                return;
            }
            this.f12373b = 3;
            if (this.f12373b == i2) {
                this.f12374c = a2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x4(w4 w4Var) {
        this();
    }
}
