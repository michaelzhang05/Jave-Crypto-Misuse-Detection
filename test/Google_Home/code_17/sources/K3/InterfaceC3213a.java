package k3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import o6.v;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3213a {

    /* renamed from: k3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0781a {
        InterfaceC0781a a(SavedStateHandle savedStateHandle);

        InterfaceC0781a b(Application application);

        InterfaceC3213a build();

        InterfaceC0781a c(CollectBankAccountContract.a aVar);

        InterfaceC0781a d(v vVar);
    }

    com.stripe.android.payments.bankaccount.ui.b a();
}
