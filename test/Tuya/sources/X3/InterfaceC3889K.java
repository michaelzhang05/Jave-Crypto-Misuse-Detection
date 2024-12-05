package x3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;

/* renamed from: x3.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3889K {

    /* renamed from: x3.K$a */
    /* loaded from: classes4.dex */
    public interface a {
        a a(SavedStateHandle savedStateHandle);

        a b(Application application);

        InterfaceC3889K build();

        a c(PaymentOptionContract.a aVar);
    }

    com.stripe.android.paymentsheet.t a();
}
