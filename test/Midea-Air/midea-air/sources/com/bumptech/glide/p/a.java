package com.bumptech.glide.p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.file.CacheHelper;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.o.c.n;
import com.bumptech.glide.load.o.c.p;
import com.bumptech.glide.p.a;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean E;

    /* renamed from: f, reason: collision with root package name */
    private int f8891f;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f8895j;

    /* renamed from: k, reason: collision with root package name */
    private int f8896k;
    private Drawable l;
    private int m;
    private boolean r;
    private Drawable t;
    private int u;
    private boolean y;
    private Resources.Theme z;

    /* renamed from: g, reason: collision with root package name */
    private float f8892g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f8893h = com.bumptech.glide.load.engine.j.f8550e;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.g f8894i = com.bumptech.glide.g.NORMAL;
    private boolean n = true;
    private int o = -1;
    private int p = -1;
    private com.bumptech.glide.load.f q = com.bumptech.glide.q.b.a();
    private boolean s = true;
    private com.bumptech.glide.load.i v = new com.bumptech.glide.load.i();
    private Map<Class<?>, l<?>> w = new com.bumptech.glide.r.b();
    private Class<?> x = Object.class;
    private boolean D = true;

    private boolean M(int i2) {
        return N(this.f8891f, i2);
    }

    private static boolean N(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private T X(com.bumptech.glide.load.o.c.k kVar, l<Bitmap> lVar) {
        return e0(kVar, lVar, false);
    }

    private T e0(com.bumptech.glide.load.o.c.k kVar, l<Bitmap> lVar, boolean z) {
        T o0 = z ? o0(kVar, lVar) : Z(kVar, lVar);
        o0.D = true;
        return o0;
    }

    private T f0() {
        return this;
    }

    private T g0() {
        if (!this.y) {
            return f0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final com.bumptech.glide.load.f A() {
        return this.q;
    }

    public final float B() {
        return this.f8892g;
    }

    public final Resources.Theme C() {
        return this.z;
    }

    public final Map<Class<?>, l<?>> E() {
        return this.w;
    }

    public final boolean F() {
        return this.E;
    }

    public final boolean G() {
        return this.B;
    }

    public final boolean H() {
        return this.n;
    }

    public final boolean I() {
        return M(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K() {
        return this.D;
    }

    public final boolean O() {
        return this.s;
    }

    public final boolean Q() {
        return this.r;
    }

    public final boolean R() {
        return M(RecyclerView.l.FLAG_MOVED);
    }

    public final boolean S() {
        return com.bumptech.glide.r.k.t(this.p, this.o);
    }

    public T T() {
        this.y = true;
        return f0();
    }

    public T U() {
        return Z(com.bumptech.glide.load.o.c.k.f8767b, new com.bumptech.glide.load.o.c.g());
    }

    public T V() {
        return X(com.bumptech.glide.load.o.c.k.f8770e, new com.bumptech.glide.load.o.c.h());
    }

    public T W() {
        return X(com.bumptech.glide.load.o.c.k.a, new p());
    }

    final T Z(com.bumptech.glide.load.o.c.k kVar, l<Bitmap> lVar) {
        if (this.A) {
            return (T) clone().Z(kVar, lVar);
        }
        j(kVar);
        return n0(lVar, false);
    }

    public T a0(int i2, int i3) {
        if (this.A) {
            return (T) clone().a0(i2, i3);
        }
        this.p = i2;
        this.o = i3;
        this.f8891f |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return g0();
    }

    public T b(a<?> aVar) {
        if (this.A) {
            return (T) clone().b(aVar);
        }
        if (N(aVar.f8891f, 2)) {
            this.f8892g = aVar.f8892g;
        }
        if (N(aVar.f8891f, 262144)) {
            this.B = aVar.B;
        }
        if (N(aVar.f8891f, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES)) {
            this.E = aVar.E;
        }
        if (N(aVar.f8891f, 4)) {
            this.f8893h = aVar.f8893h;
        }
        if (N(aVar.f8891f, 8)) {
            this.f8894i = aVar.f8894i;
        }
        if (N(aVar.f8891f, 16)) {
            this.f8895j = aVar.f8895j;
            this.f8896k = 0;
            this.f8891f &= -33;
        }
        if (N(aVar.f8891f, 32)) {
            this.f8896k = aVar.f8896k;
            this.f8895j = null;
            this.f8891f &= -17;
        }
        if (N(aVar.f8891f, 64)) {
            this.l = aVar.l;
            this.m = 0;
            this.f8891f &= -129;
        }
        if (N(aVar.f8891f, 128)) {
            this.m = aVar.m;
            this.l = null;
            this.f8891f &= -65;
        }
        if (N(aVar.f8891f, 256)) {
            this.n = aVar.n;
        }
        if (N(aVar.f8891f, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.p = aVar.p;
            this.o = aVar.o;
        }
        if (N(aVar.f8891f, 1024)) {
            this.q = aVar.q;
        }
        if (N(aVar.f8891f, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.x = aVar.x;
        }
        if (N(aVar.f8891f, 8192)) {
            this.t = aVar.t;
            this.u = 0;
            this.f8891f &= -16385;
        }
        if (N(aVar.f8891f, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.u = aVar.u;
            this.t = null;
            this.f8891f &= -8193;
        }
        if (N(aVar.f8891f, 32768)) {
            this.z = aVar.z;
        }
        if (N(aVar.f8891f, 65536)) {
            this.s = aVar.s;
        }
        if (N(aVar.f8891f, 131072)) {
            this.r = aVar.r;
        }
        if (N(aVar.f8891f, RecyclerView.l.FLAG_MOVED)) {
            this.w.putAll(aVar.w);
            this.D = aVar.D;
        }
        if (N(aVar.f8891f, 524288)) {
            this.C = aVar.C;
        }
        if (!this.s) {
            this.w.clear();
            int i2 = this.f8891f & (-2049);
            this.f8891f = i2;
            this.r = false;
            this.f8891f = i2 & (-131073);
            this.D = true;
        }
        this.f8891f |= aVar.f8891f;
        this.v.b(aVar.v);
        return g0();
    }

    public T b0(int i2) {
        if (this.A) {
            return (T) clone().b0(i2);
        }
        this.m = i2;
        int i3 = this.f8891f | 128;
        this.f8891f = i3;
        this.l = null;
        this.f8891f = i3 & (-65);
        return g0();
    }

    public T c() {
        if (this.y && !this.A) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.A = true;
        return T();
    }

    public T c0(Drawable drawable) {
        if (this.A) {
            return (T) clone().c0(drawable);
        }
        this.l = drawable;
        int i2 = this.f8891f | 64;
        this.f8891f = i2;
        this.m = 0;
        this.f8891f = i2 & (-129);
        return g0();
    }

    public T d() {
        return o0(com.bumptech.glide.load.o.c.k.f8767b, new com.bumptech.glide.load.o.c.g());
    }

    public T d0(com.bumptech.glide.g gVar) {
        if (this.A) {
            return (T) clone().d0(gVar);
        }
        this.f8894i = (com.bumptech.glide.g) com.bumptech.glide.r.j.d(gVar);
        this.f8891f |= 8;
        return g0();
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            com.bumptech.glide.load.i iVar = new com.bumptech.glide.load.i();
            t.v = iVar;
            iVar.b(this.v);
            com.bumptech.glide.r.b bVar = new com.bumptech.glide.r.b();
            t.w = bVar;
            bVar.putAll(this.w);
            t.y = false;
            t.A = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f8892g, this.f8892g) == 0 && this.f8896k == aVar.f8896k && com.bumptech.glide.r.k.d(this.f8895j, aVar.f8895j) && this.m == aVar.m && com.bumptech.glide.r.k.d(this.l, aVar.l) && this.u == aVar.u && com.bumptech.glide.r.k.d(this.t, aVar.t) && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.r == aVar.r && this.s == aVar.s && this.B == aVar.B && this.C == aVar.C && this.f8893h.equals(aVar.f8893h) && this.f8894i == aVar.f8894i && this.v.equals(aVar.v) && this.w.equals(aVar.w) && this.x.equals(aVar.x) && com.bumptech.glide.r.k.d(this.q, aVar.q) && com.bumptech.glide.r.k.d(this.z, aVar.z);
    }

    public T g(Class<?> cls) {
        if (this.A) {
            return (T) clone().g(cls);
        }
        this.x = (Class) com.bumptech.glide.r.j.d(cls);
        this.f8891f |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
        return g0();
    }

    public T h() {
        return h0(com.bumptech.glide.load.o.c.l.f8779d, Boolean.FALSE);
    }

    public <Y> T h0(com.bumptech.glide.load.h<Y> hVar, Y y) {
        if (this.A) {
            return (T) clone().h0(hVar, y);
        }
        com.bumptech.glide.r.j.d(hVar);
        com.bumptech.glide.r.j.d(y);
        this.v.c(hVar, y);
        return g0();
    }

    public int hashCode() {
        return com.bumptech.glide.r.k.o(this.z, com.bumptech.glide.r.k.o(this.q, com.bumptech.glide.r.k.o(this.x, com.bumptech.glide.r.k.o(this.w, com.bumptech.glide.r.k.o(this.v, com.bumptech.glide.r.k.o(this.f8894i, com.bumptech.glide.r.k.o(this.f8893h, com.bumptech.glide.r.k.p(this.C, com.bumptech.glide.r.k.p(this.B, com.bumptech.glide.r.k.p(this.s, com.bumptech.glide.r.k.p(this.r, com.bumptech.glide.r.k.n(this.p, com.bumptech.glide.r.k.n(this.o, com.bumptech.glide.r.k.p(this.n, com.bumptech.glide.r.k.o(this.t, com.bumptech.glide.r.k.n(this.u, com.bumptech.glide.r.k.o(this.l, com.bumptech.glide.r.k.n(this.m, com.bumptech.glide.r.k.o(this.f8895j, com.bumptech.glide.r.k.n(this.f8896k, com.bumptech.glide.r.k.k(this.f8892g)))))))))))))))))))));
    }

    public T i(com.bumptech.glide.load.engine.j jVar) {
        if (this.A) {
            return (T) clone().i(jVar);
        }
        this.f8893h = (com.bumptech.glide.load.engine.j) com.bumptech.glide.r.j.d(jVar);
        this.f8891f |= 4;
        return g0();
    }

    public T j(com.bumptech.glide.load.o.c.k kVar) {
        return h0(com.bumptech.glide.load.o.c.k.f8773h, com.bumptech.glide.r.j.d(kVar));
    }

    public T j0(com.bumptech.glide.load.f fVar) {
        if (this.A) {
            return (T) clone().j0(fVar);
        }
        this.q = (com.bumptech.glide.load.f) com.bumptech.glide.r.j.d(fVar);
        this.f8891f |= 1024;
        return g0();
    }

    public T k(com.bumptech.glide.load.b bVar) {
        com.bumptech.glide.r.j.d(bVar);
        return (T) h0(com.bumptech.glide.load.o.c.l.a, bVar).h0(com.bumptech.glide.load.o.g.i.a, bVar);
    }

    public T k0(float f2) {
        if (this.A) {
            return (T) clone().k0(f2);
        }
        if (f2 >= 0.0f && f2 <= 1.0f) {
            this.f8892g = f2;
            this.f8891f |= 2;
            return g0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public final com.bumptech.glide.load.engine.j l() {
        return this.f8893h;
    }

    public T l0(boolean z) {
        if (this.A) {
            return (T) clone().l0(true);
        }
        this.n = !z;
        this.f8891f |= 256;
        return g0();
    }

    public final int m() {
        return this.f8896k;
    }

    public T m0(l<Bitmap> lVar) {
        return n0(lVar, true);
    }

    public final Drawable n() {
        return this.f8895j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    T n0(l<Bitmap> lVar, boolean z) {
        if (this.A) {
            return (T) clone().n0(lVar, z);
        }
        n nVar = new n(lVar, z);
        p0(Bitmap.class, lVar, z);
        p0(Drawable.class, nVar, z);
        p0(BitmapDrawable.class, nVar.a(), z);
        p0(com.bumptech.glide.load.o.g.c.class, new com.bumptech.glide.load.o.g.f(lVar), z);
        return g0();
    }

    public final Drawable o() {
        return this.t;
    }

    final T o0(com.bumptech.glide.load.o.c.k kVar, l<Bitmap> lVar) {
        if (this.A) {
            return (T) clone().o0(kVar, lVar);
        }
        j(kVar);
        return m0(lVar);
    }

    public final int p() {
        return this.u;
    }

    <Y> T p0(Class<Y> cls, l<Y> lVar, boolean z) {
        if (this.A) {
            return (T) clone().p0(cls, lVar, z);
        }
        com.bumptech.glide.r.j.d(cls);
        com.bumptech.glide.r.j.d(lVar);
        this.w.put(cls, lVar);
        int i2 = this.f8891f | RecyclerView.l.FLAG_MOVED;
        this.f8891f = i2;
        this.s = true;
        int i3 = i2 | 65536;
        this.f8891f = i3;
        this.D = false;
        if (z) {
            this.f8891f = i3 | 131072;
            this.r = true;
        }
        return g0();
    }

    public final boolean q() {
        return this.C;
    }

    @Deprecated
    public T q0(l<Bitmap>... lVarArr) {
        return n0(new com.bumptech.glide.load.g(lVarArr), true);
    }

    public final com.bumptech.glide.load.i r() {
        return this.v;
    }

    public T r0(boolean z) {
        if (this.A) {
            return (T) clone().r0(z);
        }
        this.E = z;
        this.f8891f |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
        return g0();
    }

    public final int s() {
        return this.o;
    }

    public final int t() {
        return this.p;
    }

    public final Drawable u() {
        return this.l;
    }

    public final int v() {
        return this.m;
    }

    public final com.bumptech.glide.g x() {
        return this.f8894i;
    }

    public final Class<?> y() {
        return this.x;
    }
}
