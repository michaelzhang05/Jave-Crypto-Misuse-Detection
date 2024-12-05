package androidx.compose.foundation.text;

import L5.I;
import M5.AbstractC1246t;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final Function1 onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final TextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(TextFieldValue it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return I.f6487a;
        }
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z8, boolean z9, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i8, AbstractC3151p abstractC3151p) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z8, z9, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        List<? extends EditCommand> Z02 = AbstractC1246t.Z0(list);
        Z02.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(Z02));
    }

    private final void commandExecutionContext(Function1 function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        function1.invoke(textFieldPreparedSelection);
        if (!TextRange.m4685equalsimpl0(textFieldPreparedSelection.m1008getSelectiond9O1mEE(), this.value.m4929getSelectiond9O1mEE()) || !AbstractC3159y.d(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            this.onValueChange.invoke(textFieldPreparedSelection.getValue());
        }
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m937typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer m877consumeZmokQxo;
        if (!TextFieldKeyInput_androidKt.m942isTypedEventZmokQxo(keyEvent) || (m877consumeZmokQxo = this.keyCombiner.m877consumeZmokQxo(keyEvent)) == null) {
            return null;
        }
        String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m877consumeZmokQxo.intValue()).toString();
        AbstractC3159y.h(sb, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new CommitTextCommand(sb, 1);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final TextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m938processZmokQxo(KeyEvent event) {
        KeyCommand mo879mapZmokQxo;
        AbstractC3159y.i(event, "event");
        CommitTextCommand m937typedCommandZmokQxo = m937typedCommandZmokQxo(event);
        if (m937typedCommandZmokQxo != null) {
            if (this.editable) {
                apply(m937typedCommandZmokQxo);
                this.preparedSelectionState.resetCachedX();
                return true;
            }
            return false;
        }
        if (!KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(event), KeyEventType.Companion.m3896getKeyDownCS__XNY()) || (mo879mapZmokQxo = this.keyMapping.mo879mapZmokQxo(event)) == null || (mo879mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        O o8 = new O();
        o8.f33757a = true;
        commandExecutionContext(new TextFieldKeyInput$process$2(mo879mapZmokQxo, this, o8));
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return o8.f33757a;
    }

    private TextFieldKeyInput(TextFieldState state, TextFieldSelectionManager selectionManager, TextFieldValue value, boolean z8, boolean z9, TextPreparedSelectionState preparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner keyCombiner, KeyMapping keyMapping, Function1 onValueChange, int i8) {
        AbstractC3159y.i(state, "state");
        AbstractC3159y.i(selectionManager, "selectionManager");
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(preparedSelectionState, "preparedSelectionState");
        AbstractC3159y.i(offsetMapping, "offsetMapping");
        AbstractC3159y.i(keyCombiner, "keyCombiner");
        AbstractC3159y.i(keyMapping, "keyMapping");
        AbstractC3159y.i(onValueChange, "onValueChange");
        this.state = state;
        this.selectionManager = selectionManager;
        this.value = value;
        this.editable = z8;
        this.singleLine = z9;
        this.preparedSelectionState = preparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = keyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = onValueChange;
        this.imeAction = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply(AbstractC1246t.e(editCommand));
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z8, boolean z9, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(textFieldState, textFieldSelectionManager, (i9 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC3151p) null) : textFieldValue, (i9 & 8) != 0 ? true : z8, (i9 & 16) != 0 ? false : z9, textPreparedSelectionState, (i9 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i9 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i9 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i9 & 1024) != 0 ? AnonymousClass1.INSTANCE : function1, i8, null);
    }
}
