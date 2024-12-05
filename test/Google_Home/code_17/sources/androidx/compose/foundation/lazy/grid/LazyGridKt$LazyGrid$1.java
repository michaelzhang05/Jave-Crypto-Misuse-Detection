package androidx.compose.foundation.lazy.grid;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridKt$LazyGrid$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1 $content;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ InterfaceC1668n $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$LazyGrid$1(Modifier modifier, LazyGridState lazyGridState, InterfaceC1668n interfaceC1668n, PaddingValues paddingValues, boolean z8, boolean z9, FlingBehavior flingBehavior, boolean z10, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1 function1, int i8, int i9, int i10) {
        super(2);
        this.$modifier = modifier;
        this.$state = lazyGridState;
        this.$slots = interfaceC1668n;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z8;
        this.$isVertical = z9;
        this.$flingBehavior = flingBehavior;
        this.$userScrollEnabled = z10;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$content = function1;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyGridKt.LazyGrid(this.$modifier, this.$state, this.$slots, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$verticalArrangement, this.$horizontalArrangement, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
