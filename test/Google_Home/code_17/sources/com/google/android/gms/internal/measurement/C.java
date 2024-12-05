package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final C2265v1 f16087a;

    /* renamed from: b, reason: collision with root package name */
    private V2 f16088b;

    /* renamed from: c, reason: collision with root package name */
    C2095d f16089c;

    /* renamed from: d, reason: collision with root package name */
    private final C2075b f16090d;

    public C() {
        this(new C2265v1());
    }

    public final C2095d a() {
        return this.f16089c;
    }

    public final void b(C2109e3 c2109e3) {
        AbstractC2192n abstractC2192n;
        try {
            this.f16088b = this.f16087a.f16867b.d();
            if (!(this.f16087a.a(this.f16088b, (C2119f3[]) c2109e3.I().toArray(new C2119f3[0])) instanceof C2174l)) {
                for (C2099d3 c2099d3 : c2109e3.G().I()) {
                    List I8 = c2099d3.I();
                    String H8 = c2099d3.H();
                    Iterator it = I8.iterator();
                    while (it.hasNext()) {
                        InterfaceC2236s a8 = this.f16087a.a(this.f16088b, (C2119f3) it.next());
                        if (a8 instanceof r) {
                            V2 v22 = this.f16088b;
                            if (!v22.g(H8)) {
                                abstractC2192n = null;
                            } else {
                                InterfaceC2236s c8 = v22.c(H8);
                                if (c8 instanceof AbstractC2192n) {
                                    abstractC2192n = (AbstractC2192n) c8;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + H8);
                                }
                            }
                            if (abstractC2192n != null) {
                                abstractC2192n.a(this.f16088b, Collections.singletonList(a8));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + H8);
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
            throw new C2106e0(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f16087a.b(str, callable);
    }

    public final boolean d(C2105e c2105e) {
        try {
            this.f16089c.b(c2105e);
            this.f16087a.f16868c.h("runtime.counter", new C2165k(Double.valueOf(0.0d)));
            this.f16090d.b(this.f16088b.d(), this.f16089c);
            if (!g()) {
                if (!f()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new C2106e0(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC2192n e() {
        return new G8(this.f16090d);
    }

    public final boolean f() {
        if (!this.f16089c.f().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!this.f16089c.d().equals(this.f16089c.a())) {
            return true;
        }
        return false;
    }

    private C(C2265v1 c2265v1) {
        this.f16087a = c2265v1;
        this.f16088b = c2265v1.f16867b.d();
        this.f16089c = new C2095d();
        this.f16090d = new C2075b();
        c2265v1.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.this.e();
            }
        });
        c2265v1.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.F0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new A4(C.this.f16089c);
            }
        });
    }
}
