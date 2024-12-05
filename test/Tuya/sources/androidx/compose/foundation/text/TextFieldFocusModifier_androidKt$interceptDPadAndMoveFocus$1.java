package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.core.view.InputDeviceCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = focusManager;
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m936invokeZmokQxo(((KeyEvent) obj).m3888unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m936invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean m935isKeyCodeYhN2O0w;
        boolean m935isKeyCodeYhN2O0w2;
        boolean m935isKeyCodeYhN2O0w3;
        boolean m935isKeyCodeYhN2O0w4;
        boolean m935isKeyCodeYhN2O0w5;
        AbstractC3159y.i(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        boolean z8 = false;
        if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3896getKeyDownCS__XNY())) {
            m935isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m935isKeyCodeYhN2O0w(keyEvent, 19);
            if (!m935isKeyCodeYhN2O0w) {
                m935isKeyCodeYhN2O0w2 = TextFieldFocusModifier_androidKt.m935isKeyCodeYhN2O0w(keyEvent, 20);
                if (!m935isKeyCodeYhN2O0w2) {
                    m935isKeyCodeYhN2O0w3 = TextFieldFocusModifier_androidKt.m935isKeyCodeYhN2O0w(keyEvent, 21);
                    if (!m935isKeyCodeYhN2O0w3) {
                        m935isKeyCodeYhN2O0w4 = TextFieldFocusModifier_androidKt.m935isKeyCodeYhN2O0w(keyEvent, 22);
                        if (!m935isKeyCodeYhN2O0w4) {
                            m935isKeyCodeYhN2O0w5 = TextFieldFocusModifier_androidKt.m935isKeyCodeYhN2O0w(keyEvent, 23);
                            if (m935isKeyCodeYhN2O0w5) {
                                TextInputSession inputSession = this.$state.getInputSession();
                                if (inputSession != null) {
                                    inputSession.showSoftwareKeyboard();
                                }
                                z8 = true;
                            }
                        } else {
                            z8 = this.$focusManager.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2664getRightdhqQ8s());
                        }
                    } else {
                        z8 = this.$focusManager.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2661getLeftdhqQ8s());
                    }
                } else {
                    z8 = this.$focusManager.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2658getDowndhqQ8s());
                }
            } else {
                z8 = this.$focusManager.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2665getUpdhqQ8s());
            }
        }
        return Boolean.valueOf(z8);
    }
}
