package com.stripe.android.customersheet;

import C2.b;
import J3.AbstractC1195c;
import J3.InterfaceC1206n;
import J3.InterfaceC1211t;
import L5.I;
import L5.s;
import M5.AbstractC1246t;
import Y2.h;
import android.app.Application;
import android.content.res.Resources;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.EnumC1870e;
import c4.InterfaceC1925a;
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
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import i6.N;
import i6.U;
import i6.X;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import p2.AbstractC3598a;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;
import w3.C3847b;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC3991f f23576a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f23577b;

    /* renamed from: c, reason: collision with root package name */
    private final U f23578c;

    /* renamed from: d, reason: collision with root package name */
    private final Resources f23579d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.a f23580e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3684d f23581f;

    /* renamed from: g, reason: collision with root package name */
    private final e3.m f23582g;

    /* renamed from: h, reason: collision with root package name */
    private final C2.b f23583h;

    /* renamed from: i, reason: collision with root package name */
    private final P5.g f23584i;

    /* renamed from: j, reason: collision with root package name */
    private final Function0 f23585j;

    /* renamed from: k, reason: collision with root package name */
    private final B2.b f23586k;

    /* renamed from: l, reason: collision with root package name */
    private final o3.d f23587l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC1211t.a f23588m;

    /* renamed from: n, reason: collision with root package name */
    private final k3.i f23589n;

    /* renamed from: o, reason: collision with root package name */
    private final l2.j f23590o;

    /* renamed from: p, reason: collision with root package name */
    private final l6.v f23591p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f23592q;

    /* renamed from: r, reason: collision with root package name */
    private final l6.v f23593r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3349K f23594s;

    /* renamed from: t, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.e f23595t;

    /* renamed from: u, reason: collision with root package name */
    private X2.g f23596u;

    /* renamed from: v, reason: collision with root package name */
    private Y2.d f23597v;

    /* renamed from: w, reason: collision with root package name */
    private List f23598w;

    /* loaded from: classes4.dex */
    static final class A extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f23599a = new A();

        A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.customersheet.e invoke(List it) {
            AbstractC3159y.i(it, "it");
            return (com.stripe.android.customersheet.e) AbstractC1246t.y0(it);
        }
    }

    /* renamed from: com.stripe.android.customersheet.d$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    static final class C2406a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23600a;

        C2406a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C2406a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C2406a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23600a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                d dVar = d.this;
                this.f23600a = 1;
                if (dVar.I(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CustomerSheetContract.a f23602a;

        public b(CustomerSheetContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f23602a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            d a8 = D2.z.a().b(A2.b.a(extras)).c(this.f23602a.b()).d(this.f23602a.c()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
            return a8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23603a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f23605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.stripe.android.model.o oVar, P5.d dVar) {
            super(2, dVar);
            this.f23605c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f23605c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23603a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        L5.t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                d dVar = d.this;
                this.f23603a = 1;
                obj = dVar.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.customersheet.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0463d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23606a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f23608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0463d(com.stripe.android.model.p pVar, P5.d dVar) {
            super(2, dVar);
            this.f23608c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0463d(this.f23608c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0463d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            ArrayList arrayList;
            boolean z8;
            Object e8 = Q5.b.e();
            int i8 = this.f23606a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    obj2 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                d dVar = d.this;
                com.stripe.android.model.p pVar = this.f23608c;
                this.f23606a = 1;
                Object B8 = dVar.B(pVar, this);
                if (B8 == e8) {
                    return e8;
                }
                obj2 = B8;
            }
            d dVar2 = d.this;
            if (L5.s.h(obj2)) {
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) obj2;
                if (!F2.c.a(oVar)) {
                    dVar2.u(oVar);
                } else {
                    dVar2.f23593r.d(new i.d(new AbstractC3991f.C0916f(oVar, null, null, 6, null)));
                }
            }
            d dVar3 = d.this;
            com.stripe.android.model.p pVar2 = this.f23608c;
            Throwable e9 = L5.s.e(obj2);
            if (e9 != null) {
                dVar3.f23581f.a("Failed to create payment method for " + pVar2.o(), e9);
                l6.v vVar = dVar3.f23591p;
                do {
                    value = vVar.getValue();
                    List<Object> list = (List) value;
                    arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                    for (Object obj3 : list) {
                        if (obj3 instanceof e.a) {
                            e.a aVar = (e.a) obj3;
                            InterfaceC3983b a8 = AbstractC3598a.a(e9);
                            if (aVar.t() != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            obj3 = aVar.j((r39 & 1) != 0 ? aVar.f23673i : null, (r39 & 2) != 0 ? aVar.f23674j : null, (r39 & 4) != 0 ? aVar.f23675k : null, (r39 & 8) != 0 ? aVar.f23676l : null, (r39 & 16) != 0 ? aVar.f23677m : null, (r39 & 32) != 0 ? aVar.f23678n : null, (r39 & 64) != 0 ? aVar.f23679o : null, (r39 & 128) != 0 ? aVar.f23680p : false, (r39 & 256) != 0 ? aVar.f23681q : false, (r39 & 512) != 0 ? aVar.f23682r : false, (r39 & 1024) != 0 ? aVar.f23683s : a8, (r39 & 2048) != 0 ? aVar.f23684t : false, (r39 & 4096) != 0 ? aVar.f23685u : null, (r39 & 8192) != 0 ? aVar.f23686v : z8, (r39 & 16384) != 0 ? aVar.f23687w : null, (r39 & 32768) != 0 ? aVar.f23688x : null, (r39 & 65536) != 0 ? aVar.f23689y : false, (r39 & 131072) != 0 ? aVar.f23690z : false, (r39 & 262144) != 0 ? aVar.f23670A : null, (r39 & 524288) != 0 ? aVar.f23671B : null, (r39 & 1048576) != 0 ? aVar.f23672C : null);
                        }
                        arrayList.add(obj3);
                    }
                } while (!vVar.a(value, arrayList));
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f23609a;

        /* renamed from: c, reason: collision with root package name */
        int f23611c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23609a = obj;
            this.f23611c |= Integer.MIN_VALUE;
            Object B8 = d.this.B(null, this);
            return B8 == Q5.b.e() ? B8 : L5.s.a(B8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23612a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f23614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.model.o oVar, P5.d dVar) {
            super(2, dVar);
            this.f23614c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f23614c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23612a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                this.f23612a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            d.this.c0(this.f23614c);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23615a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23616b;

        /* renamed from: d, reason: collision with root package name */
        int f23618d;

        g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23616b = obj;
            this.f23618d |= Integer.MIN_VALUE;
            return d.this.I(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23619a;

        h(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f23619a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    a8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                B2.b bVar = d.this.f23586k;
                B2.a aVar = d.this.f23580e;
                this.f23619a = 1;
                a8 = bVar.a(aVar, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            return L5.s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23621a;

        /* renamed from: b, reason: collision with root package name */
        Object f23622b;

        /* renamed from: c, reason: collision with root package name */
        Object f23623c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f23624d;

        /* renamed from: f, reason: collision with root package name */
        int f23626f;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23624d = obj;
            this.f23626f |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f23627a = new j();

        j() {
            super(1);
        }

        public final void a(T2.e it) {
            AbstractC3159y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T2.e) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23628a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f23630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.model.o oVar, P5.d dVar) {
            super(2, dVar);
            this.f23630c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new k(this.f23630c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f23628a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                d dVar = d.this;
                com.stripe.android.model.o oVar = this.f23630c;
                this.f23628a = 1;
                obj = dVar.b0(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            a.b bVar = (a.b) obj;
            d dVar2 = d.this;
            if (bVar instanceof a.b.C0461b) {
                a.b.C0461b c0461b = (a.b.C0461b) bVar;
                c0461b.a();
                dVar2.F(c0461b.b());
            } else if (bVar instanceof a.b.c) {
                dVar2.c0((com.stripe.android.model.o) ((a.b.c) bVar).a());
            } else {
                throw new L5.p();
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {
        l() {
            super(1);
        }

        public final void a(InterfaceC1206n.a event) {
            AbstractC3159y.i(event, "event");
            if (event instanceof InterfaceC1206n.a.b) {
                d.this.f23583h.o(b.a.f1222b, ((InterfaceC1206n.a.b) event).a());
            } else if (event instanceof InterfaceC1206n.a.C0106a) {
                d.this.f23583h.g(b.a.f1222b, ((InterfaceC1206n.a.C0106a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1206n.a) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23632a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23633b;

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            m mVar = new m(dVar);
            mVar.f23633b = obj;
            return mVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, P5.d dVar) {
            return ((m) create(oVar, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o oVar;
            Object e8 = Q5.b.e();
            int i8 = this.f23632a;
            if (i8 != 0) {
                if (i8 == 1) {
                    oVar = (com.stripe.android.model.o) this.f23633b;
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                com.stripe.android.model.o oVar2 = (com.stripe.android.model.o) this.f23633b;
                d dVar = d.this;
                this.f23633b = oVar2;
                this.f23632a = 1;
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
            a.b.C0461b a8 = com.stripe.android.customersheet.b.a(bVar);
            if (a8 != null) {
                return a8.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f23635a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23636b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23637c;

        n(P5.d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC1870e enumC1870e, P5.d dVar) {
            n nVar = new n(dVar);
            nVar.f23636b = oVar;
            nVar.f23637c = enumC1870e;
            return nVar.invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f23635a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f23636b;
                EnumC1870e enumC1870e = (EnumC1870e) this.f23637c;
                d dVar = d.this;
                this.f23636b = null;
                this.f23635a = 1;
                obj = dVar.J(oVar, enumC1870e, this);
                if (obj == e8) {
                    return e8;
                }
            }
            a.b bVar = (a.b) obj;
            if (bVar instanceof a.b.c) {
                s.a aVar = L5.s.f6511b;
                b8 = L5.s.b(((a.b.c) bVar).a());
            } else if (bVar instanceof a.b.C0461b) {
                s.a aVar2 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(((a.b.C0461b) bVar).a()));
            } else {
                throw new L5.p();
            }
            return L5.s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23639a;

        /* renamed from: b, reason: collision with root package name */
        Object f23640b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f23641c;

        /* renamed from: e, reason: collision with root package name */
        int f23643e;

        o(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23641c = obj;
            this.f23643e |= Integer.MIN_VALUE;
            return d.this.b0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23644a;

        p(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new p(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3790k abstractC3790k;
            r2.f d8;
            Object e8 = Q5.b.e();
            int i8 = this.f23644a;
            String str = null;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        a.b bVar = (a.b) obj;
                        d dVar = d.this;
                        if (bVar instanceof a.b.c) {
                            dVar.y(AbstractC3991f.c.f39776a, "google_pay");
                        }
                        d dVar2 = d.this;
                        a.b.C0461b a8 = com.stripe.android.customersheet.b.a(bVar);
                        if (a8 != null) {
                            String b8 = a8.b();
                            if (b8 == null) {
                                Throwable a9 = a8.a();
                                if (a9 instanceof AbstractC3790k) {
                                    abstractC3790k = (AbstractC3790k) a9;
                                } else {
                                    abstractC3790k = null;
                                }
                                if (abstractC3790k != null && (d8 = abstractC3790k.d()) != null) {
                                    str = d8.j();
                                }
                            } else {
                                str = b8;
                            }
                            dVar2.z(AbstractC3991f.c.f39776a, "google_pay", a8.a(), str);
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                d dVar3 = d.this;
                this.f23644a = 1;
                obj = dVar3.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            a.AbstractC0458a.b bVar2 = a.AbstractC0458a.b.f23549c;
            this.f23644a = 2;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23646a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3991f.C0916f f23648c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AbstractC3991f.C0916f c0916f, P5.d dVar) {
            super(2, dVar);
            this.f23648c = c0916f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new q(this.f23648c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.stripe.android.model.o v8;
            o.p pVar;
            AbstractC3790k abstractC3790k;
            r2.f d8;
            String str;
            com.stripe.android.model.o v9;
            o.p pVar2;
            Object e8 = Q5.b.e();
            int i8 = this.f23646a;
            String str2 = null;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        a.b bVar = (a.b) obj;
                        d dVar = d.this;
                        AbstractC3991f.C0916f c0916f = this.f23648c;
                        if (bVar instanceof a.b.c) {
                            if (c0916f != null && (v9 = c0916f.v()) != null && (pVar2 = v9.f24412e) != null) {
                                str = pVar2.f24550a;
                            } else {
                                str = null;
                            }
                            dVar.y(c0916f, str);
                        }
                        d dVar2 = d.this;
                        AbstractC3991f.C0916f c0916f2 = this.f23648c;
                        a.b.C0461b a8 = com.stripe.android.customersheet.b.a(bVar);
                        if (a8 != null) {
                            String b8 = a8.b();
                            if (b8 == null) {
                                Throwable a9 = a8.a();
                                if (a9 instanceof AbstractC3790k) {
                                    abstractC3790k = (AbstractC3790k) a9;
                                } else {
                                    abstractC3790k = null;
                                }
                                if (abstractC3790k != null && (d8 = abstractC3790k.d()) != null) {
                                    b8 = d8.j();
                                } else {
                                    b8 = null;
                                }
                            }
                            Throwable a10 = a8.a();
                            if (c0916f2 != null && (v8 = c0916f2.v()) != null && (pVar = v8.f24412e) != null) {
                                str2 = pVar.f24550a;
                            }
                            dVar2.z(c0916f2, str2, a10, b8);
                        }
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                d dVar3 = d.this;
                this.f23646a = 1;
                obj = dVar3.v(this);
                if (obj == e8) {
                    return e8;
                }
            }
            android.support.v4.media.a.a(obj);
            AbstractC3991f.C0916f c0916f3 = this.f23648c;
            if (c0916f3 != null) {
                a.AbstractC0458a.f23547b.a(c0916f3);
            }
            this.f23646a = 2;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3160z implements X5.n {
        r() {
            super(2);
        }

        public final void a(InterfaceC3983b interfaceC3983b, boolean z8) {
            d.this.H(new c.q(interfaceC3983b, z8));
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3983b) obj, ((Boolean) obj2).booleanValue());
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3160z implements Function1 {
        s() {
            super(1);
        }

        public final void a(AbstractC3991f.e.d it) {
            AbstractC3159y.i(it, "it");
            d.this.H(new c.g(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC3991f.e.d) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3160z implements Function1 {
        t() {
            super(1);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.d it) {
            AbstractC3159y.i(it, "it");
            d.this.H(new c.f(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3160z implements Function1 {
        u() {
            super(1);
        }

        public final void a(Function1 it) {
            AbstractC3159y.i(it, "it");
            d.this.H(new c.p(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Function1) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final v f23653a = new v();

        v() {
            super(1);
        }

        public final void a(PrimaryButton.a it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PrimaryButton.a) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3160z implements Function1 {
        w() {
            super(1);
        }

        public final void a(InterfaceC3983b interfaceC3983b) {
            d.this.H(new c.j(interfaceC3983b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3983b) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f23655a = new x();

        x() {
            super(1);
        }

        public final void a(T2.e it) {
            AbstractC3159y.i(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T2.e) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f23656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3991f f23657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1925a f23658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(List list, AbstractC3991f abstractC3991f, InterfaceC1925a interfaceC1925a) {
            super(1);
            this.f23656a = list;
            this.f23657b = abstractC3991f;
            this.f23658c = interfaceC1925a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.d invoke(e.d it) {
            AbstractC3159y.i(it, "it");
            return e.d.k(it, null, this.f23656a, this.f23657b, false, false, false, false, false, null, false, false, null, null, null, this.f23658c, 16377, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f23659a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.o f23661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(com.stripe.android.model.o oVar, P5.d dVar) {
            super(2, dVar);
            this.f23661c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new z(this.f23661c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((z) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l6.v vVar;
            ArrayList arrayList;
            Object obj2;
            ArrayList arrayList2;
            boolean z8;
            AbstractC3991f abstractC3991f;
            Q5.b.e();
            if (this.f23659a == 0) {
                L5.t.b(obj);
                List<com.stripe.android.model.o> d8 = ((com.stripe.android.customersheet.e) d.this.E().getValue()).d();
                com.stripe.android.model.o oVar = this.f23661c;
                int i8 = 10;
                ArrayList arrayList3 = new ArrayList(AbstractC1246t.x(d8, 10));
                for (com.stripe.android.model.o oVar2 : d8) {
                    String str = oVar2.f24408a;
                    String str2 = oVar.f24408a;
                    if (str2 != null && str != null && AbstractC3159y.d(str2, str)) {
                        oVar2 = oVar;
                    }
                    arrayList3.add(oVar2);
                }
                d dVar = d.this;
                com.stripe.android.model.o oVar3 = this.f23661c;
                l6.v vVar2 = dVar.f23591p;
                while (true) {
                    Object value = vVar2.getValue();
                    List<Object> list = (List) value;
                    ArrayList arrayList4 = new ArrayList(AbstractC1246t.x(list, i8));
                    for (Object obj3 : list) {
                        if (obj3 instanceof e.d) {
                            e.d dVar2 = (e.d) obj3;
                            AbstractC3991f abstractC3991f2 = dVar.f23576a;
                            AbstractC3991f o8 = dVar2.o();
                            boolean z9 = o8 instanceof AbstractC3991f.C0916f;
                            if (z9) {
                                AbstractC3991f.C0916f c0916f = (AbstractC3991f.C0916f) o8;
                                if (AbstractC3159y.d(c0916f.v().f24408a, oVar3.f24408a)) {
                                    z8 = z9;
                                    abstractC3991f = AbstractC3991f.C0916f.f(c0916f, oVar3, null, null, 6, null);
                                    if (z8 && (abstractC3991f2 instanceof AbstractC3991f.C0916f) && AbstractC3159y.d(((AbstractC3991f.C0916f) o8).v().f24408a, oVar3.f24408a)) {
                                        abstractC3991f2 = AbstractC3991f.C0916f.f((AbstractC3991f.C0916f) abstractC3991f2, oVar3, null, null, 6, null);
                                    }
                                    dVar.f23576a = abstractC3991f2;
                                    obj2 = value;
                                    vVar = vVar2;
                                    arrayList = arrayList3;
                                    obj3 = e.d.k(dVar2, null, arrayList3, abstractC3991f, false, false, false, false, false, null, false, false, null, null, null, null, 32761, null);
                                    arrayList2 = arrayList4;
                                }
                            }
                            z8 = z9;
                            abstractC3991f = o8;
                            if (z8) {
                                abstractC3991f2 = AbstractC3991f.C0916f.f((AbstractC3991f.C0916f) abstractC3991f2, oVar3, null, null, 6, null);
                            }
                            dVar.f23576a = abstractC3991f2;
                            obj2 = value;
                            vVar = vVar2;
                            arrayList = arrayList3;
                            obj3 = e.d.k(dVar2, null, arrayList3, abstractC3991f, false, false, false, false, false, null, false, false, null, null, null, null, 32761, null);
                            arrayList2 = arrayList4;
                        } else {
                            vVar = vVar2;
                            arrayList = arrayList3;
                            obj2 = value;
                            arrayList2 = arrayList4;
                        }
                        arrayList2.add(obj3);
                        arrayList4 = arrayList2;
                        value = obj2;
                        vVar2 = vVar;
                        arrayList3 = arrayList;
                    }
                    l6.v vVar3 = vVar2;
                    ArrayList arrayList5 = arrayList3;
                    if (vVar3.a(value, arrayList4)) {
                        return I.f6487a;
                    }
                    vVar2 = vVar3;
                    arrayList3 = arrayList5;
                    i8 = 10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public d(Application application, List initialBackStack, AbstractC3991f abstractC3991f, I5.a paymentConfigurationProvider, U customerAdapterProvider, Resources resources, B2.a configuration, InterfaceC3684d logger, e3.m stripeRepository, C2.b eventReporter, P5.g workContext, Function0 isLiveModeProvider, e.d intentConfirmationHandlerFactory, B2.b customerSheetLoader, o3.d isFinancialConnectionsAvailable, InterfaceC1211t.a editInteractorFactory, k3.i errorReporter) {
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(initialBackStack, "initialBackStack");
        AbstractC3159y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3159y.i(customerAdapterProvider, "customerAdapterProvider");
        AbstractC3159y.i(resources, "resources");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3159y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3159y.i(customerSheetLoader, "customerSheetLoader");
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f23576a = abstractC3991f;
        this.f23577b = paymentConfigurationProvider;
        this.f23578c = customerAdapterProvider;
        this.f23579d = resources;
        this.f23580e = configuration;
        this.f23581f = logger;
        this.f23582g = stripeRepository;
        this.f23583h = eventReporter;
        this.f23584i = workContext;
        this.f23585j = isLiveModeProvider;
        this.f23586k = customerSheetLoader;
        this.f23587l = isFinancialConnectionsAvailable;
        this.f23588m = editInteractorFactory;
        this.f23589n = errorReporter;
        this.f23590o = new l2.j(application);
        l6.v a8 = AbstractC3351M.a(initialBackStack);
        this.f23591p = a8;
        InterfaceC3349K m8 = v4.g.m(a8, A.f23599a);
        this.f23592q = m8;
        l6.v a9 = AbstractC3351M.a(null);
        this.f23593r = a9;
        this.f23594s = a9;
        this.f23595t = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        this.f23598w = new ArrayList();
        com.stripe.android.paymentsheet.v.a(configuration.c());
        eventReporter.f(configuration);
        if (m8.getValue() instanceof e.c) {
            AbstractC2829k.d(ViewModelKt.getViewModelScope(this), workContext, null, new C2406a(null), 2, null);
        }
    }

    private final void A(com.stripe.android.model.p pVar) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new C0463d(pVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(com.stripe.android.model.p r11, P5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.customersheet.d.e
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.customersheet.d$e r0 = (com.stripe.android.customersheet.d.e) r0
            int r1 = r0.f23611c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23611c = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$e r0 = new com.stripe.android.customersheet.d$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23609a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23611c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r12)
            L5.s r12 = (L5.s) r12
            java.lang.Object r11 = r12.k()
            goto L66
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            L5.t.b(r12)
            e3.m r12 = r10.f23582g
            x2.j$c r2 = new x2.j$c
            I5.a r4 = r10.f23577b
            java.lang.Object r4 = r4.get()
            j2.r r4 = (j2.r) r4
            java.lang.String r5 = r4.e()
            I5.a r4 = r10.f23577b
            java.lang.Object r4 = r4.get()
            j2.r r4 = (j2.r) r4
            java.lang.String r6 = r4.f()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f23611c = r3
            java.lang.Object r11 = r12.B(r11, r2, r0)
            if (r11 != r1) goto L66
            return r1
        L66:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.B(com.stripe.android.model.p, P5.d):java.lang.Object");
    }

    private final b.EnumC0023b C(com.stripe.android.customersheet.e eVar) {
        if (eVar instanceof e.a) {
            return b.EnumC0023b.f1225b;
        }
        if (eVar instanceof e.d) {
            return b.EnumC0023b.f1226c;
        }
        if (eVar instanceof e.b) {
            return b.EnumC0023b.f1227d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        Object value;
        ArrayList arrayList;
        if (this.f23592q.getValue() instanceof e.d) {
            l6.v vVar = this.f23591p;
            do {
                value = vVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                for (Object obj : list) {
                    if (obj instanceof e.d) {
                        obj = e.d.k((e.d) obj, null, null, null, false, false, false, false, false, null, false, false, str, null, null, null, 30703, null);
                    }
                    arrayList.add(obj);
                }
            } while (!vVar.a(value, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(com.stripe.android.model.o oVar) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new f(oVar, null), 2, null);
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
    public final java.lang.Object I(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.customersheet.d.g
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.customersheet.d$g r0 = (com.stripe.android.customersheet.d.g) r0
            int r1 = r0.f23618d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23618d = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$g r0 = new com.stripe.android.customersheet.d$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23616b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23618d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f23615a
            com.stripe.android.customersheet.d r0 = (com.stripe.android.customersheet.d) r0
            L5.t.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            L5.t.b(r6)
            P5.g r6 = r5.f23584i
            com.stripe.android.customersheet.d$h r2 = new com.stripe.android.customersheet.d$h
            r4 = 0
            r2.<init>(r4)
            r0.f23615a = r5
            r0.f23618d = r3
            java.lang.Object r6 = i6.AbstractC2825i.g(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            L5.s r6 = (L5.s) r6
            java.lang.Object r6 = r6.k()
            java.lang.Throwable r1 = L5.s.e(r6)
            if (r1 != 0) goto La9
            B2.d r6 = (B2.d) r6
            java.lang.Throwable r1 = r6.e()
            if (r1 == 0) goto L79
            l6.v r1 = r0.f23593r
        L62:
            java.lang.Object r0 = r1.getValue()
            r2 = r0
            com.stripe.android.customersheet.i r2 = (com.stripe.android.customersheet.i) r2
            com.stripe.android.customersheet.i$c r2 = new com.stripe.android.customersheet.i$c
            java.lang.Throwable r3 = r6.e()
            r2.<init>(r3)
            boolean r0 = r1.a(r0, r2)
            if (r0 == 0) goto L62
            goto Lbd
        L79:
            java.util.List r1 = r0.f23598w
            r1.clear()
            java.util.List r1 = r0.f23598w
            java.util.List r2 = r6.d()
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            y3.f r1 = r6.c()
            r0.f23576a = r1
            Y2.d r1 = r6.b()
            r0.f23597v = r1
            java.util.List r1 = r6.a()
            y3.f r2 = r6.c()
            Y2.d r6 = r6.b()
            c4.a r6 = r6.u()
            r0.j0(r1, r2, r6)
            goto Lbd
        La9:
            l6.v r6 = r0.f23593r
        Lab:
            java.lang.Object r0 = r6.getValue()
            r2 = r0
            com.stripe.android.customersheet.i r2 = (com.stripe.android.customersheet.i) r2
            com.stripe.android.customersheet.i$c r2 = new com.stripe.android.customersheet.i$c
            r2.<init>(r1)
            boolean r0 = r6.a(r0, r2)
            if (r0 == 0) goto Lab
        Lbd:
            L5.I r6 = L5.I.f6487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.I(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(com.stripe.android.model.o r19, b3.EnumC1870e r20, P5.d r21) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.J(com.stripe.android.model.o, b3.e, P5.d):java.lang.Object");
    }

    private final void K() {
        i0(this, false, null, 2, null);
    }

    private final void L(X2.g gVar) {
        e.a aVar;
        Object value;
        ArrayList arrayList;
        List m8;
        InterfaceC3983b a8;
        InterfaceC3983b interfaceC3983b;
        boolean z8;
        Object value2 = this.f23592q.getValue();
        if (value2 instanceof e.a) {
            aVar = (e.a) value2;
        } else {
            aVar = null;
        }
        if (aVar != null && AbstractC3159y.d(aVar.v(), gVar.d())) {
            return;
        }
        this.f23583h.e(gVar.d());
        this.f23596u = gVar;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar2 = (e.a) obj;
                    String d8 = gVar.d();
                    C3847b c3847b = C3847b.f39007a;
                    String d9 = gVar.d();
                    B2.a aVar3 = this.f23580e;
                    A3.a a9 = c3847b.a(d9, aVar3, aVar3.k(), aVar2.c());
                    Y2.d dVar = this.f23597v;
                    if (dVar == null || (m8 = dVar.j(gVar.d(), new h.a.InterfaceC0245a.C0246a(this.f23590o, null, j.f23627a, null, null, 24, null))) == null) {
                        m8 = AbstractC1246t.m();
                    }
                    List list2 = m8;
                    if (AbstractC3159y.d(gVar.d(), o.p.f24522O.f24550a) && !(aVar2.l() instanceof d.b)) {
                        a8 = AbstractC3984c.a(b4.n.f14742o);
                    } else {
                        a8 = AbstractC3984c.a(q3.w.f37452a0);
                    }
                    InterfaceC3983b interfaceC3983b2 = a8;
                    AbstractC3991f o8 = aVar2.o();
                    if (o8 != null) {
                        interfaceC3983b = o8.c(this.f23580e.k(), true);
                    } else {
                        interfaceC3983b = null;
                    }
                    if (aVar2.t() != null && !aVar2.g()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = aVar2.j((r39 & 1) != 0 ? aVar2.f23673i : d8, (r39 & 2) != 0 ? aVar2.f23674j : null, (r39 & 4) != 0 ? aVar2.f23675k : null, (r39 & 8) != 0 ? aVar2.f23676l : list2, (r39 & 16) != 0 ? aVar2.f23677m : a9, (r39 & 32) != 0 ? aVar2.f23678n : null, (r39 & 64) != 0 ? aVar2.f23679o : null, (r39 & 128) != 0 ? aVar2.f23680p : false, (r39 & 256) != 0 ? aVar2.f23681q : false, (r39 & 512) != 0 ? aVar2.f23682r : false, (r39 & 1024) != 0 ? aVar2.f23683s : null, (r39 & 2048) != 0 ? aVar2.f23684t : false, (r39 & 4096) != 0 ? aVar2.f23685u : interfaceC3983b2, (r39 & 8192) != 0 ? aVar2.f23686v : z8, (r39 & 16384) != 0 ? aVar2.f23687w : null, (r39 & 32768) != 0 ? aVar2.f23688x : interfaceC3983b, (r39 & 65536) != 0 ? aVar2.f23689y : false, (r39 & 131072) != 0 ? aVar2.f23690z : false, (r39 & 262144) != 0 ? aVar2.f23670A : null, (r39 & 524288) != 0 ? aVar2.f23671B : null, (r39 & 1048576) != 0 ? aVar2.f23672C : null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        Object value;
        List list;
        if (((List) this.f23591p.getValue()).size() == 1) {
            this.f23593r.d(new i.a(this.f23576a));
            return;
        }
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            list = (List) value;
            b.EnumC0023b C8 = C((com.stripe.android.customersheet.e) AbstractC1246t.y0(list));
            if (C8 != null) {
                this.f23583h.i(C8);
            }
        } while (!vVar.a(value, AbstractC1246t.g0(list, 1)));
    }

    private final void N() {
        Object value;
        ArrayList arrayList;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f23673i : null, (r39 & 2) != 0 ? r6.f23674j : null, (r39 & 4) != 0 ? r6.f23675k : null, (r39 & 8) != 0 ? r6.f23676l : null, (r39 & 16) != 0 ? r6.f23677m : null, (r39 & 32) != 0 ? r6.f23678n : null, (r39 & 64) != 0 ? r6.f23679o : null, (r39 & 128) != 0 ? r6.f23680p : false, (r39 & 256) != 0 ? r6.f23681q : false, (r39 & 512) != 0 ? r6.f23682r : false, (r39 & 1024) != 0 ? r6.f23683s : null, (r39 & 2048) != 0 ? r6.f23684t : false, (r39 & 4096) != 0 ? r6.f23685u : null, (r39 & 8192) != 0 ? r6.f23686v : false, (r39 & 16384) != 0 ? r6.f23687w : null, (r39 & 32768) != 0 ? r6.f23688x : null, (r39 & 65536) != 0 ? r6.f23689y : false, (r39 & 131072) != 0 ? r6.f23690z : false, (r39 & 262144) != 0 ? r6.f23670A : null, (r39 & 524288) != 0 ? r6.f23671B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f23672C : null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void O() {
        this.f23583h.a();
    }

    private final void P(com.stripe.android.payments.bankaccount.navigation.d dVar) {
        Object value;
        ArrayList arrayList;
        InterfaceC3983b a8;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar = (e.a) obj;
                    if (dVar instanceof d.b) {
                        a8 = AbstractC3984c.a(q3.w.f37452a0);
                    } else {
                        a8 = AbstractC3984c.a(b4.n.f14742o);
                    }
                    obj = aVar.j((r39 & 1) != 0 ? aVar.f23673i : null, (r39 & 2) != 0 ? aVar.f23674j : null, (r39 & 4) != 0 ? aVar.f23675k : null, (r39 & 8) != 0 ? aVar.f23676l : null, (r39 & 16) != 0 ? aVar.f23677m : null, (r39 & 32) != 0 ? aVar.f23678n : null, (r39 & 64) != 0 ? aVar.f23679o : null, (r39 & 128) != 0 ? aVar.f23680p : false, (r39 & 256) != 0 ? aVar.f23681q : false, (r39 & 512) != 0 ? aVar.f23682r : false, (r39 & 1024) != 0 ? aVar.f23683s : null, (r39 & 2048) != 0 ? aVar.f23684t : false, (r39 & 4096) != 0 ? aVar.f23685u : a8, (r39 & 8192) != 0 ? aVar.f23686v : false, (r39 & 16384) != 0 ? aVar.f23687w : null, (r39 & 32768) != 0 ? aVar.f23688x : null, (r39 & 65536) != 0 ? aVar.f23689y : false, (r39 & 131072) != 0 ? aVar.f23690z : false, (r39 & 262144) != 0 ? aVar.f23670A : dVar, (r39 & 524288) != 0 ? aVar.f23671B : null, (r39 & 1048576) != 0 ? aVar.f23672C : null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void Q(AbstractC3991f.e.d dVar) {
        A(dVar.f());
    }

    private final void R() {
        Object value;
        l6.v vVar = this.f23593r;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, new i.a(this.f23576a)));
    }

    private final void S() {
        Object value;
        ArrayList arrayList;
        boolean z8;
        if (((com.stripe.android.customersheet.e) this.f23592q.getValue()).e()) {
            this.f23583h.n();
        } else {
            this.f23583h.m();
        }
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.d) {
                    e.d dVar = (e.d) obj;
                    boolean z9 = !dVar.e();
                    if (!z9 && !AbstractC3159y.d(this.f23576a, dVar.o())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = e.d.k(dVar, null, null, null, false, false, z9, false, z8, null, false, false, null, null, null, null, 32607, null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void T(InterfaceC3983b interfaceC3983b) {
        Object value;
        ArrayList arrayList;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f23673i : null, (r39 & 2) != 0 ? r6.f23674j : null, (r39 & 4) != 0 ? r6.f23675k : null, (r39 & 8) != 0 ? r6.f23676l : null, (r39 & 16) != 0 ? r6.f23677m : null, (r39 & 32) != 0 ? r6.f23678n : null, (r39 & 64) != 0 ? r6.f23679o : null, (r39 & 128) != 0 ? r6.f23680p : false, (r39 & 256) != 0 ? r6.f23681q : false, (r39 & 512) != 0 ? r6.f23682r : false, (r39 & 1024) != 0 ? r6.f23683s : interfaceC3983b, (r39 & 2048) != 0 ? r6.f23684t : false, (r39 & 4096) != 0 ? r6.f23685u : null, (r39 & 8192) != 0 ? r6.f23686v : false, (r39 & 16384) != 0 ? r6.f23687w : null, (r39 & 32768) != 0 ? r6.f23688x : null, (r39 & 65536) != 0 ? r6.f23689y : false, (r39 & 131072) != 0 ? r6.f23690z : false, (r39 & 262144) != 0 ? r6.f23670A : null, (r39 & 524288) != 0 ? r6.f23671B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f23672C : null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void U(w3.c cVar) {
        Object obj;
        l6.v vVar;
        Y2.d dVar;
        ArrayList arrayList;
        boolean z8;
        AbstractC3991f abstractC3991f;
        w3.c cVar2 = cVar;
        Y2.d dVar2 = this.f23597v;
        if (dVar2 != null) {
            l6.v vVar2 = this.f23591p;
            while (true) {
                Object value = vVar2.getValue();
                List<Object> list = (List) value;
                ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(list, 10));
                for (Object obj2 : list) {
                    if (obj2 instanceof e.a) {
                        e.a aVar = (e.a) obj2;
                        if (cVar2 != null && !aVar.g()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (cVar2 != null) {
                            for (X2.g gVar : aVar.z()) {
                                if (AbstractC3159y.d(gVar.d(), aVar.v())) {
                                    abstractC3991f = AbstractC1195c.g(cVar2, gVar, dVar2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        abstractC3991f = null;
                        obj = value;
                        vVar = vVar2;
                        dVar = dVar2;
                        obj2 = aVar.j((r39 & 1) != 0 ? aVar.f23673i : null, (r39 & 2) != 0 ? aVar.f23674j : null, (r39 & 4) != 0 ? aVar.f23675k : cVar, (r39 & 8) != 0 ? aVar.f23676l : null, (r39 & 16) != 0 ? aVar.f23677m : null, (r39 & 32) != 0 ? aVar.f23678n : null, (r39 & 64) != 0 ? aVar.f23679o : abstractC3991f, (r39 & 128) != 0 ? aVar.f23680p : false, (r39 & 256) != 0 ? aVar.f23681q : false, (r39 & 512) != 0 ? aVar.f23682r : false, (r39 & 1024) != 0 ? aVar.f23683s : null, (r39 & 2048) != 0 ? aVar.f23684t : false, (r39 & 4096) != 0 ? aVar.f23685u : null, (r39 & 8192) != 0 ? aVar.f23686v : z8, (r39 & 16384) != 0 ? aVar.f23687w : null, (r39 & 32768) != 0 ? aVar.f23688x : null, (r39 & 65536) != 0 ? aVar.f23689y : false, (r39 & 131072) != 0 ? aVar.f23690z : false, (r39 & 262144) != 0 ? aVar.f23670A : null, (r39 & 524288) != 0 ? aVar.f23671B : null, (r39 & 1048576) != 0 ? aVar.f23672C : null);
                        arrayList = arrayList2;
                    } else {
                        obj = value;
                        vVar = vVar2;
                        dVar = dVar2;
                        arrayList = arrayList2;
                    }
                    arrayList.add(obj2);
                    cVar2 = cVar;
                    arrayList2 = arrayList;
                    dVar2 = dVar;
                    value = obj;
                    vVar2 = vVar;
                }
                l6.v vVar3 = vVar2;
                Y2.d dVar3 = dVar2;
                if (!vVar3.a(value, arrayList2)) {
                    cVar2 = cVar;
                    vVar2 = vVar3;
                    dVar2 = dVar3;
                } else {
                    return;
                }
            }
        }
    }

    private final void V(com.stripe.android.model.o oVar) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new k(oVar, null), 2, null);
    }

    private final void W(AbstractC3991f abstractC3991f) {
        boolean z8;
        Object obj;
        l6.v vVar;
        AbstractC3991f abstractC3991f2;
        ArrayList arrayList;
        InterfaceC3983b interfaceC3983b;
        d dVar = this;
        AbstractC3991f abstractC3991f3 = abstractC3991f;
        if (abstractC3991f3 instanceof AbstractC3991f.c) {
            z8 = true;
        } else {
            z8 = abstractC3991f3 instanceof AbstractC3991f.C0916f;
        }
        if (z8) {
            if (!((com.stripe.android.customersheet.e) dVar.f23592q.getValue()).e()) {
                l6.v vVar2 = this.f23591p;
                while (true) {
                    Object value = vVar2.getValue();
                    List<Object> list = (List) value;
                    ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(list, 10));
                    for (Object obj2 : list) {
                        if (obj2 instanceof e.d) {
                            e.d dVar2 = (e.d) obj2;
                            boolean z9 = !AbstractC3159y.d(dVar.f23576a, abstractC3991f3);
                            String string = dVar.f23579d.getString(q3.w.f37430F);
                            InterfaceC3983b c8 = abstractC3991f3.c(dVar.f23580e.k(), false);
                            if (c8 != null && z9) {
                                interfaceC3983b = c8;
                            } else {
                                interfaceC3983b = null;
                            }
                            obj = value;
                            vVar = vVar2;
                            abstractC3991f2 = abstractC3991f3;
                            obj2 = e.d.k(dVar2, null, null, abstractC3991f, false, false, false, false, z9, string, false, false, null, null, interfaceC3983b, null, 24187, null);
                            arrayList = arrayList2;
                        } else {
                            obj = value;
                            vVar = vVar2;
                            abstractC3991f2 = abstractC3991f3;
                            arrayList = arrayList2;
                        }
                        arrayList.add(obj2);
                        abstractC3991f3 = abstractC3991f2;
                        arrayList2 = arrayList;
                        value = obj;
                        vVar2 = vVar;
                        dVar = this;
                    }
                    l6.v vVar3 = vVar2;
                    AbstractC3991f abstractC3991f4 = abstractC3991f3;
                    if (vVar3.a(value, arrayList2)) {
                        return;
                    }
                    abstractC3991f3 = abstractC3991f4;
                    vVar2 = vVar3;
                    dVar = this;
                }
            }
        } else {
            throw new IllegalStateException(("Unsupported payment selection " + abstractC3991f3).toString());
        }
    }

    private final void X(com.stripe.android.model.o oVar) {
        boolean z8;
        String str;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f23592q.getValue();
        if (this.f23580e.b() || eVar.d().size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        InterfaceC1211t.a aVar = this.f23588m;
        o.p pVar = oVar.f24412e;
        if (pVar != null) {
            str = pVar.f24550a;
        } else {
            str = null;
        }
        InterfaceC3983b Z7 = Z(str);
        Y2.d dVar = this.f23597v;
        if (dVar != null) {
            g0(this, new e.b(aVar.a(oVar, new l(), new m(null), new n(null), Z7, z8, dVar.V().a()), eVar.f(), eVar.c(), eVar.d(), this.f23580e.b(), true), false, 2, null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void Y() {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f23592q.getValue();
        if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            if (aVar.m() == null) {
                l6.v vVar = this.f23591p;
                do {
                    value2 = vVar.getValue();
                    List<Object> list = (List) value2;
                    arrayList2 = new ArrayList(AbstractC1246t.x(list, 10));
                    for (Object obj : list) {
                        if (obj instanceof e.a) {
                            obj = r9.j((r39 & 1) != 0 ? r9.f23673i : null, (r39 & 2) != 0 ? r9.f23674j : null, (r39 & 4) != 0 ? r9.f23675k : null, (r39 & 8) != 0 ? r9.f23676l : null, (r39 & 16) != 0 ? r9.f23677m : null, (r39 & 32) != 0 ? r9.f23678n : null, (r39 & 64) != 0 ? r9.f23679o : null, (r39 & 128) != 0 ? r9.f23680p : false, (r39 & 256) != 0 ? r9.f23681q : false, (r39 & 512) != 0 ? r9.f23682r : true, (r39 & 1024) != 0 ? r9.f23683s : null, (r39 & 2048) != 0 ? r9.f23684t : false, (r39 & 4096) != 0 ? r9.f23685u : null, (r39 & 8192) != 0 ? r9.f23686v : false, (r39 & 16384) != 0 ? r9.f23687w : null, (r39 & 32768) != 0 ? r9.f23688x : null, (r39 & 65536) != 0 ? r9.f23689y : false, (r39 & 131072) != 0 ? r9.f23690z : false, (r39 & 262144) != 0 ? r9.f23670A : null, (r39 & 524288) != 0 ? r9.f23671B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f23672C : null);
                        }
                        arrayList2.add(obj);
                    }
                } while (!vVar.a(value2, arrayList2));
                w3.c t8 = aVar.t();
                if (t8 != null) {
                    String v8 = aVar.v();
                    Y2.d dVar = this.f23597v;
                    if (dVar != null) {
                        A(AbstractC1195c.e(t8, v8, dVar));
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
            l6.v vVar2 = this.f23591p;
            do {
                value = vVar2.getValue();
                List<Object> list2 = (List) value;
                arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
                for (Object obj2 : list2) {
                    if (obj2 instanceof e.d) {
                        obj2 = e.d.k((e.d) obj2, null, null, null, false, true, false, false, false, null, false, false, null, null, null, null, 32751, null);
                    }
                    arrayList.add(obj2);
                }
            } while (!vVar2.a(value, arrayList));
            AbstractC3991f o8 = ((e.d) eVar).o();
            if (o8 instanceof AbstractC3991f.c) {
                d0();
                return;
            }
            if (o8 instanceof AbstractC3991f.C0916f) {
                e0((AbstractC3991f.C0916f) o8);
                return;
            } else {
                if (o8 == null) {
                    e0(null);
                    return;
                }
                throw new IllegalStateException((o8 + " is not supported").toString());
            }
        }
        throw new IllegalStateException((this.f23592q.getValue() + " is not supported").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(com.stripe.android.model.o r7, P5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.customersheet.d.o
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.customersheet.d$o r0 = (com.stripe.android.customersheet.d.o) r0
            int r1 = r0.f23643e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23643e = r1
            goto L18
        L13:
            com.stripe.android.customersheet.d$o r0 = new com.stripe.android.customersheet.d$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23641c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23643e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L9e
            if (r2 == r5) goto L92
            if (r2 != r4) goto L8a
            java.lang.Object r7 = r0.f23640b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r0 = r0.f23639a
            com.stripe.android.customersheet.d r0 = (com.stripe.android.customersheet.d) r0
            L5.t.b(r8)
            com.stripe.android.customersheet.a$b r8 = (com.stripe.android.customersheet.a.b) r8
            boolean r1 = r8 instanceof com.stripe.android.customersheet.a.b.c
            if (r1 == 0) goto L48
            r1 = r8
            com.stripe.android.customersheet.a$b$c r1 = (com.stripe.android.customersheet.a.b.c) r1
            java.lang.Object r1 = r1.a()
            com.stripe.android.model.o r1 = (com.stripe.android.model.o) r1
            C2.b r1 = r0.f23583h
            r1.j()
        L48:
            com.stripe.android.customersheet.a$b$b r1 = com.stripe.android.customersheet.b.a(r8)
            if (r1 == 0) goto L89
            java.lang.String r2 = r1.b()
            if (r2 != 0) goto L6a
            java.lang.Throwable r2 = r1.a()
            boolean r4 = r2 instanceof t2.AbstractC3790k
            if (r4 == 0) goto L5f
            r3 = r2
            t2.k r3 = (t2.AbstractC3790k) r3
        L5f:
            if (r3 == 0) goto L6a
            r2.f r2 = r3.d()
            if (r2 == 0) goto L6a
            r2.j()
        L6a:
            java.lang.Throwable r1 = r1.a()
            C2.b r2 = r0.f23583h
            r2.l()
            r2.d r0 = r0.f23581f
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
            java.lang.Object r7 = r0.f23640b
            com.stripe.android.model.o r7 = (com.stripe.android.model.o) r7
            java.lang.Object r1 = r0.f23639a
            com.stripe.android.customersheet.d r1 = (com.stripe.android.customersheet.d) r1
            L5.t.b(r8)
            goto Laf
        L9e:
            L5.t.b(r8)
            r0.f23639a = r6
            r0.f23640b = r7
            r0.f23643e = r5
            java.lang.Object r8 = r6.v(r0)
            if (r8 != r1) goto Lae
            return r1
        Lae:
            r1 = r6
        Laf:
            android.support.v4.media.a.a(r8)
            java.lang.String r8 = r7.f24408a
            kotlin.jvm.internal.AbstractC3159y.f(r8)
            r0.f23639a = r1
            r0.f23640b = r7
            r0.f23643e = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.b0(com.stripe.android.model.o, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(com.stripe.android.model.o oVar) {
        ArrayList arrayList;
        Y2.d dVar;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z8;
        AbstractC3991f abstractC3991f;
        boolean z9;
        com.stripe.android.customersheet.e eVar = (com.stripe.android.customersheet.e) this.f23592q.getValue();
        List d8 = eVar.d();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : d8) {
            String str = ((com.stripe.android.model.o) obj2).f24408a;
            AbstractC3159y.f(oVar.f24408a);
            if (!AbstractC3159y.d(str, r6)) {
                arrayList4.add(obj2);
            }
        }
        AbstractC3991f abstractC3991f2 = null;
        if (eVar instanceof e.d) {
            l6.v vVar = this.f23591p;
            while (true) {
                Object value = vVar.getValue();
                List<Object> list = (List) value;
                ArrayList arrayList5 = new ArrayList(AbstractC1246t.x(list, 10));
                for (Object obj3 : list) {
                    if (obj3 instanceof e.d) {
                        e.d dVar2 = (e.d) obj3;
                        AbstractC3991f abstractC3991f3 = this.f23576a;
                        if ((dVar2.o() instanceof AbstractC3991f.C0916f) && AbstractC3159y.d(((AbstractC3991f.C0916f) dVar2.o()).v().f24408a, oVar.f24408a)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if ((dVar2.o() instanceof AbstractC3991f.C0916f) && (abstractC3991f3 instanceof AbstractC3991f.C0916f) && AbstractC3159y.d(((AbstractC3991f.C0916f) dVar2.o()).v().f24408a, ((AbstractC3991f.C0916f) abstractC3991f3).v().f24408a)) {
                            this.f23576a = abstractC3991f2;
                        }
                        boolean a8 = B2.f.a(dVar2.a(), arrayList4, dVar2.c());
                        AbstractC3991f o8 = dVar2.o();
                        if (z8) {
                            o8 = abstractC3991f2;
                        }
                        if (o8 == null) {
                            abstractC3991f = this.f23576a;
                        } else {
                            abstractC3991f = o8;
                        }
                        if (dVar2.e() && a8) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        arrayList3 = arrayList5;
                        obj = value;
                        AbstractC3991f abstractC3991f4 = abstractC3991f;
                        arrayList2 = arrayList4;
                        obj3 = e.d.k(dVar2, null, arrayList4, abstractC3991f4, false, false, z9, false, false, null, false, false, null, null, null, null, 32729, null);
                    } else {
                        obj = value;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(obj3);
                    arrayList5 = arrayList3;
                    arrayList4 = arrayList2;
                    value = obj;
                    abstractC3991f2 = null;
                }
                arrayList = arrayList4;
                if (vVar.a(value, arrayList5)) {
                    break;
                }
                arrayList4 = arrayList;
                abstractC3991f2 = null;
            }
        } else {
            arrayList = arrayList4;
        }
        if (arrayList.isEmpty() && (dVar = this.f23597v) != null && !dVar.a0()) {
            i0(this, true, null, 2, null);
        }
    }

    private final void d0() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new p(null), 2, null);
    }

    private final void e0(AbstractC3991f.C0916f c0916f) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new q(c0916f, null), 2, null);
    }

    private final void f0(com.stripe.android.customersheet.e eVar, boolean z8) {
        Object value;
        List H02;
        if (eVar instanceof e.a) {
            this.f23583h.d(b.EnumC0023b.f1225b);
        } else if (eVar instanceof e.d) {
            this.f23583h.d(b.EnumC0023b.f1226c);
        } else if (eVar instanceof e.b) {
            this.f23583h.d(b.EnumC0023b.f1227d);
        }
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List list = (List) value;
            if (z8) {
                H02 = AbstractC1246t.e(eVar);
            } else {
                H02 = AbstractC1246t.H0(list, eVar);
            }
        } while (!vVar.a(value, H02));
    }

    static /* synthetic */ void g0(d dVar, com.stripe.android.customersheet.e eVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        dVar.f0(eVar, z8);
    }

    private final void h0(boolean z8, InterfaceC1925a interfaceC1925a) {
        String str;
        List h02;
        StripeIntent stripeIntent;
        List m8;
        String str2;
        X2.g gVar = this.f23596u;
        String str3 = null;
        if (gVar == null || (str = gVar.d()) == null) {
            Y2.d dVar = this.f23597v;
            if (dVar != null && (h02 = dVar.h0()) != null) {
                str = (String) AbstractC1246t.o0(h02);
            } else {
                str = null;
            }
            if (str == null) {
                str = o.p.f24532i.f24550a;
            }
        }
        String str4 = str;
        C3847b c3847b = C3847b.f39007a;
        B2.a aVar = this.f23580e;
        A3.a a8 = c3847b.a(str4, aVar, aVar.k(), interfaceC1925a);
        X2.g gVar2 = this.f23596u;
        if (gVar2 == null) {
            Y2.d dVar2 = this.f23597v;
            if (dVar2 != null) {
                gVar2 = dVar2.g0(str4);
            } else {
                gVar2 = null;
            }
            if (gVar2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        Y2.d dVar3 = this.f23597v;
        if (dVar3 != null) {
            stripeIntent = dVar3.V();
        } else {
            stripeIntent = null;
        }
        Y2.d dVar4 = this.f23597v;
        if (dVar4 == null || (m8 = dVar4.j(gVar2.d(), new h.a.InterfaceC0245a.C0246a(this.f23590o, null, x.f23655a, null, null, 24, null))) == null) {
            m8 = AbstractC1246t.m();
        }
        List list = m8;
        List list2 = this.f23598w;
        if (stripeIntent != null) {
            str2 = stripeIntent.getId();
        } else {
            str2 = null;
        }
        if (stripeIntent != null) {
            str3 = stripeIntent.d();
        }
        f0(new e.a(str4, list2, null, list, a8, new B3.d(false, null, false, false, false, str2, str3, "customer_sheet", null, null, new r(), new s(), new t(), new u(), v.f23653a, new w()), null, true, ((Boolean) this.f23585j.invoke()).booleanValue(), false, null, z8, AbstractC3984c.a(q3.w.f37452a0), false, null, null, false, false, null, interfaceC1925a, this.f23589n, 230400, null), z8);
    }

    static /* synthetic */ void i0(d dVar, boolean z8, InterfaceC1925a interfaceC1925a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC1925a = ((com.stripe.android.customersheet.e) dVar.f23592q.getValue()).c();
        }
        dVar.h0(z8, interfaceC1925a);
    }

    private final void j0(List list, AbstractC3991f abstractC3991f, InterfaceC1925a interfaceC1925a) {
        Y2.d dVar;
        if (list.isEmpty() && (dVar = this.f23597v) != null && !dVar.a0()) {
            h0(true, interfaceC1925a);
        } else {
            f0(x(new y(list, abstractC3991f, interfaceC1925a)), true);
        }
    }

    private final void k0(Function1 function1) {
        Object value;
        ArrayList arrayList;
        boolean z8;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    e.a aVar = (e.a) obj;
                    PrimaryButton.b bVar = (PrimaryButton.b) function1.invoke(aVar.m());
                    if (bVar != null) {
                        obj = aVar.j((r39 & 1) != 0 ? aVar.f23673i : null, (r39 & 2) != 0 ? aVar.f23674j : null, (r39 & 4) != 0 ? aVar.f23675k : null, (r39 & 8) != 0 ? aVar.f23676l : null, (r39 & 16) != 0 ? aVar.f23677m : null, (r39 & 32) != 0 ? aVar.f23678n : null, (r39 & 64) != 0 ? aVar.f23679o : null, (r39 & 128) != 0 ? aVar.f23680p : false, (r39 & 256) != 0 ? aVar.f23681q : false, (r39 & 512) != 0 ? aVar.f23682r : false, (r39 & 1024) != 0 ? aVar.f23683s : null, (r39 & 2048) != 0 ? aVar.f23684t : false, (r39 & 4096) != 0 ? aVar.f23685u : null, (r39 & 8192) != 0 ? aVar.f23686v : bVar.c(), (r39 & 16384) != 0 ? aVar.f23687w : bVar, (r39 & 32768) != 0 ? aVar.f23688x : null, (r39 & 65536) != 0 ? aVar.f23689y : false, (r39 & 131072) != 0 ? aVar.f23690z : false, (r39 & 262144) != 0 ? aVar.f23670A : null, (r39 & 524288) != 0 ? aVar.f23671B : null, (r39 & 1048576) != 0 ? aVar.f23672C : null);
                    } else {
                        if (aVar.t() != null && !aVar.g()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        obj = aVar.j((r39 & 1) != 0 ? aVar.f23673i : null, (r39 & 2) != 0 ? aVar.f23674j : null, (r39 & 4) != 0 ? aVar.f23675k : null, (r39 & 8) != 0 ? aVar.f23676l : null, (r39 & 16) != 0 ? aVar.f23677m : null, (r39 & 32) != 0 ? aVar.f23678n : null, (r39 & 64) != 0 ? aVar.f23679o : null, (r39 & 128) != 0 ? aVar.f23680p : false, (r39 & 256) != 0 ? aVar.f23681q : false, (r39 & 512) != 0 ? aVar.f23682r : false, (r39 & 1024) != 0 ? aVar.f23683s : null, (r39 & 2048) != 0 ? aVar.f23684t : false, (r39 & 4096) != 0 ? aVar.f23685u : null, (r39 & 8192) != 0 ? aVar.f23686v : z8, (r39 & 16384) != 0 ? aVar.f23687w : null, (r39 & 32768) != 0 ? aVar.f23688x : null, (r39 & 65536) != 0 ? aVar.f23689y : false, (r39 & 131072) != 0 ? aVar.f23690z : false, (r39 & 262144) != 0 ? aVar.f23670A : null, (r39 & 524288) != 0 ? aVar.f23671B : null, (r39 & 1048576) != 0 ? aVar.f23672C : null);
                    }
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void l0(InterfaceC3983b interfaceC3983b, boolean z8) {
        Object value;
        ArrayList arrayList;
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.a) {
                    obj = r6.j((r39 & 1) != 0 ? r6.f23673i : null, (r39 & 2) != 0 ? r6.f23674j : null, (r39 & 4) != 0 ? r6.f23675k : null, (r39 & 8) != 0 ? r6.f23676l : null, (r39 & 16) != 0 ? r6.f23677m : null, (r39 & 32) != 0 ? r6.f23678n : null, (r39 & 64) != 0 ? r6.f23679o : null, (r39 & 128) != 0 ? r6.f23680p : false, (r39 & 256) != 0 ? r6.f23681q : false, (r39 & 512) != 0 ? r6.f23682r : false, (r39 & 1024) != 0 ? r6.f23683s : null, (r39 & 2048) != 0 ? r6.f23684t : false, (r39 & 4096) != 0 ? r6.f23685u : null, (r39 & 8192) != 0 ? r6.f23686v : false, (r39 & 16384) != 0 ? r6.f23687w : null, (r39 & 32768) != 0 ? r6.f23688x : interfaceC3983b, (r39 & 65536) != 0 ? r6.f23689y : z8, (r39 & 131072) != 0 ? r6.f23690z : false, (r39 & 262144) != 0 ? r6.f23670A : null, (r39 & 524288) != 0 ? r6.f23671B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f23672C : null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    private final void m0(com.stripe.android.model.o oVar) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new z(oVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(com.stripe.android.model.o oVar) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), this.f23584i, null, new c(oVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(P5.d dVar) {
        return this.f23578c.g(dVar);
    }

    private final e.d x(Function1 function1) {
        boolean z8;
        InterfaceC1925a interfaceC1925a;
        String j8 = this.f23580e.j();
        List m8 = AbstractC1246t.m();
        boolean booleanValue = ((Boolean) this.f23585j.invoke()).booleanValue();
        Y2.d dVar = this.f23597v;
        if (dVar != null && dVar.a0()) {
            z8 = true;
        } else {
            z8 = false;
        }
        String string = this.f23579d.getString(q3.w.f37430F);
        Y2.d dVar2 = this.f23597v;
        if (dVar2 == null || (interfaceC1925a = dVar2.u()) == null) {
            interfaceC1925a = InterfaceC1925a.c.f14983a;
        }
        return (e.d) function1.invoke(new e.d(j8, m8, null, booleanValue, false, false, z8, false, string, this.f23580e.b(), true, null, null, null, interfaceC1925a, 12288, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(AbstractC3991f abstractC3991f, String str) {
        if (str != null) {
            this.f23583h.k(str);
        }
        this.f23593r.d(new i.d(abstractC3991f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(AbstractC3991f abstractC3991f, String str, Throwable th, String str2) {
        Object value;
        ArrayList arrayList;
        if (str != null) {
            this.f23583h.h(str);
        }
        this.f23581f.a("Failed to persist payment selection: " + abstractC3991f, th);
        l6.v vVar = this.f23591p;
        do {
            value = vVar.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            for (Object obj : list) {
                if (obj instanceof e.d) {
                    obj = e.d.k((e.d) obj, null, null, null, false, false, false, false, false, null, false, false, str2, null, null, null, 30703, null);
                }
                arrayList.add(obj);
            }
        } while (!vVar.a(value, arrayList));
    }

    public final InterfaceC3349K D() {
        return this.f23594s;
    }

    public final InterfaceC3349K E() {
        return this.f23592q;
    }

    public final void H(com.stripe.android.customersheet.c viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
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
        if (viewAction instanceof c.C0462c) {
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

    public final InterfaceC3983b Z(String str) {
        X2.g gVar;
        InterfaceC3983b interfaceC3983b = null;
        if (str != null) {
            Y2.d dVar = this.f23597v;
            if (dVar != null) {
                gVar = dVar.g0(str);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                interfaceC3983b = gVar.f();
            }
        }
        return AbstractC3984c.c(interfaceC3983b);
    }

    public final void a0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(lifecycleOwner, "lifecycleOwner");
        this.f23595t.P(activityResultCaller, lifecycleOwner);
    }

    public final boolean w() {
        Object value;
        ArrayList arrayList;
        if (((com.stripe.android.customersheet.e) this.f23592q.getValue()).h(this.f23587l)) {
            l6.v vVar = this.f23591p;
            do {
                value = vVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                for (Object obj : list) {
                    if (obj instanceof e.a) {
                        obj = r7.j((r39 & 1) != 0 ? r7.f23673i : null, (r39 & 2) != 0 ? r7.f23674j : null, (r39 & 4) != 0 ? r7.f23675k : null, (r39 & 8) != 0 ? r7.f23676l : null, (r39 & 16) != 0 ? r7.f23677m : null, (r39 & 32) != 0 ? r7.f23678n : null, (r39 & 64) != 0 ? r7.f23679o : null, (r39 & 128) != 0 ? r7.f23680p : false, (r39 & 256) != 0 ? r7.f23681q : false, (r39 & 512) != 0 ? r7.f23682r : false, (r39 & 1024) != 0 ? r7.f23683s : null, (r39 & 2048) != 0 ? r7.f23684t : false, (r39 & 4096) != 0 ? r7.f23685u : null, (r39 & 8192) != 0 ? r7.f23686v : false, (r39 & 16384) != 0 ? r7.f23687w : null, (r39 & 32768) != 0 ? r7.f23688x : null, (r39 & 65536) != 0 ? r7.f23689y : false, (r39 & 131072) != 0 ? r7.f23690z : true, (r39 & 262144) != 0 ? r7.f23670A : null, (r39 & 524288) != 0 ? r7.f23671B : null, (r39 & 1048576) != 0 ? ((e.a) obj).f23672C : null);
                    }
                    arrayList.add(obj);
                }
            } while (!vVar.a(value, arrayList));
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Application application, List initialBackStack, AbstractC3991f abstractC3991f, I5.a paymentConfigurationProvider, Resources resources, B2.a configuration, InterfaceC3684d logger, e3.m stripeRepository, C2.b eventReporter, P5.g workContext, Function0 isLiveModeProvider, e.d intentConfirmationHandlerFactory, B2.b customerSheetLoader, o3.d isFinancialConnectionsAvailable, InterfaceC1211t.a editInteractorFactory, k3.i errorReporter) {
        this(application, initialBackStack, abstractC3991f, paymentConfigurationProvider, F2.a.f2440a.a(), resources, configuration, logger, stripeRepository, eventReporter, workContext, isLiveModeProvider, intentConfirmationHandlerFactory, customerSheetLoader, isFinancialConnectionsAvailable, editInteractorFactory, errorReporter);
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(initialBackStack, "initialBackStack");
        AbstractC3159y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3159y.i(resources, "resources");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3159y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3159y.i(customerSheetLoader, "customerSheetLoader");
        AbstractC3159y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3159y.i(errorReporter, "errorReporter");
    }
}
