package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m328isClickZmokQxo(KeyEvent isClick) {
        AbstractC3159y.i(isClick, "$this$isClick");
        if (KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(isClick), KeyEventType.Companion.m3897getKeyUpCS__XNY()) && m329isEnterZmokQxo(isClick)) {
            return true;
        }
        return false;
    }

    public static final boolean isComposeRootInScrollableContainer(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        AbstractC3159y.i(compositionLocalConsumerModifierNode, "<this>");
        return isInScrollableViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, AndroidCompositionLocals_androidKt.getLocalView()));
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m329isEnterZmokQxo(KeyEvent keyEvent) {
        int m3906getNativeKeyCodeYVgTNJs = Key_androidKt.m3906getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m3899getKeyZmokQxo(keyEvent));
        if (m3906getNativeKeyCodeYVgTNJs != 23 && m3906getNativeKeyCodeYVgTNJs != 66 && m3906getNativeKeyCodeYVgTNJs != 160) {
            return false;
        }
        return true;
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m330isPressZmokQxo(KeyEvent isPress) {
        AbstractC3159y.i(isPress, "$this$isPress");
        if (KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(isPress), KeyEventType.Companion.m3896getKeyDownCS__XNY()) && m329isEnterZmokQxo(isPress)) {
            return true;
        }
        return false;
    }
}
