package androidx.compose.foundation.gestures;

import L5.I;
import X5.o;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TransformableStateKt$rememberTransformableState$1$1 extends AbstractC3160z implements o {
    final /* synthetic */ State<o> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableStateKt$rememberTransformableState$1$1(State<? extends o> state) {
        super(3);
        this.$lambdaState = state;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m480invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m2745unboximpl(), ((Number) obj3).floatValue());
        return I.f6487a;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m480invoked4ec7I(float f8, long j8, float f9) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f8), Offset.m2724boximpl(j8), Float.valueOf(f9));
    }
}
