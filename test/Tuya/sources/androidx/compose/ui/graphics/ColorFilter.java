package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m3012tintxETnrds$default(Companion companion, long j8, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = BlendMode.Companion.m2917getSrcIn0nO6VwU();
            }
            return companion.m3015tintxETnrds(j8, i8);
        }

        @Stable
        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m3013colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (AbstractC3151p) null);
        }

        @Stable
        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m3014lightingOWjLjI(long j8, long j9) {
            return new LightingColorFilter(j8, j9, (AbstractC3151p) null);
        }

        @Stable
        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m3015tintxETnrds(long j8, int i8) {
            return new BlendModeColorFilter(j8, i8, (AbstractC3151p) null);
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
