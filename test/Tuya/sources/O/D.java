package O;

import R.AbstractC1319p;
import R.W;
import R.X;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class D {

    /* renamed from: e, reason: collision with root package name */
    private static volatile X f7626e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f7628g;

    /* renamed from: a, reason: collision with root package name */
    static final B f7622a = new v(z.l("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final B f7623b = new w(z.l("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final B f7624c = new x(z.l("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final B f7625d = new y(z.l("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f7627f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N a(String str, z zVar, boolean z8, boolean z9) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, zVar, z8, z9);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N b(String str, boolean z8, boolean z9, boolean z10) {
        return g(str, z8, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String c(boolean z8, String str, z zVar) {
        String str2;
        if (!z8 && f(str, zVar, true, false).f7645a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest b8 = W.a.b("SHA-256");
        AbstractC1319p.l(b8);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, W.i.a(b8.digest(zVar.m0())), Boolean.valueOf(z8), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(Context context) {
        synchronized (D.class) {
            if (f7628g == null) {
                if (context != null) {
                    f7628g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        boolean z8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                z8 = f7626e.g();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            z8 = false;
        }
        return z8;
    }

    private static N f(final String str, final z zVar, final boolean z8, boolean z9) {
        try {
            h();
            AbstractC1319p.l(f7628g);
            try {
                if (f7626e.O(new I(str, zVar, z8, z9), Z.b.m0(f7628g.getPackageManager()))) {
                    return N.b();
                }
                return new L(new Callable() { // from class: O.u
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return D.c(z8, str, zVar);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return N.d("module call", e8);
            }
        } catch (DynamiteModule.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return N.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Z.a, android.os.IBinder] */
    private static N g(String str, boolean z8, boolean z9, boolean z10, boolean z11) {
        N d8;
        G j02;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC1319p.l(f7628g);
            try {
                h();
                E e8 = new E(str, z8, false, Z.b.m0(f7628g), false, true);
                try {
                    if (z11) {
                        j02 = f7626e.r(e8);
                    } else {
                        j02 = f7626e.j0(e8);
                    }
                    if (j02.u()) {
                        d8 = N.f(j02.z());
                    } else {
                        String s8 = j02.s();
                        if (j02.G() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (s8 == null) {
                            s8 = "error checking package certificate";
                        }
                        d8 = N.g(j02.z(), j02.G(), s8, nameNotFoundException);
                    }
                } catch (RemoteException e9) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                    d8 = N.d("module call", e9);
                }
            } catch (DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                d8 = N.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d8;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f7626e != null) {
            return;
        }
        AbstractC1319p.l(f7628g);
        synchronized (f7627f) {
            try {
                if (f7626e == null) {
                    f7626e = W.j(DynamiteModule.e(f7628g, DynamiteModule.f15213f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
