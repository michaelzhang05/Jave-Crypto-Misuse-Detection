package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final d f1361a;

    /* renamed from: b, reason: collision with root package name */
    private final BiometricManager f1362b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f1363c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(BiometricManager biometricManager) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate();
            return canAuthenticate;
        }

        static BiometricManager b(Context context) {
            Object systemService;
            systemService = context.getSystemService((Class<Object>) BiometricManager.class);
            return s.a(systemService);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        static int a(BiometricManager biometricManager, int i6) {
            int canAuthenticate;
            canAuthenticate = biometricManager.canAuthenticate(i6);
            return canAuthenticate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1364a;

        c(Context context) {
            this.f1364a = context.getApplicationContext();
        }

        @Override // androidx.biometric.u.d
        public boolean a() {
            return s0.a(this.f1364a);
        }

        @Override // androidx.biometric.u.d
        public BiometricManager b() {
            return a.b(this.f1364a);
        }

        @Override // androidx.biometric.u.d
        public boolean c() {
            return n0.a(this.f1364a, Build.MODEL);
        }

        @Override // androidx.biometric.u.d
        public boolean d() {
            return q0.b(this.f1364a);
        }

        @Override // androidx.biometric.u.d
        public boolean e() {
            return q0.a(this.f1364a) != null;
        }

        @Override // androidx.biometric.u.d
        public androidx.core.hardware.fingerprint.a f() {
            return androidx.core.hardware.fingerprint.a.b(this.f1364a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        boolean a();

        BiometricManager b();

        boolean c();

        boolean d();

        boolean e();

        androidx.core.hardware.fingerprint.a f();
    }

    u(d dVar) {
        this.f1361a = dVar;
        int i6 = Build.VERSION.SDK_INT;
        this.f1362b = i6 >= 29 ? dVar.b() : null;
        this.f1363c = i6 <= 29 ? dVar.f() : null;
    }

    private int b(int i6) {
        if (!androidx.biometric.d.e(i6)) {
            return -2;
        }
        if (i6 == 0 || !this.f1361a.e()) {
            return 12;
        }
        if (androidx.biometric.d.c(i6)) {
            return this.f1361a.d() ? 0 : 11;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 29) {
            return androidx.biometric.d.f(i6) ? f() : e();
        }
        if (i7 != 28) {
            return c();
        }
        if (this.f1361a.a()) {
            return d();
        }
        return 12;
    }

    private int c() {
        androidx.core.hardware.fingerprint.a aVar = this.f1363c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.e()) {
            return !this.f1363c.d() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f1361a.d() ? c() : c() == 0 ? 0 : -1;
    }

    private int e() {
        BiometricPrompt.CryptoObject d6;
        Method c6 = a.c();
        if (c6 != null && (d6 = d0.d(d0.a())) != null) {
            try {
                Object invoke = c6.invoke(this.f1362b, d6);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e6);
            }
        }
        int f6 = f();
        return (this.f1361a.c() || f6 != 0) ? f6 : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f1362b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static u g(Context context) {
        return new u(new c(context));
    }

    public int a(int i6) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i6);
        }
        BiometricManager biometricManager = this.f1362b;
        if (biometricManager != null) {
            return b.a(biometricManager, i6);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
