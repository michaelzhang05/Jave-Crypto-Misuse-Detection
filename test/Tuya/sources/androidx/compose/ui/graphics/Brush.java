package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public abstract class Brush {
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2926horizontalGradient8A3gB4$default(Companion companion, List list, float f8, float f9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2936horizontalGradient8A3gB4((List<Color>) list, f8, f9, i8);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2929linearGradientmHitzGk$default(Companion companion, L5.r[] rVarArr, long j8, long j9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                j8 = Offset.Companion.m2751getZeroF1C5BW0();
            }
            long j10 = j8;
            if ((i9 & 4) != 0) {
                j9 = Offset.Companion.m2749getInfiniteF1C5BW0();
            }
            long j11 = j9;
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2939linearGradientmHitzGk(rVarArr, j10, j11, i8);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2931radialGradientP_VxKs$default(Companion companion, L5.r[] rVarArr, long j8, float f8, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                j8 = Offset.Companion.m2750getUnspecifiedF1C5BW0();
            }
            long j9 = j8;
            float f9 = (i9 & 4) != 0 ? Float.POSITIVE_INFINITY : f8;
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2941radialGradientP_VxKs(rVarArr, j9, f9, i8);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2933sweepGradientUv8p0NA$default(Companion companion, L5.r[] rVarArr, long j8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j8 = Offset.Companion.m2750getUnspecifiedF1C5BW0();
            }
            return companion.m2943sweepGradientUv8p0NA(rVarArr, j8);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2934verticalGradient8A3gB4$default(Companion companion, List list, float f8, float f9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2944verticalGradient8A3gB4((List<Color>) list, f8, f9, i8);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2936horizontalGradient8A3gB4(List<Color> list, float f8, float f9, int i8) {
            return m2938linearGradientmHitzGk(list, OffsetKt.Offset(f8, 0.0f), OffsetKt.Offset(f9, 0.0f), i8);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2939linearGradientmHitzGk(L5.r[] rVarArr, long j8, long j9, int i8) {
            ArrayList arrayList = new ArrayList(rVarArr.length);
            for (L5.r rVar : rVarArr) {
                arrayList.add(Color.m2961boximpl(((Color) rVar.d()).m2981unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(rVarArr.length);
            for (L5.r rVar2 : rVarArr) {
                arrayList2.add(Float.valueOf(((Number) rVar2.c()).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j8, j9, i8, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2941radialGradientP_VxKs(L5.r[] rVarArr, long j8, float f8, int i8) {
            ArrayList arrayList = new ArrayList(rVarArr.length);
            for (L5.r rVar : rVarArr) {
                arrayList.add(Color.m2961boximpl(((Color) rVar.d()).m2981unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(rVarArr.length);
            for (L5.r rVar2 : rVarArr) {
                arrayList2.add(Float.valueOf(((Number) rVar2.c()).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j8, f8, i8, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2943sweepGradientUv8p0NA(L5.r[] rVarArr, long j8) {
            ArrayList arrayList = new ArrayList(rVarArr.length);
            for (L5.r rVar : rVarArr) {
                arrayList.add(Color.m2961boximpl(((Color) rVar.d()).m2981unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(rVarArr.length);
            for (L5.r rVar2 : rVarArr) {
                arrayList2.add(Float.valueOf(((Number) rVar2.c()).floatValue()));
            }
            return new SweepGradient(j8, arrayList, arrayList2, null);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2944verticalGradient8A3gB4(List<Color> list, float f8, float f9, int i8) {
            return m2938linearGradientmHitzGk(list, OffsetKt.Offset(0.0f, f8), OffsetKt.Offset(0.0f, f9), i8);
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2937horizontalGradient8A3gB4(L5.r[] rVarArr, float f8, float f9, int i8) {
            return m2939linearGradientmHitzGk((L5.r[]) Arrays.copyOf(rVarArr, rVarArr.length), OffsetKt.Offset(f8, 0.0f), OffsetKt.Offset(f9, 0.0f), i8);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2945verticalGradient8A3gB4(L5.r[] rVarArr, float f8, float f9, int i8) {
            return m2939linearGradientmHitzGk((L5.r[]) Arrays.copyOf(rVarArr, rVarArr.length), OffsetKt.Offset(0.0f, f8), OffsetKt.Offset(0.0f, f9), i8);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2927horizontalGradient8A3gB4$default(Companion companion, L5.r[] rVarArr, float f8, float f9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2937horizontalGradient8A3gB4(rVarArr, f8, f9, i8);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2932sweepGradientUv8p0NA$default(Companion companion, List list, long j8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j8 = Offset.Companion.m2750getUnspecifiedF1C5BW0();
            }
            return companion.m2942sweepGradientUv8p0NA((List<Color>) list, j8);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2935verticalGradient8A3gB4$default(Companion companion, L5.r[] rVarArr, float f8, float f9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i9 & 4) != 0) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2945verticalGradient8A3gB4(rVarArr, f8, f9, i8);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2930radialGradientP_VxKs$default(Companion companion, List list, long j8, float f8, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                j8 = Offset.Companion.m2750getUnspecifiedF1C5BW0();
            }
            long j9 = j8;
            float f9 = (i9 & 4) != 0 ? Float.POSITIVE_INFINITY : f8;
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2940radialGradientP_VxKs((List<Color>) list, j9, f9, i8);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2938linearGradientmHitzGk(List<Color> list, long j8, long j9, int i8) {
            return new LinearGradient(list, null, j8, j9, i8, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2940radialGradientP_VxKs(List<Color> list, long j8, float f8, int i8) {
            return new RadialGradient(list, null, j8, f8, i8, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2942sweepGradientUv8p0NA(List<Color> list, long j8) {
            return new SweepGradient(j8, list, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2928linearGradientmHitzGk$default(Companion companion, List list, long j8, long j9, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                j8 = Offset.Companion.m2751getZeroF1C5BW0();
            }
            long j10 = j8;
            if ((i9 & 4) != 0) {
                j9 = Offset.Companion.m2749getInfiniteF1C5BW0();
            }
            long j11 = j9;
            if ((i9 & 8) != 0) {
                i8 = TileMode.Companion.m3321getClamp3opZhB0();
            }
            return companion.m2938linearGradientmHitzGk((List<Color>) list, j10, j11, i8);
        }
    }

    public /* synthetic */ Brush(AbstractC3151p abstractC3151p) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo2924applyToPq9zytI(long j8, Paint paint, float f8);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo2925getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m2812getUnspecifiedNHjbRc();
    }
}
