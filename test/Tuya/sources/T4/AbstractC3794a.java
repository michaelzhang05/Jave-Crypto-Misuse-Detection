package t4;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3794a {
    public static final String a(InterfaceC3983b interfaceC3983b, Composer composer, int i8) {
        AbstractC3159y.i(interfaceC3983b, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2089170298, i8, -1, "com.stripe.android.uicore.strings.resolve (ResolvableStringComposeUtils.kt:18)");
        }
        String R8 = interfaceC3983b.R((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return R8;
    }
}
