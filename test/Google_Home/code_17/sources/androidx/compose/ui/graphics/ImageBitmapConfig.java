package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m3170constructorimpl(0);
    private static final int Alpha8 = m3170constructorimpl(1);
    private static final int Rgb565 = m3170constructorimpl(2);
    private static final int F16 = m3170constructorimpl(3);
    private static final int Gpu = m3170constructorimpl(4);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m3176getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m3177getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m3178getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m3179getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m3180getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m3169boximpl(int i8) {
        return new ImageBitmapConfig(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3170constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3171equalsimpl(int i8, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i8 == ((ImageBitmapConfig) obj).m3175unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3172equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3173hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3174toStringimpl(int i8) {
        if (m3172equalsimpl0(i8, Argb8888)) {
            return "Argb8888";
        }
        if (m3172equalsimpl0(i8, Alpha8)) {
            return "Alpha8";
        }
        if (m3172equalsimpl0(i8, Rgb565)) {
            return "Rgb565";
        }
        if (m3172equalsimpl0(i8, F16)) {
            return "F16";
        }
        if (m3172equalsimpl0(i8, Gpu)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3171equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3173hashCodeimpl(this.value);
    }

    public String toString() {
        return m3174toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3175unboximpl() {
        return this.value;
    }
}