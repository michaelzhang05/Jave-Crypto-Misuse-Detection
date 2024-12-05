package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m3185boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl */
    public static float[] m3186constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m3187constructorimpl$default(float[] fArr, int i8, AbstractC3247p abstractC3247p) {
        if ((i8 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m3186constructorimpl(fArr);
    }

    /* renamed from: equals-impl */
    public static boolean m3188equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && AbstractC3255y.d(fArr, ((Matrix) obj).m3208unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m3189equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC3255y.d(fArr, fArr2);
    }

    /* renamed from: get-impl */
    public static final float m3190getimpl(float[] fArr, int i8, int i9) {
        return fArr[(i8 * 4) + i9];
    }

    /* renamed from: hashCode-impl */
    public static int m3191hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl */
    public static final void m3192invertimpl(float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        float f17 = fArr[9];
        float f18 = fArr[10];
        float f19 = fArr[11];
        float f20 = fArr[12];
        float f21 = fArr[13];
        float f22 = fArr[14];
        float f23 = fArr[15];
        float f24 = (f8 * f13) - (f9 * f12);
        float f25 = (f8 * f14) - (f10 * f12);
        float f26 = (f8 * f15) - (f11 * f12);
        float f27 = (f9 * f14) - (f10 * f13);
        float f28 = (f9 * f15) - (f11 * f13);
        float f29 = (f10 * f15) - (f11 * f14);
        float f30 = (f16 * f21) - (f17 * f20);
        float f31 = (f16 * f22) - (f18 * f20);
        float f32 = (f16 * f23) - (f19 * f20);
        float f33 = (f17 * f22) - (f18 * f21);
        float f34 = (f17 * f23) - (f19 * f21);
        float f35 = (f18 * f23) - (f19 * f22);
        float f36 = (((((f24 * f35) - (f25 * f34)) + (f26 * f33)) + (f27 * f32)) - (f28 * f31)) + (f29 * f30);
        if (f36 == 0.0f) {
            return;
        }
        float f37 = 1.0f / f36;
        fArr[0] = (((f13 * f35) - (f14 * f34)) + (f15 * f33)) * f37;
        fArr[1] = ((((-f9) * f35) + (f10 * f34)) - (f11 * f33)) * f37;
        fArr[2] = (((f21 * f29) - (f22 * f28)) + (f23 * f27)) * f37;
        fArr[3] = ((((-f17) * f29) + (f18 * f28)) - (f19 * f27)) * f37;
        float f38 = -f12;
        fArr[4] = (((f38 * f35) + (f14 * f32)) - (f15 * f31)) * f37;
        fArr[5] = (((f35 * f8) - (f10 * f32)) + (f11 * f31)) * f37;
        float f39 = -f20;
        fArr[6] = (((f39 * f29) + (f22 * f26)) - (f23 * f25)) * f37;
        fArr[7] = (((f29 * f16) - (f18 * f26)) + (f19 * f25)) * f37;
        fArr[8] = (((f12 * f34) - (f13 * f32)) + (f15 * f30)) * f37;
        fArr[9] = ((((-f8) * f34) + (f32 * f9)) - (f11 * f30)) * f37;
        fArr[10] = (((f20 * f28) - (f21 * f26)) + (f23 * f24)) * f37;
        fArr[11] = ((((-f16) * f28) + (f26 * f17)) - (f19 * f24)) * f37;
        fArr[12] = (((f38 * f33) + (f13 * f31)) - (f14 * f30)) * f37;
        fArr[13] = (((f8 * f33) - (f9 * f31)) + (f10 * f30)) * f37;
        fArr[14] = (((f39 * f27) + (f21 * f25)) - (f22 * f24)) * f37;
        fArr[15] = (((f16 * f27) - (f17 * f25)) + (f18 * f24)) * f37;
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m3193mapMKHz9U(float[] fArr, long j8) {
        float m2740getXimpl = Offset.m2740getXimpl(j8);
        float m2741getYimpl = Offset.m2741getYimpl(j8);
        float f8 = 1 / (((fArr[3] * m2740getXimpl) + (fArr[7] * m2741getYimpl)) + fArr[15]);
        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
            f8 = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * m2740getXimpl) + (fArr[4] * m2741getYimpl) + fArr[12]) * f8, f8 * ((fArr[1] * m2740getXimpl) + (fArr[5] * m2741getYimpl) + fArr[13]));
    }

    /* renamed from: map-impl */
    public static final Rect m3194mapimpl(float[] fArr, Rect rect) {
        long m3193mapMKHz9U = m3193mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m3193mapMKHz9U2 = m3193mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m3193mapMKHz9U3 = m3193mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m3193mapMKHz9U4 = m3193mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m2740getXimpl(m3193mapMKHz9U), Offset.m2740getXimpl(m3193mapMKHz9U2)), Math.min(Offset.m2740getXimpl(m3193mapMKHz9U3), Offset.m2740getXimpl(m3193mapMKHz9U4))), Math.min(Math.min(Offset.m2741getYimpl(m3193mapMKHz9U), Offset.m2741getYimpl(m3193mapMKHz9U2)), Math.min(Offset.m2741getYimpl(m3193mapMKHz9U3), Offset.m2741getYimpl(m3193mapMKHz9U4))), Math.max(Math.max(Offset.m2740getXimpl(m3193mapMKHz9U), Offset.m2740getXimpl(m3193mapMKHz9U2)), Math.max(Offset.m2740getXimpl(m3193mapMKHz9U3), Offset.m2740getXimpl(m3193mapMKHz9U4))), Math.max(Math.max(Offset.m2741getYimpl(m3193mapMKHz9U), Offset.m2741getYimpl(m3193mapMKHz9U2)), Math.max(Offset.m2741getYimpl(m3193mapMKHz9U3), Offset.m2741getYimpl(m3193mapMKHz9U4))));
    }

    /* renamed from: reset-impl */
    public static final void m3196resetimpl(float[] fArr) {
        float f8;
        for (int i8 = 0; i8 < 4; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                if (i8 == i9) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr[(i9 * 4) + i8] = f8;
            }
        }
    }

    /* renamed from: rotateX-impl */
    public static final void m3197rotateXimpl(float[] fArr, float f8) {
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[9];
        float f14 = fArr[10];
        float f15 = fArr[13];
        float f16 = fArr[14];
        fArr[1] = (f9 * cos) - (f10 * sin);
        fArr[2] = (f9 * sin) + (f10 * cos);
        fArr[5] = (f11 * cos) - (f12 * sin);
        fArr[6] = (f11 * sin) + (f12 * cos);
        fArr[9] = (f13 * cos) - (f14 * sin);
        fArr[10] = (f13 * sin) + (f14 * cos);
        fArr[13] = (f15 * cos) - (f16 * sin);
        fArr[14] = (f15 * sin) + (f16 * cos);
    }

    /* renamed from: rotateY-impl */
    public static final void m3198rotateYimpl(float[] fArr, float f8) {
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        float f9 = fArr[0];
        float f10 = fArr[2];
        float f11 = fArr[4];
        float f12 = fArr[6];
        float f13 = fArr[8];
        float f14 = fArr[10];
        float f15 = fArr[12];
        float f16 = fArr[14];
        fArr[0] = (f9 * cos) + (f10 * sin);
        fArr[2] = ((-f9) * sin) + (f10 * cos);
        fArr[4] = (f11 * cos) + (f12 * sin);
        fArr[6] = ((-f11) * sin) + (f12 * cos);
        fArr[8] = (f13 * cos) + (f14 * sin);
        fArr[10] = ((-f13) * sin) + (f14 * cos);
        fArr[12] = (f15 * cos) + (f16 * sin);
        fArr[14] = ((-f15) * sin) + (f16 * cos);
    }

    /* renamed from: rotateZ-impl */
    public static final void m3199rotateZimpl(float[] fArr, float f8) {
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        float f9 = fArr[0];
        float f10 = fArr[4];
        float f11 = -sin;
        float f12 = fArr[1];
        float f13 = fArr[5];
        float f14 = fArr[2];
        float f15 = fArr[6];
        float f16 = fArr[3];
        float f17 = fArr[7];
        fArr[0] = (cos * f9) + (sin * f10);
        fArr[1] = (cos * f12) + (sin * f13);
        fArr[2] = (cos * f14) + (sin * f15);
        fArr[3] = (cos * f16) + (sin * f17);
        fArr[4] = (f9 * f11) + (f10 * cos);
        fArr[5] = (f12 * f11) + (f13 * cos);
        fArr[6] = (f14 * f11) + (f15 * cos);
        fArr[7] = (f11 * f16) + (cos * f17);
    }

    /* renamed from: scale-impl */
    public static final void m3200scaleimpl(float[] fArr, float f8, float f9, float f10) {
        fArr[0] = fArr[0] * f8;
        fArr[1] = fArr[1] * f8;
        fArr[2] = fArr[2] * f8;
        fArr[3] = fArr[3] * f8;
        fArr[4] = fArr[4] * f9;
        fArr[5] = fArr[5] * f9;
        fArr[6] = fArr[6] * f9;
        fArr[7] = fArr[7] * f9;
        fArr[8] = fArr[8] * f10;
        fArr[9] = fArr[9] * f10;
        fArr[10] = fArr[10] * f10;
        fArr[11] = fArr[11] * f10;
    }

    /* renamed from: scale-impl$default */
    public static /* synthetic */ void m3201scaleimpl$default(float[] fArr, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 1.0f;
        }
        m3200scaleimpl(fArr, f8, f9, f10);
    }

    /* renamed from: set-impl */
    public static final void m3202setimpl(float[] fArr, int i8, int i9, float f8) {
        fArr[(i8 * 4) + i9] = f8;
    }

    /* renamed from: setFrom-58bKbWc */
    public static final void m3203setFrom58bKbWc(float[] fArr, float[] fArr2) {
        for (int i8 = 0; i8 < 16; i8++) {
            fArr[i8] = fArr2[i8];
        }
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m3204timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        float m3210dotp89u6pk;
        float m3210dotp89u6pk2;
        float m3210dotp89u6pk3;
        float m3210dotp89u6pk4;
        float m3210dotp89u6pk5;
        float m3210dotp89u6pk6;
        float m3210dotp89u6pk7;
        float m3210dotp89u6pk8;
        float m3210dotp89u6pk9;
        float m3210dotp89u6pk10;
        float m3210dotp89u6pk11;
        float m3210dotp89u6pk12;
        float m3210dotp89u6pk13;
        float m3210dotp89u6pk14;
        float m3210dotp89u6pk15;
        float m3210dotp89u6pk16;
        m3210dotp89u6pk = MatrixKt.m3210dotp89u6pk(fArr, 0, fArr2, 0);
        m3210dotp89u6pk2 = MatrixKt.m3210dotp89u6pk(fArr, 0, fArr2, 1);
        m3210dotp89u6pk3 = MatrixKt.m3210dotp89u6pk(fArr, 0, fArr2, 2);
        m3210dotp89u6pk4 = MatrixKt.m3210dotp89u6pk(fArr, 0, fArr2, 3);
        m3210dotp89u6pk5 = MatrixKt.m3210dotp89u6pk(fArr, 1, fArr2, 0);
        m3210dotp89u6pk6 = MatrixKt.m3210dotp89u6pk(fArr, 1, fArr2, 1);
        m3210dotp89u6pk7 = MatrixKt.m3210dotp89u6pk(fArr, 1, fArr2, 2);
        m3210dotp89u6pk8 = MatrixKt.m3210dotp89u6pk(fArr, 1, fArr2, 3);
        m3210dotp89u6pk9 = MatrixKt.m3210dotp89u6pk(fArr, 2, fArr2, 0);
        m3210dotp89u6pk10 = MatrixKt.m3210dotp89u6pk(fArr, 2, fArr2, 1);
        m3210dotp89u6pk11 = MatrixKt.m3210dotp89u6pk(fArr, 2, fArr2, 2);
        m3210dotp89u6pk12 = MatrixKt.m3210dotp89u6pk(fArr, 2, fArr2, 3);
        m3210dotp89u6pk13 = MatrixKt.m3210dotp89u6pk(fArr, 3, fArr2, 0);
        m3210dotp89u6pk14 = MatrixKt.m3210dotp89u6pk(fArr, 3, fArr2, 1);
        m3210dotp89u6pk15 = MatrixKt.m3210dotp89u6pk(fArr, 3, fArr2, 2);
        m3210dotp89u6pk16 = MatrixKt.m3210dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = m3210dotp89u6pk;
        fArr[1] = m3210dotp89u6pk2;
        fArr[2] = m3210dotp89u6pk3;
        fArr[3] = m3210dotp89u6pk4;
        fArr[4] = m3210dotp89u6pk5;
        fArr[5] = m3210dotp89u6pk6;
        fArr[6] = m3210dotp89u6pk7;
        fArr[7] = m3210dotp89u6pk8;
        fArr[8] = m3210dotp89u6pk9;
        fArr[9] = m3210dotp89u6pk10;
        fArr[10] = m3210dotp89u6pk11;
        fArr[11] = m3210dotp89u6pk12;
        fArr[12] = m3210dotp89u6pk13;
        fArr[13] = m3210dotp89u6pk14;
        fArr[14] = m3210dotp89u6pk15;
        fArr[15] = m3210dotp89u6pk16;
    }

    /* renamed from: toString-impl */
    public static String m3205toStringimpl(float[] fArr) {
        return j6.n.e("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl */
    public static final void m3206translateimpl(float[] fArr, float f8, float f9, float f10) {
        float f11 = (fArr[0] * f8) + (fArr[4] * f9) + (fArr[8] * f10) + fArr[12];
        float f12 = (fArr[1] * f8) + (fArr[5] * f9) + (fArr[9] * f10) + fArr[13];
        float f13 = (fArr[2] * f8) + (fArr[6] * f9) + (fArr[10] * f10) + fArr[14];
        float f14 = (fArr[3] * f8) + (fArr[7] * f9) + (fArr[11] * f10) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m3207translateimpl$default(float[] fArr, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        m3206translateimpl(fArr, f8, f9, f10);
    }

    public boolean equals(Object obj) {
        return m3188equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3191hashCodeimpl(this.values);
    }

    public String toString() {
        return m3205toStringimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m3208unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl */
    public static final void m3195mapimpl(float[] fArr, MutableRect mutableRect) {
        long m3193mapMKHz9U = m3193mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long m3193mapMKHz9U2 = m3193mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long m3193mapMKHz9U3 = m3193mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long m3193mapMKHz9U4 = m3193mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m2740getXimpl(m3193mapMKHz9U), Offset.m2740getXimpl(m3193mapMKHz9U2)), Math.min(Offset.m2740getXimpl(m3193mapMKHz9U3), Offset.m2740getXimpl(m3193mapMKHz9U4))));
        mutableRect.setTop(Math.min(Math.min(Offset.m2741getYimpl(m3193mapMKHz9U), Offset.m2741getYimpl(m3193mapMKHz9U2)), Math.min(Offset.m2741getYimpl(m3193mapMKHz9U3), Offset.m2741getYimpl(m3193mapMKHz9U4))));
        mutableRect.setRight(Math.max(Math.max(Offset.m2740getXimpl(m3193mapMKHz9U), Offset.m2740getXimpl(m3193mapMKHz9U2)), Math.max(Offset.m2740getXimpl(m3193mapMKHz9U3), Offset.m2740getXimpl(m3193mapMKHz9U4))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m2741getYimpl(m3193mapMKHz9U), Offset.m2741getYimpl(m3193mapMKHz9U2)), Math.max(Offset.m2741getYimpl(m3193mapMKHz9U3), Offset.m2741getYimpl(m3193mapMKHz9U4))));
    }
}
