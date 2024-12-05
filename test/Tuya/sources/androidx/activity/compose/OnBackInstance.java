package androidx.activity.compose;

import X5.n;
import androidx.activity.BackEventCompat;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import java.util.concurrent.CancellationException;
import k6.EnumC3132a;
import k6.d;
import k6.g;
import k6.v;

/* loaded from: classes.dex */
final class OnBackInstance {
    private final d channel = g.b(-2, EnumC3132a.SUSPEND, null, 4, null);
    private final boolean isPredictiveBack;
    private final InterfaceC2855x0 job;

    public OnBackInstance(M m8, boolean z8, n nVar) {
        InterfaceC2855x0 d8;
        this.isPredictiveBack = z8;
        d8 = AbstractC2829k.d(m8, null, null, new OnBackInstance$job$1(nVar, this, null), 3, null);
        this.job = d8;
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        InterfaceC2855x0.a.a(this.job, null, 1, null);
    }

    public final boolean close() {
        return v.a.a(this.channel, null, 1, null);
    }

    public final d getChannel() {
        return this.channel;
    }

    public final InterfaceC2855x0 getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m100sendJP2dKIU(BackEventCompat backEventCompat) {
        return this.channel.y(backEventCompat);
    }
}
