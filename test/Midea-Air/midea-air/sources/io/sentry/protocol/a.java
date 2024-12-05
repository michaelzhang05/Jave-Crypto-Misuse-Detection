package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: App.java */
/* loaded from: classes2.dex */
public final class a implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19081f;

    /* renamed from: g, reason: collision with root package name */
    private Date f19082g;

    /* renamed from: h, reason: collision with root package name */
    private String f19083h;

    /* renamed from: i, reason: collision with root package name */
    private String f19084i;

    /* renamed from: j, reason: collision with root package name */
    private String f19085j;

    /* renamed from: k, reason: collision with root package name */
    private String f19086k;
    private String l;
    private Map<String, String> m;
    private List<String> n;
    private Boolean o;
    private Map<String, Object> p;

    /* compiled from: App.java */
    /* renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0267a implements l2<a> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1898053579:
                        if (k0.equals("device_app_hash")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1524619986:
                        if (k0.equals("view_names")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -901870406:
                        if (k0.equals("app_version")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -650544995:
                        if (k0.equals("in_foreground")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -470395285:
                        if (k0.equals("build_type")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 746297735:
                        if (k0.equals("app_identifier")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 791585128:
                        if (k0.equals("app_start_time")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1133704324:
                        if (k0.equals("permissions")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1167648233:
                        if (k0.equals("app_name")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 1826866896:
                        if (k0.equals("app_build")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        aVar.f19083h = n2Var.T0();
                        break;
                    case 1:
                        List<String> list = (List) n2Var.R0();
                        if (list == null) {
                            break;
                        } else {
                            aVar.s(list);
                            break;
                        }
                    case 2:
                        aVar.f19086k = n2Var.T0();
                        break;
                    case 3:
                        aVar.o = n2Var.I0();
                        break;
                    case 4:
                        aVar.f19084i = n2Var.T0();
                        break;
                    case 5:
                        aVar.f19081f = n2Var.T0();
                        break;
                    case 6:
                        aVar.f19082g = n2Var.J0(w1Var);
                        break;
                    case 7:
                        aVar.m = io.sentry.util.i.b((Map) n2Var.R0());
                        break;
                    case '\b':
                        aVar.f19085j = n2Var.T0();
                        break;
                    case '\t':
                        aVar.l = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            aVar.r(concurrentHashMap);
            n2Var.D();
            return aVar;
        }
    }

    public a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.q.a(this.f19081f, aVar.f19081f) && io.sentry.util.q.a(this.f19082g, aVar.f19082g) && io.sentry.util.q.a(this.f19083h, aVar.f19083h) && io.sentry.util.q.a(this.f19084i, aVar.f19084i) && io.sentry.util.q.a(this.f19085j, aVar.f19085j) && io.sentry.util.q.a(this.f19086k, aVar.f19086k) && io.sentry.util.q.a(this.l, aVar.l) && io.sentry.util.q.a(this.m, aVar.m) && io.sentry.util.q.a(this.o, aVar.o) && io.sentry.util.q.a(this.n, aVar.n);
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19081f, this.f19082g, this.f19083h, this.f19084i, this.f19085j, this.f19086k, this.l, this.m, this.o, this.n);
    }

    public Boolean j() {
        return this.o;
    }

    public void k(String str) {
        this.l = str;
    }

    public void l(String str) {
        this.f19081f = str;
    }

    public void m(String str) {
        this.f19085j = str;
    }

    public void n(Date date) {
        this.f19082g = date;
    }

    public void o(String str) {
        this.f19086k = str;
    }

    public void p(Boolean bool) {
        this.o = bool;
    }

    public void q(Map<String, String> map) {
        this.m = map;
    }

    public void r(Map<String, Object> map) {
        this.p = map;
    }

    public void s(List<String> list) {
        this.n = list;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19081f != null) {
            h3Var.k("app_identifier").b(this.f19081f);
        }
        if (this.f19082g != null) {
            h3Var.k("app_start_time").g(w1Var, this.f19082g);
        }
        if (this.f19083h != null) {
            h3Var.k("device_app_hash").b(this.f19083h);
        }
        if (this.f19084i != null) {
            h3Var.k("build_type").b(this.f19084i);
        }
        if (this.f19085j != null) {
            h3Var.k("app_name").b(this.f19085j);
        }
        if (this.f19086k != null) {
            h3Var.k("app_version").b(this.f19086k);
        }
        if (this.l != null) {
            h3Var.k("app_build").b(this.l);
        }
        Map<String, String> map = this.m;
        if (map != null && !map.isEmpty()) {
            h3Var.k("permissions").g(w1Var, this.m);
        }
        if (this.o != null) {
            h3Var.k("in_foreground").h(this.o);
        }
        if (this.n != null) {
            h3Var.k("view_names").g(w1Var, this.n);
        }
        Map<String, Object> map2 = this.p;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                h3Var.k(str).g(w1Var, this.p.get(str));
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(a aVar) {
        this.l = aVar.l;
        this.f19081f = aVar.f19081f;
        this.f19085j = aVar.f19085j;
        this.f19082g = aVar.f19082g;
        this.f19086k = aVar.f19086k;
        this.f19084i = aVar.f19084i;
        this.f19083h = aVar.f19083h;
        this.m = io.sentry.util.i.b(aVar.m);
        this.o = aVar.o;
        this.n = io.sentry.util.i.a(aVar.n);
        this.p = io.sentry.util.i.b(aVar.p);
    }
}
