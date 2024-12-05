package X4;

import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: X4.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1499i {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12624f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12625a;

    /* renamed from: b, reason: collision with root package name */
    private String f12626b;

    /* renamed from: c, reason: collision with root package name */
    private int f12627c;

    /* renamed from: d, reason: collision with root package name */
    private String f12628d;

    /* renamed from: e, reason: collision with root package name */
    private int f12629e;

    /* renamed from: X4.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1499i a(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            C1499i c1499i = new C1499i();
            c1499i.g(jsonObjectData);
            return c1499i;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("id")) {
            this.f12625a = jSONObject.getLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            this.f12626b = jSONObject.getString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            this.f12627c = jSONObject.getInt("active");
        }
        if (!jSONObject.isNull("url")) {
            this.f12628d = jSONObject.getString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            this.f12629e = jSONObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f12627c;
    }

    public final String c() {
        if (this.f12628d != null) {
            return this.f12628d + UptodownApp.f28003B.t() + ":webp";
        }
        return null;
    }

    public final long d() {
        return this.f12625a;
    }

    public final String e() {
        return this.f12628d;
    }

    public final boolean f() {
        if (this.f12629e == 1) {
            return true;
        }
        return false;
    }
}
