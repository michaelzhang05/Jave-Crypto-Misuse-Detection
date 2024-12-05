package androidx.compose.foundation.lazy.grid;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = gridCells;
        this.$horizontalArrangement = horizontal;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m731invoke0kLqBqw((Density) obj, ((Constraints) obj2).m5157unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final LazyGridSlots m731invoke0kLqBqw(Density $receiver, long j8) {
        AbstractC3255y.i($receiver, "$this$$receiver");
        if (Constraints.m5151getMaxWidthimpl(j8) != Integer.MAX_VALUE) {
            PaddingValues paddingValues = this.$contentPadding;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8) - $receiver.mo447roundToPx0680j_4(Dp.m5183constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection)));
            GridCells gridCells = this.$columns;
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            int[] V02 = AbstractC1378t.V0(gridCells.calculateCrossAxisCellSizes($receiver, m5151getMaxWidthimpl, $receiver.mo447roundToPx0680j_4(horizontal.mo525getSpacingD9Ej5fM())));
            int[] iArr = new int[V02.length];
            horizontal.arrange($receiver, m5151getMaxWidthimpl, V02, layoutDirection, iArr);
            return new LazyGridSlots(V02, iArr);
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
