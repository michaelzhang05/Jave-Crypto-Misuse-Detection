package n4;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;

/* renamed from: n4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3467c {
    public static final C3466b a(Composer composer, int i8) {
        boolean z8;
        composer.startReplaceableGroup(1251392408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251392408, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetKeyboardHandler (StripeBottomSheetKeyboardHandler.kt:33)");
        }
        if (WindowInsets_androidKt.getIme(WindowInsets.Companion, composer, 8).getBottom((Density) composer.consume(CompositionLocalsKt.getLocalDensity())) > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z8), composer, 0);
        TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
        composer.startReplaceableGroup(726699408);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3466b(textInputService, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue);
        }
        C3466b c3466b = (C3466b) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3466b;
    }
}
