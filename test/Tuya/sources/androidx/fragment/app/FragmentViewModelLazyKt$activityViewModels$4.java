package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt$activityViewModels$4 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$4(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        AbstractC3159y.h(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
