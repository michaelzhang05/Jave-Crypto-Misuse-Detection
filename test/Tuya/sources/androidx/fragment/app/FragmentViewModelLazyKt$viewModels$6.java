package androidx.fragment.app;

import L5.InterfaceC1227k;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$6 extends AbstractC3160z implements Function0 {
    final /* synthetic */ InterfaceC1227k $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$6(InterfaceC1227k interfaceC1227k) {
        super(0);
        this.$owner$delegate = interfaceC1227k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStoreOwner m5453viewModels$lambda1;
        m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.$owner$delegate);
        return m5453viewModels$lambda1.getViewModelStore();
    }
}
