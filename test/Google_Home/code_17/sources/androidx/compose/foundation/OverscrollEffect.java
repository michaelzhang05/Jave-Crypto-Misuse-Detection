package androidx.compose.foundation;

import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo281applyToFlingBMRW4eQ(long j8, InterfaceC1668n interfaceC1668n, d dVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo282applyToScrollRhakbz0(long j8, int i8, Function1 function1);

    Modifier getEffectModifier();

    boolean isInProgress();
}
