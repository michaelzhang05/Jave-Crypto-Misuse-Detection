package H0;

import H0.C1185t;
import J0.B;
import J0.D;
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
import r0.C3679j;
import r0.InterfaceC3678i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: H0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1180n {

    /* renamed from: s, reason: collision with root package name */
    static final FilenameFilter f3326s = new FilenameFilter() { // from class: H0.m
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean K8;
            K8 = C1180n.K(file, str);
            return K8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f3327a;

    /* renamed from: b, reason: collision with root package name */
    private final C1187v f3328b;

    /* renamed from: c, reason: collision with root package name */
    private final C1183q f3329c;

    /* renamed from: d, reason: collision with root package name */
    private final I0.h f3330d;

    /* renamed from: e, reason: collision with root package name */
    private final C1178l f3331e;

    /* renamed from: f, reason: collision with root package name */
    private final z f3332f;

    /* renamed from: g, reason: collision with root package name */
    private final M0.f f3333g;

    /* renamed from: h, reason: collision with root package name */
    private final C1168b f3334h;

    /* renamed from: i, reason: collision with root package name */
    private final I0.c f3335i;

    /* renamed from: j, reason: collision with root package name */
    private final E0.a f3336j;

    /* renamed from: k, reason: collision with root package name */
    private final F0.a f3337k;

    /* renamed from: l, reason: collision with root package name */
    private final O f3338l;

    /* renamed from: m, reason: collision with root package name */
    private C1185t f3339m;

    /* renamed from: n, reason: collision with root package name */
    private O0.i f3340n = null;

    /* renamed from: o, reason: collision with root package name */
    final C3679j f3341o = new C3679j();

    /* renamed from: p, reason: collision with root package name */
    final C3679j f3342p = new C3679j();

    /* renamed from: q, reason: collision with root package name */
    final C3679j f3343q = new C3679j();

    /* renamed from: r, reason: collision with root package name */
    final AtomicBoolean f3344r = new AtomicBoolean(false);

    /* renamed from: H0.n$a */
    /* loaded from: classes3.dex */
    class a implements C1185t.a {
        a() {
        }

        @Override // H0.C1185t.a
        public void a(O0.i iVar, Thread thread, Throwable th) {
            C1180n.this.H(iVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.n$b */
    /* loaded from: classes3.dex */
    public class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3346a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f3347b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f3348c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O0.i f3349d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f3350e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H0.n$b$a */
        /* loaded from: classes3.dex */
        public class a implements InterfaceC3678i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Executor f3352a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3353b;

            a(Executor executor, String str) {
                this.f3352a = executor;
                this.f3353b = str;
            }

            @Override // r0.InterfaceC3678i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(O0.d dVar) {
                String str = null;
                if (dVar != null) {
                    Task N8 = C1180n.this.N();
                    O o8 = C1180n.this.f3338l;
                    Executor executor = this.f3352a;
                    if (b.this.f3350e) {
                        str = this.f3353b;
                    }
                    return r0.l.g(N8, o8.w(executor, str));
                }
                E0.f.f().k("Received null app settings, cannot send reports at crash time.");
                return r0.l.e(null);
            }
        }

        b(long j8, Throwable th, Thread thread, O0.i iVar, boolean z8) {
            this.f3346a = j8;
            this.f3347b = th;
            this.f3348c = thread;
            this.f3349d = iVar;
            this.f3350e = z8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long F8 = C1180n.F(this.f3346a);
            String B8 = C1180n.this.B();
            if (B8 == null) {
                E0.f.f().d("Tried to write a fatal exception while no session was open.");
                return r0.l.e(null);
            }
            C1180n.this.f3329c.a();
            C1180n.this.f3338l.s(this.f3347b, this.f3348c, B8, F8);
            C1180n.this.w(this.f3346a);
            C1180n.this.t(this.f3349d);
            C1180n.this.v(new C1175i(C1180n.this.f3332f).toString());
            if (!C1180n.this.f3328b.d()) {
                return r0.l.e(null);
            }
            Executor c8 = C1180n.this.f3331e.c();
            return this.f3349d.a().o(c8, new a(c8, B8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.n$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC3678i {
        c() {
        }

        @Override // r0.InterfaceC3678i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r12) {
            return r0.l.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.n$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC3678i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f3356a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H0.n$d$a */
        /* loaded from: classes3.dex */
        public class a implements Callable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Boolean f3358a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: H0.n$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0052a implements InterfaceC3678i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Executor f3360a;

                C0052a(Executor executor) {
                    this.f3360a = executor;
                }

                @Override // r0.InterfaceC3678i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Task a(O0.d dVar) {
                    if (dVar != null) {
                        C1180n.this.N();
                        C1180n.this.f3338l.v(this.f3360a);
                        C1180n.this.f3343q.e(null);
                        return r0.l.e(null);
                    }
                    E0.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return r0.l.e(null);
                }
            }

            a(Boolean bool) {
                this.f3358a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task call() {
                if (!this.f3358a.booleanValue()) {
                    E0.f.f().i("Deleting cached crash reports...");
                    C1180n.r(C1180n.this.L());
                    C1180n.this.f3338l.u();
                    C1180n.this.f3343q.e(null);
                    return r0.l.e(null);
                }
                E0.f.f().b("Sending cached crash reports...");
                C1180n.this.f3328b.c(this.f3358a.booleanValue());
                Executor c8 = C1180n.this.f3331e.c();
                return d.this.f3356a.o(c8, new C0052a(c8));
            }
        }

        d(Task task) {
            this.f3356a = task;
        }

        @Override // r0.InterfaceC3678i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Boolean bool) {
            return C1180n.this.f3331e.h(new a(bool));
        }
    }

    /* renamed from: H0.n$e */
    /* loaded from: classes3.dex */
    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3363b;

        e(long j8, String str) {
            this.f3362a = j8;
            this.f3363b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!C1180n.this.J()) {
                C1180n.this.f3335i.g(this.f3362a, this.f3363b);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.n$f */
    /* loaded from: classes3.dex */
    public class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3365a;

        f(String str) {
            this.f3365a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C1180n.this.v(this.f3365a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0.n$g */
    /* loaded from: classes3.dex */
    public class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3367a;

        g(long j8) {
            this.f3367a = j8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(CampaignEx.JSON_KEY_TIMESTAMP, this.f3367a);
            C1180n.this.f3337k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1180n(Context context, C1178l c1178l, z zVar, C1187v c1187v, M0.f fVar, C1183q c1183q, C1168b c1168b, I0.h hVar, I0.c cVar, O o8, E0.a aVar, F0.a aVar2) {
        this.f3327a = context;
        this.f3331e = c1178l;
        this.f3332f = zVar;
        this.f3328b = c1187v;
        this.f3333g = fVar;
        this.f3329c = c1183q;
        this.f3334h = c1168b;
        this.f3330d = hVar;
        this.f3335i = cVar;
        this.f3336j = aVar;
        this.f3337k = aVar2;
        this.f3338l = o8;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B() {
        SortedSet o8 = this.f3338l.o();
        if (!o8.isEmpty()) {
            return (String) o8.first();
        }
        return null;
    }

    private static long C() {
        return F(System.currentTimeMillis());
    }

    static List D(E0.g gVar, String str, M0.f fVar, byte[] bArr) {
        File o8 = fVar.o(str, "user-data");
        File o9 = fVar.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1174h("logs_file", "logs", bArr));
        arrayList.add(new y("crash_meta_file", TtmlNode.TAG_METADATA, gVar.g()));
        arrayList.add(new y("session_meta_file", "session", gVar.f()));
        arrayList.add(new y("app_meta_file", MBridgeConstans.DYNAMIC_VIEW_WX_APP, gVar.a()));
        arrayList.add(new y("device_meta_file", "device", gVar.c()));
        arrayList.add(new y("os_meta_file", "os", gVar.b()));
        arrayList.add(P(gVar));
        arrayList.add(new y("user_meta_file", "user", o8));
        arrayList.add(new y("keys_file", "keys", o9));
        return arrayList;
    }

    private InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            E0.f.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream == null) {
            E0.f.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long F(long j8) {
        return j8 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task M(long j8) {
        if (A()) {
            E0.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return r0.l.e(null);
        }
        E0.f.f().b("Logging app exception event to Firebase Analytics");
        return r0.l.c(new ScheduledThreadPoolExecutor(1), new g(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                E0.f.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return r0.l.f(arrayList);
    }

    private static boolean O(String str, File file, B.a aVar) {
        if (file == null || !file.exists()) {
            E0.f.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            E0.f.f().g("No Tombstones data found for session " + str);
        }
        if ((file == null || !file.exists()) && aVar == null) {
            return true;
        }
        return false;
    }

    private static C P(E0.g gVar) {
        File e8 = gVar.e();
        if (e8 != null && e8.exists()) {
            return new y("minidump_file", "minidump", e8);
        }
        return new C1174h("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] R(InputStream inputStream) {
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

    private Task V() {
        if (this.f3328b.d()) {
            E0.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f3341o.e(Boolean.FALSE);
            return r0.l.e(Boolean.TRUE);
        }
        E0.f.f().b("Automatic data collection is disabled.");
        E0.f.f().i("Notifying that unsent reports are available.");
        this.f3341o.e(Boolean.TRUE);
        Task p8 = this.f3328b.j().p(new c());
        E0.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return W.n(p8, this.f3342p.a());
    }

    private void W(String str) {
        List historicalProcessExitReasons;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            historicalProcessExitReasons = ((ActivityManager) this.f3327a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f3338l.t(str, historicalProcessExitReasons, new I0.c(this.f3333g, str), I0.h.f(str, this.f3333g, this.f3331e));
                return;
            } else {
                E0.f.f().i("No ApplicationExitInfo available. Session: " + str);
                return;
            }
        }
        E0.f.f().i("ANR feature enabled, but device is API " + i8);
    }

    private static D.a o(z zVar, C1168b c1168b) {
        return D.a.b(zVar.f(), c1168b.f3284f, c1168b.f3285g, zVar.a().c(), EnumC1188w.a(c1168b.f3282d).b(), c1168b.f3286h);
    }

    private static D.b p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return D.b.c(AbstractC1176j.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC1176j.t(), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC1176j.z(), AbstractC1176j.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static D.c q() {
        return D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC1176j.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z8, O0.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f3338l.o());
        if (arrayList.size() <= z8) {
            E0.f.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z8 ? 1 : 0);
        if (iVar.b().f7695b.f7703b) {
            W(str2);
        } else {
            E0.f.f().i("ANR feature disabled.");
        }
        if (this.f3336j.d(str2)) {
            y(str2);
        }
        if (z8 != 0) {
            str = (String) arrayList.get(0);
        } else {
            str = null;
        }
        this.f3338l.j(C(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        long C8 = C();
        E0.f.f().b("Opening a new session with ID " + str);
        this.f3336j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1182p.i()), C8, J0.D.b(o(this.f3332f, this.f3334h), q(), p()));
        this.f3335i.e(str);
        this.f3338l.p(str, C8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j8) {
        try {
            if (!this.f3333g.e(".ae" + j8).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e8) {
            E0.f.f().l("Could not create app exception marker file.", e8);
        }
    }

    private void y(String str) {
        E0.f.f().i("Finalizing native report for session " + str);
        E0.g a8 = this.f3336j.a(str);
        File e8 = a8.e();
        B.a d8 = a8.d();
        if (O(str, e8, d8)) {
            E0.f.f().k("No native core present");
            return;
        }
        long lastModified = e8.lastModified();
        I0.c cVar = new I0.c(this.f3333g, str);
        File i8 = this.f3333g.i(str);
        if (!i8.isDirectory()) {
            E0.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List D8 = D(a8, str, this.f3333g, cVar.b());
        D.b(i8, D8);
        E0.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f3338l.i(str, D8, d8);
        cVar.a();
    }

    String G() {
        InputStream E8 = E("META-INF/version-control-info.textproto");
        if (E8 == null) {
            return null;
        }
        E0.f.f().b("Read version control info");
        return Base64.encodeToString(R(E8), 0);
    }

    void H(O0.i iVar, Thread thread, Throwable th) {
        I(iVar, thread, th, false);
    }

    synchronized void I(O0.i iVar, Thread thread, Throwable th, boolean z8) {
        E0.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            W.f(this.f3331e.h(new b(System.currentTimeMillis(), th, thread, iVar, z8)));
        } catch (TimeoutException unused) {
            E0.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e8) {
            E0.f.f().e("Error handling uncaught exception", e8);
        }
    }

    boolean J() {
        C1185t c1185t = this.f3339m;
        if (c1185t != null && c1185t.a()) {
            return true;
        }
        return false;
    }

    List L() {
        return this.f3333g.f(f3326s);
    }

    void Q(String str) {
        this.f3331e.g(new f(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        try {
            String G8 = G();
            if (G8 != null) {
                T("com.crashlytics.version-control-info", G8);
                E0.f.f().g("Saved version control info");
            }
        } catch (IOException e8) {
            E0.f.f().l("Unable to save version control info", e8);
        }
    }

    void T(String str, String str2) {
        try {
            this.f3330d.h(str, str2);
        } catch (IllegalArgumentException e8) {
            Context context = this.f3327a;
            if (context != null && AbstractC1176j.x(context)) {
                throw e8;
            }
            E0.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task U(Task task) {
        if (!this.f3338l.m()) {
            E0.f.f().i("No crash reports are available to be sent.");
            this.f3341o.e(Boolean.FALSE);
            return r0.l.e(null);
        }
        E0.f.f().i("Crash reports are available to be sent.");
        return V().p(new d(task));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(long j8, String str) {
        this.f3331e.g(new e(j8, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        if (!this.f3329c.c()) {
            String B8 = B();
            if (B8 != null && this.f3336j.d(B8)) {
                return true;
            }
            return false;
        }
        E0.f.f().i("Found previous crash marker.");
        this.f3329c.d();
        return true;
    }

    void t(O0.i iVar) {
        u(false, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, O0.i iVar) {
        this.f3340n = iVar;
        Q(str);
        C1185t c1185t = new C1185t(new a(), iVar, uncaughtExceptionHandler, this.f3336j);
        this.f3339m = c1185t;
        Thread.setDefaultUncaughtExceptionHandler(c1185t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z(O0.i iVar) {
        this.f3331e.b();
        if (J()) {
            E0.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        E0.f.f().i("Finalizing previously open sessions.");
        try {
            u(true, iVar);
            E0.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e8) {
            E0.f.f().e("Unable to finalize previously open sessions.", e8);
            return false;
        }
    }
}
