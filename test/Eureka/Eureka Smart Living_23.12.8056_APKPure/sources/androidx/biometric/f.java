package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f extends Fragment {

    /* renamed from: c0, reason: collision with root package name */
    Handler f1323c0 = new Handler(Looper.getMainLooper());

    /* renamed from: d0, reason: collision with root package name */
    w f1324d0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f1326b;

        a(int i6, CharSequence charSequence) {
            this.f1325a = i6;
            this.f1326b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f1324d0.m().a(this.f1325a, this.f1326b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f1324d0.m().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements androidx.lifecycle.r {
        c() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(BiometricPrompt.b bVar) {
            if (bVar != null) {
                f.this.a2(bVar);
                f.this.f1324d0.M(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.r {
        d() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.biometric.e eVar) {
            if (eVar != null) {
                f.this.X1(eVar.b(), eVar.c());
                f.this.f1324d0.J(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements androidx.lifecycle.r {
        e() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            if (charSequence != null) {
                f.this.Z1(charSequence);
                f.this.f1324d0.J(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.biometric.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0015f implements androidx.lifecycle.r {
        C0015f() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                f.this.Y1();
                f.this.f1324d0.K(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements androidx.lifecycle.r {
        g() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                if (f.this.T1()) {
                    f.this.c2();
                } else {
                    f.this.b2();
                }
                f.this.f1324d0.a0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements androidx.lifecycle.r {
        h() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                f.this.J1(1);
                f.this.M1();
                f.this.f1324d0.U(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f1324d0.V(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f1337b;

        j(int i6, CharSequence charSequence) {
            this.f1336a = i6;
            this.f1337b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.d2(this.f1336a, this.f1337b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BiometricPrompt.b f1339a;

        k(BiometricPrompt.b bVar) {
            this.f1339a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f1324d0.m().c(this.f1339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {
        static void a(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        static void b(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        static android.hardware.biometrics.BiometricPrompt c(BiometricPrompt.Builder builder) {
            android.hardware.biometrics.BiometricPrompt build;
            build = builder.build();
            return build;
        }

        static BiometricPrompt.Builder d(Context context) {
            androidx.biometric.o.a();
            return androidx.biometric.n.a(context);
        }

        static void e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {
        static void a(BiometricPrompt.Builder builder, boolean z5) {
            builder.setConfirmationRequired(z5);
        }

        static void b(BiometricPrompt.Builder builder, boolean z5) {
            builder.setDeviceCredentialAllowed(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(BiometricPrompt.Builder builder, int i6) {
            builder.setAllowedAuthenticators(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class p implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1341a = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1341a.post(runnable);
        }
    }

    /* loaded from: classes.dex */
    private static class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1342a;

        q(f fVar) {
            this.f1342a = new WeakReference(fVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1342a.get() != null) {
                ((f) this.f1342a.get()).l2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1343a;

        r(w wVar) {
            this.f1343a = new WeakReference(wVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1343a.get() != null) {
                ((w) this.f1343a.get()).T(false);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1344a;

        s(w wVar) {
            this.f1344a = new WeakReference(wVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1344a.get() != null) {
                ((w) this.f1344a.get()).Z(false);
            }
        }
    }

    private static int K1(androidx.core.hardware.fingerprint.a aVar) {
        if (aVar.e()) {
            return !aVar.d() ? 11 : 0;
        }
        return 12;
    }

    private void L1() {
        if (m() == null) {
            return;
        }
        w wVar = (w) new androidx.lifecycle.f0(m()).a(w.class);
        this.f1324d0 = wVar;
        wVar.j().e(this, new c());
        this.f1324d0.h().e(this, new d());
        this.f1324d0.i().e(this, new e());
        this.f1324d0.y().e(this, new C0015f());
        this.f1324d0.G().e(this, new g());
        this.f1324d0.D().e(this, new h());
    }

    private void N1() {
        this.f1324d0.d0(false);
        if (b0()) {
            androidx.fragment.app.w I = I();
            p0 p0Var = (p0) I.i0("androidx.biometric.FingerprintDialogFragment");
            if (p0Var != null) {
                if (p0Var.b0()) {
                    p0Var.K1();
                } else {
                    I.o().l(p0Var).g();
                }
            }
        }
    }

    private int O1() {
        Context u5 = u();
        return (u5 == null || !n0.f(u5, Build.MODEL)) ? 2000 : 0;
    }

    private void P1(int i6) {
        if (i6 == -1) {
            g2(new BiometricPrompt.b(null, 1));
        } else {
            d2(10, U(z0.f1416l));
        }
    }

    private boolean Q1() {
        androidx.fragment.app.j m6 = m();
        return m6 != null && m6.isChangingConfigurations();
    }

    private boolean R1() {
        androidx.fragment.app.j m6 = m();
        return (m6 == null || this.f1324d0.o() == null || !n0.g(m6, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean S1() {
        return Build.VERSION.SDK_INT == 28 && !s0.a(u());
    }

    private boolean U1() {
        return Build.VERSION.SDK_INT < 28 || R1() || S1();
    }

    private void V1() {
        androidx.fragment.app.j m6 = m();
        if (m6 == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager a6 = q0.a(m6);
        if (a6 == null) {
            d2(12, U(z0.f1415k));
            return;
        }
        CharSequence x5 = this.f1324d0.x();
        CharSequence w5 = this.f1324d0.w();
        CharSequence p6 = this.f1324d0.p();
        if (w5 == null) {
            w5 = p6;
        }
        Intent a7 = l.a(a6, x5, w5);
        if (a7 == null) {
            d2(14, U(z0.f1414j));
            return;
        }
        this.f1324d0.R(true);
        if (U1()) {
            N1();
        }
        a7.setFlags(134742016);
        startActivityForResult(a7, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f W1() {
        return new f();
    }

    private void e2(int i6, CharSequence charSequence) {
        if (this.f1324d0.B()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f1324d0.z()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f1324d0.N(false);
            this.f1324d0.n().execute(new a(i6, charSequence));
        }
    }

    private void f2() {
        if (this.f1324d0.z()) {
            this.f1324d0.n().execute(new b());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    private void g2(BiometricPrompt.b bVar) {
        h2(bVar);
        M1();
    }

    private void h2(BiometricPrompt.b bVar) {
        if (!this.f1324d0.z()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f1324d0.N(false);
            this.f1324d0.n().execute(new k(bVar));
        }
    }

    private void i2() {
        BiometricPrompt.Builder d6 = m.d(s1().getApplicationContext());
        CharSequence x5 = this.f1324d0.x();
        CharSequence w5 = this.f1324d0.w();
        CharSequence p6 = this.f1324d0.p();
        if (x5 != null) {
            m.h(d6, x5);
        }
        if (w5 != null) {
            m.g(d6, w5);
        }
        if (p6 != null) {
            m.e(d6, p6);
        }
        CharSequence v5 = this.f1324d0.v();
        if (!TextUtils.isEmpty(v5)) {
            m.f(d6, v5, this.f1324d0.n(), this.f1324d0.u());
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            n.a(d6, this.f1324d0.A());
        }
        int f6 = this.f1324d0.f();
        if (i6 >= 30) {
            o.a(d6, f6);
        } else if (i6 >= 29) {
            n.b(d6, androidx.biometric.d.c(f6));
        }
        H1(m.c(d6), u());
    }

    private void j2() {
        Context applicationContext = s1().getApplicationContext();
        androidx.core.hardware.fingerprint.a b6 = androidx.core.hardware.fingerprint.a.b(applicationContext);
        int K1 = K1(b6);
        if (K1 != 0) {
            d2(K1, o0.a(applicationContext, K1));
            return;
        }
        if (b0()) {
            this.f1324d0.V(true);
            if (!n0.f(applicationContext, Build.MODEL)) {
                this.f1323c0.postDelayed(new i(), 500L);
                p0.Z1().V1(I(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f1324d0.O(0);
            I1(b6, applicationContext);
        }
    }

    private void k2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = U(z0.f1406b);
        }
        this.f1324d0.Y(2);
        this.f1324d0.W(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G1(BiometricPrompt.d dVar, BiometricPrompt.c cVar) {
        w wVar;
        w wVar2;
        String str;
        androidx.fragment.app.j m6 = m();
        if (m6 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f1324d0.c0(dVar);
        int b6 = androidx.biometric.d.b(dVar, cVar);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23 || i6 >= 30 || b6 != 15 || cVar != null) {
            wVar = this.f1324d0;
        } else {
            wVar = this.f1324d0;
            cVar = d0.a();
        }
        wVar.S(cVar);
        if (T1()) {
            wVar2 = this.f1324d0;
            str = U(z0.f1405a);
        } else {
            wVar2 = this.f1324d0;
            str = null;
        }
        wVar2.b0(str);
        if (T1() && u.g(m6).a(255) != 0) {
            this.f1324d0.N(true);
            V1();
        } else if (this.f1324d0.C()) {
            this.f1323c0.postDelayed(new q(this), 600L);
        } else {
            l2();
        }
    }

    void H1(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject d6 = d0.d(this.f1324d0.o());
        CancellationSignal b6 = this.f1324d0.l().b();
        p pVar = new p();
        BiometricPrompt.AuthenticationCallback a6 = this.f1324d0.g().a();
        try {
            if (d6 == null) {
                m.b(biometricPrompt, b6, pVar, a6);
            } else {
                m.a(biometricPrompt, d6, b6, pVar, a6);
            }
        } catch (NullPointerException e6) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e6);
            d2(1, context != null ? context.getString(z0.f1406b) : "");
        }
    }

    void I1(androidx.core.hardware.fingerprint.a aVar, Context context) {
        try {
            aVar.a(d0.e(this.f1324d0.o()), 0, this.f1324d0.l().c(), this.f1324d0.g().b(), null);
        } catch (NullPointerException e6) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e6);
            d2(1, o0.a(context, 1));
        }
    }

    void J1(int i6) {
        if (i6 == 3 || !this.f1324d0.F()) {
            if (U1()) {
                this.f1324d0.O(i6);
                if (i6 == 1) {
                    e2(10, o0.a(u(), 10));
                }
            }
            this.f1324d0.l().a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.d.c(this.f1324d0.f())) {
            this.f1324d0.Z(true);
            this.f1323c0.postDelayed(new s(this.f1324d0), 250L);
        }
    }

    void M1() {
        this.f1324d0.d0(false);
        N1();
        if (!this.f1324d0.B() && b0()) {
            I().o().l(this).g();
        }
        Context u5 = u();
        if (u5 == null || !n0.e(u5, Build.MODEL)) {
            return;
        }
        this.f1324d0.T(true);
        this.f1323c0.postDelayed(new r(this.f1324d0), 600L);
    }

    @Override // androidx.fragment.app.Fragment
    public void N0() {
        super.N0();
        if (Build.VERSION.SDK_INT >= 29 || this.f1324d0.B() || Q1()) {
            return;
        }
        J1(0);
    }

    boolean T1() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.d.c(this.f1324d0.f());
    }

    void X1(int i6, CharSequence charSequence) {
        if (!o0.b(i6)) {
            i6 = 8;
        }
        Context u5 = u();
        if (Build.VERSION.SDK_INT < 29 && o0.c(i6) && u5 != null && q0.b(u5) && androidx.biometric.d.c(this.f1324d0.f())) {
            V1();
            return;
        }
        if (!U1()) {
            if (charSequence == null) {
                charSequence = U(z0.f1406b) + " " + i6;
            }
            d2(i6, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = o0.a(u(), i6);
        }
        if (i6 == 5) {
            int k6 = this.f1324d0.k();
            if (k6 == 0 || k6 == 3) {
                e2(i6, charSequence);
            }
            M1();
            return;
        }
        if (this.f1324d0.E()) {
            d2(i6, charSequence);
        } else {
            k2(charSequence);
            this.f1323c0.postDelayed(new j(i6, charSequence), O1());
        }
        this.f1324d0.V(true);
    }

    void Y1() {
        if (U1()) {
            k2(U(z0.f1413i));
        }
        f2();
    }

    void Z1(CharSequence charSequence) {
        if (U1()) {
            k2(charSequence);
        }
    }

    void a2(BiometricPrompt.b bVar) {
        g2(bVar);
    }

    void b2() {
        CharSequence v5 = this.f1324d0.v();
        if (v5 == null) {
            v5 = U(z0.f1406b);
        }
        d2(13, v5);
        J1(2);
    }

    void c2() {
        V1();
    }

    void d2(int i6, CharSequence charSequence) {
        e2(i6, charSequence);
        M1();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(int i6, int i7, Intent intent) {
        super.k0(i6, i7, intent);
        if (i6 == 1) {
            this.f1324d0.R(false);
            P1(i7);
        }
    }

    void l2() {
        if (this.f1324d0.H()) {
            return;
        }
        if (u() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f1324d0.d0(true);
        this.f1324d0.N(true);
        if (U1()) {
            j2();
        } else {
            i2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p0(Bundle bundle) {
        super.p0(bundle);
        L1();
    }
}
