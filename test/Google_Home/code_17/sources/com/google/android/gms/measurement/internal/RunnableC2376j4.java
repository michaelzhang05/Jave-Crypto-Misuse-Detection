package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.Z6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2376j4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2472x3 f17656a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17657b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f17658c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f17659d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2472x3 f17660e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ A3 f17661f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2376j4(A3 a32, C2472x3 c2472x3, long j8, long j9, boolean z8, C2472x3 c2472x32) {
        this.f17656a = c2472x3;
        this.f17657b = j8;
        this.f17658c = j9;
        this.f17659d = z8;
        this.f17660e = c2472x32;
        this.f17661f = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17661f.R(this.f17656a);
        if (!Z6.a() || !this.f17661f.a().q(H.f17111c1)) {
            this.f17661f.J(this.f17657b, false);
        }
        A3.V(this.f17661f, this.f17656a, this.f17658c, true, this.f17659d);
        A3.W(this.f17661f, this.f17656a, this.f17660e);
    }
}
