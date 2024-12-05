package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.b0;
import androidx.biometric.c0;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3660a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f3661b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3662a;

        static {
            int[] iArr = new int[EnumC0065c.values().length];
            f3662a = iArr;
            try {
                iArr[EnumC0065c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f3663a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f3664b;

        /* renamed from: c, reason: collision with root package name */
        EnumC0065c f3665c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3666d;

        /* renamed from: e, reason: collision with root package name */
        int f3667e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3668f;

        /* renamed from: g, reason: collision with root package name */
        final Context f3669g;

        /* loaded from: classes.dex */
        static class a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0063a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.security.crypto.c$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0064b {
                static void a(KeyGenParameterSpec.Builder builder, int i6, int i7) {
                    builder.setUserAuthenticationParameters(i6, i7);
                }
            }

            static c a(b bVar) {
                KeyGenParameterSpec.Builder blockModes;
                KeyGenParameterSpec.Builder encryptionPaddings;
                KeyGenParameterSpec.Builder keySize;
                KeyGenParameterSpec build;
                EnumC0065c enumC0065c = bVar.f3665c;
                if (enumC0065c == null && bVar.f3664b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (enumC0065c == EnumC0065c.AES256_GCM) {
                    c0.a();
                    blockModes = b0.a(bVar.f3663a, 3).setBlockModes("GCM");
                    encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                    keySize = encryptionPaddings.setKeySize(256);
                    if (bVar.f3666d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C0064b.a(keySize, bVar.f3667e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(bVar.f3667e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && bVar.f3668f && bVar.f3669g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0063a.a(keySize);
                    }
                    build = keySize.build();
                    bVar.f3664b = build;
                }
                KeyGenParameterSpec keyGenParameterSpec = bVar.f3664b;
                if (keyGenParameterSpec != null) {
                    return new c(p.c(keyGenParameterSpec), bVar.f3664b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                String keystoreAlias;
                keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                return keystoreAlias;
            }
        }

        public b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public c a() {
            return Build.VERSION.SDK_INT >= 23 ? a.a(this) : new c(this.f3663a, null);
        }

        public b b(EnumC0065c enumC0065c) {
            if (a.f3662a[enumC0065c.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + enumC0065c);
            }
            if (Build.VERSION.SDK_INT >= 23 && this.f3664b != null) {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            this.f3665c = enumC0065c;
            return this;
        }

        public b c(boolean z5, int i6) {
            this.f3666d = z5;
            this.f3667e = i6;
            return this;
        }

        public b(Context context, String str) {
            this.f3669g = context.getApplicationContext();
            this.f3663a = str;
        }
    }

    /* renamed from: androidx.security.crypto.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0065c {
        AES256_GCM
    }

    c(String str, Object obj) {
        this.f3660a = str;
        this.f3661b = Build.VERSION.SDK_INT >= 23 ? androidx.security.crypto.b.a(obj) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f3660a;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f3660a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f3660a + ", isKeyStoreBacked=" + b() + "}";
    }
}
