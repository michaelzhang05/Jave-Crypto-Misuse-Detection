package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, TextFieldState state, FocusManager focusManager) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(focusManager, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m940isKeyCodeYhN2O0w(KeyEvent keyEvent, int i8) {
        if (Key_androidKt.m3911getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3904getKeyZmokQxo(keyEvent)) == i8) {
            return true;
        }
        return false;
    }
}
