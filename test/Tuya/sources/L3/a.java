package L3;

import L3.f;
import L5.I;
import M5.AbstractC1246t;
import com.stripe.android.paymentsheet.B;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;
import q3.C3649b;

/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final C0120a f6115d = new C0120a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f6116e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f6117a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f6118b;

    /* renamed from: c, reason: collision with root package name */
    private final f.a f6119c;

    /* renamed from: L3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0120a {

        /* renamed from: L3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0121a extends C3156v implements Function1 {
            C0121a(Object obj) {
                super(1, obj, B.class, "removePaymentMethod", "removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V", 0);
            }

            public final void d(com.stripe.android.model.o p02) {
                AbstractC3159y.i(p02, "p0");
                ((B) this.receiver).u(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((com.stripe.android.model.o) obj);
                return I.f6487a;
            }
        }

        /* renamed from: L3.a$a$b */
        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3156v implements Function0 {
            b(Object obj) {
                super(0, obj, M3.a.class, "handleBackPressed", "handleBackPressed()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m41invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m41invoke() {
                ((M3.a) this.receiver).C();
            }
        }

        private C0120a() {
        }

        public final f a(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder, B savedPaymentMethodMutator) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            AbstractC3159y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new a((com.stripe.android.model.o) AbstractC1246t.m0((List) customerStateHolder.c().getValue()), paymentMethodMetadata, savedPaymentMethodMutator.q(), new C0121a(savedPaymentMethodMutator), new b(viewModel));
        }

        public /* synthetic */ C0120a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public a(com.stripe.android.model.o paymentMethod, Y2.d paymentMethodMetadata, Function1 providePaymentMethodName, Function1 onDeletePaymentMethod, Function0 navigateBack) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3159y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3159y.i(navigateBack, "navigateBack");
        this.f6117a = onDeletePaymentMethod;
        this.f6118b = navigateBack;
        this.f6119c = new f.a(q.a(paymentMethod, providePaymentMethodName, paymentMethodMetadata), paymentMethodMetadata.V().a());
    }

    @Override // L3.f
    public void a(f.b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof f.b.a) {
            this.f6117a.invoke(getState().a().d());
            this.f6118b.invoke();
        }
    }

    @Override // L3.f
    public f.a getState() {
        return this.f6119c;
    }
}
