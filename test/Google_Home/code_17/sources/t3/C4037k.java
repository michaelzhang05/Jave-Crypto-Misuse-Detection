package t3;

import M3.AbstractC1308c;
import O5.I;
import P5.AbstractC1378t;
import a3.C1625g;
import b3.C1970d;
import b3.InterfaceC1974h;
import com.stripe.android.model.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import o2.InterfaceC3515b;
import p4.D;
import z3.C4227b;

/* renamed from: t3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4037k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f39662g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f39663h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3515b.a f39664a;

    /* renamed from: b, reason: collision with root package name */
    private final C1970d f39665b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f39666c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f39667d;

    /* renamed from: e, reason: collision with root package name */
    private final N2.e f39668e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f39669f;

    /* renamed from: t3.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0888a extends C3252v implements Function1 {
            C0888a(Object obj) {
                super(1, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0);
            }

            public final void d(W2.e p02) {
                AbstractC3255y.i(p02, "p0");
                ((m) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((W2.e) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.k$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f39670a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P3.a aVar) {
                super(0);
                this.f39670a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.j invoke() {
                return this.f39670a.s();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.k$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f39671a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P3.a aVar) {
                super(1);
                this.f39671a = aVar;
            }

            public final void a(B3.f fVar) {
                this.f39671a.M(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B3.f) obj);
                return I.f8278a;
            }
        }

        private a() {
        }

        public final C4037k a(P3.a viewModel, m linkInlineHandler, C1970d paymentMethodMetadata) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(linkInlineHandler, "linkInlineHandler");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            return new C4037k(viewModel.e(), paymentMethodMetadata, new b(viewModel), new c(viewModel), viewModel.p().e(), new C0888a(linkInlineHandler));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C4037k(InterfaceC3515b.a cardAccountRangeRepositoryFactory, C1970d paymentMethodMetadata, Function0 newPaymentSelectionProvider, Function1 selectionUpdater, N2.e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(newPaymentSelectionProvider, "newPaymentSelectionProvider");
        AbstractC3255y.i(selectionUpdater, "selectionUpdater");
        AbstractC3255y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3255y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f39664a = cardAccountRangeRepositoryFactory;
        this.f39665b = paymentMethodMetadata;
        this.f39666c = newPaymentSelectionProvider;
        this.f39667d = selectionUpdater;
        this.f39668e = linkConfigurationCoordinator;
        this.f39669f = onLinkInlineSignupStateChanged;
    }

    private final C1625g e(String str) {
        C1625g g02 = this.f39665b.g0(str);
        if (g02 != null) {
            return g02;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final D3.a a(String paymentMethodCode) {
        AbstractC3255y.i(paymentMethodCode, "paymentMethodCode");
        return C4227b.f41130a.b(paymentMethodCode, this.f39665b);
    }

    public final List b(String code) {
        com.stripe.android.model.p pVar;
        AbstractC3255y.i(code, "code");
        com.stripe.android.paymentsheet.j jVar = (com.stripe.android.paymentsheet.j) this.f39666c.invoke();
        com.stripe.android.model.q qVar = null;
        if (jVar == null || !AbstractC3255y.d(jVar.getType(), code)) {
            jVar = null;
        }
        C1970d c1970d = this.f39665b;
        InterfaceC3515b.a aVar = this.f39664a;
        N2.e eVar = this.f39668e;
        Function1 function1 = this.f39669f;
        if (jVar != null) {
            pVar = jVar.c();
        } else {
            pVar = null;
        }
        if (jVar != null) {
            qVar = jVar.a();
        }
        List l8 = c1970d.l(code, new InterfaceC1974h.a.InterfaceC0359a.C0360a(aVar, eVar, function1, pVar, qVar));
        if (l8 == null) {
            return AbstractC1378t.m();
        }
        return l8;
    }

    public final void c(z3.c cVar, String selectedPaymentMethodCode) {
        B3.f fVar;
        AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        if (cVar != null) {
            fVar = AbstractC1308c.g(cVar, e(selectedPaymentMethodCode), this.f39665b);
        } else {
            fVar = null;
        }
        this.f39667d.invoke(fVar);
    }

    public final boolean d(String selectedPaymentMethodCode) {
        AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        List b8 = b(selectedPaymentMethodCode);
        if (!(b8 instanceof Collection) || !b8.isEmpty()) {
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                if (((D) it.next()).c()) {
                    break;
                }
            }
        }
        if (!AbstractC3255y.d(selectedPaymentMethodCode, o.p.f25577O.f25605a) && !AbstractC3255y.d(selectedPaymentMethodCode, o.p.f25586h.f25605a)) {
            return false;
        }
        return true;
    }
}
