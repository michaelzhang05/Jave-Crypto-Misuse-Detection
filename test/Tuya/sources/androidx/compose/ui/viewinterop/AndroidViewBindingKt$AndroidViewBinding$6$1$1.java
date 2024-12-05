package androidx.compose.ui.viewinterop;

import L5.I;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$6$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $reset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$6$1$1(Function1 function1) {
        super(1);
        this.$reset = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return I.f6487a;
    }

    public final void invoke(View view) {
        ViewBinding binding;
        Function1 function1 = this.$reset;
        binding = AndroidViewBindingKt.getBinding(view);
        function1.invoke(binding);
    }
}
