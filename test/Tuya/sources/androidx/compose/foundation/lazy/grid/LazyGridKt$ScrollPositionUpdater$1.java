package androidx.compose.foundation.lazy.grid;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridKt$ScrollPositionUpdater$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ LazyGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$ScrollPositionUpdater$1(Function0 function0, LazyGridState lazyGridState, int i8) {
        super(2);
        this.$itemProviderLambda = function0;
        this.$state = lazyGridState;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyGridKt.ScrollPositionUpdater(this.$itemProviderLambda, this.$state, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}