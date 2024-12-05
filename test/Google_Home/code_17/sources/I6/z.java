package I6;

import I6.q;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final x f4582a;

    /* renamed from: b, reason: collision with root package name */
    final v f4583b;

    /* renamed from: c, reason: collision with root package name */
    final int f4584c;

    /* renamed from: d, reason: collision with root package name */
    final String f4585d;

    /* renamed from: e, reason: collision with root package name */
    final p f4586e;

    /* renamed from: f, reason: collision with root package name */
    final q f4587f;

    /* renamed from: g, reason: collision with root package name */
    final A f4588g;

    /* renamed from: h, reason: collision with root package name */
    final z f4589h;

    /* renamed from: i, reason: collision with root package name */
    final z f4590i;

    /* renamed from: j, reason: collision with root package name */
    final z f4591j;

    /* renamed from: k, reason: collision with root package name */
    final long f4592k;

    /* renamed from: l, reason: collision with root package name */
    final long f4593l;

    /* renamed from: m, reason: collision with root package name */
    private volatile d f4594m;

    z(a aVar) {
        this.f4582a = aVar.f4595a;
        this.f4583b = aVar.f4596b;
        this.f4584c = aVar.f4597c;
        this.f4585d = aVar.f4598d;
        this.f4586e = aVar.f4599e;
        this.f4587f = aVar.f4600f.d();
        this.f4588g = aVar.f4601g;
        this.f4589h = aVar.f4602h;
        this.f4590i = aVar.f4603i;
        this.f4591j = aVar.f4604j;
        this.f4592k = aVar.f4605k;
        this.f4593l = aVar.f4606l;
    }

    public v A() {
        return this.f4583b;
    }

    public long D() {
        return this.f4593l;
    }

    public x E() {
        return this.f4582a;
    }

    public long F() {
        return this.f4592k;
    }

    public A a() {
        return this.f4588g;
    }

    public d b() {
        d dVar = this.f4594m;
        if (dVar == null) {
            d l8 = d.l(this.f4587f);
            this.f4594m = l8;
            return l8;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A a8 = this.f4588g;
        if (a8 != null) {
            a8.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public z f() {
        return this.f4590i;
    }

    public int g() {
        return this.f4584c;
    }

    public p l() {
        return this.f4586e;
    }

    public String m(String str) {
        return n(str, null);
    }

    public String n(String str, String str2) {
        String a8 = this.f4587f.a(str);
        if (a8 != null) {
            return a8;
        }
        return str2;
    }

    public q o() {
        return this.f4587f;
    }

    public boolean s() {
        int i8 = this.f4584c;
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Response{protocol=" + this.f4583b + ", code=" + this.f4584c + ", message=" + this.f4585d + ", url=" + this.f4582a.i() + '}';
    }

    public String u() {
        return this.f4585d;
    }

    public z v() {
        return this.f4589h;
    }

    public a x() {
        return new a(this);
    }

    public z y() {
        return this.f4591j;
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        x f4595a;

        /* renamed from: b, reason: collision with root package name */
        v f4596b;

        /* renamed from: c, reason: collision with root package name */
        int f4597c;

        /* renamed from: d, reason: collision with root package name */
        String f4598d;

        /* renamed from: e, reason: collision with root package name */
        p f4599e;

        /* renamed from: f, reason: collision with root package name */
        q.a f4600f;

        /* renamed from: g, reason: collision with root package name */
        A f4601g;

        /* renamed from: h, reason: collision with root package name */
        z f4602h;

        /* renamed from: i, reason: collision with root package name */
        z f4603i;

        /* renamed from: j, reason: collision with root package name */
        z f4604j;

        /* renamed from: k, reason: collision with root package name */
        long f4605k;

        /* renamed from: l, reason: collision with root package name */
        long f4606l;

        public a() {
            this.f4597c = -1;
            this.f4600f = new q.a();
        }

        private void e(z zVar) {
            if (zVar.f4588g == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, z zVar) {
            if (zVar.f4588g == null) {
                if (zVar.f4589h == null) {
                    if (zVar.f4590i == null) {
                        if (zVar.f4591j == null) {
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
            this.f4600f.a(str, str2);
            return this;
        }

        public a b(A a8) {
            this.f4601g = a8;
            return this;
        }

        public z c() {
            if (this.f4595a != null) {
                if (this.f4596b != null) {
                    if (this.f4597c >= 0) {
                        if (this.f4598d != null) {
                            return new z(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f4597c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a d(z zVar) {
            if (zVar != null) {
                f("cacheResponse", zVar);
            }
            this.f4603i = zVar;
            return this;
        }

        public a g(int i8) {
            this.f4597c = i8;
            return this;
        }

        public a h(p pVar) {
            this.f4599e = pVar;
            return this;
        }

        public a i(q qVar) {
            this.f4600f = qVar.d();
            return this;
        }

        public a j(String str) {
            this.f4598d = str;
            return this;
        }

        public a k(z zVar) {
            if (zVar != null) {
                f("networkResponse", zVar);
            }
            this.f4602h = zVar;
            return this;
        }

        public a l(z zVar) {
            if (zVar != null) {
                e(zVar);
            }
            this.f4604j = zVar;
            return this;
        }

        public a m(v vVar) {
            this.f4596b = vVar;
            return this;
        }

        public a n(long j8) {
            this.f4606l = j8;
            return this;
        }

        public a o(x xVar) {
            this.f4595a = xVar;
            return this;
        }

        public a p(long j8) {
            this.f4605k = j8;
            return this;
        }

        a(z zVar) {
            this.f4597c = -1;
            this.f4595a = zVar.f4582a;
            this.f4596b = zVar.f4583b;
            this.f4597c = zVar.f4584c;
            this.f4598d = zVar.f4585d;
            this.f4599e = zVar.f4586e;
            this.f4600f = zVar.f4587f.d();
            this.f4601g = zVar.f4588g;
            this.f4602h = zVar.f4589h;
            this.f4603i = zVar.f4590i;
            this.f4604j = zVar.f4591j;
            this.f4605k = zVar.f4592k;
            this.f4606l = zVar.f4593l;
        }
    }
}
