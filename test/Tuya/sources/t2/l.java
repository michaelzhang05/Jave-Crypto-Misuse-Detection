package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f9970a = new l("Checkbox", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f9971b = new l("CheckboxWithPrefilledEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f9972c = new l("CheckboxWithPrefilledEmailAndPhone", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final l f9973d = new l("Implied", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final l f9974e = new l("ImpliedWithPrefilledEmail", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ l[] f9975f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ R5.a f9976g;

    static {
        l[] a8 = a();
        f9975f = a8;
        f9976g = R5.b.a(a8);
    }

    private l(String str, int i8) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f9970a, f9971b, f9972c, f9973d, f9974e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f9975f.clone();
    }
}
