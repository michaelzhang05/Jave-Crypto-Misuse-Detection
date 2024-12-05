package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m967coerceIn3MmeM6k(long j8, Rect rect) {
        float m2740getXimpl;
        float m2741getYimpl;
        if (Offset.m2740getXimpl(j8) < rect.getLeft()) {
            m2740getXimpl = rect.getLeft();
        } else if (Offset.m2740getXimpl(j8) > rect.getRight()) {
            m2740getXimpl = rect.getRight();
        } else {
            m2740getXimpl = Offset.m2740getXimpl(j8);
        }
        if (Offset.m2741getYimpl(j8) < rect.getTop()) {
            m2741getYimpl = rect.getTop();
        } else if (Offset.m2741getYimpl(j8) > rect.getBottom()) {
            m2741getYimpl = rect.getBottom();
        } else {
            m2741getYimpl = Offset.m2741getYimpl(j8);
        }
        return OffsetKt.Offset(m2740getXimpl, m2741getYimpl);
    }
}
