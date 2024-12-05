package J0;

import J0.C1287w;
import L0.F;
import L0.G;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.AbstractC3828l;
import q0.C3826j;
import q0.InterfaceC3825i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1282q {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f4708t = new FilenameFilter() { // from class: J0.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean J8;
            J8 = C1282q.J(file, str);
            return J8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f4709a;

    /* renamed from: b, reason: collision with root package name */
    private final C1289y f4710b;

    /* renamed from: c, reason: collision with root package name */
    private final C1284t f4711c;

    /* renamed from: d, reason: collision with root package name */
    private final K0.l f4712d;

    /* renamed from: e, reason: collision with root package name */
    private final C1280o f4713e;

    /* renamed from: f, reason: collision with root package name */
    private final D f4714f;

    /* renamed from: g, reason: collision with root package name */
    private final O0.g f4715g;

    /* renamed from: h, reason: collision with root package name */
    private final C1267b f4716h;

    /* renamed from: i, reason: collision with root package name */
    private final K0.e f4717i;

    /* renamed from: j, reason: collision with root package name */
    private final G0.a f4718j;

    /* renamed from: k, reason: collision with root package name */
    private final H0.a f4719k;

    /* renamed from: l, reason: collision with root package name */
    private final C1279n f4720l;

    /* renamed from: m, reason: collision with root package name */
    private final T f4721m;

    /* renamed from: n, reason: collision with root package name */
    private C1287w f4722n;

    /* renamed from: o, reason: collision with root package name */
    private Q0.i f4723o = null;

    /* renamed from: p, reason: collision with root package name */
    final C3826j f4724p = new C3826j();

    /* renamed from: q, reason: collision with root package name */
    final C3826j f4725q = new C3826j();

    /* renamed from: r, reason: collision with root package name */
    final C3826j f4726r = new C3826j();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f4727s = new AtomicBoolean(false);

    /* renamed from: J0.q$a */
    /* loaded from: classes3.dex */
    class a implements C1287w.a {
        a() {
        }

        @Override // J0.C1287w.a
        public void a(Q0.i iVar, Thread thread, Throwable th) {
            C1282q.this.G(iVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$b */
    /* loaded from: classes3.dex */
    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f4730b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f4731c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q0.i f4732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4733e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J0.q$b$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC3825i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Executor f4735a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f4736b;

            a(Executor executor, String str) {
                this.f4735a = executor;
                this.f4736b = str;
            }

            @Override // q0.InterfaceC3825i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(Q0.d dVar) {
                String str = null;
                if (dVar != null) {
                    Task M8 = C1282q.this.M();
                    T t8 = C1282q.this.f4721m;
                    Executor executor = this.f4735a;
                    if (b.this.f4733e) {
                        str = this.f4736b;
                    }
                    return AbstractC3828l.g(M8, t8.x(executor, str));
                }
                G0.h.f().k("Received null app settings, cannot send reports at crash time.");
                return AbstractC3828l.e(null);
            }
        }

        b(long j8, Throwable th, Thread thread, Q0.i iVar, boolean z8) {
            this.f4729a = j8;
            this.f4730b = th;
            this.f4731c = thread;
            this.f4732d = iVar;
            this.f4733e = z8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long E8 = C1282q.E(this.f4729a);
            String A8 = C1282q.this.A();
            if (A8 == null) {
                G0.h.f().d("Tried to write a fatal exception while no session was open.");
                return AbstractC3828l.e(null);
            }
            C1282q.this.f4711c.a();
            C1282q.this.f4721m.t(this.f4730b, this.f4731c, A8, E8);
            C1282q.this.v(this.f4729a);
            C1282q.this.s(this.f4732d);
            C1282q.this.u(new C1274i().c(), Boolean.valueOf(this.f4733e));
            if (!C1282q.this.f4710b.d()) {
                return AbstractC3828l.e(null);
            }
            Executor c8 = C1282q.this.f4713e.c();
            return this.f4732d.a().o(c8, new a(c8, A8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3825i {
        c() {
        }

        @Override // q0.InterfaceC3825i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r12) {
            return AbstractC3828l.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC3825i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f4739a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J0.q$d$a */
        /* loaded from: classes3.dex */
        public class a implements Callable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f4741a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: J0.q$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0071a implements InterfaceC3825i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Executor f4743a;

                C0071a(Executor executor) {
                    this.f4743a = executor;
                }

                @Override // q0.InterfaceC3825i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Task a(Q0.d dVar) {
                    if (dVar != null) {
                        C1282q.this.M();
                        C1282q.this.f4721m.w(this.f4743a);
                        C1282q.this.f4726r.e(null);
                        return AbstractC3828l.e(null);
                    }
                    G0.h.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return AbstractC3828l.e(null);
                }
            }

            a(Boolean bool) {
                this.f4741a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task call() {
                if (!this.f4741a.booleanValue()) {
                    G0.h.f().i("Deleting cached crash reports...");
                    C1282q.q(C1282q.this.K());
                    C1282q.this.f4721m.v();
                    C1282q.this.f4726r.e(null);
                    return AbstractC3828l.e(null);
                }
                G0.h.f().b("Sending cached crash reports...");
                C1282q.this.f4710b.c(this.f4741a.booleanValue());
                Executor c8 = C1282q.this.f4713e.c();
                return d.this.f4739a.o(c8, new C0071a(c8));
            }
        }

        d(Task task) {
            this.f4739a = task;
        }

        @Override // q0.InterfaceC3825i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Boolean bool) {
            return C1282q.this.f4713e.h(new a(bool));
        }
    }

    /* renamed from: J0.q$e */
    /* loaded from: classes3.dex */
    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4746b;

        e(long j8, String str) {
            this.f4745a = j8;
            this.f4746b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!C1282q.this.I()) {
                C1282q.this.f4717i.g(this.f4745a, this.f4746b);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$f */
    /* loaded from: classes3.dex */
    public class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4748a;

        f(String str) {
            this.f4748a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C1282q.this.u(this.f4748a, Boolean.FALSE);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0.q$g */
    /* loaded from: classes3.dex */
    public class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4750a;

        g(long j8) {
            this.f4750a = j8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.f4750a);
            C1282q.this.f4719k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1282q(Context context, C1280o c1280o, D d8, C1289y c1289y, O0.g gVar, C1284t c1284t, C1267b c1267b, K0.l lVar, K0.e eVar, T t8, G0.a aVar, H0.a aVar2, C1279n c1279n) {
        this.f4709a = context;
        this.f4713e = c1280o;
        this.f4714f = d8;
        this.f4710b = c1289y;
        this.f4715g = gVar;
        this.f4711c = c1284t;
        this.f4716h = c1267b;
        this.f4712d = lVar;
        this.f4717i = eVar;
        this.f4718j = aVar;
        this.f4719k = aVar2;
        this.f4720l = c1279n;
        this.f4721m = t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet p8 = this.f4721m.p();
        if (!p8.isEmpty()) {
            return (String) p8.first();
        }
        return null;
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    static List C(G0.i iVar, String str, O0.g gVar, byte[] bArr) {
        File q8 = gVar.q(str, "user-data");
        File q9 = gVar.q(str, "keys");
        File q10 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1273h("logs_file", "logs", bArr));
        arrayList.add(new B("crash_meta_file", TtmlNode.TAG_METADATA, iVar.g()));
        arrayList.add(new B("session_meta_file", "session", iVar.f()));
        arrayList.add(new B("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, iVar.a()));
        arrayList.add(new B("device_meta_file", "device", iVar.c()));
        arrayList.add(new B("os_meta_file", "os", iVar.b()));
        arrayList.add(O(iVar));
        arrayList.add(new B("user_meta_file", "user", q8));
        arrayList.add(new B("keys_file", "keys", q9));
        arrayList.add(new B("rollouts_file", "rollouts", q10));
        return arrayList;
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            G0.h.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            G0.h.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j8) {
        return j8 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean J(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task L(long j8) {
        if (z()) {
            G0.h.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC3828l.e(null);
        }
        G0.h.f().b("Logging app exception event to Firebase Analytics");
        return AbstractC3828l.c(new ScheduledThreadPoolExecutor(1), new g(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task M() {
        ArrayList arrayList = new ArrayList();
        for (File file : K()) {
            try {
                arrayList.add(L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                G0.h.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC3828l.f(arrayList);
    }

    private static boolean N(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            G0.h.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            G0.h.f().g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    private static G O(G0.i iVar) {
        File e8 = iVar.e();
        if (e8 != null && e8.exists()) {
            return new B("minidump_file", "minidump", e8);
        }
        return new C1273h("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] Q(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private Task U() {
        if (this.f4710b.d()) {
            G0.h.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f4724p.e(Boolean.FALSE);
            return AbstractC3828l.e(Boolean.TRUE);
        }
        G0.h.f().b("Automatic data collection is disabled.");
        G0.h.f().i("Notifying that unsent reports are available.");
        this.f4724p.e(Boolean.TRUE);
        Task p8 = this.f4710b.j().p(new c());
        G0.h.f().b("Waiting for send/deleteUnsentReports to be called.");
        return a0.n(p8, this.f4725q.a());
    }

    private void V(String str) {
        List historicalProcessExitReasons;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f4709a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f4721m.u(str, historicalProcessExitReasons, new K0.e(this.f4715g, str), K0.l.h(str, this.f4715g, this.f4713e));
                return;
            } else {
                G0.h.f().i("No ApplicationExitInfo available. Session: " + str);
                return;
            }
        }
        G0.h.f().i("ANR feature enabled, but device is API " + i8);
    }

    private static G.a n(D d8, C1267b c1267b) {
        return G.a.b(d8.f(), c1267b.f4660f, c1267b.f4661g, d8.a().c(), EnumC1290z.b(c1267b.f4658d).c(), c1267b.f4662h);
    }

    private static G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(AbstractC1275j.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC1275j.b(context), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC1275j.w(), AbstractC1275j.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c p() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC1275j.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z8, Q0.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f4721m.p());
        if (arrayList.size() <= z8) {
            G0.h.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z8 ? 1 : 0);
        if (iVar.b().f9094b.f9102b) {
            V(str2);
        } else {
            G0.h.f().i("ANR feature disabled.");
        }
        if (this.f4718j.c(str2)) {
            x(str2);
        }
        if (z8 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f4720l.e(null);
            str = null;
        }
        this.f4721m.k(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long B8 = B();
        G0.h.f().b("Opening a new session with ID " + str);
        this.f4718j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1283s.i()), B8, L0.G.b(n(this.f4714f, this.f4716h), p(), o(this.f4709a)));
        if (bool.booleanValue() && str != null) {
            this.f4712d.k(str);
        }
        this.f4717i.e(str);
        this.f4720l.e(str);
        this.f4721m.q(str, B8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j8) {
        try {
            if (!this.f4715g.g(".ae" + j8).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e8) {
            G0.h.f().l("Could not create app exception marker file.", e8);
        }
    }

    private void x(String str) {
        G0.h.f().i("Finalizing native report for session " + str);
        G0.i a8 = this.f4718j.a(str);
        File e8 = a8.e();
        F.a d8 = a8.d();
        if (N(str, e8, d8)) {
            G0.h.f().k("No native core present");
            return;
        }
        long lastModified = e8.lastModified();
        K0.e eVar = new K0.e(this.f4715g, str);
        File k8 = this.f4715g.k(str);
        if (!k8.isDirectory()) {
            G0.h.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(lastModified);
        List C8 = C(a8, str, this.f4715g, eVar.b());
        H.b(k8, C8);
        G0.h.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f4721m.j(str, C8, d8);
        eVar.a();
    }

    private static boolean z() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() {
        InputStream D8 = D("META-INF/version-control-info.textproto");
        if (D8 == null) {
            return null;
        }
        G0.h.f().b("Read version control info");
        return Base64.encodeToString(Q(D8), 0);
    }

    void G(Q0.i iVar, Thread thread, Throwable th) {
        H(iVar, thread, th, false);
    }

    synchronized void H(Q0.i iVar, Thread thread, Throwable th, boolean z8) {
        G0.h.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        Task h8 = this.f4713e.h(new b(System.currentTimeMillis(), th, thread, iVar, z8));
        if (!z8) {
            try {
                try {
                    a0.f(h8);
                } catch (TimeoutException unused) {
                    G0.h.f().d("Cannot send reports. Timed out while fetching settings.");
                }
            } catch (Exception e8) {
                G0.h.f().e("Error handling uncaught exception", e8);
            }
        }
    }

    boolean I() {
        C1287w c1287w = this.f4722n;
        if (c1287w != null && c1287w.a()) {
            return true;
        }
        return false;
    }

    List K() {
        return this.f4715g.h(f4708t);
    }

    void P(String str) {
        this.f4713e.g(new f(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        try {
            String F8 = F();
            if (F8 != null) {
                S("com.crashlytics.version-control-info", F8);
                G0.h.f().g("Saved version control info");
            }
        } catch (IOException e8) {
            G0.h.f().l("Unable to save version control info", e8);
        }
    }

    void S(String str, String str2) {
        try {
            this.f4712d.j(str, str2);
        } catch (IllegalArgumentException e8) {
            Context context = this.f4709a;
            if (context != null && AbstractC1275j.u(context)) {
                throw e8;
            }
            G0.h.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task T(Task task) {
        if (!this.f4721m.n()) {
            G0.h.f().i("No crash reports are available to be sent.");
            this.f4724p.e(Boolean.FALSE);
            return AbstractC3828l.e(null);
        }
        G0.h.f().i("Crash reports are available to be sent.");
        return U().p(new d(task));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(long j8, String str) {
        this.f4713e.g(new e(j8, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        if (!this.f4711c.c()) {
            String A8 = A();
            if (A8 != null && this.f4718j.c(A8)) {
                return true;
            }
            return false;
        }
        G0.h.f().i("Found previous crash marker.");
        this.f4711c.d();
        return true;
    }

    void s(Q0.i iVar) {
        t(false, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Q0.i iVar) {
        this.f4723o = iVar;
        P(str);
        C1287w c1287w = new C1287w(new a(), iVar, uncaughtExceptionHandler, this.f4718j);
        this.f4722n = c1287w;
        Thread.setDefaultUncaughtExceptionHandler(c1287w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(Q0.i iVar) {
        this.f4713e.b();
        if (I()) {
            G0.h.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        G0.h.f().i("Finalizing previously open sessions.");
        try {
            t(true, iVar);
            G0.h.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e8) {
            G0.h.f().e("Unable to finalize previously open sessions.", e8);
            return false;
        }
    }
}
