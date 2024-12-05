package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import e.e.b.a.a.a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstallReferrerClientImpl.java */
/* loaded from: classes.dex */
public class a extends InstallReferrerClient {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8287b;

    /* renamed from: c, reason: collision with root package name */
    private e.e.b.a.a.a f8288c;

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f8289d;

    /* compiled from: InstallReferrerClientImpl.java */
    /* loaded from: classes.dex */
    private final class b implements ServiceConnection {

        /* renamed from: f, reason: collision with root package name */
        private final InstallReferrerStateListener f8290f;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e.b.a.a.a.a("InstallReferrerClient", "Install Referrer service connected.");
            a.this.f8288c = a.AbstractBinderC0217a.u(iBinder);
            a.this.a = 2;
            this.f8290f.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            e.b.a.a.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            a.this.f8288c = null;
            a.this.a = 0;
            this.f8290f.b();
        }

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f8290f = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public a(Context context) {
        this.f8287b = context.getApplicationContext();
    }

    private boolean f() {
        try {
            return this.f8287b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails a() throws RemoteException {
        if (g()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f8287b.getPackageName());
            try {
                return new ReferrerDetails(this.f8288c.Y2(bundle));
            } catch (RemoteException e2) {
                e.b.a.a.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw e2;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void c(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (g()) {
            e.b.a.a.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i2 = this.a;
        if (i2 == 1) {
            e.b.a.a.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
            return;
        }
        if (i2 == 3) {
            e.b.a.a.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
            return;
        }
        e.b.a.a.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        this.f8289d = new b(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.f8287b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null && f()) {
                if (this.f8287b.bindService(new Intent(intent), this.f8289d, 1)) {
                    e.b.a.a.a.a("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                e.b.a.a.a.b("InstallReferrerClient", "Connection to service is blocked.");
                this.a = 0;
                installReferrerStateListener.a(1);
                return;
            }
            e.b.a.a.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.a = 0;
            installReferrerStateListener.a(2);
            return;
        }
        this.a = 0;
        e.b.a.a.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.a(2);
    }

    public boolean g() {
        return (this.a != 2 || this.f8288c == null || this.f8289d == null) ? false : true;
    }
}
