package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2704a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f31176a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f31177b;

    public C2704a(Function0 onNetworkAvailable, Function0 onNetworkUnavailable) {
        AbstractC3159y.i(onNetworkAvailable, "onNetworkAvailable");
        AbstractC3159y.i(onNetworkUnavailable, "onNetworkUnavailable");
        this.f31176a = onNetworkAvailable;
        this.f31177b = onNetworkUnavailable;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean b8;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(intent, "intent");
        b8 = AbstractC2708e.b(context);
        if (b8) {
            this.f31176a.invoke();
        } else {
            this.f31177b.invoke();
        }
    }
}
