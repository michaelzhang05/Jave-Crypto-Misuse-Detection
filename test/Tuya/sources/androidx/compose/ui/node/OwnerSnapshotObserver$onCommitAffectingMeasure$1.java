package androidx.compose.ui.node;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$onCommitAffectingMeasure$1 extends AbstractC3160z implements Function1 {
    public static final OwnerSnapshotObserver$onCommitAffectingMeasure$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingMeasure$1();

    OwnerSnapshotObserver$onCommitAffectingMeasure$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return I.f6487a;
    }

    public final void invoke(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
        }
    }
}
