package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2140a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0028a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f2141a;

        C0028a(c cVar) {
            this.f2141a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i6, CharSequence charSequence) {
            this.f2141a.a(i6, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f2141a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i6, CharSequence charSequence) {
            this.f2141a.c(i6, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f2141a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i6, Object obj3, Handler handler) {
            k.a(obj).authenticate(androidx.core.hardware.fingerprint.b.a(obj2), cancellationSignal, i6, l.a(obj3), handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            FingerprintManager.CryptoObject cryptoObject;
            cryptoObject = p.a(obj).getCryptoObject();
            return cryptoObject;
        }

        public static FingerprintManager c(Context context) {
            Object systemService;
            Object systemService2;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 == 23) {
                systemService2 = context.getSystemService((Class<Object>) FingerprintManager.class);
                return k.a(systemService2);
            }
            if (i6 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            systemService = context.getSystemService((Class<Object>) FingerprintManager.class);
            return k.a(systemService);
        }

        static boolean d(Object obj) {
            boolean hasEnrolledFingerprints;
            hasEnrolledFingerprints = k.a(obj).hasEnrolledFingerprints();
            return hasEnrolledFingerprints;
        }

        static boolean e(Object obj) {
            boolean isHardwareDetected;
            isHardwareDetected = k.a(obj).isHardwareDetected();
            return isHardwareDetected;
        }

        public static e f(Object obj) {
            Cipher cipher;
            Signature signature;
            Mac mac;
            Mac mac2;
            Signature signature2;
            Cipher cipher2;
            FingerprintManager.CryptoObject a6 = androidx.core.hardware.fingerprint.b.a(obj);
            if (a6 == null) {
                return null;
            }
            cipher = a6.getCipher();
            if (cipher != null) {
                cipher2 = a6.getCipher();
                return new e(cipher2);
            }
            signature = a6.getSignature();
            if (signature != null) {
                signature2 = a6.getSignature();
                return new e(signature2);
            }
            mac = a6.getMac();
            if (mac == null) {
                return null;
            }
            mac2 = a6.getMac();
            return new e(mac2);
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                g.a();
                return androidx.core.hardware.fingerprint.d.a(eVar.a());
            }
            if (eVar.c() != null) {
                g.a();
                return androidx.core.hardware.fingerprint.e.a(eVar.c());
            }
            if (eVar.b() == null) {
                return null;
            }
            g.a();
            return f.a(eVar.b());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(int i6, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i6, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final e f2142a;

        public d(e eVar) {
            this.f2142a = eVar;
        }

        public e a() {
            return this.f2142a;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f2143a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f2144b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f2145c;

        public e(Signature signature) {
            this.f2143a = signature;
            this.f2144b = null;
            this.f2145c = null;
        }

        public Cipher a() {
            return this.f2144b;
        }

        public Mac b() {
            return this.f2145c;
        }

        public Signature c() {
            return this.f2143a;
        }

        public e(Cipher cipher) {
            this.f2144b = cipher;
            this.f2143a = null;
            this.f2145c = null;
        }

        public e(Mac mac) {
            this.f2145c = mac;
            this.f2144b = null;
            this.f2143a = null;
        }
    }

    private a(Context context) {
        this.f2140a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    private static FingerprintManager c(Context context) {
        return b.c(context);
    }

    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0028a(cVar);
    }

    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i6, androidx.core.os.f fVar, c cVar, Handler handler) {
        FingerprintManager c6;
        if (Build.VERSION.SDK_INT < 23 || (c6 = c(this.f2140a)) == null) {
            return;
        }
        b.a(c6, h(eVar), fVar != null ? (CancellationSignal) fVar.b() : null, i6, g(cVar), handler);
    }

    public boolean d() {
        FingerprintManager c6;
        return Build.VERSION.SDK_INT >= 23 && (c6 = c(this.f2140a)) != null && b.d(c6);
    }

    public boolean e() {
        FingerprintManager c6;
        return Build.VERSION.SDK_INT >= 23 && (c6 = c(this.f2140a)) != null && b.e(c6);
    }
}
