package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m944textFieldKeyInput2WJ9YEU(Modifier textFieldKeyInput, TextFieldState state, TextFieldSelectionManager manager, TextFieldValue value, Function1 onValueChange, boolean z8, boolean z9, OffsetMapping offsetMapping, UndoManager undoManager, int i8) {
        AbstractC3255y.i(textFieldKeyInput, "$this$textFieldKeyInput");
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(manager, "manager");
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(onValueChange, "onValueChange");
        AbstractC3255y.i(offsetMapping, "offsetMapping");
        AbstractC3255y.i(undoManager, "undoManager");
        return ComposedModifierKt.composed$default(textFieldKeyInput, null, new TextFieldKeyInputKt$textFieldKeyInput$2(state, manager, value, z8, z9, offsetMapping, undoManager, onValueChange, i8), 1, null);
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m945textFieldKeyInput2WJ9YEU$default(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1 function1, boolean z8, boolean z9, OffsetMapping offsetMapping, UndoManager undoManager, int i8, int i9, Object obj) {
        Function1 function12;
        if ((i9 & 8) != 0) {
            function12 = TextFieldKeyInputKt$textFieldKeyInput$1.INSTANCE;
        } else {
            function12 = function1;
        }
        return m944textFieldKeyInput2WJ9YEU(modifier, textFieldState, textFieldSelectionManager, textFieldValue, function12, z8, z9, offsetMapping, undoManager, i8);
    }
}
