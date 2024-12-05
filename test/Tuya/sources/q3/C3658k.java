package q3;

import J3.AbstractC1195c;
import L5.I;
import M5.AbstractC1246t;
import Y2.h;
import com.stripe.android.model.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l2.InterfaceC3167b;
import m4.D;
import w3.C3847b;
import y3.AbstractC3991f;

/* renamed from: q3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3658k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f37340g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f37341h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3167b.a f37342a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2.d f37343b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f37344c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f37345d;

    /* renamed from: e, reason: collision with root package name */
    private final K2.e f37346e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f37347f;

    /* renamed from: q3.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0855a extends C3156v implements Function1 {
            C0855a(Object obj) {
                super(1, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0);
            }

            public final void d(T2.e p02) {
                AbstractC3159y.i(p02, "p0");
                ((m) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((T2.e) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.k$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f37348a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(M3.a aVar) {
                super(0);
                this.f37348a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.j invoke() {
                return this.f37348a.s();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q3.k$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f37349a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(M3.a aVar) {
                super(1);
                this.f37349a = aVar;
            }

            public final void a(AbstractC3991f abstractC3991f) {
                this.f37349a.M(abstractC3991f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC3991f) obj);
                return I.f6487a;
            }
        }

        private a() {
        }

        public final C3658k a(M3.a viewModel, m linkInlineHandler, Y2.d paymentMethodMetadata) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(linkInlineHandler, "linkInlineHandler");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            return new C3658k(viewModel.e(), paymentMethodMetadata, new b(viewModel), new c(viewModel), viewModel.p().e(), new C0855a(linkInlineHandler));
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3658k(InterfaceC3167b.a cardAccountRangeRepositoryFactory, Y2.d paymentMethodMetadata, Function0 newPaymentSelectionProvider, Function1 selectionUpdater, K2.e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(newPaymentSelectionProvider, "newPaymentSelectionProvider");
        AbstractC3159y.i(selectionUpdater, "selectionUpdater");
        AbstractC3159y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3159y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f37342a = cardAccountRangeRepositoryFactory;
        this.f37343b = paymentMethodMetadata;
        this.f37344c = newPaymentSelectionProvider;
        this.f37345d = selectionUpdater;
        this.f37346e = linkConfigurationCoordinator;
        this.f37347f = onLinkInlineSignupStateChanged;
    }

    private final X2.g e(String str) {
        X2.g g02 = this.f37343b.g0(str);
        if (g02 != null) {
            return g02;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final A3.a a(String paymentMethodCode) {
        AbstractC3159y.i(paymentMethodCode, "paymentMethodCode");
        return C3847b.f39007a.b(paymentMethodCode, this.f37343b);
    }

    public final List b(String code) {
        com.stripe.android.model.p pVar;
        AbstractC3159y.i(code, "code");
        com.stripe.android.paymentsheet.j jVar = (com.stripe.android.paymentsheet.j) this.f37344c.invoke();
        com.stripe.android.model.q qVar = null;
        if (jVar == null || !AbstractC3159y.d(jVar.getType(), code)) {
            jVar = null;
        }
        Y2.d dVar = this.f37343b;
        InterfaceC3167b.a aVar = this.f37342a;
        K2.e eVar = this.f37346e;
        Function1 function1 = this.f37347f;
        if (jVar != null) {
            pVar = jVar.c();
        } else {
            pVar = null;
        }
        if (jVar != null) {
            qVar = jVar.a();
        }
        List j8 = dVar.j(code, new h.a.InterfaceC0245a.C0246a(aVar, eVar, function1, pVar, qVar));
        if (j8 == null) {
            return AbstractC1246t.m();
        }
        return j8;
    }

    public final void c(w3.c cVar, String selectedPaymentMethodCode) {
        AbstractC3991f abstractC3991f;
        AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        if (cVar != null) {
            abstractC3991f = AbstractC1195c.g(cVar, e(selectedPaymentMethodCode), this.f37343b);
        } else {
            abstractC3991f = null;
        }
        this.f37345d.invoke(abstractC3991f);
    }

    public final boolean d(String selectedPaymentMethodCode) {
        AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        List b8 = b(selectedPaymentMethodCode);
        if (!(b8 instanceof Collection) || !b8.isEmpty()) {
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                if (((D) it.next()).c()) {
                    break;
                }
            }
        }
        if (!AbstractC3159y.d(selectedPaymentMethodCode, o.p.f24522O.f24550a) && !AbstractC3159y.d(selectedPaymentMethodCode, o.p.f24531h.f24550a)) {
            return false;
        }
        return true;
    }
}
