package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnackbarKt$Snackbar$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC1668n $action;
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ InterfaceC1668n $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ InterfaceC1668n $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$2(Modifier modifier, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, boolean z8, Shape shape, long j8, long j9, long j10, long j11, InterfaceC1668n interfaceC1668n3, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$action = interfaceC1668n;
        this.$dismissAction = interfaceC1668n2;
        this.$actionOnNewLine = z8;
        this.$shape = shape;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$actionContentColor = j10;
        this.$dismissActionContentColor = j11;
        this.$content = interfaceC1668n3;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        SnackbarKt.m1777SnackbareQBnUkQ(this.$modifier, this.$action, this.$dismissAction, this.$actionOnNewLine, this.$shape, this.$containerColor, this.$contentColor, this.$actionContentColor, this.$dismissActionContentColor, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
