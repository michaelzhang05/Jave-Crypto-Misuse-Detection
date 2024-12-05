package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2212j2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2270v f16537a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16538b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16539c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2212j2(BinderC2249q2 binderC2249q2, C2270v c2270v, D4 d42) {
        this.f16539c = binderC2249q2;
        this.f16537a = c2270v;
        this.f16538b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16539c.n0(this.f16539c.l(this.f16537a, this.f16538b), this.f16538b);
    }
}
