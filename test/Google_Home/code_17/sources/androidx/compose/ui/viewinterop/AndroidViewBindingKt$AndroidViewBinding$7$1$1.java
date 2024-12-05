package androidx.compose.ui.viewinterop;

import O5.I;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AndroidViewBindingKt$AndroidViewBinding$7$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ FragmentManager $fragmentManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$7$1$1(FragmentManager fragmentManager) {
        super(1);
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FragmentContainerView) obj);
        return I.f8278a;
    }

    public final void invoke(FragmentContainerView fragmentContainerView) {
        FragmentManager fragmentManager = this.$fragmentManager;
        Fragment findFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
        if (findFragmentById == null || this.$fragmentManager.isStateSaved()) {
            return;
        }
        FragmentTransaction beginTransaction = this.$fragmentManager.beginTransaction();
        AbstractC3255y.h(beginTransaction, "beginTransaction()");
        beginTransaction.remove(findFragmentById);
        beginTransaction.commitNow();
    }
}
