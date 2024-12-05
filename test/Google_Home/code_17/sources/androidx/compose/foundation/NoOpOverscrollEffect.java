package androidx.compose.foundation;

import O5.I;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    private NoOpOverscrollEffect() {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo281applyToFlingBMRW4eQ(long j8, InterfaceC1668n interfaceC1668n, d dVar) {
        Object invoke = interfaceC1668n.invoke(Velocity.m5405boximpl(j8), dVar);
        if (invoke == T5.b.e()) {
            return invoke;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo282applyToScrollRhakbz0(long j8, int i8, Function1 performScroll) {
        AbstractC3255y.i(performScroll, "performScroll");
        return ((Offset) performScroll.invoke(Offset.m2729boximpl(j8))).m2750unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return false;
    }
}
