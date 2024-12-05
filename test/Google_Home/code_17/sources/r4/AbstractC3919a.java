package r4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3919a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f38593a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f38594b = Dp.m5183constructorimpl(16);

    /* renamed from: c, reason: collision with root package name */
    private static final float f38595c = Dp.m5183constructorimpl(12);

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f38596d;

    static {
        float f8 = 48;
        f38596d = SizeKt.m636defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8));
    }

    public static final float a() {
        return f38595c;
    }

    public static final Modifier b() {
        return f38596d;
    }

    public static final float c() {
        return f38594b;
    }

    public static final long d() {
        return f38593a;
    }
}
