package com.google.firebase.crashlytics;

import A0.f;
import C0.b;
import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.r;
import G0.e;
import G0.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k1.InterfaceC3211a;
import m1.C3401a;
import m1.InterfaceC3402b;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final F f18287a = F.a(C0.a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final F f18288b = F.a(b.class, ExecutorService.class);

    static {
        C3401a.a(InterfaceC3402b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC1055e interfaceC1055e) {
        e.a(e.a.ASSERT);
        long currentTimeMillis = System.currentTimeMillis();
        a b8 = a.b((f) interfaceC1055e.a(f.class), (c1.e) interfaceC1055e.a(c1.e.class), interfaceC1055e.i(G0.a.class), interfaceC1055e.i(B0.a.class), interfaceC1055e.i(InterfaceC3211a.class), (ExecutorService) interfaceC1055e.b(this.f18287a), (ExecutorService) interfaceC1055e.b(this.f18288b));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 30) {
            h.f().g("Initializing Crashlytics blocked main for " + currentTimeMillis2 + " ms");
        }
        return b8;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1053c.e(a.class).h("fire-cls").b(r.l(f.class)).b(r.l(c1.e.class)).b(r.k(this.f18287a)).b(r.k(this.f18288b)).b(r.a(G0.a.class)).b(r.a(B0.a.class)).b(r.a(InterfaceC3211a.class)).f(new D0.h() { // from class: F0.f
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                com.google.firebase.crashlytics.a b8;
                b8 = CrashlyticsRegistrar.this.b(interfaceC1055e);
                return b8;
            }
        }).e().d(), j1.h.b("fire-cls", "19.1.0"));
    }
}
