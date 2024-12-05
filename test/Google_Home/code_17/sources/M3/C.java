package M3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f6479a = new C("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C f6480b = new C("Removable", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C f6481c = new C("Modifiable", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ C[] f6482d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f6483e;

    static {
        C[] a8 = a();
        f6482d = a8;
        f6483e = U5.b.a(a8);
    }

    private C(String str, int i8) {
    }

    private static final /* synthetic */ C[] a() {
        return new C[]{f6479a, f6480b, f6481c};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f6482d.clone();
    }
}
