package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class KeyboardArrowRightKt {
    private static ImageVector _keyboardArrowRight;

    public static final ImageVector getKeyboardArrowRight(Icons.Sharp sharp) {
        AbstractC3255y.i(sharp, "<this>");
        ImageVector imageVector = _keyboardArrowRight;
        if (imageVector != null) {
            AbstractC3255y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.KeyboardArrowRight", Dp.m5183constructorimpl(24.0f), Dp.m5183constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3002getBlack0d7_KjU(), null);
        int m3306getButtKaPHkGw = StrokeCap.Companion.m3306getButtKaPHkGw();
        int m3316getBevelLxFBmk8 = StrokeJoin.Companion.m3316getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.59f, 16.59f);
        pathBuilder.lineTo(13.17f, 12.0f);
        pathBuilder.lineTo(8.59f, 7.41f);
        pathBuilder.lineTo(10.0f, 6.0f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.lineToRelative(-6.0f, 6.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3527addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3306getButtKaPHkGw, m3316getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardArrowRight = build;
        AbstractC3255y.f(build);
        return build;
    }
}