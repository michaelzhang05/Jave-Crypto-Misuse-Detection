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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ExitToAppKt {
    private static ImageVector _exitToApp;

    public static final ImageVector getExitToApp(Icons.Sharp sharp) {
        AbstractC3159y.i(sharp, "<this>");
        ImageVector imageVector = _exitToApp;
        if (imageVector != null) {
            AbstractC3159y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExitToApp", Dp.m5178constructorimpl(24.0f), Dp.m5178constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw = StrokeCap.Companion.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk8 = StrokeJoin.Companion.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.09f, 15.59f);
        pathBuilder.lineTo(11.5f, 17.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(12.67f, 11.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.67f);
        pathBuilder.lineToRelative(-2.58f, 2.59f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exitToApp = build;
        AbstractC3159y.f(build);
        return build;
    }
}
