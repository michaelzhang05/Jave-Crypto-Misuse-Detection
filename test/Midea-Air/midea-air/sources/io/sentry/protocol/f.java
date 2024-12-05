package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Geo.java */
/* loaded from: classes2.dex */
public final class f implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19115f;

    /* renamed from: g, reason: collision with root package name */
    private String f19116g;

    /* renamed from: h, reason: collision with root package name */
    private String f19117h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f19118i;

    /* compiled from: Geo.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<f> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            f fVar = new f();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -934795532:
                        if (k0.equals("region")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3053931:
                        if (k0.equals("city")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1481071862:
                        if (k0.equals("country_code")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        fVar.f19117h = n2Var.T0();
                        break;
                    case 1:
                        fVar.f19115f = n2Var.T0();
                        break;
                    case 2:
                        fVar.f19116g = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            fVar.d(concurrentHashMap);
            n2Var.D();
            return fVar;
        }
    }

    public void d(Map<String, Object> map) {
        this.f19118i = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19115f != null) {
            h3Var.k("city").b(this.f19115f);
        }
        if (this.f19116g != null) {
            h3Var.k("country_code").b(this.f19116g);
        }
        if (this.f19117h != null) {
            h3Var.k("region").b(this.f19117h);
        }
        Map<String, Object> map = this.f19118i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19118i.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }
}
