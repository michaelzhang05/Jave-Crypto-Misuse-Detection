package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final c3.c f4077m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f4078a;

    /* renamed from: b, reason: collision with root package name */
    d f4079b;

    /* renamed from: c, reason: collision with root package name */
    d f4080c;

    /* renamed from: d, reason: collision with root package name */
    d f4081d;

    /* renamed from: e, reason: collision with root package name */
    c3.c f4082e;

    /* renamed from: f, reason: collision with root package name */
    c3.c f4083f;

    /* renamed from: g, reason: collision with root package name */
    c3.c f4084g;

    /* renamed from: h, reason: collision with root package name */
    c3.c f4085h;

    /* renamed from: i, reason: collision with root package name */
    f f4086i;

    /* renamed from: j, reason: collision with root package name */
    f f4087j;

    /* renamed from: k, reason: collision with root package name */
    f f4088k;

    /* renamed from: l, reason: collision with root package name */
    f f4089l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f4090a;

        /* renamed from: b, reason: collision with root package name */
        private d f4091b;

        /* renamed from: c, reason: collision with root package name */
        private d f4092c;

        /* renamed from: d, reason: collision with root package name */
        private d f4093d;

        /* renamed from: e, reason: collision with root package name */
        private c3.c f4094e;

        /* renamed from: f, reason: collision with root package name */
        private c3.c f4095f;

        /* renamed from: g, reason: collision with root package name */
        private c3.c f4096g;

        /* renamed from: h, reason: collision with root package name */
        private c3.c f4097h;

        /* renamed from: i, reason: collision with root package name */
        private f f4098i;

        /* renamed from: j, reason: collision with root package name */
        private f f4099j;

        /* renamed from: k, reason: collision with root package name */
        private f f4100k;

        /* renamed from: l, reason: collision with root package name */
        private f f4101l;

        public b() {
            this.f4090a = h.b();
            this.f4091b = h.b();
            this.f4092c = h.b();
            this.f4093d = h.b();
            this.f4094e = new c3.a(0.0f);
            this.f4095f = new c3.a(0.0f);
            this.f4096g = new c3.a(0.0f);
            this.f4097h = new c3.a(0.0f);
            this.f4098i = h.c();
            this.f4099j = h.c();
            this.f4100k = h.c();
            this.f4101l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f4076a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f4024a;
            }
            return -1.0f;
        }

        public b A(float f6) {
            this.f4094e = new c3.a(f6);
            return this;
        }

        public b B(c3.c cVar) {
            this.f4094e = cVar;
            return this;
        }

        public b C(int i6, c3.c cVar) {
            return D(h.a(i6)).F(cVar);
        }

        public b D(d dVar) {
            this.f4091b = dVar;
            float n6 = n(dVar);
            if (n6 != -1.0f) {
                E(n6);
            }
            return this;
        }

        public b E(float f6) {
            this.f4095f = new c3.a(f6);
            return this;
        }

        public b F(c3.c cVar) {
            this.f4095f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f6) {
            return A(f6).E(f6).w(f6).s(f6);
        }

        public b p(c3.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i6, c3.c cVar) {
            return r(h.a(i6)).t(cVar);
        }

        public b r(d dVar) {
            this.f4093d = dVar;
            float n6 = n(dVar);
            if (n6 != -1.0f) {
                s(n6);
            }
            return this;
        }

        public b s(float f6) {
            this.f4097h = new c3.a(f6);
            return this;
        }

        public b t(c3.c cVar) {
            this.f4097h = cVar;
            return this;
        }

        public b u(int i6, c3.c cVar) {
            return v(h.a(i6)).x(cVar);
        }

        public b v(d dVar) {
            this.f4092c = dVar;
            float n6 = n(dVar);
            if (n6 != -1.0f) {
                w(n6);
            }
            return this;
        }

        public b w(float f6) {
            this.f4096g = new c3.a(f6);
            return this;
        }

        public b x(c3.c cVar) {
            this.f4096g = cVar;
            return this;
        }

        public b y(int i6, c3.c cVar) {
            return z(h.a(i6)).B(cVar);
        }

        public b z(d dVar) {
            this.f4090a = dVar;
            float n6 = n(dVar);
            if (n6 != -1.0f) {
                A(n6);
            }
            return this;
        }

        public b(k kVar) {
            this.f4090a = h.b();
            this.f4091b = h.b();
            this.f4092c = h.b();
            this.f4093d = h.b();
            this.f4094e = new c3.a(0.0f);
            this.f4095f = new c3.a(0.0f);
            this.f4096g = new c3.a(0.0f);
            this.f4097h = new c3.a(0.0f);
            this.f4098i = h.c();
            this.f4099j = h.c();
            this.f4100k = h.c();
            this.f4101l = h.c();
            this.f4090a = kVar.f4078a;
            this.f4091b = kVar.f4079b;
            this.f4092c = kVar.f4080c;
            this.f4093d = kVar.f4081d;
            this.f4094e = kVar.f4082e;
            this.f4095f = kVar.f4083f;
            this.f4096g = kVar.f4084g;
            this.f4097h = kVar.f4085h;
            this.f4098i = kVar.f4086i;
            this.f4099j = kVar.f4087j;
            this.f4100k = kVar.f4088k;
            this.f4101l = kVar.f4089l;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        c3.c a(c3.c cVar);
    }

    public k() {
        this.f4078a = h.b();
        this.f4079b = h.b();
        this.f4080c = h.b();
        this.f4081d = h.b();
        this.f4082e = new c3.a(0.0f);
        this.f4083f = new c3.a(0.0f);
        this.f4084g = new c3.a(0.0f);
        this.f4085h = new c3.a(0.0f);
        this.f4086i = h.c();
        this.f4087j = h.c();
        this.f4088k = h.c();
        this.f4089l = h.c();
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i6, int i7) {
        return c(context, i6, i7, 0);
    }

    private static b c(Context context, int i6, int i7, int i8) {
        return d(context, i6, i7, new c3.a(i8));
    }

    private static b d(Context context, int i6, int i7, c3.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i6);
        if (i7 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i7);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(m2.j.f7733e4);
        try {
            int i8 = obtainStyledAttributes.getInt(m2.j.f7740f4, 0);
            int i9 = obtainStyledAttributes.getInt(m2.j.f7761i4, i8);
            int i10 = obtainStyledAttributes.getInt(m2.j.f7768j4, i8);
            int i11 = obtainStyledAttributes.getInt(m2.j.f7754h4, i8);
            int i12 = obtainStyledAttributes.getInt(m2.j.f7747g4, i8);
            c3.c m6 = m(obtainStyledAttributes, m2.j.f7775k4, cVar);
            c3.c m7 = m(obtainStyledAttributes, m2.j.f7796n4, m6);
            c3.c m8 = m(obtainStyledAttributes, m2.j.f7803o4, m6);
            c3.c m9 = m(obtainStyledAttributes, m2.j.f7789m4, m6);
            return new b().y(i9, m7).C(i10, m8).u(i11, m9).q(i12, m(obtainStyledAttributes, m2.j.f7782l4, m6));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i6, int i7) {
        return f(context, attributeSet, i6, i7, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i6, int i7, int i8) {
        return g(context, attributeSet, i6, i7, new c3.a(i8));
    }

    public static b g(Context context, AttributeSet attributeSet, int i6, int i7, c3.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m2.j.f7767j3, i6, i7);
        int resourceId = obtainStyledAttributes.getResourceId(m2.j.f7774k3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(m2.j.f7781l3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c3.c m(TypedArray typedArray, int i6, c3.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i6);
        if (peekValue == null) {
            return cVar;
        }
        int i7 = peekValue.type;
        return i7 == 5 ? new c3.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i7 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f4088k;
    }

    public d i() {
        return this.f4081d;
    }

    public c3.c j() {
        return this.f4085h;
    }

    public d k() {
        return this.f4080c;
    }

    public c3.c l() {
        return this.f4084g;
    }

    public f n() {
        return this.f4089l;
    }

    public f o() {
        return this.f4087j;
    }

    public f p() {
        return this.f4086i;
    }

    public d q() {
        return this.f4078a;
    }

    public c3.c r() {
        return this.f4082e;
    }

    public d s() {
        return this.f4079b;
    }

    public c3.c t() {
        return this.f4083f;
    }

    public boolean u(RectF rectF) {
        boolean z5 = this.f4089l.getClass().equals(f.class) && this.f4087j.getClass().equals(f.class) && this.f4086i.getClass().equals(f.class) && this.f4088k.getClass().equals(f.class);
        float a6 = this.f4082e.a(rectF);
        return z5 && ((this.f4083f.a(rectF) > a6 ? 1 : (this.f4083f.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4085h.a(rectF) > a6 ? 1 : (this.f4085h.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4084g.a(rectF) > a6 ? 1 : (this.f4084g.a(rectF) == a6 ? 0 : -1)) == 0) && ((this.f4079b instanceof j) && (this.f4078a instanceof j) && (this.f4080c instanceof j) && (this.f4081d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f6) {
        return v().o(f6).m();
    }

    public k x(c3.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f4078a = bVar.f4090a;
        this.f4079b = bVar.f4091b;
        this.f4080c = bVar.f4092c;
        this.f4081d = bVar.f4093d;
        this.f4082e = bVar.f4094e;
        this.f4083f = bVar.f4095f;
        this.f4084g = bVar.f4096g;
        this.f4085h = bVar.f4097h;
        this.f4086i = bVar.f4098i;
        this.f4087j = bVar.f4099j;
        this.f4088k = bVar.f4100k;
        this.f4089l = bVar.f4101l;
    }
}
