package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$3$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m856invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m856invoke() {
        TextFieldValue BasicTextField$lambda$2;
        TextFieldValue BasicTextField$lambda$22;
        long m4929getSelectiond9O1mEE = this.$textFieldValue.m4929getSelectiond9O1mEE();
        BasicTextField$lambda$2 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
        if (TextRange.m4685equalsimpl0(m4929getSelectiond9O1mEE, BasicTextField$lambda$2.m4929getSelectiond9O1mEE())) {
            TextRange m4928getCompositionMzsxiRA = this.$textFieldValue.m4928getCompositionMzsxiRA();
            BasicTextField$lambda$22 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
            if (AbstractC3159y.d(m4928getCompositionMzsxiRA, BasicTextField$lambda$22.m4928getCompositionMzsxiRA())) {
                return;
            }
        }
        this.$textFieldValueState$delegate.setValue(this.$textFieldValue);
    }
}
