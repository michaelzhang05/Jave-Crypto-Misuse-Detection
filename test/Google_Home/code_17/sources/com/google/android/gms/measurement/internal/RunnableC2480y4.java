package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2480y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17926a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2452u4 f17927b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2480y4(C2452u4 c2452u4, long j8) {
        this.f17926a = j8;
        this.f17927b = c2452u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17927b.l().s(this.f17926a);
        this.f17927b.f17847e = null;
    }
}
