package com.google.firebase.crashlytics;

import E0.d;
import E0.f;
import H0.AbstractC1176j;
import H0.C1168b;
import H0.C1173g;
import H0.C1177k;
import H0.C1182p;
import H0.C1187v;
import H0.x;
import H0.z;
import a1.InterfaceC1554e;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Task;
import i1.k;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import r0.InterfaceC3671b;
import r0.l;
import y0.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C1182p f17252a;

    /* renamed from: com.google.firebase.crashlytics.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0378a implements InterfaceC3671b {
        C0378a() {
        }

        @Override // r0.InterfaceC3671b
        public Object a(Task task) {
            if (!task.n()) {
                f.f().e("Error fetching settings.", task.i());
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17253a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1182p f17254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ O0.f f17255c;

        b(boolean z8, C1182p c1182p, O0.f fVar) {
            this.f17253a = z8;
            this.f17254b = c1182p;
            this.f17255c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (this.f17253a) {
                this.f17254b.g(this.f17255c);
                return null;
            }
            return null;
        }
    }

    private a(C1182p c1182p) {
        this.f17252a = c1182p;
    }

    public static a a() {
        a aVar = (a) e.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(e eVar, InterfaceC1554e interfaceC1554e, k kVar, Z0.a aVar, Z0.a aVar2) {
        Context k8 = eVar.k();
        String packageName = k8.getPackageName();
        f.f().g("Initializing Firebase Crashlytics " + C1182p.i() + " for " + packageName);
        M0.f fVar = new M0.f(k8);
        C1187v c1187v = new C1187v(eVar);
        z zVar = new z(k8, packageName, interfaceC1554e, c1187v);
        d dVar = new d(aVar);
        D0.d dVar2 = new D0.d(aVar2);
        ExecutorService c8 = x.c("Crashlytics Exception Handler");
        C1177k c1177k = new C1177k(c1187v);
        kVar.c(c1177k);
        C1182p c1182p = new C1182p(eVar, zVar, dVar, c1187v, dVar2.e(), dVar2.d(), fVar, c8, c1177k);
        String c9 = eVar.n().c();
        String o8 = AbstractC1176j.o(k8);
        List<C1173g> l8 = AbstractC1176j.l(k8);
        f.f().b("Mapping file ID is: " + o8);
        for (C1173g c1173g : l8) {
            f.f().b(String.format("Build id for %s on %s: %s", c1173g.c(), c1173g.a(), c1173g.b()));
        }
        try {
            C1168b a8 = C1168b.a(k8, zVar, c9, o8, l8, new E0.e(k8));
            f.f().i("Installer package name is: " + a8.f3282d);
            ExecutorService c10 = x.c("com.google.firebase.crashlytics.startup");
            O0.f l9 = O0.f.l(k8, c9, zVar, new L0.b(), a8.f3284f, a8.f3285g, fVar, c1187v);
            l9.p(c10).f(c10, new C0378a());
            l.c(c10, new b(c1182p.n(a8, l9), c1182p, l9));
            return new a(c1182p);
        } catch (PackageManager.NameNotFoundException e8) {
            f.f().e("Error retrieving app package info.", e8);
            return null;
        }
    }

    public void c(boolean z8) {
        this.f17252a.o(Boolean.valueOf(z8));
    }
}
