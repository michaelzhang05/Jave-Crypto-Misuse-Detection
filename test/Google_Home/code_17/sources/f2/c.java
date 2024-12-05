package F2;

import A2.C0947e;
import A2.InterfaceC0945c;
import F2.a;
import F2.b;
import O5.I;
import O5.p;
import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import e3.EnumC2791e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import l6.N;

/* loaded from: classes4.dex */
public final class c implements F2.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0945c f2741a;

    /* renamed from: b, reason: collision with root package name */
    private final C0947e f2742b;

    /* renamed from: c, reason: collision with root package name */
    private final g f2743c;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2744a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2745b;

        static {
            int[] iArr = new int[b.EnumC0047b.values().length];
            try {
                iArr[b.EnumC0047b.f2737d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2744a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.f2731a.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[b.a.f2732b.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f2745b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2746a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F2.a f2748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F2.a aVar, S5.d dVar) {
            super(2, dVar);
            this.f2748c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f2748c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f2746a == 0) {
                t.b(obj);
                InterfaceC0945c interfaceC0945c = c.this.f2741a;
                C0947e c0947e = c.this.f2742b;
                F2.a aVar = this.f2748c;
                interfaceC0945c.a(c0947e.g(aVar, aVar.b()));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public c(InterfaceC0945c analyticsRequestExecutor, C0947e analyticsRequestFactory, g workContext) {
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC3255y.i(workContext, "workContext");
        this.f2741a = analyticsRequestExecutor;
        this.f2742b = analyticsRequestFactory;
        this.f2743c = workContext;
    }

    private final void r(F2.a aVar) {
        AbstractC3364k.d(N.a(this.f2743c), null, null, new b(aVar, null), 3, null);
    }

    @Override // F2.b
    public void a() {
        r(new a.C0042a());
    }

    @Override // F2.b
    public void b(EnumC2791e selectedBrand) {
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        r(new a.p(selectedBrand));
    }

    @Override // F2.b
    public void c(EnumC2791e selectedBrand, Throwable error) {
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        AbstractC3255y.i(error, "error");
        r(new a.o(selectedBrand, error));
    }

    @Override // F2.b
    public void d(String code) {
        AbstractC3255y.i(code, "code");
        r(new a.m(code));
    }

    @Override // F2.b
    public void e(b.EnumC0047b screen) {
        AbstractC3255y.i(screen, "screen");
        if (a.f2744a[screen.ordinal()] == 1) {
            r(new a.k(screen));
        }
    }

    @Override // F2.b
    public void f(String type) {
        AbstractC3255y.i(type, "type");
        r(new a.c(type));
    }

    @Override // F2.b
    public void g(b.a source, EnumC2791e enumC2791e) {
        a.g.EnumC0043a enumC0043a;
        AbstractC3255y.i(source, "source");
        int i8 = a.f2745b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0043a = a.g.EnumC0043a.f2701b;
            } else {
                throw new p();
            }
        } else {
            enumC0043a = a.g.EnumC0043a.f2702c;
        }
        r(new a.g(enumC0043a, enumC2791e));
    }

    @Override // F2.b
    public void h(E2.a configuration) {
        AbstractC3255y.i(configuration, "configuration");
        r(new a.h(configuration));
    }

    @Override // F2.b
    public void i() {
        r(new a.j());
    }

    @Override // F2.b
    public void j(b.a source, EnumC2791e selectedBrand) {
        a.n.EnumC0046a enumC0046a;
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        int i8 = a.f2745b[source.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                enumC0046a = a.n.EnumC0046a.f2722b;
            } else {
                throw new p();
            }
        } else {
            enumC0046a = a.n.EnumC0046a.f2723c;
        }
        r(new a.n(enumC0046a, selectedBrand));
    }

    @Override // F2.b
    public void k(String type) {
        AbstractC3255y.i(type, "type");
        r(new a.d(type));
    }

    @Override // F2.b
    public void l() {
        r(new a.i());
    }

    @Override // F2.b
    public void m() {
        r(new a.f());
    }

    @Override // F2.b
    public void n(b.EnumC0047b screen) {
        AbstractC3255y.i(screen, "screen");
        r(new a.l(screen));
    }

    @Override // F2.b
    public void o() {
        r(new a.e());
    }
}
