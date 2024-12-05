package androidx.compose.foundation;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {718}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AbstractClickableNode$onKeyEvent$1 extends l implements n {
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, d dVar) {
        super(2, dVar);
        this.this$0 = abstractClickableNode;
        this.$press = press;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AbstractClickableNode$onKeyEvent$1(this.this$0, this.$press, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((AbstractClickableNode$onKeyEvent$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableInteractionSource mutableInteractionSource;
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
            mutableInteractionSource = this.this$0.interactionSource;
            PressInteraction.Press press = this.$press;
            this.label = 1;
            if (mutableInteractionSource.emit(press, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
