package androidx.compose.material3;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.M;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@f(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", l = {683}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SliderDefaults$Thumb$1$1 extends l implements InterfaceC1668n {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Thumb$1$1(MutableInteractionSource mutableInteractionSource, SnapshotStateList<Interaction> snapshotStateList, d dVar) {
        super(2, dVar);
        this.$interactionSource = mutableInteractionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC3706f interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.compose.material3.SliderDefaults$Thumb$1$1.1
                @Override // o6.InterfaceC3707g
                public final Object emit(Interaction interaction, d dVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList.remove(((DragInteraction.Cancel) interaction).getStart());
                    }
                    return I.f8278a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((SliderDefaults$Thumb$1$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}