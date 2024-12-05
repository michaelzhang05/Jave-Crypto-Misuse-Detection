package J3;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f4778a = new D("Complete", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D f4779b = new D(TypedValues.Custom.NAME, 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ D[] f4780c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ R5.a f4781d;

    static {
        D[] a8 = a();
        f4780c = a8;
        f4781d = R5.b.a(a8);
    }

    private D(String str, int i8) {
    }

    private static final /* synthetic */ D[] a() {
        return new D[]{f4778a, f4779b};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f4780c.clone();
    }
}
