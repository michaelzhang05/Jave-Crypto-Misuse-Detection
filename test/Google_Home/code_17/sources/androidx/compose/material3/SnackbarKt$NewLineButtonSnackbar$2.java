package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$NewLineButtonSnackbar$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1668n $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ TextStyle $actionTextStyle;
    final /* synthetic */ InterfaceC1668n $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ InterfaceC1668n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$NewLineButtonSnackbar$2(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, TextStyle textStyle, long j8, long j9, int i8) {
        super(2);
        this.$text = interfaceC1668n;
        this.$action = interfaceC1668n2;
        this.$dismissAction = interfaceC1668n3;
        this.$actionTextStyle = textStyle;
        this.$actionContentColor = j8;
        this.$dismissActionContentColor = j9;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        SnackbarKt.m1775NewLineButtonSnackbarkKq0p4A(this.$text, this.$action, this.$dismissAction, this.$actionTextStyle, this.$actionContentColor, this.$dismissActionContentColor, composer, this.$$changed | 1);
    }
}
