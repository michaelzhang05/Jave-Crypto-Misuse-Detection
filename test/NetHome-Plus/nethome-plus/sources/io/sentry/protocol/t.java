package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.e5;
import io.sentry.h3;
import io.sentry.h5;
import io.sentry.j5;
import io.sentry.l2;
import io.sentry.r2;
import io.sentry.s4;
import io.sentry.w1;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentrySpan.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class t implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Double f19181f;

    /* renamed from: g, reason: collision with root package name */
    private final Double f19182g;

    /* renamed from: h, reason: collision with root package name */
    private final q f19183h;

    /* renamed from: i, reason: collision with root package name */
    private final h5 f19184i;

    /* renamed from: j, reason: collision with root package name */
    private final h5 f19185j;

    /* renamed from: k, reason: collision with root package name */
    private final String f19186k;
    private final String l;
    private final j5 m;
    private final String n;
    private final Map<String, String> o;
    private final Map<String, Object> p;
    private Map<String, Object> q;

    /* compiled from: SentrySpan.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<t> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b5. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.protocol.t a(io.sentry.n2 r22, io.sentry.w1 r23) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 488
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.t.a.a(io.sentry.n2, io.sentry.w1):io.sentry.protocol.t");
        }
    }

    public t(e5 e5Var) {
        this(e5Var, e5Var.r());
    }

    private BigDecimal a(Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public String b() {
        return this.f19186k;
    }

    public void c(Map<String, Object> map) {
        this.q = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("start_timestamp").g(w1Var, a(this.f19181f));
        if (this.f19182g != null) {
            h3Var.k("timestamp").g(w1Var, a(this.f19182g));
        }
        h3Var.k("trace_id").g(w1Var, this.f19183h);
        h3Var.k("span_id").g(w1Var, this.f19184i);
        if (this.f19185j != null) {
            h3Var.k("parent_span_id").g(w1Var, this.f19185j);
        }
        h3Var.k("op").b(this.f19186k);
        if (this.l != null) {
            h3Var.k("description").b(this.l);
        }
        if (this.m != null) {
            h3Var.k("status").g(w1Var, this.m);
        }
        if (this.n != null) {
            h3Var.k("origin").g(w1Var, this.n);
        }
        if (!this.o.isEmpty()) {
            h3Var.k("tags").g(w1Var, this.o);
        }
        if (this.p != null) {
            h3Var.k("data").g(w1Var, this.p);
        }
        Map<String, Object> map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.q.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    @ApiStatus.Internal
    public t(e5 e5Var, Map<String, Object> map) {
        io.sentry.util.q.c(e5Var, "span is required");
        this.l = e5Var.getDescription();
        this.f19186k = e5Var.t();
        this.f19184i = e5Var.x();
        this.f19185j = e5Var.v();
        this.f19183h = e5Var.z();
        this.m = e5Var.getStatus();
        this.n = e5Var.m().c();
        Map<String, String> b2 = io.sentry.util.i.b(e5Var.y());
        this.o = b2 == null ? new ConcurrentHashMap<>() : b2;
        this.f19182g = Double.valueOf(a1.l(e5Var.q().o(e5Var.n())));
        this.f19181f = Double.valueOf(a1.l(e5Var.q().r()));
        this.p = map;
    }

    @ApiStatus.Internal
    public t(Double d2, Double d3, q qVar, h5 h5Var, h5 h5Var2, String str, String str2, j5 j5Var, String str3, Map<String, String> map, Map<String, Object> map2) {
        this.f19181f = d2;
        this.f19182g = d3;
        this.f19183h = qVar;
        this.f19184i = h5Var;
        this.f19185j = h5Var2;
        this.f19186k = str;
        this.l = str2;
        this.m = j5Var;
        this.o = map;
        this.p = map2;
        this.n = str3;
    }
}
