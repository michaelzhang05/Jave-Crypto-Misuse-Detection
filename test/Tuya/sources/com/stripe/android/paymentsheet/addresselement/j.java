package com.stripe.android.paymentsheet.addresselement;

import L5.C1224h;
import L5.I;
import L5.r;
import L5.t;
import M5.AbstractC1246t;
import M5.Q;
import X5.n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.b;
import com.stripe.android.paymentsheet.addresselement.d;
import com.stripe.android.paymentsheet.addresselement.h;
import com.stripe.android.paymentsheet.u;
import e4.C2630q0;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.v;
import m4.G;
import r3.AbstractC3687b;
import r3.C3686a;
import r4.C3688a;
import s3.InterfaceC3746b;
import x3.InterfaceC3885G;

/* loaded from: classes4.dex */
public final class j extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f25694a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f25695b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3746b f25696c;

    /* renamed from: d, reason: collision with root package name */
    private final v f25697d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f25698e;

    /* renamed from: f, reason: collision with root package name */
    private final v f25699f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f25700g;

    /* renamed from: h, reason: collision with root package name */
    private final v f25701h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3349K f25702i;

    /* renamed from: j, reason: collision with root package name */
    private final v f25703j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3349K f25704k;

    /* renamed from: l, reason: collision with root package name */
    private final v f25705l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f25706m;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25707a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0600a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f25709a;

            C0600a(j jVar) {
                this.f25709a = jVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C3686a c3686a, P5.d dVar) {
                String str;
                u.a aVar;
                String str2;
                Boolean f8;
                C3686a c3686a2 = (C3686a) this.f25709a.f25697d.getValue();
                Boolean bool = null;
                if (c3686a2 == null || (str = c3686a2.c()) == null) {
                    if (c3686a != null) {
                        str = c3686a.c();
                    } else {
                        str = null;
                    }
                }
                if (c3686a == null || (aVar = c3686a.b()) == null) {
                    if (c3686a2 != null) {
                        aVar = c3686a2.b();
                    } else {
                        aVar = null;
                    }
                }
                if (c3686a2 == null || (str2 = c3686a2.e()) == null) {
                    if (c3686a != null) {
                        str2 = c3686a.e();
                    } else {
                        str2 = null;
                    }
                }
                if (c3686a2 != null && (f8 = c3686a2.f()) != null) {
                    bool = f8;
                } else if (c3686a != null) {
                    bool = c3686a.f();
                }
                Object emit = this.f25709a.f25697d.emit(new C3686a(str, aVar, str2, bool), dVar);
                if (emit == Q5.b.e()) {
                    return emit;
                }
                return I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25707a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f c8 = j.this.r().c("AddressDetails");
                if (c8 != null) {
                    C0600a c0600a = new C0600a(j.this);
                    this.f25707a = 1;
                    if (c8.collect(c0600a, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25710a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f25712a;

            a(j jVar) {
                this.f25712a = jVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, P5.d dVar) {
                Object emit = this.f25712a.f25699f.emit(bool, dVar);
                if (emit == Q5.b.e()) {
                    return emit;
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
            int i8 = this.f25710a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f c8 = j.this.r().c("force_expanded_form");
                if (c8 != null) {
                    a aVar = new a(j.this);
                    this.f25710a = 1;
                    if (c8.collect(aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25713a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I5.a f25715c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f25716a = new a();

            a() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(C3686a c3686a, Boolean bool) {
                return new r(c3686a, bool);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f25717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I5.a f25718b;

            b(j jVar, I5.a aVar) {
                this.f25717a = jVar;
                this.f25718b = aVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(r rVar, P5.d dVar) {
                boolean z8;
                Map h8;
                u.a b8;
                C3686a c3686a = (C3686a) rVar.a();
                Boolean bool = (Boolean) rVar.b();
                boolean z9 = false;
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    z8 = false;
                }
                String str = null;
                if (c3686a == null || (h8 = AbstractC3687b.c(c3686a, null, 1, null)) == null) {
                    h8 = Q.h();
                }
                v vVar = this.f25717a.f25701h;
                h.a c8 = ((h.a) this.f25718b.get()).e(ViewModelKt.getViewModelScope(this.f25717a)).f(null).b("").c(null);
                j jVar = this.f25717a;
                if (!z8) {
                    if (c3686a != null && (b8 = c3686a.b()) != null) {
                        str = b8.e();
                    }
                    if (str == null) {
                        z9 = true;
                    }
                }
                vVar.setValue(c8.d(jVar.h(z9)).a(h8).build().a());
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(I5.a aVar, P5.d dVar) {
            super(2, dVar);
            this.f25715c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f25715c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25713a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K d8 = v4.g.d(j.this.n(), j.this.f25700g, a.f25716a);
                b bVar = new b(j.this, this.f25715c);
                this.f25713a = 1;
                if (d8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final I5.a f25719a;

        public d(I5.a inputAddressViewModelSubcomponentBuilderProvider) {
            AbstractC3159y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
            this.f25719a = inputAddressViewModelSubcomponentBuilderProvider;
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
            j a8 = ((InterfaceC3885G.a) this.f25719a.get()).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3156v implements Function0 {
        e(Object obj) {
            super(0, obj, j.class, "navigateToAutocompleteScreen", "navigateToAutocompleteScreen()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5523invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5523invoke() {
            ((j) this.receiver).s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f25720a;

        /* renamed from: b, reason: collision with root package name */
        int f25721b;

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3686a o8;
            C3686a c3686a;
            u.a b8;
            String c8;
            Object e8 = Q5.b.e();
            int i8 = this.f25721b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c3686a = (C3686a) this.f25720a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o8 = j.this.o();
                if (o8 != null) {
                    v vVar = j.this.f25697d;
                    this.f25720a = o8;
                    this.f25721b = 1;
                    if (vVar.emit(o8, this) == e8) {
                        return e8;
                    }
                    c3686a = o8;
                }
                if (o8 != null && (b8 = o8.b()) != null && (c8 = b8.c()) != null) {
                    j.this.r().d(new b.a(c8));
                }
                return I.f6487a;
            }
            o8 = c3686a;
            if (o8 != null) {
                j.this.r().d(new b.a(c8));
            }
            return I.f6487a;
        }
    }

    public j(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC3746b eventReporter, I5.a formControllerProvider) {
        C3686a c3686a;
        C3686a c8;
        Boolean f8;
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(navigator, "navigator");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(formControllerProvider, "formControllerProvider");
        this.f25694a = args;
        this.f25695b = navigator;
        this.f25696c = eventReporter;
        r3.e b8 = args.b();
        if (b8 != null) {
            c3686a = b8.c();
        } else {
            c3686a = null;
        }
        v a8 = AbstractC3351M.a(c3686a);
        this.f25697d = a8;
        this.f25698e = a8;
        Boolean bool = Boolean.FALSE;
        v a9 = AbstractC3351M.a(bool);
        this.f25699f = a9;
        this.f25700g = a9;
        v a10 = AbstractC3351M.a(null);
        this.f25701h = a10;
        this.f25702i = a10;
        v a11 = AbstractC3351M.a(Boolean.TRUE);
        this.f25703j = a11;
        this.f25704k = a11;
        v a12 = AbstractC3351M.a(bool);
        this.f25705l = a12;
        this.f25706m = a12;
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new c(formControllerProvider, null), 3, null);
        r3.e b9 = args.b();
        if (b9 != null && (c8 = b9.c()) != null && (f8 = c8.f()) != null) {
            a12.setValue(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2630q0 h(boolean z8) {
        return new C2630q0(AbstractC1246t.e(r3.f.f37613a.a(z8, this.f25694a.b(), new e(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3686a o() {
        InterfaceC3349K c8;
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        r3.i iVar = (r3.i) this.f25702i.getValue();
        String str8 = null;
        if (iVar == null || (c8 = iVar.c()) == null || (map = (Map) c8.getValue()) == null) {
            return null;
        }
        G.b bVar = G.Companion;
        C3688a c3688a = (C3688a) map.get(bVar.r());
        if (c3688a != null) {
            str = c3688a.c();
        } else {
            str = null;
        }
        C3688a c3688a2 = (C3688a) map.get(bVar.k());
        if (c3688a2 != null) {
            str2 = c3688a2.c();
        } else {
            str2 = null;
        }
        C3688a c3688a3 = (C3688a) map.get(bVar.l());
        if (c3688a3 != null) {
            str3 = c3688a3.c();
        } else {
            str3 = null;
        }
        C3688a c3688a4 = (C3688a) map.get(bVar.p());
        if (c3688a4 != null) {
            str4 = c3688a4.c();
        } else {
            str4 = null;
        }
        C3688a c3688a5 = (C3688a) map.get(bVar.q());
        if (c3688a5 != null) {
            str5 = c3688a5.c();
        } else {
            str5 = null;
        }
        C3688a c3688a6 = (C3688a) map.get(bVar.u());
        if (c3688a6 != null) {
            str6 = c3688a6.c();
        } else {
            str6 = null;
        }
        C3688a c3688a7 = (C3688a) map.get(bVar.z());
        if (c3688a7 != null) {
            str7 = c3688a7.c();
        } else {
            str7 = null;
        }
        u.a aVar = new u.a(str2, str3, str4, str5, str6, str7);
        C3688a c3688a8 = (C3688a) map.get(bVar.t());
        if (c3688a8 != null) {
            str8 = c3688a8.c();
        }
        return new C3686a(str, aVar, str8, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    public final void i(boolean z8) {
        this.f25705l.setValue(Boolean.valueOf(z8));
    }

    public final void j(Map map, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C3688a c3688a;
        C3688a c3688a2;
        C3688a c3688a3;
        C3688a c3688a4;
        C3688a c3688a5;
        C3688a c3688a6;
        C3688a c3688a7;
        C3688a c3688a8;
        this.f25703j.setValue(Boolean.FALSE);
        String str8 = null;
        if (map != null && (c3688a8 = (C3688a) map.get(G.Companion.r())) != null) {
            str = c3688a8.c();
        } else {
            str = null;
        }
        if (map != null && (c3688a7 = (C3688a) map.get(G.Companion.k())) != null) {
            str2 = c3688a7.c();
        } else {
            str2 = null;
        }
        if (map != null && (c3688a6 = (C3688a) map.get(G.Companion.l())) != null) {
            str3 = c3688a6.c();
        } else {
            str3 = null;
        }
        if (map != null && (c3688a5 = (C3688a) map.get(G.Companion.p())) != null) {
            str4 = c3688a5.c();
        } else {
            str4 = null;
        }
        if (map != null && (c3688a4 = (C3688a) map.get(G.Companion.q())) != null) {
            str5 = c3688a4.c();
        } else {
            str5 = null;
        }
        if (map != null && (c3688a3 = (C3688a) map.get(G.Companion.u())) != null) {
            str6 = c3688a3.c();
        } else {
            str6 = null;
        }
        if (map != null && (c3688a2 = (C3688a) map.get(G.Companion.z())) != null) {
            str7 = c3688a2.c();
        } else {
            str7 = null;
        }
        u.a aVar = new u.a(str2, str3, str4, str5, str6, str7);
        if (map != null && (c3688a = (C3688a) map.get(G.Companion.t())) != null) {
            str8 = c3688a.c();
        }
        k(new C3686a(str, aVar, str8, Boolean.valueOf(z8)));
    }

    public final void k(C3686a addressDetails) {
        String c8;
        String str;
        boolean z8;
        u.a b8;
        AbstractC3159y.i(addressDetails, "addressDetails");
        u.a b9 = addressDetails.b();
        if (b9 != null && (c8 = b9.c()) != null) {
            InterfaceC3746b interfaceC3746b = this.f25696c;
            C3686a c3686a = (C3686a) this.f25698e.getValue();
            if (c3686a != null && (b8 = c3686a.b()) != null) {
                str = b8.e();
            } else {
                str = null;
            }
            if (str != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            interfaceC3746b.b(c8, z8, Integer.valueOf(r3.g.b(addressDetails, (C3686a) this.f25698e.getValue())));
        }
        this.f25695b.a(new d.b(addressDetails));
    }

    public final AddressElementActivityContract.a l() {
        return this.f25694a;
    }

    public final InterfaceC3349K m() {
        return this.f25706m;
    }

    public final InterfaceC3349K n() {
        return this.f25698e;
    }

    public final InterfaceC3349K p() {
        return this.f25702i;
    }

    public final InterfaceC3349K q() {
        return this.f25704k;
    }

    public final com.stripe.android.paymentsheet.addresselement.a r() {
        return this.f25695b;
    }
}
