package androidx.compose.material.icons.filled;

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
public final class SettingsKt {
    private static ImageVector _settings;

    public static final ImageVector getSettings(Icons.Filled filled) {
        AbstractC3255y.i(filled, "<this>");
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            AbstractC3255y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Settings", Dp.m5183constructorimpl(24.0f), Dp.m5183constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3002getBlack0d7_KjU(), null);
        int m3306getButtKaPHkGw = StrokeCap.Companion.m3306getButtKaPHkGw();
        int m3316getBevelLxFBmk8 = StrokeJoin.Companion.m3316getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.14f, 12.94f);
        pathBuilder.curveToRelative(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        pathBuilder.curveToRelative(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        pathBuilder.lineToRelative(2.03f, -1.58f);
        pathBuilder.curveToRelative(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        pathBuilder.lineToRelative(-1.92f, -3.32f);
        pathBuilder.curveToRelative(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        pathBuilder.lineToRelative(-2.39f, 0.96f);
        pathBuilder.curveToRelative(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        pathBuilder.lineTo(14.4f, 2.81f);
        pathBuilder.curveToRelative(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        pathBuilder.horizontalLineToRelative(-3.84f);
        pathBuilder.curveToRelative(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        pathBuilder.lineTo(9.25f, 5.35f);
        pathBuilder.curveTo(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        pathBuilder.lineTo(5.24f, 5.33f);
        pathBuilder.curveToRelative(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        pathBuilder.lineTo(2.74f, 8.87f);
        pathBuilder.curveTo(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        pathBuilder.lineToRelative(2.03f, 1.58f);
        pathBuilder.curveTo(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.02f, 0.64f, 0.07f, 0.94f);
        pathBuilder.lineToRelative(-2.03f, 1.58f);
        pathBuilder.curveToRelative(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        pathBuilder.lineToRelative(1.92f, 3.32f);
        pathBuilder.curveToRelative(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        pathBuilder.lineToRelative(2.39f, -0.96f);
        pathBuilder.curveToRelative(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        pathBuilder.lineToRelative(0.36f, 2.54f);
        pathBuilder.curveToRelative(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        pathBuilder.horizontalLineToRelative(3.84f);
        pathBuilder.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        pathBuilder.lineToRelative(0.36f, -2.54f);
        pathBuilder.curveToRelative(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        pathBuilder.lineToRelative(2.39f, 0.96f);
        pathBuilder.curveToRelative(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        pathBuilder.lineToRelative(1.92f, -3.32f);
        pathBuilder.curveToRelative(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        pathBuilder.lineTo(19.14f, 12.94f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.6f);
        pathBuilder.curveToRelative(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        pathBuilder.reflectiveCurveToRelative(1.62f, -3.6f, 3.6f, -3.6f);
        pathBuilder.reflectiveCurveToRelative(3.6f, 1.62f, 3.6f, 3.6f);
        pathBuilder.reflectiveCurveTo(13.98f, 15.6f, 12.0f, 15.6f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3527addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3306getButtKaPHkGw, m3316getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = build;
        AbstractC3255y.f(build);
        return build;
    }
}
