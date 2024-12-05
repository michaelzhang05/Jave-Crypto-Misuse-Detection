package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AttributionIdentifiers.java */
/* loaded from: classes.dex */
public class a {
    private static final String a = "com.facebook.internal.a";

    /* renamed from: b, reason: collision with root package name */
    private static a f9102b;

    /* renamed from: c, reason: collision with root package name */
    private String f9103c;

    /* renamed from: d, reason: collision with root package name */
    private String f9104d;

    /* renamed from: e, reason: collision with root package name */
    private String f9105e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9106f;

    /* renamed from: g, reason: collision with root package name */
    private long f9107g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.java */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: f, reason: collision with root package name */
        private IBinder f9108f;

        b(IBinder iBinder) {
            this.f9108f = iBinder;
        }

        public boolean C() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f9108f.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f9108f;
        }

        public String u() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9108f.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.java */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: f, reason: collision with root package name */
        private AtomicBoolean f9109f;

        /* renamed from: g, reason: collision with root package name */
        private final BlockingQueue<IBinder> f9110g;

        private c() {
            this.f9109f = new AtomicBoolean(false);
            this.f9110g = new LinkedBlockingDeque();
        }

        public IBinder a() throws InterruptedException {
            if (!this.f9109f.compareAndSet(true, true)) {
                return this.f9110g.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f9110g.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static a a(a aVar) {
        aVar.f9107g = System.currentTimeMillis();
        f9102b = aVar;
        return aVar;
    }

    private static a c(Context context) {
        a d2 = d(context);
        if (d2 != null) {
            return d2;
        }
        a e2 = e(context);
        return e2 == null ? new a() : e2;
    }

    private static a d(Context context) {
        Method B;
        Object I;
        try {
            if (!j(context) || (B = x.B("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (I = x.I(null, B, context)) == null) {
                return null;
            }
            Method A = x.A(I.getClass(), "getId", new Class[0]);
            Method A2 = x.A(I.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (A != null && A2 != null) {
                a aVar = new a();
                aVar.f9104d = (String) x.I(I, A, new Object[0]);
                aVar.f9106f = ((Boolean) x.I(I, A2, new Object[0])).booleanValue();
                return aVar;
            }
            return null;
        } catch (Exception e2) {
            x.U("android_id", e2);
            return null;
        }
    }

    private static a e(Context context) {
        c cVar = new c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, cVar, 1)) {
            try {
                b bVar = new b(cVar.a());
                a aVar = new a();
                aVar.f9104d = bVar.u();
                aVar.f9106f = bVar.C();
                return aVar;
            } catch (Exception e2) {
                x.U("android_id", e2);
            } finally {
                context.unbindService(cVar);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[Catch: all -> 0x00e0, Exception -> 0x00e2, TryCatch #5 {Exception -> 0x00e2, all -> 0x00e0, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x0019, B:11:0x002a, B:13:0x004c, B:15:0x0054, B:17:0x006e, B:19:0x0074, B:21:0x0078, B:23:0x007d, B:57:0x005e, B:59:0x0066, B:61:0x00d8, B:62:0x00df), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x00e0, Exception -> 0x00e2, TryCatch #5 {Exception -> 0x00e2, all -> 0x00e0, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x0019, B:11:0x002a, B:13:0x004c, B:15:0x0054, B:17:0x006e, B:19:0x0074, B:21:0x0078, B:23:0x007d, B:57:0x005e, B:59:0x0066, B:61:0x00d8, B:62:0x00df), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: all -> 0x00e0, Exception -> 0x00e2, TRY_LEAVE, TryCatch #5 {Exception -> 0x00e2, all -> 0x00e0, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x0019, B:11:0x002a, B:13:0x004c, B:15:0x0054, B:17:0x006e, B:19:0x0074, B:21:0x0078, B:23:0x007d, B:57:0x005e, B:59:0x0066, B:61:0x00d8, B:62:0x00df), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.internal.a h(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.h(android.content.Context):com.facebook.internal.a");
    }

    private static String i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    private static boolean j(Context context) {
        Method B = x.B("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (B == null) {
            return false;
        }
        Object I = x.I(null, B, context);
        return (I instanceof Integer) && ((Integer) I).intValue() == 0;
    }

    public static boolean l(Context context) {
        a h2 = h(context);
        return h2 != null && h2.k();
    }

    public String b() {
        if (com.facebook.f.w() && com.facebook.f.d()) {
            return this.f9104d;
        }
        return null;
    }

    public String f() {
        return this.f9105e;
    }

    public String g() {
        return this.f9103c;
    }

    public boolean k() {
        return this.f9106f;
    }
}
