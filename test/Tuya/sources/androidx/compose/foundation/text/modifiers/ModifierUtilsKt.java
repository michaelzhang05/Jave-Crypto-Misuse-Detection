package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m979maxWidthForTextLayoutR2G3SPE(long j8, boolean z8, int i8) {
        if ((z8 || TextOverflow.m5124equalsimpl0(i8, TextOverflow.Companion.m5132getEllipsisgIe3tQ8())) && Constraints.m5142getHasBoundedWidthimpl(j8)) {
            return Constraints.m5146getMaxWidthimpl(j8);
        }
        return Integer.MAX_VALUE;
    }
}
