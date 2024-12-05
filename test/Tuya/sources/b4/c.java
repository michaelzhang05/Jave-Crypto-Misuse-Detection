package b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f14609a = new c("Automatic", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f14610b = new c("Never", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f14611c = new c("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f14612d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14613e;

    static {
        c[] a8 = a();
        f14612d = a8;
        f14613e = R5.b.a(a8);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f14609a, f14610b, f14611c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f14612d.clone();
    }
}
