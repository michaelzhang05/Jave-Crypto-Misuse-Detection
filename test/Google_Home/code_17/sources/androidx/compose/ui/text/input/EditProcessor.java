package androidx.compose.ui.text.input;

import P5.AbstractC1378t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m4702getZerod9O1mEE(), (TextRange) null, (AbstractC3247p) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m4934getSelectiond9O1mEE(), (AbstractC3247p) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m4854getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m4700toStringimpl(this.mBuffer.m4855getSelectiond9O1mEE$ui_text_release())) + "):");
        AbstractC3255y.h(sb, "append(value)");
        sb.append('\n');
        AbstractC3255y.h(sb, "append('\\n')");
        AbstractC1378t.u0(list, sb, "\n", null, null, 0, null, new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this), 60, null);
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String b8 = U.b(editCommand.getClass()).b();
        if (b8 == null) {
            b8 = "{anonymous EditCommand}";
        }
        sb3.append(b8);
        return sb3.toString();
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        Exception e8;
        long TextRange;
        EditCommand editCommand2;
        TextRange textRange = null;
        try {
            int size = list.size();
            int i8 = 0;
            editCommand = null;
            while (i8 < size) {
                try {
                    editCommand2 = list.get(i8);
                } catch (Exception e9) {
                    e8 = e9;
                }
                try {
                    editCommand2.applyTo(this.mBuffer);
                    i8++;
                    editCommand = editCommand2;
                } catch (Exception e10) {
                    e8 = e10;
                    editCommand = editCommand2;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e8);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long m4855getSelectiond9O1mEE$ui_text_release = this.mBuffer.m4855getSelectiond9O1mEE$ui_text_release();
            TextRange m4685boximpl = TextRange.m4685boximpl(m4855getSelectiond9O1mEE$ui_text_release);
            m4685boximpl.m4701unboximpl();
            if (!TextRange.m4696getReversedimpl(this.mBufferState.m4934getSelectiond9O1mEE())) {
                textRange = m4685boximpl;
            }
            if (textRange != null) {
                TextRange = textRange.m4701unboximpl();
            } else {
                TextRange = TextRangeKt.TextRange(TextRange.m4694getMaximpl(m4855getSelectiond9O1mEE$ui_text_release), TextRange.m4695getMinimpl(m4855getSelectiond9O1mEE$ui_text_release));
            }
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, TextRange, this.mBuffer.m4854getCompositionMzsxiRA$ui_text_release(), (AbstractC3247p) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e11) {
            editCommand = null;
            e8 = e11;
        }
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        boolean z8 = true;
        boolean z9 = !AbstractC3255y.d(textFieldValue.m4933getCompositionMzsxiRA(), this.mBuffer.m4854getCompositionMzsxiRA$ui_text_release());
        boolean z10 = false;
        if (!AbstractC3255y.d(this.mBufferState.getAnnotatedString(), textFieldValue.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m4934getSelectiond9O1mEE(), (AbstractC3247p) null);
        } else if (!TextRange.m4690equalsimpl0(this.mBufferState.m4934getSelectiond9O1mEE(), textFieldValue.m4934getSelectiond9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.m4695getMinimpl(textFieldValue.m4934getSelectiond9O1mEE()), TextRange.m4694getMaximpl(textFieldValue.m4934getSelectiond9O1mEE()));
            z8 = false;
            z10 = true;
        } else {
            z8 = false;
        }
        if (textFieldValue.m4933getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m4691getCollapsedimpl(textFieldValue.m4933getCompositionMzsxiRA().m4701unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m4695getMinimpl(textFieldValue.m4933getCompositionMzsxiRA().m4701unboximpl()), TextRange.m4694getMaximpl(textFieldValue.m4933getCompositionMzsxiRA().m4701unboximpl()));
        }
        if (z8 || (!z10 && z9)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m4929copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
