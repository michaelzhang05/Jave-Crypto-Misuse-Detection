package H6;

import F6.q;
import F6.x;
import F6.z;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final z f3535b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f3536a;

        /* renamed from: b, reason: collision with root package name */
        final x f3537b;

        /* renamed from: c, reason: collision with root package name */
        final z f3538c;

        /* renamed from: d, reason: collision with root package name */
        private Date f3539d;

        /* renamed from: e, reason: collision with root package name */
        private String f3540e;

        /* renamed from: f, reason: collision with root package name */
        private Date f3541f;

        /* renamed from: g, reason: collision with root package name */
        private String f3542g;

        /* renamed from: h, reason: collision with root package name */
        private Date f3543h;

        /* renamed from: i, reason: collision with root package name */
        private long f3544i;

        /* renamed from: j, reason: collision with root package name */
        private long f3545j;

        /* renamed from: k, reason: collision with root package name */
        private String f3546k;

        /* renamed from: l, reason: collision with root package name */
        private int f3547l;

        public a(long j8, x xVar, z zVar) {
            this.f3547l = -1;
            this.f3536a = j8;
            this.f3537b = xVar;
            this.f3538c = zVar;
            if (zVar != null) {
                this.f3544i = zVar.F();
                this.f3545j = zVar.A();
                q m8 = zVar.m();
                int e8 = m8.e();
                for (int i8 = 0; i8 < e8; i8++) {
                    String c8 = m8.c(i8);
                    String f8 = m8.f(i8);
                    if ("Date".equalsIgnoreCase(c8)) {
                        this.f3539d = J6.d.b(f8);
                        this.f3540e = f8;
                    } else if ("Expires".equalsIgnoreCase(c8)) {
                        this.f3543h = J6.d.b(f8);
                    } else if ("Last-Modified".equalsIgnoreCase(c8)) {
                        this.f3541f = J6.d.b(f8);
                        this.f3542g = f8;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(c8)) {
                        this.f3546k = f8;
                    } else if ("Age".equalsIgnoreCase(c8)) {
                        this.f3547l = J6.e.f(f8, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f3539d;
            long j8 = 0;
            if (date != null) {
                j8 = Math.max(0L, this.f3545j - date.getTime());
            }
            int i8 = this.f3547l;
            if (i8 != -1) {
                j8 = Math.max(j8, TimeUnit.SECONDS.toMillis(i8));
            }
            long j9 = this.f3545j;
            return j8 + (j9 - this.f3544i) + (this.f3536a - j9);
        }

        private long b() {
            long j8;
            long j9;
            if (this.f3538c.b().e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.e());
            }
            if (this.f3543h != null) {
                Date date = this.f3539d;
                if (date != null) {
                    j9 = date.getTime();
                } else {
                    j9 = this.f3545j;
                }
                long time = this.f3543h.getTime() - j9;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            }
            if (this.f3541f == null || this.f3538c.E().i().x() != null) {
                return 0L;
            }
            Date date2 = this.f3539d;
            if (date2 != null) {
                j8 = date2.getTime();
            } else {
                j8 = this.f3544i;
            }
            long time2 = j8 - this.f3541f.getTime();
            if (time2 <= 0) {
                return 0L;
            }
            return time2 / 10;
        }

        private c d() {
            long j8;
            String str;
            if (this.f3538c == null) {
                return new c(this.f3537b, null);
            }
            if (this.f3537b.f() && this.f3538c.g() == null) {
                return new c(this.f3537b, null);
            }
            if (!c.a(this.f3538c, this.f3537b)) {
                return new c(this.f3537b, null);
            }
            F6.d b8 = this.f3537b.b();
            if (!b8.i() && !e(this.f3537b)) {
                F6.d b9 = this.f3538c.b();
                if (b9.b()) {
                    return new c(null, this.f3538c);
                }
                long a8 = a();
                long b10 = b();
                if (b8.e() != -1) {
                    b10 = Math.min(b10, TimeUnit.SECONDS.toMillis(b8.e()));
                }
                long j9 = 0;
                if (b8.g() != -1) {
                    j8 = TimeUnit.SECONDS.toMillis(b8.g());
                } else {
                    j8 = 0;
                }
                if (!b9.h() && b8.f() != -1) {
                    j9 = TimeUnit.SECONDS.toMillis(b8.f());
                }
                if (!b9.i()) {
                    long j10 = j8 + a8;
                    if (j10 < j9 + b10) {
                        z.a u8 = this.f3538c.u();
                        if (j10 >= b10) {
                            u8.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a8 > 86400000 && f()) {
                            u8.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, u8.c());
                    }
                }
                String str2 = this.f3546k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f3541f != null) {
                        str2 = this.f3542g;
                    } else if (this.f3539d != null) {
                        str2 = this.f3540e;
                    } else {
                        return new c(this.f3537b, null);
                    }
                    str = "If-Modified-Since";
                }
                q.a d8 = this.f3537b.d().d();
                G6.a.f3218a.b(d8, str, str2);
                return new c(this.f3537b.h().d(d8.d()).a(), this.f3538c);
            }
            return new c(this.f3537b, null);
        }

        private static boolean e(x xVar) {
            if (xVar.c("If-Modified-Since") == null && xVar.c("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private boolean f() {
            if (this.f3538c.b().e() == -1 && this.f3543h == null) {
                return true;
            }
            return false;
        }

        public c c() {
            c d8 = d();
            if (d8.f3534a != null && this.f3537b.b().k()) {
                return new c(null, null);
            }
            return d8;
        }
    }

    c(x xVar, z zVar) {
        this.f3534a = xVar;
        this.f3535b = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.b().c() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(F6.z r3, F6.x r4) {
        /*
            int r0 = r3.f()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.h(r0)
            if (r0 != 0) goto L5a
            F6.d r0 = r3.b()
            int r0 = r0.e()
            r1 = -1
            if (r0 != r1) goto L5a
            F6.d r0 = r3.b()
            boolean r0 = r0.d()
            if (r0 != 0) goto L5a
            F6.d r0 = r3.b()
            boolean r0 = r0.c()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            F6.d r3 = r3.b()
            boolean r3 = r3.j()
            if (r3 != 0) goto L6f
            F6.d r3 = r4.b()
            boolean r3 = r3.j()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.a(F6.z, F6.x):boolean");
    }
}
