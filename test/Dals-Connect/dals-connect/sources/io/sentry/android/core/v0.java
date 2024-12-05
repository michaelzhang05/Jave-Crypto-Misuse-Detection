package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.t0;
import io.sentry.c4;
import io.sentry.k1;
import io.sentry.l4;
import io.sentry.n1;
import io.sentry.s4;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultAndroidEventProcessor.java */
/* loaded from: classes2.dex */
public final class v0 implements k1 {

    /* renamed from: f, reason: collision with root package name */
    final Context f18790f;

    /* renamed from: g, reason: collision with root package name */
    private final s0 f18791g;

    /* renamed from: h, reason: collision with root package name */
    private final SentryAndroidOptions f18792h;

    /* renamed from: i, reason: collision with root package name */
    private final Future<w0> f18793i;

    public v0(final Context context, s0 s0Var, final SentryAndroidOptions sentryAndroidOptions) {
        this.f18790f = (Context) io.sentry.util.q.c(context, "The application context is required.");
        this.f18791g = (s0) io.sentry.util.q.c(s0Var, "The BuildInfoProvider is required.");
        this.f18792h = (SentryAndroidOptions) io.sentry.util.q.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f18793i = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w0 p;
                p = w0.p(context, sentryAndroidOptions);
                return p;
            }
        });
        newSingleThreadExecutor.shutdown();
    }

    private void d(c4 c4Var) {
        String str;
        io.sentry.protocol.k c2 = c4Var.C().c();
        try {
            c4Var.C().j(this.f18793i.get().r());
        } catch (Throwable th) {
            this.f18792h.getLogger().b(s4.ERROR, "Failed to retrieve os system", th);
        }
        if (c2 != null) {
            String g2 = c2.g();
            if (g2 == null || g2.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g2.trim().toLowerCase(Locale.ROOT);
            }
            c4Var.C().put(str, c2);
        }
    }

    private void e(c4 c4Var) {
        io.sentry.protocol.a0 Q = c4Var.Q();
        if (Q == null) {
            c4Var.e0(a(this.f18790f));
        } else if (Q.k() == null) {
            Q.n(a1.a(this.f18790f));
        }
    }

    private void f(c4 c4Var, n1 n1Var) {
        io.sentry.protocol.a a = c4Var.C().a();
        if (a == null) {
            a = new io.sentry.protocol.a();
        }
        g(a, n1Var);
        k(c4Var, a);
        c4Var.C().f(a);
    }

    private void g(io.sentry.protocol.a aVar, n1 n1Var) {
        Boolean b2;
        aVar.m(t0.b(this.f18790f, this.f18792h.getLogger()));
        aVar.n(io.sentry.a1.n(q0.e().d()));
        if (io.sentry.util.m.e(n1Var) || aVar.j() != null || (b2 = r0.a().b()) == null) {
            return;
        }
        aVar.p(Boolean.valueOf(!b2.booleanValue()));
    }

    private void h(c4 c4Var, boolean z, boolean z2) {
        e(c4Var);
        i(c4Var, z, z2);
        l(c4Var);
    }

    private void i(c4 c4Var, boolean z, boolean z2) {
        if (c4Var.C().b() == null) {
            try {
                c4Var.C().h(this.f18793i.get().a(z, z2));
            } catch (Throwable th) {
                this.f18792h.getLogger().b(s4.ERROR, "Failed to retrieve device info", th);
            }
            d(c4Var);
        }
    }

    private void j(c4 c4Var, String str) {
        if (c4Var.E() == null) {
            c4Var.T(str);
        }
    }

    private void k(c4 c4Var, io.sentry.protocol.a aVar) {
        PackageInfo i2 = t0.i(this.f18790f, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, this.f18792h.getLogger(), this.f18791g);
        if (i2 != null) {
            j(c4Var, t0.k(i2, this.f18791g));
            t0.q(i2, this.f18791g, aVar);
        }
    }

    private void l(c4 c4Var) {
        try {
            t0.a t = this.f18793i.get().t();
            if (t != null) {
                for (Map.Entry<String, String> entry : t.a().entrySet()) {
                    c4Var.c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f18792h.getLogger().b(s4.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void m(l4 l4Var, n1 n1Var) {
        if (l4Var.s0() != null) {
            boolean e2 = io.sentry.util.m.e(n1Var);
            for (io.sentry.protocol.w wVar : l4Var.s0()) {
                boolean b2 = io.sentry.android.core.internal.util.h.e().b(wVar);
                if (wVar.o() == null) {
                    wVar.r(Boolean.valueOf(b2));
                }
                if (!e2 && wVar.p() == null) {
                    wVar.v(Boolean.valueOf(b2));
                }
            }
        }
    }

    private boolean n(c4 c4Var, n1 n1Var) {
        if (io.sentry.util.m.q(n1Var)) {
            return true;
        }
        this.f18792h.getLogger().c(s4.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", c4Var.G());
        return false;
    }

    public io.sentry.protocol.a0 a(Context context) {
        io.sentry.protocol.a0 a0Var = new io.sentry.protocol.a0();
        a0Var.n(a1.a(context));
        return a0Var;
    }

    @Override // io.sentry.k1
    public l4 b(l4 l4Var, n1 n1Var) {
        boolean n = n(l4Var, n1Var);
        if (n) {
            f(l4Var, n1Var);
            m(l4Var, n1Var);
        }
        h(l4Var, true, n);
        return l4Var;
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.x w(io.sentry.protocol.x xVar, n1 n1Var) {
        boolean n = n(xVar, n1Var);
        if (n) {
            f(xVar, n1Var);
        }
        h(xVar, false, n);
        return xVar;
    }
}
