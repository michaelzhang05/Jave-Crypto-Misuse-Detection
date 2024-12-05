package O6;

import I6.A;
import I6.q;
import I6.s;
import I6.u;
import I6.v;
import I6.x;
import I6.z;
import S6.AbstractC1425m;
import S6.C1417e;
import S6.C1420h;
import S6.L;
import S6.X;
import S6.Z;
import S6.a0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class f implements M6.c {

    /* renamed from: f, reason: collision with root package name */
    private static final C1420h f8367f;

    /* renamed from: g, reason: collision with root package name */
    private static final C1420h f8368g;

    /* renamed from: h, reason: collision with root package name */
    private static final C1420h f8369h;

    /* renamed from: i, reason: collision with root package name */
    private static final C1420h f8370i;

    /* renamed from: j, reason: collision with root package name */
    private static final C1420h f8371j;

    /* renamed from: k, reason: collision with root package name */
    private static final C1420h f8372k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1420h f8373l;

    /* renamed from: m, reason: collision with root package name */
    private static final C1420h f8374m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f8375n;

    /* renamed from: o, reason: collision with root package name */
    private static final List f8376o;

    /* renamed from: a, reason: collision with root package name */
    private final u f8377a;

    /* renamed from: b, reason: collision with root package name */
    private final s.a f8378b;

    /* renamed from: c, reason: collision with root package name */
    final L6.g f8379c;

    /* renamed from: d, reason: collision with root package name */
    private final g f8380d;

    /* renamed from: e, reason: collision with root package name */
    private i f8381e;

    /* loaded from: classes5.dex */
    class a extends AbstractC1425m {

        /* renamed from: b, reason: collision with root package name */
        boolean f8382b;

        /* renamed from: c, reason: collision with root package name */
        long f8383c;

        a(Z z8) {
            super(z8);
            this.f8382b = false;
            this.f8383c = 0L;
        }

        private void b(IOException iOException) {
            if (this.f8382b) {
                return;
            }
            this.f8382b = true;
            f fVar = f.this;
            fVar.f8379c.q(false, fVar, this.f8383c, iOException);
        }

        @Override // S6.AbstractC1425m, S6.Z
        public long C(C1417e c1417e, long j8) {
            try {
                long C8 = a().C(c1417e, j8);
                if (C8 > 0) {
                    this.f8383c += C8;
                }
                return C8;
            } catch (IOException e8) {
                b(e8);
                throw e8;
            }
        }

        @Override // S6.AbstractC1425m, S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            b(null);
        }
    }

    static {
        C1420h f8 = C1420h.f("connection");
        f8367f = f8;
        C1420h f9 = C1420h.f("host");
        f8368g = f9;
        C1420h f10 = C1420h.f("keep-alive");
        f8369h = f10;
        C1420h f11 = C1420h.f("proxy-connection");
        f8370i = f11;
        C1420h f12 = C1420h.f("transfer-encoding");
        f8371j = f12;
        C1420h f13 = C1420h.f("te");
        f8372k = f13;
        C1420h f14 = C1420h.f("encoding");
        f8373l = f14;
        C1420h f15 = C1420h.f("upgrade");
        f8374m = f15;
        f8375n = J6.c.r(f8, f9, f10, f11, f13, f12, f14, f15, c.f8336f, c.f8337g, c.f8338h, c.f8339i);
        f8376o = J6.c.r(f8, f9, f10, f11, f13, f12, f14, f15);
    }

    public f(u uVar, s.a aVar, L6.g gVar, g gVar2) {
        this.f8377a = uVar;
        this.f8378b = aVar;
        this.f8379c = gVar;
        this.f8380d = gVar2;
    }

    public static List d(x xVar) {
        q d8 = xVar.d();
        ArrayList arrayList = new ArrayList(d8.e() + 4);
        arrayList.add(new c(c.f8336f, xVar.g()));
        arrayList.add(new c(c.f8337g, M6.i.c(xVar.i())));
        String c8 = xVar.c("Host");
        if (c8 != null) {
            arrayList.add(new c(c.f8339i, c8));
        }
        arrayList.add(new c(c.f8338h, xVar.i().A()));
        int e8 = d8.e();
        for (int i8 = 0; i8 < e8; i8++) {
            C1420h f8 = C1420h.f(d8.c(i8).toLowerCase(Locale.US));
            if (!f8375n.contains(f8)) {
                arrayList.add(new c(f8, d8.f(i8)));
            }
        }
        return arrayList;
    }

    public static z.a e(List list) {
        q.a aVar = new q.a();
        int size = list.size();
        M6.k kVar = null;
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = (c) list.get(i8);
            if (cVar == null) {
                if (kVar != null && kVar.f7239b == 100) {
                    aVar = new q.a();
                    kVar = null;
                }
            } else {
                C1420h c1420h = cVar.f8340a;
                String Q8 = cVar.f8341b.Q();
                if (c1420h.equals(c.f8335e)) {
                    kVar = M6.k.a("HTTP/1.1 " + Q8);
                } else if (!f8376o.contains(c1420h)) {
                    J6.a.f4937a.b(aVar, c1420h.Q(), Q8);
                }
            }
        }
        if (kVar != null) {
            return new z.a().m(v.HTTP_2).g(kVar.f7239b).j(kVar.f7240c).i(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // M6.c
    public void a(x xVar) {
        boolean z8;
        if (this.f8381e != null) {
            return;
        }
        if (xVar.a() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        i x8 = this.f8380d.x(d(xVar), z8);
        this.f8381e = x8;
        a0 l8 = x8.l();
        long readTimeoutMillis = this.f8378b.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l8.g(readTimeoutMillis, timeUnit);
        this.f8381e.s().g(this.f8378b.writeTimeoutMillis(), timeUnit);
    }

    @Override // M6.c
    public X b(x xVar, long j8) {
        return this.f8381e.h();
    }

    @Override // M6.c
    public A c(z zVar) {
        L6.g gVar = this.f8379c;
        gVar.f6315f.q(gVar.f6314e);
        return new M6.h(zVar.m("Content-Type"), M6.e.b(zVar), L.d(new a(this.f8381e.i())));
    }

    @Override // M6.c
    public void finishRequest() {
        this.f8381e.h().close();
    }

    @Override // M6.c
    public void flushRequest() {
        this.f8380d.flush();
    }

    @Override // M6.c
    public z.a readResponseHeaders(boolean z8) {
        z.a e8 = e(this.f8381e.q());
        if (z8 && J6.a.f4937a.d(e8) == 100) {
            return null;
        }
        return e8;
    }
}
