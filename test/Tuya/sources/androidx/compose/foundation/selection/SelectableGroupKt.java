package androidx.compose.foundation.selection;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class SelectableGroupKt {
    public static final Modifier selectableGroup(Modifier modifier) {
        AbstractC3159y.i(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, SelectableGroupKt$selectableGroup$1.INSTANCE, 1, null);
    }
}
