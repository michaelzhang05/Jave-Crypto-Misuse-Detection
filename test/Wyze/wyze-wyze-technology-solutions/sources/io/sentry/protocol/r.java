package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.s4;
import io.sentry.w1;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryPackage.java */
/* loaded from: classes2.dex */
public final class r implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19174f;

    /* renamed from: g, reason: collision with root package name */
    private String f19175g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f19176h;

    /* compiled from: SentryPackage.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<r> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("name")) {
                    str = n2Var.u0();
                } else if (!k0.equals("version")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    n2Var.V0(w1Var, hashMap, k0);
                } else {
                    str2 = n2Var.u0();
                }
            }
            n2Var.D();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                w1Var.b(s4.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                r rVar = new r(str, str2);
                rVar.a(hashMap);
                return rVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            w1Var.b(s4.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public r(String str, String str2) {
        this.f19174f = (String) io.sentry.util.q.c(str, "name is required.");
        this.f19175g = (String) io.sentry.util.q.c(str2, "version is required.");
    }

    public void a(Map<String, Object> map) {
        this.f19176h = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return c.h.j.d.a(this.f19174f, rVar.f19174f) && c.h.j.d.a(this.f19175g, rVar.f19175g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19174f, this.f19175g});
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("name").b(this.f19174f);
        h3Var.k("version").b(this.f19175g);
        Map<String, Object> map = this.f19176h;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19176h.get(str));
            }
        }
        h3Var.d();
    }
}
