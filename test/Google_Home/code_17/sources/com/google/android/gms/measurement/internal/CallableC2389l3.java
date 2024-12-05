package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import l0.C3266a;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2389l3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b6 f17697a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17698b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2389l3(W2 w22, b6 b6Var) {
        this.f17697a = b6Var;
        this.f17698b = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17698b.f17393a;
        i52.z0();
        i53 = this.f17698b.f17393a;
        return new C3266a(i53.d(this.f17697a.f17497a));
    }
}
