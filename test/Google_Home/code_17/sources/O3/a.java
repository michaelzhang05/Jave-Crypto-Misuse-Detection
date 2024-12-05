package O3;

import O3.f;
import O5.I;
import P5.AbstractC1378t;
import b3.C1970d;
import com.stripe.android.paymentsheet.B;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;
import t3.C4028b;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final C0148a f7906d = new C0148a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f7907e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f7908a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f7909b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f7910c;

    /* renamed from: O3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0148a {

        /* renamed from: O3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0149a extends C3252v implements Function1 {
            C0149a(Object obj) {
                super(1, obj, B.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3255y.i(p02, "p0");
                ((B) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return I.f8278a;
            }
        }

        /* renamed from: O3.a$a$b */
        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3252v implements Function0 {
            b(Object obj) {
                super(0, obj, P3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m46invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m46invoke() {
                ((P3.a) this.receiver).C();
            }
        }

        private C0148a() {
        }

        public final f a(P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder, B savedPaymentMethodMutator) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(customerStateHolder, "customerStateHolder");
            AbstractC3255y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new a((com.stripe.android.model.o) AbstractC1378t.m0((List) customerStateHolder.c().getValue()), paymentMethodMetadata, savedPaymentMethodMutator.q(), new C0149a(savedPaymentMethodMutator), new b(viewModel));
        }

        public /* synthetic */ C0148a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public a(com.stripe.android.model.o paymentMethod, C1970d paymentMethodMetadata, Function1 providePaymentMethodName, Function1 onDeletePaymentMethod, Function0 navigateBack) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3255y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3255y.i(navigateBack, "navigateBack");
        this.f7908a = onDeletePaymentMethod;
        this.f7909b = navigateBack;
        this.f7910c = new f.a(q.a(paymentMethod, providePaymentMethodName, paymentMethodMetadata), paymentMethodMetadata.W().c());
    }

    @Override // O3.f
    public void a(f.b viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof f.b.a) {
            this.f7908a.invoke(getState().a().d());
            this.f7909b.invoke();
        }
    }

    @Override // O3.f
    public f.a getState() {
        return this.f7910c;
    }
}
