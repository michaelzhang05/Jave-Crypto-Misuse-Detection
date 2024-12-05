package androidx.compose.foundation;

import L5.I;
import P5.d;
import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    private NoOpOverscrollEffect() {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo276applyToFlingBMRW4eQ(long j8, n nVar, d dVar) {
        Object invoke = nVar.invoke(Velocity.m5400boximpl(j8), dVar);
        if (invoke == Q5.b.e()) {
            return invoke;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo277applyToScrollRhakbz0(long j8, int i8, Function1 performScroll) {
        AbstractC3159y.i(performScroll, "performScroll");
        return ((Offset) performScroll.invoke(Offset.m2724boximpl(j8))).m2745unboximpl();
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
