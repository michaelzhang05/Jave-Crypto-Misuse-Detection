package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m962coerceIn3MmeM6k(long j8, Rect rect) {
        float m2735getXimpl;
        float m2736getYimpl;
        if (Offset.m2735getXimpl(j8) < rect.getLeft()) {
            m2735getXimpl = rect.getLeft();
        } else if (Offset.m2735getXimpl(j8) > rect.getRight()) {
            m2735getXimpl = rect.getRight();
        } else {
            m2735getXimpl = Offset.m2735getXimpl(j8);
        }
        if (Offset.m2736getYimpl(j8) < rect.getTop()) {
            m2736getYimpl = rect.getTop();
        } else if (Offset.m2736getYimpl(j8) > rect.getBottom()) {
            m2736getYimpl = rect.getBottom();
        } else {
            m2736getYimpl = Offset.m2736getYimpl(j8);
        }
        return OffsetKt.Offset(m2735getXimpl, m2736getYimpl);
    }
}
