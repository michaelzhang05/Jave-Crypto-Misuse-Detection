package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2218k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2270v f16634a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16635b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2218k2(BinderC2249q2 binderC2249q2, C2270v c2270v, String str) {
        this.f16636c = binderC2249q2;
        this.f16634a = c2270v;
        this.f16635b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16636c.f16751a;
        r4Var.e();
        r4Var2 = this.f16636c.f16751a;
        r4Var2.k(this.f16634a, this.f16635b);
    }
}
