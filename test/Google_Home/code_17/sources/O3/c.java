package O3;

import B3.f;
import C3.c;
import O3.a;
import O3.b;
import O3.n;
import O5.I;
import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1672r;
import androidx.lifecycle.ViewModelKt;
import b3.C1970d;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;
import m2.AbstractC3407E;
import m2.z;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.D;
import t3.C4028b;
import t3.C4033g;
import t3.C4037k;

/* loaded from: classes4.dex */
public final class c implements n {

    /* renamed from: A, reason: collision with root package name */
    public static final b f7941A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f7942B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f7943a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f7944b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f7945c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1668n f7946d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f7947e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f7948f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f7949g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f7950h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f7951i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3698L f7952j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f7953k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f7954l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f7955m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7956n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f7957o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f7958p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f7959q;

    /* renamed from: r, reason: collision with root package name */
    private final Function1 f7960r;

    /* renamed from: s, reason: collision with root package name */
    private final Function1 f7961s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f7962t;

    /* renamed from: u, reason: collision with root package name */
    private final M f7963u;

    /* renamed from: v, reason: collision with root package name */
    private final List f7964v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3698L f7965w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3698L f7966x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3698L f7967y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3698L f7968z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7969a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f7971c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0154a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3698L f7972a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f7973b;

            C0154a(InterfaceC3698L interfaceC3698L, c cVar) {
                this.f7972a = interfaceC3698L;
                this.f7973b = cVar;
            }

