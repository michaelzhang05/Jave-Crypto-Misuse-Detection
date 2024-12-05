package T2;

import L5.I;
import L5.p;
import L5.t;
import M5.AbstractC1246t;
import T2.m;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;
import m4.C3399A;
import m4.J;
import m4.Q;
import m4.g0;
import m4.s0;
import r2.InterfaceC3684d;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final T2.k f9723a;

    /* renamed from: b, reason: collision with root package name */
    private final L2.b f9724b;

    /* renamed from: c, reason: collision with root package name */
    private final M2.e f9725c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3684d f9726d;

    /* renamed from: e, reason: collision with root package name */
    private final T2.e f9727e;

    /* renamed from: f, reason: collision with root package name */
    private final v f9728f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f9729g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f9730h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f9731i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9732j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9733k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9734l;

    /* renamed from: m, reason: collision with root package name */
    private final s0 f9735m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f9736n;

    /* renamed from: o, reason: collision with root package name */
    private final s0 f9737o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f9738p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f9739q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3349K f9740r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f9741s;

    /* renamed from: t, reason: collision with root package name */
    private final v f9742t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f9743u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9744v;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final T2.k f9745a;

        /* renamed from: b, reason: collision with root package name */
        private final N2.b f9746b;

        public a(T2.k signupMode, N2.b linkComponent) {
            AbstractC3159y.i(signupMode, "signupMode");
            AbstractC3159y.i(linkComponent, "linkComponent");
            this.f9745a = signupMode;
            this.f9746b = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            c a8 = this.f9746b.b().a(this.f9745a);
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9747a;

        static {
            int[] iArr = new int[T2.k.values().length];
            try {
                iArr[T2.k.f9967b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T2.k.f9966a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9747a = iArr;
        }
    }

    /* renamed from: T2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0214c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0214c f9748a = new C0214c();

        C0214c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9749a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9750a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            if (!it.d()) {
                it = null;
            }
            if (it == null) {
                return null;
            }
            return it.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9751a;

        /* renamed from: b, reason: collision with root package name */
        Object f9752b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9753c;

        /* renamed from: e, reason: collision with root package name */
        int f9755e;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9753c = obj;
            this.f9755e |= Integer.MIN_VALUE;
            return c.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9756a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f9758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f9759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, c cVar, P5.d dVar) {
            super(2, dVar);
            this.f9758c = function1;
            this.f9759d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            g gVar = new g(this.f9758c, this.f9759d, dVar);
            gVar.f9757b = obj;
            return gVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((g) create(str, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f9756a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                L5.t.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f9757b
                java.lang.String r1 = (java.lang.String) r1
                L5.t.b(r6)
                goto L40
            L22:
                L5.t.b(r6)
                java.lang.Object r6 = r5.f9757b
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r6 = g6.n.u(r1)
                if (r6 == 0) goto L33
                goto L55
            L33:
                r5.f9757b = r1
                r5.f9756a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = i6.X.b(r3, r5)
                if (r6 != r0) goto L40
                return r0
            L40:
                kotlin.jvm.functions.Function1 r6 = r5.f9758c
                U2.a r3 = U2.a.f11071b
                r6.invoke(r3)
                T2.c r6 = r5.f9759d
                r3 = 0
                r5.f9757b = r3
                r5.f9756a = r2
                java.lang.Object r6 = T2.c.g(r6, r1, r5)
                if (r6 != r0) goto L5c
                return r0
            L55:
                kotlin.jvm.functions.Function1 r6 = r5.f9758c
                U2.a r0 = U2.a.f11070a
                r6.invoke(r0)
            L5c:
                L5.I r6 = L5.I.f6487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T2.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9761a;

            static {
                int[] iArr = new int[U2.a.values().length];
                try {
                    iArr[U2.a.f11070a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[U2.a.f11071b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[U2.a.f11072c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9761a = iArr;
            }
        }

        h() {
            super(1);
        }

        public final void a(U2.a signUpState) {
            Object value;
            T2.e eVar;
            m i8;
            AbstractC3159y.i(signUpState, "signUpState");
            c.this.k();
            v vVar = c.this.f9728f;
            c cVar = c.this;
            do {
                value = vVar.getValue();
                eVar = (T2.e) value;
                int i9 = a.f9761a[signUpState.ordinal()];
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        i8 = cVar.u((String) cVar.f9739q.getValue(), (String) cVar.f9740r.getValue(), (String) cVar.f9741s.getValue());
                    } else {
                        throw new p();
                    }
                } else {
                    i8 = eVar.i();
                }
            } while (!vVar.a(value, T2.e.b(eVar, i8, null, null, null, null, false, false, signUpState, 126, null)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U2.a) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f9762a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9763b;

        /* renamed from: d, reason: collision with root package name */
        int f9765d;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9763b = obj;
            this.f9765d |= Integer.MIN_VALUE;
            return c.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9766a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9767b;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            j jVar = new j(dVar);
            jVar.f9767b = obj;
            return jVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, P5.d dVar) {
            return ((j) create(str, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f9766a == 0) {
                t.b(obj);
                String str = (String) this.f9767b;
                if (str != null && !g6.n.u(str)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(!z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9768a;

        k(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r5.f9768a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                L5.t.b(r6)
                goto L54
            L1e:
                L5.t.b(r6)
                goto L3c
            L22:
                L5.t.b(r6)
                T2.c r6 = T2.c.this
                T2.e r6 = T2.c.e(r6)
                boolean r6 = r6.l()
                if (r6 == 0) goto L47
                T2.c r6 = T2.c.this
                r5.f9768a = r4
                java.lang.Object r6 = T2.c.j(r6, r5)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                T2.c r6 = T2.c.this
                r5.f9768a = r3
                java.lang.Object r6 = T2.c.i(r6, r4, r5)
                if (r6 != r0) goto L54
                return r0
            L47:
                T2.c r6 = T2.c.this
                r5.f9768a = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = T2.c.z(r6, r1, r5, r4, r2)
                if (r6 != r0) goto L54
                return r0
            L54:
                L5.I r6 = L5.I.f6487a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T2.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9770a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3136a implements X5.p {
            a(Object obj) {
                super(4, obj, c.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // X5.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, String str3, P5.d dVar) {
                return l.h((c) this.receiver, str, str2, str3, dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f9772a;

            b(c cVar) {
                this.f9772a = cVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(m mVar, P5.d dVar) {
                Object value;
                v vVar = this.f9772a.f9728f;
                do {
                    value = vVar.getValue();
                } while (!vVar.a(value, T2.e.b((T2.e) value, mVar, null, null, null, null, false, false, null, 254, null)));
                return I.f6487a;
            }
        }

        l(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object h(c cVar, String str, String str2, String str3, P5.d dVar) {
            return cVar.u(str, str2, str3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new l(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9770a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f j8 = AbstractC3360h.j(c.this.f9739q, c.this.f9740r, c.this.f9741s, new a(c.this));
                b bVar = new b(c.this);
                this.f9770a = 1;
                if (j8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public c(T2.k signupMode, K2.d config, L2.b linkAccountManager, M2.e linkEventsReporter, InterfaceC3684d logger) {
        boolean z8;
        boolean z9;
        boolean z10;
        s0 s0Var;
        AbstractC3159y.i(signupMode, "signupMode");
        AbstractC3159y.i(config, "config");
        AbstractC3159y.i(linkAccountManager, "linkAccountManager");
        AbstractC3159y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3159y.i(logger, "logger");
        this.f9723a = signupMode;
        this.f9724b = linkAccountManager;
        this.f9725c = linkEventsReporter;
        this.f9726d = logger;
        T2.e a8 = T2.e.f9777i.a(signupMode, config);
        this.f9727e = a8;
        v a9 = AbstractC3351M.a(a8);
        this.f9728f = a9;
        this.f9729g = a9;
        if (signupMode == T2.k.f9967b) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f9730h = z8;
        Set e8 = a8.e();
        this.f9731i = e8;
        String c8 = e8.contains(T2.j.f9961a) ? config.b().c() : null;
        this.f9732j = c8;
        String f8 = e8.contains(T2.j.f9962b) ? config.b().f() : null;
        String str = f8 == null ? "" : f8;
        this.f9733k = str;
        String e9 = e8.contains(T2.j.f9963c) ? config.b().e() : null;
        this.f9734l = e9;
        C3399A.a aVar = C3399A.f34932h;
        if (a8.k() && z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        s0 a10 = aVar.a(c8, z9);
        this.f9735m = a10;
        Q.a aVar2 = Q.f35194r;
        String b8 = config.b().b();
        if (a8.l() && z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q b9 = Q.a.b(aVar2, str, b8, null, z10, false, 20, null);
        this.f9736n = b9;
        s0 a11 = J.f35101h.a(e9);
        this.f9737o = a11;
        if (p()) {
            s0Var = a11;
        } else {
            s0Var = null;
        }
        this.f9738p = new g0(null, AbstractC1246t.r(a10, b9, s0Var));
        this.f9739q = v4.g.m(a10.m(), C0214c.f9748a);
        this.f9740r = v4.g.m(b9.m(), e.f9750a);
        this.f9741s = v4.g.m(a11.m(), d.f9749a);
        v a12 = AbstractC3351M.a(null);
        this.f9742t = a12;
        this.f9743u = a12;
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(P5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof T2.c.i
            if (r0 == 0) goto L13
            r0 = r13
            T2.c$i r0 = (T2.c.i) r0
            int r1 = r0.f9765d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9765d = r1
            goto L18
        L13:
            T2.c$i r0 = new T2.c$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f9763b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f9765d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f9762a
            T2.c r0 = (T2.c) r0
            L5.t.b(r13)
            goto L4c
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            L5.t.b(r13)
            l6.K r13 = r12.f9740r
            T2.c$j r2 = new T2.c$j
            r4 = 0
            r2.<init>(r4)
            r0.f9762a = r12
            r0.f9765d = r3
            java.lang.Object r13 = l6.AbstractC3360h.v(r13, r2, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            r0 = r12
        L4c:
            l6.v r13 = r0.f9728f
        L4e:
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            T2.e r1 = (T2.e) r1
            U2.a r9 = U2.a.f11072c
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            T2.e r1 = T2.e.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.a(r0, r1)
            if (r0 == 0) goto L4e
            L5.I r13 = L5.I.f6487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.c.A(P5.d):java.lang.Object");
    }

    private final void B() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new l(null), 3, null);
    }

    public static final /* synthetic */ m h(c cVar, String str, String str2, String str3) {
        return cVar.u(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f9742t.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r19, P5.d r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.c.t(java.lang.String, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m u(String str, String str2, String str3) {
        boolean z8;
        T2.k g8 = this.f9727e.g();
        if (str == null || str2 == null || g8 == null) {
            return null;
        }
        boolean z9 = false;
        if (p() && (str3 == null || g6.n.u(str3))) {
            z8 = false;
        } else {
            z8 = true;
        }
        String z10 = this.f9736n.z(str2);
        String x8 = this.f9736n.x();
        if (this.f9732j != null) {
            z9 = true;
        }
        m.b bVar = new m.b(str, z10, x8, str3, w(g8, z9, true ^ g6.n.u(this.f9733k)));
        if (!z8) {
            return null;
        }
        return bVar;
    }

    private final void v(Throwable th) {
        S2.b a8 = S2.c.a(th);
        this.f9726d.a("Error: ", th);
        this.f9742t.setValue(a8);
    }

    private final T2.l w(T2.k kVar, boolean z8, boolean z9) {
        int i8 = b.f9747a[kVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8 && z9) {
                    return T2.l.f9972c;
                }
                if (z8) {
                    return T2.l.f9971b;
                }
                return T2.l.f9970a;
            }
            throw new p();
        }
        if (z8) {
            return T2.l.f9974e;
        }
        if (!z8) {
            return T2.l.f9973d;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(boolean z8, P5.d dVar) {
        Object h8 = AbstractC3360h.h(AbstractC3360h.o(this.f9739q, z8 ? 1 : 0), new g(new h(), this, null), dVar);
        if (h8 == Q5.b.e()) {
            return h8;
        }
        return I.f6487a;
    }

    static /* synthetic */ Object z(c cVar, boolean z8, P5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return cVar.y(z8, dVar);
    }

    public final s0 l() {
        return this.f9735m;
    }

    public final InterfaceC3349K m() {
        return this.f9743u;
    }

    public final s0 n() {
        return this.f9737o;
    }

    public final Q o() {
        return this.f9736n;
    }

    public final boolean p() {
        return this.f9727e.c().contains(T2.j.f9963c);
    }

    public final g0 q() {
        return this.f9738p;
    }

    public final T2.k r() {
        return this.f9723a;
    }

    public final InterfaceC3349K s() {
        return this.f9729g;
    }

    public final void x() {
        Object value;
        v vVar = this.f9728f;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, T2.e.b((T2.e) value, null, null, null, null, null, !r2.j(), false, null, 223, null)));
        if (((T2.e) this.f9728f.getValue()).j() && !this.f9744v) {
            this.f9744v = true;
            this.f9725c.j();
        }
    }
}
