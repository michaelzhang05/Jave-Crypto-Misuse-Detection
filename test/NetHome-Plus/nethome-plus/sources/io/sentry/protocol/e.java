package io.sentry.protocol;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Device.java */
/* loaded from: classes2.dex */
public final class e implements r2 {
    private Integer A;
    private Float B;
    private Integer C;
    private Date D;
    private TimeZone E;
    private String F;

    @Deprecated
    private String G;
    private String H;
    private String I;
    private Float J;
    private Integer K;
    private Double L;
    private String M;
    private Map<String, Object> N;

    /* renamed from: f, reason: collision with root package name */
    private String f19109f;

    /* renamed from: g, reason: collision with root package name */
    private String f19110g;

    /* renamed from: h, reason: collision with root package name */
    private String f19111h;

    /* renamed from: i, reason: collision with root package name */
    private String f19112i;

    /* renamed from: j, reason: collision with root package name */
    private String f19113j;

    /* renamed from: k, reason: collision with root package name */
    private String f19114k;
    private String[] l;
    private Float m;
    private Boolean n;
    private Boolean o;
    private b p;
    private Boolean q;
    private Long r;
    private Long s;
    private Long t;
    private Boolean u;
    private Long v;
    private Long w;
    private Long x;
    private Long y;
    private Integer z;

