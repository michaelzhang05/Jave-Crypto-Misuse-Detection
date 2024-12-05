package w4;

import B2.b;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4148a {
    public static final String a(b bVar, Composer composer, int i8) {
        AbstractC3255y.i(bVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2089170298, i8, -1, "com.stripe.android.uicore.strings.resolve (ResolvableStringComposeUtils.kt:18)");
        }
        String R8 = bVar.R((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return R8;
    }
}
