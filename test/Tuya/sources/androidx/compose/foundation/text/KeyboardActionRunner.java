package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    private TextInputSession inputSession;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo880defaultKeyboardActionKlQnJC8(int i8) {
        boolean m4855equalsimpl0;
        boolean m4855equalsimpl02;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4855equalsimpl0(i8, companion.m4870getNexteUduSuo())) {
            getFocusManager().mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2662getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4855equalsimpl0(i8, companion.m4872getPreviouseUduSuo())) {
            getFocusManager().mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2663getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m4855equalsimpl0(i8, companion.m4868getDoneeUduSuo())) {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
                return;
            }
            return;
        }
        boolean z8 = true;
        if (ImeAction.m4855equalsimpl0(i8, companion.m4869getGoeUduSuo())) {
            m4855equalsimpl0 = true;
        } else {
            m4855equalsimpl0 = ImeAction.m4855equalsimpl0(i8, companion.m4873getSearcheUduSuo());
        }
        if (m4855equalsimpl0) {
            m4855equalsimpl02 = true;
        } else {
            m4855equalsimpl02 = ImeAction.m4855equalsimpl0(i8, companion.m4874getSendeUduSuo());
        }
        if (!m4855equalsimpl02) {
            z8 = ImeAction.m4855equalsimpl0(i8, companion.m4867getDefaulteUduSuo());
        }
        if (!z8) {
            ImeAction.m4855equalsimpl0(i8, companion.m4871getNoneeUduSuo());
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        AbstractC3159y.y("focusManager");
        return null;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        AbstractC3159y.y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m881runActionKlQnJC8(int i8) {
        boolean m4855equalsimpl0;
        Function1 function1;
        ImeAction.Companion companion = ImeAction.Companion;
        I i9 = null;
        if (ImeAction.m4855equalsimpl0(i8, companion.m4868getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4855equalsimpl0(i8, companion.m4869getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4855equalsimpl0(i8, companion.m4870getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4855equalsimpl0(i8, companion.m4872getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4855equalsimpl0(i8, companion.m4873getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4855equalsimpl0(i8, companion.m4874getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m4855equalsimpl0(i8, companion.m4867getDefaulteUduSuo())) {
                m4855equalsimpl0 = true;
            } else {
                m4855equalsimpl0 = ImeAction.m4855equalsimpl0(i8, companion.m4871getNoneeUduSuo());
            }
            if (m4855equalsimpl0) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            i9 = I.f6487a;
        }
        if (i9 == null) {
            mo880defaultKeyboardActionKlQnJC8(i8);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        AbstractC3159y.i(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        AbstractC3159y.i(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
