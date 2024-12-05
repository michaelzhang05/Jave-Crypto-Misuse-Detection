package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4096a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4096a f40115a = new EnumC4096a("CustomTabs", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4096a f40116b = new EnumC4096a("Unknown", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC4096a[] f40117c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f40118d;

    static {
        EnumC4096a[] a8 = a();
        f40117c = a8;
        f40118d = U5.b.a(a8);
    }

    private EnumC4096a(String str, int i8) {
    }

    private static final /* synthetic */ EnumC4096a[] a() {
        return new EnumC4096a[]{f40115a, f40116b};
    }

    public static EnumC4096a valueOf(String str) {
        return (EnumC4096a) Enum.valueOf(EnumC4096a.class, str);
    }

    public static EnumC4096a[] values() {
        return (EnumC4096a[]) f40117c.clone();
    }
}
