package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16094b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f16095c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16096d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y2 f16097e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(Y2 y22, String str, String str2, Object obj, long j8) {
        this.f16097e = y22;
        this.f16093a = str;
        this.f16094b = str2;
        this.f16095c = obj;
        this.f16096d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16097e.M(this.f16093a, this.f16094b, this.f16095c, this.f16096d);
    }
}
