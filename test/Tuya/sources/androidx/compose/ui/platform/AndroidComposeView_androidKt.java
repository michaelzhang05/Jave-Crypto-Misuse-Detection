package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static Function1 platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    public static final /* synthetic */ LayoutDirection access$layoutDirectionFromInt(int i8) {
        return layoutDirectionFromInt(i8);
    }

    /* renamed from: access$preTranslate-cG2Xzmc */
    public static final /* synthetic */ void m4437access$preTranslatecG2Xzmc(float[] fArr, float f8, float f9, float[] fArr2) {
        m4440preTranslatecG2Xzmc(fArr, f8, f9, fArr2);
    }

    /* renamed from: dot-p89u6pk */
    private static final float m4438dotp89u6pk(float[] fArr, int i8, float[] fArr2, int i9) {
        int i10 = i8 * 4;
        return (fArr[i10] * fArr2[i9]) + (fArr[i10 + 1] * fArr2[4 + i9]) + (fArr[i10 + 2] * fArr2[8 + i9]) + (fArr[i10 + 3] * fArr2[12 + i9]);
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration) {
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    public static final Function1 getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final LayoutDirection layoutDirectionFromInt(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                return LayoutDirection.Ltr;
            }
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* renamed from: preTransform-JiSxe2E */
    public static final void m4439preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m4438dotp89u6pk = m4438dotp89u6pk(fArr2, 0, fArr, 0);
        float m4438dotp89u6pk2 = m4438dotp89u6pk(fArr2, 0, fArr, 1);
        float m4438dotp89u6pk3 = m4438dotp89u6pk(fArr2, 0, fArr, 2);
        float m4438dotp89u6pk4 = m4438dotp89u6pk(fArr2, 0, fArr, 3);
        float m4438dotp89u6pk5 = m4438dotp89u6pk(fArr2, 1, fArr, 0);
        float m4438dotp89u6pk6 = m4438dotp89u6pk(fArr2, 1, fArr, 1);
        float m4438dotp89u6pk7 = m4438dotp89u6pk(fArr2, 1, fArr, 2);
        float m4438dotp89u6pk8 = m4438dotp89u6pk(fArr2, 1, fArr, 3);
        float m4438dotp89u6pk9 = m4438dotp89u6pk(fArr2, 2, fArr, 0);
        float m4438dotp89u6pk10 = m4438dotp89u6pk(fArr2, 2, fArr, 1);
        float m4438dotp89u6pk11 = m4438dotp89u6pk(fArr2, 2, fArr, 2);
        float m4438dotp89u6pk12 = m4438dotp89u6pk(fArr2, 2, fArr, 3);
        float m4438dotp89u6pk13 = m4438dotp89u6pk(fArr2, 3, fArr, 0);
        float m4438dotp89u6pk14 = m4438dotp89u6pk(fArr2, 3, fArr, 1);
        float m4438dotp89u6pk15 = m4438dotp89u6pk(fArr2, 3, fArr, 2);
        float m4438dotp89u6pk16 = m4438dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m4438dotp89u6pk;
        fArr[1] = m4438dotp89u6pk2;
        fArr[2] = m4438dotp89u6pk3;
        fArr[3] = m4438dotp89u6pk4;
        fArr[4] = m4438dotp89u6pk5;
        fArr[5] = m4438dotp89u6pk6;
        fArr[6] = m4438dotp89u6pk7;
        fArr[7] = m4438dotp89u6pk8;
        fArr[8] = m4438dotp89u6pk9;
        fArr[9] = m4438dotp89u6pk10;
        fArr[10] = m4438dotp89u6pk11;
        fArr[11] = m4438dotp89u6pk12;
        fArr[12] = m4438dotp89u6pk13;
        fArr[13] = m4438dotp89u6pk14;
        fArr[14] = m4438dotp89u6pk15;
        fArr[15] = m4438dotp89u6pk16;
    }

    /* renamed from: preTranslate-cG2Xzmc */
    public static final void m4440preTranslatecG2Xzmc(float[] fArr, float f8, float f9, float[] fArr2) {
        Matrix.m3191resetimpl(fArr2);
        Matrix.m3202translateimpl$default(fArr2, f8, f9, 0.0f, 4, null);
        m4439preTransformJiSxe2E(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(Function1 function1) {
        platformTextInputServiceInterceptor = function1;
    }
}
