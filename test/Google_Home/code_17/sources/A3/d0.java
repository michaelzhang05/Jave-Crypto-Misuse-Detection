package A3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.e;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4031e;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentSheetContractV2.a f309a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return d0.this.f309a.i();
        }
    }

    public d0(PaymentSheetContractV2.a starterArgs) {
        AbstractC3255y.i(starterArgs, "starterArgs");
        this.f309a = starterArgs;
    }

    public final PaymentSheetContractV2.a b() {
        return this.f309a;
    }

    public final t3.q c(Context appContext, S5.g workContext) {
        String str;
        AbstractC3255y.i(appContext, "appContext");
        AbstractC3255y.i(workContext, "workContext");
        u.i l8 = this.f309a.a().l();
        if (l8 != null) {
            str = l8.getId();
        } else {
            str = null;
        }
        return new C4031e(appContext, str, workContext);
    }

    public final e.d d(SavedStateHandle savedStateHandle, L5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, M2.h googlePayPaymentMethodLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, com.stripe.android.paymentsheet.f intentConfirmationInterceptor, n3.i errorReporter, D2.h logger) {
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3255y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3255y.i(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        AbstractC3255y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
        AbstractC3255y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(logger, "logger");
        return new e.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, savedStateHandle, new a(), errorReporter, logger);
    }
}
