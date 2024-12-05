package a5;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1635b {

    /* renamed from: j, reason: collision with root package name */
    public static final a f14096j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f14097a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f14098b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f14099c;

    /* renamed from: d, reason: collision with root package name */
    private String f14100d;

    /* renamed from: e, reason: collision with root package name */
    private String f14101e;

    /* renamed from: f, reason: collision with root package name */
    private String f14102f;

    /* renamed from: g, reason: collision with root package name */
    private String f14103g;

    /* renamed from: h, reason: collision with root package name */
    private String f14104h;

    /* renamed from: i, reason: collision with root package name */
    private String f14105i;

    /* renamed from: a5.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private final String e() {
        int i8 = this.f14098b;
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
        return this.f14099c;
    }

    public final String b() {
        return this.f14104h;
    }

    public final String c() {
        return this.f14105i;
    }

    public final int d() {
        return this.f14098b;
    }

    public final String f() {
        return this.f14103g;
    }

    public final String g() {
        return this.f14102f;
    }

    public final String h() {
        return this.f14101e;
    }

    public final String i() {
        return this.f14100d;
    }

    public final void j(C1639f appStored, O update, C3674n dbManager) {
        AbstractC3255y.i(appStored, "appStored");
        AbstractC3255y.i(update, "update");
        AbstractC3255y.i(dbManager, "dbManager");
        C1635b c1635b = new C1635b();
        c1635b.f14099c = appStored.J();
        c1635b.f14098b = 3;
        c1635b.f14102f = String.valueOf(appStored.f0());
        c1635b.f14103g = String.valueOf(update.w());
        c1635b.f14100d = appStored.h0();
        c1635b.f14101e = update.x();
        c1635b.f14104h = String.valueOf(update.v());
        c1635b.f14105i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1635b);
    }

    public final void k(C1639f appUpdated, C3674n dbManager) {
        AbstractC3255y.i(appUpdated, "appUpdated");
        AbstractC3255y.i(dbManager, "dbManager");
        C1635b c1635b = new C1635b();
        c1635b.f14099c = appUpdated.J();
        c1635b.f14098b = 4;
        c1635b.f14103g = String.valueOf(appUpdated.f0());
        c1635b.f14101e = appUpdated.h0();
        c1635b.f14105i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1635b);
    }

    public final void l(C1639f appStored, O update, C3674n dbManager) {
        AbstractC3255y.i(appStored, "appStored");
        AbstractC3255y.i(update, "update");
        AbstractC3255y.i(dbManager, "dbManager");
        C1635b c1635b = new C1635b();
        c1635b.f14099c = appStored.J();
        c1635b.f14098b = 1;
        c1635b.f14102f = String.valueOf(appStored.f0());
        c1635b.f14103g = String.valueOf(update.w());
        c1635b.f14100d = appStored.h0();
        c1635b.f14101e = update.x();
        c1635b.f14104h = String.valueOf(update.v());
        c1635b.f14105i = String.valueOf(System.currentTimeMillis() / 1000);
        dbManager.B0(c1635b);
    }

    public String toString() {
        return "{id=" + this.f14097a + ", type=" + this.f14098b + ", typeReadable=" + e() + ", packageName=" + this.f14099c + ", versionNameOld=" + this.f14100d + ", versionNameNew=" + this.f14101e + ", versionCodeOld=" + this.f14102f + ", versionCodeNew=" + this.f14103g + ", size=" + this.f14104h + ", timestamp=" + this.f14105i + '}';
    }
}
