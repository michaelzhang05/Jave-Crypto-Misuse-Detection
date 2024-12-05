package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.c0;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewHierarchy.java */
/* loaded from: classes2.dex */
public final class b0 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final String f19096f;

    /* renamed from: g, reason: collision with root package name */
    private final List<c0> f19097g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f19098h;

    /* compiled from: ViewHierarchy.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<b0> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            String str = null;
            List list = null;
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("rendering_system")) {
                    str = n2Var.T0();
                } else if (!k0.equals("windows")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    n2Var.V0(w1Var, hashMap, k0);
                } else {
                    list = n2Var.O0(w1Var, new c0.a());
                }
            }
            n2Var.D();
            b0 b0Var = new b0(str, list);
            b0Var.a(hashMap);
            return b0Var;
        }
    }

    public b0(String str, List<c0> list) {
        this.f19096f = str;
        this.f19097g = list;
    }

    public void a(Map<String, Object> map) {
        this.f19098h = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19096f != null) {
            h3Var.k("rendering_system").b(this.f19096f);
        }
        if (this.f19097g != null) {
            h3Var.k("windows").g(w1Var, this.f19097g);
        }
        Map<String, Object> map = this.f19098h;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19098h.get(str));
            }
        }
        h3Var.d();
    }
}
