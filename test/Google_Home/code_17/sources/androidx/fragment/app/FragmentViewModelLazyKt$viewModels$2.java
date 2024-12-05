package androidx.fragment.app;

import O5.InterfaceC1355k;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$2 extends AbstractC3256z implements Function0 {
    final /* synthetic */ InterfaceC1355k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$2(InterfaceC1355k interfaceC1355k) {
        super(0);
        this.$owner$delegate = interfaceC1355k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStoreOwner m5457viewModels$lambda0;
        m5457viewModels$lambda0 = FragmentViewModelLazyKt.m5457viewModels$lambda0(this.$owner$delegate);
        return m5457viewModels$lambda0.getViewModelStore();
    }
}
