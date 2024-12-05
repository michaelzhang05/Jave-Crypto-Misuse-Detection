package h3;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import l6.u;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2746a {

    /* renamed from: h3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0755a {
        InterfaceC0755a a(SavedStateHandle savedStateHandle);

        InterfaceC0755a b(Application application);

        InterfaceC2746a build();

        InterfaceC0755a c(CollectBankAccountContract.a aVar);

        InterfaceC0755a d(u uVar);
    }

    com.stripe.android.payments.bankaccount.ui.b a();
}