    /* compiled from: Device.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<e> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -2076227591:
                        if (k0.equals("timezone")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -2012489734:
                        if (k0.equals("boot_time")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1981332476:
                        if (k0.equals("simulator")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1969347631:
                        if (k0.equals("manufacturer")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1613589672:
                        if (k0.equals("language")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -1608004830:
                        if (k0.equals("processor_count")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -1439500848:
                        if (k0.equals("orientation")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -1410521534:
                        if (k0.equals("battery_temperature")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -1281860764:
                        if (k0.equals("family")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case -1097462182:
                        if (k0.equals("locale")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case -1012222381:
                        if (k0.equals("online")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case -877252910:
                        if (k0.equals("battery_level")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case -619038223:
                        if (k0.equals("model_id")) {
                            c2 = '\f';
                            break;
                        }
                        break;
                    case -568274923:
                        if (k0.equals("screen_density")) {
                            c2 = '\r';
                            break;
                        }
                        break;
                    case -417046774:
                        if (k0.equals("screen_dpi")) {
                            c2 = 14;
                            break;
                        }
                        break;
                    case -136523212:
                        if (k0.equals("free_memory")) {
                            c2 = 15;
                            break;
                        }
                        break;
                    case 3355:
                        if (k0.equals(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                            c2 = 16;
                            break;
                        }
                        break;
                    case 3373707:
                        if (k0.equals("name")) {
                            c2 = 17;
                            break;
                        }
                        break;
                    case 59142220:
                        if (k0.equals("low_memory")) {
                            c2 = 18;
                            break;
                        }
                        break;
                    case 93076189:
                        if (k0.equals("archs")) {
                            c2 = 19;
                            break;
                        }
                        break;
                    case 93997959:
                        if (k0.equals("brand")) {
                            c2 = 20;
                            break;
                        }
                        break;
                    case 104069929:
                        if (k0.equals("model")) {
                            c2 = 21;
                            break;
                        }
                        break;
                    case 115746789:
                        if (k0.equals("cpu_description")) {
                            c2 = 22;
                            break;
                        }
                        break;
                    case 244497903:
                        if (k0.equals("processor_frequency")) {
                            c2 = 23;
                            break;
                        }
                        break;
                    case 731866107:
                        if (k0.equals("connection_type")) {
                            c2 = 24;
                            break;
                        }
                        break;
                    case 817830969:
                        if (k0.equals("screen_width_pixels")) {
                            c2 = 25;
                            break;
                        }
                        break;
                    case 823882553:
                        if (k0.equals("external_storage_size")) {
                            c2 = 26;
                            break;
                        }
                        break;
                    case 897428293:
                        if (k0.equals("storage_size")) {
                            c2 = 27;
                            break;
                        }
                        break;
                    case 1331465768:
                        if (k0.equals("usable_memory")) {
                            c2 = 28;
                            break;
                        }
                        break;
                    case 1418777727:
                        if (k0.equals("memory_size")) {
                            c2 = 29;
                            break;
                        }
                        break;
                    case 1436115569:
                        if (k0.equals("charging")) {
                            c2 = 30;
                            break;
                        }
                        break;
                    case 1450613660:
                        if (k0.equals("external_free_storage")) {
                            c2 = 31;
                            break;
                        }
                        break;
                    case 1524159400:
                        if (k0.equals("free_storage")) {
                            c2 = ' ';
                            break;
                        }
                        break;
                    case 1556284978:
                        if (k0.equals("screen_height_pixels")) {
                            c2 = '!';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        eVar.E = n2Var.U0(w1Var);
                        break;
                    case 1:
                        if (n2Var.w0() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            eVar.D = n2Var.J0(w1Var);
                            break;
                        }
                    case 2:
                        eVar.q = n2Var.I0();
                        break;
                    case 3:
                        eVar.f19110g = n2Var.T0();
                        break;
                    case 4:
                        eVar.G = n2Var.T0();
                        break;
                    case 5:
                        eVar.K = n2Var.N0();
                        break;
                    case 6:
                        eVar.p = (b) n2Var.S0(w1Var, new b.a());
                        break;
                    case 7:
                        eVar.J = n2Var.M0();
                        break;
                    case '\b':
                        eVar.f19112i = n2Var.T0();
                        break;
                    case '\t':
                        eVar.H = n2Var.T0();
                        break;
                    case '\n':
                        eVar.o = n2Var.I0();
                        break;
                    case 11:
                        eVar.m = n2Var.M0();
                        break;
                    case '\f':
                        eVar.f19114k = n2Var.T0();
                        break;
                    case '\r':
                        eVar.B = n2Var.M0();
                        break;
                    case 14:
                        eVar.C = n2Var.N0();
                        break;
                    case 15:
                        eVar.s = n2Var.P0();
                        break;
                    case 16:
                        eVar.F = n2Var.T0();
                        break;
                    case 17:
                        eVar.f19109f = n2Var.T0();
                        break;
                    case 18:
                        eVar.u = n2Var.I0();
                        break;
                    case 19:
                        List list = (List) n2Var.R0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            eVar.l = strArr;
                            break;
                        }
                    case 20:
                        eVar.f19111h = n2Var.T0();
                        break;
                    case 21:
                        eVar.f19113j = n2Var.T0();
                        break;
                    case 22:
                        eVar.M = n2Var.T0();
                        break;
                    case 23:
                        eVar.L = n2Var.K0();
                        break;
                    case 24:
                        eVar.I = n2Var.T0();
                        break;
                    case 25:
                        eVar.z = n2Var.N0();
                        break;
                    case 26:
                        eVar.x = n2Var.P0();
                        break;
                    case 27:
                        eVar.v = n2Var.P0();
                        break;
                    case 28:
                        eVar.t = n2Var.P0();
                        break;
                    case 29:
                        eVar.r = n2Var.P0();
                        break;
                    case 30:
                        eVar.n = n2Var.I0();
                        break;
                    case 31:
                        eVar.y = n2Var.P0();
                        break;
                    case ' ':
                        eVar.w = n2Var.P0();
                        break;
                    case '!':
                        eVar.A = n2Var.N0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            eVar.s0(concurrentHashMap);
            n2Var.D();
            return eVar;
        }
    }

    /* compiled from: Device.java */
    /* loaded from: classes2.dex */
    public enum b implements r2 {
        PORTRAIT,
        LANDSCAPE;

        /* compiled from: Device.java */
        /* loaded from: classes2.dex */
        public static final class a implements l2<b> {
            @Override // io.sentry.l2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(n2 n2Var, w1 w1Var) throws Exception {
                return b.valueOf(n2Var.u0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.r2
        public void serialize(h3 h3Var, w1 w1Var) throws IOException {
            h3Var.b(toString().toLowerCase(Locale.ROOT));
        }
    }

    public e() {
    }

    public String I() {
        return this.I;
    }

    public String J() {
        return this.F;
    }

    public String K() {
        return this.G;
    }

    public String L() {
        return this.H;
    }

    public void M(String[] strArr) {
        this.l = strArr;
    }

    public void N(Float f2) {
        this.m = f2;
    }

