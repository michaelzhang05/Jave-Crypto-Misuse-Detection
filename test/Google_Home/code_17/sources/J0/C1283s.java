package J0;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.AbstractC3828l;

/* renamed from: J0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1283s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4753a;

    /* renamed from: b, reason: collision with root package name */
    private final A0.f f4754b;

    /* renamed from: c, reason: collision with root package name */
    private final C1289y f4755c;

    /* renamed from: f, reason: collision with root package name */
    private C1284t f4758f;

    /* renamed from: g, reason: collision with root package name */
    private C1284t f4759g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4760h;

    /* renamed from: i, reason: collision with root package name */
    private C1282q f4761i;

    /* renamed from: j, reason: collision with root package name */
    private final D f4762j;

    /* renamed from: k, reason: collision with root package name */
    private final O0.g f4763k;

    /* renamed from: l, reason: collision with root package name */
    public final I0.b f4764l;

    /* renamed from: m, reason: collision with root package name */
    private final H0.a f4765m;

    /* renamed from: n, reason: collision with root package name */
    private final ExecutorService f4766n;

    /* renamed from: o, reason: collision with root package name */
    private final C1280o f4767o;

    /* renamed from: p, reason: collision with root package name */
    private final C1279n f4768p;

    /* renamed from: q, reason: collision with root package name */
    private final G0.a f4769q;

    /* renamed from: r, reason: collision with root package name */
    private final G0.m f4770r;

    /* renamed from: e, reason: collision with root package name */
    private final long f4757e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final I f4756d = new I();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.s$a */
    /* loaded from: classes3.dex */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q0.i f4771a;

        a(Q0.i iVar) {
            this.f4771a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            return C1283s.this.f(this.f4771a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.s$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q0.i f4773a;

        b(Q0.i iVar) {
            this.f4773a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1283s.this.f(this.f4773a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.s$c */
    /* loaded from: classes3.dex */
    public class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d8 = C1283s.this.f4758f.d();
                if (!d8) {
                    G0.h.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d8);
            } catch (Exception e8) {
                G0.h.f().e("Problem encountered deleting Crashlytics initialization marker.", e8);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.s$d */
    /* loaded from: classes3.dex */
    public class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C1283s.this.f4761i.r());
        }
    }

    public C1283s(A0.f fVar, D d8, G0.a aVar, C1289y c1289y, I0.b bVar, H0.a aVar2, O0.g gVar, ExecutorService executorService, C1279n c1279n, G0.m mVar) {
        this.f4754b = fVar;
        this.f4755c = c1289y;
        this.f4753a = fVar.k();
        this.f4762j = d8;
        this.f4769q = aVar;
        this.f4764l = bVar;
        this.f4765m = aVar2;
        this.f4766n = executorService;
        this.f4763k = gVar;
        this.f4767o = new C1280o(executorService);
        this.f4768p = c1279n;
        this.f4770r = mVar;
    }

    private void d() {
        try {
            this.f4760h = Boolean.TRUE.equals((Boolean) a0.f(this.f4767o.g(new d())));
        } catch (Exception unused) {
            this.f4760h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task f(Q0.i iVar) {
        m();
        try {
            this.f4764l.a(new I0.a() { // from class: J0.r
                @Override // I0.a
                public final void a(String str) {
                    C1283s.this.k(str);
                }
            });
            this.f4761i.R();
            if (!iVar.b().f9094b.f9101a) {
                G0.h.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return AbstractC3828l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f4761i.y(iVar)) {
                G0.h.f().k("Previous sessions could not be finalized.");
            }
            return this.f4761i.T(iVar.a());
        } catch (Exception e8) {
            G0.h.f().e("Crashlytics encountered a problem during asynchronous initialization.", e8);
            return AbstractC3828l.d(e8);
        } finally {
            l();
        }
    }

    private void h(Q0.i iVar) {
        Future<?> submit = this.f4766n.submit(new b(iVar));
        G0.h.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            G0.h.f().e("Crashlytics was interrupted during initialization.", e8);
        } catch (ExecutionException e9) {
            G0.h.f().e("Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            G0.h.f().e("Crashlytics timed out during initialization.", e10);
        }
    }

    public static String i() {
        return "19.1.0";
    }

    static boolean j(String str, boolean z8) {
        if (!z8) {
            G0.h.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean e() {
        return this.f4758f.c();
    }

    public Task g(Q0.i iVar) {
        return a0.h(this.f4766n, new a(iVar));
    }

    public void k(String str) {
        this.f4761i.W(System.currentTimeMillis() - this.f4757e, str);
    }

    void l() {
        this.f4767o.g(new c());
    }

    void m() {
        this.f4767o.b();
        this.f4758f.a();
        G0.h.f().i("Initialization marker file was created.");
    }

    public boolean n(C1267b c1267b, Q0.i iVar) {
        if (j(c1267b.f4656b, AbstractC1275j.i(this.f4753a, "com.crashlytics.RequireBuildId", true))) {
            String c8 = new C1274i().c();
            try {
                this.f4759g = new C1284t("crash_marker", this.f4763k);
                this.f4758f = new C1284t("initialization_marker", this.f4763k);
                K0.l lVar = new K0.l(c8, this.f4763k, this.f4767o);
                K0.e eVar = new K0.e(this.f4763k);
                R0.a aVar = new R0.a(1024, new R0.c(10));
                this.f4770r.c(lVar);
                this.f4761i = new C1282q(this.f4753a, this.f4767o, this.f4762j, this.f4755c, this.f4763k, this.f4759g, c1267b, lVar, eVar, T.h(this.f4753a, this.f4762j, this.f4763k, c1267b, eVar, lVar, aVar, iVar, this.f4756d, this.f4768p), this.f4769q, this.f4765m, this.f4768p);
                boolean e8 = e();
                d();
                this.f4761i.w(c8, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (e8 && AbstractC1275j.d(this.f4753a)) {
                    G0.h.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(iVar);
                    return false;
                }
                G0.h.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e9) {
                G0.h.f().e("Crashlytics was not started due to an exception during initialization", e9);
                this.f4761i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void o(Boolean bool) {
        this.f4755c.h(bool);
    }
}
