package androidx.compose.foundation.lazy.layout;

import P5.Q;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ SaveableStateRegistry $currentRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1(SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$currentRegistry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazySaveableStateHolder invoke() {
        return new LazySaveableStateHolder(this.$currentRegistry, Q.h());
    }
}
