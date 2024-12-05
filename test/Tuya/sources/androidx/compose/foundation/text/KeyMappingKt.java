package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.K;

/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new K() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // e6.k
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3903isCtrlPressedZmokQxo(((KeyEvent) obj).m3888unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo879mapZmokQxo(android.view.KeyEvent event) {
                AbstractC3159y.i(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m3905isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m3903isCtrlPressedZmokQxo(event)) {
                    long m3899getKeyZmokQxo = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m903getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m904getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m905getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m902getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m3903isCtrlPressedZmokQxo(event)) {
                    long m3899getKeyZmokQxo2 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m903getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m904getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m905getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m902getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m907getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m901getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m897getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m896getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m3905isShiftPressedZmokQxo(event)) {
                    long m3899getKeyZmokQxo3 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m910getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m909getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m3902isAltPressedZmokQxo(event)) {
                    long m3899getKeyZmokQxo4 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo4, mappedKeys4.m897getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3591equalsimpl0(m3899getKeyZmokQxo4, mappedKeys4.m901getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                if (keyCommand == null) {
                    return KeyMapping.this.mo879mapZmokQxo(event);
                }
                return keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final Function1 shortcutModifier) {
        AbstractC3159y.i(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo879mapZmokQxo(android.view.KeyEvent event) {
                boolean m3591equalsimpl0;
                AbstractC3159y.i(event, "event");
                if (((Boolean) Function1.this.invoke(KeyEvent.m3882boximpl(event))).booleanValue() && KeyEvent_androidKt.m3905isShiftPressedZmokQxo(event)) {
                    if (!Key.m3591equalsimpl0(KeyEvent_androidKt.m3899getKeyZmokQxo(event), MappedKeys.INSTANCE.m918getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.REDO;
                }
                if (((Boolean) Function1.this.invoke(KeyEvent.m3882boximpl(event))).booleanValue()) {
                    long m3899getKeyZmokQxo = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m898getCEK5gGoQ())) {
                        m3591equalsimpl0 = true;
                    } else {
                        m3591equalsimpl0 = Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m908getInsertEK5gGoQ());
                    }
                    if (m3591equalsimpl0) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m915getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m916getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m895getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m917getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (!Key.m3591equalsimpl0(m3899getKeyZmokQxo, mappedKeys.m918getZEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.UNDO;
                }
                if (KeyEvent_androidKt.m3903isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m3905isShiftPressedZmokQxo(event)) {
                    long m3899getKeyZmokQxo2 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m903getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m904getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m905getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m902getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m912getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m911getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m910getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m909getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (!Key.m3591equalsimpl0(m3899getKeyZmokQxo2, mappedKeys2.m908getInsertEK5gGoQ())) {
                        return null;
                    }
                    return KeyCommand.PASTE;
                }
                long m3899getKeyZmokQxo3 = KeyEvent_androidKt.m3899getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m903getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m904getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m905getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m902getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m912getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m911getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m910getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m909getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m906getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m897getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m901getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m913getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m900getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m899getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (!Key.m3591equalsimpl0(m3899getKeyZmokQxo3, mappedKeys3.m914getTabEK5gGoQ())) {
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
