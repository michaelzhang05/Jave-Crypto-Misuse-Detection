package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3743a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3743a f37842a = new EnumC3743a("CustomTabs", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3743a f37843b = new EnumC3743a("Unknown", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC3743a[] f37844c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ R5.a f37845d;

    static {
        EnumC3743a[] a8 = a();
        f37844c = a8;
        f37845d = R5.b.a(a8);
    }

    private EnumC3743a(String str, int i8) {
    }

    private static final /* synthetic */ EnumC3743a[] a() {
        return new EnumC3743a[]{f37842a, f37843b};
    }

    public static EnumC3743a valueOf(String str) {
        return (EnumC3743a) Enum.valueOf(EnumC3743a.class, str);
    }

    public static EnumC3743a[] values() {
        return (EnumC3743a[]) f37844c.clone();
    }
}
