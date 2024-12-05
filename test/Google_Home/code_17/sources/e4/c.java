package e4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31615a = new c("Automatic", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f31616b = new c("Never", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f31617c = new c("Full", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f31618d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31619e;

    static {
        c[] a8 = a();
        f31618d = a8;
        f31619e = U5.b.a(a8);
    }

    private c(String str, int i8) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f31615a, f31616b, f31617c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f31618d.clone();
    }
}
