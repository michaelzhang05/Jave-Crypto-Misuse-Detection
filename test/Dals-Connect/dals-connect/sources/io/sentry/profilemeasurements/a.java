package io.sentry.profilemeasurements;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.profilemeasurements.b;
import io.sentry.r2;
import io.sentry.util.q;
import io.sentry.w1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfileMeasurement.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class a implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f19075f;

    /* renamed from: g, reason: collision with root package name */
    private String f19076g;

    /* renamed from: h, reason: collision with root package name */
    private Collection<b> f19077h;

    /* compiled from: ProfileMeasurement.java */
    /* renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0266a implements l2<a> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("values")) {
                    List O0 = n2Var.O0(w1Var, new b.a());
                    if (O0 != null) {
                        aVar.f19077h = O0;
                    }
                } else if (!k0.equals("unit")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    n2Var.V0(w1Var, concurrentHashMap, k0);
                } else {
                    String T0 = n2Var.T0();
                    if (T0 != null) {
                        aVar.f19076g = T0;
                    }
                }
            }
            aVar.c(concurrentHashMap);
            n2Var.D();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map<String, Object> map) {
        this.f19075f = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return q.a(this.f19075f, aVar.f19075f) && this.f19076g.equals(aVar.f19076g) && new ArrayList(this.f19077h).equals(new ArrayList(aVar.f19077h));
    }

    public int hashCode() {
        return q.b(this.f19075f, this.f19076g, this.f19077h);
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("unit").g(w1Var, this.f19076g);
        h3Var.k("values").g(w1Var, this.f19077h);
        Map<String, Object> map = this.f19075f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19075f.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public a(String str, Collection<b> collection) {
        this.f19076g = str;
        this.f19077h = collection;
    }
}
