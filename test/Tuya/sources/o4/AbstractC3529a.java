package o4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3529a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f36385a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f36386b = Dp.m5178constructorimpl(16);

    /* renamed from: c, reason: collision with root package name */
    private static final float f36387c = Dp.m5178constructorimpl(12);

    /* renamed from: d, reason: collision with root package name */
    private static final Modifier f36388d;

    static {
        float f8 = 48;
        f36388d = SizeKt.m631defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8));
    }

    public static final float a() {
        return f36387c;
    }

    public static final Modifier b() {
        return f36388d;
    }

    public static final float c() {
        return f36386b;
    }

    public static final long d() {
        return f36385a;
    }
}
