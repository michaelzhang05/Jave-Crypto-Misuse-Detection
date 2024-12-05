package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.n;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DebugMeta.java */
/* loaded from: classes2.dex */
public final class d implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private n f19106f;

    /* renamed from: g, reason: collision with root package name */
    private List<DebugImage> f19107g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f19108h;

    /* compiled from: DebugMeta.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<d> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(n2 n2Var, w1 w1Var) throws Exception {
            d dVar = new d();
            n2Var.b();
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("images")) {
                    dVar.f19107g = n2Var.O0(w1Var, new DebugImage.a());
                } else if (k0.equals("sdk_info")) {
                    dVar.f19106f = (n) n2Var.S0(w1Var, new n.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    n2Var.V0(w1Var, hashMap, k0);
                }
            }
            n2Var.D();
            dVar.e(hashMap);
            return dVar;
        }
    }

    public List<DebugImage> c() {
        return this.f19107g;
    }

    public void d(List<DebugImage> list) {
        this.f19107g = list != null ? new ArrayList(list) : null;
    }

    public void e(Map<String, Object> map) {
        this.f19108h = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19106f != null) {
            h3Var.k("sdk_info").g(w1Var, this.f19106f);
        }
        if (this.f19107g != null) {
            h3Var.k("images").g(w1Var, this.f19107g);
        }
        Map<String, Object> map = this.f19108h;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19108h.get(str));
            }
        }
        h3Var.d();
    }
}
