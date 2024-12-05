package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2225l3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16662a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2270v f16663b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16664c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16665d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2225l3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0, C2270v c2270v, String str) {
        this.f16665d = appMeasurementDynamiteService;
        this.f16662a = interfaceC2029k0;
        this.f16663b = c2270v;
        this.f16664c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16665d.f16009a.L().p(this.f16662a, this.f16663b, this.f16664c);
    }
}
