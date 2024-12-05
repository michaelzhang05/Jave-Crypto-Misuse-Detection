package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Response.java */
/* loaded from: classes2.dex */
public final class m implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19150f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f19151g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f19152h;

    /* renamed from: i, reason: collision with root package name */
    private Long f19153i;

    /* renamed from: j, reason: collision with root package name */
    private Object f19154j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f19155k;

    /* compiled from: Response.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<m> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -891699686:
                        if (k0.equals("status_code")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3076010:
                        if (k0.equals("data")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 795307910:
                        if (k0.equals("headers")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 952189583:
                        if (k0.equals("cookies")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1252988030:
                        if (k0.equals("body_size")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        mVar.f19152h = n2Var.N0();
                        break;
                    case 1:
                        mVar.f19154j = n2Var.R0();
                        break;
                    case 2:
                        Map map = (Map) n2Var.R0();
                        if (map == null) {
                            break;
                        } else {
                            mVar.f19151g = io.sentry.util.i.b(map);
                            break;
                        }
                    case 3:
                        mVar.f19150f = n2Var.T0();
                        break;
                    case 4:
                        mVar.f19153i = n2Var.P0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            mVar.f(concurrentHashMap);
            n2Var.D();
            return mVar;
        }
    }

    public m() {
    }

    public void f(Map<String, Object> map) {
        this.f19155k = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19150f != null) {
            h3Var.k("cookies").b(this.f19150f);
        }
        if (this.f19151g != null) {
            h3Var.k("headers").g(w1Var, this.f19151g);
        }
        if (this.f19152h != null) {
            h3Var.k("status_code").g(w1Var, this.f19152h);
        }
        if (this.f19153i != null) {
            h3Var.k("body_size").g(w1Var, this.f19153i);
        }
        if (this.f19154j != null) {
            h3Var.k("data").g(w1Var, this.f19154j);
        }
        Map<String, Object> map = this.f19155k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19155k.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public m(m mVar) {
        this.f19150f = mVar.f19150f;
        this.f19151g = io.sentry.util.i.b(mVar.f19151g);
        this.f19155k = io.sentry.util.i.b(mVar.f19155k);
        this.f19152h = mVar.f19152h;
        this.f19153i = mVar.f19153i;
        this.f19154j = mVar.f19154j;
    }
}
