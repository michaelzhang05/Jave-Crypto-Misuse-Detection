package io.sentry.protocol;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Gpu.java */
/* loaded from: classes2.dex */
public final class g implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19119f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f19120g;

    /* renamed from: h, reason: collision with root package name */
    private String f19121h;

    /* renamed from: i, reason: collision with root package name */
    private String f19122i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f19123j;

    /* renamed from: k, reason: collision with root package name */
    private String f19124k;
    private Boolean l;
    private String m;
    private String n;
    private Map<String, Object> o;

    /* compiled from: Gpu.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<g> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            g gVar = new g();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1421884745:
                        if (k0.equals("npot_support")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1085970574:
                        if (k0.equals("vendor_id")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1009234244:
                        if (k0.equals("multi_threaded_rendering")) {
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
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 59480866:
                        if (k0.equals("vendor_name")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 351608024:
                        if (k0.equals("version")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 967446079:
                        if (k0.equals("api_type")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (k0.equals("memory_size")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        gVar.n = n2Var.T0();
                        break;
                    case 1:
                        gVar.f19121h = n2Var.T0();
                        break;
                    case 2:
                        gVar.l = n2Var.I0();
                        break;
                    case 3:
                        gVar.f19120g = n2Var.N0();
                        break;
                    case 4:
                        gVar.f19119f = n2Var.T0();
                        break;
                    case 5:
                        gVar.f19122i = n2Var.T0();
                        break;
                    case 6:
                        gVar.m = n2Var.T0();
                        break;
                    case 7:
                        gVar.f19124k = n2Var.T0();
                        break;
                    case '\b':
                        gVar.f19123j = n2Var.N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            gVar.j(concurrentHashMap);
            n2Var.D();
            return gVar;
        }
    }

    public g() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return io.sentry.util.q.a(this.f19119f, gVar.f19119f) && io.sentry.util.q.a(this.f19120g, gVar.f19120g) && io.sentry.util.q.a(this.f19121h, gVar.f19121h) && io.sentry.util.q.a(this.f19122i, gVar.f19122i) && io.sentry.util.q.a(this.f19123j, gVar.f19123j) && io.sentry.util.q.a(this.f19124k, gVar.f19124k) && io.sentry.util.q.a(this.l, gVar.l) && io.sentry.util.q.a(this.m, gVar.m) && io.sentry.util.q.a(this.n, gVar.n);
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19119f, this.f19120g, this.f19121h, this.f19122i, this.f19123j, this.f19124k, this.l, this.m, this.n);
    }

    public void j(Map<String, Object> map) {
        this.o = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19119f != null) {
            h3Var.k("name").b(this.f19119f);
        }
        if (this.f19120g != null) {
            h3Var.k(DeepLinkIntentReceiver.DeepLinksKeys.ID).e(this.f19120g);
        }
        if (this.f19121h != null) {
            h3Var.k("vendor_id").b(this.f19121h);
        }
        if (this.f19122i != null) {
            h3Var.k("vendor_name").b(this.f19122i);
        }
        if (this.f19123j != null) {
            h3Var.k("memory_size").e(this.f19123j);
        }
        if (this.f19124k != null) {
            h3Var.k("api_type").b(this.f19124k);
        }
        if (this.l != null) {
            h3Var.k("multi_threaded_rendering").h(this.l);
        }
        if (this.m != null) {
            h3Var.k("version").b(this.m);
        }
        if (this.n != null) {
            h3Var.k("npot_support").b(this.n);
        }
        Map<String, Object> map = this.o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.o.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(g gVar) {
        this.f19119f = gVar.f19119f;
        this.f19120g = gVar.f19120g;
        this.f19121h = gVar.f19121h;
        this.f19122i = gVar.f19122i;
        this.f19123j = gVar.f19123j;
        this.f19124k = gVar.f19124k;
        this.l = gVar.l;
        this.m = gVar.m;
        this.n = gVar.n;
        this.o = io.sentry.util.i.b(gVar.o);
    }
}
