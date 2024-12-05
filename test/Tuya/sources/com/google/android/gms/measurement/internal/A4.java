package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0) {
        this.f16008b = appMeasurementDynamiteService;
        this.f16007a = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16008b.f16009a.N().E(this.f16007a, this.f16008b.f16009a.n());
    }
}
