package q3;

import L5.x;
import M5.Q;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.o;
import k3.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import p3.AbstractC3601c;

/* renamed from: q3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3657j {

    /* renamed from: a, reason: collision with root package name */
    public static final C3657j f37338a = new C3657j();

    /* renamed from: b, reason: collision with root package name */
    public static final int f37339b = 8;

    private C3657j() {
    }

    public final InterfaceC3655h a() {
        return null;
    }

    public final void b(String externalPaymentMethodType, o.e eVar, Function1 onPaymentResult, ActivityResultLauncher activityResultLauncher, k3.i errorReporter) {
        AbstractC3159y.i(externalPaymentMethodType, "externalPaymentMethodType");
        AbstractC3159y.i(onPaymentResult, "onPaymentResult");
        AbstractC3159y.i(errorReporter, "errorReporter");
        i.b.a(errorReporter, i.d.f33412r, null, Q.e(x.a("external_payment_method_type", externalPaymentMethodType)), 2, null);
        onPaymentResult.invoke(new AbstractC3601c.d(new IllegalStateException("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: " + externalPaymentMethodType)));
    }

    public final void c(InterfaceC3655h interfaceC3655h) {
    }
}
