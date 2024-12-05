package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes.dex */
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @DoNotInline
    /* renamed from: setBlendMode-GB0RdKg, reason: not valid java name */
    public final void m3351setBlendModeGB0RdKg(android.graphics.Paint paint, int i8) {
        paint.setBlendMode(AndroidBlendMode_androidKt.m2827toAndroidBlendModes9anfk8(i8));
    }
}
