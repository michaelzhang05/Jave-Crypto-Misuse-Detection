package t3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f39696a = new n("InformCancellation", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f39697b = new n("ModifyPaymentDetails", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f39698c = new n("None", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ n[] f39699d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f39700e;

    static {
        n[] a8 = a();
        f39699d = a8;
        f39700e = U5.b.a(a8);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f39696a, f39697b, f39698c};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f39699d.clone();
    }
}
