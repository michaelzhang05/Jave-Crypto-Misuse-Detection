package C6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f1657c = new U("OBJ", 0, '{', '}');

    /* renamed from: d, reason: collision with root package name */
    public static final U f1658d = new U("LIST", 1, '[', ']');

    /* renamed from: e, reason: collision with root package name */
    public static final U f1659e = new U("MAP", 2, '{', '}');

    /* renamed from: f, reason: collision with root package name */
    public static final U f1660f = new U("POLY_OBJ", 3, '[', ']');

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U[] f1661g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ U5.a f1662h;

    /* renamed from: a, reason: collision with root package name */
    public final char f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final char f1664b;

    static {
        U[] a8 = a();
        f1661g = a8;
        f1662h = U5.b.a(a8);
    }

    private U(String str, int i8, char c8, char c9) {
        this.f1663a = c8;
        this.f1664b = c9;
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f1657c, f1658d, f1659e, f1660f};
    }

    public static U5.a b() {
        return f1662h;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f1661g.clone();
    }
}
