package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9961a = new j("Email", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final j f9962b = new j("Phone", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j f9963c = new j("Name", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f9964d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f9965e;

    static {
        j[] a8 = a();
        f9964d = a8;
        f9965e = R5.b.a(a8);
    }

    private j(String str, int i8) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f9961a, f9962b, f9963c};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f9964d.clone();
    }
}
