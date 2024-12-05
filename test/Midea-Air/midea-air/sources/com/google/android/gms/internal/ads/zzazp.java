package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzazp {

    /* renamed from: d, reason: collision with root package name */
    private boolean f13128d;

    /* renamed from: e, reason: collision with root package name */
    private Context f13129e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13127c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f13126b = new WeakHashMap();
    private final BroadcastReceiver a = new e6(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.f13126b.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }

    public final synchronized void a(Context context) {
        if (this.f13127c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f13129e = applicationContext;
        if (applicationContext == null) {
            this.f13129e = context;
        }
        zzacu.a(this.f13129e);
        this.f13128d = ((Boolean) zzyt.e().c(zzacu.Q2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f13129e.registerReceiver(this.a, intentFilter);
        this.f13127c = true;
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f13128d) {
            this.f13126b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f13128d) {
            this.f13126b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
