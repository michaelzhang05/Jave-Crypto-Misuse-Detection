package androidx.work.impl.m.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1986g = n.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: h, reason: collision with root package name */
    private final BroadcastReceiver f1987h;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, androidx.work.impl.utils.p.a aVar) {
        super(context, aVar);
        this.f1987h = new a();
    }

    @Override // androidx.work.impl.m.f.d
    public void e() {
        n.c().a(f1986g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f1989c.registerReceiver(this.f1987h, g());
    }

    @Override // androidx.work.impl.m.f.d
    public void f() {
        n.c().a(f1986g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f1989c.unregisterReceiver(this.f1987h);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
