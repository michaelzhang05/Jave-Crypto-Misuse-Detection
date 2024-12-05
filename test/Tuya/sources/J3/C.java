package J3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f4773a = new C("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C f4774b = new C("Removable", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C f4775c = new C("Modifiable", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ C[] f4776d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f4777e;

    static {
        C[] a8 = a();
        f4776d = a8;
        f4777e = R5.b.a(a8);
    }

    private C(String str, int i8) {
    }

    private static final /* synthetic */ C[] a() {
        return new C[]{f4773a, f4774b, f4775c};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f4776d.clone();
    }
}
