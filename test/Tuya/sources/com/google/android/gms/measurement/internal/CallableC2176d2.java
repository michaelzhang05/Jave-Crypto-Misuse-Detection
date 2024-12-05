package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2176d2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16459a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16460b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16461c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16462d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2176d2(BinderC2249q2 binderC2249q2, String str, String str2, String str3) {
        this.f16462d = binderC2249q2;
        this.f16459a = str;
        this.f16460b = str2;
        this.f16461c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r4 r4Var;
        r4 r4Var2;
        r4Var = this.f16462d.f16751a;
        r4Var.e();
        r4Var2 = this.f16462d.f16751a;
        return r4Var2.V().d0(this.f16459a, this.f16460b, this.f16461c);
    }
}
