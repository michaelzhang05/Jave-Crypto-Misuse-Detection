package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2158a2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2173d f16415a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D4 f16416b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16417c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2158a2(BinderC2249q2 binderC2249q2, C2173d c2173d, D4 d42) {
        this.f16417c = binderC2249q2;
        this.f16415a = c2173d;
        this.f16416b = d42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        r4 r4Var3;
        r4Var = this.f16417c.f16751a;
        r4Var.e();
        if (this.f16415a.f16448c.s() == null) {
            r4Var3 = this.f16417c.f16751a;
            r4Var3.t(this.f16415a, this.f16416b);
        } else {
            r4Var2 = this.f16417c.f16751a;
            r4Var2.z(this.f16415a, this.f16416b);
        }
    }
}
