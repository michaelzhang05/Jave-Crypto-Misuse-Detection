package com.bumptech.glide.m;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.m.c;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8857f;

    /* renamed from: g, reason: collision with root package name */
    final c.a f8858g;

    /* renamed from: h, reason: collision with root package name */
    boolean f8859h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8860i;

    /* renamed from: j, reason: collision with root package name */
    private final BroadcastReceiver f8861j = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f8859h;
            eVar.f8859h = eVar.a(context);
            if (z != e.this.f8859h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f8859h);
                }
                e eVar2 = e.this;
                eVar2.f8858g.a(eVar2.f8859h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c.a aVar) {
        this.f8857f = context.getApplicationContext();
        this.f8858g = aVar;
    }

    private void b() {
        if (this.f8860i) {
            return;
        }
        this.f8859h = a(this.f8857f);
        try {
            this.f8857f.registerReceiver(this.f8861j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f8860i = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    private void c() {
        if (this.f8860i) {
            this.f8857f.unregisterReceiver(this.f8861j);
            this.f8860i = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.r.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.m.i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.m.i
    public void onStart() {
        b();
    }

    @Override // com.bumptech.glide.m.i
    public void onStop() {
        c();
    }
}
