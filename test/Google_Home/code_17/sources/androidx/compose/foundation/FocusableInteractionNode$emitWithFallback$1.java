package androidx.compose.foundation;

import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.M;

@f(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FocusableInteractionNode$emitWithFallback$1 extends l implements InterfaceC1668n {
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableInteractionNode$emitWithFallback$1(MutableInteractionSource mutableInteractionSource, Interaction interaction, d dVar) {
        super(2, dVar);
        this.$this_emitWithFallback = mutableInteractionSource;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new FocusableInteractionNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
            Interaction interaction = this.$interaction;
            this.label = 1;
            if (mutableInteractionSource.emit(interaction, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((FocusableInteractionNode$emitWithFallback$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
