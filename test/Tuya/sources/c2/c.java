package C2;

import C2.a;
import C2.b;
import L5.I;
import L5.p;
import L5.t;
import P5.g;
import X5.n;
import b3.EnumC1870e;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import x2.C3875e;
import x2.InterfaceC3873c;

/* loaded from: classes4.dex */
public final class c implements C2.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3873c f1231a;

    /* renamed from: b, reason: collision with root package name */
    private final C3875e f1232b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1233c;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1234a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1235b;

        static {
            int[] iArr = new int[b.EnumC0023b.values().length];
            try {
                iArr[b.EnumC0023b.f1227d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1234a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.f1221a.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[b.a.f1222b.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f1235b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f1236a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2.a f1238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2.a aVar, P5.d dVar) {
            super(2, dVar);
            this.f1238c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f1238c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f1236a == 0) {
                t.b(obj);
                InterfaceC3873c interfaceC3873c = c.this.f1231a;
                C3875e c3875e = c.this.f1232b;
                C2.a aVar = this.f1238c;
                interfaceC3873c.a(c3875e.g(aVar, aVar.b()));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(InterfaceC3873c analyticsRequestExecutor, C3875e analyticsRequestFactory, g workContext) {
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3159y.i(workContext, "workContext");
        this.f1231a = analyticsRequestExecutor;
        this.f1232b = analyticsRequestFactory;
        this.f1233c = workContext;
    }

    private final void r(C2.a aVar) {
        AbstractC2829k.d(N.a(this.f1233c), null, null, new b(aVar, null), 3, null);
    }

    @Override // C2.b
    public void a() {
        r(new a.C0018a());
    }

    @Override // C2.b
    public void b(EnumC1870e selectedBrand, Throwable error) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        AbstractC3159y.i(error, "error");
        r(new a.o(selectedBrand, error));
    }

    @Override // C2.b
    public void c(EnumC1870e selectedBrand) {
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        r(new a.p(selectedBrand));
    }

    @Override // C2.b
    public void d(b.EnumC0023b screen) {
        AbstractC3159y.i(screen, "screen");
        r(new a.l(screen));
    }

    @Override // C2.b
    public void e(String code) {
        AbstractC3159y.i(code, "code");
        r(new a.m(code));
    }

    @Override // C2.b
    public void f(B2.a configuration) {
        AbstractC3159y.i(configuration, "configuration");
        r(new a.h(configuration));
    }

    @Override // C2.b
    public void g(b.a source, EnumC1870e enumC1870e) {
        a.g.EnumC0019a enumC0019a;
        AbstractC3159y.i(source, "source");
        int i8 = a.f1235b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0019a = a.g.EnumC0019a.f1191b;
            } else {
                throw new p();
            }
        } else {
            enumC0019a = a.g.EnumC0019a.f1192c;
        }
        r(new a.g(enumC0019a, enumC1870e));
    }

    @Override // C2.b
    public void h(String type) {
        AbstractC3159y.i(type, "type");
        r(new a.c(type));
    }

    @Override // C2.b
    public void i(b.EnumC0023b screen) {
        AbstractC3159y.i(screen, "screen");
        if (a.f1234a[screen.ordinal()] == 1) {
            r(new a.k(screen));
        }
    }

    @Override // C2.b
    public void j() {
        r(new a.j());
    }

    @Override // C2.b
    public void k(String type) {
        AbstractC3159y.i(type, "type");
        r(new a.d(type));
    }

    @Override // C2.b
    public void l() {
        r(new a.i());
    }

    @Override // C2.b
    public void m() {
        r(new a.f());
    }

    @Override // C2.b
    public void n() {
        r(new a.e());
    }

    @Override // C2.b
    public void o(b.a source, EnumC1870e selectedBrand) {
        a.n.EnumC0022a enumC0022a;
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        int i8 = a.f1235b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0022a = a.n.EnumC0022a.f1212b;
            } else {
                throw new p();
            }
        } else {
            enumC0022a = a.n.EnumC0022a.f1213c;
        }
        r(new a.n(enumC0022a, selectedBrand));
    }
}
