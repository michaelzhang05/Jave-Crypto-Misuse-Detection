package a5;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;
import org.json.JSONObject;

/* renamed from: a5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1632D {

    /* renamed from: f, reason: collision with root package name */
    public static final a f13956f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f13957a;

    /* renamed from: b, reason: collision with root package name */
    private String f13958b;

    /* renamed from: c, reason: collision with root package name */
    private String f13959c;

    /* renamed from: d, reason: collision with root package name */
    private String f13960d;

    /* renamed from: e, reason: collision with root package name */
    private int f13961e;

    /* renamed from: a5.D$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            a8.a1();
            a8.l();
        }

        public final C1632D b(JSONObject jsonObjectData) {
            AbstractC3255y.i(jsonObjectData, "jsonObjectData");
            C1632D c1632d = new C1632D();
            c1632d.g(jsonObjectData);
            return c1632d;
        }

        public final C1632D c(Cursor c8) {
            AbstractC3255y.i(c8, "c");
            C1632D c1632d = new C1632D();
            c1632d.j(c8.getLong(0));
            return c1632d;
        }

        public final C1632D d(Cursor c8) {
            AbstractC3255y.i(c8, "c");
            C1632D c1632d = new C1632D();
            c1632d.j(c8.getLong(0));
            c1632d.l(c8.getString(1));
            c1632d.k(c8.getString(2));
            c1632d.n(c8.getString(3));
            c1632d.m(c8.getInt(4));
            return c1632d;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1632D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f13957a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f13958b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f13959c = jSONObject.getString("iconURL");
        }
        if (!jSONObject.isNull("expireDate")) {
            this.f13960d = jSONObject.getString("expireDate");
        }
    }

    public final long b() {
        return this.f13957a;
    }

    public final String c() {
        return this.f13959c;
    }

    public final String d() {
        return this.f13958b;
    }

    public final String e() {
        return this.f13960d;
    }

    public final void f(Cursor c8) {
        AbstractC3255y.i(c8, "c");
        this.f13957a = c8.getLong(0);
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        if (a8.n0(this.f13957a) == null) {
            a8.L0(this);
        }
        a8.l();
    }

    public final void i(Context context) {
        AbstractC3255y.i(context, "context");
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        a8.b1(this.f13957a);
        a8.l();
    }

    public final void j(long j8) {
        this.f13957a = j8;
    }

    public final void k(String str) {
        this.f13959c = str;
    }

    public final void l(String str) {
        this.f13958b = str;
    }

    public final void m(int i8) {
        this.f13961e = i8;
    }

    public final void n(String str) {
        this.f13960d = str;
    }

    public String toString() {
        return "PreRegister(appID=" + this.f13957a + ", notified=" + this.f13961e + ')';
    }

    public C1632D(long j8, String name, String str, String str2) {
        AbstractC3255y.i(name, "name");
        this.f13957a = j8;
        this.f13958b = name;
        this.f13959c = str;
        this.f13960d = str2;
    }
}
