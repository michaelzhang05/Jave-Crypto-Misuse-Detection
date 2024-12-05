package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class N2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16233b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0) {
        this.f16233b = appMeasurementDynamiteService;
        this.f16232a = interfaceC2029k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16233b.f16009a.L().R(this.f16232a);
    }
}
