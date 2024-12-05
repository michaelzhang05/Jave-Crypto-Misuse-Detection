package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2430r3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17787a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ W2 f17788b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2430r3(W2 w22, String str) {
        this.f17787a = str;
        this.f17788b = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17788b.f17393a;
        i52.z0();
        i53 = this.f17788b.f17393a;
        return i53.l0().X0(this.f17787a);
    }
}
