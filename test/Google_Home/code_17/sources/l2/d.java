package L2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f5905b = new d("Production", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f5906c = new d("Test", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f5907d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f5908e;

    /* renamed from: a, reason: collision with root package name */
    private final int f5909a;

    static {
        d[] a8 = a();
        f5907d = a8;
        f5908e = U5.b.a(a8);
    }

    private d(String str, int i8, int i9) {
        this.f5909a = i9;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f5905b, f5906c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5907d.clone();
    }

    public final int b() {
        return this.f5909a;
    }
}
