package androidx.navigation.compose;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DialogHostKt$DialogHost$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DialogNavigator $dialogNavigator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$3(DialogNavigator dialogNavigator, int i8) {
        super(2);
        this.$dialogNavigator = dialogNavigator;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        DialogHostKt.DialogHost(this.$dialogNavigator, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}