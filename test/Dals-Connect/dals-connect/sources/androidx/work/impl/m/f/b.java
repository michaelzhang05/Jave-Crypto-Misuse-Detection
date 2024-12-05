package androidx.work.impl.m.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.n;

/* compiled from: BatteryNotLowTracker.java */
/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f1985i = n.f("BatteryNotLowTracker");

    public b(Context context, androidx.work.impl.utils.p.a aVar) {
        super(context, aVar);
    }

    @Override // androidx.work.impl.m.f.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.m.f.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.c().a(f1985i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // androidx.work.impl.m.f.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f1989c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            n.c().b(f1985i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
    }
}
