package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ n6.d $channel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(n6.d dVar) {
        super(1);
        this.$channel = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m4473invoke(obj);
        return O5.I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4473invoke(Object obj) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = GlobalSnapshotManager.sent;
        if (atomicBoolean.compareAndSet(false, true)) {
            this.$channel.w(O5.I.f8278a);
        }
    }
}
