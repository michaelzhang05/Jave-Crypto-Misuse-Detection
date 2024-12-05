package E4;

import F4.a1;
import F4.r;
import L4.h;
import L5.I;
import L5.t;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.documentfile.provider.DocumentFile;
import androidx.multidex.MultiDexApplication;
import androidx.work.PeriodicWorkRequest;
import g6.n;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;

/* loaded from: classes4.dex */
public abstract class j extends MultiDexApplication {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2274g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static int f2275h;

    /* renamed from: i, reason: collision with root package name */
    private static Activity f2276i;

    /* renamed from: j, reason: collision with root package name */
    public static Context f2277j;

    /* renamed from: k, reason: collision with root package name */
    private static int f2278k;

    /* renamed from: l, reason: collision with root package name */
    public static String f2279l;

    /* renamed from: m, reason: collision with root package name */
    private static ResultReceiver f2280m;

    /* renamed from: n, reason: collision with root package name */
    private static String f2281n;

    /* renamed from: o, reason: collision with root package name */
    private static K4.a f2282o;

    /* renamed from: p, reason: collision with root package name */
    private static Typeface f2283p;

    /* renamed from: q, reason: collision with root package name */
    private static Typeface f2284q;

    /* renamed from: r, reason: collision with root package name */
    private static L4.h f2285r;

    /* renamed from: s, reason: collision with root package name */
    private static L4.c f2286s;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f2287t;

    /* renamed from: u, reason: collision with root package name */
    private static String f2288u;

    /* renamed from: v, reason: collision with root package name */
    private static String f2289v;

    /* renamed from: w, reason: collision with root package name */
    private static String f2290w;

    /* renamed from: x, reason: collision with root package name */
    private static String f2291x;

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f2292a = new M4.a(null);

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f2293b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f2294c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f2295d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private L4.i f2296e = K();

    /* renamed from: f, reason: collision with root package name */
    private NsdManager.RegistrationListener f2297f = new c();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final void A(int i8) {
            j.f2275h = i8;
        }

        public final void B(L4.h hVar) {
            j.f2285r = hVar;
        }

        public final void C(String str) {
            AbstractC3159y.i(str, "<set-?>");
            j.f2279l = str;
        }

        public final void D(int i8) {
            j.f2278k = i8;
        }

        public final void E(L4.c cVar) {
            j.f2286s = cVar;
        }

        public final void F(boolean z8) {
            j.f2287t = z8;
        }

        public final void G(String str) {
            j.f2291x = str;
        }

        public final void H(String str) {
            j.f2290w = str;
        }

        public final void I(String str) {
            j.f2281n = str;
        }

        public final void J(ResultReceiver resultReceiver) {
            j.f2280m = resultReceiver;
        }

        public final Context a(Context context) {
            AbstractC3159y.i(context, "context");
            String e8 = new G4.a(context).e();
            if (e8 != null) {
                return N4.c.f7200a.a(context, new Locale(e8));
            }
            return context;
        }

        public final void b() {
            c(null);
        }

        public final void c(String str) {
            File[] listFiles = new N4.f().g(g()).listFiles();
            if (listFiles != null) {
                for (File child : listFiles) {
                    if (!n.s(child.getAbsolutePath(), str, true) && child.lastModified() < System.currentTimeMillis() - 3600000) {
                        N4.g gVar = new N4.g();
                        AbstractC3159y.h(child, "child");
                        gVar.a(child);
                    }
                }
            }
        }

