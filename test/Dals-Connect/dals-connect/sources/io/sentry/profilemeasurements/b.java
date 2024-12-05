package io.sentry.profilemeasurements;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.util.q;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurementValue.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class b implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f19078f;

    /* renamed from: g, reason: collision with root package name */
    private String f19079g;

    /* renamed from: h, reason: collision with root package name */
    private double f19080h;

    /* compiled from: ProfileMeasurementValue.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<b> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("elapsed_since_start_ns")) {
                    String T0 = n2Var.T0();
                    if (T0 != null) {
                        bVar.f19079g = T0;
                    }
                } else if (!k0.equals("value")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    n2Var.V0(w1Var, concurrentHashMap, k0);
                } else {
                    Double K0 = n2Var.K0();
                    if (K0 != null) {
                        bVar.f19080h = K0.doubleValue();
                    }
                }
            }
            bVar.c(concurrentHashMap);
            n2Var.D();
            return bVar;
        }
    }

    public b() {
        this(0L, 0);
    }

    public void c(Map<String, Object> map) {
        this.f19078f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return q.a(this.f19078f, bVar.f19078f) && this.f19079g.equals(bVar.f19079g) && this.f19080h == bVar.f19080h;
    }

    public int hashCode() {
        return q.b(this.f19078f, this.f19079g, Double.valueOf(this.f19080h));
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("value").g(w1Var, Double.valueOf(this.f19080h));
        h3Var.k("elapsed_since_start_ns").g(w1Var, this.f19079g);
        Map<String, Object> map = this.f19078f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19078f.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public b(Long l, Number number) {
        this.f19079g = l.toString();
        this.f19080h = number.doubleValue();
    }
}
