package io.sentry.protocol;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.protocol.f;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: User.java */
/* loaded from: classes2.dex */
public final class a0 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19087f;

    /* renamed from: g, reason: collision with root package name */
    private String f19088g;

    /* renamed from: h, reason: collision with root package name */
    private String f19089h;

    /* renamed from: i, reason: collision with root package name */
    private String f19090i;

    /* renamed from: j, reason: collision with root package name */
    private String f19091j;

    /* renamed from: k, reason: collision with root package name */
    private String f19092k;
    private f l;
    private Map<String, String> m;
    private Map<String, Object> n;

    /* compiled from: User.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<a0> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            a0 a0Var = new a0();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -265713450:
                        if (k0.equals("username")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3355:
                        if (k0.equals(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 102225:
                        if (k0.equals("geo")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3076010:
                        if (k0.equals("data")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 96619420:
                        if (k0.equals("email")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 106069776:
                        if (k0.equals("other")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 1480014044:
                        if (k0.equals("ip_address")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1973722931:
                        if (k0.equals("segment")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        a0Var.f19089h = n2Var.T0();
                        break;
                    case 1:
                        a0Var.f19088g = n2Var.T0();
                        break;
                    case 2:
                        a0Var.l = new f.a().a(n2Var, w1Var);
                        break;
                    case 3:
                        a0Var.m = io.sentry.util.i.b((Map) n2Var.R0());
                        break;
                    case 4:
                        a0Var.f19092k = n2Var.T0();
                        break;
                    case 5:
                        a0Var.f19087f = n2Var.T0();
                        break;
                    case 6:
                        if (a0Var.m != null && !a0Var.m.isEmpty()) {
                            break;
                        } else {
                            a0Var.m = io.sentry.util.i.b((Map) n2Var.R0());
                            break;
                        }
                    case 7:
                        a0Var.f19091j = n2Var.T0();
                        break;
                    case '\b':
                        a0Var.f19090i = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            a0Var.p(concurrentHashMap);
            n2Var.D();
            return a0Var;
        }
    }

    public a0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return io.sentry.util.q.a(this.f19087f, a0Var.f19087f) && io.sentry.util.q.a(this.f19088g, a0Var.f19088g) && io.sentry.util.q.a(this.f19089h, a0Var.f19089h) && io.sentry.util.q.a(this.f19090i, a0Var.f19090i) && io.sentry.util.q.a(this.f19091j, a0Var.f19091j);
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19087f, this.f19088g, this.f19089h, this.f19090i, this.f19091j);
    }

    public Map<String, String> j() {
        return this.m;
    }

    public String k() {
        return this.f19088g;
    }

    public String l() {
        return this.f19091j;
    }

    public String m() {
        return this.f19090i;
    }

    public void n(String str) {
        this.f19088g = str;
    }

    public void o(String str) {
        this.f19091j = str;
    }

    public void p(Map<String, Object> map) {
        this.n = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19087f != null) {
            h3Var.k("email").b(this.f19087f);
        }
        if (this.f19088g != null) {
            h3Var.k(DeepLinkIntentReceiver.DeepLinksKeys.ID).b(this.f19088g);
        }
        if (this.f19089h != null) {
            h3Var.k("username").b(this.f19089h);
        }
        if (this.f19090i != null) {
            h3Var.k("segment").b(this.f19090i);
        }
        if (this.f19091j != null) {
            h3Var.k("ip_address").b(this.f19091j);
        }
        if (this.f19092k != null) {
            h3Var.k("name").b(this.f19092k);
        }
        if (this.l != null) {
            h3Var.k("geo");
            this.l.serialize(h3Var, w1Var);
        }
        if (this.m != null) {
            h3Var.k("data").g(w1Var, this.m);
        }
        Map<String, Object> map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.n.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public a0(a0 a0Var) {
        this.f19087f = a0Var.f19087f;
        this.f19089h = a0Var.f19089h;
        this.f19088g = a0Var.f19088g;
        this.f19091j = a0Var.f19091j;
        this.f19090i = a0Var.f19090i;
        this.f19092k = a0Var.f19092k;
        this.l = a0Var.l;
        this.m = io.sentry.util.i.b(a0Var.m);
        this.n = io.sentry.util.i.b(a0Var.n);
    }
}
