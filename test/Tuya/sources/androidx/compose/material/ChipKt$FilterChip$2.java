package androidx.compose.material;

import L5.I;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class ChipKt$FilterChip$2 extends AbstractC3160z implements Function1 {
    public static final ChipKt$FilterChip$2 INSTANCE = new ChipKt$FilterChip$2();

    ChipKt$FilterChip$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6487a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3159y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.m4539setRolekuIjeqM(semantics, Role.Companion.m4524getCheckboxo7Vup1c());
    }
}