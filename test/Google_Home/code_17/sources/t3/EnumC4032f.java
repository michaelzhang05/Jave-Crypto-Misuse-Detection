package t3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4032f {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4032f f39650b = new EnumC4032f("Client", 0, "client");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4032f f39651c = new EnumC4032f("Server", 1, "server");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4032f f39652d = new EnumC4032f("None", 2, "none");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC4032f[] f39653e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ U5.a f39654f;

    /* renamed from: a, reason: collision with root package name */
    private final String f39655a;

    static {
        EnumC4032f[] a8 = a();
        f39653e = a8;
        f39654f = U5.b.a(a8);
    }

    private EnumC4032f(String str, int i8, String str2) {
        this.f39655a = str2;
    }

    private static final /* synthetic */ EnumC4032f[] a() {
        return new EnumC4032f[]{f39650b, f39651c, f39652d};
    }

    public static EnumC4032f valueOf(String str) {
        return (EnumC4032f) Enum.valueOf(EnumC4032f.class, str);
    }

    public static EnumC4032f[] values() {
        return (EnumC4032f[]) f39653e.clone();
    }

    public final String b() {
        return this.f39655a;
    }
}
