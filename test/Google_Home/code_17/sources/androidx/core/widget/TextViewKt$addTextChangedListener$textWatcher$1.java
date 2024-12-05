package androidx.core.widget;

import a6.InterfaceC1670p;
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1 $afterTextChanged;
    final /* synthetic */ InterfaceC1670p $beforeTextChanged;
    final /* synthetic */ InterfaceC1670p $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(Function1 function1, InterfaceC1670p interfaceC1670p, InterfaceC1670p interfaceC1670p2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = interfaceC1670p;
        this.$onTextChanged = interfaceC1670p2;
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
