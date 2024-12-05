package androidx.compose.ui.viewinterop;

import a6.InterfaceC1669o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$5 extends AbstractC3256z implements Function1 {
    final /* synthetic */ InterfaceC1669o $factory;
    final /* synthetic */ Fragment $parentFragment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$5(Fragment fragment, InterfaceC1669o interfaceC1669o) {
        super(1);
        this.$parentFragment = fragment;
        this.$factory = interfaceC1669o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        LayoutInflater from;
        Fragment fragment = this.$parentFragment;
        if (fragment == null || (from = fragment.getLayoutInflater()) == null) {
            from = LayoutInflater.from(context);
        }
        ViewBinding viewBinding = (ViewBinding) this.$factory.invoke(from, new FrameLayout(context), Boolean.FALSE);
        View root = viewBinding.getRoot();
        AndroidViewBindingKt.setBinding(root, viewBinding);
        return root;
    }
}
