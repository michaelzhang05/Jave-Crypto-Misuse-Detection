package androidx.compose.material;

import L5.I;
import X5.o;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda1$1 extends AbstractC3160z implements o {
    public static final ComposableSingletons$AppBarKt$lambda1$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda1$1();

    ComposableSingletons$AppBarKt$lambda1$1() {
        super(3);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f6487a;
    }

    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i8) {
        AbstractC3159y.i(rowScope, "$this$null");
        if ((i8 & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-771938130, i8, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:80)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
