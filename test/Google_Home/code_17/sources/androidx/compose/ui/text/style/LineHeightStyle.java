package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3247p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int trim;

    /* loaded from: classes.dex */
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m5057constructorimpl(0.0f);
        private static final float Center = m5057constructorimpl(0.5f);
        private static final float Proportional = m5057constructorimpl(-1.0f);
        private static final float Bottom = m5057constructorimpl(1.0f);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m5063getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m5064getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m5065getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m5066getTopPIaL0Z0() {
                return Alignment.Top;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private /* synthetic */ Alignment(float f8) {
            this.topRatio = f8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m5056boximpl(float f8) {
            return new Alignment(f8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m5057constructorimpl(float f8) {
            if ((0.0f <= f8 && f8 <= 1.0f) || f8 == -1.0f) {
                return f8;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5058equalsimpl(float f8, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f8, ((Alignment) obj).m5062unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5059equalsimpl0(float f8, float f9) {
            return Float.compare(f8, f9) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5060hashCodeimpl(float f8) {
            return Float.floatToIntBits(f8);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5061toStringimpl(float f8) {
            if (f8 == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f8 == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f8 == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f8 == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f8 + ')';
        }

        public boolean equals(Object obj) {
            return m5058equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m5060hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m5061toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m5062unboximpl() {
            return this.topRatio;
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m5068constructorimpl(1);
        private static final int LastLineBottom = m5068constructorimpl(16);
        private static final int Both = m5068constructorimpl(17);
        private static final int None = m5068constructorimpl(0);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m5076getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m5077getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m5078getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m5079getNoneEVpEnUU() {
                return Trim.None;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private /* synthetic */ Trim(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m5067boximpl(int i8) {
            return new Trim(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5068constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5069equalsimpl(int i8, Object obj) {
            return (obj instanceof Trim) && i8 == ((Trim) obj).m5075unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5070equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5071hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
        public static final boolean m5072isTrimFirstLineTopimpl$ui_text_release(int i8) {
            return (i8 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
        public static final boolean m5073isTrimLastLineBottomimpl$ui_text_release(int i8) {
            return (i8 & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5074toStringimpl(int i8) {
            if (i8 == FirstLineTop) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i8 == LastLineBottom) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i8 == Both) {
                return "LineHeightStyle.Trim.Both";
            }
            if (i8 == None) {
                return "LineHeightStyle.Trim.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5069equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5071hashCodeimpl(this.value);
        }

        public String toString() {
            return m5074toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5075unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC3247p abstractC3247p = null;
        Companion = new Companion(abstractC3247p);
        Default = new LineHeightStyle(Alignment.Companion.m5065getProportionalPIaL0Z0(), Trim.Companion.m5076getBothEVpEnUU(), abstractC3247p);
    }

    public /* synthetic */ LineHeightStyle(float f8, int i8, AbstractC3247p abstractC3247p) {
        this(f8, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        if (Alignment.m5059equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m5070equalsimpl0(this.trim, lineHeightStyle.trim)) {
            return true;
        }
        return false;
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m5054getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m5055getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (Alignment.m5060hashCodeimpl(this.alignment) * 31) + Trim.m5071hashCodeimpl(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m5061toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m5074toStringimpl(this.trim)) + ')';
    }

    private LineHeightStyle(float f8, int i8) {
        this.alignment = f8;
        this.trim = i8;
    }
}
