package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

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
        public static /* synthetic */ void m5013getHeadingrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5014getParagraphrAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5015getSimplerAG3T2k$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m5016getUnspecifiedrAG3T2k$annotations() {
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m5017getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m5018getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m5019getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m5020getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class Strategy {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Simple = m5022constructorimpl(1);
        private static final int HighQuality = m5022constructorimpl(2);
        private static final int Balanced = m5022constructorimpl(3);
        private static final int Unspecified = m5022constructorimpl(0);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m5028getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m5029getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m5030getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m5031getUnspecifiedfcGXIks() {
                return Strategy.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private /* synthetic */ Strategy(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m5021boximpl(int i8) {
            return new Strategy(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5022constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5023equalsimpl(int i8, Object obj) {
            return (obj instanceof Strategy) && i8 == ((Strategy) obj).m5027unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5024equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5025hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5026toStringimpl(int i8) {
            if (m5024equalsimpl0(i8, Simple)) {
                return "Strategy.Simple";
            }
            if (m5024equalsimpl0(i8, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m5024equalsimpl0(i8, Balanced)) {
                return "Strategy.Balanced";
            }
            if (m5024equalsimpl0(i8, Unspecified)) {
                return "Strategy.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5023equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5025hashCodeimpl(this.value);
        }

        public String toString() {
            return m5026toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5027unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class Strictness {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5033constructorimpl(1);
        private static final int Loose = m5033constructorimpl(2);
        private static final int Normal = m5033constructorimpl(3);
        private static final int Strict = m5033constructorimpl(4);
        private static final int Unspecified = m5033constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m5039getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m5040getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m5041getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m5042getStrictusljTpc() {
                return Strictness.Strict;
            }

            /* renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m5043getUnspecifiedusljTpc() {
                return Strictness.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private /* synthetic */ Strictness(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m5032boximpl(int i8) {
            return new Strictness(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5033constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5034equalsimpl(int i8, Object obj) {
            return (obj instanceof Strictness) && i8 == ((Strictness) obj).m5038unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5035equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5036hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5037toStringimpl(int i8) {
            if (m5035equalsimpl0(i8, Default)) {
                return "Strictness.None";
            }
            if (m5035equalsimpl0(i8, Loose)) {
                return "Strictness.Loose";
            }
            if (m5035equalsimpl0(i8, Normal)) {
                return "Strictness.Normal";
            }
            if (m5035equalsimpl0(i8, Strict)) {
                return "Strictness.Strict";
            }
            if (m5035equalsimpl0(i8, Unspecified)) {
                return "Strictness.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5034equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5036hashCodeimpl(this.value);
        }

        public String toString() {
            return m5037toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5038unboximpl() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public static final class WordBreak {
        public static final Companion Companion = new Companion(null);
        private static final int Default = m5045constructorimpl(1);
        private static final int Phrase = m5045constructorimpl(2);
        private static final int Unspecified = m5045constructorimpl(0);
        private final int value;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m5051getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m5052getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }

            /* renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m5053getUnspecifiedjp8hJ3c() {
                return WordBreak.Unspecified;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        private /* synthetic */ WordBreak(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m5044boximpl(int i8) {
            return new WordBreak(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m5045constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5046equalsimpl(int i8, Object obj) {
            return (obj instanceof WordBreak) && i8 == ((WordBreak) obj).m5050unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5047equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5048hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5049toStringimpl(int i8) {
            if (m5047equalsimpl0(i8, Default)) {
                return "WordBreak.None";
            }
            if (m5047equalsimpl0(i8, Phrase)) {
                return "WordBreak.Phrase";
            }
            if (m5047equalsimpl0(i8, Unspecified)) {
                return "WordBreak.Unspecified";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5046equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5048hashCodeimpl(this.value);
        }

        public String toString() {
            return m5049toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5050unboximpl() {
            return this.value;
        }
    }

    static {
        int packBytes;
        int packBytes2;
        int packBytes3;
        Strategy.Companion companion = Strategy.Companion;
        int m5030getSimplefcGXIks = companion.m5030getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int m5041getNormalusljTpc = companion2.m5041getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        packBytes = LineBreak_androidKt.packBytes(m5030getSimplefcGXIks, m5041getNormalusljTpc, companion3.m5051getDefaultjp8hJ3c());
        Simple = m5001constructorimpl(packBytes);
        packBytes2 = LineBreak_androidKt.packBytes(companion.m5028getBalancedfcGXIks(), companion2.m5040getLooseusljTpc(), companion3.m5052getPhrasejp8hJ3c());
        Heading = m5001constructorimpl(packBytes2);
        packBytes3 = LineBreak_androidKt.packBytes(companion.m5029getHighQualityfcGXIks(), companion2.m5042getStrictusljTpc(), companion3.m5051getDefaultjp8hJ3c());
        Paragraph = m5001constructorimpl(packBytes3);
        Unspecified = m5001constructorimpl(0);
    }

    private /* synthetic */ LineBreak(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m5000boximpl(int i8) {
        return new LineBreak(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5001constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m5003copygijOMQM(int i8, int i9, int i10, int i11) {
        return m5002constructorimpl(i9, i10, i11);
    }

    /* renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m5004copygijOMQM$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i9 = m5007getStrategyfcGXIks(i8);
        }
        if ((i12 & 2) != 0) {
            i10 = m5008getStrictnessusljTpc(i8);
        }
        if ((i12 & 4) != 0) {
            i11 = m5009getWordBreakjp8hJ3c(i8);
        }
        return m5003copygijOMQM(i8, i9, i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5005equalsimpl(int i8, Object obj) {
        return (obj instanceof LineBreak) && i8 == ((LineBreak) obj).m5012unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5006equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m5007getStrategyfcGXIks(int i8) {
        int unpackByte1;
        unpackByte1 = LineBreak_androidKt.unpackByte1(i8);
        return Strategy.m5022constructorimpl(unpackByte1);
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m5008getStrictnessusljTpc(int i8) {
        int unpackByte2;
        unpackByte2 = LineBreak_androidKt.unpackByte2(i8);
        return Strictness.m5033constructorimpl(unpackByte2);
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m5009getWordBreakjp8hJ3c(int i8) {
        int unpackByte3;
        unpackByte3 = LineBreak_androidKt.unpackByte3(i8);
        return WordBreak.m5045constructorimpl(unpackByte3);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5010hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5011toStringimpl(int i8) {
        return "LineBreak(strategy=" + ((Object) Strategy.m5026toStringimpl(m5007getStrategyfcGXIks(i8))) + ", strictness=" + ((Object) Strictness.m5037toStringimpl(m5008getStrictnessusljTpc(i8))) + ", wordBreak=" + ((Object) WordBreak.m5049toStringimpl(m5009getWordBreakjp8hJ3c(i8))) + ')';
    }

    public boolean equals(Object obj) {
        return m5005equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m5010hashCodeimpl(this.mask);
    }

    public String toString() {
        return m5011toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5012unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5002constructorimpl(int i8, int i9, int i10) {
        int packBytes;
        packBytes = LineBreak_androidKt.packBytes(i8, i9, i10);
        return m5001constructorimpl(packBytes);
    }
}
