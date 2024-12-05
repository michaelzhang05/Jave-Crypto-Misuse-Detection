package androidx.compose.foundation.lazy.grid;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends AbstractC3160z implements n {
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

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m727invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m727invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3159y.i($receiver, "$this$$receiver");
        if (Constraints.m5145getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8) - $receiver.mo442roundToPx0680j_4(Dp.m5178constructorimpl(this.$contentPadding.mo553calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo550calculateBottomPaddingD9Ej5fM()));
            GridCells gridCells = this.$rows;
            Arrangement.Vertical vertical = this.$verticalArrangement;
            int[] V02 = AbstractC1246t.V0(gridCells.calculateCrossAxisCellSizes($receiver, m5145getMaxHeightimpl, $receiver.mo442roundToPx0680j_4(vertical.mo520getSpacingD9Ej5fM())));
            int[] iArr = new int[V02.length];
            vertical.arrange($receiver, m5145getMaxHeightimpl, V02, iArr);
            return new LazyGridSlots(V02, iArr);
        }
        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
    }
}
