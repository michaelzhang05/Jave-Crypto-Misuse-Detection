package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SpanContext.java */
/* loaded from: classes2.dex */
public class f5 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.q f18937f;

    /* renamed from: g, reason: collision with root package name */
    private final h5 f18938g;

    /* renamed from: h, reason: collision with root package name */
    private final h5 f18939h;

    /* renamed from: i, reason: collision with root package name */
    private transient q5 f18940i;

    /* renamed from: j, reason: collision with root package name */
    protected String f18941j;

    /* renamed from: k, reason: collision with root package name */
    protected String f18942k;
    protected j5 l;
    protected Map<String, String> m;
    protected String n;
    private Map<String, Object> o;

    /* compiled from: SpanContext.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<f5> {
        /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x007f A[SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.f5 a(io.sentry.n2 r13, io.sentry.w1 r14) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.f5.a.a(io.sentry.n2, io.sentry.w1):io.sentry.f5");
        }
    }

    public f5(String str) {
        this(new io.sentry.protocol.q(), new h5(), str, null, null);
    }

    public String a() {
        return this.f18942k;
    }

    public String b() {
        return this.f18941j;
    }

    public String c() {
        return this.n;
    }

    public h5 d() {
        return this.f18939h;
    }

    public Boolean e() {
        q5 q5Var = this.f18940i;
        if (q5Var == null) {
            return null;
        }
        return q5Var.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return this.f18937f.equals(f5Var.f18937f) && this.f18938g.equals(f5Var.f18938g) && io.sentry.util.q.a(this.f18939h, f5Var.f18939h) && this.f18941j.equals(f5Var.f18941j) && io.sentry.util.q.a(this.f18942k, f5Var.f18942k) && this.l == f5Var.l;
    }

    public Boolean f() {
        q5 q5Var = this.f18940i;
        if (q5Var == null) {
            return null;
        }
        return q5Var.c();
    }

    public q5 g() {
        return this.f18940i;
    }

    public h5 h() {
        return this.f18938g;
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f18937f, this.f18938g, this.f18939h, this.f18941j, this.f18942k, this.l);
    }

    public j5 i() {
        return this.l;
    }

    public Map<String, String> j() {
        return this.m;
    }

    public io.sentry.protocol.q k() {
        return this.f18937f;
    }

    public void l(String str) {
        this.f18942k = str;
    }

    public void m(String str) {
        this.n = str;
    }

    @ApiStatus.Internal
    public void n(q5 q5Var) {
        this.f18940i = q5Var;
    }

    public void o(j5 j5Var) {
        this.l = j5Var;
    }

    public void p(Map<String, Object> map) {
        this.o = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("trace_id");
        this.f18937f.serialize(h3Var, w1Var);
        h3Var.k("span_id");
        this.f18938g.serialize(h3Var, w1Var);
        if (this.f18939h != null) {
            h3Var.k("parent_span_id");
            this.f18939h.serialize(h3Var, w1Var);
        }
        h3Var.k("op").b(this.f18941j);
        if (this.f18942k != null) {
            h3Var.k("description").b(this.f18942k);
        }
        if (this.l != null) {
            h3Var.k("status").g(w1Var, this.l);
        }
        if (this.n != null) {
            h3Var.k("origin").g(w1Var, this.n);
        }
        if (!this.m.isEmpty()) {
            h3Var.k("tags").g(w1Var, this.m);
        }
        Map<String, Object> map = this.o;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.o.get(str));
            }
        }
        h3Var.d();
    }

    public f5(io.sentry.protocol.q qVar, h5 h5Var, String str, h5 h5Var2, q5 q5Var) {
        this(qVar, h5Var, h5Var2, str, null, q5Var, null, "manual");
    }

    @ApiStatus.Internal
    public f5(io.sentry.protocol.q qVar, h5 h5Var, h5 h5Var2, String str, String str2, q5 q5Var, j5 j5Var, String str3) {
        this.m = new ConcurrentHashMap();
        this.n = "manual";
        this.f18937f = (io.sentry.protocol.q) io.sentry.util.q.c(qVar, "traceId is required");
        this.f18938g = (h5) io.sentry.util.q.c(h5Var, "spanId is required");
        this.f18941j = (String) io.sentry.util.q.c(str, "operation is required");
        this.f18939h = h5Var2;
        this.f18940i = q5Var;
        this.f18942k = str2;
        this.l = j5Var;
        this.n = str3;
    }

    public f5(f5 f5Var) {
        this.m = new ConcurrentHashMap();
        this.n = "manual";
        this.f18937f = f5Var.f18937f;
        this.f18938g = f5Var.f18938g;
        this.f18939h = f5Var.f18939h;
        this.f18940i = f5Var.f18940i;
        this.f18941j = f5Var.f18941j;
        this.f18942k = f5Var.f18942k;
        this.l = f5Var.l;
        Map<String, String> b2 = io.sentry.util.i.b(f5Var.m);
        if (b2 != null) {
            this.m = b2;
        }
    }
}
