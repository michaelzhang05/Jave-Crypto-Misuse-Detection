package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private BiometricPrompt.AuthenticationCallback f1316a;

    /* renamed from: b, reason: collision with root package name */
    private a.c f1317b;

    /* renamed from: c, reason: collision with root package name */
    final d f1318c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.biometric.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0013a extends a.c {
        C0013a() {
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void a(int i6, CharSequence charSequence) {
            a.this.f1318c.a(i6, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void b() {
            a.this.f1318c.b();
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void c(int i6, CharSequence charSequence) {
            a.this.f1318c.c(charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void d(a.d dVar) {
            a.this.f1318c.d(new BiometricPrompt.b(dVar != null ? d0.c(dVar.a()) : null, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.biometric.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0014a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f1320a;

            C0014a(d dVar) {
                this.f1320a = dVar;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i6, CharSequence charSequence) {
                this.f1320a.a(i6, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                this.f1320a.b();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i6, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.c cVar;
                BiometricPrompt.CryptoObject cryptoObject;
                if (authenticationResult != null) {
                    cryptoObject = authenticationResult.getCryptoObject();
                    cVar = d0.b(cryptoObject);
                } else {
                    cVar = null;
                }
                int i6 = Build.VERSION.SDK_INT;
                int i7 = -1;
                if (i6 >= 30) {
                    if (authenticationResult != null) {
                        i7 = c.a(authenticationResult);
                    }
                } else if (i6 != 29) {
                    i7 = 2;
                }
                this.f1320a.d(new BiometricPrompt.b(cVar, i7));
            }
        }

        static BiometricPrompt.AuthenticationCallback a(d dVar) {
            return new C0014a(dVar);
        }
    }

    /* loaded from: classes.dex */
    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            int authenticationType;
            authenticationType = authenticationResult.getAuthenticationType();
            return authenticationType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        abstract void a(int i6, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(BiometricPrompt.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d dVar) {
        this.f1318c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BiometricPrompt.AuthenticationCallback a() {
        if (this.f1316a == null) {
            this.f1316a = b.a(this.f1318c);
        }
        return this.f1316a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c b() {
        if (this.f1317b == null) {
            this.f1317b = new C0013a();
        }
        return this.f1317b;
    }
}
