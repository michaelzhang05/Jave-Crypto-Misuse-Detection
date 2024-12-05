package A2;

import A2.d;
import android.os.SystemClock;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f75b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f76c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Map f77a = new LinkedHashMap();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f76c;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private c() {
    }

    @Override // A2.d
    public C2758a a(d.b key) {
        AbstractC3159y.i(key, "key");
        Long l8 = (Long) this.f77a.remove(key);
        if (l8 != null) {
            long uptimeMillis = SystemClock.uptimeMillis() - l8.longValue();
            C2758a.C0756a c0756a = C2758a.f31409b;
            return C2758a.e(AbstractC2760c.t(uptimeMillis, EnumC2761d.f31418d));
        }
        return null;
    }

    @Override // A2.d
    public void b(d.b key, boolean z8) {
        AbstractC3159y.i(key, "key");
        if (z8 || !this.f77a.containsKey(key)) {
            this.f77a.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }
}
