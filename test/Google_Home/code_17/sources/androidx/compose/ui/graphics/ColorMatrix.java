package androidx.compose.ui.graphics;

import P5.AbstractC1371l;
import a6.InterfaceC1668n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class ColorMatrix {
    private final float[] values;

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m3031boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m3032constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m3033constructorimpl$default(float[] fArr, int i8, AbstractC3247p abstractC3247p) {
        if ((i8 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m3032constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m3034convertRgbToYuvimpl(float[] fArr) {
        m3041resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m3035convertYuvToRgbimpl(float[] fArr) {
        m3041resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m3036dotMe4OoYI(float[] fArr, float[] fArr2, int i8, float[] fArr3, int i9) {
        int i10 = i8 * 5;
        return (fArr2[i10] * fArr3[i9]) + (fArr2[i10 + 1] * fArr3[5 + i9]) + (fArr2[i10 + 2] * fArr3[10 + i9]) + (fArr2[i10 + 3] * fArr3[15 + i9]);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3037equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && AbstractC3255y.d(fArr, ((ColorMatrix) obj).m3052unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3038equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC3255y.d(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m3039getimpl(float[] fArr, int i8, int i9) {
        return fArr[(i8 * 5) + i9];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3040hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m3041resetimpl(float[] fArr) {
        AbstractC1371l.u(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m3042rotateInternalimpl(float[] fArr, float f8, InterfaceC1668n interfaceC1668n) {
        m3041resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        interfaceC1668n.invoke(Float.valueOf((float) Math.cos(d8)), Float.valueOf((float) Math.sin(d8)));
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m3043setimpl(float[] fArr, int i8, int i9, float f8) {
        fArr[(i8 * 5) + i9] = f8;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m3044setjHGOpc(float[] fArr, float[] fArr2) {
        AbstractC1371l.k(fArr2, fArr, 0, 0, 0, 14, null);
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m3045setToRotateBlueimpl(float[] fArr, float f8) {
        m3041resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m3046setToRotateGreenimpl(float[] fArr, float f8) {
        m3041resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m3047setToRotateRedimpl(float[] fArr, float f8) {
        m3041resetimpl(fArr);
        double d8 = (f8 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m3048setToSaturationimpl(float[] fArr, float f8) {
        m3041resetimpl(fArr);
        float f9 = 1 - f8;
        float f10 = 0.213f * f9;
        float f11 = 0.715f * f9;
        float f12 = f9 * 0.072f;
        fArr[0] = f10 + f8;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[5] = f10;
        fArr[6] = f11 + f8;
        fArr[7] = f12;
        fArr[10] = f10;
        fArr[11] = f11;
        fArr[12] = f12 + f8;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m3049setToScaleimpl(float[] fArr, float f8, float f9, float f10, float f11) {
        m3041resetimpl(fArr);
        fArr[0] = f8;
        fArr[6] = f9;
        fArr[12] = f10;
        fArr[18] = f11;
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m3050timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        float m3036dotMe4OoYI = m3036dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float m3036dotMe4OoYI2 = m3036dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float m3036dotMe4OoYI3 = m3036dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float m3036dotMe4OoYI4 = m3036dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f8 = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float m3036dotMe4OoYI5 = m3036dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float m3036dotMe4OoYI6 = m3036dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float m3036dotMe4OoYI7 = m3036dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float m3036dotMe4OoYI8 = m3036dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f9 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float m3036dotMe4OoYI9 = m3036dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float m3036dotMe4OoYI10 = m3036dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float m3036dotMe4OoYI11 = m3036dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float m3036dotMe4OoYI12 = m3036dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f10 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float m3036dotMe4OoYI13 = m3036dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float m3036dotMe4OoYI14 = m3036dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float m3036dotMe4OoYI15 = m3036dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float m3036dotMe4OoYI16 = m3036dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f11 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = m3036dotMe4OoYI;
        fArr[1] = m3036dotMe4OoYI2;
        fArr[2] = m3036dotMe4OoYI3;
        fArr[3] = m3036dotMe4OoYI4;
        fArr[4] = f8;
        fArr[5] = m3036dotMe4OoYI5;
        fArr[6] = m3036dotMe4OoYI6;
        fArr[7] = m3036dotMe4OoYI7;
        fArr[8] = m3036dotMe4OoYI8;
        fArr[9] = f9;
        fArr[10] = m3036dotMe4OoYI9;
        fArr[11] = m3036dotMe4OoYI10;
        fArr[12] = m3036dotMe4OoYI11;
        fArr[13] = m3036dotMe4OoYI12;
        fArr[14] = f10;
        fArr[15] = m3036dotMe4OoYI13;
        fArr[16] = m3036dotMe4OoYI14;
        fArr[17] = m3036dotMe4OoYI15;
        fArr[18] = m3036dotMe4OoYI16;
        fArr[19] = f11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3051toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m3037equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3040hashCodeimpl(this.values);
    }

    public String toString() {
        return m3051toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m3052unboximpl() {
        return this.values;
    }
}
