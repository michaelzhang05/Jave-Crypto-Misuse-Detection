package androidx.compose.runtime.snapshots;

import L5.I;
import X5.n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotStateObserver$applyObserver$1 extends AbstractC3160z implements n {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f6487a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        boolean drainChanges;
        this.this$0.addChanges(set);
        drainChanges = this.this$0.drainChanges();
        if (drainChanges) {
            this.this$0.sendNotifications();
        }
    }
}
