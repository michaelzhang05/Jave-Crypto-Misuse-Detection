package androidx.compose.material3;

import O5.I;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class ChipKt$SelectableChip$1 extends AbstractC3256z implements Function1 {
    public static final ChipKt$SelectableChip$1 INSTANCE = new ChipKt$SelectableChip$1();

    ChipKt$SelectableChip$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8278a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3255y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.m4544setRolekuIjeqM(semantics, Role.Companion.m4529getCheckboxo7Vup1c());
    }
}
