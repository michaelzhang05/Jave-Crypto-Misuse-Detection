package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo879mapZmokQxo(KeyEvent event) {
            AbstractC3159y.i(event, "event");
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m3905isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3902isAltPressedZmokQxo(event)) {
                long m3899getKeyZmokQxo = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m903getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m904getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m905getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m902getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m3902isAltPressedZmokQxo(event)) {
                long m3899getKeyZmokQxo2 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m903getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m904getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m905getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m902getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            if (keyCommand == null) {
                return KeyMappingKt.getDefaultKeyMapping().mo879mapZmokQxo(event);
            }
            return keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
