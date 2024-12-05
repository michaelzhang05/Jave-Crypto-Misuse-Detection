package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m4513constructorimpl(0);
    private static final int Assertive = m4513constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m4519getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m4520getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ LiveRegionMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m4512boximpl(int i8) {
        return new LiveRegionMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4513constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4514equalsimpl(int i8, Object obj) {
        return (obj instanceof LiveRegionMode) && i8 == ((LiveRegionMode) obj).m4518unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4515equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4516hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4517toStringimpl(int i8) {
        if (m4515equalsimpl0(i8, Polite)) {
            return "Polite";
        }
        if (m4515equalsimpl0(i8, Assertive)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m4514equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4516hashCodeimpl(this.value);
    }

    public String toString() {
        return m4517toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4518unboximpl() {
        return this.value;
    }
}
