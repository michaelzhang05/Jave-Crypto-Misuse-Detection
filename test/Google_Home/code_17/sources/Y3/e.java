package Y3;

import P5.AbstractC1378t;
import P5.a0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f13542e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f13543f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f13544g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f13545h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f13546i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f13547j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f13548k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f13549l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f13550m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ e[] f13551n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ U5.a f13552o;

    /* renamed from: a, reason: collision with root package name */
    private final List f13553a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.a f13554b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13555c;

    /* renamed from: d, reason: collision with root package name */
    private final U1.h f13556d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        List e8 = AbstractC1378t.e("F055545342");
        Y3.a aVar = Y3.a.f13530c;
        f13544g = new e("TestRsa", 0, e8, aVar, "ds-test-rsa.txt", null, 8, null);
        int i8 = 8;
        AbstractC3247p abstractC3247p = null;
        U1.h hVar = null;
        f13545h = new e("TestEc", 1, AbstractC1378t.e("F155545342"), Y3.a.f13529b, "ds-test-ec.txt", hVar, i8, abstractC3247p);
        f13546i = new e("Visa", 2, AbstractC1378t.e("A000000003"), aVar, "ds-visa.crt", hVar, i8, abstractC3247p);
        f13547j = new e("Mastercard", 3, AbstractC1378t.e("A000000004"), aVar, "ds-mastercard.crt", hVar, i8, abstractC3247p);
        f13548k = new e("Amex", 4, AbstractC1378t.e("A000000025"), aVar, "ds-amex.pem", hVar, i8, abstractC3247p);
        f13549l = new e("Discover", 5, AbstractC1378t.p("A000000152", "A000000324"), aVar, "ds-discover.cer", null);
        f13550m = new e("CartesBancaires", 6, AbstractC1378t.e("A000000042"), aVar, "ds-cartesbancaires.pem", hVar, i8, abstractC3247p);
        e[] a8 = a();
        f13551n = a8;
        f13552o = U5.b.a(a8);
        f13542e = new a(null);
        f13543f = a0.i(".crt", ".cer", ".pem");
    }

    private e(String str, int i8, List list, Y3.a aVar, String str2, U1.h hVar) {
        this.f13553a = list;
        this.f13554b = aVar;
        this.f13555c = str2;
        this.f13556d = hVar;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f13544g, f13545h, f13546i, f13547j, f13548k, f13549l, f13550m};
    }

    public static U5.a b() {
        return f13552o;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f13551n.clone();
    }

    public final List c() {
        return this.f13553a;
    }

    public final U1.h d() {
        return this.f13556d;
    }

    /* synthetic */ e(String str, int i8, List list, Y3.a aVar, String str2, U1.h hVar, int i9, AbstractC3247p abstractC3247p) {
        this(str, i8, list, aVar, str2, (i9 & 8) != 0 ? U1.h.f10316b : hVar);
    }
}
