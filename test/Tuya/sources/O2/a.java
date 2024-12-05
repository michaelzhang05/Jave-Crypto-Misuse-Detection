package O2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7760a = new a("Verified", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f7761b = new a("NeedsVerification", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f7762c = new a("VerificationStarted", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f7763d = new a("SignedOut", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f7764e = new a("Error", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f7765f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ R5.a f7766g;

    static {
        a[] a8 = a();
        f7765f = a8;
        f7766g = R5.b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f7760a, f7761b, f7762c, f7763d, f7764e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7765f.clone();
    }
}
