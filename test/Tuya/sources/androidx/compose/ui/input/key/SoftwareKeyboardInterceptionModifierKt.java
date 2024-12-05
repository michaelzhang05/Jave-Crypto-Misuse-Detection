package androidx.compose.ui.input.key;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SoftwareKeyboardInterceptionModifierKt {
    @ExperimentalComposeUiApi
    public static final Modifier onInterceptKeyBeforeSoftKeyboard(Modifier modifier, Function1 function1) {
        return modifier.then(new SoftKeyboardInterceptionElement(function1, null));
    }

    @ExperimentalComposeUiApi
    public static final Modifier onPreInterceptKeyBeforeSoftKeyboard(Modifier modifier, Function1 function1) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, function1));
    }
}
