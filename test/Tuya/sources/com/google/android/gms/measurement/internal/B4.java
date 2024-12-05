package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2053n0;

/* loaded from: classes3.dex */
final class B4 implements m0.t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2053n0 f16021a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16022b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2053n0 interfaceC2053n0) {
        this.f16022b = appMeasurementDynamiteService;
        this.f16021a = interfaceC2053n0;
    }

    @Override // m0.t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        try {
            this.f16021a.m(str, str2, bundle, j8);
        } catch (RemoteException e8) {
            Y1 y12 = this.f16022b.f16009a;
            if (y12 != null) {
                y12.d().w().b("Event interceptor threw exception", e8);
            }
        }
    }
}
