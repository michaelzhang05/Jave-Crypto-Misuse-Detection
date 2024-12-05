package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.SwitchKt$Switch$4$1", f = "Switch.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwitchKt$Switch$4$1 extends l implements n {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ boolean $checked;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$4$1(boolean z8, AnchoredDraggableState<Boolean> anchoredDraggableState, d dVar) {
        super(2, dVar);
        this.$checked = z8;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SwitchKt$Switch$4$1(this.$checked, this.$anchoredDraggableState, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((SwitchKt$Switch$4$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            if (this.$checked != this.$anchoredDraggableState.getCurrentValue().booleanValue()) {
                AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
                Boolean a8 = kotlin.coroutines.jvm.internal.b.a(this.$checked);
                this.label = 1;
                if (AnchoredDraggableKt.animateTo$default(anchoredDraggableState, a8, 0.0f, this, 2, null) == e8) {
                    return e8;
                }
            }
        }
        return I.f6487a;
    }
}
