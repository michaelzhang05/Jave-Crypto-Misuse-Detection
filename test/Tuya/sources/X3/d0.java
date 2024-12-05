package x3;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.e;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3652e;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final PaymentSheetContractV2.a f39314a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return d0.this.f39314a.i();
        }
    }

    public d0(PaymentSheetContractV2.a starterArgs) {
        AbstractC3159y.i(starterArgs, "starterArgs");
        this.f39314a = starterArgs;
    }

    public final PaymentSheetContractV2.a b() {
        return this.f39314a;
    }

    public final q3.q c(Context appContext, P5.g workContext) {
        String str;
        AbstractC3159y.i(appContext, "appContext");
        AbstractC3159y.i(workContext, "workContext");
        u.i j8 = this.f39314a.b().j();
        if (j8 != null) {
            str = j8.getId();
        } else {
            str = null;
        }
        return new C3652e(appContext, str, workContext);
    }

    public final e.d d(SavedStateHandle savedStateHandle, I5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, J2.h googlePayPaymentMethodLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, com.stripe.android.paymentsheet.f intentConfirmationInterceptor, k3.i errorReporter, A2.h logger) {
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
        AbstractC3159y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
        AbstractC3159y.i(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        AbstractC3159y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
        AbstractC3159y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(logger, "logger");
        return new e.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, googlePayPaymentMethodLauncherFactory, savedStateHandle, new a(), errorReporter, logger);
    }
}
