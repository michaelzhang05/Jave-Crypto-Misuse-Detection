package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$activityViewModels$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        AbstractC3255y.h(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
