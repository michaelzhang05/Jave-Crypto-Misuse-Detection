package androidx.work.impl.m.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.n;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public class e extends d<androidx.work.impl.m.b> {

    /* renamed from: g, reason: collision with root package name */
    static final String f1995g = n.f("NetworkStateTracker");

    /* renamed from: h, reason: collision with root package name */
    private final ConnectivityManager f1996h;

    /* renamed from: i, reason: collision with root package name */
    private b f1997i;

    /* renamed from: j, reason: collision with root package name */
    private a f1998j;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            n.c().a(e.f1995g, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            n.c().a(e.f1995g, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            n.c().a(e.f1995g, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, androidx.work.impl.utils.p.a aVar) {
        super(context, aVar);
        this.f1996h = (ConnectivityManager) this.f1989c.getSystemService("connectivity");
        if (j()) {
            this.f1997i = new b();
        } else {
            this.f1998j = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // androidx.work.impl.m.f.d
    public void e() {
        if (j()) {
            try {
                n.c().a(f1995g, "Registering network callback", new Throwable[0]);
                this.f1996h.registerDefaultNetworkCallback(this.f1997i);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                n.c().b(f1995g, "Received exception while registering network callback", e2);
                return;
            }
        }
        n.c().a(f1995g, "Registering broadcast receiver", new Throwable[0]);
        this.f1989c.registerReceiver(this.f1998j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // androidx.work.impl.m.f.d
    public void f() {
        if (j()) {
            try {
                n.c().a(f1995g, "Unregistering network callback", new Throwable[0]);
                this.f1996h.unregisterNetworkCallback(this.f1997i);
                return;
            } catch (IllegalArgumentException | SecurityException e2) {
                n.c().b(f1995g, "Received exception while unregistering network callback", e2);
                return;
            }
        }
        n.c().a(f1995g, "Unregistering broadcast receiver", new Throwable[0]);
        this.f1989c.unregisterReceiver(this.f1998j);
    }

    androidx.work.impl.m.b g() {
        NetworkInfo activeNetworkInfo = this.f1996h.getActiveNetworkInfo();
        return new androidx.work.impl.m.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), androidx.core.net.a.a(this.f1996h), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // androidx.work.impl.m.f.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.m.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f1996h.getNetworkCapabilities(this.f1996h.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e2) {
            n.c().b(f1995g, "Unable to validate active network", e2);
            return false;
        }
    }
}
