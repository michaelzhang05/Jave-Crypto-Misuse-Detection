package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridItemScopeImpl implements LazyStaggeredGridItemScope {
    public static final LazyStaggeredGridItemScopeImpl INSTANCE = new LazyStaggeredGridItemScopeImpl();

    private LazyStaggeredGridItemScopeImpl() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope
    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(animationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementElement(animationSpec));
    }
}
