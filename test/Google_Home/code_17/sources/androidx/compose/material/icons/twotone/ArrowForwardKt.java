package androidx.compose.material.icons.twotone;

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
public final class ArrowForwardKt {
    private static ImageVector _arrowForward;

    public static final ImageVector getArrowForward(Icons.TwoTone twoTone) {
        AbstractC3255y.i(twoTone, "<this>");
        ImageVector imageVector = _arrowForward;
        if (imageVector != null) {
            AbstractC3255y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ArrowForward", Dp.m5183constructorimpl(24.0f), Dp.m5183constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3002getBlack0d7_KjU(), null);
        int m3306getButtKaPHkGw = StrokeCap.Companion.m3306getButtKaPHkGw();
        int m3316getBevelLxFBmk8 = StrokeJoin.Companion.m3316getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(16.17f, 11.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(12.17f);
        pathBuilder.lineToRelative(-5.58f, 5.59f);
        pathBuilder.lineTo(12.0f, 20.0f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3527addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3306getButtKaPHkGw, m3316getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowForward = build;
        AbstractC3255y.f(build);
        return build;
    }
}