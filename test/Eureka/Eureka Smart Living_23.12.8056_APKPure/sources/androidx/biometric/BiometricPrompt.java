package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.h;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class BiometricPrompt {

    /* renamed from: a, reason: collision with root package name */
    private androidx.fragment.app.w f1294a;

    /* loaded from: classes.dex */
    private static class ResetCallbackObserver implements androidx.lifecycle.l {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1295a;

        @androidx.lifecycle.s(h.a.ON_DESTROY)
        public void resetCallback() {
            if (this.f1295a.get() != null) {
                ((w) this.f1295a.get()).I();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(int i6, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f1296a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1297b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar, int i6) {
            this.f1296a = cVar;
            this.f1297b = i6;
        }

        public int a() {
            return this.f1297b;
        }

        public c b() {
            return this.f1296a;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f1298a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f1299b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f1300c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f1301d;

        public c(IdentityCredential identityCredential) {
            this.f1298a = null;
            this.f1299b = null;
            this.f1300c = null;
            this.f1301d = identityCredential;
        }

        public Cipher a() {
            return this.f1299b;
        }

        public IdentityCredential b() {
            return this.f1301d;
        }

        public Mac c() {
            return this.f1300c;
        }

        public Signature d() {
            return this.f1298a;
        }

        public c(Signature signature) {
            this.f1298a = signature;
            this.f1299b = null;
            this.f1300c = null;
            this.f1301d = null;
        }

        public c(Cipher cipher) {
            this.f1298a = null;
            this.f1299b = cipher;
            this.f1300c = null;
            this.f1301d = null;
        }

        public c(Mac mac) {
            this.f1298a = null;
            this.f1299b = null;
            this.f1300c = mac;
            this.f1301d = null;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f1302a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f1303b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f1304c;

        /* renamed from: d, reason: collision with root package name */
        private final CharSequence f1305d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f1306e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f1307f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1308g;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private CharSequence f1309a = null;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f1310b = null;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f1311c = null;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f1312d = null;

            /* renamed from: e, reason: collision with root package name */
            private boolean f1313e = true;

            /* renamed from: f, reason: collision with root package name */
            private boolean f1314f = false;

            /* renamed from: g, reason: collision with root package name */
            private int f1315g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f1309a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.d.e(this.f1315g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + androidx.biometric.d.a(this.f1315g));
                }
                int i6 = this.f1315g;
                boolean c6 = i6 != 0 ? androidx.biometric.d.c(i6) : this.f1314f;
                if (TextUtils.isEmpty(this.f1312d) && !c6) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f1312d) || !c6) {
                    return new d(this.f1309a, this.f1310b, this.f1311c, this.f1312d, this.f1313e, this.f1314f, this.f1315g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(int i6) {
                this.f1315g = i6;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f1310b = charSequence;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f1309a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z5, boolean z6, int i6) {
            this.f1302a = charSequence;
            this.f1303b = charSequence2;
            this.f1304c = charSequence3;
            this.f1305d = charSequence4;
            this.f1306e = z5;
            this.f1307f = z6;
            this.f1308g = i6;
        }

        public int a() {
            return this.f1308g;
        }

        public CharSequence b() {
            return this.f1304c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f1305d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f1303b;
        }

        public CharSequence e() {
            return this.f1302a;
        }

        public boolean f() {
            return this.f1306e;
        }

        public boolean g() {
            return this.f1307f;
        }
    }

    public BiometricPrompt(androidx.fragment.app.j jVar, Executor executor, a aVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(jVar.U(), e(jVar), executor, aVar);
    }

    private void b(d dVar, c cVar) {
        androidx.fragment.app.w wVar = this.f1294a;
        if (wVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (wVar.O0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d(this.f1294a).G1(dVar, cVar);
        }
    }

    private static f c(androidx.fragment.app.w wVar) {
        return (f) wVar.i0("androidx.biometric.BiometricFragment");
    }

    private static f d(androidx.fragment.app.w wVar) {
        f c6 = c(wVar);
        if (c6 != null) {
            return c6;
        }
        f W1 = f.W1();
        wVar.o().d(W1, "androidx.biometric.BiometricFragment").g();
        wVar.e0();
        return W1;
    }

    private static w e(androidx.fragment.app.j jVar) {
        if (jVar != null) {
            return (w) new androidx.lifecycle.f0(jVar).a(w.class);
        }
        return null;
    }

    private void f(androidx.fragment.app.w wVar, w wVar2, Executor executor, a aVar) {
        this.f1294a = wVar;
        if (wVar2 != null) {
            if (executor != null) {
                wVar2.Q(executor);
            }
            wVar2.P(aVar);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        b(dVar, null);
    }
}
