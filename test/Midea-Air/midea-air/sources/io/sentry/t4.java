package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryLockReason.java */
/* loaded from: classes2.dex */
public final class t4 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private int f19241f;

    /* renamed from: g, reason: collision with root package name */
    private String f19242g;

    /* renamed from: h, reason: collision with root package name */
    private String f19243h;

    /* renamed from: i, reason: collision with root package name */
    private String f19244i;

    /* renamed from: j, reason: collision with root package name */
    private Long f19245j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f19246k;

    /* compiled from: SentryLockReason.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<t4> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t4 a(n2 n2Var, w1 w1Var) throws Exception {
            t4 t4Var = new t4();
            n2Var.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1877165340:
                        if (k0.equals("package_name")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1562235024:
                        if (k0.equals("thread_id")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1147692044:
                        if (k0.equals("address")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -290474766:
                        if (k0.equals("class_name")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3575610:
                        if (k0.equals("type")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        t4Var.f19243h = n2Var.T0();
                        break;
                    case 1:
                        t4Var.f19245j = n2Var.P0();
                        break;
                    case 2:
                        t4Var.f19242g = n2Var.T0();
                        break;
                    case 3:
                        t4Var.f19244i = n2Var.T0();
                        break;
                    case 4:
                        t4Var.f19241f = n2Var.g0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            t4Var.m(concurrentHashMap);
            n2Var.D();
            return t4Var;
        }
    }

    public t4() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t4.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.q.a(this.f19242g, ((t4) obj).f19242g);
    }

    public String f() {
        return this.f19242g;
    }

    public int g() {
        return this.f19241f;
    }

    public void h(String str) {
        this.f19242g = str;
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19242g);
    }

    public void i(String str) {
        this.f19244i = str;
    }

    public void j(String str) {
        this.f19243h = str;
    }

    public void k(Long l) {
        this.f19245j = l;
    }

    public void l(int i2) {
        this.f19241f = i2;
    }

    public void m(Map<String, Object> map) {
        this.f19246k = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("type").a(this.f19241f);
        if (this.f19242g != null) {
            h3Var.k("address").b(this.f19242g);
        }
        if (this.f19243h != null) {
            h3Var.k("package_name").b(this.f19243h);
        }
        if (this.f19244i != null) {
            h3Var.k("class_name").b(this.f19244i);
        }
        if (this.f19245j != null) {
            h3Var.k("thread_id").e(this.f19245j);
        }
        Map<String, Object> map = this.f19246k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19246k.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public t4(t4 t4Var) {
        this.f19241f = t4Var.f19241f;
        this.f19242g = t4Var.f19242g;
        this.f19243h = t4Var.f19243h;
        this.f19244i = t4Var.f19244i;
        this.f19245j = t4Var.f19245j;
        this.f19246k = io.sentry.util.i.b(t4Var.f19246k);
    }
}
