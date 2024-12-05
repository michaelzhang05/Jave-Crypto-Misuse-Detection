package L3;

import L3.a;
import L3.b;
import L3.n;
import L5.I;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import j2.AbstractC3053E;
import j2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.D;
import q3.C3649b;
import q3.C3654g;
import q3.C3658k;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.C4020b;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class c implements n {

    /* renamed from: A, reason: collision with root package name */
    public static final b f6150A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f6151B = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f6152a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f6153b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f6154c;

    /* renamed from: d, reason: collision with root package name */
    private final X5.n f6155d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f6156e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6157f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f6158g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f6159h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f6160i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3349K f6161j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6162k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f6163l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f6164m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f6165n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f6166o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f6167p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3349K f6168q;

    /* renamed from: r, reason: collision with root package name */
    private final Function1 f6169r;

    /* renamed from: s, reason: collision with root package name */
    private final Function1 f6170s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f6171t;

    /* renamed from: u, reason: collision with root package name */
    private final M f6172u;

    /* renamed from: v, reason: collision with root package name */
    private final List f6173v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3349K f6174w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3349K f6175x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3349K f6176y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3349K f6177z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f6178a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f6180c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0126a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3349K f6181a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6182b;

            C0126a(InterfaceC3349K interfaceC3349K, c cVar) {
                this.f6181a = interfaceC3349K;
                this.f6182b = cVar;
            }

            public final Object b(boolean z8, P5.d dVar) {
                if (!z8) {
                    return I.f6487a;
                }
                AbstractC3991f abstractC3991f = (AbstractC3991f) this.f6181a.getValue();
                if (abstractC3991f == null) {
                    return I.f6487a;
                }
                if (!(abstractC3991f instanceof AbstractC3991f.C0916f)) {
                    this.f6182b.f6167p.invoke(null);
                }
                return I.f6487a;
            }

            @Override // l6.InterfaceC3359g
            public /* bridge */ /* synthetic */ Object emit(Object obj, P5.d dVar) {
                return b(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3349K interfaceC3349K, P5.d dVar) {
            super(2, dVar);
            this.f6180c = interfaceC3349K;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f6180c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6178a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f o8 = AbstractC3360h.o(c.this.f6168q, 2);
                C0126a c0126a = new C0126a(this.f6180c, c.this);
                this.f6178a = 1;
                if (o8.collect(c0126a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6183a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6185c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(0);
                this.f6183a = aVar;
                this.f6184b = dVar;
                this.f6185c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke() {
                a.C0120a c0120a = L3.a.f6115d;
                M3.a aVar = this.f6183a;
                return new InterfaceC4021c.h(c0120a.a(aVar, this.f6184b, this.f6185c, aVar.w()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0127b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6187b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6188c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0127b(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(1);
                this.f6186a = aVar;
                this.f6187b = dVar;
                this.f6188c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke(String selectedPaymentMethodCode) {
                AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                return new InterfaceC4021c.l(L3.d.f6205l.a(selectedPaymentMethodCode, this.f6186a, this.f6187b, this.f6188c), false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0128c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6189a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0128c(M3.a aVar) {
                super(1);
                this.f6189a = aVar;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                this.f6189a.w().s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6190a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(M3.a aVar) {
                super(1);
                this.f6190a = aVar;
            }

            public final void a(com.stripe.android.model.o it) {
                AbstractC3159y.i(it, "it");
                this.f6190a.E(new AbstractC3991f.C0916f(it, null, null, 6, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.model.o) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6191a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M3.a aVar) {
                super(1);
                this.f6191a = aVar;
            }

            public final void a(InterfaceC3983b interfaceC3983b) {
                this.f6191a.q().e(interfaceC3983b, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC3983b) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class f extends C3156v implements Function1 {
            f(Object obj) {
                super(1, obj, C3658k.class, "formElementsForCode", "formElementsForCode(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return ((C3658k) this.receiver).b(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class g extends C3156v implements Function1 {
            g(Object obj) {
                super(1, obj, C3658k.class, "requiresFormScreen", "requiresFormScreen(Ljava/lang/String;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String p02) {
                AbstractC3159y.i(p02, "p0");
                return Boolean.valueOf(((C3658k) this.receiver).d(p02));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class h extends C3156v implements Function1 {
            h(Object obj) {
                super(1, obj, C4020b.class, "transitionToWithDelay", "transitionToWithDelay(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V", 0);
            }

            public final void d(InterfaceC4021c p02) {
                AbstractC3159y.i(p02, "p0");
                ((C4020b) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((InterfaceC4021c) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class i extends C3156v implements X5.n {
            i(Object obj) {
                super(2, obj, C3658k.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
            }

            public final void d(w3.c cVar, String p12) {
                AbstractC3159y.i(p12, "p1");
                ((C3658k) this.receiver).c(cVar, p12);
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((w3.c) obj, (String) obj2);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class j extends C3156v implements Function1 {
            j(Object obj) {
                super(1, obj, M3.a.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0);
            }

            public final void d(AbstractC3991f abstractC3991f) {
                ((M3.a) this.receiver).M(abstractC3991f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((AbstractC3991f) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class k extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final k f6192a = new k();

            k() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC4021c it) {
                AbstractC3159y.i(it, "it");
                return Boolean.valueOf(it instanceof InterfaceC4021c.k);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class l extends C3156v implements Function1 {
            l(Object obj) {
                super(1, obj, EventReporter.class, "onSelectPaymentMethod", "onSelectPaymentMethod(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((EventReporter) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class m extends C3156v implements Function1 {
            m(Object obj) {
                super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3159y.i(p02, "p0");
                ((EventReporter) this.receiver).o(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class n extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6193a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y2.d f6194b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3649b f6195c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(M3.a aVar, Y2.d dVar, C3649b c3649b) {
                super(0);
                this.f6193a = aVar;
                this.f6194b = dVar;
                this.f6195c = c3649b;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4021c invoke() {
                b.c cVar = L3.b.f6120q;
                M3.a aVar = this.f6193a;
                return new InterfaceC4021c.i(cVar.b(aVar, this.f6194b, this.f6195c, aVar.w()));
            }
        }

        private b() {
        }

        public final L3.n a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            C3658k a8 = C3658k.f37340g.a(viewModel, q3.m.f37350h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata);
            return new c(paymentMethodMetadata, viewModel.v(), viewModel.y(), new f(a8), new g(a8), new h(viewModel.r()), new i(a8), new n(viewModel, paymentMethodMetadata, customerStateHolder), new a(viewModel, paymentMethodMetadata, customerStateHolder), new C0127b(viewModel, paymentMethodMetadata, customerStateHolder), customerStateHolder.c(), customerStateHolder.b(), viewModel.w().q(), viewModel.w().m(), new C0128c(viewModel), new d(viewModel), viewModel.A(), !viewModel.F(), new e(viewModel), new j(viewModel), v4.g.m(viewModel.r().f(), k.f6192a), new l(viewModel.n()), new m(viewModel.n()), paymentMethodMetadata.V().a(), null, 16777216, null);
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: L3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0129c extends AbstractC3160z implements X5.o {
        C0129c() {
            super(3);
        }

        public final n.a a(List paymentMethods, C3654g c3654g, boolean z8) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            return c.this.j(paymentMethods, c3654g, z8);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((List) obj, (C3654g) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y2.d f6198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y2.d dVar) {
            super(2);
            this.f6198b = dVar;
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3654g invoke(List paymentMethods, com.stripe.android.model.o oVar) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            return c.this.l(paymentMethods, this.f6198b, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m43invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m43invoke() {
            c.this.f6167p.invoke(AbstractC3991f.d.f39777a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m44invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m44invoke() {
            c.this.f6167p.invoke(AbstractC3991f.c.f39776a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.g f6202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(X2.g gVar) {
            super(0);
            this.f6202b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
            c.this.b(new n.c.b(this.f6202b.d()));
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I3.n nVar) {
            return Boolean.valueOf(!c.this.n(nVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements X5.r {
        i() {
            super(6);
        }

        public final n.b a(List paymentMethods, boolean z8, AbstractC3991f abstractC3991f, C3654g c3654g, I3.n nVar, n.a action) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            AbstractC3159y.i(action, "action");
            return new n.b(c.this.k(paymentMethods, nVar), z8, abstractC3991f, c3654g, action);
        }

        @Override // X5.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return a((List) obj, ((Boolean) obj2).booleanValue(), (AbstractC3991f) obj3, (C3654g) obj4, (I3.n) obj5, (n.a) obj6);
        }
    }

    public c(Y2.d paymentMethodMetadata, InterfaceC3349K processing, InterfaceC3349K selection, Function1 formElementsForCode, Function1 requiresFormScreen, Function1 transitionTo, X5.n onFormFieldValuesChanged, Function0 manageScreenFactory, Function0 manageOneSavedPaymentMethodFactory, Function1 formScreenFactory, InterfaceC3349K paymentMethods, InterfaceC3349K mostRecentlySelectedSavedPaymentMethod, Function1 providePaymentMethodName, InterfaceC3349K canRemove, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, InterfaceC3349K walletsState, boolean z8, Function1 onMandateTextUpdated, Function1 updateSelection, InterfaceC3349K isCurrentScreen, Function1 reportPaymentMethodTypeSelected, Function1 reportFormShown, boolean z9, P5.g dispatcher) {
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(processing, "processing");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(formElementsForCode, "formElementsForCode");
        AbstractC3159y.i(requiresFormScreen, "requiresFormScreen");
        AbstractC3159y.i(transitionTo, "transitionTo");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(manageScreenFactory, "manageScreenFactory");
        AbstractC3159y.i(manageOneSavedPaymentMethodFactory, "manageOneSavedPaymentMethodFactory");
        AbstractC3159y.i(formScreenFactory, "formScreenFactory");
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3159y.i(canRemove, "canRemove");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3159y.i(walletsState, "walletsState");
        AbstractC3159y.i(onMandateTextUpdated, "onMandateTextUpdated");
        AbstractC3159y.i(updateSelection, "updateSelection");
        AbstractC3159y.i(isCurrentScreen, "isCurrentScreen");
        AbstractC3159y.i(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        AbstractC3159y.i(reportFormShown, "reportFormShown");
        AbstractC3159y.i(dispatcher, "dispatcher");
        this.f6152a = formElementsForCode;
        this.f6153b = requiresFormScreen;
        this.f6154c = transitionTo;
        this.f6155d = onFormFieldValuesChanged;
        this.f6156e = manageScreenFactory;
        this.f6157f = manageOneSavedPaymentMethodFactory;
        this.f6158g = formScreenFactory;
        this.f6159h = mostRecentlySelectedSavedPaymentMethod;
        this.f6160i = providePaymentMethodName;
        this.f6161j = canRemove;
        this.f6162k = onEditPaymentMethod;
        this.f6163l = onSelectSavedPaymentMethod;
        this.f6164m = walletsState;
        this.f6165n = z8;
        this.f6166o = onMandateTextUpdated;
        this.f6167p = updateSelection;
        this.f6168q = isCurrentScreen;
        this.f6169r = reportPaymentMethodTypeSelected;
        this.f6170s = reportFormShown;
        this.f6171t = z9;
        M a8 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f6172u = a8;
        this.f6173v = paymentMethodMetadata.e0();
        InterfaceC3349K d8 = v4.g.d(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new d(paymentMethodMetadata));
        this.f6174w = d8;
        InterfaceC3349K e8 = v4.g.e(paymentMethods, d8, canRemove, new C0129c());
        this.f6175x = e8;
        this.f6176y = v4.g.h(paymentMethods, processing, selection, d8, walletsState, e8, new i());
        this.f6177z = v4.g.m(walletsState, new h());
        AbstractC2829k.d(a8, null, null, new a(selection, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.a j(List list, C3654g c3654g, boolean z8) {
        if (list != null && c3654g != null) {
            int size = list.size();
            if (size != 0) {
                if (size != 1) {
                    return n.a.f6343d;
                }
                return m(z8, c3654g);
            }
            return n.a.f6340a;
        }
        return n.a.f6340a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k(List list, I3.n nVar) {
        List<X2.g> list2 = this.f6173v;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list2, 10));
        for (X2.g gVar : list2) {
            arrayList.add(gVar.a(list, new g(gVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        if (n(nVar)) {
            if (nVar != null && nVar.d() != null) {
                arrayList2.add(new L3.e(o.p.f24531h.f24550a, AbstractC3984c.a(AbstractC3053E.f32919z0), q3.t.f37415v, null, null, false, AbstractC3984c.a(AbstractC3053E.f32829A0), new e()));
            }
            if (nVar != null && nVar.c() != null) {
                arrayList2.add(new L3.e("google_pay", AbstractC3984c.a(AbstractC3053E.f32903r0), z.f33135b, null, null, false, null, new f()));
            }
        }
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3159y.d(((L3.e) it.next()).a(), o.p.f24532i.f24550a)) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        List Z02 = AbstractC1246t.Z0(arrayList);
        Z02.addAll(i8 + 1, arrayList2);
        return Z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3654g l(List list, Y2.d dVar, com.stripe.android.model.o oVar) {
        if (oVar == null) {
            if (list != null) {
                oVar = (com.stripe.android.model.o) AbstractC1246t.o0(list);
            } else {
                oVar = null;
            }
        }
        if (oVar == null) {
            return null;
        }
        return q.a(oVar, this.f6160i, dVar);
    }

    private final n.a m(boolean z8, C3654g c3654g) {
        if (c3654g != null && c3654g.f()) {
            return n.a.f6341b;
        }
        if (z8) {
            return n.a.f6342c;
        }
        return n.a.f6340a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(I3.n nVar) {
        if (this.f6165n && nVar != null && nVar.c() != null) {
            return true;
        }
        return false;
    }

    private final void o(String str) {
        this.f6155d.invoke(new w3.c(null, AbstractC3991f.a.f39766d, 1, null), str);
    }

    @Override // L3.n
    public boolean a() {
        return this.f6171t;
    }

    @Override // L3.n
    public void b(n.c viewAction) {
        InterfaceC3983b interfaceC3983b;
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof n.c.b) {
            n.c.b bVar = (n.c.b) viewAction;
            this.f6169r.invoke(bVar.a());
            if (((Boolean) this.f6153b.invoke(bVar.a())).booleanValue()) {
                this.f6170s.invoke(bVar.a());
                this.f6154c.invoke(this.f6158g.invoke(bVar.a()));
                return;
            }
            o(bVar.a());
            Iterator it = ((Iterable) this.f6152a.invoke(bVar.a())).iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC3983b = ((D) it.next()).b();
                    if (interfaceC3983b != null) {
                        break;
                    }
                } else {
                    interfaceC3983b = null;
                    break;
                }
            }
            if (interfaceC3983b != null) {
                this.f6166o.invoke(interfaceC3983b);
                return;
            }
            return;
        }
        if (viewAction instanceof n.c.C0135c) {
            this.f6169r.invoke("saved");
            this.f6163l.invoke(((n.c.C0135c) viewAction).a());
        } else if (AbstractC3159y.d(viewAction, n.c.e.f6356a)) {
            this.f6154c.invoke(this.f6156e.invoke());
        } else if (AbstractC3159y.d(viewAction, n.c.d.f6355a)) {
            this.f6154c.invoke(this.f6157f.invoke());
        } else if (viewAction instanceof n.c.a) {
            this.f6162k.invoke(((n.c.a) viewAction).a());
        }
    }

    @Override // L3.n
    public InterfaceC3349K c() {
        return this.f6177z;
    }

    @Override // L3.n
    public InterfaceC3349K getState() {
        return this.f6176y;
    }

    public /* synthetic */ c(Y2.d dVar, InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, Function1 function1, Function1 function12, Function1 function13, X5.n nVar, Function0 function0, Function0 function02, Function1 function14, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, Function1 function15, InterfaceC3349K interfaceC3349K5, Function1 function16, Function1 function17, InterfaceC3349K interfaceC3349K6, boolean z8, Function1 function18, Function1 function19, InterfaceC3349K interfaceC3349K7, Function1 function110, Function1 function111, boolean z9, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(dVar, interfaceC3349K, interfaceC3349K2, function1, function12, function13, nVar, function0, function02, function14, interfaceC3349K3, interfaceC3349K4, function15, interfaceC3349K5, function16, function17, interfaceC3349K6, z8, function18, function19, interfaceC3349K7, function110, function111, z9, (i8 & 16777216) != 0 ? C2812b0.a() : gVar);
    }
}
