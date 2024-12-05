package e.e.b.b.z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes2.dex */
public class k {
    public static final e.e.b.b.z.c a = new i(0.5f);

    /* renamed from: b, reason: collision with root package name */
    d f17590b;

    /* renamed from: c, reason: collision with root package name */
    d f17591c;

    /* renamed from: d, reason: collision with root package name */
    d f17592d;

    /* renamed from: e, reason: collision with root package name */
    d f17593e;

    /* renamed from: f, reason: collision with root package name */
    e.e.b.b.z.c f17594f;

    /* renamed from: g, reason: collision with root package name */
    e.e.b.b.z.c f17595g;

    /* renamed from: h, reason: collision with root package name */
    e.e.b.b.z.c f17596h;

    /* renamed from: i, reason: collision with root package name */
    e.e.b.b.z.c f17597i;

    /* renamed from: j, reason: collision with root package name */
    f f17598j;

    /* renamed from: k, reason: collision with root package name */
    f f17599k;
    f l;
    f m;

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes2.dex */
    public interface c {
        e.e.b.b.z.c a(e.e.b.b.z.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new e.e.b.b.z.a(i4));
    }

    private static b d(Context context, int i2, int i3, e.e.b.b.z.c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, e.e.b.b.l.T3);
        try {
            int i4 = obtainStyledAttributes.getInt(e.e.b.b.l.U3, 0);
            int i5 = obtainStyledAttributes.getInt(e.e.b.b.l.X3, i4);
            int i6 = obtainStyledAttributes.getInt(e.e.b.b.l.Y3, i4);
            int i7 = obtainStyledAttributes.getInt(e.e.b.b.l.W3, i4);
            int i8 = obtainStyledAttributes.getInt(e.e.b.b.l.V3, i4);
            e.e.b.b.z.c m = m(obtainStyledAttributes, e.e.b.b.l.Z3, cVar);
            e.e.b.b.z.c m2 = m(obtainStyledAttributes, e.e.b.b.l.c4, m);
            e.e.b.b.z.c m3 = m(obtainStyledAttributes, e.e.b.b.l.d4, m);
            e.e.b.b.z.c m4 = m(obtainStyledAttributes, e.e.b.b.l.b4, m);
            return new b().x(i5, m2).B(i6, m3).t(i7, m4).p(i8, m(obtainStyledAttributes, e.e.b.b.l.a4, m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new e.e.b.b.z.a(i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, e.e.b.b.z.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.e.b.b.l.w3, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(e.e.b.b.l.x3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(e.e.b.b.l.y3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static e.e.b.b.z.c m(TypedArray typedArray, int i2, e.e.b.b.z.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new e.e.b.b.z.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.l;
    }

    public d i() {
        return this.f17593e;
    }

    public e.e.b.b.z.c j() {
        return this.f17597i;
    }

    public d k() {
        return this.f17592d;
    }

    public e.e.b.b.z.c l() {
        return this.f17596h;
    }

    public f n() {
        return this.m;
    }

    public f o() {
        return this.f17599k;
    }

    public f p() {
        return this.f17598j;
    }

    public d q() {
        return this.f17590b;
    }

    public e.e.b.b.z.c r() {
        return this.f17594f;
    }

    public d s() {
        return this.f17591c;
    }

    public e.e.b.b.z.c t() {
        return this.f17595g;
    }

    public boolean u(RectF rectF) {
        boolean z = this.m.getClass().equals(f.class) && this.f17599k.getClass().equals(f.class) && this.f17598j.getClass().equals(f.class) && this.l.getClass().equals(f.class);
        float a2 = this.f17594f.a(rectF);
        return z && ((this.f17595g.a(rectF) > a2 ? 1 : (this.f17595g.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f17597i.a(rectF) > a2 ? 1 : (this.f17597i.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f17596h.a(rectF) > a2 ? 1 : (this.f17596h.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f17591c instanceof j) && (this.f17590b instanceof j) && (this.f17592d instanceof j) && (this.f17593e instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        return v().o(f2).m();
    }

    public k x(c cVar) {
        return v().A(cVar.a(r())).E(cVar.a(t())).s(cVar.a(j())).w(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f17590b = bVar.a;
        this.f17591c = bVar.f17600b;
        this.f17592d = bVar.f17601c;
        this.f17593e = bVar.f17602d;
        this.f17594f = bVar.f17603e;
        this.f17595g = bVar.f17604f;
        this.f17596h = bVar.f17605g;
        this.f17597i = bVar.f17606h;
        this.f17598j = bVar.f17607i;
        this.f17599k = bVar.f17608j;
        this.l = bVar.f17609k;
        this.m = bVar.l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private d a;

        /* renamed from: b, reason: collision with root package name */
        private d f17600b;

        /* renamed from: c, reason: collision with root package name */
        private d f17601c;

        /* renamed from: d, reason: collision with root package name */
        private d f17602d;

        /* renamed from: e, reason: collision with root package name */
        private e.e.b.b.z.c f17603e;

        /* renamed from: f, reason: collision with root package name */
        private e.e.b.b.z.c f17604f;

        /* renamed from: g, reason: collision with root package name */
        private e.e.b.b.z.c f17605g;

        /* renamed from: h, reason: collision with root package name */
        private e.e.b.b.z.c f17606h;

        /* renamed from: i, reason: collision with root package name */
        private f f17607i;

        /* renamed from: j, reason: collision with root package name */
        private f f17608j;

        /* renamed from: k, reason: collision with root package name */
        private f f17609k;
        private f l;

        public b() {
            this.a = h.b();
            this.f17600b = h.b();
            this.f17601c = h.b();
            this.f17602d = h.b();
            this.f17603e = new e.e.b.b.z.a(0.0f);
            this.f17604f = new e.e.b.b.z.a(0.0f);
            this.f17605g = new e.e.b.b.z.a(0.0f);
            this.f17606h = new e.e.b.b.z.a(0.0f);
            this.f17607i = h.c();
            this.f17608j = h.c();
            this.f17609k = h.c();
            this.l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).a;
            }
            return -1.0f;
        }

        public b A(e.e.b.b.z.c cVar) {
            this.f17603e = cVar;
            return this;
        }

        public b B(int i2, e.e.b.b.z.c cVar) {
            return C(h.a(i2)).E(cVar);
        }

        public b C(d dVar) {
            this.f17600b = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                D(n);
            }
            return this;
        }

        public b D(float f2) {
            this.f17604f = new e.e.b.b.z.a(f2);
            return this;
        }

        public b E(e.e.b.b.z.c cVar) {
            this.f17604f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            return z(f2).D(f2).v(f2).r(f2);
        }

        public b p(int i2, e.e.b.b.z.c cVar) {
            return q(h.a(i2)).s(cVar);
        }

        public b q(d dVar) {
            this.f17602d = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                r(n);
            }
            return this;
        }

        public b r(float f2) {
            this.f17606h = new e.e.b.b.z.a(f2);
            return this;
        }

        public b s(e.e.b.b.z.c cVar) {
            this.f17606h = cVar;
            return this;
        }

        public b t(int i2, e.e.b.b.z.c cVar) {
            return u(h.a(i2)).w(cVar);
        }

        public b u(d dVar) {
            this.f17601c = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                v(n);
            }
            return this;
        }

        public b v(float f2) {
            this.f17605g = new e.e.b.b.z.a(f2);
            return this;
        }

        public b w(e.e.b.b.z.c cVar) {
            this.f17605g = cVar;
            return this;
        }

        public b x(int i2, e.e.b.b.z.c cVar) {
            return y(h.a(i2)).A(cVar);
        }

        public b y(d dVar) {
            this.a = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                z(n);
            }
            return this;
        }

        public b z(float f2) {
            this.f17603e = new e.e.b.b.z.a(f2);
            return this;
        }

        public b(k kVar) {
            this.a = h.b();
            this.f17600b = h.b();
            this.f17601c = h.b();
            this.f17602d = h.b();
            this.f17603e = new e.e.b.b.z.a(0.0f);
            this.f17604f = new e.e.b.b.z.a(0.0f);
            this.f17605g = new e.e.b.b.z.a(0.0f);
            this.f17606h = new e.e.b.b.z.a(0.0f);
            this.f17607i = h.c();
            this.f17608j = h.c();
            this.f17609k = h.c();
            this.l = h.c();
            this.a = kVar.f17590b;
            this.f17600b = kVar.f17591c;
            this.f17601c = kVar.f17592d;
            this.f17602d = kVar.f17593e;
            this.f17603e = kVar.f17594f;
            this.f17604f = kVar.f17595g;
            this.f17605g = kVar.f17596h;
            this.f17606h = kVar.f17597i;
            this.f17607i = kVar.f17598j;
            this.f17608j = kVar.f17599k;
            this.f17609k = kVar.l;
            this.l = kVar.m;
        }
    }

    public k() {
        this.f17590b = h.b();
        this.f17591c = h.b();
        this.f17592d = h.b();
        this.f17593e = h.b();
        this.f17594f = new e.e.b.b.z.a(0.0f);
        this.f17595g = new e.e.b.b.z.a(0.0f);
        this.f17596h = new e.e.b.b.z.a(0.0f);
        this.f17597i = new e.e.b.b.z.a(0.0f);
        this.f17598j = h.c();
        this.f17599k = h.c();
        this.l = h.c();
        this.m = h.c();
    }
}
