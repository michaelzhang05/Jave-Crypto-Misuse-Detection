package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f31602b = new y("Passthrough", 0, "passthrough");

    /* renamed from: c, reason: collision with root package name */
    public static final y f31603c = new y("PaymentMethod", 1, "payment_method_mode");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ y[] f31604d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31605e;

    /* renamed from: a, reason: collision with root package name */
    private final String f31606a;

    static {
        y[] a8 = a();
        f31604d = a8;
        f31605e = U5.b.a(a8);
    }

    private y(String str, int i8, String str2) {
        this.f31606a = str2;
    }

    private static final /* synthetic */ y[] a() {
        return new y[]{f31602b, f31603c};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f31604d.clone();
    }

    public final String b() {
        return this.f31606a;
    }
}
