package androidx.compose.ui.hapticfeedback;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PlatformHapticFeedbackType {
    public static final int $stable = 0;
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();
    private static final int LongPress = HapticFeedbackType.m3569constructorimpl(0);
    private static final int TextHandleMove = HapticFeedbackType.m3569constructorimpl(9);

    private PlatformHapticFeedbackType() {
    }

    /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
    public final int m3577getLongPress5zf0vsI() {
        return LongPress;
    }

    /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
    public final int m3578getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}