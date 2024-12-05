package androidx.compose.animation.core;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Transition$animateTo$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ S $targetState;
    final /* synthetic */ Transition<S> $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$2(Transition<S> transition, S s8, int i8) {
        super(2);
        this.$tmp0_rcvr = transition;
        this.$targetState = s8;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        this.$tmp0_rcvr.animateTo$animation_core_release(this.$targetState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
