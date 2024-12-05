package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzakw extends zzbbw<zzalf> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f12763c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final zzala f12764d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12765e;

    public zzakw(zzala zzalaVar) {
        this.f12764d = zzalaVar;
    }

    public final void f() {
        synchronized (this.f12763c) {
            if (this.f12765e) {
                return;
            }
            this.f12765e = true;
            d(new v1(this), new zzbbu());
            d(new w1(this), new x1(this));
        }
    }
}
