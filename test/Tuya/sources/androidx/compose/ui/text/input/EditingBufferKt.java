package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4851updateRangeAfterDeletepWDy79M(long j8, long j9) {
        int m4688getLengthimpl;
        int m4690getMinimpl = TextRange.m4690getMinimpl(j8);
        int m4689getMaximpl = TextRange.m4689getMaximpl(j8);
        if (TextRange.m4694intersects5zctL8(j9, j8)) {
            if (TextRange.m4682contains5zctL8(j9, j8)) {
                m4690getMinimpl = TextRange.m4690getMinimpl(j9);
                m4689getMaximpl = m4690getMinimpl;
            } else {
                if (TextRange.m4682contains5zctL8(j8, j9)) {
                    m4688getLengthimpl = TextRange.m4688getLengthimpl(j9);
                } else if (TextRange.m4683containsimpl(j9, m4690getMinimpl)) {
                    m4690getMinimpl = TextRange.m4690getMinimpl(j9);
                    m4688getLengthimpl = TextRange.m4688getLengthimpl(j9);
                } else {
                    m4689getMaximpl = TextRange.m4690getMinimpl(j9);
                }
                m4689getMaximpl -= m4688getLengthimpl;
            }
        } else if (m4689getMaximpl > TextRange.m4690getMinimpl(j9)) {
            m4690getMinimpl -= TextRange.m4688getLengthimpl(j9);
            m4688getLengthimpl = TextRange.m4688getLengthimpl(j9);
            m4689getMaximpl -= m4688getLengthimpl;
        }
        return TextRangeKt.TextRange(m4690getMinimpl, m4689getMaximpl);
    }
}
