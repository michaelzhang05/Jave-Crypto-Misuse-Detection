package com.google.android.gms.measurement;

import Q.AbstractC1400p;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import l0.InterfaceC3290y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3290y f16931a;

    public c(InterfaceC3290y interfaceC3290y) {
        super();
        AbstractC1400p.l(interfaceC3290y);
        this.f16931a = interfaceC3290y;
    }

    @Override // l0.InterfaceC3290y
    public final String A() {
        return this.f16931a.A();
    }

    @Override // l0.InterfaceC3290y
    public final String B() {
        return this.f16931a.B();
    }

    @Override // l0.InterfaceC3290y
    public final String a() {
        return this.f16931a.a();
    }

    @Override // l0.InterfaceC3290y
    public final void b(String str, String str2, Bundle bundle) {
        this.f16931a.b(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final int c(String str) {
        return this.f16931a.c(str);
    }

    @Override // l0.InterfaceC3290y
    public final String d() {
        return this.f16931a.d();
    }

    @Override // l0.InterfaceC3290y
    public final void e(Bundle bundle) {
        this.f16931a.e(bundle);
    }

    @Override // l0.InterfaceC3290y
    public final void f(String str) {
        this.f16931a.f(str);
    }

    @Override // l0.InterfaceC3290y
    public final List g(String str, String str2) {
        return this.f16931a.g(str, str2);
    }

    @Override // l0.InterfaceC3290y
    public final void h(String str) {
        this.f16931a.h(str);
    }

    @Override // l0.InterfaceC3290y
    public final Map i(String str, String str2, boolean z8) {
        return this.f16931a.i(str, str2, z8);
    }

    @Override // l0.InterfaceC3290y
    public final void j(String str, String str2, Bundle bundle) {
        this.f16931a.j(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final long w() {
        return this.f16931a.w();
    }
}
