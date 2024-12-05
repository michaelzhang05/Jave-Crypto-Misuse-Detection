package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.s4;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: MeasurementValue.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class h implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Number f19125f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19126g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f19127h;

    /* compiled from: MeasurementValue.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<h> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("unit")) {
                    str = n2Var.T0();
                } else if (!k0.equals("value")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    n2Var.V0(w1Var, concurrentHashMap, k0);
                } else {
                    number = (Number) n2Var.R0();
                }
            }
            n2Var.D();
            if (number != null) {
                h hVar = new h(number, str);
                hVar.a(concurrentHashMap);
                return hVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            w1Var.b(s4.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public h(Number number, String str) {
        this.f19125f = number;
        this.f19126g = str;
    }

    public void a(Map<String, Object> map) {
        this.f19127h = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("value").e(this.f19125f);
        if (this.f19126g != null) {
            h3Var.k("unit").b(this.f19126g);
        }
        Map<String, Object> map = this.f19127h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19127h.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }
}
