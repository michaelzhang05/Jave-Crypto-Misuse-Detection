package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $action;
    final /* synthetic */ long $actionTextColor;
    final /* synthetic */ TextStyle $actionTextStyle;
    final /* synthetic */ n $dismissAction;
    final /* synthetic */ long $dismissActionColor;
    final /* synthetic */ n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$3(n nVar, n nVar2, n nVar3, TextStyle textStyle, long j8, long j9, int i8) {
        super(2);
        this.$text = nVar;
        this.$action = nVar2;
        this.$dismissAction = nVar3;
        this.$actionTextStyle = textStyle;
        this.$actionTextColor = j8;
        this.$dismissActionColor = j9;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        SnackbarKt.m1771OneRowSnackbarkKq0p4A(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionTextColor, this.$dismissActionColor, composer, this.$$changed | 1);
    }
}
