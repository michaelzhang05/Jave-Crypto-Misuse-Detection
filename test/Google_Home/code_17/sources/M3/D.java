package M3;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f6484a = new D("Complete", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D f6485b = new D(TypedValues.Custom.NAME, 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ D[] f6486c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ U5.a f6487d;

    static {
        D[] a8 = a();
        f6486c = a8;
        f6487d = U5.b.a(a8);
    }

    private D(String str, int i8) {
    }

    private static final /* synthetic */ D[] a() {
        return new D[]{f6484a, f6485b};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f6486c.clone();
    }
}
