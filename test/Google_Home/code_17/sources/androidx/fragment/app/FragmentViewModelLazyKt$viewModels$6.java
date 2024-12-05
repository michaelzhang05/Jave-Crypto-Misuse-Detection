package androidx.fragment.app;

import O5.InterfaceC1355k;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$6 extends AbstractC3256z implements Function0 {
    final /* synthetic */ InterfaceC1355k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$6(InterfaceC1355k interfaceC1355k) {
        super(0);
        this.$owner$delegate = interfaceC1355k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStoreOwner m5458viewModels$lambda1;
        m5458viewModels$lambda1 = FragmentViewModelLazyKt.m5458viewModels$lambda1(this.$owner$delegate);
        return m5458viewModels$lambda1.getViewModelStore();
    }
}
