package h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f32837a = new n("PUBLIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f32838b = new n("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final n f32839c = new n("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final n f32840d = new n("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f32841e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ U5.a f32842f;

    static {
        n[] a8 = a();
        f32841e = a8;
        f32842f = U5.b.a(a8);
    }

    private n(String str, int i8) {
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f32837a, f32838b, f32839c, f32840d};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f32841e.clone();
    }
}
