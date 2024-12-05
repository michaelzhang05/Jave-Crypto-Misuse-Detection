package D3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1466a = new b("Primary", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f1467b = new b("Secondary", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ b[] f1468c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ R5.a f1469d;

    static {
        b[] a8 = a();
        f1468c = a8;
        f1469d = R5.b.a(a8);
    }

    private b(String str, int i8) {
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f1466a, f1467b};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1468c.clone();
    }
}
