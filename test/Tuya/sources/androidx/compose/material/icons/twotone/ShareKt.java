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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class ShareKt {
    private static ImageVector _share;

    public static final ImageVector getShare(Icons.TwoTone twoTone) {
        AbstractC3159y.i(twoTone, "<this>");
        ImageVector imageVector = _share;
        if (imageVector != null) {
            AbstractC3159y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Share", Dp.m5178constructorimpl(24.0f), Dp.m5178constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2997getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m3301getButtKaPHkGw = companion2.m3301getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m3311getBevelLxFBmk8 = companion3.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 5.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw2 = companion2.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk82 = companion3.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 12.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m3301getButtKaPHkGw2, m3311getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw3 = companion2.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk83 = companion3.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.0f, 19.02f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m3301getButtKaPHkGw3, m3311getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw4 = companion2.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk84 = companion3.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(18.0f, 16.08f);
        pathBuilder4.curveToRelative(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        pathBuilder4.lineTo(8.91f, 12.7f);
        pathBuilder4.curveToRelative(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        pathBuilder4.reflectiveCurveToRelative(-0.04f, -0.47f, -0.09f, -0.7f);
        pathBuilder4.lineToRelative(7.05f, -4.11f);
        pathBuilder4.curveToRelative(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder4.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder4.curveToRelative(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        pathBuilder4.lineTo(8.04f, 9.81f);
        pathBuilder4.curveTo(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        pathBuilder4.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder4.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder4.curveToRelative(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        pathBuilder4.lineToRelative(7.12f, 4.16f);
        pathBuilder4.curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        pathBuilder4.curveToRelative(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        pathBuilder4.reflectiveCurveToRelative(2.92f, -1.31f, 2.92f, -2.92f);
        pathBuilder4.curveToRelative(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.0f, 4.0f);
        pathBuilder4.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(6.0f, 13.0f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.0f, 20.02f);
        pathBuilder4.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder4.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m3301getButtKaPHkGw4, m3311getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _share = build;
        AbstractC3159y.f(build);
        return build;
    }
}
