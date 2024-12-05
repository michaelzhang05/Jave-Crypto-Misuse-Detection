package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m593PaddingValues0680j_4(float f8) {
        return new PaddingValuesImpl(f8, f8, f8, f8, null);
    }

    @Stable
    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m594PaddingValuesYgX7TsA(float f8, float f9) {
        return new PaddingValuesImpl(f8, f9, f8, f9, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m595PaddingValuesYgX7TsA$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        return m594PaddingValuesYgX7TsA(f8, f9);
    }

    @Stable
    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m596PaddingValuesa9UjIt4(float f8, float f9, float f10, float f11) {
        return new PaddingValuesImpl(f8, f9, f10, f11, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m597PaddingValuesa9UjIt4$default(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5178constructorimpl(0);
        }
        return m596PaddingValuesa9UjIt4(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m598absolutePaddingqDBjuR0(Modifier absolutePadding, float f8, float f9, float f10, float f11) {
        AbstractC3159y.i(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingElement(f8, f9, f10, f11, false, new PaddingKt$absolutePadding$1(f8, f9, f10, f11), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m599absolutePaddingqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5178constructorimpl(0);
        }
        return m598absolutePaddingqDBjuR0(modifier, f8, f9, f10, f11);
    }

    @Stable
    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        AbstractC3159y.i(paddingValues, "<this>");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo552calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo551calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        AbstractC3159y.i(paddingValues, "<this>");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo551calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo552calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    @Stable
    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m600padding3ABfNKs(Modifier padding, float f8) {
        AbstractC3159y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f8, f8, f8, true, new PaddingKt$padding$3(f8), null));
    }

    @Stable
    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m601paddingVpY3zN4(Modifier padding, float f8, float f9) {
        AbstractC3159y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f9, f8, f9, true, new PaddingKt$padding$2(f8, f9), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m602paddingVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        return m601paddingVpY3zN4(modifier, f8, f9);
    }

    @Stable
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m603paddingqDBjuR0(Modifier padding, float f8, float f9, float f10, float f11) {
        AbstractC3159y.i(padding, "$this$padding");
        return padding.then(new PaddingElement(f8, f9, f10, f11, true, new PaddingKt$padding$1(f8, f9, f10, f11), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m604paddingqDBjuR0$default(Modifier modifier, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5178constructorimpl(0);
        }
        return m603paddingqDBjuR0(modifier, f8, f9, f10, f11);
    }
}
