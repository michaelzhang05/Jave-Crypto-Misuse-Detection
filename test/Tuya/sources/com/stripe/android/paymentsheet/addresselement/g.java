package com.stripe.android.paymentsheet.addresselement;

import L5.C1224h;
import L5.I;
import L5.s;
import L5.t;
import X5.n;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.u;
import e6.InterfaceC2643c;
import f4.InterfaceC2669b;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import i6.N;
import i6.X;
import j2.z;
import j4.AbstractC3081g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import l6.v;
import m4.r0;
import m4.s0;
import m4.x0;
import r3.C3686a;
import s3.InterfaceC3746b;
import x3.InterfaceC3904e;

/* loaded from: classes4.dex */
public final class g extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final d f25611m = new d(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f25612n = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f25613a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f25614b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2669b f25615c;

    /* renamed from: d, reason: collision with root package name */
    private final c f25616d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3746b f25617e;

    /* renamed from: f, reason: collision with root package name */
    private final v f25618f;

    /* renamed from: g, reason: collision with root package name */
    private final v f25619g;

    /* renamed from: h, reason: collision with root package name */
    private final v f25620h;

    /* renamed from: i, reason: collision with root package name */
    private final r0 f25621i;

    /* renamed from: j, reason: collision with root package name */
    private final s0 f25622j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f25623k;

    /* renamed from: l, reason: collision with root package name */
    private final e f25624l;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0593a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f25626a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f25627b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f25628c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0593a(g gVar, String str, P5.d dVar) {
                super(2, dVar);
                this.f25627b = gVar;
                this.f25628c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0593a(this.f25627b, this.f25628c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0593a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object b8;
                Object e8 = Q5.b.e();
                int i8 = this.f25626a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        b8 = ((s) obj).k();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC2669b interfaceC2669b = this.f25627b.f25615c;
                    if (interfaceC2669b != null) {
                        String str = this.f25628c;
                        String a8 = this.f25627b.f25616d.a();
                        if (a8 != null) {
                            this.f25626a = 1;
                            b8 = interfaceC2669b.b(str, a8, 4, this);
                            if (b8 == e8) {
                                return e8;
                            }
                        } else {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                    }
                    return I.f6487a;
                }
                g gVar = this.f25627b;
                Throwable e9 = s.e(b8);
                if (e9 == null) {
                    gVar.f25619g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.f25618f.setValue(((g4.f) b8).a());
                } else {
                    gVar.f25619g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    gVar.h().setValue(s.a(s.b(t.a(e9))));
                }
                return I.f6487a;
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f6487a;
        }

        public final void invoke(String it) {
            AbstractC3159y.i(it, "it");
            AbstractC2829k.d(ViewModelKt.getViewModelScope(g.this), null, null, new C0593a(g.this, it, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25629a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f25631a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0594a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f25632a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0594a(g gVar) {
                    super(0);
                    this.f25632a = gVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5518invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5518invoke() {
                    this.f25632a.g();
                }
            }

            a(g gVar) {
                this.f25631a = gVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, P5.d dVar) {
                Object value;
                Object value2;
                if (str.length() == 0) {
                    v c8 = this.f25631a.f25621i.c();
                    do {
                        value2 = c8.getValue();
                    } while (!c8.a(value2, null));
                } else {
                    v c9 = this.f25631a.f25621i.c();
                    g gVar = this.f25631a;
                    do {
                        value = c9.getValue();
                    } while (!c9.a(value, new x0.c(z.f33126N, null, true, new C0594a(gVar), 2, null)));
                }
                return I.f6487a;
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25629a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K interfaceC3349K = g.this.f25623k;
                a aVar = new a(g.this);
                this.f25629a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f25633a;

        public c(String str) {
            this.f25633a = str;
        }

        public final String a() {
            return this.f25633a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25633a, ((c) obj).f25633a);
        }

        public int hashCode() {
            String str = this.f25633a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.f25633a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC2855x0 f25634a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f25635a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f25636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC3349K f25637c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f25638d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1 f25639e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0595a implements InterfaceC3359g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f25640a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ M f25641b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function1 f25642c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.addresselement.g$e$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0596a extends l implements n {

                    /* renamed from: a, reason: collision with root package name */
                    int f25643a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f25644b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function1 f25645c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f25646d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0596a(Function1 function1, String str, P5.d dVar) {
                        super(2, dVar);
                        this.f25645c = function1;
                        this.f25646d = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final P5.d create(Object obj, P5.d dVar) {
                        C0596a c0596a = new C0596a(this.f25645c, this.f25646d, dVar);
                        c0596a.f25644b = obj;
                        return c0596a;
                    }

                    @Override // X5.n
                    public final Object invoke(M m8, P5.d dVar) {
                        return ((C0596a) create(m8, dVar)).invokeSuspend(I.f6487a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        M m8;
                        Object e8 = Q5.b.e();
                        int i8 = this.f25643a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                m8 = (M) this.f25644b;
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            M m9 = (M) this.f25644b;
                            this.f25644b = m9;
                            this.f25643a = 1;
                            if (X.b(1000L, this) == e8) {
                                return e8;
                            }
                            m8 = m9;
                        }
                        if (N.g(m8)) {
                            this.f25645c.invoke(this.f25646d);
                        }
                        return I.f6487a;
                    }
                }

                C0595a(e eVar, M m8, Function1 function1) {
                    this.f25640a = eVar;
                    this.f25641b = m8;
                    this.f25642c = function1;
                }

                @Override // l6.InterfaceC3359g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, P5.d dVar) {
                    InterfaceC2855x0 d8;
                    if (str != null) {
                        e eVar = this.f25640a;
                        M m8 = this.f25641b;
                        Function1 function1 = this.f25642c;
                        InterfaceC2855x0 interfaceC2855x0 = eVar.f25634a;
                        if (interfaceC2855x0 != null) {
                            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
                        }
                        if (str.length() > 3) {
                            d8 = AbstractC2829k.d(m8, null, null, new C0596a(function1, str, null), 3, null);
                            eVar.f25634a = d8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3349K interfaceC3349K, e eVar, Function1 function1, P5.d dVar) {
                super(2, dVar);
                this.f25637c = interfaceC3349K;
                this.f25638d = eVar;
                this.f25639e = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(this.f25637c, this.f25638d, this.f25639e, dVar);
                aVar.f25636b = obj;
                return aVar;
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f25635a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    M m8 = (M) this.f25636b;
                    InterfaceC3349K interfaceC3349K = this.f25637c;
                    C0595a c0595a = new C0595a(this.f25638d, m8, this.f25639e);
                    this.f25635a = 1;
                    if (interfaceC3349K.collect(c0595a, this) == e8) {
                        return e8;
                    }
                }
                throw new C1224h();
            }
        }

        public final void c(M coroutineScope, InterfaceC3349K queryFlow, Function1 onValidQuery) {
            AbstractC3159y.i(coroutineScope, "coroutineScope");
            AbstractC3159y.i(queryFlow, "queryFlow");
            AbstractC3159y.i(onValidQuery, "onValidQuery");
            AbstractC2829k.d(coroutineScope, null, null, new a(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final I5.a f25647a;

        /* renamed from: b, reason: collision with root package name */
        private final c f25648b;

        /* renamed from: c, reason: collision with root package name */
        private final Function0 f25649c;

        public f(I5.a autoCompleteViewModelSubcomponentBuilderProvider, c args, Function0 applicationSupplier) {
            AbstractC3159y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            AbstractC3159y.i(args, "args");
            AbstractC3159y.i(applicationSupplier, "applicationSupplier");
            this.f25647a = autoCompleteViewModelSubcomponentBuilderProvider;
            this.f25648b = args;
            this.f25649c = applicationSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            g a8 = ((InterfaceC3904e.a) this.f25647a.get()).b((Application) this.f25649c.invoke()).a(this.f25648b).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return a8;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.addresselement.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0597g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25650a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g4.d f25652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0597g(g4.d dVar, P5.d dVar2) {
            super(2, dVar2);
            this.f25652c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0597g(this.f25652c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0597g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f25650a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a8 = ((s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g.this.f25619g.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                InterfaceC2669b interfaceC2669b = g.this.f25615c;
                if (interfaceC2669b != null) {
                    String a9 = this.f25652c.a();
                    this.f25650a = 1;
                    a8 = interfaceC2669b.a(a9, this);
                    if (a8 == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
            g gVar = g.this;
            Throwable e9 = s.e(a8);
            if (e9 == null) {
                gVar.f25619g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                com.stripe.android.model.a f8 = g4.h.f(((g4.e) a8).a(), gVar.getApplication());
                gVar.h().setValue(s.a(s.b(new C3686a(null, new u.a(f8.b(), f8.c(), f8.e(), f8.f(), f8.i(), f8.j()), null, null, 13, null))));
                g.p(gVar, null, 1, null);
            } else {
                gVar.f25619g.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                gVar.h().setValue(s.a(s.b(t.a(e9))));
                g.p(gVar, null, 1, null);
            }
            return I.f6487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC2669b interfaceC2669b, c autocompleteArgs, InterfaceC3746b eventReporter, Application application) {
        super(application);
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(navigator, "navigator");
        AbstractC3159y.i(autocompleteArgs, "autocompleteArgs");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(application, "application");
        this.f25613a = args;
        this.f25614b = navigator;
        this.f25615c = interfaceC2669b;
        this.f25616d = autocompleteArgs;
        this.f25617e = eventReporter;
        this.f25618f = AbstractC3351M.a(null);
        this.f25619g = AbstractC3351M.a(Boolean.FALSE);
        this.f25620h = AbstractC3351M.a(null);
        r0 r0Var = new r0(Integer.valueOf(AbstractC3081g.f33188a), 0, 0, AbstractC3351M.a(null), 6, null);
        this.f25621i = r0Var;
        s0 s0Var = new s0(r0Var, false, null, 6, null);
        this.f25622j = s0Var;
        InterfaceC3349K k8 = s0Var.k();
        this.f25623k = k8;
        e eVar = new e();
        this.f25624l = eVar;
        eVar.c(ViewModelKt.getViewModelScope(this), k8, new a());
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        String a8 = autocompleteArgs.a();
        if (a8 != null) {
            eventReporter.a(a8);
        }
    }

    private final void o(C3686a c3686a) {
        if (c3686a != null) {
            this.f25614b.h("AddressDetails", c3686a);
        } else {
            s sVar = (s) this.f25620h.getValue();
            if (sVar != null) {
                Object k8 = sVar.k();
                if (s.e(k8) == null) {
                    this.f25614b.h("AddressDetails", (C3686a) k8);
                } else {
                    this.f25614b.h("AddressDetails", null);
                }
            }
        }
        this.f25614b.e();
    }

    static /* synthetic */ void p(g gVar, C3686a c3686a, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            c3686a = null;
        }
        gVar.o(c3686a);
    }

    public final void g() {
        this.f25622j.r("");
        this.f25618f.setValue(null);
    }

    public final v h() {
        return this.f25620h;
    }

    public final InterfaceC3349K i() {
        return this.f25619g;
    }

    public final InterfaceC3349K j() {
        return this.f25618f;
    }

    public final s0 k() {
        return this.f25622j;
    }

    public final void l() {
        C3686a c3686a;
        if (!g6.n.u((CharSequence) this.f25623k.getValue())) {
            c3686a = new C3686a(null, new u.a(null, null, (String) this.f25623k.getValue(), null, null, null, 59, null), null, null, 13, null);
        } else {
            c3686a = null;
        }
        o(c3686a);
    }

    public final void m() {
        this.f25614b.h("force_expanded_form", Boolean.TRUE);
        o(new C3686a(null, new u.a(null, null, (String) this.f25623k.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void n(g4.d prediction) {
        AbstractC3159y.i(prediction, "prediction");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new C0597g(prediction, null), 3, null);
    }
}
