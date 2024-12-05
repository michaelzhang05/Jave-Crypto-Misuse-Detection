package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class EmojiSupportMatch {
    public static final Companion Companion = new Companion(null);
    private static final int Default = m4565constructorimpl(0);
    private static final int None = m4565constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m4571getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m4572getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ EmojiSupportMatch(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m4564boximpl(int i8) {
        return new EmojiSupportMatch(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4565constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4566equalsimpl(int i8, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i8 == ((EmojiSupportMatch) obj).m4570unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4567equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4568hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4569toStringimpl(int i8) {
        if (i8 == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i8 == None) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4566equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4568hashCodeimpl(this.value);
    }

    public String toString() {
        return m4569toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4570unboximpl() {
        return this.value;
    }
}
