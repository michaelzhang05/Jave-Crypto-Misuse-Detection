package androidx.activity.compose;

import a6.InterfaceC1668n;
import androidx.activity.BackEventCompat;
import java.util.concurrent.CancellationException;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import n6.EnumC3487a;
import n6.d;
import n6.g;
import n6.v;

/* loaded from: classes.dex */
final class OnBackInstance {
    private final d channel = g.b(-2, EnumC3487a.SUSPEND, null, 4, null);
    private final boolean isPredictiveBack;
    private final InterfaceC3390x0 job;

    public OnBackInstance(M m8, boolean z8, InterfaceC1668n interfaceC1668n) {
        InterfaceC3390x0 d8;
        this.isPredictiveBack = z8;
        d8 = AbstractC3364k.d(m8, null, null, new OnBackInstance$job$1(interfaceC1668n, this, null), 3, null);
        this.job = d8;
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        InterfaceC3390x0.a.a(this.job, null, 1, null);
    }

    public final boolean close() {
        return v.a.a(this.channel, null, 1, null);
    }

    public final d getChannel() {
        return this.channel;
    }

    public final InterfaceC3390x0 getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m105sendJP2dKIU(BackEventCompat backEventCompat) {
        return this.channel.w(backEventCompat);
    }
}
