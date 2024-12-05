package n3;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.b0;
import androidx.biometric.c0;
import g3.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import u3.p;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7988c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final String f7989d = "c";

    /* renamed from: a, reason: collision with root package name */
    private final String f7990a;

    /* renamed from: b, reason: collision with root package name */
    private KeyStore f7991b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f7992a = null;

        /* renamed from: b, reason: collision with root package name */
        KeyStore f7993b;

        public a() {
            this.f7993b = null;
            if (!c.c()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f7993b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public c() {
        this(new a());
    }

    static /* synthetic */ boolean c() {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        c cVar = new c();
        synchronized (f7988c) {
            if (cVar.f(str)) {
                return false;
            }
            e(str);
            return true;
        }
    }

    static void e(String str) {
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec build;
        String b6 = u3.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        c0.a();
        keySize = b0.a(b6, 3).setKeySize(256);
        blockModes = keySize.setBlockModes("GCM");
        encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
        build = encryptionPaddings.build();
        keyGenerator.init(build);
        keyGenerator.generateKey();
    }

    private static boolean g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static g3.a i(g3.a aVar) {
        byte[] c6 = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c6, aVar.b(aVar.a(c6, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // g3.r
    public synchronized g3.a a(String str) {
        String str2 = this.f7990a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f7990a, str));
        }
        return i(new b(u3.r.b("android-keystore://", str), this.f7991b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L15;
     */
    @Override // g3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f7990a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.f7990a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.c.b(java.lang.String):boolean");
    }

    synchronized boolean f(String str) {
        String b6;
        b6 = u3.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f7989d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f7991b = keyStore;
                keyStore.load(null);
                return this.f7991b.containsAlias(b6);
            } catch (IOException e6) {
                throw new GeneralSecurityException(e6);
            }
        }
        return this.f7991b.containsAlias(b6);
    }

    private c(a aVar) {
        this.f7990a = aVar.f7992a;
        this.f7991b = aVar.f7993b;
    }
}
