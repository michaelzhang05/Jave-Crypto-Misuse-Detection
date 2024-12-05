package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.a;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class w extends androidx.lifecycle.e0 {
    private androidx.lifecycle.q A;

    /* renamed from: d, reason: collision with root package name */
    private Executor f1367d;

    /* renamed from: e, reason: collision with root package name */
    private BiometricPrompt.a f1368e;

    /* renamed from: f, reason: collision with root package name */
    private BiometricPrompt.d f1369f;

    /* renamed from: g, reason: collision with root package name */
    private BiometricPrompt.c f1370g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.biometric.a f1371h;

    /* renamed from: i, reason: collision with root package name */
    private x f1372i;

    /* renamed from: j, reason: collision with root package name */
    private DialogInterface.OnClickListener f1373j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1374k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1376m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1377n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1378o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1379p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1380q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.lifecycle.q f1381r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.lifecycle.q f1382s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.lifecycle.q f1383t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.lifecycle.q f1384u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.lifecycle.q f1385v;

    /* renamed from: x, reason: collision with root package name */
    private androidx.lifecycle.q f1387x;

    /* renamed from: z, reason: collision with root package name */
    private androidx.lifecycle.q f1389z;

    /* renamed from: l, reason: collision with root package name */
    private int f1375l = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1386w = true;

    /* renamed from: y, reason: collision with root package name */
    private int f1388y = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BiometricPrompt.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends a.d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1391a;

        b(w wVar) {
            this.f1391a = new WeakReference(wVar);
        }

        @Override // androidx.biometric.a.d
        void a(int i6, CharSequence charSequence) {
            if (this.f1391a.get() == null || ((w) this.f1391a.get()).B() || !((w) this.f1391a.get()).z()) {
                return;
            }
            ((w) this.f1391a.get()).J(new e(i6, charSequence));
        }

        @Override // androidx.biometric.a.d
        void b() {
            if (this.f1391a.get() == null || !((w) this.f1391a.get()).z()) {
                return;
            }
            ((w) this.f1391a.get()).K(true);
        }

        @Override // androidx.biometric.a.d
        void c(CharSequence charSequence) {
            if (this.f1391a.get() != null) {
                ((w) this.f1391a.get()).L(charSequence);
            }
        }

        @Override // androidx.biometric.a.d
        void d(BiometricPrompt.b bVar) {
            if (this.f1391a.get() == null || !((w) this.f1391a.get()).z()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new BiometricPrompt.b(bVar.b(), ((w) this.f1391a.get()).t());
            }
            ((w) this.f1391a.get()).M(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1392a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1392a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1393a;

        d(w wVar) {
            this.f1393a = new WeakReference(wVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            if (this.f1393a.get() != null) {
                ((w) this.f1393a.get()).a0(true);
            }
        }
    }

    private static void e0(androidx.lifecycle.q qVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            qVar.k(obj);
        } else {
            qVar.i(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        BiometricPrompt.d dVar = this.f1369f;
        return dVar == null || dVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.f1378o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C() {
        return this.f1379p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData D() {
        if (this.f1387x == null) {
            this.f1387x = new androidx.lifecycle.q();
        }
        return this.f1387x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.f1386w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.f1380q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData G() {
        if (this.f1385v == null) {
            this.f1385v = new androidx.lifecycle.q();
        }
        return this.f1385v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        return this.f1376m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() {
        this.f1368e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(e eVar) {
        if (this.f1382s == null) {
            this.f1382s = new androidx.lifecycle.q();
        }
        e0(this.f1382s, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z5) {
        if (this.f1384u == null) {
            this.f1384u = new androidx.lifecycle.q();
        }
        e0(this.f1384u, Boolean.valueOf(z5));
    }

    void L(CharSequence charSequence) {
        if (this.f1383t == null) {
            this.f1383t = new androidx.lifecycle.q();
        }
        e0(this.f1383t, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(BiometricPrompt.b bVar) {
        if (this.f1381r == null) {
            this.f1381r = new androidx.lifecycle.q();
        }
        e0(this.f1381r, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z5) {
        this.f1377n = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i6) {
        this.f1375l = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(BiometricPrompt.a aVar) {
        this.f1368e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(Executor executor) {
        this.f1367d = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(boolean z5) {
        this.f1378o = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(BiometricPrompt.c cVar) {
        this.f1370g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(boolean z5) {
        this.f1379p = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(boolean z5) {
        if (this.f1387x == null) {
            this.f1387x = new androidx.lifecycle.q();
        }
        e0(this.f1387x, Boolean.valueOf(z5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(boolean z5) {
        this.f1386w = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(CharSequence charSequence) {
        if (this.A == null) {
            this.A = new androidx.lifecycle.q();
        }
        e0(this.A, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(int i6) {
        this.f1388y = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i6) {
        if (this.f1389z == null) {
            this.f1389z = new androidx.lifecycle.q();
        }
        e0(this.f1389z, Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(boolean z5) {
        this.f1380q = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(boolean z5) {
        if (this.f1385v == null) {
            this.f1385v = new androidx.lifecycle.q();
        }
        e0(this.f1385v, Boolean.valueOf(z5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(CharSequence charSequence) {
        this.f1374k = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(BiometricPrompt.d dVar) {
        this.f1369f = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(boolean z5) {
        this.f1376m = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        BiometricPrompt.d dVar = this.f1369f;
        if (dVar != null) {
            return androidx.biometric.d.b(dVar, this.f1370g);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.biometric.a g() {
        if (this.f1371h == null) {
            this.f1371h = new androidx.biometric.a(new b(this));
        }
        return this.f1371h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.q h() {
        if (this.f1382s == null) {
            this.f1382s = new androidx.lifecycle.q();
        }
        return this.f1382s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData i() {
        if (this.f1383t == null) {
            this.f1383t = new androidx.lifecycle.q();
        }
        return this.f1383t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData j() {
        if (this.f1381r == null) {
            this.f1381r = new androidx.lifecycle.q();
        }
        return this.f1381r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f1375l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x l() {
        if (this.f1372i == null) {
            this.f1372i = new x();
        }
        return this.f1372i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BiometricPrompt.a m() {
        if (this.f1368e == null) {
            this.f1368e = new a();
        }
        return this.f1368e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Executor n() {
        Executor executor = this.f1367d;
        return executor != null ? executor : new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BiometricPrompt.c o() {
        return this.f1370g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence p() {
        BiometricPrompt.d dVar = this.f1369f;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData q() {
        if (this.A == null) {
            this.A = new androidx.lifecycle.q();
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.f1388y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData s() {
        if (this.f1389z == null) {
            this.f1389z = new androidx.lifecycle.q();
        }
        return this.f1389z;
    }

    int t() {
        int f6 = f();
        return (!androidx.biometric.d.d(f6) || androidx.biometric.d.c(f6)) ? -1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterface.OnClickListener u() {
        if (this.f1373j == null) {
            this.f1373j = new d(this);
        }
        return this.f1373j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence v() {
        CharSequence charSequence = this.f1374k;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.d dVar = this.f1369f;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence w() {
        BiometricPrompt.d dVar = this.f1369f;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence x() {
        BiometricPrompt.d dVar = this.f1369f;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData y() {
        if (this.f1384u == null) {
            this.f1384u = new androidx.lifecycle.q();
        }
        return this.f1384u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f1377n;
    }
}
