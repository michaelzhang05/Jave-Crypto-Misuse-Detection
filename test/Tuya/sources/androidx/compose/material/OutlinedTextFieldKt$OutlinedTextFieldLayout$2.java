package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ n $border;
    final /* synthetic */ n $label;
    final /* synthetic */ n $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onLabelMeasured;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ o $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ n $textField;
    final /* synthetic */ n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, n nVar, o oVar, n nVar2, n nVar3, n nVar4, boolean z8, float f8, Function1 function1, n nVar5, PaddingValues paddingValues, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$textField = nVar;
        this.$placeholder = oVar;
        this.$label = nVar2;
        this.$leading = nVar3;
        this.$trailing = nVar4;
        this.$singleLine = z8;
        this.$animationProgress = f8;
        this.$onLabelMeasured = function1;
        this.$border = nVar5;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$border, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
