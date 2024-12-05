package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;

@Stable
/* loaded from: classes.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                float m4124access$computeFillMaxDimensioniLBOSCw = ContentScaleKt.m4124access$computeFillMaxDimensioniLBOSCw(j8, j9);
                return ScaleFactorKt.ScaleFactor(m4124access$computeFillMaxDimensioniLBOSCw, m4124access$computeFillMaxDimensioniLBOSCw);
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                float m4125access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m4125access$computeFillMinDimensioniLBOSCw(j8, j9);
                return ScaleFactorKt.ScaleFactor(m4125access$computeFillMinDimensioniLBOSCw, m4125access$computeFillMinDimensioniLBOSCw);
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                float m4123access$computeFillHeightiLBOSCw = ContentScaleKt.m4123access$computeFillHeightiLBOSCw(j8, j9);
                return ScaleFactorKt.ScaleFactor(m4123access$computeFillHeightiLBOSCw, m4123access$computeFillHeightiLBOSCw);
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                float m4126access$computeFillWidthiLBOSCw = ContentScaleKt.m4126access$computeFillWidthiLBOSCw(j8, j9);
                return ScaleFactorKt.ScaleFactor(m4126access$computeFillWidthiLBOSCw, m4126access$computeFillWidthiLBOSCw);
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                if (Size.m2804getWidthimpl(j8) <= Size.m2804getWidthimpl(j9) && Size.m2801getHeightimpl(j8) <= Size.m2801getHeightimpl(j9)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float m4125access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m4125access$computeFillMinDimensioniLBOSCw(j8, j9);
                return ScaleFactorKt.ScaleFactor(m4125access$computeFillMinDimensioniLBOSCw, m4125access$computeFillMinDimensioniLBOSCw);
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo4122computeScaleFactorH7hwNQA(long j8, long j9) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m4126access$computeFillWidthiLBOSCw(j8, j9), ContentScaleKt.m4123access$computeFillHeightiLBOSCw(j8, j9));
            }
        };

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }
    }

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo4122computeScaleFactorH7hwNQA(long j8, long j9);
}
