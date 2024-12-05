package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m3285constructorimpl(0);
    private static final int Rotate = m3285constructorimpl(1);
    private static final int Morph = m3285constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m3291getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m3292getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m3293getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m3284boximpl(int i8) {
        return new StampedPathEffectStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3285constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3286equalsimpl(int i8, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i8 == ((StampedPathEffectStyle) obj).m3290unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3287equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3288hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3289toStringimpl(int i8) {
        if (m3287equalsimpl0(i8, Translate)) {
            return "Translate";
        }
        if (m3287equalsimpl0(i8, Rotate)) {
            return "Rotate";
        }
        if (m3287equalsimpl0(i8, Morph)) {
            return "Morph";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3286equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3288hashCodeimpl(this.value);
    }

    public String toString() {
        return m3289toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3290unboximpl() {
        return this.value;
    }
}
