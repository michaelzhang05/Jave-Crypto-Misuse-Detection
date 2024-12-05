package androidx.fragment.app;

import L5.InterfaceC1227k;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$viewModels$8 extends AbstractC3160z implements Function0 {
    final /* synthetic */ InterfaceC1227k $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$8(Fragment fragment, InterfaceC1227k interfaceC1227k) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = interfaceC1227k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        ViewModelStoreOwner m5453viewModels$lambda1;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        m5453viewModels$lambda1 = FragmentViewModelLazyKt.m5453viewModels$lambda1(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5453viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5453viewModels$lambda1 : null;
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
        AbstractC3159y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }
}
