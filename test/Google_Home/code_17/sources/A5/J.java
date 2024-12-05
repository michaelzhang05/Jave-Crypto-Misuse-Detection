package a5;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class J {

    /* renamed from: e, reason: collision with root package name */
    public static final a f13997e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f13998a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13999b;

    /* renamed from: c, reason: collision with root package name */
    private int f14000c;

    /* renamed from: d, reason: collision with root package name */
    private long f14001d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public J(String type, String json) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(json, "json");
        this.f13998a = type;
        this.f13999b = json;
        this.f14000c = -1;
        this.f14001d = System.currentTimeMillis();
    }

    private final int f() {
        if (UptodownApp.f29058B.M()) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        if (!j6.n.s(this.f13998a, "new_releases", true) && !j6.n.s(this.f13998a, "last_updates", true)) {
            return 1800000;
        }
        return 600000;
    }

    public final boolean a() {
        if (System.currentTimeMillis() - this.f14001d < f()) {
            return true;
        }
        return false;
    }

    public final String b() {
        return this.f13999b;
    }

    public final I c() {
        I i8 = new I();
        i8.i(this.f13999b);
        i8.j(200);
        return i8;
    }

    public final long d() {
        return this.f14001d;
    }

    public final String e() {
        return this.f13998a;
    }

    public final void g(int i8) {
        this.f14000c = i8;
    }

    public final void h(long j8) {
        this.f14001d = j8;
    }
}