    public void O(Float f2) {
        this.J = f2;
    }

    public void P(Date date) {
        this.D = date;
    }

    public void Q(String str) {
        this.f19111h = str;
    }

    public void R(Boolean bool) {
        this.n = bool;
    }

    public void S(String str) {
        this.I = str;
    }

    public void T(Long l) {
        this.y = l;
    }

    public void U(Long l) {
        this.x = l;
    }

    public void V(String str) {
        this.f19112i = str;
    }

    public void W(Long l) {
        this.s = l;
    }

    public void X(Long l) {
        this.w = l;
    }

    public void Y(String str) {
        this.F = str;
    }

    public void Z(String str) {
        this.G = str;
    }

    public void a0(String str) {
        this.H = str;
    }

    public void b0(Boolean bool) {
        this.u = bool;
    }

    public void c0(String str) {
        this.f19110g = str;
    }

    public void d0(Long l) {
        this.r = l;
    }

    public void e0(String str) {
        this.f19113j = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return io.sentry.util.q.a(this.f19109f, eVar.f19109f) && io.sentry.util.q.a(this.f19110g, eVar.f19110g) && io.sentry.util.q.a(this.f19111h, eVar.f19111h) && io.sentry.util.q.a(this.f19112i, eVar.f19112i) && io.sentry.util.q.a(this.f19113j, eVar.f19113j) && io.sentry.util.q.a(this.f19114k, eVar.f19114k) && Arrays.equals(this.l, eVar.l) && io.sentry.util.q.a(this.m, eVar.m) && io.sentry.util.q.a(this.n, eVar.n) && io.sentry.util.q.a(this.o, eVar.o) && this.p == eVar.p && io.sentry.util.q.a(this.q, eVar.q) && io.sentry.util.q.a(this.r, eVar.r) && io.sentry.util.q.a(this.s, eVar.s) && io.sentry.util.q.a(this.t, eVar.t) && io.sentry.util.q.a(this.u, eVar.u) && io.sentry.util.q.a(this.v, eVar.v) && io.sentry.util.q.a(this.w, eVar.w) && io.sentry.util.q.a(this.x, eVar.x) && io.sentry.util.q.a(this.y, eVar.y) && io.sentry.util.q.a(this.z, eVar.z) && io.sentry.util.q.a(this.A, eVar.A) && io.sentry.util.q.a(this.B, eVar.B) && io.sentry.util.q.a(this.C, eVar.C) && io.sentry.util.q.a(this.D, eVar.D) && io.sentry.util.q.a(this.F, eVar.F) && io.sentry.util.q.a(this.G, eVar.G) && io.sentry.util.q.a(this.H, eVar.H) && io.sentry.util.q.a(this.I, eVar.I) && io.sentry.util.q.a(this.J, eVar.J) && io.sentry.util.q.a(this.K, eVar.K) && io.sentry.util.q.a(this.L, eVar.L) && io.sentry.util.q.a(this.M, eVar.M);
    }

    public void f0(String str) {
        this.f19114k = str;
    }

    public void g0(String str) {
        this.f19109f = str;
    }

    public void h0(Boolean bool) {
        this.o = bool;
    }

    public int hashCode() {
        return (io.sentry.util.q.b(this.f19109f, this.f19110g, this.f19111h, this.f19112i, this.f19113j, this.f19114k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M) * 31) + Arrays.hashCode(this.l);
    }

    public void i0(b bVar) {
        this.p = bVar;
    }

    public void j0(Integer num) {
        this.K = num;
    }

    public void k0(Double d2) {
        this.L = d2;
    }

    public void l0(Float f2) {
        this.B = f2;
    }

    public void m0(Integer num) {
        this.C = num;
    }

    public void n0(Integer num) {
        this.A = num;
    }

    public void o0(Integer num) {
        this.z = num;
    }

    public void p0(Boolean bool) {
        this.q = bool;
    }

    public void q0(Long l) {
        this.v = l;
    }

    public void r0(TimeZone timeZone) {
        this.E = timeZone;
    }

