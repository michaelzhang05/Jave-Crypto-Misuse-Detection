package androidx.compose.foundation.text.selection;

import L5.I;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionContainerKt$SelectionContainer$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ MutableState<Selection> $selection$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(MutableState<Selection> mutableState) {
        super(1);
        this.$selection$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Selection) obj);
        return I.f6487a;
    }

    public final void invoke(Selection selection) {
        this.$selection$delegate.setValue(selection);
    }
}
