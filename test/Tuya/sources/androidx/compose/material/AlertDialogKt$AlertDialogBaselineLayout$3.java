package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $text;
    final /* synthetic */ ColumnScope $this_AlertDialogBaselineLayout;
    final /* synthetic */ n $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$3(ColumnScope columnScope, n nVar, n nVar2, int i8) {
        super(2);
        this.$this_AlertDialogBaselineLayout = columnScope;
        this.$title = nVar;
        this.$text = nVar2;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.AlertDialogBaselineLayout(this.$this_AlertDialogBaselineLayout, this.$title, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
