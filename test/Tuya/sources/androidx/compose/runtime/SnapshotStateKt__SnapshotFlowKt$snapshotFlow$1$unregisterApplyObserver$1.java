package androidx.compose.runtime;

import L5.I;
import X5.n;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends AbstractC3160z implements n {
    final /* synthetic */ k6.d $appliedChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(k6.d dVar) {
        super(2);
        this.$appliedChanges = dVar;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f6487a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        this.$appliedChanges.y(set);
    }
}
