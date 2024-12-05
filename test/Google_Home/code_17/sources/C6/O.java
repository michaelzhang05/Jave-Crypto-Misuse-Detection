package C6;

import A6.AbstractC0978b;
import kotlin.jvm.internal.AbstractC3255y;
import z6.AbstractC4234b;

/* loaded from: classes5.dex */
public final class O extends AbstractC4234b implements B6.m {

    /* renamed from: a, reason: collision with root package name */
    private final C1037h f1644a;

    /* renamed from: b, reason: collision with root package name */
    private final B6.a f1645b;

    /* renamed from: c, reason: collision with root package name */
    private final U f1646c;

    /* renamed from: d, reason: collision with root package name */
    private final B6.m[] f1647d;

    /* renamed from: e, reason: collision with root package name */
    private final D6.b f1648e;

    /* renamed from: f, reason: collision with root package name */
    private final B6.f f1649f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1650g;

    /* renamed from: h, reason: collision with root package name */
    private String f1651h;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1652a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f1658d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f1659e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f1660f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1652a = iArr;
        }
    }

    public O(C1037h composer, B6.a json, U mode, B6.m[] mVarArr) {
        AbstractC3255y.i(composer, "composer");
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(mode, "mode");
        this.f1644a = composer;
        this.f1645b = json;
        this.f1646c = mode;
        this.f1647d = mVarArr;
        this.f1648e = c().e();
        this.f1649f = c().d();
        int ordinal = mode.ordinal();
        if (mVarArr != null) {
            B6.m mVar = mVarArr[ordinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[ordinal] = this;
        }
    }

    private final void I(y6.f fVar) {
        this.f1644a.c();
        String str = this.f1651h;
        AbstractC3255y.f(str);
        E(str);
        this.f1644a.e(':');
        this.f1644a.o();
        E(fVar.a());
    }

    @Override // z6.AbstractC4234b, z6.f
    public void D(long j8) {
        if (this.f1650g) {
            E(String.valueOf(j8));
        } else {
            this.f1644a.i(j8);
        }
    }

    @Override // z6.AbstractC4234b, z6.f
    public void E(String value) {
        AbstractC3255y.i(value, "value");
        this.f1644a.m(value);
    }

    @Override // z6.AbstractC4234b
    public boolean G(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        int i9 = a.f1652a[this.f1646c.ordinal()];
        if (i9 != 1) {
            boolean z8 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f1644a.a()) {
                        this.f1644a.e(',');
                    }
                    this.f1644a.c();
                    E(C.g(descriptor, c(), i8));
                    this.f1644a.e(':');
                    this.f1644a.o();
                } else {
                    if (i8 == 0) {
                        this.f1650g = true;
                    }
                    if (i8 == 1) {
                        this.f1644a.e(',');
                        this.f1644a.o();
                        this.f1650g = false;
                    }
                }
            } else if (!this.f1644a.a()) {
                if (i8 % 2 == 0) {
                    this.f1644a.e(',');
                    this.f1644a.c();
                    z8 = true;
                } else {
                    this.f1644a.e(':');
                    this.f1644a.o();
                }
                this.f1650g = z8;
            } else {
                this.f1650g = true;
                this.f1644a.c();
            }
        } else {
            if (!this.f1644a.a()) {
                this.f1644a.e(',');
            }
            this.f1644a.c();
        }
        return true;
    }

    @Override // z6.f
    public D6.b a() {
        return this.f1648e;
    }

    @Override // z6.AbstractC4234b, z6.d
    public void b(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (this.f1646c.f1664b != 0) {
            this.f1644a.p();
            this.f1644a.c();
            this.f1644a.e(this.f1646c.f1664b);
        }
    }

    @Override // B6.m
    public B6.a c() {
        return this.f1645b;
    }

    @Override // z6.AbstractC4234b, z6.f
    public z6.d d(y6.f descriptor) {
        B6.m mVar;
        AbstractC3255y.i(descriptor, "descriptor");
        U b8 = V.b(c(), descriptor);
        char c8 = b8.f1663a;
        if (c8 != 0) {
            this.f1644a.e(c8);
            this.f1644a.b();
        }
        if (this.f1651h != null) {
            I(descriptor);
            this.f1651h = null;
        }
        if (this.f1646c == b8) {
            return this;
        }
        B6.m[] mVarArr = this.f1647d;
        if (mVarArr == null || (mVar = mVarArr[b8.ordinal()]) == null) {
            return new O(this.f1644a, c(), b8, this.f1647d);
        }
        return mVar;
    }

    @Override // z6.f
    public void f() {
        this.f1644a.j("null");
    }

    @Override // z6.AbstractC4234b, z6.f
    public void g(w6.i serializer, Object obj) {
        AbstractC3255y.i(serializer, "serializer");
        if ((serializer instanceof AbstractC0978b) && !c().d().n()) {
            AbstractC0978b abstractC0978b = (AbstractC0978b) serializer;
            String c8 = L.c(serializer.a(), c());
            AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            w6.i b8 = w6.f.b(abstractC0978b, this, obj);
            L.e(abstractC0978b, b8, c8);
            L.b(b8.a().getKind());
            this.f1651h = c8;
            b8.d(this, obj);
            return;
        }
        serializer.d(this, obj);
    }

    @Override // z6.AbstractC4234b, z6.f
    public void h(double d8) {
        if (this.f1650g) {
            E(String.valueOf(d8));
        } else {
            this.f1644a.f(d8);
        }
        if (!this.f1649f.a()) {
            if (Double.isInfinite(d8) || Double.isNaN(d8)) {
                throw B.b(Double.valueOf(d8), this.f1644a.f1679a.toString());
            }
        }
    }

    @Override // z6.AbstractC4234b, z6.f
    public void i(short s8) {
        if (this.f1650g) {
            E(String.valueOf((int) s8));
        } else {
            this.f1644a.k(s8);
        }
    }

    @Override // z6.f
    public void k(y6.f enumDescriptor, int i8) {
        AbstractC3255y.i(enumDescriptor, "enumDescriptor");
        E(enumDescriptor.f(i8));
    }

    @Override // z6.AbstractC4234b, z6.f
    public z6.f l(y6.f descriptor) {
        AbstractC3255y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            C1037h c1037h = this.f1644a;
            if (!(c1037h instanceof C1046q)) {
                c1037h = new C1046q(c1037h.f1679a, this.f1650g);
            }
            return new O(c1037h, c(), this.f1646c, (B6.m[]) null);
        }
        if (P.a(descriptor)) {
            C1037h c1037h2 = this.f1644a;
            if (!(c1037h2 instanceof C1038i)) {
                c1037h2 = new C1038i(c1037h2.f1679a, this.f1650g);
            }
            return new O(c1037h2, c(), this.f1646c, (B6.m[]) null);
        }
        return super.l(descriptor);
    }

    @Override // z6.AbstractC4234b, z6.f
    public void m(byte b8) {
        if (this.f1650g) {
            E(String.valueOf((int) b8));
        } else {
            this.f1644a.d(b8);
        }
    }

    @Override // z6.AbstractC4234b, z6.f
    public void n(boolean z8) {
        if (this.f1650g) {
            E(String.valueOf(z8));
        } else {
            this.f1644a.l(z8);
        }
    }

    @Override // z6.AbstractC4234b, z6.d
    public boolean p(y6.f descriptor, int i8) {
        AbstractC3255y.i(descriptor, "descriptor");
        return this.f1649f.g();
    }

    @Override // z6.AbstractC4234b, z6.f
    public void r(float f8) {
        if (this.f1650g) {
            E(String.valueOf(f8));
        } else {
            this.f1644a.g(f8);
        }
        if (!this.f1649f.a()) {
            if (Float.isInfinite(f8) || Float.isNaN(f8)) {
                throw B.b(Float.valueOf(f8), this.f1644a.f1679a.toString());
            }
        }
    }

    @Override // z6.AbstractC4234b, z6.f
    public void t(char c8) {
        E(String.valueOf(c8));
    }

    @Override // z6.AbstractC4234b, z6.d
    public void x(y6.f descriptor, int i8, w6.i serializer, Object obj) {
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(serializer, "serializer");
        if (obj != null || this.f1649f.h()) {
            super.x(descriptor, i8, serializer, obj);
        }
    }

    @Override // z6.AbstractC4234b, z6.f
    public void z(int i8) {
        if (this.f1650g) {
            E(String.valueOf(i8));
        } else {
            this.f1644a.h(i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(InterfaceC1050v output, B6.a json, U mode, B6.m[] modeReuseCache) {
        this(AbstractC1047s.a(output, json), json, mode, modeReuseCache);
        AbstractC3255y.i(output, "output");
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(mode, "mode");
        AbstractC3255y.i(modeReuseCache, "modeReuseCache");
    }
}
