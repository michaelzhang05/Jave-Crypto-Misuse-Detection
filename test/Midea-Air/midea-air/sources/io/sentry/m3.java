package io.sentry;

import io.sentry.n3;
import io.sentry.profilemeasurements.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfilingTraceData.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class m3 implements r2 {
    private String A;
    private String B;
    private String C;
    private String D;
    private final Map<String, io.sentry.profilemeasurements.a> E;
    private String F;
    private Map<String, Object> G;

    /* renamed from: f, reason: collision with root package name */
    private final File f19021f;

    /* renamed from: g, reason: collision with root package name */
    private final Callable<List<Integer>> f19022g;

    /* renamed from: h, reason: collision with root package name */
    private int f19023h;

    /* renamed from: i, reason: collision with root package name */
    private String f19024i;

    /* renamed from: j, reason: collision with root package name */
    private String f19025j;

    /* renamed from: k, reason: collision with root package name */
    private String f19026k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;
    private List<Integer> q;
    private String r;
    private String s;
    private String t;
    private List<n3> u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    /* compiled from: ProfilingTraceData.java */
    /* loaded from: classes2.dex */
    public static final class b implements l2<m3> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m3 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            ConcurrentHashMap concurrentHashMap = null;
            m3 m3Var = new m3();
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -2133529830:
                        if (k0.equals("device_manufacturer")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1981468849:
                        if (k0.equals("android_api_level")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1430655860:
                        if (k0.equals("build_id")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1172160413:
                        if (k0.equals("device_locale")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1102636175:
                        if (k0.equals("profile_id")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -716656436:
                        if (k0.equals("device_os_build_number")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -591076352:
                        if (k0.equals("device_model")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -512511455:
                        if (k0.equals("device_is_emulator")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -478065584:
                        if (k0.equals("duration_ns")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case -362243017:
                        if (k0.equals("measurements")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case -332426004:
                        if (k0.equals("device_physical_memory_bytes")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case -212264198:
                        if (k0.equals("device_cpu_frequencies")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case -102985484:
                        if (k0.equals("version_code")) {
                            c2 = '\f';
                            break;
                        }
                        break;
                    case -102670958:
                        if (k0.equals("version_name")) {
                            c2 = '\r';
                            break;
                        }
                        break;
                    case -85904877:
                        if (k0.equals("environment")) {
                            c2 = 14;
                            break;
                        }
                        break;
                    case 508853068:
                        if (k0.equals("transaction_name")) {
                            c2 = 15;
                            break;
                        }
                        break;
                    case 796476189:
                        if (k0.equals("device_os_name")) {
                            c2 = 16;
                            break;
                        }
                        break;
                    case 839674195:
                        if (k0.equals("architecture")) {
                            c2 = 17;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (k0.equals("transaction_id")) {
                            c2 = 18;
                            break;
                        }
                        break;
                    case 1052553990:
                        if (k0.equals("device_os_version")) {
                            c2 = 19;
                            break;
                        }
                        break;
                    case 1163928186:
                        if (k0.equals("truncation_reason")) {
                            c2 = 20;
                            break;
                        }
                        break;
                    case 1270300245:
                        if (k0.equals("trace_id")) {
                            c2 = 21;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (k0.equals("platform")) {
                            c2 = 22;
                            break;
                        }
                        break;
                    case 1953158756:
                        if (k0.equals("sampled_profile")) {
                            c2 = 23;
                            break;
                        }
                        break;
                    case 1954122069:
                        if (k0.equals("transactions")) {
                            c2 = 24;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        String T0 = n2Var.T0();
                        if (T0 == null) {
                            break;
                        } else {
                            m3Var.f19025j = T0;
                            break;
                        }
                    case 1:
                        Integer N0 = n2Var.N0();
                        if (N0 == null) {
                            break;
                        } else {
                            m3Var.f19023h = N0.intValue();
                            break;
                        }
                    case 2:
                        String T02 = n2Var.T0();
                        if (T02 == null) {
                            break;
                        } else {
                            m3Var.t = T02;
                            break;
                        }
                    case 3:
                        String T03 = n2Var.T0();
                        if (T03 == null) {
                            break;
                        } else {
                            m3Var.f19024i = T03;
                            break;
                        }
                    case 4:
                        String T04 = n2Var.T0();
                        if (T04 == null) {
                            break;
                        } else {
                            m3Var.B = T04;
                            break;
                        }
                    case 5:
                        String T05 = n2Var.T0();
                        if (T05 == null) {
                            break;
                        } else {
                            m3Var.l = T05;
                            break;
                        }
                    case 6:
                        String T06 = n2Var.T0();
                        if (T06 == null) {
                            break;
                        } else {
                            m3Var.f19026k = T06;
                            break;
                        }
                    case 7:
                        Boolean I0 = n2Var.I0();
                        if (I0 == null) {
                            break;
                        } else {
                            m3Var.o = I0.booleanValue();
                            break;
                        }
                    case '\b':
                        String T07 = n2Var.T0();
                        if (T07 == null) {
                            break;
                        } else {
                            m3Var.w = T07;
                            break;
                        }
                    case '\t':
                        Map Q0 = n2Var.Q0(w1Var, new a.C0266a());
                        if (Q0 == null) {
                            break;
                        } else {
                            m3Var.E.putAll(Q0);
                            break;
                        }
                    case '\n':
                        String T08 = n2Var.T0();
                        if (T08 == null) {
                            break;
                        } else {
                            m3Var.r = T08;
                            break;
                        }
                    case 11:
                        List list = (List) n2Var.R0();
                        if (list == null) {
                            break;
                        } else {
                            m3Var.q = list;
                            break;
                        }
                    case '\f':
                        String T09 = n2Var.T0();
                        if (T09 == null) {
                            break;
                        } else {
                            m3Var.x = T09;
                            break;
                        }
                    case '\r':
                        String T010 = n2Var.T0();
                        if (T010 == null) {
                            break;
                        } else {
                            m3Var.y = T010;
                            break;
                        }
                    case 14:
                        String T011 = n2Var.T0();
                        if (T011 == null) {
                            break;
                        } else {
                            m3Var.C = T011;
                            break;
                        }
                    case 15:
                        String T012 = n2Var.T0();
                        if (T012 == null) {
                            break;
                        } else {
                            m3Var.v = T012;
                            break;
                        }
                    case 16:
                        String T013 = n2Var.T0();
                        if (T013 == null) {
                            break;
                        } else {
                            m3Var.m = T013;
                            break;
                        }
                    case 17:
                        String T014 = n2Var.T0();
                        if (T014 == null) {
                            break;
                        } else {
                            m3Var.p = T014;
                            break;
                        }
                    case 18:
                        String T015 = n2Var.T0();
                        if (T015 == null) {
                            break;
                        } else {
                            m3Var.z = T015;
                            break;
                        }
                    case 19:
                        String T016 = n2Var.T0();
                        if (T016 == null) {
                            break;
                        } else {
                            m3Var.n = T016;
                            break;
                        }
                    case 20:
                        String T017 = n2Var.T0();
                        if (T017 == null) {
                            break;
                        } else {
                            m3Var.D = T017;
                            break;
                        }
                    case 21:
                        String T018 = n2Var.T0();
                        if (T018 == null) {
                            break;
                        } else {
                            m3Var.A = T018;
                            break;
                        }
                    case 22:
                        String T019 = n2Var.T0();
                        if (T019 == null) {
                            break;
                        } else {
                            m3Var.s = T019;
                            break;
                        }
                    case 23:
                        String T020 = n2Var.T0();
                        if (T020 == null) {
                            break;
                        } else {
                            m3Var.F = T020;
                            break;
                        }
                    case 24:
                        List O0 = n2Var.O0(w1Var, new n3.a());
                        if (O0 == null) {
                            break;
                        } else {
                            m3Var.u.addAll(O0);
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            m3Var.F(concurrentHashMap);
            n2Var.D();
            return m3Var;
        }
    }

    private boolean B() {
        return this.D.equals("normal") || this.D.equals("timeout") || this.D.equals("backgrounded");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List C() throws Exception {
        return new ArrayList();
    }

    public File A() {
        return this.f19021f;
    }

    public void D() {
        try {
            this.q = this.f19022g.call();
        } catch (Throwable unused) {
        }
    }

    public void E(String str) {
        this.F = str;
    }

    public void F(Map<String, Object> map) {
        this.G = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("android_api_level").g(w1Var, Integer.valueOf(this.f19023h));
        h3Var.k("device_locale").g(w1Var, this.f19024i);
        h3Var.k("device_manufacturer").b(this.f19025j);
        h3Var.k("device_model").b(this.f19026k);
        h3Var.k("device_os_build_number").b(this.l);
        h3Var.k("device_os_name").b(this.m);
        h3Var.k("device_os_version").b(this.n);
        h3Var.k("device_is_emulator").c(this.o);
        h3Var.k("architecture").g(w1Var, this.p);
        h3Var.k("device_cpu_frequencies").g(w1Var, this.q);
        h3Var.k("device_physical_memory_bytes").b(this.r);
        h3Var.k("platform").b(this.s);
        h3Var.k("build_id").b(this.t);
        h3Var.k("transaction_name").b(this.v);
        h3Var.k("duration_ns").b(this.w);
        h3Var.k("version_name").b(this.y);
        h3Var.k("version_code").b(this.x);
        if (!this.u.isEmpty()) {
            h3Var.k("transactions").g(w1Var, this.u);
        }
        h3Var.k("transaction_id").b(this.z);
        h3Var.k("trace_id").b(this.A);
        h3Var.k("profile_id").b(this.B);
        h3Var.k("environment").b(this.C);
        h3Var.k("truncation_reason").b(this.D);
        if (this.F != null) {
            h3Var.k("sampled_profile").b(this.F);
        }
        h3Var.k("measurements").g(w1Var, this.E);
        Map<String, Object> map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.G.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public String z() {
        return this.B;
    }

    private m3() {
        this(new File("dummy"), d3.r());
    }

    public m3(File file, e2 e2Var) {
        this(file, new ArrayList(), e2Var, "0", 0, HttpUrl.FRAGMENT_ENCODE_SET, new Callable() { // from class: io.sentry.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m3.C();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public m3(File file, List<n3> list, e2 e2Var, String str, int i2, String str2, Callable<List<Integer>> callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, Map<String, io.sentry.profilemeasurements.a> map) {
        this.q = new ArrayList();
        this.F = null;
        this.f19021f = file;
        this.p = str2;
        this.f19022g = callable;
        this.f19023h = i2;
        this.f19024i = Locale.getDefault().toString();
        String str11 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f19025j = str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f19026k = str4 != null ? str4 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.n = str5 != null ? str5 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.o = bool != null ? bool.booleanValue() : false;
        this.r = str6 != null ? str6 : "0";
        this.l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.m = "android";
        this.s = "android";
        this.t = str7 != null ? str7 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.u = list;
        this.v = e2Var.getName();
        this.w = str;
        this.x = HttpUrl.FRAGMENT_ENCODE_SET;
        this.y = str8 != null ? str8 : str11;
        this.z = e2Var.k().toString();
        this.A = e2Var.m().k().toString();
        this.B = UUID.randomUUID().toString();
        this.C = str9 != null ? str9 : "production";
        this.D = str10;
        if (!B()) {
            this.D = "normal";
        }
        this.E = map;
    }
}
