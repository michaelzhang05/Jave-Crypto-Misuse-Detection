package androidx.compose.runtime;

import L5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SnapshotMutableStateImpl$component2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2493invoke((SnapshotMutableStateImpl$component2$1) obj);
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2493invoke(T t8) {
        this.this$0.setValue(t8);
    }
}
