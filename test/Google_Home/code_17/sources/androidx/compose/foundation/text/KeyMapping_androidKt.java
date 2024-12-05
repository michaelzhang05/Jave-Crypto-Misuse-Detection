package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo884mapZmokQxo(KeyEvent event) {
            AbstractC3255y.i(event, "event");
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m3910isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3907isAltPressedZmokQxo(event)) {
                long m3904getKeyZmokQxo = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m908getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m909getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m910getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m907getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m3907isAltPressedZmokQxo(event)) {
                long m3904getKeyZmokQxo2 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m908getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m909getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m910getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m907getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            if (keyCommand == null) {
                return KeyMappingKt.getDefaultKeyMapping().mo884mapZmokQxo(event);
            }
            return keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
