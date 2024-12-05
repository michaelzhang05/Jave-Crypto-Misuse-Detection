package com.stripe.android.customersheet;

import B3.f;
import F2.b;
import M3.AbstractC1308c;
import M3.InterfaceC1319n;
import M3.InterfaceC1324t;
import O5.I;
import O5.s;
import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.app.Application;
import android.content.res.Resources;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.C1970d;
import b3.InterfaceC1974h;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.a;
import com.stripe.android.customersheet.c;
import com.stripe.android.customersheet.e;
import com.stripe.android.customersheet.i;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.e;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import e3.EnumC2791e;
import f4.InterfaceC2835a;
import h6.InterfaceC2963c;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import l6.N;
import l6.U;
import l6.X;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import s2.AbstractC3992a;
import u2.InterfaceC4057d;
import w2.AbstractC4144k;
import z3.C4227b;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private B3.f f24631a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f24632b;

    /* renamed from: c, reason: collision with root package name */
    private final U f24633c;

    /* renamed from: d, reason: collision with root package name */
    private final Resources f24634d;

    /* renamed from: e, reason: collision with root package name */
    private final E2.a f24635e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4057d f24636f;

    /* renamed from: g, reason: collision with root package name */
    private final h3.m f24637g;

    /* renamed from: h, reason: collision with root package name */
    private final F2.b f24638h;

    /* renamed from: i, reason: collision with root package name */
    private final S5.g f24639i;

    /* renamed from: j, reason: collision with root package name */
    private final Function0 f24640j;

    /* renamed from: k, reason: collision with root package name */
    private final E2.b f24641k;

    /* renamed from: l, reason: collision with root package name */
    private final r3.d f24642l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1324t.a f24643m;

    /* renamed from: n, reason: collision with root package name */
    private final n3.i f24644n;

    /* renamed from: o, reason: collision with root package name */
    private final o2.j f24645o;

    /* renamed from: p, reason: collision with root package name */
    private final o6.w f24646p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f24647q;

    /* renamed from: r, reason: collision with root package name */
    private final o6.w f24648r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3698L f24649s;

    /* renamed from: t, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.e f24650t;

    /* renamed from: u, reason: collision with root package name */
    private C1625g f24651u;

    /* renamed from: v, reason: collision with root package name */
    private C1970d f24652v;

    /* renamed from: w, reason: collision with root package name */
    private List f24653w;

    /* loaded from: classes4.dex */
    static final class A extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f24654a = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.customersheet.e invoke(List it) {
            AbstractC3255y.i(it, "it");
            return (com.stripe.android.customersheet.e) AbstractC1378t.y0(it);
        }
    }

    /* renamed from: com.stripe.android.customersheet.d$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    static final class C2600a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24655a;

        C2600a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C2600a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24655a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                d dVar = d.this;
                this.f24655a = 1;
                if (dVar.I(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C2600a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CustomerSheetContract.a f24657a;

        public b(CustomerSheetContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f24657a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            d a8 = G2.z.a().b(D2.b.a(extras)).c(this.f24657a.a()).d(this.f24657a.b()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24658a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.stripe.android.model.o oVar, S5.d dVar) {
            super(2, dVar);
            this.f24660c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f24660c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24658a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        O5.t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                d dVar = d.this;
                this.f24658a = 1;
                obj = dVar.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            throw null;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0459d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24661a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f24663c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0459d(com.stripe.android.model.p pVar, S5.d dVar) {
            super(2, dVar);
            this.f24663c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0459d(this.f24663c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            ArrayList arrayList;
            boolean z8;
            Object e8 = T5.b.e();
            int i8 = this.f24661a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    obj2 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                d dVar = d.this;
                com.stripe.android.model.p pVar = this.f24663c;
                this.f24661a = 1;
                Object B8 = dVar.B(pVar, this);
                if (B8 == e8) {
                    return e8;
                }
                obj2 = B8;
            }
            d dVar2 = d.this;
            if (O5.s.h(obj2)) {
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) obj2;
                if (!I2.c.a(oVar)) {
                    dVar2.u(oVar);
                } else {
                    dVar2.f24648r.e(new i.d(new f.C0009f(oVar, null, null, 6, null)));
                }
            }
            d dVar3 = d.this;
            com.stripe.android.model.p pVar2 = this.f24663c;
            Throwable e9 = O5.s.e(obj2);
            if (e9 != null) {
                dVar3.f24636f.a("Failed to create payment method for " + pVar2.u(), e9);
                o6.w wVar = dVar3.f24646p;
                do {
                    value = wVar.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                    for (Object obj3 : list) {
                        if (obj3 instanceof e.a) {
                            e.a aVar = (e.a) obj3;
                            B2.b a8 = AbstractC3992a.a(e9);
                            if (aVar.t() != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            obj3 = aVar.j((r39 & 1) != 0 ? aVar.f24728i : null, (r39 & 2) != 0 ? aVar.f24729j : null, (r39 & 4) != 0 ? aVar.f24730k : null, (r39 & 8) != 0 ? aVar.f24731l : null, (r39 & 16) != 0 ? aVar.f24732m : null, (r39 & 32) != 0 ? aVar.f24733n : null, (r39 & 64) != 0 ? aVar.f24734o : null, (r39 & 128) != 0 ? aVar.f24735p : false, (r39 & 256) != 0 ? aVar.f24736q : false, (r39 & 512) != 0 ? aVar.f24737r : false, (r39 & 1024) != 0 ? aVar.f24738s : a8, (r39 & 2048) != 0 ? aVar.f24739t : false, (r39 & 4096) != 0 ? aVar.f24740u : null, (r39 & 8192) != 0 ? aVar.f24741v : z8, (r39 & 16384) != 0 ? aVar.f24742w : null, (r39 & 32768) != 0 ? aVar.f24743x : null, (r39 & 65536) != 0 ? aVar.f24744y : false, (r39 & 131072) != 0 ? aVar.f24745z : false, (r39 & 262144) != 0 ? aVar.f24725A : null, (r39 & 524288) != 0 ? aVar.f24726B : null, (r39 & 1048576) != 0 ? aVar.f24727C : null);
                        }
                        arrayList.add(obj3);
                    }
                } while (!wVar.c(value, arrayList));
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0459d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24664a;

        /* renamed from: c, reason: collision with root package name */
        int f24666c;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24664a = obj;
            this.f24666c |= Integer.MIN_VALUE;
            Object B8 = d.this.B(null, this);
            return B8 == T5.b.e() ? B8 : O5.s.a(B8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24667a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.model.o oVar, S5.d dVar) {
            super(2, dVar);
            this.f24669c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f24669c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24667a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                this.f24667a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            d.this.c0(this.f24669c);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24670a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24671b;

        /* renamed from: d, reason: collision with root package name */
        int f24673d;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24671b = obj;
            this.f24673d |= Integer.MIN_VALUE;
            return d.this.I(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24674a;

        h(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f24674a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    a8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                E2.b bVar = d.this.f24641k;
                E2.a aVar = d.this.f24635e;
                this.f24674a = 1;
                a8 = bVar.a(aVar, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            return O5.s.a(a8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24676a;

        /* renamed from: b, reason: collision with root package name */
        Object f24677b;

        /* renamed from: c, reason: collision with root package name */
        Object f24678c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f24679d;

        /* renamed from: f, reason: collision with root package name */
        int f24681f;

        i(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24679d = obj;
            this.f24681f |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f24682a = new j();

        j() {
            super(1);
        }

        public final void a(W2.e it) {
            AbstractC3255y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W2.e) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24683a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.model.o oVar, S5.d dVar) {
            super(2, dVar);
            this.f24685c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f24685c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f24683a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                d dVar = d.this;
                com.stripe.android.model.o oVar = this.f24685c;
                this.f24683a = 1;
                obj = dVar.b0(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            a.b bVar = (a.b) obj;
            d dVar2 = d.this;
            if (bVar instanceof a.b.C0457b) {
                a.b.C0457b c0457b = (a.b.C0457b) bVar;
                c0457b.a();
                dVar2.F(c0457b.b());
            } else if (bVar instanceof a.b.c) {
                dVar2.c0((com.stripe.android.model.o) ((a.b.c) bVar).a());
            } else {
                throw new O5.p();
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {
        l() {
            super(1);
        }

        public final void a(InterfaceC1319n.a event) {
            AbstractC3255y.i(event, "event");
            if (event instanceof InterfaceC1319n.a.b) {
                d.this.f24638h.j(b.a.f2732b, ((InterfaceC1319n.a.b) event).a());
            } else if (event instanceof InterfaceC1319n.a.C0131a) {
                d.this.f24638h.g(b.a.f2732b, ((InterfaceC1319n.a.C0131a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1319n.a) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24687a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24688b;

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, S5.d dVar) {
            return ((m) create(oVar, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            m mVar = new m(dVar);
            mVar.f24688b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o oVar;
            Object e8 = T5.b.e();
            int i8 = this.f24687a;
            if (i8 != 0) {
                if (i8 == 1) {
                    oVar = (com.stripe.android.model.o) this.f24688b;
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                com.stripe.android.model.o oVar2 = (com.stripe.android.model.o) this.f24688b;
                d dVar = d.this;
                this.f24688b = oVar2;
                this.f24687a = 1;
                Object b02 = dVar.b0(oVar2, this);
                if (b02 == e8) {
                    return e8;
                }
                oVar = oVar2;
                obj = b02;
            }
            a.b bVar = (a.b) obj;
            d dVar2 = d.this;
            if (bVar instanceof a.b.c) {
                dVar2.M();
                dVar2.G(oVar);
            }
            a.b.C0457b a8 = com.stripe.android.customersheet.b.a(bVar);
            if (a8 != null) {
                return a8.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f24690a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24691b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24692c;

        n(S5.d dVar) {
            super(3, dVar);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC2791e enumC2791e, S5.d dVar) {
            n nVar = new n(dVar);
            nVar.f24691b = oVar;
            nVar.f24692c = enumC2791e;
            return nVar.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f24690a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f24691b;
                EnumC2791e enumC2791e = (EnumC2791e) this.f24692c;
                d dVar = d.this;
                this.f24691b = null;
                this.f24690a = 1;
                obj = dVar.J(oVar, enumC2791e, this);
                if (obj == e8) {
                    return e8;
                }
            }
            a.b bVar = (a.b) obj;
            if (bVar instanceof a.b.c) {
                s.a aVar = O5.s.f8302b;
                b8 = O5.s.b(((a.b.c) bVar).a());
            } else if (bVar instanceof a.b.C0457b) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(((a.b.C0457b) bVar).a()));
            } else {
                throw new O5.p();
            }
            return O5.s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24694a;

        /* renamed from: b, reason: collision with root package name */
        Object f24695b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f24696c;

        /* renamed from: e, reason: collision with root package name */
        int f24698e;

        o(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24696c = obj;
            this.f24698e |= Integer.MIN_VALUE;
            return d.this.b0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24699a;

        p(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new p(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC4144k abstractC4144k;
            u2.f d8;
            Object e8 = T5.b.e();
            int i8 = this.f24699a;
            String str = null;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        a.b bVar = (a.b) obj;
                        d dVar = d.this;
                        if (bVar instanceof a.b.c) {
                            dVar.y(f.c.f820a, "google_pay");
                        }
                        d dVar2 = d.this;
                        a.b.C0457b a8 = com.stripe.android.customersheet.b.a(bVar);
                        if (a8 != null) {
                            String b8 = a8.b();
                            if (b8 == null) {
                                Throwable a9 = a8.a();
                                if (a9 instanceof AbstractC4144k) {
                                    abstractC4144k = (AbstractC4144k) a9;
                                } else {
                                    abstractC4144k = null;
                                }
                                if (abstractC4144k != null && (d8 = abstractC4144k.d()) != null) {
                                    str = d8.i();
                                }
                            } else {
                                str = b8;
                            }
                            dVar2.z(f.c.f820a, "google_pay", a8.a(), str);
                        }
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                d dVar3 = d.this;
                this.f24699a = 1;
                obj = dVar3.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            a.AbstractC0454a.b bVar2 = a.AbstractC0454a.b.f24604c;
            this.f24699a = 2;
            throw null;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24701a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.C0009f f24703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(f.C0009f c0009f, S5.d dVar) {
            super(2, dVar);
            this.f24703c = c0009f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new q(this.f24703c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o r8;
            o.p pVar;
            AbstractC4144k abstractC4144k;
            u2.f d8;
            String str;
            com.stripe.android.model.o r9;
            o.p pVar2;
            Object e8 = T5.b.e();
            int i8 = this.f24701a;
            String str2 = null;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        a.b bVar = (a.b) obj;
                        d dVar = d.this;
                        f.C0009f c0009f = this.f24703c;
                        if (bVar instanceof a.b.c) {
                            if (c0009f != null && (r9 = c0009f.r()) != null && (pVar2 = r9.f25467e) != null) {
                                str = pVar2.f25605a;
                            } else {
                                str = null;
                            }
                            dVar.y(c0009f, str);
                        }
                        d dVar2 = d.this;
                        f.C0009f c0009f2 = this.f24703c;
                        a.b.C0457b a8 = com.stripe.android.customersheet.b.a(bVar);
                        if (a8 != null) {
                            String b8 = a8.b();
                            if (b8 == null) {
                                Throwable a9 = a8.a();
                                if (a9 instanceof AbstractC4144k) {
                                    abstractC4144k = (AbstractC4144k) a9;
                                } else {
                                    abstractC4144k = null;
                                }
                                if (abstractC4144k != null && (d8 = abstractC4144k.d()) != null) {
                                    b8 = d8.i();
                                } else {
                                    b8 = null;
                                }
                            }
                            Throwable a10 = a8.a();
                            if (c0009f2 != null && (r8 = c0009f2.r()) != null && (pVar = r8.f25467e) != null) {
                                str2 = pVar.f25605a;
                            }
                            dVar2.z(c0009f2, str2, a10, b8);
                        }
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                d dVar3 = d.this;
                this.f24701a = 1;
                obj = dVar3.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            f.C0009f c0009f3 = this.f24703c;
            if (c0009f3 != null) {
                a.AbstractC0454a.f24602b.a(c0009f3);
            }
            this.f24701a = 2;
            throw null;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3256z implements InterfaceC1668n {
        r() {
            super(2);
        }

        public final void a(B2.b bVar, boolean z8) {
            d.this.H(new c.q(bVar, z8));
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((B2.b) obj, ((Boolean) obj2).booleanValue());
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3256z implements Function1 {
        s() {
            super(1);
        }

        public final void a(f.e.d it) {
            AbstractC3255y.i(it, "it");
            d.this.H(new c.g(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f.e.d) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3256z implements Function1 {
        t() {
            super(1);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.d it) {
            AbstractC3255y.i(it, "it");
            d.this.H(new c.f(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3256z implements Function1 {
        u() {
            super(1);
        }

        public final void a(Function1 it) {
            AbstractC3255y.i(it, "it");
            d.this.H(new c.p(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Function1) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final v f24708a = new v();

        v() {
            super(1);
        }

        public final void a(PrimaryButton.a it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PrimaryButton.a) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3256z implements Function1 {
        w() {
            super(1);
        }

        public final void a(B2.b bVar) {
            d.this.H(new c.j(bVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B2.b) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f24710a = new x();

        x() {
            super(1);
        }

        public final void a(W2.e it) {
            AbstractC3255y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W2.e) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f24711a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B3.f f24712b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2835a f24713c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(List list, B3.f fVar, InterfaceC2835a interfaceC2835a) {
            super(1);
            this.f24711a = list;
            this.f24712b = fVar;
            this.f24713c = interfaceC2835a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.d invoke(e.d it) {
            e.d j8;
            AbstractC3255y.i(it, "it");
            j8 = it.j((r32 & 1) != 0 ? it.f24753i : null, (r32 & 2) != 0 ? it.f24754j : this.f24711a, (r32 & 4) != 0 ? it.f24755k : this.f24712b, (r32 & 8) != 0 ? it.f24756l : false, (r32 & 16) != 0 ? it.f24757m : false, (r32 & 32) != 0 ? it.f24758n : false, (r32 & 64) != 0 ? it.f24759o : false, (r32 & 128) != 0 ? it.f24760p : false, (r32 & 256) != 0 ? it.f24761q : null, (r32 & 512) != 0 ? it.f24762r : false, (r32 & 1024) != 0 ? it.f24763s : false, (r32 & 2048) != 0 ? it.f24764t : null, (r32 & 4096) != 0 ? it.f24765u : null, (r32 & 8192) != 0 ? it.f24766v : null, (r32 & 16384) != 0 ? it.f24767w : this.f24713c);
            return j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24714a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f24716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(com.stripe.android.model.o oVar, S5.d dVar) {
            super(2, dVar);
            this.f24716c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new z(this.f24716c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o6.w wVar;
            ArrayList arrayList;
            Object obj2;
            ArrayList arrayList2;
            boolean z8;
            B3.f fVar;
            T5.b.e();
            if (this.f24714a == 0) {
                O5.t.b(obj);
                List<com.stripe.android.model.o> d8 = ((com.stripe.android.customersheet.e) d.this.E().getValue()).d();
                com.stripe.android.model.o oVar = this.f24716c;
                int i8 = 10;
                ArrayList arrayList3 = new ArrayList(AbstractC1378t.x(d8, 10));
                for (com.stripe.android.model.o oVar2 : d8) {
                    String str = oVar2.f25463a;
                    String str2 = oVar.f25463a;
                    if (str2 != null && str != null && AbstractC3255y.d(str2, str)) {
                        oVar2 = oVar;
                    }
                    arrayList3.add(oVar2);
                }
                d dVar = d.this;
                com.stripe.android.model.o oVar3 = this.f24716c;
                o6.w wVar2 = dVar.f24646p;
                while (true) {
                    Object value = wVar2.getValue();
                    List<Object> list = (List) value;
                    ArrayList arrayList4 = new ArrayList(AbstractC1378t.x(list, i8));
                    for (Object obj3 : list) {
                        if (obj3 instanceof e.d) {
                            e.d dVar2 = (e.d) obj3;
                            B3.f fVar2 = dVar.f24631a;
                            B3.f o8 = dVar2.o();
                            boolean z9 = o8 instanceof f.C0009f;
                            if (z9) {
                                f.C0009f c0009f = (f.C0009f) o8;
                                if (AbstractC3255y.d(c0009f.r().f25463a, oVar3.f25463a)) {
                                    z8 = z9;
                                    fVar = f.C0009f.h(c0009f, oVar3, null, null, 6, null);
                                    if (z8 && (fVar2 instanceof f.C0009f) && AbstractC3255y.d(((f.C0009f) o8).r().f25463a, oVar3.f25463a)) {
                                        fVar2 = f.C0009f.h((f.C0009f) fVar2, oVar3, null, null, 6, null);
                                    }
                                    dVar.f24631a = fVar2;
                                    obj2 = value;
                                    wVar = wVar2;
                                    arrayList = arrayList3;
                                    obj3 = dVar2.j((r32 & 1) != 0 ? dVar2.f24753i : null, (r32 & 2) != 0 ? dVar2.f24754j : arrayList3, (r32 & 4) != 0 ? dVar2.f24755k : fVar, (r32 & 8) != 0 ? dVar2.f24756l : false, (r32 & 16) != 0 ? dVar2.f24757m : false, (r32 & 32) != 0 ? dVar2.f24758n : false, (r32 & 64) != 0 ? dVar2.f24759o : false, (r32 & 128) != 0 ? dVar2.f24760p : false, (r32 & 256) != 0 ? dVar2.f24761q : null, (r32 & 512) != 0 ? dVar2.f24762r : false, (r32 & 1024) != 0 ? dVar2.f24763s : false, (r32 & 2048) != 0 ? dVar2.f24764t : null, (r32 & 4096) != 0 ? dVar2.f24765u : null, (r32 & 8192) != 0 ? dVar2.f24766v : null, (r32 & 16384) != 0 ? dVar2.f24767w : null);
                                    arrayList2 = arrayList4;
                                }
                            }
                            z8 = z9;
                            fVar = o8;
                            if (z8) {
                                fVar2 = f.C0009f.h((f.C0009f) fVar2, oVar3, null, null, 6, null);
                            }
                            dVar.f24631a = fVar2;
                            obj2 = value;
                            wVar = wVar2;
                            arrayList = arrayList3;
                            obj3 = dVar2.j((r32 & 1) != 0 ? dVar2.f24753i : null, (r32 & 2) != 0 ? dVar2.f24754j : arrayList3, (r32 & 4) != 0 ? dVar2.f24755k : fVar, (r32 & 8) != 0 ? dVar2.f24756l : false, (r32 & 16) != 0 ? dVar2.f24757m : false, (r32 & 32) != 0 ? dVar2.f24758n : false, (r32 & 64) != 0 ? dVar2.f24759o : false, (r32 & 128) != 0 ? dVar2.f24760p : false, (r32 & 256) != 0 ? dVar2.f24761q : null, (r32 & 512) != 0 ? dVar2.f24762r : false, (r32 & 1024) != 0 ? dVar2.f24763s : false, (r32 & 2048) != 0 ? dVar2.f24764t : null, (r32 & 4096) != 0 ? dVar2.f24765u : null, (r32 & 8192) != 0 ? dVar2.f24766v : null, (r32 & 16384) != 0 ? dVar2.f24767w : null);
                            arrayList2 = arrayList4;
                        } else {
                            wVar = wVar2;
                            arrayList = arrayList3;
                            obj2 = value;
                            arrayList2 = arrayList4;
                        }
                        arrayList2.add(obj3);
                        arrayList4 = arrayList2;
                        value = obj2;
                        wVar2 = wVar;
                        arrayList3 = arrayList;
                    }
                    o6.w wVar3 = wVar2;
                    ArrayList arrayList5 = arrayList3;
                    if (wVar3.c(value, arrayList4)) {
                        return I.f8278a;
                    }
                    wVar2 = wVar3;
                    arrayList3 = arrayList5;
                    i8 = 10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((z) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public d(Application application, List initialBackStack, B3.f fVar, L5.a paymentConfigurationProvider, U customerAdapterProvider, Resources resources, E2.a configuration, InterfaceC4057d logger, h3.m stripeRepository, F2.b eventReporter, S5.g workContext, Function0 isLiveModeProvider, e.d intentConfirmationHandlerFactory, E2.b customerSheetLoader, r3.d isFinancialConnectionsAvailable, InterfaceC1324t.a editInteractorFactory, n3.i errorReporter) {
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(initialBackStack, "initialBackStack");
        AbstractC3255y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3255y.i(customerAdapterProvider, "customerAdapterProvider");
        AbstractC3255y.i(resources, "resources");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3255y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3255y.i(customerSheetLoader, "customerSheetLoader");
        AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f24631a = fVar;
        this.f24632b = paymentConfigurationProvider;
        this.f24633c = customerAdapterProvider;
        this.f24634d = resources;
        this.f24635e = configuration;
        this.f24636f = logger;
        this.f24637g = stripeRepository;
        this.f24638h = eventReporter;
        this.f24639i = workContext;
        this.f24640j = isLiveModeProvider;
        this.f24641k = customerSheetLoader;
        this.f24642l = isFinancialConnectionsAvailable;
        this.f24643m = editInteractorFactory;
        this.f24644n = errorReporter;
        this.f24645o = new o2.j(application);
        o6.w a8 = AbstractC3700N.a(initialBackStack);
        this.f24646p = a8;
        InterfaceC3698L m8 = y4.g.m(a8, A.f24654a);
        this.f24647q = m8;
        o6.w a9 = AbstractC3700N.a(null);
        this.f24648r = a9;
        this.f24649s = a9;
        this.f24650t = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        this.f24653w = new ArrayList();
        com.stripe.android.paymentsheet.v.a(configuration.b());
        eventReporter.h(configuration);
        if (m8.getValue() instanceof e.c) {
            AbstractC3364k.d(ViewModelKt.getViewModelScope(this), workContext, null, new C2600a(null), 2, null);
        }
    }

    private final void A(com.stripe.android.model.p pVar) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new C0459d(pVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(com.stripe.android.model.p r11, S5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.customersheet.d.e
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.customersheet.d$e r0 = (com.stripe.android.customersheet.d.e) r0
            int r1 = r0.f24666c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24666c = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$e r0 = new com.stripe.android.customersheet.d$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f24664a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24666c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r12)
            O5.s r12 = (O5.s) r12
            java.lang.Object r11 = r12.j()
            goto L66
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            O5.t.b(r12)
            h3.m r12 = r10.f24637g
            A2.j$c r2 = new A2.j$c
            L5.a r4 = r10.f24632b
            java.lang.Object r4 = r4.get()
            m2.r r4 = (m2.r) r4
            java.lang.String r5 = r4.g()
            L5.a r4 = r10.f24632b
            java.lang.Object r4 = r4.get()
            m2.r r4 = (m2.r) r4
            java.lang.String r6 = r4.h()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f24666c = r3
            java.lang.Object r11 = r12.n(r11, r2, r0)
            if (r11 != r1) goto L66
            return r1
        L66:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.B(com.stripe.android.model.p, S5.d):java.lang.Object");
    }

    private final b.EnumC0047b C(com.stripe.android.customersheet.e eVar) {
        if (eVar instanceof e.a) {
            return b.EnumC0047b.f2735b;
        }
        if (eVar instanceof e.d) {
            return b.EnumC0047b.f2736c;
        }
        if (eVar instanceof e.b) {
            return b.EnumC0047b.f2737d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        Object value;
        ArrayList arrayList;
        if (this.f24647q.getValue() instanceof e.d) {
            o6.w wVar = this.f24646p;
            do {
                value = wVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                for (Object obj : list) {
                    if (obj instanceof e.d) {
                        obj = r7.j((r32 & 1) != 0 ? r7.f24753i : null, (r32 & 2) != 0 ? r7.f24754j : null, (r32 & 4) != 0 ? r7.f24755k : null, (r32 & 8) != 0 ? r7.f24756l : false, (r32 & 16) != 0 ? r7.f24757m : false, (r32 & 32) != 0 ? r7.f24758n : false, (r32 & 64) != 0 ? r7.f24759o : false, (r32 & 128) != 0 ? r7.f24760p : false, (r32 & 256) != 0 ? r7.f24761q : null, (r32 & 512) != 0 ? r7.f24762r : false, (r32 & 1024) != 0 ? r7.f24763s : false, (r32 & 2048) != 0 ? r7.f24764t : str, (r32 & 4096) != 0 ? r7.f24765u : null, (r32 & 8192) != 0 ? r7.f24766v : null, (r32 & 16384) != 0 ? ((e.d) obj).f24767w : null);
                    }
                    arrayList.add(obj);
                }
            } while (!wVar.c(value, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(com.stripe.android.model.o oVar) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new f(oVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.customersheet.d.g
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.customersheet.d$g r0 = (com.stripe.android.customersheet.d.g) r0
            int r1 = r0.f24673d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24673d = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$g r0 = new com.stripe.android.customersheet.d$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24671b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24673d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f24670a
            com.stripe.android.customersheet.d r0 = (com.stripe.android.customersheet.d) r0
            O5.t.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            O5.t.b(r6)
            S5.g r6 = r5.f24639i
            com.stripe.android.customersheet.d$h r2 = new com.stripe.android.customersheet.d$h
            r4 = 0
            r2.<init>(r4)
            r0.f24670a = r5
            r0.f24673d = r3
            java.lang.Object r6 = l6.AbstractC3360i.g(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            O5.s r6 = (O5.s) r6
            java.lang.Object r6 = r6.j()
            java.lang.Throwable r1 = O5.s.e(r6)
            if (r1 != 0) goto La9
            E2.d r6 = (E2.d) r6
            java.lang.Throwable r1 = r6.e()
            if (r1 == 0) goto L79
            o6.w r1 = r0.f24648r
        L62:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            com.stripe.android.customersheet.i r2 = (com.stripe.android.customersheet.i) r2
            com.stripe.android.customersheet.i$c r2 = new com.stripe.android.customersheet.i$c
            java.lang.Throwable r3 = r6.e()
            r2.<init>(r3)
            boolean r0 = r1.c(r0, r2)
            if (r0 == 0) goto L62
            goto Lbd
        L79:
            java.util.List r1 = r0.f24653w
            r1.clear()
            java.util.List r1 = r0.f24653w
            java.util.List r2 = r6.d()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            B3.f r1 = r6.c()
            r0.f24631a = r1
            b3.d r1 = r6.b()
            r0.f24652v = r1
            java.util.List r1 = r6.a()
            B3.f r2 = r6.c()
            b3.d r6 = r6.b()
            f4.a r6 = r6.w()
            r0.j0(r1, r2, r6)
            goto Lbd
        La9:
            o6.w r6 = r0.f24648r
        Lab:
            java.lang.Object r0 = r6.getValue()
            r2 = r0
            com.stripe.android.customersheet.i r2 = (com.stripe.android.customersheet.i) r2
            com.stripe.android.customersheet.i$c r2 = new com.stripe.android.customersheet.i$c
            r2.<init>(r1)
            boolean r0 = r6.c(r0, r2)
            if (r0 == 0) goto Lab
        Lbd:
            O5.I r6 = O5.I.f8278a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.I(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(com.stripe.android.model.o r19, e3.EnumC2791e r20, S5.d r21) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.J(com.stripe.android.model.o, e3.e, S5.d):java.lang.Object");
    }

    private final void K() {
        i0(this, false, null, 2, null);
    }

    private final void L(C1625g c1625g) {
        e.a aVar;
        Object value;
        ArrayList arrayList;
        List m8;
        B2.b a8;
        B2.b bVar;
        boolean z8;
        Object value2 = this.f24647q.getValue();
        if (value2 instanceof e.a) {
            aVar = (e.a) value2;
        } else {
            aVar = null;
        }
        if (aVar != null && AbstractC3255y.d(aVar.v(), c1625g.d())) {
            return;
        }
        this.f24638h.d(c1625g.d());
        this.f24651u = c1625g;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar2 = (e.a) obj;
                    String d8 = c1625g.d();
                    C4227b c4227b = C4227b.f41130a;
                    String d9 = c1625g.d();
                    E2.a aVar3 = this.f24635e;
                    D3.a a9 = c4227b.a(d9, aVar3, aVar3.p(), aVar2.c());
                    C1970d c1970d = this.f24652v;
                    if (c1970d == null || (m8 = c1970d.l(c1625g.d(), new InterfaceC1974h.a.InterfaceC0359a.C0360a(this.f24645o, null, j.f24682a, null, null, 24, null))) == null) {
                        m8 = AbstractC1378t.m();
                    }
                    List list2 = m8;
                    if (AbstractC3255y.d(c1625g.d(), o.p.f25577O.f25605a) && !(aVar2.l() instanceof d.b)) {
                        a8 = B2.c.a(e4.n.f31748o);
                    } else {
                        a8 = B2.c.a(t3.w.f39774a0);
                    }
                    B2.b bVar2 = a8;
                    B3.f o8 = aVar2.o();
                    if (o8 != null) {
                        bVar = o8.b(this.f24635e.p(), true);
                    } else {
                        bVar = null;
                    }
                    if (aVar2.t() != null && !aVar2.g()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = aVar2.j((r39 & 1) != 0 ? aVar2.f24728i : d8, (r39 & 2) != 0 ? aVar2.f24729j : null, (r39 & 4) != 0 ? aVar2.f24730k : null, (r39 & 8) != 0 ? aVar2.f24731l : list2, (r39 & 16) != 0 ? aVar2.f24732m : a9, (r39 & 32) != 0 ? aVar2.f24733n : null, (r39 & 64) != 0 ? aVar2.f24734o : null, (r39 & 128) != 0 ? aVar2.f24735p : false, (r39 & 256) != 0 ? aVar2.f24736q : false, (r39 & 512) != 0 ? aVar2.f24737r : false, (r39 & 1024) != 0 ? aVar2.f24738s : null, (r39 & 2048) != 0 ? aVar2.f24739t : false, (r39 & 4096) != 0 ? aVar2.f24740u : bVar2, (r39 & 8192) != 0 ? aVar2.f24741v : z8, (r39 & 16384) != 0 ? aVar2.f24742w : null, (r39 & 32768) != 0 ? aVar2.f24743x : bVar, (r39 & 65536) != 0 ? aVar2.f24744y : false, (r39 & 131072) != 0 ? aVar2.f24745z : false, (r39 & 262144) != 0 ? aVar2.f24725A : null, (r39 & 524288) != 0 ? aVar2.f24726B : null, (r39 & 1048576) != 0 ? aVar2.f24727C : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        Object value;
        List list;
        if (((List) this.f24646p.getValue()).size() == 1) {
            this.f24648r.e(new i.a(this.f24631a));
            return;
        }
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            list = (List) value;
            b.EnumC0047b C8 = C((com.stripe.android.customersheet.e) AbstractC1378t.y0(list));
            if (C8 != null) {
                this.f24638h.e(C8);
            }
        } while (!wVar.c(value, AbstractC1378t.g0(list, 1)));
    }

    private final void N() {
        Object value;
        ArrayList arrayList;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f24728i : null, (r39 & 2) != 0 ? r6.f24729j : null, (r39 & 4) != 0 ? r6.f24730k : null, (r39 & 8) != 0 ? r6.f24731l : null, (r39 & 16) != 0 ? r6.f24732m : null, (r39 & 32) != 0 ? r6.f24733n : null, (r39 & 64) != 0 ? r6.f24734o : null, (r39 & 128) != 0 ? r6.f24735p : false, (r39 & 256) != 0 ? r6.f24736q : false, (r39 & 512) != 0 ? r6.f24737r : false, (r39 & 1024) != 0 ? r6.f24738s : null, (r39 & 2048) != 0 ? r6.f24739t : false, (r39 & 4096) != 0 ? r6.f24740u : null, (r39 & 8192) != 0 ? r6.f24741v : false, (r39 & 16384) != 0 ? r6.f24742w : null, (r39 & 32768) != 0 ? r6.f24743x : null, (r39 & 65536) != 0 ? r6.f24744y : false, (r39 & 131072) != 0 ? r6.f24745z : false, (r39 & 262144) != 0 ? r6.f24725A : null, (r39 & 524288) != 0 ? r6.f24726B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f24727C : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void O() {
        this.f24638h.a();
    }

    private final void P(com.stripe.android.payments.bankaccount.navigation.d dVar) {
        Object value;
        ArrayList arrayList;
        B2.b a8;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar = (e.a) obj;
                    if (dVar instanceof d.b) {
                        a8 = B2.c.a(t3.w.f39774a0);
                    } else {
                        a8 = B2.c.a(e4.n.f31748o);
                    }
                    obj = aVar.j((r39 & 1) != 0 ? aVar.f24728i : null, (r39 & 2) != 0 ? aVar.f24729j : null, (r39 & 4) != 0 ? aVar.f24730k : null, (r39 & 8) != 0 ? aVar.f24731l : null, (r39 & 16) != 0 ? aVar.f24732m : null, (r39 & 32) != 0 ? aVar.f24733n : null, (r39 & 64) != 0 ? aVar.f24734o : null, (r39 & 128) != 0 ? aVar.f24735p : false, (r39 & 256) != 0 ? aVar.f24736q : false, (r39 & 512) != 0 ? aVar.f24737r : false, (r39 & 1024) != 0 ? aVar.f24738s : null, (r39 & 2048) != 0 ? aVar.f24739t : false, (r39 & 4096) != 0 ? aVar.f24740u : a8, (r39 & 8192) != 0 ? aVar.f24741v : false, (r39 & 16384) != 0 ? aVar.f24742w : null, (r39 & 32768) != 0 ? aVar.f24743x : null, (r39 & 65536) != 0 ? aVar.f24744y : false, (r39 & 131072) != 0 ? aVar.f24745z : false, (r39 & 262144) != 0 ? aVar.f24725A : dVar, (r39 & 524288) != 0 ? aVar.f24726B : null, (r39 & 1048576) != 0 ? aVar.f24727C : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void Q(f.e.d dVar) {
        A(dVar.h());
    }

    private final void R() {
        Object value;
        o6.w wVar = this.f24648r;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, new i.a(this.f24631a)));
    }

    private final void S() {
        Object value;
        ArrayList arrayList;
        boolean z8;
        if (((com.stripe.android.customersheet.e) this.f24647q.getValue()).e()) {
            this.f24638h.o();
        } else {
            this.f24638h.m();
        }
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.d) {
                    e.d dVar = (e.d) obj;
                    boolean z9 = !dVar.e();
                    if (!z9 && !AbstractC3255y.d(this.f24631a, dVar.o())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = dVar.j((r32 & 1) != 0 ? dVar.f24753i : null, (r32 & 2) != 0 ? dVar.f24754j : null, (r32 & 4) != 0 ? dVar.f24755k : null, (r32 & 8) != 0 ? dVar.f24756l : false, (r32 & 16) != 0 ? dVar.f24757m : false, (r32 & 32) != 0 ? dVar.f24758n : z9, (r32 & 64) != 0 ? dVar.f24759o : false, (r32 & 128) != 0 ? dVar.f24760p : z8, (r32 & 256) != 0 ? dVar.f24761q : null, (r32 & 512) != 0 ? dVar.f24762r : false, (r32 & 1024) != 0 ? dVar.f24763s : false, (r32 & 2048) != 0 ? dVar.f24764t : null, (r32 & 4096) != 0 ? dVar.f24765u : null, (r32 & 8192) != 0 ? dVar.f24766v : null, (r32 & 16384) != 0 ? dVar.f24767w : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void T(B2.b bVar) {
        Object value;
        ArrayList arrayList;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f24728i : null, (r39 & 2) != 0 ? r6.f24729j : null, (r39 & 4) != 0 ? r6.f24730k : null, (r39 & 8) != 0 ? r6.f24731l : null, (r39 & 16) != 0 ? r6.f24732m : null, (r39 & 32) != 0 ? r6.f24733n : null, (r39 & 64) != 0 ? r6.f24734o : null, (r39 & 128) != 0 ? r6.f24735p : false, (r39 & 256) != 0 ? r6.f24736q : false, (r39 & 512) != 0 ? r6.f24737r : false, (r39 & 1024) != 0 ? r6.f24738s : bVar, (r39 & 2048) != 0 ? r6.f24739t : false, (r39 & 4096) != 0 ? r6.f24740u : null, (r39 & 8192) != 0 ? r6.f24741v : false, (r39 & 16384) != 0 ? r6.f24742w : null, (r39 & 32768) != 0 ? r6.f24743x : null, (r39 & 65536) != 0 ? r6.f24744y : false, (r39 & 131072) != 0 ? r6.f24745z : false, (r39 & 262144) != 0 ? r6.f24725A : null, (r39 & 524288) != 0 ? r6.f24726B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f24727C : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void U(z3.c cVar) {
        Object obj;
        o6.w wVar;
        C1970d c1970d;
        ArrayList arrayList;
        boolean z8;
        B3.f fVar;
        z3.c cVar2 = cVar;
        C1970d c1970d2 = this.f24652v;
        if (c1970d2 != null) {
            o6.w wVar2 = this.f24646p;
            while (true) {
                Object value = wVar2.getValue();
                List<Object> list = (List) value;
                ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(list, 10));
                for (Object obj2 : list) {
                    if (obj2 instanceof e.a) {
                        e.a aVar = (e.a) obj2;
                        if (cVar2 != null && !aVar.g()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (cVar2 != null) {
                            for (C1625g c1625g : aVar.z()) {
                                if (AbstractC3255y.d(c1625g.d(), aVar.v())) {
                                    fVar = AbstractC1308c.g(cVar2, c1625g, c1970d2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        fVar = null;
                        obj = value;
                        wVar = wVar2;
                        c1970d = c1970d2;
                        obj2 = aVar.j((r39 & 1) != 0 ? aVar.f24728i : null, (r39 & 2) != 0 ? aVar.f24729j : null, (r39 & 4) != 0 ? aVar.f24730k : cVar, (r39 & 8) != 0 ? aVar.f24731l : null, (r39 & 16) != 0 ? aVar.f24732m : null, (r39 & 32) != 0 ? aVar.f24733n : null, (r39 & 64) != 0 ? aVar.f24734o : fVar, (r39 & 128) != 0 ? aVar.f24735p : false, (r39 & 256) != 0 ? aVar.f24736q : false, (r39 & 512) != 0 ? aVar.f24737r : false, (r39 & 1024) != 0 ? aVar.f24738s : null, (r39 & 2048) != 0 ? aVar.f24739t : false, (r39 & 4096) != 0 ? aVar.f24740u : null, (r39 & 8192) != 0 ? aVar.f24741v : z8, (r39 & 16384) != 0 ? aVar.f24742w : null, (r39 & 32768) != 0 ? aVar.f24743x : null, (r39 & 65536) != 0 ? aVar.f24744y : false, (r39 & 131072) != 0 ? aVar.f24745z : false, (r39 & 262144) != 0 ? aVar.f24725A : null, (r39 & 524288) != 0 ? aVar.f24726B : null, (r39 & 1048576) != 0 ? aVar.f24727C : null);
                        arrayList = arrayList2;
                    } else {
                        obj = value;
                        wVar = wVar2;
                        c1970d = c1970d2;
                        arrayList = arrayList2;
                    }
                    arrayList.add(obj2);
                    cVar2 = cVar;
                    arrayList2 = arrayList;
                    c1970d2 = c1970d;
                    value = obj;
                    wVar2 = wVar;
                }
                o6.w wVar3 = wVar2;
                C1970d c1970d3 = c1970d2;
                if (!wVar3.c(value, arrayList2)) {
                    cVar2 = cVar;
                    wVar2 = wVar3;
                    c1970d2 = c1970d3;
                } else {
                    return;
                }
            }
        }
    }

    private final void V(com.stripe.android.model.o oVar) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new k(oVar, null), 2, null);
    }

    private final void W(B3.f fVar) {
        boolean z8;
        Object obj;
        o6.w wVar;
        B3.f fVar2;
        ArrayList arrayList;
        B2.b bVar;
        d dVar = this;
        B3.f fVar3 = fVar;
        if (fVar3 instanceof f.c) {
            z8 = true;
        } else {
            z8 = fVar3 instanceof f.C0009f;
        }
        if (z8) {
            if (!((com.stripe.android.customersheet.e) dVar.f24647q.getValue()).e()) {
                o6.w wVar2 = this.f24646p;
                while (true) {
                    Object value = wVar2.getValue();
                    List<Object> list = (List) value;
                    ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(list, 10));
                    for (Object obj2 : list) {
                        if (obj2 instanceof e.d) {
                            e.d dVar2 = (e.d) obj2;
                            boolean z9 = !AbstractC3255y.d(dVar.f24631a, fVar3);
                            String string = dVar.f24634d.getString(t3.w.f39752F);
                            B2.b b8 = fVar3.b(dVar.f24635e.p(), false);
                            if (b8 != null && z9) {
                                bVar = b8;
                            } else {
                                bVar = null;
                            }
                            obj = value;
                            wVar = wVar2;
                            fVar2 = fVar3;
                            obj2 = dVar2.j((r32 & 1) != 0 ? dVar2.f24753i : null, (r32 & 2) != 0 ? dVar2.f24754j : null, (r32 & 4) != 0 ? dVar2.f24755k : fVar, (r32 & 8) != 0 ? dVar2.f24756l : false, (r32 & 16) != 0 ? dVar2.f24757m : false, (r32 & 32) != 0 ? dVar2.f24758n : false, (r32 & 64) != 0 ? dVar2.f24759o : false, (r32 & 128) != 0 ? dVar2.f24760p : z9, (r32 & 256) != 0 ? dVar2.f24761q : string, (r32 & 512) != 0 ? dVar2.f24762r : false, (r32 & 1024) != 0 ? dVar2.f24763s : false, (r32 & 2048) != 0 ? dVar2.f24764t : null, (r32 & 4096) != 0 ? dVar2.f24765u : null, (r32 & 8192) != 0 ? dVar2.f24766v : bVar, (r32 & 16384) != 0 ? dVar2.f24767w : null);
                            arrayList = arrayList2;
                        } else {
                            obj = value;
                            wVar = wVar2;
                            fVar2 = fVar3;
                            arrayList = arrayList2;
                        }
                        arrayList.add(obj2);
                        fVar3 = fVar2;
                        arrayList2 = arrayList;
                        value = obj;
                        wVar2 = wVar;
                        dVar = this;
                    }
                    o6.w wVar3 = wVar2;
                    B3.f fVar4 = fVar3;
                    if (wVar3.c(value, arrayList2)) {
                        return;
                    }
                    fVar3 = fVar4;
                    wVar2 = wVar3;
                    dVar = this;
                }
            }
        } else {
            throw new IllegalStateException(("Unsupported payment selection " + fVar3).toString());
        }
    }

    private final void X(com.stripe.android.model.o oVar) {
        boolean z8;
        String str;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f24647q.getValue();
        if (this.f24635e.a() || eVar.d().size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        InterfaceC1324t.a aVar = this.f24643m;
        o.p pVar = oVar.f25467e;
        if (pVar != null) {
            str = pVar.f25605a;
        } else {
            str = null;
        }
        B2.b Z7 = Z(str);
        C1970d c1970d = this.f24652v;
        if (c1970d != null) {
            g0(this, new e.b(aVar.a(oVar, new l(), new m(null), new n(null), Z7, z8, c1970d.W().c()), eVar.f(), eVar.c(), eVar.d(), this.f24635e.a(), true), false, 2, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void Y() {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f24647q.getValue();
        if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            if (aVar.m() == null) {
                o6.w wVar = this.f24646p;
                do {
                    value2 = wVar.getValue();
                    List<Object> list = (List) value2;
                    arrayList2 = new ArrayList(AbstractC1378t.x(list, 10));
                    for (Object obj : list) {
                        if (obj instanceof e.a) {
                            obj = r9.j((r39 & 1) != 0 ? r9.f24728i : null, (r39 & 2) != 0 ? r9.f24729j : null, (r39 & 4) != 0 ? r9.f24730k : null, (r39 & 8) != 0 ? r9.f24731l : null, (r39 & 16) != 0 ? r9.f24732m : null, (r39 & 32) != 0 ? r9.f24733n : null, (r39 & 64) != 0 ? r9.f24734o : null, (r39 & 128) != 0 ? r9.f24735p : false, (r39 & 256) != 0 ? r9.f24736q : false, (r39 & 512) != 0 ? r9.f24737r : true, (r39 & 1024) != 0 ? r9.f24738s : null, (r39 & 2048) != 0 ? r9.f24739t : false, (r39 & 4096) != 0 ? r9.f24740u : null, (r39 & 8192) != 0 ? r9.f24741v : false, (r39 & 16384) != 0 ? r9.f24742w : null, (r39 & 32768) != 0 ? r9.f24743x : null, (r39 & 65536) != 0 ? r9.f24744y : false, (r39 & 131072) != 0 ? r9.f24745z : false, (r39 & 262144) != 0 ? r9.f24725A : null, (r39 & 524288) != 0 ? r9.f24726B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f24727C : null);
                        }
                        arrayList2.add(obj);
                    }
                } while (!wVar.c(value2, arrayList2));
                z3.c t8 = aVar.t();
                if (t8 != null) {
                    String v8 = aVar.v();
                    C1970d c1970d = this.f24652v;
                    if (c1970d != null) {
                        A(AbstractC1308c.e(t8, v8, c1970d));
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalStateException("completeFormValues cannot be null".toString());
            }
            aVar.m().f().invoke();
            return;
        }
        if (eVar instanceof e.d) {
            o6.w wVar2 = this.f24646p;
            do {
                value = wVar2.getValue();
                List<Object> list2 = (List) value;
                arrayList = new ArrayList(AbstractC1378t.x(list2, 10));
                for (Object obj2 : list2) {
                    if (obj2 instanceof e.d) {
                        obj2 = r10.j((r32 & 1) != 0 ? r10.f24753i : null, (r32 & 2) != 0 ? r10.f24754j : null, (r32 & 4) != 0 ? r10.f24755k : null, (r32 & 8) != 0 ? r10.f24756l : false, (r32 & 16) != 0 ? r10.f24757m : true, (r32 & 32) != 0 ? r10.f24758n : false, (r32 & 64) != 0 ? r10.f24759o : false, (r32 & 128) != 0 ? r10.f24760p : false, (r32 & 256) != 0 ? r10.f24761q : null, (r32 & 512) != 0 ? r10.f24762r : false, (r32 & 1024) != 0 ? r10.f24763s : false, (r32 & 2048) != 0 ? r10.f24764t : null, (r32 & 4096) != 0 ? r10.f24765u : null, (r32 & 8192) != 0 ? r10.f24766v : null, (r32 & 16384) != 0 ? ((e.d) obj2).f24767w : null);
                    }
                    arrayList.add(obj2);
                }
            } while (!wVar2.c(value, arrayList));
            B3.f o8 = ((e.d) eVar).o();
            if (o8 instanceof f.c) {
                d0();
                return;
            }
            if (o8 instanceof f.C0009f) {
                e0((f.C0009f) o8);
                return;
            } else {
                if (o8 == null) {
                    e0(null);
                    return;
                }
                throw new IllegalStateException((o8 + " is not supported").toString());
            }
        }
        throw new IllegalStateException((this.f24647q.getValue() + " is not supported").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(com.stripe.android.model.o r7, S5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.customersheet.d.o
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.customersheet.d$o r0 = (com.stripe.android.customersheet.d.o) r0
            int r1 = r0.f24698e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24698e = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$o r0 = new com.stripe.android.customersheet.d$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24696c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24698e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L9e
            if (r2 == r5) goto L92
            if (r2 != r4) goto L8a
            java.lang.Object r7 = r0.f24695b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r0 = r0.f24694a
            com.stripe.android.customersheet.d r0 = (com.stripe.android.customersheet.d) r0
            O5.t.b(r8)
            com.stripe.android.customersheet.a$b r8 = (com.stripe.android.customersheet.a.b) r8
            boolean r1 = r8 instanceof com.stripe.android.customersheet.a.b.c
            if (r1 == 0) goto L48
            r1 = r8
            com.stripe.android.customersheet.a$b$c r1 = (com.stripe.android.customersheet.a.b.c) r1
            java.lang.Object r1 = r1.a()
            com.stripe.android.model.o r1 = (com.stripe.android.model.o) r1
            F2.b r1 = r0.f24638h
            r1.i()
        L48:
            com.stripe.android.customersheet.a$b$b r1 = com.stripe.android.customersheet.b.a(r8)
            if (r1 == 0) goto L89
            java.lang.String r2 = r1.b()
            if (r2 != 0) goto L6a
            java.lang.Throwable r2 = r1.a()
            boolean r4 = r2 instanceof w2.AbstractC4144k
            if (r4 == 0) goto L5f
            r3 = r2
            w2.k r3 = (w2.AbstractC4144k) r3
        L5f:
            if (r3 == 0) goto L6a
            u2.f r2 = r3.d()
            if (r2 == 0) goto L6a
            r2.i()
        L6a:
            java.lang.Throwable r1 = r1.a()
            F2.b r2 = r0.f24638h
            r2.l()
            u2.d r0 = r0.f24636f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to detach payment method: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.a(r7, r1)
        L89:
            return r8
        L8a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L92:
            java.lang.Object r7 = r0.f24695b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r1 = r0.f24694a
            com.stripe.android.customersheet.d r1 = (com.stripe.android.customersheet.d) r1
            O5.t.b(r8)
            goto Laf
        L9e:
            O5.t.b(r8)
            r0.f24694a = r6
            r0.f24695b = r7
            r0.f24698e = r5
            java.lang.Object r8 = r6.v(r0)
            if (r8 != r1) goto Lae
            return r1
        Lae:
            r1 = r6
        Laf:
            android.support.v4.media.a.a(r8)
            java.lang.String r8 = r7.f25463a
            kotlin.jvm.internal.AbstractC3255y.f(r8)
            r0.f24694a = r1
            r0.f24695b = r7
            r0.f24698e = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.b0(com.stripe.android.model.o, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(com.stripe.android.model.o oVar) {
        ArrayList arrayList;
        C1970d c1970d;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z8;
        B3.f fVar;
        boolean z9;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f24647q.getValue();
        List d8 = eVar.d();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : d8) {
            String str = ((com.stripe.android.model.o) obj2).f25463a;
            AbstractC3255y.f(oVar.f25463a);
            if (!AbstractC3255y.d(str, r6)) {
                arrayList4.add(obj2);
            }
        }
        B3.f fVar2 = null;
        if (eVar instanceof e.d) {
            o6.w wVar = this.f24646p;
            while (true) {
                Object value = wVar.getValue();
                List<Object> list = (List) value;
                ArrayList arrayList5 = new ArrayList(AbstractC1378t.x(list, 10));
                for (Object obj3 : list) {
                    if (obj3 instanceof e.d) {
                        e.d dVar = (e.d) obj3;
                        B3.f fVar3 = this.f24631a;
                        if ((dVar.o() instanceof f.C0009f) && AbstractC3255y.d(((f.C0009f) dVar.o()).r().f25463a, oVar.f25463a)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if ((dVar.o() instanceof f.C0009f) && (fVar3 instanceof f.C0009f) && AbstractC3255y.d(((f.C0009f) dVar.o()).r().f25463a, ((f.C0009f) fVar3).r().f25463a)) {
                            this.f24631a = fVar2;
                        }
                        boolean a8 = E2.f.a(dVar.a(), arrayList4, dVar.c());
                        B3.f o8 = dVar.o();
                        if (z8) {
                            o8 = fVar2;
                        }
                        if (o8 == null) {
                            fVar = this.f24631a;
                        } else {
                            fVar = o8;
                        }
                        if (dVar.e() && a8) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        arrayList3 = arrayList5;
                        obj = value;
                        B3.f fVar4 = fVar;
                        arrayList2 = arrayList4;
                        obj3 = dVar.j((r32 & 1) != 0 ? dVar.f24753i : null, (r32 & 2) != 0 ? dVar.f24754j : arrayList4, (r32 & 4) != 0 ? dVar.f24755k : fVar4, (r32 & 8) != 0 ? dVar.f24756l : false, (r32 & 16) != 0 ? dVar.f24757m : false, (r32 & 32) != 0 ? dVar.f24758n : z9, (r32 & 64) != 0 ? dVar.f24759o : false, (r32 & 128) != 0 ? dVar.f24760p : false, (r32 & 256) != 0 ? dVar.f24761q : null, (r32 & 512) != 0 ? dVar.f24762r : false, (r32 & 1024) != 0 ? dVar.f24763s : false, (r32 & 2048) != 0 ? dVar.f24764t : null, (r32 & 4096) != 0 ? dVar.f24765u : null, (r32 & 8192) != 0 ? dVar.f24766v : null, (r32 & 16384) != 0 ? dVar.f24767w : null);
                    } else {
                        obj = value;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(obj3);
                    arrayList5 = arrayList3;
                    arrayList4 = arrayList2;
                    value = obj;
                    fVar2 = null;
                }
                arrayList = arrayList4;
                if (wVar.c(value, arrayList5)) {
                    break;
                }
                arrayList4 = arrayList;
                fVar2 = null;
            }
        } else {
            arrayList = arrayList4;
        }
        if (arrayList.isEmpty() && (c1970d = this.f24652v) != null && !c1970d.a0()) {
            i0(this, true, null, 2, null);
        }
    }

    private final void d0() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new p(null), 2, null);
    }

    private final void e0(f.C0009f c0009f) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new q(c0009f, null), 2, null);
    }

    private final void f0(com.stripe.android.customersheet.e eVar, boolean z8) {
        Object value;
        List H02;
        if (eVar instanceof e.a) {
            this.f24638h.n(b.EnumC0047b.f2735b);
        } else if (eVar instanceof e.d) {
            this.f24638h.n(b.EnumC0047b.f2736c);
        } else if (eVar instanceof e.b) {
            this.f24638h.n(b.EnumC0047b.f2737d);
        }
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List list = (List) value;
            if (z8) {
                H02 = AbstractC1378t.e(eVar);
            } else {
                H02 = AbstractC1378t.H0(list, eVar);
            }
        } while (!wVar.c(value, H02));
    }

    static /* synthetic */ void g0(d dVar, com.stripe.android.customersheet.e eVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        dVar.f0(eVar, z8);
    }

    private final void h0(boolean z8, InterfaceC2835a interfaceC2835a) {
        String str;
        List h02;
        StripeIntent stripeIntent;
        List m8;
        String str2;
        C1625g c1625g = this.f24651u;
        String str3 = null;
        if (c1625g == null || (str = c1625g.d()) == null) {
            C1970d c1970d = this.f24652v;
            if (c1970d != null && (h02 = c1970d.h0()) != null) {
                str = (String) AbstractC1378t.o0(h02);
            } else {
                str = null;
            }
            if (str == null) {
                str = o.p.f25587i.f25605a;
            }
        }
        String str4 = str;
        C4227b c4227b = C4227b.f41130a;
        E2.a aVar = this.f24635e;
        D3.a a8 = c4227b.a(str4, aVar, aVar.p(), interfaceC2835a);
        C1625g c1625g2 = this.f24651u;
        if (c1625g2 == null) {
            C1970d c1970d2 = this.f24652v;
            if (c1970d2 != null) {
                c1625g2 = c1970d2.g0(str4);
            } else {
                c1625g2 = null;
            }
            if (c1625g2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        C1970d c1970d3 = this.f24652v;
        if (c1970d3 != null) {
            stripeIntent = c1970d3.W();
        } else {
            stripeIntent = null;
        }
        C1970d c1970d4 = this.f24652v;
        if (c1970d4 == null || (m8 = c1970d4.l(c1625g2.d(), new InterfaceC1974h.a.InterfaceC0359a.C0360a(this.f24645o, null, x.f24710a, null, null, 24, null))) == null) {
            m8 = AbstractC1378t.m();
        }
        List list = m8;
        List list2 = this.f24653w;
        if (stripeIntent != null) {
            str2 = stripeIntent.getId();
        } else {
            str2 = null;
        }
        if (stripeIntent != null) {
            str3 = stripeIntent.d();
        }
        f0(new e.a(str4, list2, null, list, a8, new E3.d(false, null, false, false, false, str2, str3, "customer_sheet", null, null, new r(), new s(), new t(), new u(), v.f24708a, new w()), null, true, ((Boolean) this.f24640j.invoke()).booleanValue(), false, null, z8, B2.c.a(t3.w.f39774a0), false, null, null, false, false, null, interfaceC2835a, this.f24644n, 230400, null), z8);
    }

    static /* synthetic */ void i0(d dVar, boolean z8, InterfaceC2835a interfaceC2835a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2835a = ((com.stripe.android.customersheet.e) dVar.f24647q.getValue()).c();
        }
        dVar.h0(z8, interfaceC2835a);
    }

    private final void j0(List list, B3.f fVar, InterfaceC2835a interfaceC2835a) {
        C1970d c1970d;
        if (list.isEmpty() && (c1970d = this.f24652v) != null && !c1970d.a0()) {
            h0(true, interfaceC2835a);
        } else {
            f0(x(new y(list, fVar, interfaceC2835a)), true);
        }
    }

    private final void k0(Function1 function1) {
        Object value;
        ArrayList arrayList;
        boolean z8;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar = (e.a) obj;
                    PrimaryButton.b bVar = (PrimaryButton.b) function1.invoke(aVar.m());
                    if (bVar != null) {
                        obj = aVar.j((r39 & 1) != 0 ? aVar.f24728i : null, (r39 & 2) != 0 ? aVar.f24729j : null, (r39 & 4) != 0 ? aVar.f24730k : null, (r39 & 8) != 0 ? aVar.f24731l : null, (r39 & 16) != 0 ? aVar.f24732m : null, (r39 & 32) != 0 ? aVar.f24733n : null, (r39 & 64) != 0 ? aVar.f24734o : null, (r39 & 128) != 0 ? aVar.f24735p : false, (r39 & 256) != 0 ? aVar.f24736q : false, (r39 & 512) != 0 ? aVar.f24737r : false, (r39 & 1024) != 0 ? aVar.f24738s : null, (r39 & 2048) != 0 ? aVar.f24739t : false, (r39 & 4096) != 0 ? aVar.f24740u : null, (r39 & 8192) != 0 ? aVar.f24741v : bVar.c(), (r39 & 16384) != 0 ? aVar.f24742w : bVar, (r39 & 32768) != 0 ? aVar.f24743x : null, (r39 & 65536) != 0 ? aVar.f24744y : false, (r39 & 131072) != 0 ? aVar.f24745z : false, (r39 & 262144) != 0 ? aVar.f24725A : null, (r39 & 524288) != 0 ? aVar.f24726B : null, (r39 & 1048576) != 0 ? aVar.f24727C : null);
                    } else {
                        if (aVar.t() != null && !aVar.g()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        obj = aVar.j((r39 & 1) != 0 ? aVar.f24728i : null, (r39 & 2) != 0 ? aVar.f24729j : null, (r39 & 4) != 0 ? aVar.f24730k : null, (r39 & 8) != 0 ? aVar.f24731l : null, (r39 & 16) != 0 ? aVar.f24732m : null, (r39 & 32) != 0 ? aVar.f24733n : null, (r39 & 64) != 0 ? aVar.f24734o : null, (r39 & 128) != 0 ? aVar.f24735p : false, (r39 & 256) != 0 ? aVar.f24736q : false, (r39 & 512) != 0 ? aVar.f24737r : false, (r39 & 1024) != 0 ? aVar.f24738s : null, (r39 & 2048) != 0 ? aVar.f24739t : false, (r39 & 4096) != 0 ? aVar.f24740u : null, (r39 & 8192) != 0 ? aVar.f24741v : z8, (r39 & 16384) != 0 ? aVar.f24742w : null, (r39 & 32768) != 0 ? aVar.f24743x : null, (r39 & 65536) != 0 ? aVar.f24744y : false, (r39 & 131072) != 0 ? aVar.f24745z : false, (r39 & 262144) != 0 ? aVar.f24725A : null, (r39 & 524288) != 0 ? aVar.f24726B : null, (r39 & 1048576) != 0 ? aVar.f24727C : null);
                    }
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void l0(B2.b bVar, boolean z8) {
        Object value;
        ArrayList arrayList;
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f24728i : null, (r39 & 2) != 0 ? r6.f24729j : null, (r39 & 4) != 0 ? r6.f24730k : null, (r39 & 8) != 0 ? r6.f24731l : null, (r39 & 16) != 0 ? r6.f24732m : null, (r39 & 32) != 0 ? r6.f24733n : null, (r39 & 64) != 0 ? r6.f24734o : null, (r39 & 128) != 0 ? r6.f24735p : false, (r39 & 256) != 0 ? r6.f24736q : false, (r39 & 512) != 0 ? r6.f24737r : false, (r39 & 1024) != 0 ? r6.f24738s : null, (r39 & 2048) != 0 ? r6.f24739t : false, (r39 & 4096) != 0 ? r6.f24740u : null, (r39 & 8192) != 0 ? r6.f24741v : false, (r39 & 16384) != 0 ? r6.f24742w : null, (r39 & 32768) != 0 ? r6.f24743x : bVar, (r39 & 65536) != 0 ? r6.f24744y : z8, (r39 & 131072) != 0 ? r6.f24745z : false, (r39 & 262144) != 0 ? r6.f24725A : null, (r39 & 524288) != 0 ? r6.f24726B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f24727C : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    private final void m0(com.stripe.android.model.o oVar) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new z(oVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(com.stripe.android.model.o oVar) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), this.f24639i, null, new c(oVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(S5.d dVar) {
        return this.f24633c.D(dVar);
    }

    private final e.d x(Function1 function1) {
        boolean z8;
        InterfaceC2835a interfaceC2835a;
        String l8 = this.f24635e.l();
        List m8 = AbstractC1378t.m();
        boolean booleanValue = ((Boolean) this.f24640j.invoke()).booleanValue();
        C1970d c1970d = this.f24652v;
        if (c1970d != null && c1970d.a0()) {
            z8 = true;
        } else {
            z8 = false;
        }
        String string = this.f24634d.getString(t3.w.f39752F);
        C1970d c1970d2 = this.f24652v;
        if (c1970d2 == null || (interfaceC2835a = c1970d2.w()) == null) {
            interfaceC2835a = InterfaceC2835a.c.f31958a;
        }
        return (e.d) function1.invoke(new e.d(l8, m8, null, booleanValue, false, false, z8, false, string, this.f24635e.a(), true, null, null, null, interfaceC2835a, 12288, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(B3.f fVar, String str) {
        if (str != null) {
            this.f24638h.k(str);
        }
        this.f24648r.e(new i.d(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(B3.f fVar, String str, Throwable th, String str2) {
        Object value;
        ArrayList arrayList;
        if (str != null) {
            this.f24638h.f(str);
        }
        this.f24636f.a("Failed to persist payment selection: " + fVar, th);
        o6.w wVar = this.f24646p;
        do {
            value = wVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.d) {
                    obj = r7.j((r32 & 1) != 0 ? r7.f24753i : null, (r32 & 2) != 0 ? r7.f24754j : null, (r32 & 4) != 0 ? r7.f24755k : null, (r32 & 8) != 0 ? r7.f24756l : false, (r32 & 16) != 0 ? r7.f24757m : false, (r32 & 32) != 0 ? r7.f24758n : false, (r32 & 64) != 0 ? r7.f24759o : false, (r32 & 128) != 0 ? r7.f24760p : false, (r32 & 256) != 0 ? r7.f24761q : null, (r32 & 512) != 0 ? r7.f24762r : false, (r32 & 1024) != 0 ? r7.f24763s : false, (r32 & 2048) != 0 ? r7.f24764t : str2, (r32 & 4096) != 0 ? r7.f24765u : null, (r32 & 8192) != 0 ? r7.f24766v : null, (r32 & 16384) != 0 ? ((e.d) obj).f24767w : null);
                }
                arrayList.add(obj);
            }
        } while (!wVar.c(value, arrayList));
    }

    public final InterfaceC3698L D() {
        return this.f24649s;
    }

    public final InterfaceC3698L E() {
        return this.f24647q;
    }

    public final void H(com.stripe.android.customersheet.c viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof c.h) {
            R();
            return;
        }
        if (viewAction instanceof c.a) {
            K();
            return;
        }
        if (viewAction instanceof c.e) {
            O();
            return;
        }
        if (viewAction instanceof c.C0458c) {
            M();
            return;
        }
        if (viewAction instanceof c.i) {
            S();
            return;
        }
        if (viewAction instanceof c.l) {
            V(((c.l) viewAction).a());
            return;
        }
        if (viewAction instanceof c.n) {
            X(((c.n) viewAction).a());
            return;
        }
        if (viewAction instanceof c.m) {
            W(((c.m) viewAction).a());
            return;
        }
        if (viewAction instanceof c.o) {
            Y();
            return;
        }
        if (viewAction instanceof c.b) {
            L(((c.b) viewAction).a());
            return;
        }
        if (viewAction instanceof c.k) {
            U(((c.k) viewAction).a());
            return;
        }
        if (viewAction instanceof c.p) {
            k0(((c.p) viewAction).a());
            return;
        }
        if (viewAction instanceof c.q) {
            c.q qVar = (c.q) viewAction;
            l0(qVar.a(), qVar.b());
            return;
        }
        if (viewAction instanceof c.f) {
            P(((c.f) viewAction).a());
            return;
        }
        if (viewAction instanceof c.g) {
            Q(((c.g) viewAction).a());
        } else if (viewAction instanceof c.j) {
            T(((c.j) viewAction).a());
        } else if (viewAction instanceof c.d) {
            N();
        }
    }

    public final B2.b Z(String str) {
        C1625g c1625g;
        B2.b bVar = null;
        if (str != null) {
            C1970d c1970d = this.f24652v;
            if (c1970d != null) {
                c1625g = c1970d.g0(str);
            } else {
                c1625g = null;
            }
            if (c1625g != null) {
                bVar = c1625g.f();
            }
        }
        return B2.c.c(bVar);
    }

    public final void a0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(lifecycleOwner, "lifecycleOwner");
        this.f24650t.P(activityResultCaller, lifecycleOwner);
    }

    public final boolean w() {
        Object value;
        ArrayList arrayList;
        if (((com.stripe.android.customersheet.e) this.f24647q.getValue()).h(this.f24642l)) {
            o6.w wVar = this.f24646p;
            do {
                value = wVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                for (Object obj : list) {
                    if (obj instanceof e.a) {
                        obj = r7.j((r39 & 1) != 0 ? r7.f24728i : null, (r39 & 2) != 0 ? r7.f24729j : null, (r39 & 4) != 0 ? r7.f24730k : null, (r39 & 8) != 0 ? r7.f24731l : null, (r39 & 16) != 0 ? r7.f24732m : null, (r39 & 32) != 0 ? r7.f24733n : null, (r39 & 64) != 0 ? r7.f24734o : null, (r39 & 128) != 0 ? r7.f24735p : false, (r39 & 256) != 0 ? r7.f24736q : false, (r39 & 512) != 0 ? r7.f24737r : false, (r39 & 1024) != 0 ? r7.f24738s : null, (r39 & 2048) != 0 ? r7.f24739t : false, (r39 & 4096) != 0 ? r7.f24740u : null, (r39 & 8192) != 0 ? r7.f24741v : false, (r39 & 16384) != 0 ? r7.f24742w : null, (r39 & 32768) != 0 ? r7.f24743x : null, (r39 & 65536) != 0 ? r7.f24744y : false, (r39 & 131072) != 0 ? r7.f24745z : true, (r39 & 262144) != 0 ? r7.f24725A : null, (r39 & 524288) != 0 ? r7.f24726B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f24727C : null);
                    }
                    arrayList.add(obj);
                }
            } while (!wVar.c(value, arrayList));
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Application application, List initialBackStack, B3.f fVar, L5.a paymentConfigurationProvider, Resources resources, E2.a configuration, InterfaceC4057d logger, h3.m stripeRepository, F2.b eventReporter, S5.g workContext, Function0 isLiveModeProvider, e.d intentConfirmationHandlerFactory, E2.b customerSheetLoader, r3.d isFinancialConnectionsAvailable, InterfaceC1324t.a editInteractorFactory, n3.i errorReporter) {
        this(application, initialBackStack, fVar, paymentConfigurationProvider, I2.a.f3980a.a(), resources, configuration, logger, stripeRepository, eventReporter, workContext, isLiveModeProvider, intentConfirmationHandlerFactory, customerSheetLoader, isFinancialConnectionsAvailable, editInteractorFactory, errorReporter);
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(initialBackStack, "initialBackStack");
        AbstractC3255y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3255y.i(resources, "resources");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3255y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3255y.i(customerSheetLoader, "customerSheetLoader");
        AbstractC3255y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3255y.i(errorReporter, "errorReporter");
    }
}
