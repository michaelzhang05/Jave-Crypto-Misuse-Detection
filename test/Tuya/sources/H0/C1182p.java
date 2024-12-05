package H0;

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

/* renamed from: H0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1182p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3370a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.e f3371b;

    /* renamed from: c, reason: collision with root package name */
    private final C1187v f3372c;

    /* renamed from: f, reason: collision with root package name */
    private C1183q f3375f;

    /* renamed from: g, reason: collision with root package name */
    private C1183q f3376g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3377h;

    /* renamed from: i, reason: collision with root package name */
    private C1180n f3378i;

    /* renamed from: j, reason: collision with root package name */
    private final z f3379j;

    /* renamed from: k, reason: collision with root package name */
    private final M0.f f3380k;

    /* renamed from: l, reason: collision with root package name */
    public final G0.b f3381l;

    /* renamed from: m, reason: collision with root package name */
    private final F0.a f3382m;

    /* renamed from: n, reason: collision with root package name */
    private final ExecutorService f3383n;

    /* renamed from: o, reason: collision with root package name */
    private final C1178l f3384o;

    /* renamed from: p, reason: collision with root package name */
    private final C1177k f3385p;

    /* renamed from: q, reason: collision with root package name */
    private final E0.a f3386q;

    /* renamed from: e, reason: collision with root package name */
    private final long f3374e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final E f3373d = new E();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$a */
    /* loaded from: classes3.dex */
    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0.i f3387a;

        a(O0.i iVar) {
            this.f3387a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            return C1182p.this.f(this.f3387a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0.i f3389a;

        b(O0.i iVar) {
            this.f3389a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1182p.this.f(this.f3389a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$c */
    /* loaded from: classes3.dex */
    public class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d8 = C1182p.this.f3375f.d();
                if (!d8) {
                    E0.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d8);
            } catch (Exception e8) {
                E0.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e8);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.p$d */
    /* loaded from: classes3.dex */
    public class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C1182p.this.f3378i.s());
        }
    }

    public C1182p(y0.e eVar, z zVar, E0.a aVar, C1187v c1187v, G0.b bVar, F0.a aVar2, M0.f fVar, ExecutorService executorService, C1177k c1177k) {
        this.f3371b = eVar;
        this.f3372c = c1187v;
        this.f3370a = eVar.k();
        this.f3379j = zVar;
        this.f3386q = aVar;
        this.f3381l = bVar;
        this.f3382m = aVar2;
        this.f3383n = executorService;
        this.f3380k = fVar;
        this.f3384o = new C1178l(executorService);
        this.f3385p = c1177k;
    }

    private void d() {
        try {
            this.f3377h = Boolean.TRUE.equals((Boolean) W.f(this.f3384o.g(new d())));
        } catch (Exception unused) {
            this.f3377h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task f(O0.i iVar) {
        m();
        try {
            this.f3381l.a(new G0.a() { // from class: H0.o
                @Override // G0.a
                public final void a(String str) {
                    C1182p.this.k(str);
                }
            });
            this.f3378i.S();
            if (!iVar.b().f7695b.f7702a) {
                E0.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return r0.l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f3378i.z(iVar)) {
                E0.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f3378i.U(iVar.a());
        } catch (Exception e8) {
            E0.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e8);
            return r0.l.d(e8);
        } finally {
            l();
        }
    }

    private void h(O0.i iVar) {
        Future<?> submit = this.f3383n.submit(new b(iVar));
        E0.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            E0.f.f().e("Crashlytics was interrupted during initialization.", e8);
        } catch (ExecutionException e9) {
            E0.f.f().e("Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            E0.f.f().e("Crashlytics timed out during initialization.", e10);
        }
    }

    public static String i() {
        return "18.4.1";
    }

    static boolean j(String str, boolean z8) {
        if (!z8) {
            E0.f.f().i("Configured not to require a build ID.");
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
        return this.f3375f.c();
    }

    public Task g(O0.i iVar) {
        return W.h(this.f3383n, new a(iVar));
    }

    public void k(String str) {
        this.f3378i.X(System.currentTimeMillis() - this.f3374e, str);
    }

    void l() {
        this.f3384o.g(new c());
    }

    void m() {
        this.f3384o.b();
        this.f3375f.a();
        E0.f.f().i("Initialization marker file was created.");
    }

    public boolean n(C1168b c1168b, O0.i iVar) {
        if (j(c1168b.f3280b, AbstractC1176j.k(this.f3370a, "com.crashlytics.RequireBuildId", true))) {
            String c1175i = new C1175i(this.f3379j).toString();
            try {
                this.f3376g = new C1183q("crash_marker", this.f3380k);
                this.f3375f = new C1183q("initialization_marker", this.f3380k);
                I0.h hVar = new I0.h(c1175i, this.f3380k, this.f3384o);
                I0.c cVar = new I0.c(this.f3380k);
                this.f3378i = new C1180n(this.f3370a, this.f3384o, this.f3379j, this.f3372c, this.f3380k, this.f3376g, c1168b, hVar, cVar, O.g(this.f3370a, this.f3379j, this.f3380k, c1168b, cVar, hVar, new P0.a(1024, new P0.c(10)), iVar, this.f3373d, this.f3385p), this.f3386q, this.f3382m);
                boolean e8 = e();
                d();
                this.f3378i.x(c1175i, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (e8 && AbstractC1176j.c(this.f3370a)) {
                    E0.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    h(iVar);
                    return false;
                }
                E0.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e9) {
                E0.f.f().e("Crashlytics was not started due to an exception during initialization", e9);
                this.f3378i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public void o(Boolean bool) {
        this.f3372c.h(bool);
    }
}
