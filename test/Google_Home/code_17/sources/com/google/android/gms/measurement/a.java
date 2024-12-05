package com.google.android.gms.measurement;

import Q.AbstractC1400p;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.R2;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final R2 f16929a;

    /* renamed from: b, reason: collision with root package name */
    private final A3 f16930b;

    public a(R2 r22) {
        super();
        AbstractC1400p.l(r22);
        this.f16929a = r22;
        this.f16930b = r22.H();
    }

    @Override // l0.InterfaceC3290y
    public final String A() {
        return this.f16930b.v0();
    }

    @Override // l0.InterfaceC3290y
    public final String B() {
        return this.f16930b.x0();
    }

    @Override // l0.InterfaceC3290y
    public final String a() {
        return this.f16930b.w0();
    }

    @Override // l0.InterfaceC3290y
    public final void b(String str, String str2, Bundle bundle) {
        this.f16929a.H().f0(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final int c(String str) {
        return A3.E(str);
    }

    @Override // l0.InterfaceC3290y
    public final String d() {
        return this.f16930b.v0();
    }

    @Override // l0.InterfaceC3290y
    public final void e(Bundle bundle) {
        this.f16930b.X0(bundle);
    }

    @Override // l0.InterfaceC3290y
    public final void f(String str) {
        this.f16929a.v().D(str, this.f16929a.x().elapsedRealtime());
    }

    @Override // l0.InterfaceC3290y
    public final List g(String str, String str2) {
        return this.f16930b.G(str, str2);
    }

    @Override // l0.InterfaceC3290y
    public final void h(String str) {
        this.f16929a.v().z(str, this.f16929a.x().elapsedRealtime());
    }

    @Override // l0.InterfaceC3290y
    public final Map i(String str, String str2, boolean z8) {
        return this.f16930b.H(str, str2, z8);
    }

    @Override // l0.InterfaceC3290y
    public final void j(String str, String str2, Bundle bundle) {
        this.f16930b.T0(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final long w() {
        return this.f16929a.L().R0();
    }
}
