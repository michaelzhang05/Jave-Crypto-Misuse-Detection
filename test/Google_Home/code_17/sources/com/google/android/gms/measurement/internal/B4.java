package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f16981a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f16982b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2452u4 f16983c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B4(C2452u4 c2452u4, C2459v4 c2459v4, long j8) {
        this.f16981a = c2459v4;
        this.f16982b = j8;
        this.f16983c = c2452u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16983c.O(this.f16981a, false, this.f16982b);
        C2452u4 c2452u4 = this.f16983c;
        c2452u4.f17847e = null;
        c2452u4.q().J(null);
    }
}
