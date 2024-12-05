package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16955a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16956b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16957c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16958d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0, String str, String str2) {
        this.f16958d = appMeasurementDynamiteService;
        this.f16955a = interfaceC2029k0;
        this.f16956b = str;
        this.f16957c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16958d.f16009a.L().T(this.f16955a, this.f16956b, this.f16957c);
    }
}
