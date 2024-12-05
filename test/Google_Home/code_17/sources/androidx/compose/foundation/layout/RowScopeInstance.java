package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class RowScopeInstance implements RowScope {
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier align(Modifier modifier, Alignment.Vertical alignment) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(alignment, "alignment");
        return modifier.then(new VerticalAlignElement(alignment));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine alignmentLine) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(alignmentLine, "alignmentLine");
        return modifier.then(new WithAlignmentLineElement(alignmentLine));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier alignByBaseline(Modifier modifier) {
        AbstractC3255y.i(modifier, "<this>");
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    public Modifier weight(Modifier modifier, float f8, boolean z8) {
        AbstractC3255y.i(modifier, "<this>");
        if (f8 > 0.0d) {
            return modifier.then(new LayoutWeightElement(f8, z8));
        }
        throw new IllegalArgumentException(("invalid weight " + f8 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(alignmentLineBlock, "alignmentLineBlock");
        return modifier.then(new WithAlignmentLineBlockElement(alignmentLineBlock));
    }
}
