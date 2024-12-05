package androidx.compose.foundation.layout;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1 extends AbstractC3256z implements InterfaceC1669o {
    public WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3255y.i(composed, "$this$composed");
        composer.startReplaceableGroup(359872873);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(359872873, i8, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
        }
        WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 8);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(current);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InsetsPaddingModifier(current.getSafeDrawing(), null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return insetsPaddingModifier;
    }
}
