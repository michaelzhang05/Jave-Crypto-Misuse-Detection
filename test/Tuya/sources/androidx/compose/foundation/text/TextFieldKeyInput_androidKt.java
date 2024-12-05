package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m942isTypedEventZmokQxo(KeyEvent isTypedEvent) {
        AbstractC3159y.i(isTypedEvent, "$this$isTypedEvent");
        if (isTypedEvent.getAction() == 0 && !Character.isISOControl(isTypedEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }
}
