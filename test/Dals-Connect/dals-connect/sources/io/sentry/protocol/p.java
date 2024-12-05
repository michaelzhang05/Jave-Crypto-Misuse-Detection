package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.i;
import io.sentry.protocol.v;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryException.java */
/* loaded from: classes2.dex */
public final class p implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19166f;

    /* renamed from: g, reason: collision with root package name */
    private String f19167g;

    /* renamed from: h, reason: collision with root package name */
    private String f19168h;

    /* renamed from: i, reason: collision with root package name */
    private Long f19169i;

    /* renamed from: j, reason: collision with root package name */
    private v f19170j;

    /* renamed from: k, reason: collision with root package name */
    private i f19171k;
    private Map<String, Object> l;

    /* compiled from: SentryException.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<p> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(n2 n2Var, w1 w1Var) throws Exception {
            p pVar = new p();
            n2Var.b();
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1562235024:
                        if (k0.equals("thread_id")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (k0.equals("module")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (k0.equals("type")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 111972721:
                        if (k0.equals("value")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1225089881:
                        if (k0.equals("mechanism")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 2055832509:
                        if (k0.equals("stacktrace")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        pVar.f19169i = n2Var.P0();
                        break;
                    case 1:
                        pVar.f19168h = n2Var.T0();
                        break;
                    case 2:
                        pVar.f19166f = n2Var.T0();
                        break;
                    case 3:
                        pVar.f19167g = n2Var.T0();
                        break;
                    case 4:
                        pVar.f19171k = (i) n2Var.S0(w1Var, new i.a());
                        break;
                    case 5:
                        pVar.f19170j = (v) n2Var.S0(w1Var, new v.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        n2Var.V0(w1Var, hashMap, k0);
                        break;
                }
            }
            n2Var.D();
            pVar.o(hashMap);
            return pVar;
        }
    }

    public i g() {
        return this.f19171k;
    }

    public Long h() {
        return this.f19169i;
    }

    public String i() {
        return this.f19166f;
    }

    public void j(i iVar) {
        this.f19171k = iVar;
    }

    public void k(String str) {
        this.f19168h = str;
    }

    public void l(v vVar) {
        this.f19170j = vVar;
    }

    public void m(Long l) {
        this.f19169i = l;
    }

    public void n(String str) {
        this.f19166f = str;
    }

    public void o(Map<String, Object> map) {
        this.l = map;
    }

    public void p(String str) {
        this.f19167g = str;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19166f != null) {
            h3Var.k("type").b(this.f19166f);
        }
        if (this.f19167g != null) {
            h3Var.k("value").b(this.f19167g);
        }
        if (this.f19168h != null) {
            h3Var.k("module").b(this.f19168h);
        }
        if (this.f19169i != null) {
            h3Var.k("thread_id").e(this.f19169i);
        }
        if (this.f19170j != null) {
            h3Var.k("stacktrace").g(w1Var, this.f19170j);
        }
        if (this.f19171k != null) {
            h3Var.k("mechanism").g(w1Var, this.f19171k);
        }
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.l.get(str));
            }
        }
        h3Var.d();
    }
}
