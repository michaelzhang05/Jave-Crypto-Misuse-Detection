package io.sentry;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfilingTransactionData.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class n3 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19033f;

    /* renamed from: g, reason: collision with root package name */
    private String f19034g;

    /* renamed from: h, reason: collision with root package name */
    private String f19035h;

    /* renamed from: i, reason: collision with root package name */
    private Long f19036i;

    /* renamed from: j, reason: collision with root package name */
    private Long f19037j;

    /* renamed from: k, reason: collision with root package name */
    private Long f19038k;
    private Long l;
    private Map<String, Object> m;

    /* compiled from: ProfilingTransactionData.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<n3> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n3 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            n3 n3Var = new n3();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -112372011:
                        if (k0.equals("relative_start_ns")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -84607876:
                        if (k0.equals("relative_end_ns")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3355:
                        if (k0.equals(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (k0.equals("trace_id")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1566648660:
                        if (k0.equals("relative_cpu_end_ms")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1902256621:
                        if (k0.equals("relative_cpu_start_ms")) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        Long P0 = n2Var.P0();
                        if (P0 == null) {
                            break;
                        } else {
                            n3Var.f19036i = P0;
                            break;
                        }
                    case 1:
                        Long P02 = n2Var.P0();
                        if (P02 == null) {
                            break;
                        } else {
                            n3Var.f19037j = P02;
                            break;
                        }
                    case 2:
                        String T0 = n2Var.T0();
                        if (T0 == null) {
                            break;
                        } else {
                            n3Var.f19033f = T0;
                            break;
                        }
                    case 3:
                        String T02 = n2Var.T0();
                        if (T02 == null) {
                            break;
                        } else {
                            n3Var.f19035h = T02;
                            break;
                        }
                    case 4:
                        String T03 = n2Var.T0();
                        if (T03 == null) {
                            break;
                        } else {
                            n3Var.f19034g = T03;
                            break;
                        }
                    case 5:
                        Long P03 = n2Var.P0();
                        if (P03 == null) {
                            break;
                        } else {
                            n3Var.l = P03;
                            break;
                        }
                    case 6:
                        Long P04 = n2Var.P0();
                        if (P04 == null) {
                            break;
                        } else {
                            n3Var.f19038k = P04;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            n3Var.j(concurrentHashMap);
            n2Var.D();
            return n3Var;
        }
    }

    public n3() {
        this(d3.r(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.f19033f.equals(n3Var.f19033f) && this.f19034g.equals(n3Var.f19034g) && this.f19035h.equals(n3Var.f19035h) && this.f19036i.equals(n3Var.f19036i) && this.f19038k.equals(n3Var.f19038k) && io.sentry.util.q.a(this.l, n3Var.l) && io.sentry.util.q.a(this.f19037j, n3Var.f19037j) && io.sentry.util.q.a(this.m, n3Var.m);
    }

    public String h() {
        return this.f19033f;
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19033f, this.f19034g, this.f19035h, this.f19036i, this.f19037j, this.f19038k, this.l, this.m);
    }

    public void i(Long l, Long l2, Long l3, Long l4) {
        if (this.f19037j == null) {
            this.f19037j = Long.valueOf(l.longValue() - l2.longValue());
            this.f19036i = Long.valueOf(this.f19036i.longValue() - l2.longValue());
            this.l = Long.valueOf(l3.longValue() - l4.longValue());
            this.f19038k = Long.valueOf(this.f19038k.longValue() - l4.longValue());
        }
    }

    public void j(Map<String, Object> map) {
        this.m = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k(DeepLinkIntentReceiver.DeepLinksKeys.ID).g(w1Var, this.f19033f);
        h3Var.k("trace_id").g(w1Var, this.f19034g);
        h3Var.k("name").g(w1Var, this.f19035h);
        h3Var.k("relative_start_ns").g(w1Var, this.f19036i);
        h3Var.k("relative_end_ns").g(w1Var, this.f19037j);
        h3Var.k("relative_cpu_start_ms").g(w1Var, this.f19038k);
        h3Var.k("relative_cpu_end_ms").g(w1Var, this.l);
        Map<String, Object> map = this.m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.m.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public n3(e2 e2Var, Long l, Long l2) {
        this.f19033f = e2Var.k().toString();
        this.f19034g = e2Var.m().k().toString();
        this.f19035h = e2Var.getName();
        this.f19036i = l;
        this.f19038k = l2;
    }
}
