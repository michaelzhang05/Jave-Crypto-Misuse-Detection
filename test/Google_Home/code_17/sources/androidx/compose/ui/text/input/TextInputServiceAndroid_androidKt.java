package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.n
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.m
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i8, int i9) {
        return (i8 & i9) == i9;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int m4885getImeActioneUduSuo = imeOptions.m4885getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i8 = 6;
        if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4872getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i8 = 0;
            }
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4876getNoneeUduSuo())) {
            i8 = 1;
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4874getGoeUduSuo())) {
            i8 = 2;
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4875getNexteUduSuo())) {
            i8 = 5;
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4877getPreviouseUduSuo())) {
            i8 = 7;
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4878getSearcheUduSuo())) {
            i8 = 3;
        } else if (ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4879getSendeUduSuo())) {
            i8 = 4;
        } else if (!ImeAction.m4860equalsimpl0(m4885getImeActioneUduSuo, companion.m4873getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i8;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int m4886getKeyboardTypePjHm6EE = imeOptions.m4886getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4927getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4920getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4923getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4926getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4928getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4922getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4925getPasswordPjHm6EE())) {
            editorInfo.inputType = TsExtractor.TS_STREAM_TYPE_AC3;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4924getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m4907equalsimpl0(m4886getKeyboardTypePjHm6EE, companion2.m4921getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m4860equalsimpl0(imeOptions.m4885getImeActioneUduSuo(), companion.m4872getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m4884getCapitalizationIUNYP9k = imeOptions.m4884getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m4892equalsimpl0(m4884getCapitalizationIUNYP9k, companion3.m4900getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m4892equalsimpl0(m4884getCapitalizationIUNYP9k, companion3.m4903getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m4892equalsimpl0(m4884getCapitalizationIUNYP9k, companion3.m4902getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m4697getStartimpl(textFieldValue.m4934getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m4692getEndimpl(textFieldValue.m4934getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (!EmojiCompat.isConfigured()) {
            return;
        }
        EmojiCompat.get().updateEditorInfo(editorInfo);
    }
}