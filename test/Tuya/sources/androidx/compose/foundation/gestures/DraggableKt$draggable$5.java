package androidx.compose.foundation.gestures;

import L5.I;
import L5.t;
import X5.o;
import androidx.compose.ui.unit.Velocity;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableKt$draggable$5 extends l implements o {
    final /* synthetic */ o $onDragStopped;
    final /* synthetic */ Orientation $orientation;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$5(o oVar, Orientation orientation, P5.d dVar) {
        super(3, dVar);
        this.$onDragStopped = oVar;
        this.$orientation = orientation;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m428invokeLuvzFrg((M) obj, ((Velocity) obj2).m5418unboximpl(), (P5.d) obj3);
    }

    /* renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m428invokeLuvzFrg(M m8, long j8, P5.d dVar) {
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.$onDragStopped, this.$orientation, dVar);
        draggableKt$draggable$5.L$0 = m8;
        draggableKt$draggable$5.J$0 = j8;
        return draggableKt$draggable$5.invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float m425toFloatsFctU;
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
            M m8 = (M) this.L$0;
            long j8 = this.J$0;
            o oVar = this.$onDragStopped;
            m425toFloatsFctU = DraggableKt.m425toFloatsFctU(j8, this.$orientation);
            Float b8 = kotlin.coroutines.jvm.internal.b.b(m425toFloatsFctU);
            this.label = 1;
            if (oVar.invoke(m8, b8, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
