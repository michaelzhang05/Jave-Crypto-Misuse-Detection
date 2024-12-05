package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.u;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackTrace.java */
/* loaded from: classes2.dex */
public final class v implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private List<u> f19193f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f19194g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f19195h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f19196i;

    /* compiled from: SentryStackTrace.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<v> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(n2 n2Var, w1 w1Var) throws Exception {
            v vVar = new v();
            n2Var.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1266514778:
                        if (k0.equals("frames")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 78226992:
                        if (k0.equals("registers")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 284874180:
                        if (k0.equals("snapshot")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        vVar.f19193f = n2Var.O0(w1Var, new u.a());
                        break;
                    case 1:
                        vVar.f19194g = io.sentry.util.i.b((Map) n2Var.R0());
                        break;
                    case 2:
                        vVar.f19195h = n2Var.I0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            vVar.f(concurrentHashMap);
            n2Var.D();
            return vVar;
        }
    }

    public v() {
    }

    public List<u> d() {
        return this.f19193f;
    }

    public void e(Boolean bool) {
        this.f19195h = bool;
    }

    public void f(Map<String, Object> map) {
        this.f19196i = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19193f != null) {
            h3Var.k("frames").g(w1Var, this.f19193f);
        }
        if (this.f19194g != null) {
            h3Var.k("registers").g(w1Var, this.f19194g);
        }
        if (this.f19195h != null) {
            h3Var.k("snapshot").h(this.f19195h);
        }
        Map<String, Object> map = this.f19196i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19196i.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public v(List<u> list) {
        this.f19193f = list;
    }
}