    public void s0(Map<String, Object> map) {
        this.N = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19109f != null) {
            h3Var.k("name").b(this.f19109f);
        }
        if (this.f19110g != null) {
            h3Var.k("manufacturer").b(this.f19110g);
        }
        if (this.f19111h != null) {
            h3Var.k("brand").b(this.f19111h);
        }
        if (this.f19112i != null) {
            h3Var.k("family").b(this.f19112i);
        }
        if (this.f19113j != null) {
            h3Var.k("model").b(this.f19113j);
        }
        if (this.f19114k != null) {
            h3Var.k("model_id").b(this.f19114k);
        }
        if (this.l != null) {
            h3Var.k("archs").g(w1Var, this.l);
        }
        if (this.m != null) {
            h3Var.k("battery_level").e(this.m);
        }
        if (this.n != null) {
            h3Var.k("charging").h(this.n);
        }
        if (this.o != null) {
            h3Var.k("online").h(this.o);
        }
        if (this.p != null) {
            h3Var.k("orientation").g(w1Var, this.p);
        }
        if (this.q != null) {
            h3Var.k("simulator").h(this.q);
        }
        if (this.r != null) {
            h3Var.k("memory_size").e(this.r);
        }
        if (this.s != null) {
            h3Var.k("free_memory").e(this.s);
        }
        if (this.t != null) {
            h3Var.k("usable_memory").e(this.t);
        }
        if (this.u != null) {
            h3Var.k("low_memory").h(this.u);
        }
        if (this.v != null) {
            h3Var.k("storage_size").e(this.v);
        }
        if (this.w != null) {
            h3Var.k("free_storage").e(this.w);
        }
        if (this.x != null) {
            h3Var.k("external_storage_size").e(this.x);
        }
        if (this.y != null) {
            h3Var.k("external_free_storage").e(this.y);
        }
        if (this.z != null) {
            h3Var.k("screen_width_pixels").e(this.z);
        }
        if (this.A != null) {
            h3Var.k("screen_height_pixels").e(this.A);
        }
        if (this.B != null) {
            h3Var.k("screen_density").e(this.B);
        }
        if (this.C != null) {
            h3Var.k("screen_dpi").e(this.C);
        }
        if (this.D != null) {
            h3Var.k("boot_time").g(w1Var, this.D);
        }
        if (this.E != null) {
            h3Var.k("timezone").g(w1Var, this.E);
        }
        if (this.F != null) {
            h3Var.k(DeepLinkIntentReceiver.DeepLinksKeys.ID).b(this.F);
        }
        if (this.G != null) {
            h3Var.k("language").b(this.G);
        }
        if (this.I != null) {
            h3Var.k("connection_type").b(this.I);
        }
        if (this.J != null) {
            h3Var.k("battery_temperature").e(this.J);
        }
        if (this.H != null) {
            h3Var.k("locale").b(this.H);
        }
        if (this.K != null) {
            h3Var.k("processor_count").e(this.K);
        }
        if (this.L != null) {
            h3Var.k("processor_frequency").e(this.L);
        }
        if (this.M != null) {
            h3Var.k("cpu_description").b(this.M);
        }
        Map<String, Object> map = this.N;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.N.get(str));
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(e eVar) {
        this.f19109f = eVar.f19109f;
        this.f19110g = eVar.f19110g;
        this.f19111h = eVar.f19111h;
        this.f19112i = eVar.f19112i;
        this.f19113j = eVar.f19113j;
        this.f19114k = eVar.f19114k;
        this.n = eVar.n;
        this.o = eVar.o;
        this.p = eVar.p;
        this.q = eVar.q;
        this.r = eVar.r;
        this.s = eVar.s;
        this.t = eVar.t;
        this.u = eVar.u;
        this.v = eVar.v;
        this.w = eVar.w;
        this.x = eVar.x;
        this.y = eVar.y;
        this.z = eVar.z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.F = eVar.F;
        this.G = eVar.G;
        this.I = eVar.I;
        this.J = eVar.J;
        this.m = eVar.m;
        String[] strArr = eVar.l;
        this.l = strArr != null ? (String[]) strArr.clone() : null;
        this.H = eVar.H;
        TimeZone timeZone = eVar.E;
        this.E = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.K = eVar.K;
        this.L = eVar.L;
        this.M = eVar.M;
        this.N = io.sentry.util.i.b(eVar.N);
    }
}
