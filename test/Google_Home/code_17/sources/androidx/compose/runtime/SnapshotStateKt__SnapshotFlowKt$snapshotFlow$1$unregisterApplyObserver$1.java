package androidx.compose.runtime;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ n6.d $appliedChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(n6.d dVar) {
        super(2);
        this.$appliedChanges = dVar;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f8278a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        this.$appliedChanges.w(set);
    }
}
