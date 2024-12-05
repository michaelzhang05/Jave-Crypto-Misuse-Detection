package androidx.compose.runtime.snapshots;

import S5.g;
import a6.InterfaceC1668n;
import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import l6.V0;

@ExperimentalComposeApi
/* loaded from: classes.dex */
final class SnapshotContextElementImpl implements SnapshotContextElement, V0 {
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r8, interfaceC1668n);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, S5.g.b
    public g.c getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, S5.g.b, S5.g
    public g minusKey(g.c cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement, S5.g
    public g plus(g gVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, gVar);
    }

    @Override // l6.V0
    public void restoreThreadContext(g gVar, Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    @Override // l6.V0
    public Snapshot updateThreadContext(g gVar) {
        return this.snapshot.unsafeEnter();
    }
}
