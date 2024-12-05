package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC1668n $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ InterfaceC1668n $text;
    final /* synthetic */ InterfaceC1668n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$3(InterfaceC1668n interfaceC1668n, Modifier modifier, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, Shape shape, long j8, long j9, int i8) {
        super(2);
        this.$buttons = interfaceC1668n;
        this.$modifier = modifier;
        this.$title = interfaceC1668n2;
        this.$text = interfaceC1668n3;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$$dirty = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1787418772, i8, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
        }
        InterfaceC1668n interfaceC1668n = this.$buttons;
        Modifier modifier = this.$modifier;
        InterfaceC1668n interfaceC1668n2 = this.$title;
        InterfaceC1668n interfaceC1668n3 = this.$text;
        Shape shape = this.$shape;
        long j8 = this.$backgroundColor;
        long j9 = this.$contentColor;
        int i9 = this.$$dirty;
        AlertDialogKt.m1100AlertDialogContentWMdw5o4(interfaceC1668n, modifier, interfaceC1668n2, interfaceC1668n3, shape, j8, j9, composer, ((i9 >> 3) & 14) | ((i9 >> 3) & 112) | ((i9 >> 3) & 896) | ((i9 >> 3) & 7168) | ((i9 >> 3) & 57344) | ((i9 >> 3) & 458752) | ((i9 >> 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
