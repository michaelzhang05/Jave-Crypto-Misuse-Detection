package io.sentry;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Baggage.java */
@ApiStatus.Experimental
/* loaded from: classes2.dex */
public final class u0 {
    static final Integer a = 8192;

    /* renamed from: b, reason: collision with root package name */
    static final Integer f19282b = 64;

    /* renamed from: c, reason: collision with root package name */
    final Map<String, String> f19283c;

    /* renamed from: d, reason: collision with root package name */
    final String f19284d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19285e;

    /* renamed from: f, reason: collision with root package name */
    final w1 f19286f;

    /* compiled from: Baggage.java */
    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public static final class a {
        public static final List<String> a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-user_segment", "sentry-transaction", "sentry-sample_rate", "sentry-sampled");
    }

    @ApiStatus.Internal
    public u0(w1 w1Var) {
        this(new HashMap(), null, true, w1Var);
    }

    @ApiStatus.Internal
    public static u0 b(l4 l4Var, x4 x4Var) {
        u0 u0Var = new u0(x4Var.getLogger());
        f5 e2 = l4Var.C().e();
        u0Var.A(e2 != null ? e2.k().toString() : null);
        u0Var.w(new f1(x4Var.getDsn()).a());
        u0Var.x(l4Var.J());
        u0Var.v(l4Var.F());
        io.sentry.protocol.a0 Q = l4Var.Q();
        u0Var.C(Q != null ? j(Q) : null);
        u0Var.B(l4Var.t0());
        u0Var.y(null);
        u0Var.z(null);
        u0Var.a();
        return u0Var;
    }

    private static String j(io.sentry.protocol.a0 a0Var) {
        if (a0Var.m() != null) {
            return a0Var.m();
        }
        Map<String, String> j2 = a0Var.j();
        if (j2 != null) {
            return j2.get("segment");
        }
        return null;
    }

    private static boolean p(io.sentry.protocol.z zVar) {
        return (zVar == null || io.sentry.protocol.z.URL.equals(zVar)) ? false : true;
    }

    private static Double r(q5 q5Var) {
        if (q5Var == null) {
            return null;
        }
        return q5Var.b();
    }

    private static String s(Double d2) {
        if (io.sentry.util.t.e(d2, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d2);
        }
        return null;
    }

    private static Boolean t(q5 q5Var) {
        if (q5Var == null) {
            return null;
        }
        return q5Var.c();
    }

    @ApiStatus.Internal
    public void A(String str) {
        u("sentry-trace_id", str);
    }

    @ApiStatus.Internal
    public void B(String str) {
        u("sentry-transaction", str);
    }

    @ApiStatus.Internal
    public void C(String str) {
        u("sentry-user_segment", str);
    }

    @ApiStatus.Internal
    public void D(s3 s3Var, x4 x4Var) {
        o3 p = s3Var.p();
        io.sentry.protocol.a0 w = s3Var.w();
        A(p.e().toString());
        w(new f1(x4Var.getDsn()).a());
        x(x4Var.getRelease());
        v(x4Var.getEnvironment());
        C(w != null ? j(w) : null);
        B(null);
        y(null);
        z(null);
    }

    @ApiStatus.Internal
    public void E(e2 e2Var, io.sentry.protocol.a0 a0Var, x4 x4Var, q5 q5Var) {
        A(e2Var.m().k().toString());
        w(new f1(x4Var.getDsn()).a());
        x(x4Var.getRelease());
        v(x4Var.getEnvironment());
        C(a0Var != null ? j(a0Var) : null);
        B(p(e2Var.p()) ? e2Var.getName() : null);
        y(s(r(q5Var)));
        z(io.sentry.util.u.f(t(q5Var)));
    }

    @ApiStatus.Internal
    public o5 F() {
        String k2 = k();
        String e2 = e();
        if (k2 == null || e2 == null) {
            return null;
        }
        o5 o5Var = new o5(new io.sentry.protocol.q(k2), e2, f(), d(), n(), o(), l(), g(), i());
        o5Var.b(m());
        return o5Var;
    }

    @ApiStatus.Internal
    public void a() {
        this.f19285e = false;
    }

    @ApiStatus.Internal
    public String c(String str) {
        if (str == null) {
            return null;
        }
        return this.f19283c.get(str);
    }

    @ApiStatus.Internal
    public String d() {
        return c("sentry-environment");
    }

    @ApiStatus.Internal
    public String e() {
        return c("sentry-public_key");
    }

    @ApiStatus.Internal
    public String f() {
        return c("sentry-release");
    }

    @ApiStatus.Internal
    public String g() {
        return c("sentry-sample_rate");
    }

    @ApiStatus.Internal
    public Double h() {
        String g2 = g();
        if (g2 != null) {
            try {
                double parseDouble = Double.parseDouble(g2);
                if (io.sentry.util.t.e(Double.valueOf(parseDouble), false)) {
                    return Double.valueOf(parseDouble);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @ApiStatus.Internal
    public String i() {
        return c("sentry-sampled");
    }

    @ApiStatus.Internal
    public String k() {
        return c("sentry-trace_id");
    }

    @ApiStatus.Internal
    public String l() {
        return c("sentry-transaction");
    }

    @ApiStatus.Internal
    public Map<String, Object> m() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : this.f19283c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!a.a.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst("sentry-", HttpUrl.FRAGMENT_ENCODE_SET), value);
            }
        }
        return concurrentHashMap;
    }

    @ApiStatus.Internal
    public String n() {
        return c("sentry-user_id");
    }

    @ApiStatus.Internal
    public String o() {
        return c("sentry-user_segment");
    }

    @ApiStatus.Internal
    public boolean q() {
        return this.f19285e;
    }

    @ApiStatus.Internal
    public void u(String str, String str2) {
        if (this.f19285e) {
            this.f19283c.put(str, str2);
        }
    }

    @ApiStatus.Internal
    public void v(String str) {
        u("sentry-environment", str);
    }

    @ApiStatus.Internal
    public void w(String str) {
        u("sentry-public_key", str);
    }

    @ApiStatus.Internal
    public void x(String str) {
        u("sentry-release", str);
    }

    @ApiStatus.Internal
    public void y(String str) {
        u("sentry-sample_rate", str);
    }

    @ApiStatus.Internal
    public void z(String str) {
        u("sentry-sampled", str);
    }

    @ApiStatus.Internal
    public u0(u0 u0Var) {
        this(u0Var.f19283c, u0Var.f19284d, u0Var.f19285e, u0Var.f19286f);
    }

    @ApiStatus.Internal
    public u0(Map<String, String> map, String str, boolean z, w1 w1Var) {
        this.f19283c = map;
        this.f19286f = w1Var;
        this.f19285e = z;
        this.f19284d = str;
    }
}
