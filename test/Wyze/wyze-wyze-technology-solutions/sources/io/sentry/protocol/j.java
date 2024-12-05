package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Message.java */
/* loaded from: classes2.dex */
public final class j implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19134f;

    /* renamed from: g, reason: collision with root package name */
    private String f19135g;

    /* renamed from: h, reason: collision with root package name */
    private List<String> f19136h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f19137i;

    /* compiled from: Message.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<j> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -995427962:
                        if (k0.equals("params")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 954925063:
                        if (k0.equals("message")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1811591356:
                        if (k0.equals("formatted")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        List list = (List) n2Var.R0();
                        if (list == null) {
                            break;
                        } else {
                            jVar.f19136h = list;
                            break;
                        }
                    case 1:
                        jVar.f19135g = n2Var.T0();
                        break;
                    case 2:
                        jVar.f19134f = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            jVar.e(concurrentHashMap);
            n2Var.D();
            return jVar;
        }
    }

    public void d(String str) {
        this.f19134f = str;
    }

    public void e(Map<String, Object> map) {
        this.f19137i = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19134f != null) {
            h3Var.k("formatted").b(this.f19134f);
        }
        if (this.f19135g != null) {
            h3Var.k("message").b(this.f19135g);
        }
        List<String> list = this.f19136h;
        if (list != null && !list.isEmpty()) {
            h3Var.k("params").g(w1Var, this.f19136h);
        }
        Map<String, Object> map = this.f19137i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19137i.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }
}
