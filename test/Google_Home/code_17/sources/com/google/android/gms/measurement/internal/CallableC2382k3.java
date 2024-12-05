package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2382k3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17669a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17670b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17671c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ W2 f17672d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2382k3(W2 w22, String str, String str2, String str3) {
        this.f17669a = str;
        this.f17670b = str2;
        this.f17671c = str3;
        this.f17672d = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17672d.f17393a;
        i52.z0();
        i53 = this.f17672d.f17393a;
        return i53.l0().R(this.f17669a, this.f17670b, this.f17671c);
    }
}
