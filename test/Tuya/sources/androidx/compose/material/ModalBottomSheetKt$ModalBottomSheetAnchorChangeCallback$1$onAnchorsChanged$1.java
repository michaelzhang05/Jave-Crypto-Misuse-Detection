package androidx.compose.material;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1", f = "ModalBottomSheet.kt", l = {819}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1 extends l implements n {
    final /* synthetic */ ModalBottomSheetValue $newTarget;
    final /* synthetic */ ModalBottomSheetState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, d dVar) {
        super(2, dVar);
        this.$state = modalBottomSheetState;
        this.$newTarget = modalBottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1(this.$state, this.$newTarget, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            ModalBottomSheetState modalBottomSheetState = this.$state;
            ModalBottomSheetValue modalBottomSheetValue = this.$newTarget;
            float lastVelocity$material_release = modalBottomSheetState.getLastVelocity$material_release();
            this.label = 1;
            if (modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, lastVelocity$material_release, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
