package L5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f6504a = new o("SYNCHRONIZED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f6505b = new o("PUBLICATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final o f6506c = new o("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f6507d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f6508e;

    static {
        o[] a8 = a();
        f6507d = a8;
        f6508e = R5.b.a(a8);
    }

    private o(String str, int i8) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f6504a, f6505b, f6506c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f6507d.clone();
    }
}
