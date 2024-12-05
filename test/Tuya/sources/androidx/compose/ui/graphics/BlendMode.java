package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m2886constructorimpl(0);
    private static final int Src = m2886constructorimpl(1);
    private static final int Dst = m2886constructorimpl(2);
    private static final int SrcOver = m2886constructorimpl(3);
    private static final int DstOver = m2886constructorimpl(4);
    private static final int SrcIn = m2886constructorimpl(5);
    private static final int DstIn = m2886constructorimpl(6);
    private static final int SrcOut = m2886constructorimpl(7);
    private static final int DstOut = m2886constructorimpl(8);
    private static final int SrcAtop = m2886constructorimpl(9);
    private static final int DstAtop = m2886constructorimpl(10);
    private static final int Xor = m2886constructorimpl(11);
    private static final int Plus = m2886constructorimpl(12);
    private static final int Modulate = m2886constructorimpl(13);
    private static final int Screen = m2886constructorimpl(14);
    private static final int Overlay = m2886constructorimpl(15);
    private static final int Darken = m2886constructorimpl(16);
    private static final int Lighten = m2886constructorimpl(17);
    private static final int ColorDodge = m2886constructorimpl(18);
    private static final int ColorBurn = m2886constructorimpl(19);
    private static final int Hardlight = m2886constructorimpl(20);
    private static final int Softlight = m2886constructorimpl(21);
    private static final int Difference = m2886constructorimpl(22);
    private static final int Exclusion = m2886constructorimpl(23);
    private static final int Multiply = m2886constructorimpl(24);
    private static final int Hue = m2886constructorimpl(25);
    private static final int Saturation = m2886constructorimpl(26);
    private static final int Color = m2886constructorimpl(27);
    private static final int Luminosity = m2886constructorimpl(28);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m2892getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m2893getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m2894getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m2895getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m2896getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m2897getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m2898getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m2899getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m2900getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m2901getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m2902getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m2903getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m2904getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m2905getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m2906getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m2907getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m2908getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m2909getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m2910getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m2911getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m2912getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m2913getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m2914getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m2915getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m2916getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m2917getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m2918getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m2919getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m2920getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ BlendMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m2885boximpl(int i8) {
        return new BlendMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2886constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2887equalsimpl(int i8, Object obj) {
        return (obj instanceof BlendMode) && i8 == ((BlendMode) obj).m2891unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2888equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2889hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2890toStringimpl(int i8) {
        if (m2888equalsimpl0(i8, Clear)) {
            return "Clear";
        }
        if (m2888equalsimpl0(i8, Src)) {
            return "Src";
        }
        if (m2888equalsimpl0(i8, Dst)) {
            return "Dst";
        }
        if (m2888equalsimpl0(i8, SrcOver)) {
            return "SrcOver";
        }
        if (m2888equalsimpl0(i8, DstOver)) {
            return "DstOver";
        }
        if (m2888equalsimpl0(i8, SrcIn)) {
            return "SrcIn";
        }
        if (m2888equalsimpl0(i8, DstIn)) {
            return "DstIn";
        }
        if (m2888equalsimpl0(i8, SrcOut)) {
            return "SrcOut";
        }
        if (m2888equalsimpl0(i8, DstOut)) {
            return "DstOut";
        }
        if (m2888equalsimpl0(i8, SrcAtop)) {
            return "SrcAtop";
        }
        if (m2888equalsimpl0(i8, DstAtop)) {
            return "DstAtop";
        }
        if (m2888equalsimpl0(i8, Xor)) {
            return "Xor";
        }
        if (m2888equalsimpl0(i8, Plus)) {
            return "Plus";
        }
        if (m2888equalsimpl0(i8, Modulate)) {
            return "Modulate";
        }
        if (m2888equalsimpl0(i8, Screen)) {
            return "Screen";
        }
        if (m2888equalsimpl0(i8, Overlay)) {
            return "Overlay";
        }
        if (m2888equalsimpl0(i8, Darken)) {
            return "Darken";
        }
        if (m2888equalsimpl0(i8, Lighten)) {
            return "Lighten";
        }
        if (m2888equalsimpl0(i8, ColorDodge)) {
            return "ColorDodge";
        }
        if (m2888equalsimpl0(i8, ColorBurn)) {
            return "ColorBurn";
        }
        if (m2888equalsimpl0(i8, Hardlight)) {
            return "HardLight";
        }
        if (m2888equalsimpl0(i8, Softlight)) {
            return "Softlight";
        }
        if (m2888equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m2888equalsimpl0(i8, Exclusion)) {
            return "Exclusion";
        }
        if (m2888equalsimpl0(i8, Multiply)) {
            return "Multiply";
        }
        if (m2888equalsimpl0(i8, Hue)) {
            return "Hue";
        }
        if (m2888equalsimpl0(i8, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m2888equalsimpl0(i8, Color)) {
            return "Color";
        }
        if (m2888equalsimpl0(i8, Luminosity)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m2887equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2889hashCodeimpl(this.value);
    }

    public String toString() {
        return m2890toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2891unboximpl() {
        return this.value;
    }
}
