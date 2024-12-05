package com.google.firebase.crashlytics;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.h;
import B0.r;
import a1.InterfaceC1554e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import i1.k;
import j1.C3047a;
import j1.InterfaceC3048b;
import java.util.Arrays;
import java.util.List;
import y0.e;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        C3047a.f32719a.a(InterfaceC3048b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC1064e interfaceC1064e) {
        return a.b((e) interfaceC1064e.a(e.class), (InterfaceC1554e) interfaceC1064e.a(InterfaceC1554e.class), (k) interfaceC1064e.a(k.class), interfaceC1064e.i(E0.a.class), interfaceC1064e.i(InterfaceC4011a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1062c.e(a.class).h("fire-cls").b(r.k(e.class)).b(r.k(InterfaceC1554e.class)).b(r.k(k.class)).b(r.a(E0.a.class)).b(r.a(InterfaceC4011a.class)).f(new h() { // from class: D0.f
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                com.google.firebase.crashlytics.a b8;
                b8 = CrashlyticsRegistrar.this.b(interfaceC1064e);
                return b8;
            }
        }).e().d(), h1.h.b("fire-cls", "18.4.1"));
    }
}
