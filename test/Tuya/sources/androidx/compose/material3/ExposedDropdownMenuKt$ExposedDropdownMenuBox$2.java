package androidx.compose.material3;

import L5.I;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$2 extends AbstractC3160z implements Function0 {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$2(boolean z8, FocusRequester focusRequester) {
        super(0);
        this.$expanded = z8;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1628invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1628invoke() {
        if (this.$expanded) {
            this.$focusRequester.requestFocus();
        }
    }
}
