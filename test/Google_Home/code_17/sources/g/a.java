package G;

import N.AbstractC1341l;
import N.C1337h;
import N.C1338i;
import N.ServiceConnectionC1330a;
import Q.AbstractC1400p;
import a0.AbstractBinderC1607e;
import a0.InterfaceC1608f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC1330a f2877a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC1608f f2878b;

    /* renamed from: c, reason: collision with root package name */
    boolean f2879c;

    /* renamed from: d, reason: collision with root package name */
    final Object f2880d = new Object();

    /* renamed from: e, reason: collision with root package name */
    c f2881e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f2882f;

    /* renamed from: g, reason: collision with root package name */
    final long f2883g;

    /* renamed from: G.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0050a {

        /* renamed from: a, reason: collision with root package name */
        private final String f2884a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2885b;

        public C0050a(String str, boolean z8) {
            this.f2884a = str;
            this.f2885b = z8;
        }

        public String a() {
            return this.f2884a;
        }

        public boolean b() {
            return this.f2885b;
        }

        public String toString() {
            String str = this.f2884a;
            boolean z8 = this.f2885b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z8);
            return sb.toString();
        }
    }

    public a(Context context, long j8, boolean z8, boolean z9) {
        Context applicationContext;
        AbstractC1400p.l(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2882f = context;
        this.f2879c = false;
        this.f2883g = j8;
    }

    public static C0050a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0050a f8 = aVar.f(-1);
            aVar.e(f8, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f8;
        } finally {
        }
    }

    private final C0050a f(int i8) {
        C0050a c0050a;
        AbstractC1400p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f2879c) {
                    synchronized (this.f2880d) {
                        c cVar = this.f2881e;
                        if (cVar == null || !cVar.f2890d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f2879c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                AbstractC1400p.l(this.f2877a);
                AbstractC1400p.l(this.f2878b);
                try {
                    c0050a = new C0050a(this.f2878b.b(), this.f2878b.A(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0050a;
    }

    private final void g() {
        synchronized (this.f2880d) {
            c cVar = this.f2881e;
            if (cVar != null) {
                cVar.f2889c.countDown();
                try {
                    this.f2881e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f2883g;
            if (j8 > 0) {
                this.f2881e = new c(this, j8);
            }
        }
    }

    public final void c() {
        AbstractC1400p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2882f != null && this.f2877a != null) {
                    try {
                        if (this.f2879c) {
                            U.b.b().c(this.f2882f, this.f2877a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f2879c = false;
                    this.f2878b = null;
                    this.f2877a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(boolean z8) {
        AbstractC1400p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2879c) {
                    c();
                }
                Context context = this.f2882f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h8 = C1337h.f().h(context, AbstractC1341l.f7472a);
                    if (h8 != 0 && h8 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1330a serviceConnectionC1330a = new ServiceConnectionC1330a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (U.b.b().a(context, intent, serviceConnectionC1330a, 1)) {
                            this.f2877a = serviceConnectionC1330a;
                            try {
                                this.f2878b = AbstractBinderC1607e.h(serviceConnectionC1330a.a(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS));
                                this.f2879c = true;
                                if (z8) {
                                    g();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C1338i(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e(C0050a c0050a, boolean z8, float f8, long j8, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (c0050a != null) {
                if (true != c0050a.b()) {
                    str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
                hashMap.put("limit_ad_tracking", str2);
                String a8 = c0050a.a();
                if (a8 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a8.length()));
                }
            }
            if (th != null) {
                hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j8));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() {
        c();
        super.finalize();
    }

    public static void b(boolean z8) {
    }
}
