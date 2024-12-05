package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import g6.m;

/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m980finalConstraintstfFHcEY(long j8, boolean z8, int i8, float f8) {
        return ConstraintsKt.Constraints$default(0, m982finalMaxWidthtfFHcEY(j8, z8, i8, f8), 0, Constraints.m5150getMaxHeightimpl(j8), 5, null);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m981finalMaxLinesxdlQI24(boolean z8, int i8, int i9) {
        if (!z8 && TextOverflow.m5129equalsimpl0(i8, TextOverflow.Companion.m5137getEllipsisgIe3tQ8())) {
            return 1;
        }
        return m.d(i9, 1);
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m982finalMaxWidthtfFHcEY(long j8, boolean z8, int i8, float f8) {
        int m5151getMaxWidthimpl;
        if ((z8 || TextOverflow.m5129equalsimpl0(i8, TextOverflow.Companion.m5137getEllipsisgIe3tQ8())) && Constraints.m5147getHasBoundedWidthimpl(j8)) {
            m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(j8);
        } else {
            m5151getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (Constraints.m5153getMinWidthimpl(j8) != m5151getMaxWidthimpl) {
            return m.k(TextDelegateKt.ceilToIntPx(f8), Constraints.m5153getMinWidthimpl(j8), m5151getMaxWidthimpl);
        }
        return m5151getMaxWidthimpl;
    }
}
