package androidx.compose.material;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults$TrailingIcon$4 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Function0 $onIconClick;
    final /* synthetic */ ExposedDropdownMenuDefaults $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuDefaults$TrailingIcon$4(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z8, Function0 function0, int i8, int i9) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuDefaults;
        this.$expanded = z8;
        this.$onIconClick = function0;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.TrailingIcon(this.$expanded, this.$onIconClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
