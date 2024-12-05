package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f3910b = new d("Production", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d f3911c = new d("Test", 1, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f3912d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f3913e;

    /* renamed from: a, reason: collision with root package name */
    private final int f3914a;

    static {
        d[] a8 = a();
        f3912d = a8;
        f3913e = R5.b.a(a8);
    }

    private d(String str, int i8, int i9) {
        this.f3914a = i9;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f3910b, f3911c};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3912d.clone();
    }

    public final int b() {
        return this.f3914a;
    }
}
