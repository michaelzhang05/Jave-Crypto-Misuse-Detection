package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1978e0 {

    /* renamed from: a, reason: collision with root package name */
    final C2093s1 f15692a;

    /* renamed from: b, reason: collision with root package name */
    T1 f15693b;

    /* renamed from: c, reason: collision with root package name */
    final C1959c f15694c;

    /* renamed from: d, reason: collision with root package name */
    private final G7 f15695d;

    public C1978e0() {
        C2093s1 c2093s1 = new C2093s1();
        this.f15692a = c2093s1;
        this.f15693b = c2093s1.f15886b.a();
        this.f15694c = new C1959c();
        this.f15695d = new G7();
        c2093s1.f15888d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1978e0.this.b();
            }
        });
        c2093s1.f15888d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new W3(C1978e0.this.f15694c);
            }
        });
    }

    public final C1959c a() {
        return this.f15694c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC2028k b() {
        return new C7(this.f15695d);
    }

    public final void c(C2055n2 c2055n2) {
        AbstractC2028k abstractC2028k;
        try {
            this.f15693b = this.f15692a.f15886b.a();
            if (!(this.f15692a.a(this.f15693b, (C2094s2[]) c2055n2.D().toArray(new C2094s2[0])) instanceof C2004h)) {
                for (C2039l2 c2039l2 : c2055n2.B().E()) {
                    List D8 = c2039l2.D();
                    String C8 = c2039l2.C();
                    Iterator it = D8.iterator();
                    while (it.hasNext()) {
                        r a8 = this.f15692a.a(this.f15693b, (C2094s2) it.next());
                        if (a8 instanceof C2060o) {
                            T1 t12 = this.f15693b;
                            if (!t12.h(C8)) {
                                abstractC2028k = null;
                            } else {
                                r d8 = t12.d(C8);
                                if (d8 instanceof AbstractC2028k) {
                                    abstractC2028k = (AbstractC2028k) d8;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(C8)));
                                }
                            }
                            if (abstractC2028k != null) {
                                abstractC2028k.b(this.f15693b, Collections.singletonList(a8));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(C8)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C2148z0(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.f15692a.f15888d.a(str, callable);
    }

    public final boolean e(C1950b c1950b) {
        try {
            this.f15694c.d(c1950b);
            this.f15692a.f15887c.g("runtime.counter", new C2020j(Double.valueOf(0.0d)));
            this.f15695d.b(this.f15693b.a(), this.f15694c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new C2148z0(th);
        }
    }

    public final boolean f() {
        if (!this.f15694c.c().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        C1959c c1959c = this.f15694c;
        if (!c1959c.b().equals(c1959c.a())) {
            return true;
        }
        return false;
    }
}
