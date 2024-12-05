package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class SelectionManager_androidKt {
    /* renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m1071isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        AbstractC3255y.i(keyEvent, "keyEvent");
        if (KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo884mapZmokQxo(keyEvent) == KeyCommand.COPY) {
            return true;
        }
        return false;
    }

    public static final Modifier selectionMagnifier(Modifier modifier, SelectionManager manager) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(manager, "manager");
        if (!MagnifierStyle.Companion.getTextDefault().isSupported()) {
            return modifier;
        }
        return ComposedModifierKt.composed$default(modifier, null, new SelectionManager_androidKt$selectionMagnifier$1(manager), 1, null);
    }
}
