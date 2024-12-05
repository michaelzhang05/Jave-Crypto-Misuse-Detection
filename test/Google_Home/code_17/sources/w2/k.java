package W2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f11623a = new k("InsteadOfSaveForFutureUse", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final k f11624b = new k("AlongsideSaveForFutureUse", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ k[] f11625c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f11626d;

    static {
        k[] a8 = a();
        f11625c = a8;
        f11626d = U5.b.a(a8);
    }

    private k(String str, int i8) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f11623a, f11624b};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f11625c.clone();
    }
}
