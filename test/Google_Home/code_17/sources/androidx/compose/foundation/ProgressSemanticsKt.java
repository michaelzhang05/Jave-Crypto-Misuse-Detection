package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import g6.InterfaceC2885e;
import g6.m;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    public static final Modifier progressSemantics(Modifier modifier, float f8, InterfaceC2885e valueRange, int i8) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(valueRange, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new ProgressSemanticsKt$progressSemantics$1(f8, valueRange, i8));
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f8, InterfaceC2885e interfaceC2885e, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            interfaceC2885e = m.b(0.0f, 1.0f);
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return progressSemantics(modifier, f8, interfaceC2885e, i8);
    }

    @Stable
    public static final Modifier progressSemantics(Modifier modifier) {
        AbstractC3255y.i(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, ProgressSemanticsKt$progressSemantics$2.INSTANCE);
    }
}
