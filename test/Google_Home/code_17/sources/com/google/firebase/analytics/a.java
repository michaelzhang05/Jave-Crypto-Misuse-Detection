package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077b1;
import java.util.List;
import java.util.Map;
import l0.InterfaceC3290y;

/* loaded from: classes.dex */
final class a implements InterfaceC3290y {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2077b1 f18218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(C2077b1 c2077b1) {
        this.f18218a = c2077b1;
    }

    @Override // l0.InterfaceC3290y
    public final String A() {
        return this.f18218a.E();
    }

    @Override // l0.InterfaceC3290y
    public final String B() {
        return this.f18218a.G();
    }

    @Override // l0.InterfaceC3290y
    public final String a() {
        return this.f18218a.F();
    }

    @Override // l0.InterfaceC3290y
    public final void b(String str, String str2, Bundle bundle) {
        this.f18218a.r(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final int c(String str) {
        return this.f18218a.a(str);
    }

    @Override // l0.InterfaceC3290y
    public final String d() {
        return this.f18218a.H();
    }

    @Override // l0.InterfaceC3290y
    public final void e(Bundle bundle) {
        this.f18218a.k(bundle);
    }

    @Override // l0.InterfaceC3290y
    public final void f(String str) {
        this.f18218a.B(str);
    }

    @Override // l0.InterfaceC3290y
    public final List g(String str, String str2) {
        return this.f18218a.g(str, str2);
    }

    @Override // l0.InterfaceC3290y
    public final void h(String str) {
        this.f18218a.y(str);
    }

    @Override // l0.InterfaceC3290y
    public final Map i(String str, String str2, boolean z8) {
        return this.f18218a.h(str, str2, z8);
    }

    @Override // l0.InterfaceC3290y
    public final void j(String str, String str2, Bundle bundle) {
        this.f18218a.z(str, str2, bundle);
    }

    @Override // l0.InterfaceC3290y
    public final long w() {
        return this.f18218a.b();
    }
}
