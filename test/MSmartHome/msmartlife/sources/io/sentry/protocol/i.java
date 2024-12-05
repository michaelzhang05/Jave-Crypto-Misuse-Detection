package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Mechanism.java */
/* loaded from: classes2.dex */
public final class i implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final transient Thread f19128f;

    /* renamed from: g, reason: collision with root package name */
    private String f19129g;

    /* renamed from: h, reason: collision with root package name */
    private String f19130h;

    /* renamed from: i, reason: collision with root package name */
    private String f19131i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f19132j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f19133k;
    private Map<String, Object> l;
    private Boolean m;
    private Map<String, Object> n;

    /* compiled from: Mechanism.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<i> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(n2 n2Var, w1 w1Var) throws Exception {
            i iVar = new i();
            n2Var.b();
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1724546052:
                        if (k0.equals("description")) {
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
                    case 3347973:
                        if (k0.equals("meta")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (k0.equals("type")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 692803388:
                        if (k0.equals("handled")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 989128517:
                        if (k0.equals("synthetic")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1297152568:
                        if (k0.equals("help_link")) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        iVar.f19130h = n2Var.T0();
                        break;
                    case 1:
                        iVar.l = io.sentry.util.i.b((Map) n2Var.R0());
                        break;
                    case 2:
                        iVar.f19133k = io.sentry.util.i.b((Map) n2Var.R0());
                        break;
                    case 3:
                        iVar.f19129g = n2Var.T0();
                        break;
                    case 4:
                        iVar.f19132j = n2Var.I0();
                        break;
                    case 5:
                        iVar.m = n2Var.I0();
                        break;
                    case 6:
                        iVar.f19131i = n2Var.T0();
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
            iVar.k(hashMap);
            return iVar;
        }
    }

    public i() {
        this(null);
    }

    public Boolean h() {
        return this.f19132j;
    }

    public void i(Boolean bool) {
        this.f19132j = bool;
    }

    public void j(String str) {
        this.f19129g = str;
    }

    public void k(Map<String, Object> map) {
        this.n = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19129g != null) {
            h3Var.k("type").b(this.f19129g);
        }
        if (this.f19130h != null) {
            h3Var.k("description").b(this.f19130h);
        }
        if (this.f19131i != null) {
            h3Var.k("help_link").b(this.f19131i);
        }
        if (this.f19132j != null) {
            h3Var.k("handled").h(this.f19132j);
        }
        if (this.f19133k != null) {
            h3Var.k("meta").g(w1Var, this.f19133k);
        }
        if (this.l != null) {
            h3Var.k("data").g(w1Var, this.l);
        }
        if (this.m != null) {
            h3Var.k("synthetic").h(this.m);
        }
        Map<String, Object> map = this.n;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.n.get(str));
            }
        }
        h3Var.d();
    }

    public i(Thread thread) {
        this.f19128f = thread;
    }
}
