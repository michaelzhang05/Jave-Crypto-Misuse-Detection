package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m2891constructorimpl(0);
    private static final int Src = m2891constructorimpl(1);
    private static final int Dst = m2891constructorimpl(2);
    private static final int SrcOver = m2891constructorimpl(3);
    private static final int DstOver = m2891constructorimpl(4);
    private static final int SrcIn = m2891constructorimpl(5);
    private static final int DstIn = m2891constructorimpl(6);
    private static final int SrcOut = m2891constructorimpl(7);
    private static final int DstOut = m2891constructorimpl(8);
    private static final int SrcAtop = m2891constructorimpl(9);
    private static final int DstAtop = m2891constructorimpl(10);
    private static final int Xor = m2891constructorimpl(11);
    private static final int Plus = m2891constructorimpl(12);
    private static final int Modulate = m2891constructorimpl(13);
    private static final int Screen = m2891constructorimpl(14);
    private static final int Overlay = m2891constructorimpl(15);
    private static final int Darken = m2891constructorimpl(16);
    private static final int Lighten = m2891constructorimpl(17);
    private static final int ColorDodge = m2891constructorimpl(18);
    private static final int ColorBurn = m2891constructorimpl(19);
    private static final int Hardlight = m2891constructorimpl(20);
    private static final int Softlight = m2891constructorimpl(21);
    private static final int Difference = m2891constructorimpl(22);
    private static final int Exclusion = m2891constructorimpl(23);
    private static final int Multiply = m2891constructorimpl(24);
    private static final int Hue = m2891constructorimpl(25);
    private static final int Saturation = m2891constructorimpl(26);
    private static final int Color = m2891constructorimpl(27);
    private static final int Luminosity = m2891constructorimpl(28);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m2897getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m2898getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m2899getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m2900getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m2901getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m2902getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m2903getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m2904getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m2905getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m2906getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m2907getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m2908getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m2909getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m2910getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m2911getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m2912getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m2913getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m2914getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m2915getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m2916getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m2917getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m2918getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m2919getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m2920getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m2921getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m2922getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m2923getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m2924getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m2925getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ BlendMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m2890boximpl(int i8) {
        return new BlendMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2891constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2892equalsimpl(int i8, Object obj) {
        return (obj instanceof BlendMode) && i8 == ((BlendMode) obj).m2896unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2893equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2894hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2895toStringimpl(int i8) {
        if (m2893equalsimpl0(i8, Clear)) {
            return "Clear";
        }
        if (m2893equalsimpl0(i8, Src)) {
            return "Src";
        }
        if (m2893equalsimpl0(i8, Dst)) {
            return "Dst";
        }
        if (m2893equalsimpl0(i8, SrcOver)) {
            return "SrcOver";
        }
        if (m2893equalsimpl0(i8, DstOver)) {
            return "DstOver";
        }
        if (m2893equalsimpl0(i8, SrcIn)) {
            return "SrcIn";
        }
        if (m2893equalsimpl0(i8, DstIn)) {
            return "DstIn";
        }
        if (m2893equalsimpl0(i8, SrcOut)) {
            return "SrcOut";
        }
        if (m2893equalsimpl0(i8, DstOut)) {
            return "DstOut";
        }
        if (m2893equalsimpl0(i8, SrcAtop)) {
            return "SrcAtop";
        }
        if (m2893equalsimpl0(i8, DstAtop)) {
            return "DstAtop";
        }
        if (m2893equalsimpl0(i8, Xor)) {
            return "Xor";
        }
        if (m2893equalsimpl0(i8, Plus)) {
            return "Plus";
        }
        if (m2893equalsimpl0(i8, Modulate)) {
            return "Modulate";
        }
        if (m2893equalsimpl0(i8, Screen)) {
            return "Screen";
        }
        if (m2893equalsimpl0(i8, Overlay)) {
            return "Overlay";
        }
        if (m2893equalsimpl0(i8, Darken)) {
            return "Darken";
        }
        if (m2893equalsimpl0(i8, Lighten)) {
            return "Lighten";
        }
        if (m2893equalsimpl0(i8, ColorDodge)) {
            return "ColorDodge";
        }
        if (m2893equalsimpl0(i8, ColorBurn)) {
            return "ColorBurn";
        }
        if (m2893equalsimpl0(i8, Hardlight)) {
            return "HardLight";
        }
        if (m2893equalsimpl0(i8, Softlight)) {
            return "Softlight";
        }
        if (m2893equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m2893equalsimpl0(i8, Exclusion)) {
            return "Exclusion";
        }
        if (m2893equalsimpl0(i8, Multiply)) {
            return "Multiply";
        }
        if (m2893equalsimpl0(i8, Hue)) {
            return "Hue";
        }
        if (m2893equalsimpl0(i8, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m2893equalsimpl0(i8, Color)) {
            return "Color";
        }
        if (m2893equalsimpl0(i8, Luminosity)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m2892equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2894hashCodeimpl(this.value);
    }

    public String toString() {
        return m2895toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2896unboximpl() {
        return this.value;
    }
}
