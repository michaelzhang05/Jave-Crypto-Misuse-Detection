package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m883cancelsTextSelectionZmokQxo(KeyEvent cancelsTextSelection) {
        AbstractC3255y.i(cancelsTextSelection, "$this$cancelsTextSelection");
        if (cancelsTextSelection.getKeyCode() == 4 && KeyEventType.m3897equalsimpl0(KeyEvent_androidKt.m3905getTypeZmokQxo(cancelsTextSelection), KeyEventType.Companion.m3902getKeyUpCS__XNY())) {
            return true;
        }
        return false;
    }

    public static final void showCharacterPalette() {
    }
}
