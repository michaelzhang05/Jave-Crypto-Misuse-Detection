package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2397m4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2472x3 f17721a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17722b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f17723c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2472x3 f17724d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f17725e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2397m4(A3 a32, C2472x3 c2472x3, long j8, boolean z8, C2472x3 c2472x32) {
        this.f17721a = c2472x3;
        this.f17722b = j8;
        this.f17723c = z8;
        this.f17724d = c2472x32;
        this.f17725e = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17725e.R(this.f17721a);
        A3.V(this.f17725e, this.f17721a, this.f17722b, false, this.f17723c);
        A3.W(this.f17725e, this.f17721a, this.f17724d);
    }
}
