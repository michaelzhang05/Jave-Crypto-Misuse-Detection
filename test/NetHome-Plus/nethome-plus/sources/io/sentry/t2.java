package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MainEventProcessor.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class t2 implements k1, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final x4 f19237f;

    /* renamed from: g, reason: collision with root package name */
    private final a5 f19238g;

    /* renamed from: h, reason: collision with root package name */
    private final m4 f19239h;

    /* renamed from: i, reason: collision with root package name */
    private volatile o1 f19240i = null;

    public t2(x4 x4Var) {
        x4 x4Var2 = (x4) io.sentry.util.q.c(x4Var, "The SentryOptions is required.");
        this.f19237f = x4Var2;
        z4 z4Var = new z4(x4Var2);
        this.f19239h = new m4(z4Var);
        this.f19238g = new a5(z4Var, x4Var2);
    }

    private void D(c4 c4Var) {
        c0(c4Var);
    }

    private void J(c4 c4Var) {
        ArrayList arrayList = new ArrayList();
        if (this.f19237f.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f19237f.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f19237f.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        io.sentry.protocol.d D = c4Var.D();
        if (D == null) {
            D = new io.sentry.protocol.d();
        }
        if (D.c() == null) {
            D.d(arrayList);
        } else {
            D.c().addAll(arrayList);
        }
        c4Var.S(D);
    }

    private void L(c4 c4Var) {
        if (c4Var.E() == null) {
            c4Var.T(this.f19237f.getDist());
        }
    }

    private void P(c4 c4Var) {
        if (c4Var.F() == null) {
            c4Var.U(this.f19237f.getEnvironment());
        }
    }

    private void T(l4 l4Var) {
        Throwable P = l4Var.P();
        if (P != null) {
            l4Var.x0(this.f19239h.c(P));
        }
    }

    private void Y(l4 l4Var) {
        Map<String, String> a = this.f19237f.getModulesLoader().a();
        if (a == null) {
            return;
        }
        Map<String, String> r0 = l4Var.r0();
        if (r0 == null) {
            l4Var.B0(a);
        } else {
            r0.putAll(a);
        }
    }

    private void a() {
        if (this.f19240i == null) {
            synchronized (this) {
                if (this.f19240i == null) {
                    this.f19240i = o1.c();
                }
            }
        }
    }

    private void c0(c4 c4Var) {
        if (c4Var.I() == null) {
            c4Var.X("java");
        }
    }

    private boolean f(n1 n1Var) {
        return io.sentry.util.m.d(n1Var, io.sentry.hints.f.class);
    }

    private void g0(c4 c4Var) {
        if (c4Var.J() == null) {
            c4Var.Y(this.f19237f.getRelease());
        }
    }

    private void i0(c4 c4Var) {
        if (c4Var.L() == null) {
            c4Var.a0(this.f19237f.getSdkVersion());
        }
    }

    private void k0(c4 c4Var) {
        if (c4Var.M() == null) {
            c4Var.b0(this.f19237f.getServerName());
        }
        if (this.f19237f.isAttachServerName() && c4Var.M() == null) {
            a();
            if (this.f19240i != null) {
                c4Var.b0(this.f19240i.b());
            }
        }
    }

    private void o(c4 c4Var) {
        if (this.f19237f.isSendDefaultPii()) {
            if (c4Var.Q() == null) {
                io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
                a0Var.o("{{auto}}");
                c4Var.e0(a0Var);
            } else if (c4Var.Q().l() == null) {
                c4Var.Q().o("{{auto}}");
            }
        }
    }

    private void q0(c4 c4Var) {
        if (c4Var.N() == null) {
            c4Var.d0(new HashMap(this.f19237f.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f19237f.getTags().entrySet()) {
            if (!c4Var.N().containsKey(entry.getKey())) {
                c4Var.c0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void s0(l4 l4Var, n1 n1Var) {
        if (l4Var.s0() == null) {
            ArrayList arrayList = null;
            List<io.sentry.protocol.p> o0 = l4Var.o0();
            if (o0 != null && !o0.isEmpty()) {
                for (io.sentry.protocol.p pVar : o0) {
                    if (pVar.g() != null && pVar.h() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(pVar.h());
                    }
                }
            }
            if (!this.f19237f.isAttachThreads() && !io.sentry.util.m.d(n1Var, io.sentry.hints.b.class)) {
                if (this.f19237f.isAttachStacktrace()) {
                    if ((o0 == null || o0.isEmpty()) && !f(n1Var)) {
                        l4Var.C0(this.f19238g.a());
                        return;
                    }
                    return;
                }
                return;
            }
            Object c2 = io.sentry.util.m.c(n1Var);
            l4Var.C0(this.f19238g.b(arrayList, c2 instanceof io.sentry.hints.b ? ((io.sentry.hints.b) c2).d() : false));
        }
    }

    private boolean t0(c4 c4Var, n1 n1Var) {
        if (io.sentry.util.m.q(n1Var)) {
            return true;
        }
        this.f19237f.getLogger().c(s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", c4Var.G());
        return false;
    }

    private void z(c4 c4Var) {
        g0(c4Var);
        P(c4Var);
        k0(c4Var);
        L(c4Var);
        i0(c4Var);
        q0(c4Var);
        o(c4Var);
    }

    @Override // io.sentry.k1
    public l4 b(l4 l4Var, n1 n1Var) {
        D(l4Var);
        T(l4Var);
        J(l4Var);
        Y(l4Var);
        if (t0(l4Var, n1Var)) {
            z(l4Var);
            s0(l4Var, n1Var);
        }
        return l4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f19240i != null) {
            this.f19240i.a();
        }
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.x w(io.sentry.protocol.x xVar, n1 n1Var) {
        D(xVar);
        J(xVar);
        if (t0(xVar, n1Var)) {
            z(xVar);
        }
        return xVar;
    }
}
