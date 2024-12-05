package androidx.compose.ui.viewinterop;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewBindingKt$AndroidViewBinding$9 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ o $factory;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onRelease;
    final /* synthetic */ Function1 $onReset;
    final /* synthetic */ Function1 $update;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$9(o oVar, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i8, int i9) {
        super(2);
        this.$factory = oVar;
        this.$modifier = modifier;
        this.$onReset = function1;
        this.$onRelease = function12;
        this.$update = function13;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidViewBindingKt.AndroidViewBinding(this.$factory, this.$modifier, this.$onReset, this.$onRelease, this.$update, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
