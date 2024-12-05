package a5;

import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: a5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1642i {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14245f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f14246a;

    /* renamed from: b, reason: collision with root package name */
    private String f14247b;

    /* renamed from: c, reason: collision with root package name */
    private int f14248c;

    /* renamed from: d, reason: collision with root package name */
    private String f14249d;

    /* renamed from: e, reason: collision with root package name */
    private int f14250e;

    /* renamed from: a5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1642i a(JSONObject jsonObjectData) {
            AbstractC3255y.i(jsonObjectData, "jsonObjectData");
            C1642i c1642i = new C1642i();
            c1642i.g(jsonObjectData);
            return c1642i;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f14246a = jSONObject.getLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            this.f14247b = jSONObject.getString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            this.f14248c = jSONObject.getInt("active");
        }
        if (!jSONObject.isNull("url")) {
            this.f14249d = jSONObject.getString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f14250e = jSONObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f14248c;
    }

    public final String c() {
        if (this.f14249d != null) {
            return this.f14249d + UptodownApp.f29058B.t() + ":webp";
        }
        return null;
    }

    public final long d() {
        return this.f14246a;
    }

    public final String e() {
        return this.f14249d;
    }

    public final boolean f() {
        if (this.f14250e == 1) {
            return true;
        }
        return false;
    }
}
