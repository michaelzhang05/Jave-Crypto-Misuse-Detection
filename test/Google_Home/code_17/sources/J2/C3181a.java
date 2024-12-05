package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3181a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f33903a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f33904b;

    public C3181a(Function0 onNetworkAvailable, Function0 onNetworkUnavailable) {
        AbstractC3255y.i(onNetworkAvailable, "onNetworkAvailable");
        AbstractC3255y.i(onNetworkUnavailable, "onNetworkUnavailable");
        this.f33903a = onNetworkAvailable;
        this.f33904b = onNetworkUnavailable;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean b8;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(intent, "intent");
        b8 = AbstractC3185e.b(context);
        if (b8) {
            this.f33903a.invoke();
        } else {
            this.f33904b.invoke();
        }
    }
}
