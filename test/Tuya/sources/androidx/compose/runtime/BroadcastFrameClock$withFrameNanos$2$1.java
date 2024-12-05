package androidx.compose.runtime;

import L5.I;
import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class BroadcastFrameClock$withFrameNanos$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ T $awaiter;
    final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, T t8) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        BroadcastFrameClock.FrameAwaiter frameAwaiter;
        Object obj = this.this$0.lock;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        T t8 = this.$awaiter;
        synchronized (obj) {
            try {
                List list = broadcastFrameClock.awaiters;
                Object obj2 = t8.f33761a;
                if (obj2 == null) {
                    AbstractC3159y.y("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (BroadcastFrameClock.FrameAwaiter) obj2;
                }
                list.remove(frameAwaiter);
                I i8 = I.f6487a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
