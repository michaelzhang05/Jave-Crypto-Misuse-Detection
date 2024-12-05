package androidx.compose.foundation.interaction;

import L5.I;
import P5.d;
import Q5.b;
import androidx.compose.runtime.Stable;
import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3340B;
import l6.u;

@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final u interactions = AbstractC3340B.b(0, 16, EnumC3132a.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, d dVar) {
        Object emit = getInteractions().emit(interaction, dVar);
        if (emit == b.e()) {
            return emit;
        }
        return I.f6487a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        AbstractC3159y.i(interaction, "interaction");
        return getInteractions().d(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public u getInteractions() {
        return this.interactions;
    }
}
