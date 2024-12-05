package G3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3008a = new b("Primary", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f3009b = new b("Secondary", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ b[] f3010c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f3011d;

    static {
        b[] a8 = a();
        f3010c = a8;
        f3011d = U5.b.a(a8);
    }

    private b(String str, int i8) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f3008a, f3009b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3010c.clone();
    }
}
