package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        AbstractC3255y.i(viewModelProvider, "<this>");
        AbstractC3255y.n(4, "VM");
        return (VM) viewModelProvider.get(U.b(ViewModel.class));
    }
}
