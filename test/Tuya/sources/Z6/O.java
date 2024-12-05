package z6;

import kotlin.jvm.internal.AbstractC3159y;
import w6.AbstractC3854b;
import x6.AbstractC3937b;
import y6.AbstractC3999a;
import y6.C4004f;

/* loaded from: classes5.dex */
public final class O extends AbstractC3854b implements y6.m {

    /* renamed from: a, reason: collision with root package name */
    private final C4048h f40526a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3999a f40527b;

    /* renamed from: c, reason: collision with root package name */
    private final U f40528c;

    /* renamed from: d, reason: collision with root package name */
    private final y6.m[] f40529d;

    /* renamed from: e, reason: collision with root package name */
    private final A6.b f40530e;

    /* renamed from: f, reason: collision with root package name */
    private final C4004f f40531f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40532g;

    /* renamed from: h, reason: collision with root package name */
    private String f40533h;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40534a;

        static {
            int[] iArr = new int[U.values().length];
            try {
                iArr[U.f40540d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U.f40541e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U.f40542f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40534a = iArr;
        }
    }

    public O(C4048h composer, AbstractC3999a json, U mode, y6.m[] mVarArr) {
        AbstractC3159y.i(composer, "composer");
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(mode, "mode");
        this.f40526a = composer;
        this.f40527b = json;
        this.f40528c = mode;
        this.f40529d = mVarArr;
        this.f40530e = c().e();
        this.f40531f = c().d();
        int ordinal = mode.ordinal();
        if (mVarArr != null) {
            y6.m mVar = mVarArr[ordinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[ordinal] = this;
        }
    }

    private final void I(v6.f fVar) {
        this.f40526a.c();
        String str = this.f40533h;
        AbstractC3159y.f(str);
        E(str);
        this.f40526a.e(':');
        this.f40526a.o();
        E(fVar.a());
    }

    @Override // w6.AbstractC3854b, w6.f
    public void C(long j8) {
        if (this.f40532g) {
            E(String.valueOf(j8));
        } else {
            this.f40526a.i(j8);
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void E(String value) {
        AbstractC3159y.i(value, "value");
        this.f40526a.m(value);
    }

    @Override // w6.AbstractC3854b, w6.f
    public w6.f F(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (P.b(descriptor)) {
            C4048h c4048h = this.f40526a;
            if (!(c4048h instanceof C4057q)) {
                c4048h = new C4057q(c4048h.f40561a, this.f40532g);
            }
            return new O(c4048h, c(), this.f40528c, (y6.m[]) null);
        }
        if (P.a(descriptor)) {
            C4048h c4048h2 = this.f40526a;
            if (!(c4048h2 instanceof C4049i)) {
                c4048h2 = new C4049i(c4048h2.f40561a, this.f40532g);
            }
            return new O(c4048h2, c(), this.f40528c, (y6.m[]) null);
        }
        return super.F(descriptor);
    }

    @Override // w6.AbstractC3854b
    public boolean G(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        int i9 = a.f40534a[this.f40528c.ordinal()];
        if (i9 != 1) {
            boolean z8 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f40526a.a()) {
                        this.f40526a.e(',');
                    }
                    this.f40526a.c();
                    E(AbstractC4032C.g(descriptor, c(), i8));
                    this.f40526a.e(':');
                    this.f40526a.o();
                } else {
                    if (i8 == 0) {
                        this.f40532g = true;
                    }
                    if (i8 == 1) {
                        this.f40526a.e(',');
                        this.f40526a.o();
                        this.f40532g = false;
                    }
                }
            } else if (!this.f40526a.a()) {
                if (i8 % 2 == 0) {
                    this.f40526a.e(',');
                    this.f40526a.c();
                    z8 = true;
                } else {
                    this.f40526a.e(':');
                    this.f40526a.o();
                }
                this.f40532g = z8;
            } else {
                this.f40532g = true;
                this.f40526a.c();
            }
        } else {
            if (!this.f40526a.a()) {
                this.f40526a.e(',');
            }
            this.f40526a.c();
        }
        return true;
    }

    @Override // w6.AbstractC3854b, w6.d
    public void a(v6.f descriptor) {
        AbstractC3159y.i(descriptor, "descriptor");
        if (this.f40528c.f40546b != 0) {
            this.f40526a.p();
            this.f40526a.c();
            this.f40526a.e(this.f40528c.f40546b);
        }
    }

    @Override // w6.f
    public A6.b b() {
        return this.f40530e;
    }

    @Override // y6.m
    public AbstractC3999a c() {
        return this.f40527b;
    }

    @Override // w6.AbstractC3854b, w6.f
    public w6.d d(v6.f descriptor) {
        y6.m mVar;
        AbstractC3159y.i(descriptor, "descriptor");
        U b8 = V.b(c(), descriptor);
        char c8 = b8.f40545a;
        if (c8 != 0) {
            this.f40526a.e(c8);
            this.f40526a.b();
        }
        if (this.f40533h != null) {
            I(descriptor);
            this.f40533h = null;
        }
        if (this.f40528c == b8) {
            return this;
        }
        y6.m[] mVarArr = this.f40529d;
        if (mVarArr == null || (mVar = mVarArr[b8.ordinal()]) == null) {
            return new O(this.f40526a, c(), b8, this.f40529d);
        }
        return mVar;
    }

    @Override // w6.f
    public void e(v6.f enumDescriptor, int i8) {
        AbstractC3159y.i(enumDescriptor, "enumDescriptor");
        E(enumDescriptor.f(i8));
    }

    @Override // w6.f
    public void f() {
        this.f40526a.j("null");
    }

    @Override // w6.AbstractC3854b, w6.f
    public void g(double d8) {
        if (this.f40532g) {
            E(String.valueOf(d8));
        } else {
            this.f40526a.f(d8);
        }
        if (!this.f40531f.a()) {
            if (Double.isInfinite(d8) || Double.isNaN(d8)) {
                throw AbstractC4031B.b(Double.valueOf(d8), this.f40526a.f40561a.toString());
            }
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void h(short s8) {
        if (this.f40532g) {
            E(String.valueOf((int) s8));
        } else {
            this.f40526a.k(s8);
        }
    }

    @Override // w6.AbstractC3854b, w6.d
    public boolean i(v6.f descriptor, int i8) {
        AbstractC3159y.i(descriptor, "descriptor");
        return this.f40531f.g();
    }

    @Override // w6.AbstractC3854b, w6.f
    public void j(t6.i serializer, Object obj) {
        AbstractC3159y.i(serializer, "serializer");
        if ((serializer instanceof AbstractC3937b) && !c().d().n()) {
            AbstractC3937b abstractC3937b = (AbstractC3937b) serializer;
            String c8 = L.c(serializer.a(), c());
            AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            t6.i b8 = t6.f.b(abstractC3937b, this, obj);
            L.e(abstractC3937b, b8, c8);
            L.b(b8.a().getKind());
            this.f40533h = c8;
            b8.e(this, obj);
            return;
        }
        serializer.e(this, obj);
    }

    @Override // w6.AbstractC3854b, w6.f
    public void l(byte b8) {
        if (this.f40532g) {
            E(String.valueOf((int) b8));
        } else {
            this.f40526a.d(b8);
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void n(boolean z8) {
        if (this.f40532g) {
            E(String.valueOf(z8));
        } else {
            this.f40526a.l(z8);
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void p(float f8) {
        if (this.f40532g) {
            E(String.valueOf(f8));
        } else {
            this.f40526a.g(f8);
        }
        if (!this.f40531f.a()) {
            if (Float.isInfinite(f8) || Float.isNaN(f8)) {
                throw AbstractC4031B.b(Float.valueOf(f8), this.f40526a.f40561a.toString());
            }
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void q(char c8) {
        E(String.valueOf(c8));
    }

    @Override // w6.AbstractC3854b, w6.d
    public void u(v6.f descriptor, int i8, t6.i serializer, Object obj) {
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(serializer, "serializer");
        if (obj != null || this.f40531f.h()) {
            super.u(descriptor, i8, serializer, obj);
        }
    }

    @Override // w6.AbstractC3854b, w6.f
    public void z(int i8) {
        if (this.f40532g) {
            E(String.valueOf(i8));
        } else {
            this.f40526a.h(i8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(InterfaceC4061v output, AbstractC3999a json, U mode, y6.m[] modeReuseCache) {
        this(AbstractC4058s.a(output, json), json, mode, modeReuseCache);
        AbstractC3159y.i(output, "output");
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(modeReuseCache, "modeReuseCache");
    }
}
