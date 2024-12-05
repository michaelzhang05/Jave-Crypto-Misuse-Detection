package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final L f31384b = new L("Automatic", 0, "automatic");

    /* renamed from: c, reason: collision with root package name */
    public static final L f31385c = new L("Skip", 1, "skip");

    /* renamed from: d, reason: collision with root package name */
    public static final L f31386d = new L("Microdeposits", 2, "microdeposits");

    /* renamed from: e, reason: collision with root package name */
    public static final L f31387e = new L("Instant", 3, "instant");

    /* renamed from: f, reason: collision with root package name */
    public static final L f31388f = new L("InstantOrSkip", 4, "instant_or_skip");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ L[] f31389g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31390h;

    /* renamed from: a, reason: collision with root package name */
    private final String f31391a;

    static {
        L[] a8 = a();
        f31389g = a8;
        f31390h = U5.b.a(a8);
    }

    private L(String str, int i8, String str2) {
        this.f31391a = str2;
    }

    private static final /* synthetic */ L[] a() {
        return new L[]{f31384b, f31385c, f31386d, f31387e, f31388f};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f31389g.clone();
    }

    public final String b() {
        return this.f31391a;
    }
}
