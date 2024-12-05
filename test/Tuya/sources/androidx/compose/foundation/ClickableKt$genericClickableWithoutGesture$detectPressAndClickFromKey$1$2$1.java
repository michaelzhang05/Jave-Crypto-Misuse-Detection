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

@f(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", l = {385}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 extends l implements n {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, d dVar) {
        super(2, dVar);
        this.$interactionSource = mutableInteractionSource;
        this.$it = press;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.$interactionSource, this.$it, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            PressInteraction.Release release = new PressInteraction.Release(this.$it);
            this.label = 1;
            if (mutableInteractionSource.emit(release, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
