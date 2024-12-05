package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2029k0;

/* loaded from: classes3.dex */
final class L3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2029k0 f16215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16217c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f16218d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16219e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2029k0 interfaceC2029k0, String str, String str2, boolean z8) {
        this.f16219e = appMeasurementDynamiteService;
        this.f16215a = interfaceC2029k0;
        this.f16216b = str;
        this.f16217c = str2;
        this.f16218d = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16219e.f16009a.L().V(this.f16215a, this.f16216b, this.f16217c, this.f16218d);
    }
}
