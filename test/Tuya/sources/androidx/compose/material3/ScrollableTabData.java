package androidx.compose.material3;

import M5.AbstractC1246t;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import d6.m;
import i6.AbstractC2829k;
import i6.M;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
final class ScrollableTabData {
    private final M coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, M coroutineScope) {
        AbstractC3159y.i(scrollState, "scrollState");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i8, List<TabPosition> list) {
        int mo442roundToPx0680j_4 = density.mo442roundToPx0680j_4(((TabPosition) AbstractC1246t.y0(list)).m1831getRightD9Ej5fM()) + i8;
        int maxValue = mo442roundToPx0680j_4 - this.scrollState.getMaxValue();
        return m.k(density.mo442roundToPx0680j_4(tabPosition.m1830getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo442roundToPx0680j_4(tabPosition.m1832getWidthD9Ej5fM()) / 2)), 0, m.d(mo442roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i8, List<TabPosition> tabPositions, int i9) {
        int calculateTabOffset;
        AbstractC3159y.i(density, "density");
        AbstractC3159y.i(tabPositions, "tabPositions");
        Integer num = this.selectedTab;
        if (num == null || num.intValue() != i9) {
            this.selectedTab = Integer.valueOf(i9);
            TabPosition tabPosition = (TabPosition) AbstractC1246t.p0(tabPositions, i9);
            if (tabPosition != null && this.scrollState.getValue() != (calculateTabOffset = calculateTabOffset(tabPosition, density, i8, tabPositions))) {
                AbstractC2829k.d(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
            }
        }
    }
}
