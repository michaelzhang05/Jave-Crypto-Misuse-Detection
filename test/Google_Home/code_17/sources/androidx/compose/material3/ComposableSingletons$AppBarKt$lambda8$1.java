package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-8$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda8$1 extends AbstractC3256z implements InterfaceC1669o {
    public static final ComposableSingletons$AppBarKt$lambda8$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda8$1();

    ComposableSingletons$AppBarKt$lambda8$1() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i8) {
        AbstractC3255y.i(rowScope, "$this$null");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-994959539, i8, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-8.<anonymous> (AppBar.kt:282)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
