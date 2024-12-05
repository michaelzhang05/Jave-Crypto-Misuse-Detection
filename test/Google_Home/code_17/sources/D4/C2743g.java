package d4;

import a4.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2743g extends FragmentFactory {

    /* renamed from: a, reason: collision with root package name */
    private final W3.m f31177a;

    /* renamed from: b, reason: collision with root package name */
    private final v f31178b;

    /* renamed from: c, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f31179c;

    /* renamed from: d, reason: collision with root package name */
    private final X3.c f31180d;

    /* renamed from: e, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f31181e;

    /* renamed from: f, reason: collision with root package name */
    private final b4.g f31182f;

    /* renamed from: g, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.n f31183g;

    /* renamed from: h, reason: collision with root package name */
    private final S5.g f31184h;

    public C2743g(W3.m uiCustomization, v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, X3.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, b4.g gVar, com.stripe.android.stripe3ds2.transaction.n intentData, S5.g workContext) {
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        AbstractC3255y.i(transactionTimer, "transactionTimer");
        AbstractC3255y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3255y.i(intentData, "intentData");
        AbstractC3255y.i(workContext, "workContext");
        this.f31177a = uiCustomization;
        this.f31178b = transactionTimer;
        this.f31179c = errorRequestExecutor;
        this.f31180d = errorReporter;
        this.f31181e = challengeActionHandler;
        this.f31182f = gVar;
        this.f31183g = intentData;
        this.f31184h = workContext;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public Fragment instantiate(ClassLoader classLoader, String className) {
        AbstractC3255y.i(classLoader, "classLoader");
        AbstractC3255y.i(className, "className");
        if (AbstractC3255y.d(className, com.stripe.android.stripe3ds2.views.c.class.getName())) {
            return new com.stripe.android.stripe3ds2.views.c(this.f31177a, this.f31178b, this.f31179c, this.f31180d, this.f31181e, this.f31182f, this.f31183g, this.f31184h);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        AbstractC3255y.f(instantiate);
        return instantiate;
    }
}
