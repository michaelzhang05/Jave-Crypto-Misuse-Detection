package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class OwnerSnapshotObserver$clearInvalidObservations$1 extends AbstractC3256z implements Function1 {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        AbstractC3255y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
    }
}