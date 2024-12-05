package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38689a = new c("Focused", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f38690b = new c("UnfocusedEmpty", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f38691c = new c("UnfocusedNotEmpty", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f38692d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f38693e;

    static {
        c[] a8 = a();
        f38692d = a8;
        f38693e = U5.b.a(a8);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f38689a, f38690b, f38691c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f38692d.clone();
    }
}
