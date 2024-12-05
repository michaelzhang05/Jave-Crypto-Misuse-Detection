package com.google.firebase.crashlytics;

import A0.f;
import G0.d;
import G0.h;
import G0.m;
import J0.A;
import J0.AbstractC1275j;
import J0.C1267b;
import J0.C1272g;
import J0.C1279n;
import J0.C1283s;
import J0.C1289y;
import J0.D;
import N0.b;
import O0.g;
import android.content.Context;
import android.content.pm.PackageManager;
import b1.InterfaceC1955a;
import c1.e;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m1.C3401a;
import q0.InterfaceC3818b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C1283s f18289a;

    /* renamed from: com.google.firebase.crashlytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0373a implements InterfaceC3818b {
        C0373a() {
        }

        @Override // q0.InterfaceC3818b
        public Object a(Task task) {
            if (!task.n()) {
                h.f().e("Error fetching settings.", task.i());
                return null;
            }
            return null;
        }
    }

    private a(C1283s c1283s) {
        this.f18289a = c1283s;
    }

    public static a a() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(f fVar, e eVar, InterfaceC1955a interfaceC1955a, InterfaceC1955a interfaceC1955a2, InterfaceC1955a interfaceC1955a3, ExecutorService executorService, ExecutorService executorService2) {
        Context k8 = fVar.k();
        String packageName = k8.getPackageName();
        h.f().g("Initializing Firebase Crashlytics " + C1283s.i() + " for " + packageName);
        g gVar = new g(k8);
        C1289y c1289y = new C1289y(fVar);
        D d8 = new D(k8, packageName, eVar, c1289y);
        d dVar = new d(interfaceC1955a);
        F0.d dVar2 = new F0.d(interfaceC1955a2);
        ExecutorService d9 = A.d("Crashlytics Exception Handler");
        C1279n c1279n = new C1279n(c1289y, gVar);
        C3401a.e(c1279n);
        C1283s c1283s = new C1283s(fVar, d8, dVar, c1289y, dVar2.e(), dVar2.d(), gVar, d9, c1279n, new m(interfaceC1955a3));
        String c8 = fVar.n().c();
        String m8 = AbstractC1275j.m(k8);
        List<C1272g> j8 = AbstractC1275j.j(k8);
        h.f().b("Mapping file ID is: " + m8);
        for (C1272g c1272g : j8) {
            h.f().b(String.format("Build id for %s on %s: %s", c1272g.c(), c1272g.a(), c1272g.b()));
        }
        try {
            C1267b a8 = C1267b.a(k8, d8, c8, m8, j8, new G0.g(k8));
            h.f().i("Installer package name is: " + a8.f4658d);
            Executor c9 = A.c(executorService);
            Q0.f l8 = Q0.f.l(k8, c8, d8, new b(), a8.f4660f, a8.f4661g, gVar, c1289y);
            l8.p(c9).f(c9, new C0373a());
            if (c1283s.n(a8, l8)) {
                c1283s.g(l8);
            }
            return new a(c1283s);
        } catch (PackageManager.NameNotFoundException e8) {
            h.f().e("Error retrieving app package info.", e8);
            return null;
        }
    }

    public void c(boolean z8) {
        this.f18289a.o(Boolean.valueOf(z8));
    }
}
