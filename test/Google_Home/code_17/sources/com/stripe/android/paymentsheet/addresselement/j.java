package com.stripe.android.paymentsheet.addresselement;

import A3.G;
import O5.C1352h;
import O5.I;
import O5.r;
import O5.t;
import P5.AbstractC1378t;
import P5.Q;
import a6.InterfaceC1668n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.b;
import com.stripe.android.paymentsheet.addresselement.d;
import com.stripe.android.paymentsheet.addresselement.h;
import com.stripe.android.paymentsheet.u;
import h4.C2950q0;
import h6.InterfaceC2963c;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;
import p4.G;
import u3.AbstractC4060b;
import u3.C4059a;
import u4.C4061a;
import v3.InterfaceC4099b;

/* loaded from: classes4.dex */
public final class j extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final AddressElementActivityContract.a f26749a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f26750b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4099b f26751c;

    /* renamed from: d, reason: collision with root package name */
    private final w f26752d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f26753e;

    /* renamed from: f, reason: collision with root package name */
    private final w f26754f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f26755g;

    /* renamed from: h, reason: collision with root package name */
    private final w f26756h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3698L f26757i;

    /* renamed from: j, reason: collision with root package name */
    private final w f26758j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3698L f26759k;

    /* renamed from: l, reason: collision with root package name */
    private final w f26760l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f26761m;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26762a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0596a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f26764a;

            C0596a(j jVar) {
                this.f26764a = jVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C4059a c4059a, S5.d dVar) {
                String str;
                u.a aVar;
                String str2;
                Boolean h8;
                C4059a c4059a2 = (C4059a) this.f26764a.f26752d.getValue();
                Boolean bool = null;
                if (c4059a2 == null || (str = c4059a2.b()) == null) {
                    if (c4059a != null) {
                        str = c4059a.b();
                    } else {
                        str = null;
                    }
                }
                if (c4059a == null || (aVar = c4059a.a()) == null) {
                    if (c4059a2 != null) {
                        aVar = c4059a2.a();
                    } else {
                        aVar = null;
                    }
                }
                if (c4059a2 == null || (str2 = c4059a2.g()) == null) {
                    if (c4059a != null) {
                        str2 = c4059a.g();
                    } else {
                        str2 = null;
                    }
                }
                if (c4059a2 != null && (h8 = c4059a2.h()) != null) {
                    bool = h8;
                } else if (c4059a != null) {
                    bool = c4059a.h();
                }
                Object emit = this.f26764a.f26752d.emit(new C4059a(str, aVar, str2, bool), dVar);
                if (emit == T5.b.e()) {
                    return emit;
                }
                return I.f8278a;
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26762a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f c8 = j.this.r().c("AddressDetails");
                if (c8 != null) {
                    C0596a c0596a = new C0596a(j.this);
                    this.f26762a = 1;
                    if (c8.collect(c0596a, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26765a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f26767a;

            a(j jVar) {
                this.f26767a = jVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, S5.d dVar) {
                Object emit = this.f26767a.f26754f.emit(bool, dVar);
                if (emit == T5.b.e()) {
                    return emit;
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
            int i8 = this.f26765a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f c8 = j.this.r().c("force_expanded_form");
                if (c8 != null) {
                    a aVar = new a(j.this);
                    this.f26765a = 1;
                    if (c8.collect(aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26768a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L5.a f26770c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26771a = new a();

            a() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(C4059a c4059a, Boolean bool) {
                return new r(c4059a, bool);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f26772a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L5.a f26773b;

            b(j jVar, L5.a aVar) {
                this.f26772a = jVar;
                this.f26773b = aVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(r rVar, S5.d dVar) {
                boolean z8;
                Map h8;
                u.a a8;
                C4059a c4059a = (C4059a) rVar.a();
                Boolean bool = (Boolean) rVar.b();
                boolean z9 = false;
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    z8 = false;
                }
                String str = null;
                if (c4059a == null || (h8 = AbstractC4060b.c(c4059a, null, 1, null)) == null) {
                    h8 = Q.h();
                }
                w wVar = this.f26772a.f26756h;
                h.a c8 = ((h.a) this.f26773b.get()).d(ViewModelKt.getViewModelScope(this.f26772a)).e(null).b("").c(null);
                j jVar = this.f26772a;
                if (!z8) {
                    if (c4059a != null && (a8 = c4059a.a()) != null) {
                        str = a8.g();
                    }
                    if (str == null) {
                        z9 = true;
                    }
                }
                wVar.setValue(c8.f(jVar.h(z9)).a(h8).build().a());
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(L5.a aVar, S5.d dVar) {
            super(2, dVar);
            this.f26770c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f26770c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26768a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L d8 = y4.g.d(j.this.n(), j.this.f26755g, a.f26771a);
                b bVar = new b(j.this, this.f26770c);
                this.f26768a = 1;
                if (d8.collect(bVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final L5.a f26774a;

        public d(L5.a inputAddressViewModelSubcomponentBuilderProvider) {
            AbstractC3255y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
            this.f26774a = inputAddressViewModelSubcomponentBuilderProvider;
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
            j a8 = ((G.a) this.f26774a.get()).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3252v implements Function0 {
        e(Object obj) {
            super(0, obj, j.class, "navigateToAutocompleteScreen", "navigateToAutocompleteScreen()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5527invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5527invoke() {
            ((j) this.receiver).s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f26775a;

        /* renamed from: b, reason: collision with root package name */
        int f26776b;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4059a o8;
            C4059a c4059a;
            u.a a8;
            String b8;
            Object e8 = T5.b.e();
            int i8 = this.f26776b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c4059a = (C4059a) this.f26775a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o8 = j.this.o();
                if (o8 != null) {
                    w wVar = j.this.f26752d;
                    this.f26775a = o8;
                    this.f26776b = 1;
                    if (wVar.emit(o8, this) == e8) {
                        return e8;
                    }
                    c4059a = o8;
                }
                if (o8 != null && (a8 = o8.a()) != null && (b8 = a8.b()) != null) {
                    j.this.r().d(new b.a(b8));
                }
                return I.f8278a;
            }
            o8 = c4059a;
            if (o8 != null) {
                j.this.r().d(new b.a(b8));
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public j(AddressElementActivityContract.a args, com.stripe.android.paymentsheet.addresselement.a navigator, InterfaceC4099b eventReporter, L5.a formControllerProvider) {
        C4059a c4059a;
        C4059a b8;
        Boolean h8;
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(navigator, "navigator");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(formControllerProvider, "formControllerProvider");
        this.f26749a = args;
        this.f26750b = navigator;
        this.f26751c = eventReporter;
        u3.e a8 = args.a();
        if (a8 != null) {
            c4059a = a8.b();
        } else {
            c4059a = null;
        }
        w a9 = AbstractC3700N.a(c4059a);
        this.f26752d = a9;
        this.f26753e = a9;
        Boolean bool = Boolean.FALSE;
        w a10 = AbstractC3700N.a(bool);
        this.f26754f = a10;
        this.f26755g = a10;
        w a11 = AbstractC3700N.a(null);
        this.f26756h = a11;
        this.f26757i = a11;
        w a12 = AbstractC3700N.a(Boolean.TRUE);
        this.f26758j = a12;
        this.f26759k = a12;
        w a13 = AbstractC3700N.a(bool);
        this.f26760l = a13;
        this.f26761m = a13;
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new c(formControllerProvider, null), 3, null);
        u3.e a14 = args.a();
        if (a14 != null && (b8 = a14.b()) != null && (h8 = b8.h()) != null) {
            a13.setValue(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2950q0 h(boolean z8) {
        return new C2950q0(AbstractC1378t.e(u3.f.f39993a.a(z8, this.f26749a.a(), new e(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4059a o() {
        InterfaceC3698L c8;
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        u3.i iVar = (u3.i) this.f26757i.getValue();
        String str8 = null;
        if (iVar == null || (c8 = iVar.c()) == null || (map = (Map) c8.getValue()) == null) {
            return null;
        }
        G.b bVar = p4.G.Companion;
        C4061a c4061a = (C4061a) map.get(bVar.r());
        if (c4061a != null) {
            str = c4061a.c();
        } else {
            str = null;
        }
        C4061a c4061a2 = (C4061a) map.get(bVar.k());
        if (c4061a2 != null) {
            str2 = c4061a2.c();
        } else {
            str2 = null;
        }
        C4061a c4061a3 = (C4061a) map.get(bVar.l());
        if (c4061a3 != null) {
            str3 = c4061a3.c();
        } else {
            str3 = null;
        }
        C4061a c4061a4 = (C4061a) map.get(bVar.p());
        if (c4061a4 != null) {
            str4 = c4061a4.c();
        } else {
            str4 = null;
        }
        C4061a c4061a5 = (C4061a) map.get(bVar.q());
        if (c4061a5 != null) {
            str5 = c4061a5.c();
        } else {
            str5 = null;
        }
        C4061a c4061a6 = (C4061a) map.get(bVar.u());
        if (c4061a6 != null) {
            str6 = c4061a6.c();
        } else {
            str6 = null;
        }
        C4061a c4061a7 = (C4061a) map.get(bVar.z());
        if (c4061a7 != null) {
            str7 = c4061a7.c();
        } else {
            str7 = null;
        }
        u.a aVar = new u.a(str2, str3, str4, str5, str6, str7);
        C4061a c4061a8 = (C4061a) map.get(bVar.t());
        if (c4061a8 != null) {
            str8 = c4061a8.c();
        }
        return new C4059a(str, aVar, str8, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
    }

    public final void i(boolean z8) {
        this.f26760l.setValue(Boolean.valueOf(z8));
    }

    public final void j(Map map, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C4061a c4061a;
        C4061a c4061a2;
        C4061a c4061a3;
        C4061a c4061a4;
        C4061a c4061a5;
        C4061a c4061a6;
        C4061a c4061a7;
        C4061a c4061a8;
        this.f26758j.setValue(Boolean.FALSE);
        String str8 = null;
        if (map != null && (c4061a8 = (C4061a) map.get(p4.G.Companion.r())) != null) {
            str = c4061a8.c();
        } else {
            str = null;
        }
        if (map != null && (c4061a7 = (C4061a) map.get(p4.G.Companion.k())) != null) {
            str2 = c4061a7.c();
        } else {
            str2 = null;
        }
        if (map != null && (c4061a6 = (C4061a) map.get(p4.G.Companion.l())) != null) {
            str3 = c4061a6.c();
        } else {
            str3 = null;
        }
        if (map != null && (c4061a5 = (C4061a) map.get(p4.G.Companion.p())) != null) {
            str4 = c4061a5.c();
        } else {
            str4 = null;
        }
        if (map != null && (c4061a4 = (C4061a) map.get(p4.G.Companion.q())) != null) {
            str5 = c4061a4.c();
        } else {
            str5 = null;
        }
        if (map != null && (c4061a3 = (C4061a) map.get(p4.G.Companion.u())) != null) {
            str6 = c4061a3.c();
        } else {
            str6 = null;
        }
        if (map != null && (c4061a2 = (C4061a) map.get(p4.G.Companion.z())) != null) {
            str7 = c4061a2.c();
        } else {
            str7 = null;
        }
        u.a aVar = new u.a(str2, str3, str4, str5, str6, str7);
        if (map != null && (c4061a = (C4061a) map.get(p4.G.Companion.t())) != null) {
            str8 = c4061a.c();
        }
        k(new C4059a(str, aVar, str8, Boolean.valueOf(z8)));
    }

    public final void k(C4059a addressDetails) {
        String b8;
        String str;
        boolean z8;
        u.a a8;
        AbstractC3255y.i(addressDetails, "addressDetails");
        u.a a9 = addressDetails.a();
        if (a9 != null && (b8 = a9.b()) != null) {
            InterfaceC4099b interfaceC4099b = this.f26751c;
            C4059a c4059a = (C4059a) this.f26753e.getValue();
            if (c4059a != null && (a8 = c4059a.a()) != null) {
                str = a8.g();
            } else {
                str = null;
            }
            if (str != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            interfaceC4099b.b(b8, z8, Integer.valueOf(u3.g.b(addressDetails, (C4059a) this.f26753e.getValue())));
        }
        this.f26750b.a(new d.b(addressDetails));
    }

    public final AddressElementActivityContract.a l() {
        return this.f26749a;
    }

    public final InterfaceC3698L m() {
        return this.f26761m;
    }

    public final InterfaceC3698L n() {
        return this.f26753e;
    }

    public final InterfaceC3698L p() {
        return this.f26757i;
    }

    public final InterfaceC3698L q() {
        return this.f26759k;
    }

    public final com.stripe.android.paymentsheet.addresselement.a r() {
        return this.f26750b;
    }
}
