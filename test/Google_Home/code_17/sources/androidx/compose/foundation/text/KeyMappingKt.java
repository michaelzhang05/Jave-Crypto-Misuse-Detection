package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.K;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new K() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // h6.k
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3908isCtrlPressedZmokQxo(((KeyEvent) obj).m3893unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo884mapZmokQxo(android.view.KeyEvent event) {
                AbstractC3255y.i(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m3910isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3908isCtrlPressedZmokQxo(event)) {
                    long m3904getKeyZmokQxo = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m908getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m909getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m910getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m907getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m3908isCtrlPressedZmokQxo(event)) {
                    long m3904getKeyZmokQxo2 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m908getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m909getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m910getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m907getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m912getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m906getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m902getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m901getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m3910isShiftPressedZmokQxo(event)) {
                    long m3904getKeyZmokQxo3 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m915getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m914getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m3907isAltPressedZmokQxo(event)) {
                    long m3904getKeyZmokQxo4 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo4, mappedKeys4.m902getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3596equalsimpl0(m3904getKeyZmokQxo4, mappedKeys4.m906getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo884mapZmokQxo(event);
                }
                return keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1 shortcutModifier) {
        AbstractC3255y.i(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo884mapZmokQxo(android.view.KeyEvent event) {
                boolean m3596equalsimpl0;
                AbstractC3255y.i(event, "event");
                if (((Boolean) Function1.this.invoke(KeyEvent.m3887boximpl(event))).booleanValue() && KeyEvent_androidKt.m3910isShiftPressedZmokQxo(event)) {
                    if (!Key.m3596equalsimpl0(KeyEvent_androidKt.m3904getKeyZmokQxo(event), MappedKeys.INSTANCE.m923getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                }
                if (((Boolean) Function1.this.invoke(KeyEvent.m3887boximpl(event))).booleanValue()) {
                    long m3904getKeyZmokQxo = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m903getCEK5gGoQ())) {
                        m3596equalsimpl0 = true;
                    } else {
                        m3596equalsimpl0 = Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m913getInsertEK5gGoQ());
                    }
                    if (m3596equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m920getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m921getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m900getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m922getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m3596equalsimpl0(m3904getKeyZmokQxo, mappedKeys.m923getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                }
                if (KeyEvent_androidKt.m3908isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m3910isShiftPressedZmokQxo(event)) {
                    long m3904getKeyZmokQxo2 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m908getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m909getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m910getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m907getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m917getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m916getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m915getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m914getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (!Key.m3596equalsimpl0(m3904getKeyZmokQxo2, mappedKeys2.m913getInsertEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.PASTE;
                }
                long m3904getKeyZmokQxo3 = KeyEvent_androidKt.m3904getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m908getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m909getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m910getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m907getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m917getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m916getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m915getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m914getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m911getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m902getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m906getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m918getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m905getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m904getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (!Key.m3596equalsimpl0(m3904getKeyZmokQxo3, mappedKeys3.m919getTabEK5gGoQ())) {
                    return null;
                }
                return KeyCommand.TAB;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
