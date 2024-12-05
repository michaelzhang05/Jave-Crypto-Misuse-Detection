package io.sentry.protocol;

import io.sentry.f5;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.e;
import io.sentry.protocol.g;
import io.sentry.protocol.k;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Contexts.java */
/* loaded from: classes2.dex */
public final class c extends ConcurrentHashMap<String, Object> implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Object f19099f = new Object();

    /* compiled from: Contexts.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<c> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(n2 n2Var, w1 w1Var) throws Exception {
            c cVar = new c();
            n2Var.b();
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1335157162:
                        if (k0.equals("device")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -340323263:
                        if (k0.equals("response")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3556:
                        if (k0.equals("os")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 96801:
                        if (k0.equals("app")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 102572:
                        if (k0.equals("gpu")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 110620997:
                        if (k0.equals("trace")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 150940456:
                        if (k0.equals("browser")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1550962648:
                        if (k0.equals("runtime")) {
                            c2 = 7;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        cVar.h(new e.a().a(n2Var, w1Var));
                        break;
                    case 1:
                        cVar.k(new m.a().a(n2Var, w1Var));
                        break;
                    case 2:
                        cVar.j(new k.a().a(n2Var, w1Var));
                        break;
                    case 3:
                        cVar.f(new a.C0267a().a(n2Var, w1Var));
                        break;
                    case 4:
                        cVar.i(new g.a().a(n2Var, w1Var));
                        break;
                    case 5:
                        cVar.m(new f5.a().a(n2Var, w1Var));
                        break;
                    case 6:
                        cVar.g(new b.a().a(n2Var, w1Var));
                        break;
                    case 7:
                        cVar.l(new s.a().a(n2Var, w1Var));
                        break;
                    default:
                        Object R0 = n2Var.R0();
                        if (R0 == null) {
                            break;
                        } else {
                            cVar.put(k0, R0);
                            break;
                        }
                }
            }
            n2Var.D();
            return cVar;
        }
    }

    public c() {
    }

    private <T> T n(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public io.sentry.protocol.a a() {
        return (io.sentry.protocol.a) n("app", io.sentry.protocol.a.class);
    }

    public e b() {
        return (e) n("device", e.class);
    }

    public k c() {
        return (k) n("os", k.class);
    }

    public s d() {
        return (s) n("runtime", s.class);
    }

    public f5 e() {
        return (f5) n("trace", f5.class);
    }

    public void f(io.sentry.protocol.a aVar) {
        put("app", aVar);
    }

    public void g(b bVar) {
        put("browser", bVar);
    }

    public void h(e eVar) {
        put("device", eVar);
    }

    public void i(g gVar) {
        put("gpu", gVar);
    }

    public void j(k kVar) {
        put("os", kVar);
    }

    public void k(m mVar) {
        synchronized (this.f19099f) {
            put("response", mVar);
        }
    }

    public void l(s sVar) {
        put("runtime", sVar);
    }

    public void m(f5 f5Var) {
        io.sentry.util.q.c(f5Var, "traceContext is required");
        put("trace", f5Var);
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                h3Var.k(str).g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public c(c cVar) {
        for (Map.Entry<String, Object> entry : cVar.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    f(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    g(new b((b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof e)) {
                    h(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof k)) {
                    j(new k((k) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof s)) {
                    l(new s((s) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof g)) {
                    i(new g((g) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof f5)) {
                    m(new f5((f5) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof m)) {
                    k(new m((m) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
