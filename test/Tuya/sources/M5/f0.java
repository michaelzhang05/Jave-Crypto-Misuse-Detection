package M5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f7053a = new f0("Ready", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f7054b = new f0("NotReady", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f7055c = new f0("Done", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f7056d = new f0("Failed", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ f0[] f7057e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ R5.a f7058f;

    static {
        f0[] a8 = a();
        f7057e = a8;
        f7058f = R5.b.a(a8);
    }

    private f0(String str, int i8) {
    }

    private static final /* synthetic */ f0[] a() {
        return new f0[]{f7053a, f7054b, f7055c, f7056d};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f7057e.clone();
    }
}
