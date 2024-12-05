package Y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13529b = new a("EC", 0, "EC");

    /* renamed from: c, reason: collision with root package name */
    public static final a f13530c = new a("RSA", 1, "RSA");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f13531d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f13532e;

    /* renamed from: a, reason: collision with root package name */
    private final String f13533a;

    static {
        a[] a8 = a();
        f13531d = a8;
        f13532e = U5.b.a(a8);
    }

    private a(String str, int i8, String str2) {
        this.f13533a = str2;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f13529b, f13530c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13531d.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f13533a;
    }
}
