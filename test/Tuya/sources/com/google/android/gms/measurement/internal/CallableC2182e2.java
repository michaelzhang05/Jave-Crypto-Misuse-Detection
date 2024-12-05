package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2182e2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16475c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16476d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2182e2(BinderC2249q2 binderC2249q2, String str, String str2, String str3) {
        this.f16476d = binderC2249q2;
        this.f16473a = str;
        this.f16474b = str2;
        this.f16475c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16476d.f16751a;
        r4Var.e();
        r4Var2 = this.f16476d.f16751a;
        return r4Var2.V().a0(this.f16473a, this.f16474b, this.f16475c);
    }
}
