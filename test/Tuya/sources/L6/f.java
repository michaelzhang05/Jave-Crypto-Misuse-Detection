package L6;

import F6.A;
import F6.q;
import F6.s;
import F6.u;
import F6.v;
import F6.x;
import F6.z;
import P6.AbstractC1287m;
import P6.C1279e;
import P6.C1282h;
import P6.L;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class f implements J6.c {

    /* renamed from: f, reason: collision with root package name */
    private static final C1282h f6576f;

    /* renamed from: g, reason: collision with root package name */
    private static final C1282h f6577g;

    /* renamed from: h, reason: collision with root package name */
    private static final C1282h f6578h;

    /* renamed from: i, reason: collision with root package name */
    private static final C1282h f6579i;

    /* renamed from: j, reason: collision with root package name */
    private static final C1282h f6580j;

    /* renamed from: k, reason: collision with root package name */
    private static final C1282h f6581k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1282h f6582l;

    /* renamed from: m, reason: collision with root package name */
    private static final C1282h f6583m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f6584n;

    /* renamed from: o, reason: collision with root package name */
    private static final List f6585o;

    /* renamed from: a, reason: collision with root package name */
    private final u f6586a;

    /* renamed from: b, reason: collision with root package name */
    private final s.a f6587b;

    /* renamed from: c, reason: collision with root package name */
    final I6.g f6588c;

    /* renamed from: d, reason: collision with root package name */
    private final g f6589d;

    /* renamed from: e, reason: collision with root package name */
    private i f6590e;

    /* loaded from: classes5.dex */
    class a extends AbstractC1287m {

        /* renamed from: b, reason: collision with root package name */
        boolean f6591b;

        /* renamed from: c, reason: collision with root package name */
        long f6592c;

        a(Z z8) {
            super(z8);
            this.f6591b = false;
            this.f6592c = 0L;
        }

        private void b(IOException iOException) {
            if (this.f6591b) {
                return;
            }
            this.f6591b = true;
            f fVar = f.this;
            fVar.f6588c.q(false, fVar, this.f6592c, iOException);
        }

        @Override // P6.AbstractC1287m, P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            b(null);
        }

        @Override // P6.AbstractC1287m, P6.Z
        public long y(C1279e c1279e, long j8) {
            try {
                long y8 = a().y(c1279e, j8);
                if (y8 > 0) {
                    this.f6592c += y8;
                }
                return y8;
            } catch (IOException e8) {
                b(e8);
                throw e8;
            }
        }
    }

    static {
        C1282h f8 = C1282h.f("connection");
        f6576f = f8;
        C1282h f9 = C1282h.f("host");
        f6577g = f9;
        C1282h f10 = C1282h.f("keep-alive");
        f6578h = f10;
        C1282h f11 = C1282h.f("proxy-connection");
        f6579i = f11;
        C1282h f12 = C1282h.f("transfer-encoding");
        f6580j = f12;
        C1282h f13 = C1282h.f("te");
        f6581k = f13;
        C1282h f14 = C1282h.f("encoding");
        f6582l = f14;
        C1282h f15 = C1282h.f("upgrade");
        f6583m = f15;
        f6584n = G6.c.r(f8, f9, f10, f11, f13, f12, f14, f15, c.f6545f, c.f6546g, c.f6547h, c.f6548i);
        f6585o = G6.c.r(f8, f9, f10, f11, f13, f12, f14, f15);
    }

    public f(u uVar, s.a aVar, I6.g gVar, g gVar2) {
        this.f6586a = uVar;
        this.f6587b = aVar;
        this.f6588c = gVar;
        this.f6589d = gVar2;
    }

    public static List d(x xVar) {
        q d8 = xVar.d();
        ArrayList arrayList = new ArrayList(d8.e() + 4);
        arrayList.add(new c(c.f6545f, xVar.g()));
        arrayList.add(new c(c.f6546g, J6.i.c(xVar.i())));
        String c8 = xVar.c("Host");
        if (c8 != null) {
            arrayList.add(new c(c.f6548i, c8));
        }
        arrayList.add(new c(c.f6547h, xVar.i().A()));
        int e8 = d8.e();
        for (int i8 = 0; i8 < e8; i8++) {
            C1282h f8 = C1282h.f(d8.c(i8).toLowerCase(Locale.US));
            if (!f6584n.contains(f8)) {
                arrayList.add(new c(f8, d8.f(i8)));
            }
        }
        return arrayList;
    }

    public static z.a e(List list) {
        q.a aVar = new q.a();
        int size = list.size();
        J6.k kVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) list.get(i8);
            if (cVar == null) {
                if (kVar != null && kVar.f5533b == 100) {
                    aVar = new q.a();
                    kVar = null;
                }
            } else {
                C1282h c1282h = cVar.f6549a;
                String M8 = cVar.f6550b.M();
                if (c1282h.equals(c.f6544e)) {
                    kVar = J6.k.a("HTTP/1.1 " + M8);
                } else if (!f6585o.contains(c1282h)) {
                    G6.a.f3218a.b(aVar, c1282h.M(), M8);
                }
            }
        }
        if (kVar != null) {
            return new z.a().m(v.HTTP_2).g(kVar.f5533b).j(kVar.f5534c).i(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // J6.c
    public A a(z zVar) {
        I6.g gVar = this.f6588c;
        gVar.f4320f.q(gVar.f4319e);
        return new J6.h(zVar.h("Content-Type"), J6.e.b(zVar), L.d(new a(this.f6590e.i())));
    }

    @Override // J6.c
    public X b(x xVar, long j8) {
        return this.f6590e.h();
    }

    @Override // J6.c
    public void c(x xVar) {
        boolean z8;
        if (this.f6590e != null) {
            return;
        }
        if (xVar.a() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        i u8 = this.f6589d.u(d(xVar), z8);
        this.f6590e = u8;
        a0 l8 = u8.l();
        long readTimeoutMillis = this.f6587b.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l8.g(readTimeoutMillis, timeUnit);
        this.f6590e.s().g(this.f6587b.writeTimeoutMillis(), timeUnit);
    }

    @Override // J6.c
    public void finishRequest() {
        this.f6590e.h().close();
    }

    @Override // J6.c
    public void flushRequest() {
        this.f6589d.flush();
    }

    @Override // J6.c
    public z.a readResponseHeaders(boolean z8) {
        z.a e8 = e(this.f6590e.q());
        if (z8 && G6.a.f3218a.d(e8) == 100) {
            return null;
        }
        return e8;
    }
}
