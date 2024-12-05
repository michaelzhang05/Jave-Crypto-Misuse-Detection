package O5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f8295a = new o("SYNCHRONIZED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f8296b = new o("PUBLICATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final o f8297c = new o("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f8298d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f8299e;

    static {
        o[] a8 = a();
        f8298d = a8;
        f8299e = U5.b.a(a8);
    }

    private o(String str, int i8) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f8295a, f8296b, f8297c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f8298d.clone();
    }
}
