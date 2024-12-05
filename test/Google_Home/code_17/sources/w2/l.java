package W2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f11627a = new l("Checkbox", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f11628b = new l("CheckboxWithPrefilledEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f11629c = new l("CheckboxWithPrefilledEmailAndPhone", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final l f11630d = new l("Implied", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final l f11631e = new l("ImpliedWithPrefilledEmail", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ l[] f11632f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ U5.a f11633g;

    static {
        l[] a8 = a();
        f11632f = a8;
        f11633g = U5.b.a(a8);
    }

    private l(String str, int i8) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f11627a, f11628b, f11629c, f11630d, f11631e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f11632f.clone();
    }
}
