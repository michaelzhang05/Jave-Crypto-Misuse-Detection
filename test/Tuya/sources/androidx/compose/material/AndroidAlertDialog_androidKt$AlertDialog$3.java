package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ n $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ n $text;
    final /* synthetic */ n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$3(n nVar, Modifier modifier, n nVar2, n nVar3, Shape shape, long j8, long j9, int i8) {
        super(2);
        this.$buttons = nVar;
        this.$modifier = modifier;
        this.$title = nVar2;
        this.$text = nVar3;
        this.$shape = shape;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
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
        n nVar = this.$buttons;
        Modifier modifier = this.$modifier;
        n nVar2 = this.$title;
        n nVar3 = this.$text;
        Shape shape = this.$shape;
        long j8 = this.$backgroundColor;
        long j9 = this.$contentColor;
        int i9 = this.$$dirty;
        AlertDialogKt.m1095AlertDialogContentWMdw5o4(nVar, modifier, nVar2, nVar3, shape, j8, j9, composer, ((i9 >> 3) & 14) | ((i9 >> 3) & 112) | ((i9 >> 3) & 896) | ((i9 >> 3) & 7168) | ((i9 >> 3) & 57344) | ((i9 >> 3) & 458752) | ((i9 >> 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
