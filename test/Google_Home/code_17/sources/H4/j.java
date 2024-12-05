package H4;

import I4.a1;
import I4.r;
import O4.h;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
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
import j6.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public abstract class j extends MultiDexApplication {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3824g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static int f3825h;

    /* renamed from: i, reason: collision with root package name */
    private static Activity f3826i;

    /* renamed from: j, reason: collision with root package name */
    public static Context f3827j;

    /* renamed from: k, reason: collision with root package name */
    private static int f3828k;

    /* renamed from: l, reason: collision with root package name */
    public static String f3829l;

    /* renamed from: m, reason: collision with root package name */
    private static ResultReceiver f3830m;

    /* renamed from: n, reason: collision with root package name */
    private static String f3831n;

    /* renamed from: o, reason: collision with root package name */
    private static N4.a f3832o;

    /* renamed from: p, reason: collision with root package name */
    private static Typeface f3833p;

    /* renamed from: q, reason: collision with root package name */
    private static Typeface f3834q;

    /* renamed from: r, reason: collision with root package name */
    private static O4.h f3835r;

    /* renamed from: s, reason: collision with root package name */
    private static O4.c f3836s;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f3837t;

    /* renamed from: u, reason: collision with root package name */
    private static String f3838u;

    /* renamed from: v, reason: collision with root package name */
    private static String f3839v;

    /* renamed from: w, reason: collision with root package name */
    private static String f3840w;

    /* renamed from: x, reason: collision with root package name */
    private static String f3841x;

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f3842a = new P4.a(null);

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f3843b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f3844c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f3845d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private O4.i f3846e = K();

    /* renamed from: f, reason: collision with root package name */
    private NsdManager.RegistrationListener f3847f = new c();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void A(int i8) {
            j.f3825h = i8;
        }

        public final void B(O4.h hVar) {
            j.f3835r = hVar;
        }

        public final void C(String str) {
            AbstractC3255y.i(str, "<set-?>");
            j.f3829l = str;
        }

        public final void D(int i8) {
            j.f3828k = i8;
        }

        public final void E(O4.c cVar) {
            j.f3836s = cVar;
        }

        public final void F(boolean z8) {
            j.f3837t = z8;
        }

        public final void G(String str) {
            j.f3841x = str;
        }

        public final void H(String str) {
            j.f3840w = str;
        }

        public final void I(String str) {
            j.f3831n = str;
        }

        public final void J(ResultReceiver resultReceiver) {
            j.f3830m = resultReceiver;
        }

        public final Context a(Context context) {
            AbstractC3255y.i(context, "context");
            String e8 = new J4.a(context).e();
            if (e8 != null) {
                return Q4.c.f9160a.a(context, new Locale(e8));
            }
            return context;
        }

        public final void b() {
            c(null);
        }

        public final void c(String str) {
            File[] listFiles = new Q4.f().g(g()).listFiles();
            if (listFiles != null) {
                for (File child : listFiles) {
                    if (!n.s(child.getAbsolutePath(), str, true) && child.lastModified() < System.currentTimeMillis() - 3600000) {
                        Q4.g gVar = new Q4.g();
                        AbstractC3255y.h(child, "child");
                        gVar.a(child);
                    }
                }
            }
        }

        public final void d(Context context, EditText editText) {
            IBinder iBinder;
            AbstractC3255y.i(context, "<this>");
            Object systemService = context.getSystemService("input_method");
            AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (editText != null) {
                iBinder = editText.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }

        public final void e() {
            j.f3832o = null;
        }

        public final Activity f() {
            return j.f3826i;
        }

        public final Context g() {
            Context context = j.f3827j;
            if (context != null) {
                return context;
            }
            AbstractC3255y.y("appContext");
            return null;
        }

        public final N4.a h() {
            if (j.f3832o == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            N4.a aVar = j.f3832o;
            AbstractC3255y.f(aVar);
            if (currentTimeMillis - aVar.d() > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                j.f3832o = null;
            }
            return j.f3832o;
        }

        public final String i() {
            return j.f3838u;
        }

        public final String j() {
            return j.f3839v;
        }

        public final int k() {
            return j.f3825h;
        }

        public final O4.h l() {
            return j.f3835r;
        }

        public final String m() {
            String str = j.f3829l;
            if (str != null) {
                return str;
            }
            AbstractC3255y.y("myNsdServiceName");
            return null;
        }

        public final int n() {
            return j.f3828k;
        }

        public final O4.c o() {
            return j.f3836s;
        }

        public final boolean p() {
            return j.f3837t;
        }

        public final String q() {
            return j.f3841x;
        }

        public final String r() {
            return j.f3840w;
        }

        public final ResultReceiver s() {
            return j.f3830m;
        }

        public final Typeface t() {
            return j.f3833p;
        }

        public final Typeface u() {
            return j.f3834q;
        }

        public final void v(String packageName, long j8, String name, long j9) {
            AbstractC3255y.i(packageName, "packageName");
            AbstractC3255y.i(name, "name");
            j.f3832o = new N4.a();
            N4.a aVar = j.f3832o;
            if (aVar != null) {
                aVar.f(packageName, j8, name, j9);
            }
        }

        public final void w(Activity activity) {
            j.f3826i = activity;
        }

        public final void x(Context context) {
            AbstractC3255y.i(context, "<set-?>");
            j.f3827j = context;
        }

        public final void y(String str) {
            j.f3838u = str;
        }

        public final void z(String str) {
            j.f3839v = str;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements NsdManager.RegistrationListener {
        c() {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.M("onRegistrationFailed");
            j.this.P();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f3824g;
            String serviceName = nsdServiceInfo.getServiceName();
            AbstractC3255y.h(serviceName, "nsdServiceInfo.serviceName");
            aVar.C(serviceName);
            j.this.f3845d.set(true);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.S();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f3850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f3851b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f3852c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f3853a;

            a(S5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f3853a == 0) {
                    t.b(obj);
                    a aVar = j.f3824g;
                    if (aVar.f() != null && (aVar.f() instanceof a1)) {
                        Activity f8 = aVar.f();
                        AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                        ((a1) f8).s1(true);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f3854a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f3855b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f3856c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(T t8, j jVar, S5.d dVar) {
                super(2, dVar);
                this.f3855b = t8;
                this.f3856c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f3855b, this.f3856c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f3854a == 0) {
                    t.b(obj);
                    Object obj2 = this.f3855b.f34162a;
                    if (obj2 != null) {
                        this.f3856c.R((File) obj2);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DocumentFile documentFile, j jVar, S5.d dVar) {
            super(2, dVar);
            this.f3851b = documentFile;
            this.f3852c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f3851b, this.f3852c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InputStream inputStream;
            Object e8 = T5.b.e();
            int i8 = this.f3850a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                J0 c8 = C3347b0.c();
                a aVar = new a(null);
                this.f3850a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            a aVar2 = j.f3824g;
            ContentResolver contentResolver = aVar2.g().getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(this.f3851b.getUri());
            } else {
                inputStream = null;
            }
            T t8 = new T();
            if (inputStream != null) {
                byte[] bArr = new byte[8192];
                Q q8 = new Q();
                File g8 = new Q4.f().g(aVar2.g());
                if (this.f3851b.getName() != null) {
                    String name = this.f3851b.getName();
                    AbstractC3255y.f(name);
                    t8.f34162a = new File(g8, name);
                    FileOutputStream fileOutputStream = new FileOutputStream((File) t8.f34162a);
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        q8.f34160a = read;
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                }
                inputStream.close();
            }
            J0 c9 = C3347b0.c();
            b bVar = new b(t8, this.f3852c, null);
            this.f3850a = 2;
            if (AbstractC3360i.g(c9, bVar, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f3857a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f3859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DocumentFile documentFile, S5.d dVar) {
            super(2, dVar);
            this.f3859c = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f3859c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f3857a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                j jVar = j.this;
                DocumentFile documentFile = this.f3859c;
                this.f3857a = 1;
                if (jVar.N(documentFile, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements Application.ActivityLifecycleCallbacks {
        f() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC3255y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f3824g;
                aVar.D(aVar.n() + 1);
                if (aVar.n() == 1) {
                    j.this.L(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC3255y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f3824g;
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
            AbstractC3255y.i(activity, "activity");
            j.f3824g.w(null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC3255y.i(activity, "activity");
            j.f3824g.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC3255y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC3255y.i(activity, "activity");
        }
    }

    private final O4.i K() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(DocumentFile documentFile, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(documentFile, this, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
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
            f3833p = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Medium.ttf");
            f3834q = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Regular.ttf");
        } else {
            Typeface typeface = Typeface.DEFAULT;
            f3833p = typeface;
            f3834q = typeface;
        }
    }

    private final void V() {
        registerActivityLifecycleCallbacks(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        NsdManager f8;
        try {
            O4.h hVar = f3835r;
            if (hVar != null && (f8 = hVar.f()) != null) {
                f8.unregisterService(this.f3847f);
            }
        } catch (Exception unused) {
        }
    }

    public void F(Uri uri, M4.f listener, r coreBaseActivity) {
        AbstractC3255y.i(uri, "uri");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(coreBaseActivity, "coreBaseActivity");
        listener.a();
    }

    public abstract void G(File file, M4.f fVar, r rVar);

    public final void H() {
        if (!this.f3845d.get() && this.f3843b.compareAndSet(true, false)) {
            L(f3824g.g());
        }
    }

    public final AtomicBoolean I() {
        return this.f3844c;
    }

    public final ResultReceiver J() {
        return this.f3842a;
    }

    public final void L(Context context) {
        AbstractC3255y.i(context, "context");
        String deviceId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        a aVar = f3824g;
        h.a aVar2 = O4.h.f8251h;
        AbstractC3255y.h(deviceId, "deviceId");
        aVar.C(aVar2.b(deviceId));
        if (f3835r == null) {
            f3835r = new O4.h(context, this.f3846e);
        }
        f3836s = new O4.c(this.f3846e, context);
    }

    public abstract void M(String str);

    public final void O() {
        W();
        O4.c cVar = f3836s;
        if (cVar != null) {
            cVar.r();
        }
        O4.h hVar = f3835r;
        if (hVar != null) {
            hVar.k();
        }
    }

    public final void P() {
        if (this.f3843b.compareAndSet(false, true)) {
            O();
        }
    }

    public final void Q(DocumentFile docfile) {
        AbstractC3255y.i(docfile, "docfile");
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new e(docfile, null), 3, null);
    }

    public final void R(File file) {
        AbstractC3255y.i(file, "file");
        N4.c cVar = new N4.c();
        cVar.a(file);
        O4.c cVar2 = f3836s;
        AbstractC3255y.f(cVar2);
        cVar2.q(cVar);
    }

    public final void S() {
        if (this.f3843b.get()) {
            this.f3845d.set(false);
        }
        if (!this.f3844c.get() && this.f3843b.compareAndSet(true, false)) {
            L(f3824g.g());
        }
    }

    public final void T(ResultReceiver resultReceiver) {
        AbstractC3255y.i(resultReceiver, "<set-?>");
        this.f3842a = resultReceiver;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        V();
        a aVar = f3824g;
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        aVar.x(aVar.a(applicationContext));
        U();
    }

    /* loaded from: classes5.dex */
    public static final class b implements O4.i {
        b() {
        }

        @Override // O4.i
        public void a() {
            O4.c o8 = j.f3824g.o();
            if (o8 != null) {
                o8.c();
            }
        }

        @Override // O4.i
        public void b() {
            j.this.M("onReadResponseFailed");
            j.this.P();
        }

        @Override // O4.i
        public void c() {
            j.this.M("onConnectionToServerFailed");
            j.this.P();
        }

        @Override // O4.i
        public void d(String remoteSocketAddress) {
            O4.c o8;
            O4.d i8;
            AbstractC3255y.i(remoteSocketAddress, "remoteSocketAddress");
            a aVar = j.f3824g;
            O4.c o9 = aVar.o();
            AbstractC3255y.f(o9);
            if (o9.k()) {
                if (aVar.f() != null && (aVar.f() instanceof a1)) {
                    Activity f8 = aVar.f();
                    AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    ((a1) f8).Z0();
                    return;
                }
                return;
            }
            if (aVar.l() != null && (o8 = aVar.o()) != null && (i8 = o8.i()) != null) {
                i8.l();
            }
        }

        @Override // O4.i
        public void e() {
            j.this.M("onDiscoveryServicesFailed");
        }

        @Override // O4.i
        public void f(int i8) {
            j.this.W();
            a aVar = j.f3824g;
            O4.h l8 = aVar.l();
            if (l8 != null) {
                l8.j(i8, j.this.f3847f);
            }
            O4.h l9 = aVar.l();
            if (l9 != null) {
                l9.d();
            }
        }

        @Override // O4.i
        public void g() {
            j.this.I().set(false);
            j.this.H();
        }

        @Override // O4.i
        public void i() {
            j.this.M("onRegistrationFailed");
            j.this.P();
        }

        @Override // O4.i
        public void j() {
            j.this.M("onReadResponseClosed");
            j.this.P();
        }

        @Override // O4.i
        public void k() {
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).V0();
            } else {
                aVar.F(true);
            }
            O4.c o8 = aVar.o();
            AbstractC3255y.f(o8);
            o8.i().l();
        }

        @Override // O4.i
        public void l(String msg) {
            AbstractC3255y.i(msg, "msg");
            j.this.M("onReceivingFileError: " + msg);
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).a1(msg);
            } else {
                aVar.G(msg);
            }
            j.this.P();
        }

        @Override // O4.i
        public void m(int i8) {
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).w1(i8);
            }
        }

        @Override // O4.i
        public void n(N4.c fti) {
            AbstractC3255y.i(fti, "fti");
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).N0(fti);
            }
        }

        @Override // O4.i
        public void o(N4.c fti) {
            AbstractC3255y.i(fti, "fti");
            O4.c o8 = j.f3824g.o();
            AbstractC3255y.f(o8);
            o8.i().m(fti);
        }

        @Override // O4.i
        public void p(int i8) {
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).w1(i8);
            }
        }

        @Override // O4.i
        public void q(String msg) {
            AbstractC3255y.i(msg, "msg");
            j.this.M(msg);
            j.this.P();
        }

        @Override // O4.i
        public void r(N4.c fti) {
            O4.c o8;
            O4.a h8;
            AbstractC3255y.i(fti, "fti");
            if (fti.d() != null && (o8 = j.f3824g.o()) != null && (h8 = o8.h()) != null) {
                File d8 = fti.d();
                AbstractC3255y.f(d8);
                h8.f(d8);
            }
        }

        @Override // O4.i
        public void t(String serviceName) {
            NsdServiceInfo nsdServiceInfo;
            AbstractC3255y.i(serviceName, "serviceName");
            a aVar = j.f3824g;
            O4.c o8 = aVar.o();
            AbstractC3255y.f(o8);
            if (!o8.k()) {
                O4.h l8 = aVar.l();
                AbstractC3255y.f(l8);
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
                    O4.h l9 = j.f3824g.l();
                    AbstractC3255y.f(l9);
                    l9.l(nsdServiceInfo);
                    return;
                }
                j.this.P();
                a aVar2 = j.f3824g;
                if (aVar2.f() != null && (aVar2.f() instanceof a1)) {
                    Activity f8 = aVar2.f();
                    AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    String string = aVar2.g().getString(h.f3760I, O4.h.f8251h.c(serviceName));
                    AbstractC3255y.h(string, "appContext.getString(\n  …                        )");
                    ((a1) f8).a1(string);
                }
            }
        }

        @Override // O4.i
        public void u() {
            j.this.I().set(true);
        }

        @Override // O4.i
        public void v(File file) {
            AbstractC3255y.i(file, "file");
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).u1();
            }
        }

        @Override // O4.i
        public void w() {
            O4.c o8 = j.f3824g.o();
            AbstractC3255y.f(o8);
            o8.i().l();
        }

        @Override // O4.i
        public void x(String msg) {
            AbstractC3255y.i(msg, "msg");
            j.this.M("onSendFileFailed: " + msg);
            j.this.P();
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).f1(msg);
                return;
            }
            aVar.H(msg);
        }

        @Override // O4.i
        public void y(String filename, String result) {
            O4.a h8;
            AbstractC3255y.i(filename, "filename");
            AbstractC3255y.i(result, "result");
            a aVar = j.f3824g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).T0(filename, result);
            } else {
                aVar.y(filename);
                aVar.z(result);
            }
            O4.c o8 = aVar.o();
            if (o8 != null && (h8 = o8.h()) != null) {
                h8.e();
            }
        }

        @Override // O4.i
        public void z(NsdServiceInfo nsdServiceInfo) {
            AbstractC3255y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f3824g;
            O4.c o8 = aVar.o();
            if (o8 != null) {
                o8.p();
            }
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3255y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).d1(nsdServiceInfo);
            }
        }

        @Override // O4.i
        public void h() {
        }

        @Override // O4.i
        public void s() {
        }
    }
}
