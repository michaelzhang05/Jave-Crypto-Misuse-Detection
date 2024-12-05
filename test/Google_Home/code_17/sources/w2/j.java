package W2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f11618a = new j("Email", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final j f11619b = new j("Phone", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j f11620c = new j("Name", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f11621d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f11622e;

    static {
        j[] a8 = a();
        f11621d = a8;
        f11622e = U5.b.a(a8);
    }

    private j(String str, int i8) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f11618a, f11619b, f11620c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f11621d.clone();
    }
}
