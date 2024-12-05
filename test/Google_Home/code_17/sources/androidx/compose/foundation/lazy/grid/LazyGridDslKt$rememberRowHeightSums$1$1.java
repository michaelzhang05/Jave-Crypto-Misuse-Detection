package androidx.compose.foundation.lazy.grid;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ GridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = gridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m732invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5157unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m732invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3255y.i($receiver, "$this$$receiver");
        if (Constraints.m5150getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            int m5150getMaxHeightimpl = Constraints.m5150getMaxHeightimpl(j8) - $receiver.mo447roundToPx0680j_4(Dp.m5183constructorimpl(this.$contentPadding.mo558calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo555calculateBottomPaddingD9Ej5fM()));
            GridCells gridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            int[] V02 = AbstractC1378t.V0(gridCells.calculateCrossAxisCellSizes($receiver, m5150getMaxHeightimpl, $receiver.mo447roundToPx0680j_4(vertical.mo525getSpacingD9Ej5fM())));
            int[] iArr = new int[V02.length];
            vertical.arrange($receiver, m5150getMaxHeightimpl, V02, iArr);
            return new LazyGridSlots(V02, iArr);
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
