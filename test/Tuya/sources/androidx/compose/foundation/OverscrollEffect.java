package androidx.compose.foundation;

import P5.d;
import X5.n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo276applyToFlingBMRW4eQ(long j8, n nVar, d dVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo277applyToScrollRhakbz0(long j8, int i8, Function1 function1);

    Modifier getEffectModifier();

    boolean isInProgress();
}
