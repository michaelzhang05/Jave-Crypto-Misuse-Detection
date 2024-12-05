package g3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import t3.a0;
import t3.c0;
import t3.i0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final c0.b f6735a;

    private o(c0.b bVar) {
        this.f6735a = bVar;
    }

    private synchronized c0.c c(t3.y yVar, i0 i0Var) {
        int g6;
        g6 = g();
        if (i0Var == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (c0.c) c0.c.e0().r(yVar).s(g6).u(t3.z.ENABLED).t(i0Var).i();
    }

    private synchronized boolean e(int i6) {
        Iterator it = this.f6735a.u().iterator();
        while (it.hasNext()) {
            if (((c0.c) it.next()).a0() == i6) {
                return true;
            }
        }
        return false;
    }

    private synchronized c0.c f(a0 a0Var) {
        return c(x.k(a0Var), a0Var.Z());
    }

    private synchronized int g() {
        int c6;
        do {
            c6 = o3.t.c();
        } while (e(c6));
        return c6;
    }

    public static o i() {
        return new o(c0.d0());
    }

    public static o j(n nVar) {
        return new o((c0.b) nVar.h().T());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    public synchronized int b(a0 a0Var, boolean z5) {
        c0.c f6;
        f6 = f(a0Var);
        this.f6735a.r(f6);
        if (z5) {
            this.f6735a.v(f6.a0());
        }
        return f6.a0();
    }

    public synchronized n d() {
        return n.e((c0) this.f6735a.i());
    }

    public synchronized o h(int i6) {
        for (int i7 = 0; i7 < this.f6735a.t(); i7++) {
            c0.c s5 = this.f6735a.s(i7);
            if (s5.a0() == i6) {
                if (!s5.c0().equals(t3.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i6);
                }
                this.f6735a.v(i6);
            }
        }
        throw new GeneralSecurityException("key not found: " + i6);
        return this;
    }
}
