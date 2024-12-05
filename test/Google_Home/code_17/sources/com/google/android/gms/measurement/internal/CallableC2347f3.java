package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2347f3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17568a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17569b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17570c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ W2 f17571d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2347f3(W2 w22, String str, String str2, String str3) {
        this.f17568a = str;
        this.f17569b = str2;
        this.f17570c = str3;
        this.f17571d = w22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        I5 i52;
        I5 i53;
        i52 = this.f17571d.f17393a;
        i52.z0();
        i53 = this.f17571d.f17393a;
        return i53.l0().D0(this.f17568a, this.f17569b, this.f17570c);
    }
}
