package androidx.work;

import android.os.Build;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    private o f1804b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1805c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1806d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1807e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1808f;

    /* renamed from: g, reason: collision with root package name */
    private long f1809g;

    /* renamed from: h, reason: collision with root package name */
    private long f1810h;

    /* renamed from: i, reason: collision with root package name */
    private d f1811i;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f1812b = false;

        /* renamed from: c, reason: collision with root package name */
        o f1813c = o.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        boolean f1814d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f1815e = false;

        /* renamed from: f, reason: collision with root package name */
        long f1816f = -1;

        /* renamed from: g, reason: collision with root package name */
        long f1817g = -1;

        /* renamed from: h, reason: collision with root package name */
        d f1818h = new d();

        public c a() {
            return new c(this);
        }

        public a b(o oVar) {
            this.f1813c = oVar;
            return this;
        }
    }

    public c() {
        this.f1804b = o.NOT_REQUIRED;
        this.f1809g = -1L;
        this.f1810h = -1L;
        this.f1811i = new d();
    }

    public d a() {
        return this.f1811i;
    }

    public o b() {
        return this.f1804b;
    }

    public long c() {
        return this.f1809g;
    }

    public long d() {
        return this.f1810h;
    }

    public boolean e() {
        return this.f1811i.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1805c == cVar.f1805c && this.f1806d == cVar.f1806d && this.f1807e == cVar.f1807e && this.f1808f == cVar.f1808f && this.f1809g == cVar.f1809g && this.f1810h == cVar.f1810h && this.f1804b == cVar.f1804b) {
            return this.f1811i.equals(cVar.f1811i);
        }
        return false;
    }

    public boolean f() {
        return this.f1807e;
    }

    public boolean g() {
        return this.f1805c;
    }

    public boolean h() {
        return this.f1806d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f1804b.hashCode() * 31) + (this.f1805c ? 1 : 0)) * 31) + (this.f1806d ? 1 : 0)) * 31) + (this.f1807e ? 1 : 0)) * 31) + (this.f1808f ? 1 : 0)) * 31;
        long j2 = this.f1809g;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f1810h;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f1811i.hashCode();
    }

    public boolean i() {
        return this.f1808f;
    }

    public void j(d dVar) {
        this.f1811i = dVar;
    }

    public void k(o oVar) {
        this.f1804b = oVar;
    }

    public void l(boolean z) {
        this.f1807e = z;
    }

    public void m(boolean z) {
        this.f1805c = z;
    }

    public void n(boolean z) {
        this.f1806d = z;
    }

    public void o(boolean z) {
        this.f1808f = z;
    }

    public void p(long j2) {
        this.f1809g = j2;
    }

    public void q(long j2) {
        this.f1810h = j2;
    }

    c(a aVar) {
        this.f1804b = o.NOT_REQUIRED;
        this.f1809g = -1L;
        this.f1810h = -1L;
        this.f1811i = new d();
        this.f1805c = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.f1806d = i2 >= 23 && aVar.f1812b;
        this.f1804b = aVar.f1813c;
        this.f1807e = aVar.f1814d;
        this.f1808f = aVar.f1815e;
        if (i2 >= 24) {
            this.f1811i = aVar.f1818h;
            this.f1809g = aVar.f1816f;
            this.f1810h = aVar.f1817g;
        }
    }

    public c(c cVar) {
        this.f1804b = o.NOT_REQUIRED;
        this.f1809g = -1L;
        this.f1810h = -1L;
        this.f1811i = new d();
        this.f1805c = cVar.f1805c;
        this.f1806d = cVar.f1806d;
        this.f1804b = cVar.f1804b;
        this.f1807e = cVar.f1807e;
        this.f1808f = cVar.f1808f;
        this.f1811i = cVar.f1811i;
    }
}
