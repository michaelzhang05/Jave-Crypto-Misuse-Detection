package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

@Stable
@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridItemScope {
    @ExperimentalFoundationApi
    Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> finiteAnimationSpec);
}