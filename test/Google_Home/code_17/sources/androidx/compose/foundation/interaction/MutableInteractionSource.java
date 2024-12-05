package androidx.compose.foundation.interaction;

import S5.d;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, d dVar);

    boolean tryEmit(Interaction interaction);
}