        public final void d(Context context, EditText editText) {
            IBinder iBinder;
            AbstractC3159y.i(context, "<this>");
            Object systemService = context.getSystemService("input_method");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (editText != null) {
                iBinder = editText.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }

        public final void e() {
            j.f2282o = null;
        }

        public final Activity f() {
            return j.f2276i;
        }

        public final Context g() {
            Context context = j.f2277j;
            if (context != null) {
                return context;
            }
            AbstractC3159y.y("appContext");
            return null;
        }

        public final K4.a h() {
            if (j.f2282o == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            K4.a aVar = j.f2282o;
            AbstractC3159y.f(aVar);
            if (currentTimeMillis - aVar.d() > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                j.f2282o = null;
            }
            return j.f2282o;
        }

        public final String i() {
            return j.f2288u;
        }

        public final String j() {
            return j.f2289v;
        }

        public final int k() {
            return j.f2275h;
        }

        public final L4.h l() {
            return j.f2285r;
        }

        public final String m() {
            String str = j.f2279l;
            if (str != null) {
                return str;
            }
            AbstractC3159y.y("myNsdServiceName");
            return null;
        }

        public final int n() {
            return j.f2278k;
        }

        public final L4.c o() {
            return j.f2286s;
        }

        public final boolean p() {
            return j.f2287t;
        }

        public final String q() {
            return j.f2291x;
        }

        public final String r() {
            return j.f2290w;
        }

        public final ResultReceiver s() {
            return j.f2280m;
        }

        public final Typeface t() {
            return j.f2283p;
        }

        public final Typeface u() {
            return j.f2284q;
        }

        public final void v(String packageName, long j8, String name, long j9) {
            AbstractC3159y.i(packageName, "packageName");
            AbstractC3159y.i(name, "name");
            j.f2282o = new K4.a();
            K4.a aVar = j.f2282o;
            if (aVar != null) {
                aVar.f(packageName, j8, name, j9);
            }
        }

        public final void w(Activity activity) {
            j.f2276i = activity;
        }

        public final void x(Context context) {
            AbstractC3159y.i(context, "<set-?>");
            j.f2277j = context;
        }

        public final void y(String str) {
            j.f2288u = str;
        }

        public final void z(String str) {
            j.f2289v = str;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements NsdManager.RegistrationListener {
        c() {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.M("onRegistrationFailed");
            j.this.P();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f2274g;
            String serviceName = nsdServiceInfo.getServiceName();
            AbstractC3159y.h(serviceName, "nsdServiceInfo.serviceName");
            aVar.C(serviceName);
            j.this.f2295d.set(true);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.S();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f2300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f2301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f2302c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f2303a;

            a(P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f2303a == 0) {
                    t.b(obj);
                    a aVar = j.f2274g;
                    if (aVar.f() != null && (aVar.f() instanceof a1)) {
                        Activity f8 = aVar.f();
                        AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                        ((a1) f8).s1(true);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f2304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f2305b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f2306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(T t8, j jVar, P5.d dVar) {
                super(2, dVar);
                this.f2305b = t8;
                this.f2306c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f2305b, this.f2306c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f2304a == 0) {
                    t.b(obj);
                    Object obj2 = this.f2305b.f33761a;
                    if (obj2 != null) {
                        this.f2306c.R((File) obj2);
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DocumentFile documentFile, j jVar, P5.d dVar) {
            super(2, dVar);
            this.f2301b = documentFile;
            this.f2302c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f2301b, this.f2302c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InputStream inputStream;
            Object e8 = Q5.b.e();
            int i8 = this.f2300a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                J0 c8 = C2812b0.c();
                a aVar = new a(null);
                this.f2300a = 1;
                if (AbstractC2825i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            a aVar2 = j.f2274g;
            ContentResolver contentResolver = aVar2.g().getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(this.f2301b.getUri());
            } else {
                inputStream = null;
            }
            T t8 = new T();
            if (inputStream != null) {
                byte[] bArr = new byte[8192];
                Q q8 = new Q();
                File g8 = new N4.f().g(aVar2.g());
                if (this.f2301b.getName() != null) {
                    String name = this.f2301b.getName();
                    AbstractC3159y.f(name);
                    t8.f33761a = new File(g8, name);
                    FileOutputStream fileOutputStream = new FileOutputStream((File) t8.f33761a);
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        q8.f33759a = read;
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                }
                inputStream.close();
            }
            J0 c9 = C2812b0.c();
            b bVar = new b(t8, this.f2302c, null);
            this.f2300a = 2;
            if (AbstractC2825i.g(c9, bVar, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f2307a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f2309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DocumentFile documentFile, P5.d dVar) {
            super(2, dVar);
            this.f2309c = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f2309c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f2307a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                j jVar = j.this;
                DocumentFile documentFile = this.f2309c;
                this.f2307a = 1;
                if (jVar.N(documentFile, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Application.ActivityLifecycleCallbacks {
        f() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC3159y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f2274g;
                aVar.D(aVar.n() + 1);
                if (aVar.n() == 1) {
                    j.this.L(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f2274g;
                if (aVar.n() > 0) {
                    aVar.D(aVar.n() - 1);
                }
                if (aVar.n() == 0) {
                    j.this.O();
                    aVar.B(null);
                    aVar.E(null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            j.f2274g.w(null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC3159y.i(activity, "activity");
            j.f2274g.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC3159y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC3159y.i(activity, "activity");
        }
    }

    private final L4.i K() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(DocumentFile documentFile, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(documentFile, this, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void U() {
        AssetManager assetManager;
        try {
            assetManager = getAssets();
        } catch (Exception e8) {
            e8.printStackTrace();
            assetManager = null;
        }
        if (assetManager != null) {
            f2283p = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Medium.ttf");
            f2284q = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Regular.ttf");
        } else {
            Typeface typeface = Typeface.DEFAULT;
            f2283p = typeface;
            f2284q = typeface;
        }
    }

    private final void V() {
        registerActivityLifecycleCallbacks(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        NsdManager f8;
        try {
            L4.h hVar = f2285r;
            if (hVar != null && (f8 = hVar.f()) != null) {
                f8.unregisterService(this.f2297f);
            }
        } catch (Exception unused) {
        }
    }

    public void F(Uri uri, J4.f listener, r coreBaseActivity) {
        AbstractC3159y.i(uri, "uri");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(coreBaseActivity, "coreBaseActivity");
        listener.a();
    }

    public abstract void G(File file, J4.f fVar, r rVar);

    public final void H() {
        if (!this.f2295d.get() && this.f2293b.compareAndSet(true, false)) {
            L(f2274g.g());
        }
    }

    public final AtomicBoolean I() {
        return this.f2294c;
    }

    public final ResultReceiver J() {
        return this.f2292a;
    }

    public final void L(Context context) {
        AbstractC3159y.i(context, "context");
        String deviceId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        a aVar = f2274g;
        h.a aVar2 = L4.h.f6460h;
        AbstractC3159y.h(deviceId, "deviceId");
        aVar.C(aVar2.b(deviceId));
        if (f2285r == null) {
            f2285r = new L4.h(context, this.f2296e);
        }
        f2286s = new L4.c(this.f2296e, context);
    }

    public abstract void M(String str);

    public final void O() {
        W();
        L4.c cVar = f2286s;
        if (cVar != null) {
            cVar.r();
        }
        L4.h hVar = f2285r;
        if (hVar != null) {
            hVar.k();
        }
    }

    public final void P() {
        if (this.f2293b.compareAndSet(false, true)) {
            O();
        }
    }

    public final void Q(DocumentFile docfile) {
        AbstractC3159y.i(docfile, "docfile");
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new e(docfile, null), 3, null);
    }

    public final void R(File file) {
        AbstractC3159y.i(file, "file");
        K4.c cVar = new K4.c();
        cVar.a(file);
        L4.c cVar2 = f2286s;
        AbstractC3159y.f(cVar2);
        cVar2.q(cVar);
    }

    public final void S() {
        if (this.f2293b.get()) {
            this.f2295d.set(false);
        }
        if (!this.f2294c.get() && this.f2293b.compareAndSet(true, false)) {
            L(f2274g.g());
        }
    }

    public final void T(ResultReceiver resultReceiver) {
        AbstractC3159y.i(resultReceiver, "<set-?>");
        this.f2292a = resultReceiver;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        V();
        a aVar = f2274g;
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        aVar.x(aVar.a(applicationContext));
        U();
    }

    /* loaded from: classes4.dex */
    public static final class b implements L4.i {
        b() {
        }

        @Override // L4.i
        public void a() {
            L4.c o8 = j.f2274g.o();
            if (o8 != null) {
                o8.c();
            }
        }

        @Override // L4.i
        public void b() {
            j.this.M("onReadResponseFailed");
            j.this.P();
        }

        @Override // L4.i
        public void c() {
            j.this.M("onConnectionToServerFailed");
            j.this.P();
        }

        @Override // L4.i
        public void d(String remoteSocketAddress) {
            L4.c o8;
            L4.d i8;
            AbstractC3159y.i(remoteSocketAddress, "remoteSocketAddress");
            a aVar = j.f2274g;
            L4.c o9 = aVar.o();
            AbstractC3159y.f(o9);
            if (o9.k()) {
                if (aVar.f() != null && (aVar.f() instanceof a1)) {
                    Activity f8 = aVar.f();
                    AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    ((a1) f8).Z0();
                    return;
                }
                return;
            }
            if (aVar.l() != null && (o8 = aVar.o()) != null && (i8 = o8.i()) != null) {
                i8.l();
            }
        }

        @Override // L4.i
        public void e() {
            j.this.M("onDiscoveryServicesFailed");
        }

        @Override // L4.i
        public void f(int i8) {
            j.this.W();
            a aVar = j.f2274g;
            L4.h l8 = aVar.l();
            if (l8 != null) {
                l8.j(i8, j.this.f2297f);
            }
            L4.h l9 = aVar.l();
            if (l9 != null) {
                l9.d();
            }
        }

        @Override // L4.i
        public void g() {
            j.this.I().set(false);
            j.this.H();
        }

        @Override // L4.i
        public void i() {
            j.this.M("onRegistrationFailed");
            j.this.P();
        }

        @Override // L4.i
        public void j() {
            j.this.M("onReadResponseClosed");
            j.this.P();
        }

        @Override // L4.i
        public void k() {
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).V0();
            } else {
                aVar.F(true);
            }
            L4.c o8 = aVar.o();
            AbstractC3159y.f(o8);
            o8.i().l();
        }

        @Override // L4.i
        public void l(String msg) {
            AbstractC3159y.i(msg, "msg");
            j.this.M("onReceivingFileError: " + msg);
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).a1(msg);
            } else {
                aVar.G(msg);
            }
            j.this.P();
        }

        @Override // L4.i
        public void m(int i8) {
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).w1(i8);
            }
        }

        @Override // L4.i
        public void n(int i8) {
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).w1(i8);
            }
        }

        @Override // L4.i
        public void o(String msg) {
            AbstractC3159y.i(msg, "msg");
            j.this.M(msg);
            j.this.P();
        }

        @Override // L4.i
        public void q(String serviceName) {
            NsdServiceInfo nsdServiceInfo;
            AbstractC3159y.i(serviceName, "serviceName");
            a aVar = j.f2274g;
            L4.c o8 = aVar.o();
            AbstractC3159y.f(o8);
            if (!o8.k()) {
                L4.h l8 = aVar.l();
                AbstractC3159y.f(l8);
                Iterator it = l8.g().iterator();
                while (true) {
                    if (it.hasNext()) {
                        nsdServiceInfo = (NsdServiceInfo) it.next();
                        if (n.s(serviceName, nsdServiceInfo.getServiceName(), true)) {
                            break;
                        }
                    } else {
                        nsdServiceInfo = null;
                        break;
                    }
                }
                if (nsdServiceInfo != null) {
                    L4.h l9 = j.f2274g.l();
                    AbstractC3159y.f(l9);
                    l9.l(nsdServiceInfo);
                    return;
                }
                j.this.P();
                a aVar2 = j.f2274g;
                if (aVar2.f() != null && (aVar2.f() instanceof a1)) {
                    Activity f8 = aVar2.f();
                    AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    String string = aVar2.g().getString(h.f2210I, L4.h.f6460h.c(serviceName));
                    AbstractC3159y.h(string, "appContext.getString(\n  …                        )");
                    ((a1) f8).a1(string);
                }
            }
        }

        @Override // L4.i
        public void r(K4.c fti) {
            L4.c o8;
            L4.a h8;
            AbstractC3159y.i(fti, "fti");
            if (fti.d() != null && (o8 = j.f2274g.o()) != null && (h8 = o8.h()) != null) {
                File d8 = fti.d();
                AbstractC3159y.f(d8);
                h8.f(d8);
            }
        }

        @Override // L4.i
        public void s() {
            j.this.I().set(true);
        }

        @Override // L4.i
        public void t(File file) {
            AbstractC3159y.i(file, "file");
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).u1();
            }
        }

        @Override // L4.i
        public void u() {
            L4.c o8 = j.f2274g.o();
            AbstractC3159y.f(o8);
            o8.i().l();
        }

        @Override // L4.i
        public void v(K4.c fti) {
            AbstractC3159y.i(fti, "fti");
            L4.c o8 = j.f2274g.o();
            AbstractC3159y.f(o8);
            o8.i().m(fti);
        }

        @Override // L4.i
        public void w(String msg) {
            AbstractC3159y.i(msg, "msg");
            j.this.M("onSendFileFailed: " + msg);
            j.this.P();
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).f1(msg);
                return;
            }
            aVar.H(msg);
        }

        @Override // L4.i
        public void x(String filename, String result) {
            L4.a h8;
            AbstractC3159y.i(filename, "filename");
            AbstractC3159y.i(result, "result");
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).T0(filename, result);
            } else {
                aVar.y(filename);
                aVar.z(result);
            }
            L4.c o8 = aVar.o();
            if (o8 != null && (h8 = o8.h()) != null) {
                h8.e();
            }
        }

        @Override // L4.i
        public void y(K4.c fti) {
            AbstractC3159y.i(fti, "fti");
            a aVar = j.f2274g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).N0(fti);
            }
        }

        @Override // L4.i
        public void z(NsdServiceInfo nsdServiceInfo) {
            AbstractC3159y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f2274g;
            L4.c o8 = aVar.o();
            if (o8 != null) {
                o8.p();
            }
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3159y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).d1(nsdServiceInfo);
            }
        }

        @Override // L4.i
        public void h() {
        }

        @Override // L4.i
        public void p() {
        }
    }
}
