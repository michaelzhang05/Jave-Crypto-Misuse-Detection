package androidx.core.widget;

import X5.p;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1 $afterTextChanged;
    final /* synthetic */ p $beforeTextChanged;
    final /* synthetic */ p $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(Function1 function1, p pVar, p pVar2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = pVar;
        this.$onTextChanged = pVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }
}
