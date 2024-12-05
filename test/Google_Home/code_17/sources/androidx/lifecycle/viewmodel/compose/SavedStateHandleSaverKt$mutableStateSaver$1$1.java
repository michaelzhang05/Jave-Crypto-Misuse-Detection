package androidx.lifecycle.viewmodel.compose;

import a6.InterfaceC1668n;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandleSaverKt$mutableStateSaver$1$1(Saver<T, Object> saver) {
        super(2);
        this.$this_with = saver;
    }

    @Override // a6.InterfaceC1668n
    public final MutableState<Object> invoke(SaverScope Saver, MutableState<T> state) {
        AbstractC3255y.i(Saver, "$this$Saver");
        AbstractC3255y.i(state, "state");
        if (state instanceof SnapshotMutableState) {
            Object save = this.$this_with.save(Saver, state.getValue());
            SnapshotMutationPolicy policy = ((SnapshotMutableState) state).getPolicy();
            AbstractC3255y.g(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(save, policy);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
