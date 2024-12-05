package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ n $child;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(o oVar, n nVar, BottomSheetScaffoldState bottomSheetScaffoldState, boolean z8, Shape shape, float f8, long j8, long j9, long j10, int i8) {
        super(2);
        this.$drawerContent = oVar;
        this.$child = nVar;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$drawerGesturesEnabled = z8;
        this.$drawerShape = shape;
        this.$drawerElevation = f8;
        this.$drawerBackgroundColor = j8;
        this.$drawerContentColor = j9;
        this.$drawerScrimColor = j10;
        this.$$dirty1 = i8;
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
            ComposerKt.traceEventStart(1273816607, i8, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:504)");
        }
        if (this.$drawerContent == null) {
            composer.startReplaceableGroup(-249540336);
            this.$child.invoke(composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-249540299);
            o oVar = this.$drawerContent;
            DrawerState drawerState = this.$scaffoldState.getDrawerState();
            boolean z8 = this.$drawerGesturesEnabled;
            Shape shape = this.$drawerShape;
            float f8 = this.$drawerElevation;
            long j8 = this.$drawerBackgroundColor;
            long j9 = this.$drawerContentColor;
            long j10 = this.$drawerScrimColor;
            n nVar = this.$child;
            int i9 = this.$$dirty1;
            DrawerKt.m1221ModalDrawerGs3lGvM(oVar, null, drawerState, z8, shape, f8, j8, j9, j10, nVar, composer, ((i9 >> 3) & 7168) | ((i9 >> 9) & 14) | 805306368 | ((i9 >> 3) & 57344) | ((i9 >> 3) & 458752) | ((i9 >> 3) & 3670016) | ((i9 >> 3) & 29360128) | ((i9 >> 3) & 234881024), 2);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
