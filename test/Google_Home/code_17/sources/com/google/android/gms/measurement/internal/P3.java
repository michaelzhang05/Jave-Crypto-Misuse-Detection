package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
final class P3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.b f17285a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f17286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P3(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.f17285a = bVar;
        this.f17286b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17286b.f16967a.H().n0(this.f17285a);
    }
}
