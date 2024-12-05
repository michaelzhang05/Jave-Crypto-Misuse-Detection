package A2;

import A2.y;
import O5.s;
import P5.Q;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0947e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f145g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static volatile UUID f146h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f147i;

    /* renamed from: j, reason: collision with root package name */
    private static final L5.a f148j;

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f149a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f150b;

    /* renamed from: c, reason: collision with root package name */
    private final String f151c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f152d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f153e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f154f;

    /* renamed from: A2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final UUID a() {
            return C0947e.f146h;
        }

        public final void b(UUID id) {
            AbstractC3255y.i(id, "id");
            C0947e.f146h = id;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        AbstractC3255y.h(randomUUID, "randomUUID(...)");
        f146h = randomUUID;
        f147i = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        f148j = new L5.a() { // from class: A2.d
            @Override // L5.a
            public final Object get() {
                String b8;
                b8 = C0947e.b();
                return b8;
            }
        };
    }

    public C0947e(PackageManager packageManager, PackageInfo packageInfo, String packageName, L5.a publishableKeyProvider, L5.a networkTypeProvider, L5.a pluginTypeProvider) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(networkTypeProvider, "networkTypeProvider");
        AbstractC3255y.i(pluginTypeProvider, "pluginTypeProvider");
        this.f149a = packageManager;
        this.f150b = packageInfo;
        this.f151c = packageName;
        this.f152d = publishableKeyProvider;
        this.f153e = networkTypeProvider;
        this.f154f = pluginTypeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b() {
        return D2.e.f1786a.a();
    }

    private final Map f(InterfaceC0943a interfaceC0943a) {
        return Q.q(Q.q(l(), e()), j(interfaceC0943a));
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
        if (charSequence != null && !j6.n.u(charSequence)) {
            charSequence2 = charSequence;
        }
        if (charSequence2 == null) {
            return this.f151c;
        }
        return charSequence2;
    }

    private final Map i() {
        String str = (String) this.f153e.get();
        if (str == null) {
            return Q.h();
        }
        return Q.e(O5.x.a("network_type", str));
    }

    private final Map j(InterfaceC0943a interfaceC0943a) {
        return Q.e(O5.x.a(NotificationCompat.CATEGORY_EVENT, interfaceC0943a.a()));
    }

    private final Map k() {
        Map e8;
        String str = (String) this.f154f.get();
        if (str == null || (e8 = Q.e(O5.x.a("plugin_type", str))) == null) {
            return Q.h();
        }
        return e8;
    }

    private final Map l() {
        Object b8;
        O5.r a8 = O5.x.a("analytics_ua", "analytics.stripe_android-1.0");
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b((String) this.f152d.get());
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        if (O5.s.g(b8)) {
            b8 = "pk_undefined";
        }
        return Q.q(Q.q(Q.k(a8, O5.x.a("publishable_key", b8), O5.x.a("os_name", Build.VERSION.CODENAME), O5.x.a("os_release", Build.VERSION.RELEASE), O5.x.a("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), O5.x.a("device_type", f147i), O5.x.a("bindings_version", "20.49.0"), O5.x.a("is_development", Boolean.FALSE), O5.x.a("session_id", f146h), O5.x.a("locale", Locale.getDefault().toString())), i()), k());
    }

    public final Map e() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.f149a;
        if (packageManager != null && (packageInfo = this.f150b) != null) {
            return Q.k(O5.x.a("app_name", h(packageInfo, packageManager)), O5.x.a("app_version", Integer.valueOf(this.f150b.versionCode)));
        }
        return Q.h();
    }

    public final C0944b g(InterfaceC0943a event, Map additionalParams) {
        AbstractC3255y.i(event, "event");
        AbstractC3255y.i(additionalParams, "additionalParams");
        return new C0944b(Q.q(f(event), additionalParams), y.a.f264d.b());
    }

    public /* synthetic */ C0947e(PackageManager packageManager, PackageInfo packageInfo, String str, L5.a aVar, L5.a aVar2, L5.a aVar3, int i8, AbstractC3247p abstractC3247p) {
        this(packageManager, packageInfo, str, aVar, aVar2, (i8 & 32) != 0 ? f148j : aVar3);
    }
}
