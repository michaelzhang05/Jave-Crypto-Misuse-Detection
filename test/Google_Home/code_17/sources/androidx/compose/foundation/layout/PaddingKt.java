package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m598PaddingValues0680j_4(float f8) {
        return new PaddingValuesImpl(f8, f8, f8, f8, null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m599PaddingValuesYgX7TsA(float f8, float f9) {
        return new PaddingValuesImpl(f8, f9, f8, f9, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m600PaddingValuesYgX7TsA$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5183constructorimpl(0);
        }
        return m599PaddingValuesYgX7TsA(f8, f9);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m601PaddingValuesa9UjIt4(float f8, float f9, float f10, float f11) {
        return new PaddingValuesImpl(f8, f9, f10, f11, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m602PaddingValuesa9UjIt4$default(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5183constructorimpl(0);
        }
        return m601PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m603absolutePaddingqDBjuR0(Modifier absolutePadding, float f8, float f9, float f10, float f11) {
        AbstractC3255y.i(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingElement(f8, f9, f10, f11, false, new PaddingKt$absolutePadding$1(f8, f9, f10, f11), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m604absolutePaddingqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5183constructorimpl(0);
        }
        return m603absolutePaddingqDBjuR0(modifier, f8, f9, f10, f11);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        AbstractC3255y.i(paddingValues, "<this>");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo557calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo556calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        AbstractC3255y.i(paddingValues, "<this>");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo556calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo557calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        AbstractC3255y.i(modifier, "<this>");
        AbstractC3255y.i(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    @Stable
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m605padding3ABfNKs(Modifier padding, float f8) {
        AbstractC3255y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f8, f8, f8, true, new PaddingKt$padding$3(f8), null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m606paddingVpY3zN4(Modifier padding, float f8, float f9) {
        AbstractC3255y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f9, f8, f9, true, new PaddingKt$padding$2(f8, f9), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m607paddingVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5183constructorimpl(0);
        }
        return m606paddingVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m608paddingqDBjuR0(Modifier padding, float f8, float f9, float f10, float f11) {
        AbstractC3255y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f9, f10, f11, true, new PaddingKt$padding$1(f8, f9, f10, f11), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m609paddingqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5183constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5183constructorimpl(0);
        }
        return m608paddingqDBjuR0(modifier, f8, f9, f10, f11);
    }
}
