package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;

@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawTransform {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3495getCenterF1C5BW0(DrawTransform drawTransform) {
            long a8;
            a8 = d.a(drawTransform);
            return a8;
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo3422clipPathmtrdDE(Path path, int i8);

    /* renamed from: clipRect-N_I0leg */
    void mo3423clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8);

    /* renamed from: getCenter-F1C5BW0 */
    long mo3424getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo3425getSizeNHjbRc();

    void inset(float f8, float f9, float f10, float f11);

    /* renamed from: rotate-Uv8p0NA */
    void mo3426rotateUv8p0NA(float f8, long j8);

    /* renamed from: scale-0AR0LA0 */
    void mo3427scale0AR0LA0(float f8, float f9, long j8);

    /* renamed from: transform-58bKbWc */
    void mo3428transform58bKbWc(float[] fArr);

    void translate(float f8, float f9);
}
