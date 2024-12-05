package androidx.compose.foundation.text.modifiers;

import g6.n;

/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String w8 = n.w("H", 10);
        EmptyTextReplacement = w8;
        TwoLineTextReplacement = w8 + '\n' + w8;
    }
}
