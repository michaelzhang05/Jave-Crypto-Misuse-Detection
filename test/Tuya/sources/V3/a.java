package V3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11891b = new a("EC", 0, "EC");

    /* renamed from: c, reason: collision with root package name */
    public static final a f11892c = new a("RSA", 1, "RSA");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f11893d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f11894e;

    /* renamed from: a, reason: collision with root package name */
    private final String f11895a;

    static {
        a[] a8 = a();
        f11893d = a8;
        f11894e = R5.b.a(a8);
    }

    private a(String str, int i8, String str2) {
        this.f11895a = str2;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f11891b, f11892c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11893d.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11895a;
    }
}