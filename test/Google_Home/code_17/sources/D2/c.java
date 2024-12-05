package D2;

import D2.d;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1777b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f1778c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Map f1779a = new LinkedHashMap();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f1778c;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private c() {
    }

    @Override // D2.d
    public C3225a a(d.b key) {
        AbstractC3255y.i(key, "key");
        Long l8 = (Long) this.f1779a.remove(key);
        if (l8 != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l8.longValue();
            C3225a.C0782a c0782a = C3225a.f34131b;
            return C3225a.e(AbstractC3227c.t(uptimeMillis, EnumC3228d.f34140d));
        }
        return null;
    }

    @Override // D2.d
    public void b(d.b key, boolean z8) {
        AbstractC3255y.i(key, "key");
        if (z8 || !this.f1779a.containsKey(key)) {
            this.f1779a.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }
}
