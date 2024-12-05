package R2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9616a = new a("Verified", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f9617b = new a("NeedsVerification", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f9618c = new a("VerificationStarted", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f9619d = new a("SignedOut", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f9620e = new a("Error", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f9621f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U5.a f9622g;

    static {
        a[] a8 = a();
        f9621f = a8;
        f9622g = U5.b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f9616a, f9617b, f9618c, f9619d, f9620e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9621f.clone();
    }
}
