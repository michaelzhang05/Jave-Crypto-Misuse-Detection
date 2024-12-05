package androidx.compose.foundation.gestures;

import O5.I;
import a6.InterfaceC1669o;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ State<InterfaceC1669o> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends InterfaceC1669o> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m485invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m2750unboximpl(), ((Number) obj3).floatValue());
        return I.f8278a;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m485invoked4ec7I(float f8, long j8, float f9) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f8), Offset.m2729boximpl(j8), Float.valueOf(f9));
    }
}
