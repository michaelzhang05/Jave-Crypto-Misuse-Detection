package com.stripe.android.paymentsheet.addresselement;

import A3.InterfaceC0955e;
import O5.C1352h;
import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.u;
import h6.InterfaceC2963c;
import i4.InterfaceC2987b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;
import l6.X;
import m2.z;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import o6.w;
import p4.r0;
import p4.s0;
import p4.x0;
import u3.C4059a;
import v3.InterfaceC4099b;

/* loaded from: classes4.dex */
public final class g extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final d f26666m = new d(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f26667n = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f26668a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f26669b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2987b f26670c;

    /* renamed from: d, reason: collision with root package name */
    private final c f26671d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4099b f26672e;

    /* renamed from: f, reason: collision with root package name */
    private final w f26673f;

    /* renamed from: g, reason: collision with root package name */
    private final w f26674g;

    /* renamed from: h, reason: collision with root package name */
    private final w f26675h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f26676i;

    /* renamed from: j, reason: collision with root package name */
    private final s0 f26677j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3698L f26678k;

    /* renamed from: l, reason: collision with root package name */
    private final e f26679l;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0589a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26681a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f26682b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f26683c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0589a(g gVar, String str, S5.d dVar) {
                super(2, dVar);
                this.f26682b = gVar;
                this.f26683c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0589a(this.f26682b, this.f26683c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object b8;
                Object e8 = T5.b.e();
                int i8 = this.f26681a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        b8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC2987b interfaceC2987b = this.f26682b.f26670c;
                    if (interfaceC2987b != null) {
                        String str = this.f26683c;
                        String a8 = this.f26682b.f26671d.a();
                        if (a8 != null) {
                            this.f26681a = 1;
                            b8 = interfaceC2987b.b(str, a8, 4, this);
                            if (b8 == e8) {
                                return e8;
                            }
                        } else {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                    }
                    return I.f8278a;
                }
                g gVar = this.f26682b;
                Throwable e9 = s.e(b8);
                if (e9 == null) {
                    gVar.f26674g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.f26673f.setValue(((j4.f) b8).a());
                } else {
                    gVar.f26674g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.h().setValue(s.a(s.b(t.a(e9))));
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0589a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8278a;
        }

        public final void invoke(String it) {
            AbstractC3255y.i(it, "it");
            AbstractC3364k.d(ViewModelKt.getViewModelScope(g.this), null, null, new C0589a(g.this, it, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26684a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f26686a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0590a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f26687a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0590a(g gVar) {
                    super(0);
                    this.f26687a = gVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5522invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5522invoke() {
                    this.f26687a.g();
                }
            }

            a(g gVar) {
                this.f26686a = gVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, S5.d dVar) {
                Object value;
                Object value2;
                if (str.length() == 0) {
                    w d8 = this.f26686a.f26676i.d();
                    do {
                        value2 = d8.getValue();
                    } while (!d8.c(value2, null));
                } else {
                    w d9 = this.f26686a.f26676i.d();
                    g gVar = this.f26686a;
                    do {
                        value = d9.getValue();
                    } while (!d9.c(value, new x0.c(z.f35102N, null, true, new C0590a(gVar), 2, null)));
                }
                return I.f8278a;
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26684a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L interfaceC3698L = g.this.f26678k;
                a aVar = new a(g.this);
                this.f26684a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f26688a;

        public c(String str) {
            this.f26688a = str;
        }

        public final String a() {
            return this.f26688a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f26688a, ((c) obj).f26688a);
        }

        public int hashCode() {
            String str = this.f26688a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.f26688a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC3390x0 f26689a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f26690a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f26691b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3698L f26692c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f26693d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1 f26694e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0591a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f26695a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M f26696b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1 f26697c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0592a extends l implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    int f26698a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f26699b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1 f26700c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f26701d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0592a(Function1 function1, String str, S5.d dVar) {
                        super(2, dVar);
                        this.f26700c = function1;
                        this.f26701d = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final S5.d create(Object obj, S5.d dVar) {
                        C0592a c0592a = new C0592a(this.f26700c, this.f26701d, dVar);
                        c0592a.f26699b = obj;
                        return c0592a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        M m8;
                        Object e8 = T5.b.e();
                        int i8 = this.f26698a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                m8 = (M) this.f26699b;
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            M m9 = (M) this.f26699b;
                            this.f26699b = m9;
                            this.f26698a = 1;
                            if (X.b(1000L, this) == e8) {
                                return e8;
                            }
                            m8 = m9;
                        }
                        if (N.g(m8)) {
                            this.f26700c.invoke(this.f26701d);
                        }
                        return I.f8278a;
                    }

                    @Override // a6.InterfaceC1668n
                    public final Object invoke(M m8, S5.d dVar) {
                        return ((C0592a) create(m8, dVar)).invokeSuspend(I.f8278a);
                    }
                }

                C0591a(e eVar, M m8, Function1 function1) {
                    this.f26695a = eVar;
                    this.f26696b = m8;
                    this.f26697c = function1;
                }

                @Override // o6.InterfaceC3707g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, S5.d dVar) {
                    InterfaceC3390x0 d8;
                    if (str != null) {
                        e eVar = this.f26695a;
                        M m8 = this.f26696b;
                        Function1 function1 = this.f26697c;
                        InterfaceC3390x0 interfaceC3390x0 = eVar.f26689a;
                        if (interfaceC3390x0 != null) {
                            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
                        }
                        if (str.length() > 3) {
                            d8 = AbstractC3364k.d(m8, null, null, new C0592a(function1, str, null), 3, null);
                            eVar.f26689a = d8;
                        }
                    }
                    return I.f8278a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3698L interfaceC3698L, e eVar, Function1 function1, S5.d dVar) {
                super(2, dVar);
                this.f26692c = interfaceC3698L;
                this.f26693d = eVar;
                this.f26694e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(this.f26692c, this.f26693d, this.f26694e, dVar);
                aVar.f26691b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f26690a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    M m8 = (M) this.f26691b;
                    InterfaceC3698L interfaceC3698L = this.f26692c;
                    C0591a c0591a = new C0591a(this.f26693d, m8, this.f26694e);
                    this.f26690a = 1;
                    if (interfaceC3698L.collect(c0591a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1352h();
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        public final void c(M coroutineScope, InterfaceC3698L queryFlow, Function1 onValidQuery) {
            AbstractC3255y.i(coroutineScope, "coroutineScope");
            AbstractC3255y.i(queryFlow, "queryFlow");
            AbstractC3255y.i(onValidQuery, "onValidQuery");
            AbstractC3364k.d(coroutineScope, null, null, new a(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final L5.a f26702a;

        /* renamed from: b, reason: collision with root package name */
        private final c f26703b;

        /* renamed from: c, reason: collision with root package name */
        private final Function0 f26704c;

        public f(L5.a autoCompleteViewModelSubcomponentBuilderProvider, c args, Function0 applicationSupplier) {
            AbstractC3255y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            AbstractC3255y.i(args, "args");
            AbstractC3255y.i(applicationSupplier, "applicationSupplier");
            this.f26702a = autoCompleteViewModelSubcomponentBuilderProvider;
            this.f26703b = args;
            this.f26704c = applicationSupplier;
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
            g a8 = ((InterfaceC0955e.a) this.f26702a.get()).b((Application) this.f26704c.invoke()).c(this.f26703b).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return a8;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0593g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26705a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j4.d f26707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0593g(j4.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f26707c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0593g(this.f26707c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f26705a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = ((s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g.this.f26674g.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                InterfaceC2987b interfaceC2987b = g.this.f26670c;
                if (interfaceC2987b != null) {
                    String a9 = this.f26707c.a();
                    this.f26705a = 1;
                    a8 = interfaceC2987b.a(a9, this);
                    if (a8 == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }
            g gVar = g.this;
            Throwable e9 = s.e(a8);
            if (e9 == null) {
                gVar.f26674g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                com.stripe.android.model.a f8 = j4.h.f(((j4.e) a8).a(), gVar.getApplication());
                gVar.h().setValue(s.a(s.b(new C4059a(null, new u.a(f8.a(), f8.b(), f8.g(), f8.h(), f8.i(), f8.l()), null, null, 13, null))));
                g.p(gVar, null, 1, null);
            } else {
                gVar.f26674g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                gVar.h().setValue(s.a(s.b(t.a(e9))));
                g.p(gVar, null, 1, null);
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0593g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC2987b interfaceC2987b, c autocompleteArgs, InterfaceC4099b eventReporter, Application application) {
        super(application);
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(navigator, "navigator");
        AbstractC3255y.i(autocompleteArgs, "autocompleteArgs");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(application, "application");
        this.f26668a = args;
        this.f26669b = navigator;
        this.f26670c = interfaceC2987b;
        this.f26671d = autocompleteArgs;
        this.f26672e = eventReporter;
        this.f26673f = AbstractC3700N.a(null);
        this.f26674g = AbstractC3700N.a(Boolean.FALSE);
        this.f26675h = AbstractC3700N.a(null);
        r0 r0Var = new r0(Integer.valueOf(AbstractC3435g.f35164a), 0, 0, AbstractC3700N.a(null), 6, null);
        this.f26676i = r0Var;
        s0 s0Var = new s0(r0Var, false, null, 6, null);
        this.f26677j = s0Var;
        InterfaceC3698L j8 = s0Var.j();
        this.f26678k = j8;
        e eVar = new e();
        this.f26679l = eVar;
        eVar.c(ViewModelKt.getViewModelScope(this), j8, new a());
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        String a8 = autocompleteArgs.a();
        if (a8 != null) {
            eventReporter.a(a8);
        }
    }

    private final void o(C4059a c4059a) {
        if (c4059a != null) {
            this.f26669b.h("AddressDetails", c4059a);
        } else {
            s sVar = (s) this.f26675h.getValue();
            if (sVar != null) {
                Object j8 = sVar.j();
                if (s.e(j8) == null) {
                    this.f26669b.h("AddressDetails", (C4059a) j8);
                } else {
                    this.f26669b.h("AddressDetails", null);
                }
            }
        }
        this.f26669b.e();
    }

    static /* synthetic */ void p(g gVar, C4059a c4059a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c4059a = null;
        }
        gVar.o(c4059a);
    }

    public final void g() {
        this.f26677j.r("");
        this.f26673f.setValue(null);
    }

    public final w h() {
        return this.f26675h;
    }

    public final InterfaceC3698L i() {
        return this.f26674g;
    }

    public final InterfaceC3698L j() {
        return this.f26673f;
    }

    public final s0 k() {
        return this.f26677j;
    }

    public final void l() {
        C4059a c4059a;
        if (!j6.n.u((CharSequence) this.f26678k.getValue())) {
            c4059a = new C4059a(null, new u.a(null, null, (String) this.f26678k.getValue(), null, null, null, 59, null), null, null, 13, null);
        } else {
            c4059a = null;
        }
        o(c4059a);
    }

    public final void m() {
        this.f26669b.h("force_expanded_form", Boolean.TRUE);
        o(new C4059a(null, new u.a(null, null, (String) this.f26678k.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void n(j4.d prediction) {
        AbstractC3255y.i(prediction, "prediction");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new C0593g(prediction, null), 3, null);
    }
}
