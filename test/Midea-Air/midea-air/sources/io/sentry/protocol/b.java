package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Browser.java */
/* loaded from: classes2.dex */
public final class b implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19093f;

    /* renamed from: g, reason: collision with root package name */
    private String f19094g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f19095h;

    /* compiled from: Browser.java */
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
                if (k0.equals("name")) {
                    bVar.f19093f = n2Var.T0();
                } else if (k0.equals("version")) {
                    bVar.f19094g = n2Var.T0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    n2Var.V0(w1Var, concurrentHashMap, k0);
                }
            }
            bVar.c(concurrentHashMap);
            n2Var.D();
            return bVar;
        }
    }

    public b() {
    }

    public void c(Map<String, Object> map) {
        this.f19095h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return io.sentry.util.q.a(this.f19093f, bVar.f19093f) && io.sentry.util.q.a(this.f19094g, bVar.f19094g);
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19093f, this.f19094g);
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19093f != null) {
            h3Var.k("name").b(this.f19093f);
        }
        if (this.f19094g != null) {
            h3Var.k("version").b(this.f19094g);
        }
        Map<String, Object> map = this.f19095h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19095h.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b bVar) {
        this.f19093f = bVar.f19093f;
        this.f19094g = bVar.f19094g;
        this.f19095h = io.sentry.util.i.b(bVar.f19095h);
    }
}
