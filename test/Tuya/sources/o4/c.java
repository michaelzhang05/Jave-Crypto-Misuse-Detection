package o4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36481a = new c("Focused", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f36482b = new c("UnfocusedEmpty", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f36483c = new c("UnfocusedNotEmpty", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f36484d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ R5.a f36485e;

    static {
        c[] a8 = a();
        f36484d = a8;
        f36485e = R5.b.a(a8);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f36481a, f36482b, f36483c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f36484d.clone();
    }
}
