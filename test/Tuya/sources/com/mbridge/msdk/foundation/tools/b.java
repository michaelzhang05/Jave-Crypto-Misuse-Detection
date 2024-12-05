package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public final class b {

    /* loaded from: classes4.dex */
    public final class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f20032b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f20033c;

        a(String str, boolean z8) {
            this.f20032b = str;
            this.f20033c = z8;
        }

        public final String a() {
            return this.f20032b;
        }

        public final boolean b() {
            return this.f20033c;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private final class ServiceConnectionC0405b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f20034a;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f20036c;

        private ServiceConnectionC0405b() {
            this.f20036c = new LinkedBlockingQueue<>(1);
            this.f20034a = false;
        }

        public final IBinder a() throws InterruptedException {
            if (!this.f20034a) {
                this.f20034a = true;
                return this.f20036c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f20036c.put(iBinder);
            } catch (InterruptedException e8) {
                ad.b("AdvertisingIdClient", e8.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final a a(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0405b serviceConnectionC0405b = new ServiceConnectionC0405b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, serviceConnectionC0405b, 1)) {
                try {
                    try {
                        c cVar = new c(serviceConnectionC0405b.a());
                        return new a(cVar.a(), cVar.a(true));
                    } catch (Exception e8) {
                        throw e8;
                    }
                } finally {
                    context.unbindService(serviceConnectionC0405b);
                }
            }
            throw new IOException("Google Play connection failed");
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }

    /* loaded from: classes4.dex */
    private final class c implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        private IBinder f20038b;

        public c(IBinder iBinder) {
            this.f20038b = iBinder;
        }

        public final String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f20038b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable th) {
                try {
                    ad.b("AdvertisingIdClient", th.getMessage());
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f20038b;
        }

        public final boolean a(boolean z8) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z9 = false;
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z8 ? 1 : 0);
                this.f20038b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z9 = true;
                }
            } finally {
                try {
                    return z9;
                } finally {
                }
            }
            return z9;
        }
    }
}
