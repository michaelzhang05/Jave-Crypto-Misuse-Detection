package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.q4;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* compiled from: SdkVersion.java */
/* loaded from: classes2.dex */
public final class o implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19161f;

    /* renamed from: g, reason: collision with root package name */
    private String f19162g;

    /* renamed from: h, reason: collision with root package name */
    private Set<r> f19163h;

    /* renamed from: i, reason: collision with root package name */
    private Set<String> f19164i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f19165j;

    /* compiled from: SdkVersion.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<o> {
        /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0056 A[SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.protocol.o a(io.sentry.n2 r9, io.sentry.w1 r10) throws java.lang.Exception {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r9.b()
                r2 = 0
                r3 = r2
                r4 = r3
            L10:
                io.sentry.vendor.gson.stream.b r5 = r9.w0()
                io.sentry.vendor.gson.stream.b r6 = io.sentry.vendor.gson.stream.b.NAME
                if (r5 != r6) goto L86
                java.lang.String r5 = r9.k0()
                r5.hashCode()
                r6 = -1
                int r7 = r5.hashCode()
                switch(r7) {
                    case 3373707: goto L49;
                    case 351608024: goto L3e;
                    case 750867693: goto L33;
                    case 1487029535: goto L28;
                    default: goto L27;
                }
            L27:
                goto L53
            L28:
                java.lang.String r7 = "integrations"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L31
                goto L53
            L31:
                r6 = 3
                goto L53
            L33:
                java.lang.String r7 = "packages"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L3c
                goto L53
            L3c:
                r6 = 2
                goto L53
            L3e:
                java.lang.String r7 = "version"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L47
                goto L53
            L47:
                r6 = 1
                goto L53
            L49:
                java.lang.String r7 = "name"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L52
                goto L53
            L52:
                r6 = 0
            L53:
                switch(r6) {
                    case 0: goto L81;
                    case 1: goto L7c;
                    case 2: goto L6d;
                    case 3: goto L61;
                    default: goto L56;
                }
            L56:
                if (r4 != 0) goto L5d
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
            L5d:
                r9.V0(r10, r4, r5)
                goto L10
            L61:
                java.lang.Object r5 = r9.R0()
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L10
                r1.addAll(r5)
                goto L10
            L6d:
                io.sentry.protocol.r$a r5 = new io.sentry.protocol.r$a
                r5.<init>()
                java.util.List r5 = r9.O0(r10, r5)
                if (r5 == 0) goto L10
                r0.addAll(r5)
                goto L10
            L7c:
                java.lang.String r3 = r9.u0()
                goto L10
            L81:
                java.lang.String r2 = r9.u0()
                goto L10
            L86:
                r9.D()
                if (r2 == 0) goto Lb3
                if (r3 == 0) goto La6
                io.sentry.protocol.o r9 = new io.sentry.protocol.o
                r9.<init>(r2, r3)
                java.util.concurrent.CopyOnWriteArraySet r10 = new java.util.concurrent.CopyOnWriteArraySet
                r10.<init>(r0)
                io.sentry.protocol.o.a(r9, r10)
                java.util.concurrent.CopyOnWriteArraySet r10 = new java.util.concurrent.CopyOnWriteArraySet
                r10.<init>(r1)
                io.sentry.protocol.o.b(r9, r10)
                r9.i(r4)
                return r9
            La6:
                java.lang.String r9 = "Missing required field \"version\""
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r9)
                io.sentry.s4 r1 = io.sentry.s4.ERROR
                r10.b(r1, r9, r0)
                throw r0
            Lb3:
                java.lang.String r9 = "Missing required field \"name\""
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r9)
                io.sentry.s4 r1 = io.sentry.s4.ERROR
                r10.b(r1, r9, r0)
                goto Lc1
            Lc0:
                throw r0
            Lc1:
                goto Lc0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.o.a.a(io.sentry.n2, io.sentry.w1):io.sentry.protocol.o");
        }
    }

    public o(String str, String str2) {
        this.f19161f = (String) io.sentry.util.q.c(str, "name is required.");
        this.f19162g = (String) io.sentry.util.q.c(str2, "version is required.");
    }

    public static o k(o oVar, String str, String str2) {
        io.sentry.util.q.c(str, "name is required.");
        io.sentry.util.q.c(str2, "version is required.");
        if (oVar == null) {
            return new o(str, str2);
        }
        oVar.h(str);
        oVar.j(str2);
        return oVar;
    }

    public void c(String str, String str2) {
        q4.c().b(str, str2);
    }

    public Set<String> d() {
        Set<String> set = this.f19164i;
        return set != null ? set : q4.c().d();
    }

    public String e() {
        return this.f19161f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f19161f.equals(oVar.f19161f) && this.f19162g.equals(oVar.f19162g);
    }

    public Set<r> f() {
        Set<r> set = this.f19163h;
        return set != null ? set : q4.c().e();
    }

    public String g() {
        return this.f19162g;
    }

    public void h(String str) {
        this.f19161f = (String) io.sentry.util.q.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.q.b(this.f19161f, this.f19162g);
    }

    public void i(Map<String, Object> map) {
        this.f19165j = map;
    }

    public void j(String str) {
        this.f19162g = (String) io.sentry.util.q.c(str, "version is required.");
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("name").b(this.f19161f);
        h3Var.k("version").b(this.f19162g);
        Set<r> f2 = f();
        Set<String> d2 = d();
        if (!f2.isEmpty()) {
            h3Var.k("packages").g(w1Var, f2);
        }
        if (!d2.isEmpty()) {
            h3Var.k("integrations").g(w1Var, d2);
        }
        Map<String, Object> map = this.f19165j;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19165j.get(str));
            }
        }
        h3Var.d();
    }
}
