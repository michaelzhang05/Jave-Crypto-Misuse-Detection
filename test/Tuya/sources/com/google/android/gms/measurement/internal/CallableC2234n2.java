package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2234n2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16699a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16700b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2234n2(BinderC2249q2 binderC2249q2, String str) {
        this.f16700b = binderC2249q2;
        this.f16699a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16700b.f16751a;
        r4Var.e();
        r4Var2 = this.f16700b.f16751a;
        return r4Var2.V().c0(this.f16699a);
    }
}
