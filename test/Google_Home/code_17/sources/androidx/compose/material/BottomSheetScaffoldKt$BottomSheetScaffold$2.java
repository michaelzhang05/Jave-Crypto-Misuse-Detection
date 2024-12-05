package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ InterfaceC1668n $child;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ InterfaceC1669o $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(InterfaceC1669o interfaceC1669o, InterfaceC1668n interfaceC1668n, BottomSheetScaffoldState bottomSheetScaffoldState, boolean z8, Shape shape, float f8, long j8, long j9, long j10, int i8) {
        super(2);
        this.$drawerContent = interfaceC1669o;
        this.$child = interfaceC1668n;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$drawerGesturesEnabled = z8;
        this.$drawerShape = shape;
        this.$drawerElevation = f8;
        this.$drawerBackgroundColor = j8;
        this.$drawerContentColor = j9;
        this.$drawerScrimColor = j10;
        this.$$dirty1 = i8;
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
            ComposerKt.traceEventStart(1273816607, i8, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:504)");
        }
        if (this.$drawerContent == null) {
            composer.startReplaceableGroup(-249540336);
            this.$child.invoke(composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-249540299);
            InterfaceC1669o interfaceC1669o = this.$drawerContent;
            DrawerState drawerState = this.$scaffoldState.getDrawerState();
            boolean z8 = this.$drawerGesturesEnabled;
            Shape shape = this.$drawerShape;
            float f8 = this.$drawerElevation;
            long j8 = this.$drawerBackgroundColor;
            long j9 = this.$drawerContentColor;
            long j10 = this.$drawerScrimColor;
            InterfaceC1668n interfaceC1668n = this.$child;
            int i9 = this.$$dirty1;
            DrawerKt.m1226ModalDrawerGs3lGvM(interfaceC1669o, null, drawerState, z8, shape, f8, j8, j9, j10, interfaceC1668n, composer, ((i9 >> 3) & 7168) | ((i9 >> 9) & 14) | 805306368 | ((i9 >> 3) & 57344) | ((i9 >> 3) & 458752) | ((i9 >> 3) & 3670016) | ((i9 >> 3) & 29360128) | ((i9 >> 3) & 234881024), 2);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
