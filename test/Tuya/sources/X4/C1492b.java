package X4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* renamed from: X4.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1492b {

    /* renamed from: j, reason: collision with root package name */
    public static final a f12475j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12476a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f12477b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f12478c;

    /* renamed from: d, reason: collision with root package name */
    private String f12479d;

    /* renamed from: e, reason: collision with root package name */
    private String f12480e;

    /* renamed from: f, reason: collision with root package name */
    private String f12481f;

    /* renamed from: g, reason: collision with root package name */
    private String f12482g;

    /* renamed from: h, reason: collision with root package name */
    private String f12483h;

    /* renamed from: i, reason: collision with root package name */
    private String f12484i;

    /* renamed from: X4.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private final String e() {
        int i8 = this.f12477b;
        if (i8 != 1) {
            if (i8 != 3) {
                if (i8 != 4) {
                    return "Unknown";
                }
                return "INSTALLED_UPDATE";
            }
            return "DOWNLOADED_UPDATE";
        }
        return "NEW_UPDATE";
    }

    public final String a() {
        return this.f12478c;
    }

    public final String b() {
        return this.f12483h;
    }

    public final String c() {
        return this.f12484i;
    }

    public final int d() {
        return this.f12477b;
    }

    public final String f() {
        return this.f12482g;
    }

    public final String g() {
        return this.f12481f;
    }

    public final String h() {
        return this.f12480e;
    }

    public final String i() {
        return this.f12479d;
    }

    public final void j(C1496f appStored, O update, C3326n dbManager) {
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12478c = appStored.Q();
        c1492b.f12477b = 3;
        c1492b.f12481f = String.valueOf(appStored.f0());
        c1492b.f12482g = String.valueOf(update.u());
        c1492b.f12479d = appStored.h0();
        c1492b.f12480e = update.z();
        c1492b.f12483h = String.valueOf(update.s());
        c1492b.f12484i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public final void k(C1496f appUpdated, C3326n dbManager) {
        AbstractC3159y.i(appUpdated, "appUpdated");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12478c = appUpdated.Q();
        c1492b.f12477b = 4;
        c1492b.f12482g = String.valueOf(appUpdated.f0());
        c1492b.f12480e = appUpdated.h0();
        c1492b.f12484i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public final void l(C1496f appStored, O update, C3326n dbManager) {
        AbstractC3159y.i(appStored, "appStored");
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(dbManager, "dbManager");
        C1492b c1492b = new C1492b();
        c1492b.f12478c = appStored.Q();
        c1492b.f12477b = 1;
        c1492b.f12481f = String.valueOf(appStored.f0());
        c1492b.f12482g = String.valueOf(update.u());
        c1492b.f12479d = appStored.h0();
        c1492b.f12480e = update.z();
        c1492b.f12483h = String.valueOf(update.s());
        c1492b.f12484i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1492b);
    }

    public String toString() {
        return "{id=" + this.f12476a + ", type=" + this.f12477b + ", typeReadable=" + e() + ", packageName=" + this.f12478c + ", versionNameOld=" + this.f12479d + ", versionNameNew=" + this.f12480e + ", versionCodeOld=" + this.f12481f + ", versionCodeNew=" + this.f12482g + ", size=" + this.f12483h + ", timestamp=" + this.f12484i + '}';
    }
}
