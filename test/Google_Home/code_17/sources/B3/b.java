package B3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f795a = new b("Buy", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f796b = new b("Book", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f797c = new b("Checkout", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f798d = new b("Donate", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f799e = new b("Order", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final b f800f = new b("Pay", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final b f801g = new b("Subscribe", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final b f802h = new b("Plain", 7);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ b[] f803i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ U5.a f804j;

    static {
        b[] a8 = a();
        f803i = a8;
        f804j = U5.b.a(a8);
    }

    private b(String str, int i8) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f795a, f796b, f797c, f798d, f799e, f800f, f801g, f802h};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f803i.clone();
    }
}
