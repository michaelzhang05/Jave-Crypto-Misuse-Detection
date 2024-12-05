package androidx.compose.ui.input.key;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public interface SoftKeyboardInterceptionModifierNode extends DelegatableNode {
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    boolean mo3586onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent);

    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    boolean mo3587onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent);
}
