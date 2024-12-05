package androidx.compose.ui.node;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BackwardsCompatNodeKt$updateModifierLocalConsumer$1 extends AbstractC3160z implements Function1 {
    public static final BackwardsCompatNodeKt$updateModifierLocalConsumer$1 INSTANCE = new BackwardsCompatNodeKt$updateModifierLocalConsumer$1();

    BackwardsCompatNodeKt$updateModifierLocalConsumer$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BackwardsCompatNode) obj);
        return I.f6487a;
    }

    public final void invoke(BackwardsCompatNode backwardsCompatNode) {
        backwardsCompatNode.updateModifierLocalConsumer();
    }
}
