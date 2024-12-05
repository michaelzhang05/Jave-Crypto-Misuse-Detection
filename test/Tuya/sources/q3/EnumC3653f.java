package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3653f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3653f f37328b = new EnumC3653f("Client", 0, "client");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3653f f37329c = new EnumC3653f("Server", 1, "server");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3653f f37330d = new EnumC3653f("None", 2, "none");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC3653f[] f37331e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f37332f;

    /* renamed from: a, reason: collision with root package name */
    private final String f37333a;

    static {
        EnumC3653f[] a8 = a();
        f37331e = a8;
        f37332f = R5.b.a(a8);
    }

    private EnumC3653f(String str, int i8, String str2) {
        this.f37333a = str2;
    }

    private static final /* synthetic */ EnumC3653f[] a() {
        return new EnumC3653f[]{f37328b, f37329c, f37330d};
    }

    public static EnumC3653f valueOf(String str) {
        return (EnumC3653f) Enum.valueOf(EnumC3653f.class, str);
    }

    public static EnumC3653f[] values() {
        return (EnumC3653f[]) f37331e.clone();
    }

    public final String b() {
        return this.f37333a;
    }
}
