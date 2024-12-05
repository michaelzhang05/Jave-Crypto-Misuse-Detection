package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f37374a = new n("InformCancellation", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f37375b = new n("ModifyPaymentDetails", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f37376c = new n("None", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ n[] f37377d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f37378e;

    static {
        n[] a8 = a();
        f37377d = a8;
        f37378e = R5.b.a(a8);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f37374a, f37375b, f37376c};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f37377d.clone();
    }
}
