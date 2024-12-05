package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Session.java */
/* loaded from: classes2.dex */
public final class d5 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Date f18902f;

    /* renamed from: g, reason: collision with root package name */
    private Date f18903g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f18904h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18905i;

    /* renamed from: j, reason: collision with root package name */
    private final UUID f18906j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f18907k;
    private b l;
    private Long m;
    private Double n;
    private final String o;
    private String p;
    private final String q;
    private final String r;
    private String s;
    private final Object t;
    private Map<String, Object> u;

    /* compiled from: Session.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<d5> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00c3. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d5 a(n2 n2Var, w1 w1Var) throws Exception {
            char c2;
            String str;
            char c3;
            n2Var.b();
            Integer num = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l = null;
            Double d2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                String str8 = str5;
                String str9 = str4;
                String str10 = str3;
                Double d3 = d2;
                if (n2Var.w0() != io.sentry.vendor.gson.stream.b.NAME) {
                    Long l2 = l;
                    if (bVar == null) {
                        throw c("status", w1Var);
                    }
                    if (date == null) {
                        throw c("started", w1Var);
                    }
                    if (num == null) {
                        throw c("errors", w1Var);
                    }
                    if (str6 != null) {
                        d5 d5Var = new d5(bVar, date, date2, num.intValue(), str2, uuid, bool, l2, d3, str10, str9, str8, str6, str7);
                        d5Var.o(concurrentHashMap);
                        n2Var.D();
                        return d5Var;
                    }
                    throw c("release", w1Var);
                }
                String k0 = n2Var.k0();
                k0.hashCode();
                Long l3 = l;
                switch (k0.hashCode()) {
                    case -1992012396:
                        if (k0.equals("duration")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1897185151:
                        if (k0.equals("started")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1294635157:
                        if (k0.equals("errors")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -892481550:
                        if (k0.equals("status")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 99455:
                        if (k0.equals("did")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 113759:
                        if (k0.equals("seq")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 113870:
                        if (k0.equals("sid")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 3237136:
                        if (k0.equals("init")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 55126294:
                        if (k0.equals("timestamp")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 93152418:
                        if (k0.equals("attrs")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 213717026:
                        if (k0.equals("abnormal_mechanism")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                }
                c2 = 65535;
                switch (c2) {
                    case 0:
                        d2 = n2Var.K0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        l = l3;
                        break;
                    case 1:
                        date = n2Var.J0(w1Var);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 2:
                        num = n2Var.N0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 3:
                        String b2 = io.sentry.util.u.b(n2Var.T0());
                        if (b2 != null) {
                            bVar = b.valueOf(b2);
                        }
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 4:
                        str2 = n2Var.T0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case 5:
                        l = n2Var.P0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        break;
                    case 6:
                        try {
                            str = n2Var.T0();
                            try {
                                uuid = UUID.fromString(str);
                            } catch (IllegalArgumentException unused) {
                                w1Var.c(s4.ERROR, "%s sid is not valid.", str);
                                str5 = str8;
                                str4 = str9;
                                str3 = str10;
                                d2 = d3;
                                l = l3;
                            }
                        } catch (IllegalArgumentException unused2) {
                            str = null;
                        }
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                    case 7:
                        bool = n2Var.I0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\b':
                        date2 = n2Var.J0(w1Var);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\t':
                        n2Var.b();
                        str4 = str9;
                        str3 = str10;
                        while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String k02 = n2Var.k0();
                            k02.hashCode();
                            switch (k02.hashCode()) {
                                case -85904877:
                                    if (k02.equals("environment")) {
                                        c3 = 0;
                                        break;
                                    }
                                    break;
                                case 1090594823:
                                    if (k02.equals("release")) {
                                        c3 = 1;
                                        break;
                                    }
                                    break;
                                case 1480014044:
                                    if (k02.equals("ip_address")) {
                                        c3 = 2;
                                        break;
                                    }
                                    break;
                                case 1917799825:
                                    if (k02.equals("user_agent")) {
                                        c3 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c3 = 65535;
                            switch (c3) {
                                case 0:
                                    str8 = n2Var.T0();
                                    break;
                                case 1:
                                    str6 = n2Var.T0();
                                    break;
                                case 2:
                                    str3 = n2Var.T0();
                                    break;
                                case 3:
                                    str4 = n2Var.T0();
                                    break;
                                default:
                                    n2Var.F0();
                                    break;
                            }
                        }
                        n2Var.D();
                        str5 = str8;
                        d2 = d3;
                        l = l3;
                        break;
                    case '\n':
                        str7 = n2Var.T0();
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        str5 = str8;
                        str4 = str9;
                        str3 = str10;
                        d2 = d3;
                        l = l3;
                        break;
                }
            }
        }
    }

    /* compiled from: Session.java */
    /* loaded from: classes2.dex */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public d5(b bVar, Date date, Date date2, int i2, String str, UUID uuid, Boolean bool, Long l, Double d2, String str2, String str3, String str4, String str5, String str6) {
        this.t = new Object();
        this.l = bVar;
        this.f18902f = date;
        this.f18903g = date2;
        this.f18904h = new AtomicInteger(i2);
        this.f18905i = str;
        this.f18906j = uuid;
        this.f18907k = bool;
        this.m = l;
        this.n = d2;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = str5;
        this.s = str6;
    }

    private double a(Date date) {
        double abs = Math.abs(date.getTime() - this.f18902f.getTime());
        Double.isNaN(abs);
        return abs / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d5 clone() {
        return new d5(this.l, this.f18902f, this.f18903g, this.f18904h.get(), this.f18905i, this.f18906j, this.f18907k, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public void c() {
        d(a1.c());
    }

    public void d(Date date) {
        synchronized (this.t) {
            this.f18907k = null;
            if (this.l == b.Ok) {
                this.l = b.Exited;
            }
            if (date != null) {
                this.f18903g = date;
            } else {
                this.f18903g = a1.c();
            }
            Date date2 = this.f18903g;
            if (date2 != null) {
                this.n = Double.valueOf(a(date2));
                this.m = Long.valueOf(i(this.f18903g));
            }
        }
    }

    public int e() {
        return this.f18904h.get();
    }

    public String f() {
        return this.s;
    }

    public Boolean g() {
        return this.f18907k;
    }

    public String h() {
        return this.r;
    }

    public UUID j() {
        return this.f18906j;
    }

    public Date k() {
        Date date = this.f18902f;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.l;
    }

    public boolean m() {
        return this.l != b.Ok;
    }

    @ApiStatus.Internal
    public void n() {
        this.f18907k = Boolean.TRUE;
    }

    public void o(Map<String, Object> map) {
        this.u = map;
    }

    public boolean p(b bVar, String str, boolean z) {
        return q(bVar, str, z, null);
    }

    public boolean q(b bVar, String str, boolean z, String str2) {
        boolean z2;
        synchronized (this.t) {
            boolean z3 = false;
            z2 = true;
            if (bVar != null) {
                try {
                    this.l = bVar;
                    z3 = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str != null) {
                this.p = str;
                z3 = true;
            }
            if (z) {
                this.f18904h.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.s = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f18907k = null;
                Date c2 = a1.c();
                this.f18903g = c2;
                if (c2 != null) {
                    this.m = Long.valueOf(i(c2));
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f18906j != null) {
            h3Var.k("sid").b(this.f18906j.toString());
        }
        if (this.f18905i != null) {
            h3Var.k("did").b(this.f18905i);
        }
        if (this.f18907k != null) {
            h3Var.k("init").h(this.f18907k);
        }
        h3Var.k("started").g(w1Var, this.f18902f);
        h3Var.k("status").g(w1Var, this.l.name().toLowerCase(Locale.ROOT));
        if (this.m != null) {
            h3Var.k("seq").e(this.m);
        }
        h3Var.k("errors").a(this.f18904h.intValue());
        if (this.n != null) {
            h3Var.k("duration").e(this.n);
        }
        if (this.f18903g != null) {
            h3Var.k("timestamp").g(w1Var, this.f18903g);
        }
        if (this.s != null) {
            h3Var.k("abnormal_mechanism").g(w1Var, this.s);
        }
        h3Var.k("attrs");
        h3Var.f();
        h3Var.k("release").g(w1Var, this.r);
        if (this.q != null) {
            h3Var.k("environment").g(w1Var, this.q);
        }
        if (this.o != null) {
            h3Var.k("ip_address").g(w1Var, this.o);
        }
        if (this.p != null) {
            h3Var.k("user_agent").g(w1Var, this.p);
        }
        h3Var.d();
        Map<String, Object> map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.u.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public d5(String str, io.sentry.protocol.a0 a0Var, String str2, String str3) {
        this(b.Ok, a1.c(), a1.c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, a0Var != null ? a0Var.l() : null, null, str2, str3, null);
    }
}
