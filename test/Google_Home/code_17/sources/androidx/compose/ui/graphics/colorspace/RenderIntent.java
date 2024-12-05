package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m3379constructorimpl(0);
    private static final int Relative = m3379constructorimpl(1);
    private static final int Saturation = m3379constructorimpl(2);
    private static final int Absolute = m3379constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m3385getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m3386getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m3387getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m3388getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ RenderIntent(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m3378boximpl(int i8) {
        return new RenderIntent(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3379constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3380equalsimpl(int i8, Object obj) {
        return (obj instanceof RenderIntent) && i8 == ((RenderIntent) obj).m3384unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3381equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3382hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3383toStringimpl(int i8) {
        if (m3381equalsimpl0(i8, Perceptual)) {
            return "Perceptual";
        }
        if (m3381equalsimpl0(i8, Relative)) {
            return "Relative";
        }
        if (m3381equalsimpl0(i8, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m3381equalsimpl0(i8, Absolute)) {
            return "Absolute";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3380equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3382hashCodeimpl(this.value);
    }

    public String toString() {
        return m3383toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3384unboximpl() {
        return this.value;
    }
}
