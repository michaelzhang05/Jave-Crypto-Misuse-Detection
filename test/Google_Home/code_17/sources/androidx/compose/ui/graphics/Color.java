package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@Immutable
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m2987getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m2988getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m2989getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2990getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2991getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m2992getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2993getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m2994getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m2995getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m2996getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m2997getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m2998getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m2999getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m3000hslJlNiLsg$default(Companion companion, float f8, float f9, float f10, float f11, Rgb rgb, int i8, Object obj) {
            float f12;
            if ((i8 & 8) != 0) {
                f12 = 1.0f;
            } else {
                f12 = f11;
            }
            if ((i8 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m3015hslJlNiLsg(f8, f9, f10, f12, rgb);
        }

        private final float hslToRgbComponent(int i8, float f8, float f9, float f10) {
            float f11 = (i8 + (f8 / 30.0f)) % 12.0f;
            return f10 - ((f9 * Math.min(f10, 1.0f - f10)) * Math.max(-1.0f, Math.min(f11 - 3, Math.min(9 - f11, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m3001hsvJlNiLsg$default(Companion companion, float f8, float f9, float f10, float f11, Rgb rgb, int i8, Object obj) {
            float f12;
            if ((i8 & 8) != 0) {
                f12 = 1.0f;
            } else {
                f12 = f11;
            }
            if ((i8 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m3016hsvJlNiLsg(f8, f9, f10, f12, rgb);
        }

        private final float hsvToRgbComponent(int i8, float f8, float f9, float f10) {
            float f11 = (i8 + (f8 / 60.0f)) % 6.0f;
            return f10 - ((f9 * f10) * Math.max(0.0f, Math.min(f11, Math.min(4 - f11, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m3002getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m3003getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m3004getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m3005getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m3006getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m3007getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m3008getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m3009getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m3010getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m3011getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m3012getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m3013getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m3014getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg */
        public final long m3015hslJlNiLsg(float f8, float f9, float f10, float f11, Rgb rgb) {
            if (0.0f <= f8 && f8 <= 360.0f && 0.0f <= f9 && f9 <= 1.0f && 0.0f <= f10 && f10 <= 1.0f) {
                return ColorKt.Color(hslToRgbComponent(0, f8, f9, f10), hslToRgbComponent(8, f8, f9, f10), hslToRgbComponent(4, f8, f9, f10), f11, rgb);
            }
            throw new IllegalArgumentException(("HSL (" + f8 + ", " + f9 + ", " + f10 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        /* renamed from: hsv-JlNiLsg */
        public final long m3016hsvJlNiLsg(float f8, float f9, float f10, float f11, Rgb rgb) {
            if (0.0f <= f8 && f8 <= 360.0f && 0.0f <= f9 && f9 <= 1.0f && 0.0f <= f10 && f10 <= 1.0f) {
                return ColorKt.Color(hsvToRgbComponent(5, f8, f9, f10), hsvToRgbComponent(3, f8, f9, f10), hsvToRgbComponent(1, f8, f9, f10), f11, rgb);
            }
            throw new IllegalArgumentException(("HSV (" + f8 + ", " + f9 + ", " + f10 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Color(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m2966boximpl(long j8) {
        return new Color(j8);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m2967component1impl(long j8) {
        return m2982getRedimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m2968component2impl(long j8) {
        return m2981getGreenimpl(j8);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m2969component3impl(long j8) {
        return m2979getBlueimpl(j8);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m2970component4impl(long j8) {
        return m2978getAlphaimpl(j8);
    }

    @Stable
    /* renamed from: component5-impl */
    public static final ColorSpace m2971component5impl(long j8) {
        return m2980getColorSpaceimpl(j8);
    }

    /* renamed from: constructor-impl */
    public static long m2972constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: convert-vNxB06k */
    public static final long m2973convertvNxB06k(long j8, ColorSpace colorSpace) {
        ColorSpace m2980getColorSpaceimpl = m2980getColorSpaceimpl(j8);
        if (AbstractC3255y.d(colorSpace, m2980getColorSpaceimpl)) {
            return j8;
        }
        return ColorSpaceKt.m3372connectYBCOT_4$default(m2980getColorSpaceimpl, colorSpace, 0, 2, null).mo3374transformToColorwmQWz5c$ui_graphics_release(m2982getRedimpl(j8), m2981getGreenimpl(j8), m2979getBlueimpl(j8), m2978getAlphaimpl(j8));
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m2974copywmQWz5c(long j8, float f8, float f9, float f10, float f11) {
        return ColorKt.Color(f9, f10, f11, f8, m2980getColorSpaceimpl(j8));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m2975copywmQWz5c$default(long j8, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2978getAlphaimpl(j8);
        }
        float f12 = f8;
        if ((i8 & 2) != 0) {
            f9 = m2982getRedimpl(j8);
        }
        float f13 = f9;
        if ((i8 & 4) != 0) {
            f10 = m2981getGreenimpl(j8);
        }
        float f14 = f10;
        if ((i8 & 8) != 0) {
            f11 = m2979getBlueimpl(j8);
        }
        return m2974copywmQWz5c(j8, f12, f13, f14, f11);
    }

    /* renamed from: equals-impl */
    public static boolean m2976equalsimpl(long j8, Object obj) {
        return (obj instanceof Color) && j8 == ((Color) obj).m2986unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2977equalsimpl0(long j8, long j9) {
        return O5.C.d(j8, j9);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl */
    public static final float m2978getAlphaimpl(long j8) {
        float c8;
        float f8;
        if (O5.C.b(63 & j8) == 0) {
            c8 = (float) O5.K.c(O5.C.b(O5.C.b(j8 >>> 56) & 255));
            f8 = 255.0f;
        } else {
            c8 = (float) O5.K.c(O5.C.b(O5.C.b(j8 >>> 6) & 1023));
            f8 = 1023.0f;
        }
        return c8 / f8;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl */
    public static final float m2979getBlueimpl(long j8) {
        if (O5.C.b(63 & j8) == 0) {
            return ((float) O5.K.c(O5.C.b(O5.C.b(j8 >>> 32) & 255))) / 255.0f;
        }
        return Float16.m3100toFloatimpl(Float16.m3084constructorimpl((short) O5.C.b(O5.C.b(j8 >>> 16) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m2980getColorSpaceimpl(long j8) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) O5.C.b(j8 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl */
    public static final float m2981getGreenimpl(long j8) {
        if (O5.C.b(63 & j8) == 0) {
            return ((float) O5.K.c(O5.C.b(O5.C.b(j8 >>> 40) & 255))) / 255.0f;
        }
        return Float16.m3100toFloatimpl(Float16.m3084constructorimpl((short) O5.C.b(O5.C.b(j8 >>> 32) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl */
    public static final float m2982getRedimpl(long j8) {
        if (O5.C.b(63 & j8) == 0) {
            return ((float) O5.K.c(O5.C.b(O5.C.b(j8 >>> 48) & 255))) / 255.0f;
        }
        return Float16.m3100toFloatimpl(Float16.m3084constructorimpl((short) O5.C.b(O5.C.b(j8 >>> 48) & 65535)));
    }

    /* renamed from: hashCode-impl */
    public static int m2983hashCodeimpl(long j8) {
        return O5.C.e(j8);
    }

    /* renamed from: toString-impl */
    public static String m2984toStringimpl(long j8) {
        return "Color(" + m2982getRedimpl(j8) + ", " + m2981getGreenimpl(j8) + ", " + m2979getBlueimpl(j8) + ", " + m2978getAlphaimpl(j8) + ", " + m2980getColorSpaceimpl(j8).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m2976equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m2985getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m2983hashCodeimpl(this.value);
    }

    public String toString() {
        return m2984toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m2986unboximpl() {
        return this.value;
    }
}
