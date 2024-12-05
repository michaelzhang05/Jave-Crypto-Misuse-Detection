package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m984maxWidthForTextLayoutR2G3SPE(long j8, boolean z8, int i8) {
        if ((z8 || TextOverflow.m5129equalsimpl0(i8, TextOverflow.Companion.m5137getEllipsisgIe3tQ8())) && Constraints.m5147getHasBoundedWidthimpl(j8)) {
            return Constraints.m5151getMaxWidthimpl(j8);
        }
        return Integer.MAX_VALUE;
    }
}
