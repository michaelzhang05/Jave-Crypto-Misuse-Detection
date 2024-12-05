package V3;

import M5.AbstractC1246t;
import M5.a0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11904e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f11905f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f11906g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f11907h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f11908i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f11909j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f11910k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f11911l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f11912m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ e[] f11913n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ R5.a f11914o;

    /* renamed from: a, reason: collision with root package name */
    private final List f11915a;

    /* renamed from: b, reason: collision with root package name */
    private final V3.a f11916b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11917c;

    /* renamed from: d, reason: collision with root package name */
    private final R1.h f11918d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        List e8 = AbstractC1246t.e("F055545342");
        V3.a aVar = V3.a.f11892c;
        f11906g = new e("TestRsa", 0, e8, aVar, "ds-test-rsa.txt", null, 8, null);
        int i8 = 8;
        AbstractC3151p abstractC3151p = null;
        R1.h hVar = null;
        f11907h = new e("TestEc", 1, AbstractC1246t.e("F155545342"), V3.a.f11891b, "ds-test-ec.txt", hVar, i8, abstractC3151p);
        f11908i = new e("Visa", 2, AbstractC1246t.e("A000000003"), aVar, "ds-visa.crt", hVar, i8, abstractC3151p);
        f11909j = new e("Mastercard", 3, AbstractC1246t.e("A000000004"), aVar, "ds-mastercard.crt", hVar, i8, abstractC3151p);
        f11910k = new e("Amex", 4, AbstractC1246t.e("A000000025"), aVar, "ds-amex.pem", hVar, i8, abstractC3151p);
        f11911l = new e("Discover", 5, AbstractC1246t.p("A000000152", "A000000324"), aVar, "ds-discover.cer", null);
        f11912m = new e("CartesBancaires", 6, AbstractC1246t.e("A000000042"), aVar, "ds-cartesbancaires.pem", hVar, i8, abstractC3151p);
        e[] a8 = a();
        f11913n = a8;
        f11914o = R5.b.a(a8);
        f11904e = new a(null);
        f11905f = a0.i(".crt", ".cer", ".pem");
    }

    private e(String str, int i8, List list, V3.a aVar, String str2, R1.h hVar) {
        this.f11915a = list;
        this.f11916b = aVar;
        this.f11917c = str2;
        this.f11918d = hVar;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f11906g, f11907h, f11908i, f11909j, f11910k, f11911l, f11912m};
    }

    public static R5.a b() {
        return f11914o;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11913n.clone();
    }

    public final List c() {
        return this.f11915a;
    }

    public final R1.h d() {
        return this.f11918d;
    }

    /* synthetic */ e(String str, int i8, List list, V3.a aVar, String str2, R1.h hVar, int i9, AbstractC3151p abstractC3151p) {
        this(str, i8, list, aVar, str2, (i9 & 8) != 0 ? R1.h.f8690b : hVar);
    }
}
