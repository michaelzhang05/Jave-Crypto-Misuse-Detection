package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2466w4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f17883a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2459v4 f17884b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f17885c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17886d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2452u4 f17887e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2466w4(C2452u4 c2452u4, C2459v4 c2459v4, C2459v4 c2459v42, long j8, boolean z8) {
        this.f17883a = c2459v4;
        this.f17884b = c2459v42;
        this.f17885c = j8;
        this.f17886d = z8;
        this.f17887e = c2452u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17887e.N(this.f17883a, this.f17884b, this.f17885c, this.f17886d, null);
    }
}
