package androidx.compose.ui.node;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2 extends AbstractC3160z implements Function1 {
    public static final LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2 INSTANCE = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2();

    LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return I.f6487a;
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
    }
}
