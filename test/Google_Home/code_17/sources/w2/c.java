package W2;

import O5.I;
import O5.p;
import O5.t;
import P5.AbstractC1378t;
import W2.m;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import h6.InterfaceC2963c;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3232a;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;
import p4.C3742A;
import p4.J;
import p4.Q;
import p4.g0;
import p4.s0;
import u2.InterfaceC4057d;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final W2.k f11380a;

    /* renamed from: b, reason: collision with root package name */
    private final O2.b f11381b;

    /* renamed from: c, reason: collision with root package name */
    private final P2.e f11382c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4057d f11383d;

    /* renamed from: e, reason: collision with root package name */
    private final W2.e f11384e;

    /* renamed from: f, reason: collision with root package name */
    private final w f11385f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f11386g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11387h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f11388i;

    /* renamed from: j, reason: collision with root package name */
    private final String f11389j;

    /* renamed from: k, reason: collision with root package name */
    private final String f11390k;

    /* renamed from: l, reason: collision with root package name */
    private final String f11391l;

    /* renamed from: m, reason: collision with root package name */
    private final s0 f11392m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f11393n;

    /* renamed from: o, reason: collision with root package name */
    private final s0 f11394o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f11395p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f11396q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f11397r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3698L f11398s;

    /* renamed from: t, reason: collision with root package name */
    private final w f11399t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f11400u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11401v;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final W2.k f11402a;

        /* renamed from: b, reason: collision with root package name */
        private final Q2.b f11403b;

        public a(W2.k signupMode, Q2.b linkComponent) {
            AbstractC3255y.i(signupMode, "signupMode");
            AbstractC3255y.i(linkComponent, "linkComponent");
            this.f11402a = signupMode;
            this.f11403b = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            c a8 = this.f11403b.b().a(this.f11402a);
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11404a;

        static {
            int[] iArr = new int[W2.k.values().length];
            try {
                iArr[W2.k.f11624b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W2.k.f11623a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11404a = iArr;
        }
    }

    /* renamed from: W2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0239c extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0239c f11405a = new C0239c();

        C0239c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
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
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11406a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
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
    static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f11407a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
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
        Object f11408a;

        /* renamed from: b, reason: collision with root package name */
        Object f11409b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11410c;

        /* renamed from: e, reason: collision with root package name */
        int f11412e;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11410c = obj;
            this.f11412e |= Integer.MIN_VALUE;
            return c.this.t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11413a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11414b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11415c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f11416d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, c cVar, S5.d dVar) {
            super(2, dVar);
            this.f11415c = function1;
            this.f11416d = cVar;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, S5.d dVar) {
            return ((g) create(str, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            g gVar = new g(this.f11415c, this.f11416d, dVar);
            gVar.f11414b = obj;
            return gVar;
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r5.f11413a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                O5.t.b(r6)
                goto L5c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f11414b
                java.lang.String r1 = (java.lang.String) r1
                O5.t.b(r6)
                goto L40
            L22:
                O5.t.b(r6)
                java.lang.Object r6 = r5.f11414b
                r1 = r6
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L55
                boolean r6 = j6.n.u(r1)
                if (r6 == 0) goto L33
                goto L55
            L33:
                r5.f11414b = r1
                r5.f11413a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = l6.X.b(r3, r5)
                if (r6 != r0) goto L40
                return r0
            L40:
                kotlin.jvm.functions.Function1 r6 = r5.f11415c
                X2.a r3 = X2.a.f12742b
                r6.invoke(r3)
                W2.c r6 = r5.f11416d
                r3 = 0
                r5.f11414b = r3
                r5.f11413a = r2
                java.lang.Object r6 = W2.c.g(r6, r1, r5)
                if (r6 != r0) goto L5c
                return r0
            L55:
                kotlin.jvm.functions.Function1 r6 = r5.f11415c
                X2.a r0 = X2.a.f12741a
                r6.invoke(r0)
            L5c:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function1 {

        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11418a;

            static {
                int[] iArr = new int[X2.a.values().length];
                try {
                    iArr[X2.a.f12741a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[X2.a.f12742b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[X2.a.f12743c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f11418a = iArr;
            }
        }

        h() {
            super(1);
        }

        public final void a(X2.a signUpState) {
            Object value;
            W2.e eVar;
            m i8;
            AbstractC3255y.i(signUpState, "signUpState");
            c.this.k();
            w wVar = c.this.f11385f;
            c cVar = c.this;
            do {
                value = wVar.getValue();
                eVar = (W2.e) value;
                int i9 = a.f11418a[signUpState.ordinal()];
                if (i9 != 1 && i9 != 2) {
                    if (i9 == 3) {
                        i8 = cVar.u((String) cVar.f11396q.getValue(), (String) cVar.f11397r.getValue(), (String) cVar.f11398s.getValue());
                    } else {
                        throw new p();
                    }
                } else {
                    i8 = eVar.i();
                }
            } while (!wVar.c(value, W2.e.b(eVar, i8, null, null, null, null, false, false, signUpState, 126, null)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X2.a) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11419a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11420b;

        /* renamed from: d, reason: collision with root package name */
        int f11422d;

        i(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11420b = obj;
            this.f11422d |= Integer.MIN_VALUE;
            return c.this.A(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11423a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11424b;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, S5.d dVar) {
            return ((j) create(str, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            j jVar = new j(dVar);
            jVar.f11424b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            T5.b.e();
            if (this.f11423a == 0) {
                t.b(obj);
                String str = (String) this.f11424b;
                if (str != null && !j6.n.u(str)) {
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
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11425a;

        k(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r5.f11425a
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
                O5.t.b(r6)
                goto L54
            L1e:
                O5.t.b(r6)
                goto L3c
            L22:
                O5.t.b(r6)
                W2.c r6 = W2.c.this
                W2.e r6 = W2.c.e(r6)
                boolean r6 = r6.l()
                if (r6 == 0) goto L47
                W2.c r6 = W2.c.this
                r5.f11425a = r4
                java.lang.Object r6 = W2.c.j(r6, r5)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                W2.c r6 = W2.c.this
                r5.f11425a = r3
                java.lang.Object r6 = W2.c.i(r6, r4, r5)
                if (r6 != r0) goto L54
                return r0
            L47:
                W2.c r6 = W2.c.this
                r5.f11425a = r2
                r1 = 0
                r2 = 0
                java.lang.Object r6 = W2.c.z(r6, r1, r5, r4, r2)
                if (r6 != r0) goto L54
                return r0
            L54:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11427a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3232a implements InterfaceC1670p {
            a(Object obj) {
                super(4, obj, c.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // a6.InterfaceC1670p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, String str2, String str3, S5.d dVar) {
                return l.m((c) this.receiver, str, str2, str3, dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f11429a;

            b(c cVar) {
                this.f11429a = cVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(m mVar, S5.d dVar) {
                Object value;
                w wVar = this.f11429a.f11385f;
                do {
                    value = wVar.getValue();
                } while (!wVar.c(value, W2.e.b((W2.e) value, mVar, null, null, null, null, false, false, null, 254, null)));
                return I.f8278a;
            }
        }

        l(S5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(c cVar, String str, String str2, String str3, S5.d dVar) {
            return cVar.u(str, str2, str3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11427a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f l8 = AbstractC3708h.l(c.this.f11396q, c.this.f11397r, c.this.f11398s, new a(c.this));
                b bVar = new b(c.this);
                this.f11427a = 1;
                if (l8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public c(W2.k signupMode, N2.d config, O2.b linkAccountManager, P2.e linkEventsReporter, InterfaceC4057d logger) {
        boolean z8;
        boolean z9;
        boolean z10;
        s0 s0Var;
        AbstractC3255y.i(signupMode, "signupMode");
        AbstractC3255y.i(config, "config");
        AbstractC3255y.i(linkAccountManager, "linkAccountManager");
        AbstractC3255y.i(linkEventsReporter, "linkEventsReporter");
        AbstractC3255y.i(logger, "logger");
        this.f11380a = signupMode;
        this.f11381b = linkAccountManager;
        this.f11382c = linkEventsReporter;
        this.f11383d = logger;
        W2.e a8 = W2.e.f11434i.a(signupMode, config);
        this.f11384e = a8;
        w a9 = AbstractC3700N.a(a8);
        this.f11385f = a9;
        this.f11386g = a9;
        if (signupMode == W2.k.f11624b) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f11387h = z8;
        Set e8 = a8.e();
        this.f11388i = e8;
        String b8 = e8.contains(W2.j.f11618a) ? config.a().b() : null;
        this.f11389j = b8;
        String h8 = e8.contains(W2.j.f11619b) ? config.a().h() : null;
        String str = h8 == null ? "" : h8;
        this.f11390k = str;
        String g8 = e8.contains(W2.j.f11620c) ? config.a().g() : null;
        this.f11391l = g8;
        C3742A.a aVar = C3742A.f36958h;
        if (a8.k() && z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        s0 a10 = aVar.a(b8, z9);
        this.f11392m = a10;
        Q.a aVar2 = Q.f37220r;
        String a11 = config.a().a();
        if (a8.l() && z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        Q b9 = Q.a.b(aVar2, str, a11, null, z10, false, 20, null);
        this.f11393n = b9;
        s0 a12 = J.f37127h.a(g8);
        this.f11394o = a12;
        if (p()) {
            s0Var = a12;
        } else {
            s0Var = null;
        }
        this.f11395p = new g0(null, AbstractC1378t.r(a10, b9, s0Var));
        this.f11396q = y4.g.m(a10.m(), C0239c.f11405a);
        this.f11397r = y4.g.m(b9.m(), e.f11407a);
        this.f11398s = y4.g.m(a12.m(), d.f11406a);
        w a13 = AbstractC3700N.a(null);
        this.f11399t = a13;
        this.f11400u = a13;
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(S5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof W2.c.i
            if (r0 == 0) goto L13
            r0 = r13
            W2.c$i r0 = (W2.c.i) r0
            int r1 = r0.f11422d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11422d = r1
            goto L18
        L13:
            W2.c$i r0 = new W2.c$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f11420b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f11422d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f11419a
            W2.c r0 = (W2.c) r0
            O5.t.b(r13)
            goto L4c
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            O5.t.b(r13)
            o6.L r13 = r12.f11397r
            W2.c$j r2 = new W2.c$j
            r4 = 0
            r2.<init>(r4)
            r0.f11419a = r12
            r0.f11422d = r3
            java.lang.Object r13 = o6.AbstractC3708h.x(r13, r2, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            r0 = r12
        L4c:
            o6.w r13 = r0.f11385f
        L4e:
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            W2.e r1 = (W2.e) r1
            X2.a r9 = X2.a.f12743c
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            W2.e r1 = W2.e.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r13.c(r0, r1)
            if (r0 == 0) goto L4e
            O5.I r13 = O5.I.f8278a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.c.A(S5.d):java.lang.Object");
    }

    private final void B() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new l(null), 3, null);
    }

    public static final /* synthetic */ m h(c cVar, String str, String str2, String str3) {
        return cVar.u(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f11399t.setValue(null);
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
    public final java.lang.Object t(java.lang.String r19, S5.d r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.c.t(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m u(String str, String str2, String str3) {
        boolean z8;
        W2.k g8 = this.f11384e.g();
        if (str == null || str2 == null || g8 == null) {
            return null;
        }
        boolean z9 = false;
        if (p() && (str3 == null || j6.n.u(str3))) {
            z8 = false;
        } else {
            z8 = true;
        }
        String z10 = this.f11393n.z(str2);
        String x8 = this.f11393n.x();
        if (this.f11389j != null) {
            z9 = true;
        }
        m.b bVar = new m.b(str, z10, x8, str3, w(g8, z9, true ^ j6.n.u(this.f11390k)));
        if (!z8) {
            return null;
        }
        return bVar;
    }

    private final void v(Throwable th) {
        V2.b a8 = V2.c.a(th);
        this.f11383d.a("Error: ", th);
        this.f11399t.setValue(a8);
    }

    private final W2.l w(W2.k kVar, boolean z8, boolean z9) {
        int i8 = b.f11404a[kVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                if (z8 && z9) {
                    return W2.l.f11629c;
                }
                if (z8) {
                    return W2.l.f11628b;
                }
                return W2.l.f11627a;
            }
            throw new p();
        }
        if (z8) {
            return W2.l.f11631e;
        }
        if (!z8) {
            return W2.l.f11630d;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(boolean z8, S5.d dVar) {
        Object j8 = AbstractC3708h.j(AbstractC3708h.q(this.f11396q, z8 ? 1 : 0), new g(new h(), this, null), dVar);
        if (j8 == T5.b.e()) {
            return j8;
        }
        return I.f8278a;
    }

    static /* synthetic */ Object z(c cVar, boolean z8, S5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return cVar.y(z8, dVar);
    }

    public final s0 l() {
        return this.f11392m;
    }

    public final InterfaceC3698L m() {
        return this.f11400u;
    }

    public final s0 n() {
        return this.f11394o;
    }

    public final Q o() {
        return this.f11393n;
    }

    public final boolean p() {
        return this.f11384e.c().contains(W2.j.f11620c);
    }

    public final g0 q() {
        return this.f11395p;
    }

    public final W2.k r() {
        return this.f11380a;
    }

    public final InterfaceC3698L s() {
        return this.f11386g;
    }

    public final void x() {
        Object value;
        w wVar = this.f11385f;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, W2.e.b((W2.e) value, null, null, null, null, null, !r2.j(), false, null, 223, null)));
        if (((W2.e) this.f11385f.getValue()).j() && !this.f11401v) {
            this.f11401v = true;
            this.f11382c.j();
        }
    }
}
