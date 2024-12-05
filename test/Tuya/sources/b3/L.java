package b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    public static final L f14378b = new L("Automatic", 0, "automatic");

    /* renamed from: c, reason: collision with root package name */
    public static final L f14379c = new L("Skip", 1, "skip");

    /* renamed from: d, reason: collision with root package name */
    public static final L f14380d = new L("Microdeposits", 2, "microdeposits");

    /* renamed from: e, reason: collision with root package name */
    public static final L f14381e = new L("Instant", 3, "instant");

    /* renamed from: f, reason: collision with root package name */
    public static final L f14382f = new L("InstantOrSkip", 4, "instant_or_skip");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ L[] f14383g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14384h;

    /* renamed from: a, reason: collision with root package name */
    private final String f14385a;

    static {
        L[] a8 = a();
        f14383g = a8;
        f14384h = R5.b.a(a8);
    }

    private L(String str, int i8, String str2) {
        this.f14385a = str2;
    }

    private static final /* synthetic */ L[] a() {
        return new L[]{f14378b, f14379c, f14380d, f14381e, f14382f};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f14383g.clone();
    }

    public final String b() {
        return this.f14385a;
    }
}
