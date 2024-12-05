package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeItemHeader.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class k4 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final String f18991f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18992g;

    /* renamed from: h, reason: collision with root package name */
    private final r4 f18993h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18994i;

    /* renamed from: j, reason: collision with root package name */
    private final Callable<Integer> f18995j;

    /* renamed from: k, reason: collision with root package name */
    private final String f18996k;
    private Map<String, Object> l;

    /* compiled from: SentryEnvelopeItemHeader.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<k4> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.k4 a(io.sentry.n2 r12, io.sentry.w1 r13) throws java.lang.Exception {
            /*
                r11 = this;
                r12.b()
                r0 = 0
                r1 = 0
                r3 = r1
                r5 = r3
                r6 = r5
                r7 = r6
                r4 = 0
            La:
                io.sentry.vendor.gson.stream.b r2 = r12.w0()
                io.sentry.vendor.gson.stream.b r8 = io.sentry.vendor.gson.stream.b.NAME
                java.lang.String r9 = "type"
                if (r2 != r8) goto L8a
                java.lang.String r2 = r12.k0()
                r2.hashCode()
                r8 = -1
                int r10 = r2.hashCode()
                switch(r10) {
                    case -1106363674: goto L4e;
                    case -734768633: goto L43;
                    case -672977706: goto L38;
                    case 3575610: goto L2f;
                    case 831846208: goto L24;
                    default: goto L23;
                }
            L23:
                goto L58
            L24:
                java.lang.String r9 = "content_type"
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L2d
                goto L58
            L2d:
                r8 = 4
                goto L58
            L2f:
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L36
                goto L58
            L36:
                r8 = 3
                goto L58
            L38:
                java.lang.String r9 = "attachment_type"
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L41
                goto L58
            L41:
                r8 = 2
                goto L58
            L43:
                java.lang.String r9 = "filename"
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L4c
                goto L58
            L4c:
                r8 = 1
                goto L58
            L4e:
                java.lang.String r9 = "length"
                boolean r9 = r2.equals(r9)
                if (r9 != 0) goto L57
                goto L58
            L57:
                r8 = 0
            L58:
                switch(r8) {
                    case 0: goto L85;
                    case 1: goto L7f;
                    case 2: goto L79;
                    case 3: goto L6c;
                    case 4: goto L66;
                    default: goto L5b;
                }
            L5b:
                if (r1 != 0) goto L62
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
            L62:
                r12.V0(r13, r1, r2)
                goto La
            L66:
                java.lang.String r2 = r12.T0()
                r5 = r2
                goto La
            L6c:
                io.sentry.r4$a r2 = new io.sentry.r4$a
                r2.<init>()
                java.lang.Object r2 = r12.S0(r13, r2)
                io.sentry.r4 r2 = (io.sentry.r4) r2
                r3 = r2
                goto La
            L79:
                java.lang.String r2 = r12.T0()
                r7 = r2
                goto La
            L7f:
                java.lang.String r2 = r12.T0()
                r6 = r2
                goto La
            L85:
                int r4 = r12.g0()
                goto La
            L8a:
                if (r3 == 0) goto L99
                io.sentry.k4 r13 = new io.sentry.k4
                r2 = r13
                r2.<init>(r3, r4, r5, r6, r7)
                r13.c(r1)
                r12.D()
                return r13
            L99:
                java.lang.Exception r12 = r11.c(r9, r13)
                goto L9f
            L9e:
                throw r12
            L9f:
                goto L9e
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.k4.a.a(io.sentry.n2, io.sentry.w1):io.sentry.k4");
        }
    }

    @ApiStatus.Internal
    public k4(r4 r4Var, int i2, String str, String str2, String str3) {
        this.f18993h = (r4) io.sentry.util.q.c(r4Var, "type is required");
        this.f18991f = str;
        this.f18994i = i2;
        this.f18992g = str2;
        this.f18995j = null;
        this.f18996k = str3;
    }

    public int a() {
        Callable<Integer> callable = this.f18995j;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return -1;
            }
        }
        return this.f18994i;
    }

    public r4 b() {
        return this.f18993h;
    }

    public void c(Map<String, Object> map) {
        this.l = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f18991f != null) {
            h3Var.k("content_type").b(this.f18991f);
        }
        if (this.f18992g != null) {
            h3Var.k("filename").b(this.f18992g);
        }
        h3Var.k("type").g(w1Var, this.f18993h);
        if (this.f18996k != null) {
            h3Var.k("attachment_type").b(this.f18996k);
        }
        h3Var.k("length").a(a());
        Map<String, Object> map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.l.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(r4 r4Var, Callable<Integer> callable, String str, String str2, String str3) {
        this.f18993h = (r4) io.sentry.util.q.c(r4Var, "type is required");
        this.f18991f = str;
        this.f18994i = -1;
        this.f18992g = str2;
        this.f18995j = callable;
        this.f18996k = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(r4 r4Var, Callable<Integer> callable, String str, String str2) {
        this(r4Var, callable, str, str2, (String) null);
    }
}
