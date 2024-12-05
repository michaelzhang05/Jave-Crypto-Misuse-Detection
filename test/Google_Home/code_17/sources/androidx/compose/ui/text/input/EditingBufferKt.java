package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4856updateRangeAfterDeletepWDy79M(long j8, long j9) {
        int m4693getLengthimpl;
        int m4695getMinimpl = TextRange.m4695getMinimpl(j8);
        int m4694getMaximpl = TextRange.m4694getMaximpl(j8);
        if (TextRange.m4699intersects5zctL8(j9, j8)) {
            if (TextRange.m4687contains5zctL8(j9, j8)) {
                m4695getMinimpl = TextRange.m4695getMinimpl(j9);
                m4694getMaximpl = m4695getMinimpl;
            } else {
                if (TextRange.m4687contains5zctL8(j8, j9)) {
                    m4693getLengthimpl = TextRange.m4693getLengthimpl(j9);
                } else if (TextRange.m4688containsimpl(j9, m4695getMinimpl)) {
                    m4695getMinimpl = TextRange.m4695getMinimpl(j9);
                    m4693getLengthimpl = TextRange.m4693getLengthimpl(j9);
                } else {
                    m4694getMaximpl = TextRange.m4695getMinimpl(j9);
                }
                m4694getMaximpl -= m4693getLengthimpl;
            }
        } else if (m4694getMaximpl > TextRange.m4695getMinimpl(j9)) {
            m4695getMinimpl -= TextRange.m4693getLengthimpl(j9);
            m4693getLengthimpl = TextRange.m4693getLengthimpl(j9);
            m4694getMaximpl -= m4693getLengthimpl;
        }
        return TextRangeKt.TextRange(m4695getMinimpl, m4694getMaximpl);
    }
}
