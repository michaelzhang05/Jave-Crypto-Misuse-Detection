package androidx.compose.foundation.text;

import O5.I;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    private TextInputSession inputSession;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo885defaultKeyboardActionKlQnJC8(int i8) {
        boolean m4860equalsimpl0;
        boolean m4860equalsimpl02;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4860equalsimpl0(i8, companion.m4875getNexteUduSuo())) {
            getFocusManager().mo2672moveFocus3ESFkO8(FocusDirection.Companion.m2667getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4860equalsimpl0(i8, companion.m4877getPreviouseUduSuo())) {
            getFocusManager().mo2672moveFocus3ESFkO8(FocusDirection.Companion.m2668getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m4860equalsimpl0(i8, companion.m4873getDoneeUduSuo())) {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
                return;
            }
            return;
        }
        boolean z8 = true;
        if (ImeAction.m4860equalsimpl0(i8, companion.m4874getGoeUduSuo())) {
            m4860equalsimpl0 = true;
        } else {
            m4860equalsimpl0 = ImeAction.m4860equalsimpl0(i8, companion.m4878getSearcheUduSuo());
        }
        if (m4860equalsimpl0) {
            m4860equalsimpl02 = true;
        } else {
            m4860equalsimpl02 = ImeAction.m4860equalsimpl0(i8, companion.m4879getSendeUduSuo());
        }
        if (!m4860equalsimpl02) {
            z8 = ImeAction.m4860equalsimpl0(i8, companion.m4872getDefaulteUduSuo());
        }
        if (!z8) {
            ImeAction.m4860equalsimpl0(i8, companion.m4876getNoneeUduSuo());
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        AbstractC3255y.y("focusManager");
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
        AbstractC3255y.y("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m886runActionKlQnJC8(int i8) {
        boolean m4860equalsimpl0;
        Function1 function1;
        ImeAction.Companion companion = ImeAction.Companion;
        I i9 = null;
        if (ImeAction.m4860equalsimpl0(i8, companion.m4873getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4860equalsimpl0(i8, companion.m4874getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4860equalsimpl0(i8, companion.m4875getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4860equalsimpl0(i8, companion.m4877getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4860equalsimpl0(i8, companion.m4878getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4860equalsimpl0(i8, companion.m4879getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m4860equalsimpl0(i8, companion.m4872getDefaulteUduSuo())) {
                m4860equalsimpl0 = true;
            } else {
                m4860equalsimpl0 = ImeAction.m4860equalsimpl0(i8, companion.m4876getNoneeUduSuo());
            }
            if (m4860equalsimpl0) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            i9 = I.f8278a;
        }
        if (i9 == null) {
            mo885defaultKeyboardActionKlQnJC8(i8);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        AbstractC3255y.i(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        AbstractC3255y.i(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
