package F6;

import F6.q;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final x f3042a;

    /* renamed from: b, reason: collision with root package name */
    final v f3043b;

    /* renamed from: c, reason: collision with root package name */
    final int f3044c;

    /* renamed from: d, reason: collision with root package name */
    final String f3045d;

    /* renamed from: e, reason: collision with root package name */
    final p f3046e;

    /* renamed from: f, reason: collision with root package name */
    final q f3047f;

    /* renamed from: g, reason: collision with root package name */
    final A f3048g;

    /* renamed from: h, reason: collision with root package name */
    final z f3049h;

    /* renamed from: i, reason: collision with root package name */
    final z f3050i;

    /* renamed from: j, reason: collision with root package name */
    final z f3051j;

    /* renamed from: k, reason: collision with root package name */
    final long f3052k;

    /* renamed from: l, reason: collision with root package name */
    final long f3053l;

    /* renamed from: m, reason: collision with root package name */
    private volatile d f3054m;

    z(a aVar) {
        this.f3042a = aVar.f3055a;
        this.f3043b = aVar.f3056b;
        this.f3044c = aVar.f3057c;
        this.f3045d = aVar.f3058d;
        this.f3046e = aVar.f3059e;
        this.f3047f = aVar.f3060f.d();
        this.f3048g = aVar.f3061g;
        this.f3049h = aVar.f3062h;
        this.f3050i = aVar.f3063i;
        this.f3051j = aVar.f3064j;
        this.f3052k = aVar.f3065k;
        this.f3053l = aVar.f3066l;
    }

    public long A() {
        return this.f3053l;
    }

    public x E() {
        return this.f3042a;
    }

    public long F() {
        return this.f3052k;
    }

    public A a() {
        return this.f3048g;
    }

    public d b() {
        d dVar = this.f3054m;
        if (dVar == null) {
            d l8 = d.l(this.f3047f);
            this.f3054m = l8;
            return l8;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A a8 = this.f3048g;
        if (a8 != null) {
            a8.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public z e() {
        return this.f3050i;
    }

    public int f() {
        return this.f3044c;
    }

    public p g() {
        return this.f3046e;
    }

    public String h(String str) {
        return l(str, null);
    }

    public String l(String str, String str2) {
        String a8 = this.f3047f.a(str);
        if (a8 != null) {
            return a8;
        }
        return str2;
    }

    public q m() {
        return this.f3047f;
    }

    public boolean o() {
        int i8 = this.f3044c;
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    public String r() {
        return this.f3045d;
    }

    public z t() {
        return this.f3049h;
    }

    public String toString() {
        return "Response{protocol=" + this.f3043b + ", code=" + this.f3044c + ", message=" + this.f3045d + ", url=" + this.f3042a.i() + '}';
    }

    public a u() {
        return new a(this);
    }

    public z w() {
        return this.f3051j;
    }

    public v x() {
        return this.f3043b;
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        x f3055a;

        /* renamed from: b, reason: collision with root package name */
        v f3056b;

        /* renamed from: c, reason: collision with root package name */
        int f3057c;

        /* renamed from: d, reason: collision with root package name */
        String f3058d;

        /* renamed from: e, reason: collision with root package name */
        p f3059e;

        /* renamed from: f, reason: collision with root package name */
        q.a f3060f;

        /* renamed from: g, reason: collision with root package name */
        A f3061g;

        /* renamed from: h, reason: collision with root package name */
        z f3062h;

        /* renamed from: i, reason: collision with root package name */
        z f3063i;

        /* renamed from: j, reason: collision with root package name */
        z f3064j;

        /* renamed from: k, reason: collision with root package name */
        long f3065k;

        /* renamed from: l, reason: collision with root package name */
        long f3066l;

        public a() {
            this.f3057c = -1;
            this.f3060f = new q.a();
        }

        private void e(z zVar) {
            if (zVar.f3048g == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, z zVar) {
            if (zVar.f3048g == null) {
                if (zVar.f3049h == null) {
                    if (zVar.f3050i == null) {
                        if (zVar.f3051j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(String str, String str2) {
            this.f3060f.a(str, str2);
            return this;
        }

        public a b(A a8) {
            this.f3061g = a8;
            return this;
        }

        public z c() {
            if (this.f3055a != null) {
                if (this.f3056b != null) {
                    if (this.f3057c >= 0) {
                        if (this.f3058d != null) {
                            return new z(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f3057c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a d(z zVar) {
            if (zVar != null) {
                f("cacheResponse", zVar);
            }
            this.f3063i = zVar;
            return this;
        }

        public a g(int i8) {
            this.f3057c = i8;
            return this;
        }

        public a h(p pVar) {
            this.f3059e = pVar;
            return this;
        }

        public a i(q qVar) {
            this.f3060f = qVar.d();
            return this;
        }

        public a j(String str) {
            this.f3058d = str;
            return this;
        }

        public a k(z zVar) {
            if (zVar != null) {
                f("networkResponse", zVar);
            }
            this.f3062h = zVar;
            return this;
        }

        public a l(z zVar) {
            if (zVar != null) {
                e(zVar);
            }
            this.f3064j = zVar;
            return this;
        }

        public a m(v vVar) {
            this.f3056b = vVar;
            return this;
        }

        public a n(long j8) {
            this.f3066l = j8;
            return this;
        }

        public a o(x xVar) {
            this.f3055a = xVar;
            return this;
        }

        public a p(long j8) {
            this.f3065k = j8;
            return this;
        }

        a(z zVar) {
            this.f3057c = -1;
            this.f3055a = zVar.f3042a;
            this.f3056b = zVar.f3043b;
            this.f3057c = zVar.f3044c;
            this.f3058d = zVar.f3045d;
            this.f3059e = zVar.f3046e;
            this.f3060f = zVar.f3047f.d();
            this.f3061g = zVar.f3048g;
            this.f3062h = zVar.f3049h;
            this.f3063i = zVar.f3050i;
            this.f3064j = zVar.f3051j;
            this.f3065k = zVar.f3052k;
            this.f3066l = zVar.f3053l;
        }
    }
}
