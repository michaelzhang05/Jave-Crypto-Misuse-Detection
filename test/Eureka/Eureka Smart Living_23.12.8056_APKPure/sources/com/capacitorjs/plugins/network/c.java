package com.capacitorjs.plugins.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.capacitorjs.plugins.network.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0075c f4230a;

    /* renamed from: b, reason: collision with root package name */
    private b f4231b;

    /* renamed from: c, reason: collision with root package name */
    private Context f4232c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager f4233d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f4234e;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c.this.f4230a.a(false);
        }
    }

    /* loaded from: classes.dex */
    class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            c.this.f4230a.a(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            c.this.f4230a.a(true);
        }
    }

    /* renamed from: com.capacitorjs.plugins.network.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0075c {
        void a(boolean z5);
    }

    public c(Context context) {
        this.f4232c = context;
        this.f4233d = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT <= 23) {
            this.f4234e = new a();
        } else {
            this.f4231b = new b();
        }
    }

    private e b() {
        e.a aVar;
        e eVar = new e();
        NetworkInfo activeNetworkInfo = this.f4233d.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            eVar.f4238a = activeNetworkInfo.isConnected();
            String typeName = activeNetworkInfo.getTypeName();
            if (typeName.equals("WIFI")) {
                aVar = e.a.WIFI;
            } else if (typeName.equals("MOBILE")) {
                aVar = e.a.CELLULAR;
            }
            eVar.f4239b = aVar;
        }
        return eVar;
    }

    public e c() {
        Network activeNetwork;
        Network activeNetwork2;
        e eVar = new e();
        if (Build.VERSION.SDK_INT < 24) {
            return b();
        }
        ConnectivityManager connectivityManager = this.f4233d;
        if (connectivityManager == null) {
            return eVar;
        }
        activeNetwork = connectivityManager.getActiveNetwork();
        ConnectivityManager connectivityManager2 = this.f4233d;
        activeNetwork2 = connectivityManager2.getActiveNetwork();
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork2);
        if (activeNetwork == null || networkCapabilities == null) {
            return eVar;
        }
        eVar.f4238a = networkCapabilities.hasCapability(16) && networkCapabilities.hasCapability(12);
        eVar.f4239b = networkCapabilities.hasTransport(1) ? e.a.WIFI : networkCapabilities.hasTransport(0) ? e.a.CELLULAR : e.a.UNKNOWN;
        return eVar;
    }

    public void d(InterfaceC0075c interfaceC0075c) {
        this.f4230a = interfaceC0075c;
    }

    public void e() {
        this.f4233d.registerDefaultNetworkCallback(this.f4231b);
    }

    public void f(androidx.appcompat.app.c cVar) {
        cVar.registerReceiver(this.f4234e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void g() {
        this.f4233d.unregisterNetworkCallback(this.f4231b);
    }

    public void h(androidx.appcompat.app.c cVar) {
        cVar.unregisterReceiver(this.f4234e);
    }
}
