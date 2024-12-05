package x2;

import L5.s;
import M5.Q;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.y;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3875e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f39150g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static volatile UUID f39151h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f39152i;

    /* renamed from: j, reason: collision with root package name */
    private static final I5.a f39153j;

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f39154a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f39155b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39156c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f39157d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f39158e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f39159f;

    /* renamed from: x2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final UUID a() {
            return C3875e.f39151h;
        }

        public final void b(UUID id) {
            AbstractC3159y.i(id, "id");
            C3875e.f39151h = id;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        AbstractC3159y.h(randomUUID, "randomUUID(...)");
        f39151h = randomUUID;
        f39152i = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        f39153j = new I5.a() { // from class: x2.d
            @Override // I5.a
            public final Object get() {
                String b8;
                b8 = C3875e.b();
                return b8;
            }
        };
    }

    public C3875e(PackageManager packageManager, PackageInfo packageInfo, String packageName, I5.a publishableKeyProvider, I5.a networkTypeProvider, I5.a pluginTypeProvider) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(networkTypeProvider, "networkTypeProvider");
        AbstractC3159y.i(pluginTypeProvider, "pluginTypeProvider");
        this.f39154a = packageManager;
        this.f39155b = packageInfo;
        this.f39156c = packageName;
        this.f39157d = publishableKeyProvider;
        this.f39158e = networkTypeProvider;
        this.f39159f = pluginTypeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b() {
        return A2.e.f84a.a();
    }

    private final Map f(InterfaceC3871a interfaceC3871a) {
        return Q.q(Q.q(l(), e()), j(interfaceC3871a));
    }

    private final CharSequence h(PackageInfo packageInfo, PackageManager packageManager) {
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        CharSequence charSequence2 = null;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(packageManager);
        } else {
            charSequence = null;
        }
        if (charSequence != null && !g6.n.u(charSequence)) {
            charSequence2 = charSequence;
        }
        if (charSequence2 == null) {
            return this.f39156c;
        }
        return charSequence2;
    }

    private final Map i() {
        String str = (String) this.f39158e.get();
        if (str == null) {
            return Q.h();
        }
        return Q.e(L5.x.a("network_type", str));
    }

    private final Map j(InterfaceC3871a interfaceC3871a) {
        return Q.e(L5.x.a(NotificationCompat.CATEGORY_EVENT, interfaceC3871a.a()));
    }

    private final Map k() {
        Map e8;
        String str = (String) this.f39159f.get();
        if (str == null || (e8 = Q.e(L5.x.a("plugin_type", str))) == null) {
            return Q.h();
        }
        return e8;
    }

    private final Map l() {
        Object b8;
        L5.r a8 = L5.x.a("analytics_ua", "analytics.stripe_android-1.0");
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b((String) this.f39157d.get());
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        if (L5.s.g(b8)) {
            b8 = "pk_undefined";
        }
        return Q.q(Q.q(Q.k(a8, L5.x.a("publishable_key", b8), L5.x.a("os_name", Build.VERSION.CODENAME), L5.x.a("os_release", Build.VERSION.RELEASE), L5.x.a("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), L5.x.a("device_type", f39152i), L5.x.a("bindings_version", "20.49.0"), L5.x.a("is_development", Boolean.FALSE), L5.x.a("session_id", f39151h), L5.x.a("locale", Locale.getDefault().toString())), i()), k());
    }

    public final Map e() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.f39154a;
        if (packageManager != null && (packageInfo = this.f39155b) != null) {
            return Q.k(L5.x.a("app_name", h(packageInfo, packageManager)), L5.x.a("app_version", Integer.valueOf(this.f39155b.versionCode)));
        }
        return Q.h();
    }

    public final C3872b g(InterfaceC3871a event, Map additionalParams) {
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(additionalParams, "additionalParams");
        return new C3872b(Q.q(f(event), additionalParams), y.a.f39269d.b());
    }

    public /* synthetic */ C3875e(PackageManager packageManager, PackageInfo packageInfo, String str, I5.a aVar, I5.a aVar2, I5.a aVar3, int i8, AbstractC3151p abstractC3151p) {
        this(packageManager, packageInfo, str, aVar, aVar2, (i8 & 32) != 0 ? f39153j : aVar3);
    }
}
