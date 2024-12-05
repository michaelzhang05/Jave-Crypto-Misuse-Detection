package t3;

import O5.x;
import P5.Q;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import s3.AbstractC3995c;

/* renamed from: t3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4036j {

    /* renamed from: a, reason: collision with root package name */
    public static final C4036j f39660a = new C4036j();

    /* renamed from: b, reason: collision with root package name */
    public static final int f39661b = 8;

    private C4036j() {
    }

    public final InterfaceC4034h a() {
        return null;
    }

    public final void b(String externalPaymentMethodType, o.e eVar, Function1 onPaymentResult, ActivityResultLauncher activityResultLauncher, n3.i errorReporter) {
        AbstractC3255y.i(externalPaymentMethodType, "externalPaymentMethodType");
        AbstractC3255y.i(onPaymentResult, "onPaymentResult");
        AbstractC3255y.i(errorReporter, "errorReporter");
        i.b.a(errorReporter, i.d.f35404r, null, Q.e(x.a("external_payment_method_type", externalPaymentMethodType)), 2, null);
        onPaymentResult.invoke(new AbstractC3995c.d(new IllegalStateException("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: " + externalPaymentMethodType)));
    }

    public final void c(InterfaceC4034h interfaceC4034h) {
    }
}
