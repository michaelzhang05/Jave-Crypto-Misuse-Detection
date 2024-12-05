package io.sentry;

import io.sentry.s4;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Breadcrumb.java */
/* loaded from: classes2.dex */
public final class v0 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Date f19293f;

    /* renamed from: g, reason: collision with root package name */
    private String f19294g;

    /* renamed from: h, reason: collision with root package name */
    private String f19295h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f19296i;

    /* renamed from: j, reason: collision with root package name */
    private String f19297j;

    /* renamed from: k, reason: collision with root package name */
    private s4 f19298k;
    private Map<String, Object> l;

    /* compiled from: Breadcrumb.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<v0> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            Date c2 = a1.c();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            s4 s4Var = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c3 = 65535;
                switch (k0.hashCode()) {
                    case 3076010:
                        if (k0.equals("data")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (k0.equals("type")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 50511102:
                        if (k0.equals("category")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 55126294:
                        if (k0.equals("timestamp")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 102865796:
                        if (k0.equals("level")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 954925063:
                        if (k0.equals("message")) {
                            c3 = 5;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        ?? b2 = io.sentry.util.i.b((Map) n2Var.R0());
                        if (b2 == 0) {
                            break;
                        } else {
                            concurrentHashMap = b2;
                            break;
                        }
                    case 1:
                        str2 = n2Var.T0();
                        break;
                    case 2:
                        str3 = n2Var.T0();
                        break;
                    case 3:
                        Date J0 = n2Var.J0(w1Var);
                        if (J0 == null) {
                            break;
                        } else {
                            c2 = J0;
                            break;
                        }
                    case 4:
                        try {
                            s4Var = new s4.a().a(n2Var, w1Var);
                            break;
                        } catch (Exception e2) {
                            w1Var.a(s4.ERROR, e2, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case 5:
                        str = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap2, k0);
                        break;
                }
            }
            v0 v0Var = new v0(c2);
            v0Var.f19294g = str;
            v0Var.f19295h = str2;
            v0Var.f19296i = concurrentHashMap;
            v0Var.f19297j = str3;
            v0Var.f19298k = s4Var;
            v0Var.q(concurrentHashMap2);
            n2Var.D();
            return v0Var;
        }
    }

    public v0(Date date) {
        this.f19296i = new ConcurrentHashMap();
        this.f19293f = date;
    }

    public static v0 r(String str, String str2, String str3, String str4, Map<String, Object> map) {
        v0 v0Var = new v0();
        v0Var.p("user");
        v0Var.l("ui." + str);
        if (str2 != null) {
            v0Var.m("view.id", str2);
        }
        if (str3 != null) {
            v0Var.m("view.class", str3);
        }
        if (str4 != null) {
            v0Var.m("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            v0Var.g().put(entry.getKey(), entry.getValue());
        }
        v0Var.n(s4.INFO);
        return v0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f19293f.getTime() == v0Var.f19293f.getTime() && io.sentry.util.q.a(this.f19294g, v0Var.f19294g) && io.sentry.util.q.a(this.f19295h, v0Var.f19295h) && io.sentry.util.q.a(this.f19297j, v0Var.f19297j) && this.f19298k == v0Var.f19298k;
    }

    public String f() {
        return this.f19297j;
    }

    @ApiStatus.Internal
    public Map<String, Object> g() {
        return this.f19296i;
    }

    public s4 h() {
        return this.f19298k;
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19293f, this.f19294g, this.f19295h, this.f19297j, this.f19298k);
    }

    public String i() {
        return this.f19294g;
    }

    public Date j() {
        return (Date) this.f19293f.clone();
    }

    public String k() {
        return this.f19295h;
    }

    public void l(String str) {
        this.f19297j = str;
    }

    public void m(String str, Object obj) {
        this.f19296i.put(str, obj);
    }

    public void n(s4 s4Var) {
        this.f19298k = s4Var;
    }

    public void o(String str) {
        this.f19294g = str;
    }

    public void p(String str) {
        this.f19295h = str;
    }

    public void q(Map<String, Object> map) {
        this.l = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("timestamp").g(w1Var, this.f19293f);
        if (this.f19294g != null) {
            h3Var.k("message").b(this.f19294g);
        }
        if (this.f19295h != null) {
            h3Var.k("type").b(this.f19295h);
        }
        h3Var.k("data").g(w1Var, this.f19296i);
        if (this.f19297j != null) {
            h3Var.k("category").b(this.f19297j);
        }
        if (this.f19298k != null) {
            h3Var.k("level").g(w1Var, this.f19298k);
        }
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.l.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(v0 v0Var) {
        this.f19296i = new ConcurrentHashMap();
        this.f19293f = v0Var.f19293f;
        this.f19294g = v0Var.f19294g;
        this.f19295h = v0Var.f19295h;
        this.f19297j = v0Var.f19297j;
        Map<String, Object> b2 = io.sentry.util.i.b(v0Var.f19296i);
        if (b2 != null) {
            this.f19296i = b2;
        }
        this.l = io.sentry.util.i.b(v0Var.l);
        this.f19298k = v0Var.f19298k;
    }

    public v0() {
        this(a1.c());
    }
}