            public final Object a(boolean z8, S5.d dVar) {
                if (!z8) {
                    return I.f8278a;
                }
                B3.f fVar = (B3.f) this.f7972a.getValue();
                if (fVar == null) {
                    return I.f8278a;
                }
                if (!(fVar instanceof f.C0009f)) {
                    this.f7973b.f7958p.invoke(null);
                }
                return I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3698L interfaceC3698L, S5.d dVar) {
            super(2, dVar);
            this.f7971c = interfaceC3698L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f7971c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f7969a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f q8 = AbstractC3708h.q(c.this.f7959q, 2);
                C0154a c0154a = new C0154a(this.f7971c, c.this);
                this.f7969a = 1;
                if (q8.collect(c0154a, this) == e8) {
                    return e8;
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
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7974a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1970d f7975b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4028b f7976c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P3.a aVar, C1970d c1970d, C4028b c4028b) {
                super(0);
                this.f7974a = aVar;
                this.f7975b = c1970d;
                this.f7976c = c4028b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3.c invoke() {
                a.C0148a c0148a = O3.a.f7906d;
                P3.a aVar = this.f7974a;
                return new c.h(c0148a.a(aVar, this.f7975b, this.f7976c, aVar.w()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0155b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7977a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1970d f7978b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4028b f7979c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0155b(P3.a aVar, C1970d c1970d, C4028b c4028b) {
                super(1);
                this.f7977a = aVar;
                this.f7978b = c1970d;
                this.f7979c = c4028b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3.c invoke(String selectedPaymentMethodCode) {
                AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                return new c.l(O3.d.f7996l.a(selectedPaymentMethodCode, this.f7977a, this.f7978b, this.f7979c), false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0156c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7980a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0156c(P3.a aVar) {
                super(1);
                this.f7980a = aVar;
            }

            public final void a(C4033g it) {
                AbstractC3255y.i(it, "it");
                this.f7980a.w().s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7981a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(P3.a aVar) {
                super(1);
                this.f7981a = aVar;
            }

            public final void a(com.stripe.android.model.o it) {
                AbstractC3255y.i(it, "it");
                this.f7981a.E(new f.C0009f(it, null, null, 6, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.model.o) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7982a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(P3.a aVar) {
                super(1);
                this.f7982a = aVar;
            }

            public final void a(B2.b bVar) {
                this.f7982a.q().e(bVar, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B2.b) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3252v implements Function1 {
            f(Object obj) {
                super(1, obj, C4037k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3255y.i(p02, "p0");
                return ((C4037k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class g extends C3252v implements Function1 {
            g(Object obj) {
                super(1, obj, C4037k.class, "requiresFormScreen", "requiresFormScreen(Ljava/lang/String;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String p02) {
                AbstractC3255y.i(p02, "p0");
                return Boolean.valueOf(((C4037k) this.receiver).d(p02));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class h extends C3252v implements Function1 {
            h(Object obj) {
                super(1, obj, C3.b.class, "transitionToWithDelay", "transitionToWithDelay(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V", 0);
            }

            public final void d(C3.c p02) {
                AbstractC3255y.i(p02, "p0");
                ((C3.b) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((C3.c) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class i extends C3252v implements InterfaceC1668n {
            i(Object obj) {
                super(2, obj, C4037k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(z3.c cVar, String p12) {
                AbstractC3255y.i(p12, "p1");
                ((C4037k) this.receiver).c(cVar, p12);
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((z3.c) obj, (String) obj2);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class j extends C3252v implements Function1 {
            j(Object obj) {
                super(1, obj, P3.a.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(B3.f fVar) {
                ((P3.a) this.receiver).M(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((B3.f) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class k extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final k f7983a = new k();

            k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C3.c it) {
                AbstractC3255y.i(it, "it");
                return Boolean.valueOf(it instanceof c.k);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class l extends C3252v implements Function1 {
            l(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class m extends C3252v implements Function1 {
            m(Object obj) {
                super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((EventReporter) this.receiver).q(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class n extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7984a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1970d f7985b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4028b f7986c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(P3.a aVar, C1970d c1970d, C4028b c4028b) {
                super(0);
                this.f7984a = aVar;
                this.f7985b = c1970d;
                this.f7986c = c4028b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3.c invoke() {
                b.c cVar = O3.b.f7911q;
                P3.a aVar = this.f7984a;
                return new c.i(cVar.b(aVar, this.f7985b, this.f7986c, aVar.w()));
            }
        }

        private b() {
        }

        public final O3.n a(P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(customerStateHolder, "customerStateHolder");
            C4037k a8 = C4037k.f39662g.a(viewModel, t3.m.f39672h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata);
            return new c(paymentMethodMetadata, viewModel.v(), viewModel.y(), new f(a8), new g(a8), new h(viewModel.r()), new i(a8), new n(viewModel, paymentMethodMetadata, customerStateHolder), new a(viewModel, paymentMethodMetadata, customerStateHolder), new C0155b(viewModel, paymentMethodMetadata, customerStateHolder), customerStateHolder.c(), customerStateHolder.b(), viewModel.w().q(), viewModel.w().m(), new C0156c(viewModel), new d(viewModel), viewModel.A(), !viewModel.F(), new e(viewModel), new j(viewModel), y4.g.m(viewModel.r().f(), k.f7983a), new l(viewModel.n()), new m(viewModel.n()), paymentMethodMetadata.W().c(), null, 16777216, null);
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: O3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0157c extends AbstractC3256z implements InterfaceC1669o {
        C0157c() {
            super(3);
        }

        public final n.a a(List paymentMethods, C4033g c4033g, boolean z8) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            return c.this.j(paymentMethods, c4033g, z8);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((List) obj, (C4033g) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1970d f7989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1970d c1970d) {
            super(2);
            this.f7989b = c1970d;
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4033g invoke(List paymentMethods, com.stripe.android.model.o oVar) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            return c.this.l(paymentMethods, this.f7989b, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m48invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m48invoke() {
            c.this.f7958p.invoke(f.d.f821a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m49invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m49invoke() {
            c.this.f7958p.invoke(f.c.f820a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1625g f7993b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1625g c1625g) {
            super(0);
            this.f7993b = c1625g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m50invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m50invoke() {
            c.this.a(new n.c.b(this.f7993b.d()));
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(L3.n nVar) {
            return Boolean.valueOf(!c.this.n(nVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements InterfaceC1672r {
        i() {
            super(6);
        }

        public final n.b a(List paymentMethods, boolean z8, B3.f fVar, C4033g c4033g, L3.n nVar, n.a action) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            AbstractC3255y.i(action, "action");
            return new n.b(c.this.k(paymentMethods, nVar), z8, fVar, c4033g, action);
        }

        @Override // a6.InterfaceC1672r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return a((List) obj, ((Boolean) obj2).booleanValue(), (B3.f) obj3, (C4033g) obj4, (L3.n) obj5, (n.a) obj6);
        }
    }

    public c(C1970d paymentMethodMetadata, InterfaceC3698L processing, InterfaceC3698L selection, Function1 formElementsForCode, Function1 requiresFormScreen, Function1 transitionTo, InterfaceC1668n onFormFieldValuesChanged, Function0 manageScreenFactory, Function0 manageOneSavedPaymentMethodFactory, Function1 formScreenFactory, InterfaceC3698L paymentMethods, InterfaceC3698L mostRecentlySelectedSavedPaymentMethod, Function1 providePaymentMethodName, InterfaceC3698L canRemove, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, InterfaceC3698L walletsState, boolean z8, Function1 onMandateTextUpdated, Function1 updateSelection, InterfaceC3698L isCurrentScreen, Function1 reportPaymentMethodTypeSelected, Function1 reportFormShown, boolean z9, S5.g dispatcher) {
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(processing, "processing");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(formElementsForCode, "formElementsForCode");
        AbstractC3255y.i(requiresFormScreen, "requiresFormScreen");
        AbstractC3255y.i(transitionTo, "transitionTo");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(manageScreenFactory, "manageScreenFactory");
        AbstractC3255y.i(manageOneSavedPaymentMethodFactory, "manageOneSavedPaymentMethodFactory");
        AbstractC3255y.i(formScreenFactory, "formScreenFactory");
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3255y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3255y.i(canRemove, "canRemove");
        AbstractC3255y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3255y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3255y.i(walletsState, "walletsState");
        AbstractC3255y.i(onMandateTextUpdated, "onMandateTextUpdated");
        AbstractC3255y.i(updateSelection, "updateSelection");
        AbstractC3255y.i(isCurrentScreen, "isCurrentScreen");
        AbstractC3255y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3255y.i(reportFormShown, "reportFormShown");
        AbstractC3255y.i(dispatcher, "dispatcher");
        this.f7943a = formElementsForCode;
        this.f7944b = requiresFormScreen;
        this.f7945c = transitionTo;
        this.f7946d = onFormFieldValuesChanged;
        this.f7947e = manageScreenFactory;
        this.f7948f = manageOneSavedPaymentMethodFactory;
        this.f7949g = formScreenFactory;
        this.f7950h = mostRecentlySelectedSavedPaymentMethod;
        this.f7951i = providePaymentMethodName;
        this.f7952j = canRemove;
        this.f7953k = onEditPaymentMethod;
        this.f7954l = onSelectSavedPaymentMethod;
        this.f7955m = walletsState;
        this.f7956n = z8;
        this.f7957o = onMandateTextUpdated;
        this.f7958p = updateSelection;
        this.f7959q = isCurrentScreen;
        this.f7960r = reportPaymentMethodTypeSelected;
        this.f7961s = reportFormShown;
        this.f7962t = z9;
        M a8 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f7963u = a8;
        this.f7964v = paymentMethodMetadata.e0();
        InterfaceC3698L d8 = y4.g.d(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new d(paymentMethodMetadata));
        this.f7965w = d8;
        InterfaceC3698L e8 = y4.g.e(paymentMethods, d8, canRemove, new C0157c());
        this.f7966x = e8;
        this.f7967y = y4.g.h(paymentMethods, processing, selection, d8, walletsState, e8, new i());
        this.f7968z = y4.g.m(walletsState, new h());
        AbstractC3364k.d(a8, null, null, new a(selection, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a j(List list, C4033g c4033g, boolean z8) {
        if (list != null && c4033g != null) {
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    return n.a.f8134d;
                }
                return m(z8, c4033g);
            }
            return n.a.f8131a;
        }
        return n.a.f8131a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(List list, L3.n nVar) {
        List<C1625g> list2 = this.f7964v;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list2, 10));
        for (C1625g c1625g : list2) {
            arrayList.add(c1625g.a(list, new g(c1625g)));
        }
        ArrayList arrayList2 = new ArrayList();
        if (n(nVar)) {
            if (nVar != null && nVar.d() != null) {
                arrayList2.add(new O3.e(o.p.f25586h.f25605a, B2.c.a(AbstractC3407E.f34895z0), t3.t.f39737v, null, null, false, B2.c.a(AbstractC3407E.f34805A0), new e()));
            }
            if (nVar != null && nVar.c() != null) {
                arrayList2.add(new O3.e("google_pay", B2.c.a(AbstractC3407E.f34879r0), z.f35111b, null, null, false, null, new f()));
            }
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3255y.d(((O3.e) it.next()).a(), o.p.f25587i.f25605a)) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        List Z02 = AbstractC1378t.Z0(arrayList);
        Z02.addAll(i8 + 1, arrayList2);
        return Z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4033g l(List list, C1970d c1970d, com.stripe.android.model.o oVar) {
        if (oVar == null) {
            if (list != null) {
                oVar = (com.stripe.android.model.o) AbstractC1378t.o0(list);
            } else {
                oVar = null;
            }
        }
        if (oVar == null) {
            return null;
        }
        return q.a(oVar, this.f7951i, c1970d);
    }

    private final n.a m(boolean z8, C4033g c4033g) {
        if (c4033g != null && c4033g.f()) {
            return n.a.f8132b;
        }
        if (z8) {
            return n.a.f8133c;
        }
        return n.a.f8131a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(L3.n nVar) {
        if (this.f7956n && nVar != null && nVar.c() != null) {
            return true;
        }
        return false;
    }

    private final void o(String str) {
        this.f7946d.invoke(new z3.c(null, f.a.f810d, 1, null), str);
    }

    @Override // O3.n
    public void a(n.c viewAction) {
        B2.b bVar;
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof n.c.b) {
            n.c.b bVar2 = (n.c.b) viewAction;
            this.f7960r.invoke(bVar2.a());
            if (((Boolean) this.f7944b.invoke(bVar2.a())).booleanValue()) {
                this.f7961s.invoke(bVar2.a());
                this.f7945c.invoke(this.f7949g.invoke(bVar2.a()));
                return;
            }
            o(bVar2.a());
            Iterator it = ((Iterable) this.f7943a.invoke(bVar2.a())).iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar = ((D) it.next()).b();
                    if (bVar != null) {
                        break;
                    }
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null) {
                this.f7957o.invoke(bVar);
                return;
            }
            return;
        }
        if (viewAction instanceof n.c.C0163c) {
            this.f7960r.invoke("saved");
            this.f7954l.invoke(((n.c.C0163c) viewAction).a());
        } else if (AbstractC3255y.d(viewAction, n.c.e.f8147a)) {
            this.f7945c.invoke(this.f7947e.invoke());
        } else if (AbstractC3255y.d(viewAction, n.c.d.f8146a)) {
            this.f7945c.invoke(this.f7948f.invoke());
        } else if (viewAction instanceof n.c.a) {
            this.f7953k.invoke(((n.c.a) viewAction).a());
        }
    }

    @Override // O3.n
    public InterfaceC3698L b() {
        return this.f7968z;
    }

    @Override // O3.n
    public boolean c() {
        return this.f7962t;
    }

    @Override // O3.n
    public InterfaceC3698L getState() {
        return this.f7967y;
    }

    public /* synthetic */ c(C1970d c1970d, InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, Function1 function1, Function1 function12, Function1 function13, InterfaceC1668n interfaceC1668n, Function0 function0, Function0 function02, Function1 function14, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4, Function1 function15, InterfaceC3698L interfaceC3698L5, Function1 function16, Function1 function17, InterfaceC3698L interfaceC3698L6, boolean z8, Function1 function18, Function1 function19, InterfaceC3698L interfaceC3698L7, Function1 function110, Function1 function111, boolean z9, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(c1970d, interfaceC3698L, interfaceC3698L2, function1, function12, function13, interfaceC1668n, function0, function02, function14, interfaceC3698L3, interfaceC3698L4, function15, interfaceC3698L5, function16, function17, interfaceC3698L6, z8, function18, function19, interfaceC3698L7, function110, function111, z9, (i8 & 16777216) != 0 ? C3347b0.a() : gVar);
    }
}
