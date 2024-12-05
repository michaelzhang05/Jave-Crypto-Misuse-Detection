package androidx.compose.foundation.interaction;

import O5.I;
import S5.d;
import T5.b;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3255y;
import n6.EnumC3487a;
import o6.AbstractC3689C;
import o6.v;

@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final v interactions = AbstractC3689C.b(0, 16, EnumC3487a.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, d dVar) {
        Object emit = getInteractions().emit(interaction, dVar);
        if (emit == b.e()) {
            return emit;
        }
        return I.f8278a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        AbstractC3255y.i(interaction, "interaction");
        return getInteractions().e(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public v getInteractions() {
        return this.interactions;
    }
}
