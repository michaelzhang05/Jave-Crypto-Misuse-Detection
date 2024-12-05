package q4;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import m4.AbstractC3441m;

/* renamed from: q4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3848e {
    public static final C3847d a(float f8, long j8, long j9, Composer composer, int i8, int i9) {
        float f9;
        long j10;
        long j11;
        composer.startReplaceableGroup(769413883);
        if ((i9 & 1) != 0) {
            f9 = Dp.m5183constructorimpl(AbstractC3441m.o(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).e());
        } else {
            f9 = f8;
        }
        if ((i9 & 2) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1187getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 4) != 0) {
            j11 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer, ModalBottomSheetDefaults.$stable);
        } else {
            j11 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(769413883, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetLayoutInfo (StripeBottomSheetLayoutInfo.kt:26)");
        }
        composer.startReplaceableGroup(-392359182);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3847d(RoundedCornerShapeKt.m859RoundedCornerShapea9UjIt4$default(f9, f9, 0.0f, 0.0f, 12, null), j10, j11, null);
            composer.updateRememberedValue(rememberedValue);
        }
        C3847d c3847d = (C3847d) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3847d;
    }
}
