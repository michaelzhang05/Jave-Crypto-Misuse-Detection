package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class LineBreak {
    public static final Companion Companion = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5008getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5009getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5010getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5011getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m5012getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m5013getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m5014getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m5015getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m5017constructorimpl(1);
        private static final int HighQuality = m5017constructorimpl(2);
        private static final int Balanced = m5017constructorimpl(3);
        private static final int Unspecified = m5017constructorimpl(0);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m5023getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m5024getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m5025getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m5026getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private /* synthetic */ Strategy(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m5016boximpl(int i8) {
            return new Strategy(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5017constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5018equalsimpl(int i8, Object obj) {
            return (obj instanceof Strategy) && i8 == ((Strategy) obj).m5022unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5019equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5020hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5021toStringimpl(int i8) {
            if (m5019equalsimpl0(i8, Simple)) {
                return "Strategy.Simple";
            }
            if (m5019equalsimpl0(i8, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m5019equalsimpl0(i8, Balanced)) {
                return "Strategy.Balanced";
            }
            if (m5019equalsimpl0(i8, Unspecified)) {
                return "Strategy.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5018equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5020hashCodeimpl(this.value);
        }

        public String toString() {
            return m5021toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5022unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5028constructorimpl(1);
        private static final int Loose = m5028constructorimpl(2);
        private static final int Normal = m5028constructorimpl(3);
        private static final int Strict = m5028constructorimpl(4);
        private static final int Unspecified = m5028constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m5034getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m5035getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m5036getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m5037getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m5038getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private /* synthetic */ Strictness(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m5027boximpl(int i8) {
            return new Strictness(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5028constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5029equalsimpl(int i8, Object obj) {
            return (obj instanceof Strictness) && i8 == ((Strictness) obj).m5033unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5030equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5031hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5032toStringimpl(int i8) {
            if (m5030equalsimpl0(i8, Default)) {
                return "Strictness.None";
            }
            if (m5030equalsimpl0(i8, Loose)) {
                return "Strictness.Loose";
            }
            if (m5030equalsimpl0(i8, Normal)) {
                return "Strictness.Normal";
            }
            if (m5030equalsimpl0(i8, Strict)) {
                return "Strictness.Strict";
            }
            if (m5030equalsimpl0(i8, Unspecified)) {
                return "Strictness.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5029equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5031hashCodeimpl(this.value);
        }

        public String toString() {
            return m5032toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5033unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5040constructorimpl(1);
        private static final int Phrase = m5040constructorimpl(2);
        private static final int Unspecified = m5040constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m5046getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m5047getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m5048getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private /* synthetic */ WordBreak(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m5039boximpl(int i8) {
            return new WordBreak(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5040constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5041equalsimpl(int i8, Object obj) {
            return (obj instanceof WordBreak) && i8 == ((WordBreak) obj).m5045unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5042equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5043hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5044toStringimpl(int i8) {
            if (m5042equalsimpl0(i8, Default)) {
                return "WordBreak.None";
            }
            if (m5042equalsimpl0(i8, Phrase)) {
                return "WordBreak.Phrase";
            }
            if (m5042equalsimpl0(i8, Unspecified)) {
                return "WordBreak.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5041equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5043hashCodeimpl(this.value);
        }

        public String toString() {
            return m5044toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5045unboximpl() {
            return this.value;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m5025getSimplefcGXIks = companion.m5025getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m5036getNormalusljTpc = companion2.m5036getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m5025getSimplefcGXIks, m5036getNormalusljTpc, companion3.m5046getDefaultjp8hJ3c());
        Simple = m4996constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m5023getBalancedfcGXIks(), companion2.m5035getLooseusljTpc(), companion3.m5047getPhrasejp8hJ3c());
        Heading = m4996constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m5024getHighQualityfcGXIks(), companion2.m5037getStrictusljTpc(), companion3.m5046getDefaultjp8hJ3c());
        Paragraph = m4996constructorimpl(packBytes3);
        Unspecified = m4996constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m4995boximpl(int i8) {
        return new LineBreak(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4996constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m4998copygijOMQM(int i8, int i9, int i10, int i11) {
        return m4997constructorimpl(i9, i10, i11);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m4999copygijOMQM$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i9 = m5002getStrategyfcGXIks(i8);
        }
        if ((i12 & 2) != 0) {
            i10 = m5003getStrictnessusljTpc(i8);
        }
        if ((i12 & 4) != 0) {
            i11 = m5004getWordBreakjp8hJ3c(i8);
        }
        return m4998copygijOMQM(i8, i9, i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5000equalsimpl(int i8, Object obj) {
        return (obj instanceof LineBreak) && i8 == ((LineBreak) obj).m5007unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5001equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m5002getStrategyfcGXIks(int i8) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i8);
        return Strategy.m5017constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m5003getStrictnessusljTpc(int i8) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i8);
        return Strictness.m5028constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m5004getWordBreakjp8hJ3c(int i8) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i8);
        return WordBreak.m5040constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5005hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5006toStringimpl(int i8) {
        return "LineBreak(strategy=" + ((Object) Strategy.m5021toStringimpl(m5002getStrategyfcGXIks(i8))) + ", strictness=" + ((Object) Strictness.m5032toStringimpl(m5003getStrictnessusljTpc(i8))) + ", wordBreak=" + ((Object) WordBreak.m5044toStringimpl(m5004getWordBreakjp8hJ3c(i8))) + ')';
    }

    public boolean equals(Object obj) {
        return m5000equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m5005hashCodeimpl(this.mask);
    }

    public String toString() {
        return m5006toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5007unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4997constructorimpl(int i8, int i9, int i10) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i8, i9, i10);
        return m4996constructorimpl(packBytes);
    }
}
