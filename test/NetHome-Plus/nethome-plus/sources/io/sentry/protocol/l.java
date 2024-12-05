package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class l implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19144f;

    /* renamed from: g, reason: collision with root package name */
    private String f19145g;

    /* renamed from: h, reason: collision with root package name */
    private String f19146h;

    /* renamed from: i, reason: collision with root package name */
    private Object f19147i;

    /* renamed from: j, reason: collision with root package name */
    private String f19148j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f19149k;
    private Map<String, String> l;
    private Long m;
    private Map<String, String> n;
    private String o;
    private String p;
    private Map<String, Object> q;

    /* compiled from: Request.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<l> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            l lVar = new l();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1650269616:
                        if (k0.equals("fragment")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1077554975:
                        if (k0.equals("method")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 100589:
                        if (k0.equals("env")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 116079:
                        if (k0.equals("url")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3076010:
                        if (k0.equals("data")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 106069776:
                        if (k0.equals("other")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 795307910:
                        if (k0.equals("headers")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 952189583:
                        if (k0.equals("cookies")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (k0.equals("body_size")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 1595298664:
                        if (k0.equals("query_string")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 1980646230:
                        if (k0.equals("api_target")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        lVar.o = n2Var.T0();
                        break;
                    case 1:
                        lVar.f19145g = n2Var.T0();
                        break;
                    case 2:
                        Map map = (Map) n2Var.R0();
                        if (map == null) {
                            break;
                        } else {
                            lVar.l = io.sentry.util.i.b(map);
                            break;
                        }
                    case 3:
                        lVar.f19144f = n2Var.T0();
                        break;
                    case 4:
                        lVar.f19147i = n2Var.R0();
                        break;
                    case 5:
                        Map map2 = (Map) n2Var.R0();
                        if (map2 == null) {
                            break;
                        } else {
                            lVar.n = io.sentry.util.i.b(map2);
                            break;
                        }
                    case 6:
                        Map map3 = (Map) n2Var.R0();
                        if (map3 == null) {
                            break;
                        } else {
                            lVar.f19149k = io.sentry.util.i.b(map3);
                            break;
                        }
                    case 7:
                        lVar.f19148j = n2Var.T0();
                        break;
                    case '\b':
                        lVar.m = n2Var.P0();
                        break;
                    case '\t':
                        lVar.f19146h = n2Var.T0();
                        break;
                    case '\n':
                        lVar.p = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            lVar.m(concurrentHashMap);
            n2Var.D();
            return lVar;
        }
    }

    public l() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return io.sentry.util.q.a(this.f19144f, lVar.f19144f) && io.sentry.util.q.a(this.f19145g, lVar.f19145g) && io.sentry.util.q.a(this.f19146h, lVar.f19146h) && io.sentry.util.q.a(this.f19148j, lVar.f19148j) && io.sentry.util.q.a(this.f19149k, lVar.f19149k) && io.sentry.util.q.a(this.l, lVar.l) && io.sentry.util.q.a(this.m, lVar.m) && io.sentry.util.q.a(this.o, lVar.o) && io.sentry.util.q.a(this.p, lVar.p);
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19144f, this.f19145g, this.f19146h, this.f19148j, this.f19149k, this.l, this.m, this.o, this.p);
    }

    public Map<String, String> l() {
        return this.f19149k;
    }

    public void m(Map<String, Object> map) {
        this.q = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19144f != null) {
            h3Var.k("url").b(this.f19144f);
        }
        if (this.f19145g != null) {
            h3Var.k("method").b(this.f19145g);
        }
        if (this.f19146h != null) {
            h3Var.k("query_string").b(this.f19146h);
        }
        if (this.f19147i != null) {
            h3Var.k("data").g(w1Var, this.f19147i);
        }
        if (this.f19148j != null) {
            h3Var.k("cookies").b(this.f19148j);
        }
        if (this.f19149k != null) {
            h3Var.k("headers").g(w1Var, this.f19149k);
        }
        if (this.l != null) {
            h3Var.k("env").g(w1Var, this.l);
        }
        if (this.n != null) {
            h3Var.k("other").g(w1Var, this.n);
        }
        if (this.o != null) {
            h3Var.k("fragment").g(w1Var, this.o);
        }
        if (this.m != null) {
            h3Var.k("body_size").g(w1Var, this.m);
        }
        if (this.p != null) {
            h3Var.k("api_target").g(w1Var, this.p);
        }
        Map<String, Object> map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.q.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public l(l lVar) {
        this.f19144f = lVar.f19144f;
        this.f19148j = lVar.f19148j;
        this.f19145g = lVar.f19145g;
        this.f19146h = lVar.f19146h;
        this.f19149k = io.sentry.util.i.b(lVar.f19149k);
        this.l = io.sentry.util.i.b(lVar.l);
        this.n = io.sentry.util.i.b(lVar.n);
        this.q = io.sentry.util.i.b(lVar.q);
        this.f19147i = lVar.f19147i;
        this.o = lVar.o;
        this.m = lVar.m;
        this.p = lVar.p;
    }
}
