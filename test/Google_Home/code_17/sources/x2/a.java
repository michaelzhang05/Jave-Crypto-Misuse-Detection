package X2;

import U5.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12741a = new a("InputtingPrimaryField", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f12742b = new a("VerifyingEmail", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f12743c = new a("InputtingRemainingFields", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f12744d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U5.a f12745e;

    static {
        a[] a8 = a();
        f12744d = a8;
        f12745e = b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f12741a, f12742b, f12743c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12744d.clone();
    }
}
