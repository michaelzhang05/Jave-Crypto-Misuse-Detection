package I3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4032a = new e("Active", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final e f4033b = new e("Success", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final e f4034c = new e("Failed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final e f4035d = new e("Canceled", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f4036e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ U5.a f4037f;

    static {
        e[] a8 = a();
        f4036e = a8;
        f4037f = U5.b.a(a8);
    }

    private e(String str, int i8) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f4032a, f4033b, f4034c, f4035d};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4036e.clone();
    }
}
