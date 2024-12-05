package io.sentry.protocol;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.v;
import io.sentry.r2;
import io.sentry.t4;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryThread.java */
/* loaded from: classes2.dex */
public final class w implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private Long f19197f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f19198g;

    /* renamed from: h, reason: collision with root package name */
    private String f19199h;

    /* renamed from: i, reason: collision with root package name */
    private String f19200i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f19201j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f19202k;
    private Boolean l;
    private Boolean m;
    private v n;
    private Map<String, t4> o;
    private Map<String, Object> p;

    /* compiled from: SentryThread.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<w> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(n2 n2Var, w1 w1Var) throws Exception {
            w wVar = new w();
            n2Var.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1339353468:
                        if (k0.equals("daemon")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1165461084:
                        if (k0.equals("priority")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -502917346:
                        if (k0.equals("held_locks")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3355:
                        if (k0.equals(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3343801:
                        if (k0.equals("main")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 109757585:
                        if (k0.equals("state")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1025385094:
                        if (k0.equals("crashed")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1126940025:
                        if (k0.equals("current")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 2055832509:
                        if (k0.equals("stacktrace")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        wVar.l = n2Var.I0();
                        break;
                    case 1:
                        wVar.f19198g = n2Var.N0();
                        break;
                    case 2:
                        Map Q0 = n2Var.Q0(w1Var, new t4.a());
                        if (Q0 == null) {
                            break;
                        } else {
                            wVar.o = new HashMap(Q0);
                            break;
                        }
                    case 3:
                        wVar.f19197f = n2Var.P0();
                        break;
                    case 4:
                        wVar.m = n2Var.I0();
                        break;
                    case 5:
                        wVar.f19199h = n2Var.T0();
                        break;
                    case 6:
                        wVar.f19200i = n2Var.T0();
                        break;
                    case 7:
                        wVar.f19201j = n2Var.I0();
                        break;
                    case '\b':
                        wVar.f19202k = n2Var.I0();
                        break;
                    case '\t':
                        wVar.n = (v) n2Var.S0(w1Var, new v.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            wVar.A(concurrentHashMap);
            n2Var.D();
            return wVar;
        }
    }

    public void A(Map<String, Object> map) {
        this.p = map;
    }

    public Map<String, t4> k() {
        return this.o;
    }

    public Long l() {
        return this.f19197f;
    }

    public String m() {
        return this.f19199h;
    }

    public v n() {
        return this.n;
    }

    public Boolean o() {
        return this.f19202k;
    }

    public Boolean p() {
        return this.m;
    }

    public void q(Boolean bool) {
        this.f19201j = bool;
    }

    public void r(Boolean bool) {
        this.f19202k = bool;
    }

    public void s(Boolean bool) {
        this.l = bool;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19197f != null) {
            h3Var.k(DeepLinkIntentReceiver.DeepLinksKeys.ID).e(this.f19197f);
        }
        if (this.f19198g != null) {
            h3Var.k("priority").e(this.f19198g);
        }
        if (this.f19199h != null) {
            h3Var.k("name").b(this.f19199h);
        }
        if (this.f19200i != null) {
            h3Var.k("state").b(this.f19200i);
        }
        if (this.f19201j != null) {
            h3Var.k("crashed").h(this.f19201j);
        }
        if (this.f19202k != null) {
            h3Var.k("current").h(this.f19202k);
        }
        if (this.l != null) {
            h3Var.k("daemon").h(this.l);
        }
        if (this.m != null) {
            h3Var.k("main").h(this.m);
        }
        if (this.n != null) {
            h3Var.k("stacktrace").g(w1Var, this.n);
        }
        if (this.o != null) {
            h3Var.k("held_locks").g(w1Var, this.o);
        }
        Map<String, Object> map = this.p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.p.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public void t(Map<String, t4> map) {
        this.o = map;
    }

    public void u(Long l) {
        this.f19197f = l;
    }

    public void v(Boolean bool) {
        this.m = bool;
    }

    public void w(String str) {
        this.f19199h = str;
    }

    public void x(Integer num) {
        this.f19198g = num;
    }

    public void y(v vVar) {
        this.n = vVar;
    }

    public void z(String str) {
        this.f19200i = str;
    }
}
