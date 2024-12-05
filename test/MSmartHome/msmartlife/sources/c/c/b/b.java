package c.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import b.b.a.a;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class b {
    private final b.b.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f2349b;

    /* compiled from: CustomTabsClient.java */
    /* loaded from: classes.dex */
    static class a extends d {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f2350f;

        a(Context context) {
            this.f2350f = context;
        }

        @Override // c.c.b.d
        public final void a(ComponentName componentName, b bVar) {
            bVar.d(0L);
            this.f2350f.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* renamed from: c.c.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0052b extends a.AbstractBinderC0045a {

        /* renamed from: f, reason: collision with root package name */
        private Handler f2351f = new Handler(Looper.getMainLooper());

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.c.b.a f2352g;

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f2354f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f2355g;

            a(int i2, Bundle bundle) {
                this.f2354f = i2;
                this.f2355g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = BinderC0052b.this.f2352g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0053b implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f2357f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f2358g;

            RunnableC0053b(String str, Bundle bundle) {
                this.f2357f = str;
                this.f2358g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = BinderC0052b.this.f2352g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$c */
        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f2360f;

            c(Bundle bundle) {
                this.f2360f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = BinderC0052b.this.f2352g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$d */
        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f2362f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f2363g;

            d(String str, Bundle bundle) {
                this.f2362f = str;
                this.f2363g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = BinderC0052b.this.f2352g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$e */
        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f2365f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f2366g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f2367h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Bundle f2368i;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f2365f = i2;
                this.f2366g = uri;
                this.f2367h = z;
                this.f2368i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.c.b.a aVar = BinderC0052b.this.f2352g;
                throw null;
            }
        }

        BinderC0052b(c.c.b.a aVar) {
        }

        @Override // b.b.a.a
        public void D5(int i2, Bundle bundle) {
            if (this.f2352g == null) {
                return;
            }
            this.f2351f.post(new a(i2, bundle));
        }

        @Override // b.b.a.a
        public void K6(String str, Bundle bundle) throws RemoteException {
            if (this.f2352g == null) {
                return;
            }
            this.f2351f.post(new d(str, bundle));
        }

        @Override // b.b.a.a
        public void V4(String str, Bundle bundle) throws RemoteException {
            if (this.f2352g == null) {
                return;
            }
            this.f2351f.post(new RunnableC0053b(str, bundle));
        }

        @Override // b.b.a.a
        public void Y6(Bundle bundle) throws RemoteException {
            if (this.f2352g == null) {
                return;
            }
            this.f2351f.post(new c(bundle));
        }

        @Override // b.b.a.a
        public void i7(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f2352g == null) {
                return;
            }
            this.f2351f.post(new e(i2, uri, z, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(b.b.a.b bVar, ComponentName componentName) {
        this.a = bVar;
        this.f2349b = componentName;
    }

    public static boolean a(Context context, String str, d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public e c(c.c.b.a aVar) {
        BinderC0052b binderC0052b = new BinderC0052b(aVar);
        try {
            if (this.a.D4(binderC0052b)) {
                return new e(this.a, binderC0052b, this.f2349b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean d(long j2) {
        try {
            return this.a.l3(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
