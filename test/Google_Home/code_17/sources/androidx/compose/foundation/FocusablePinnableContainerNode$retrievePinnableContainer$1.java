package androidx.compose.foundation;

import O5.I;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class FocusablePinnableContainerNode$retrievePinnableContainer$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ T $container;
    final /* synthetic */ FocusablePinnableContainerNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusablePinnableContainerNode$retrievePinnableContainer$1(T t8, FocusablePinnableContainerNode focusablePinnableContainerNode) {
        super(0);
        this.$container = t8;
        this.this$0 = focusablePinnableContainerNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m343invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m343invoke() {
        this.$container.f34162a = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, PinnableContainerKt.getLocalPinnableContainer());
    }
}
