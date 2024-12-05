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
public final class MenuKt {
    private static ImageVector _menu;

    public static final ImageVector getMenu(Icons.TwoTone twoTone) {
        AbstractC3255y.i(twoTone, "<this>");
        ImageVector imageVector = _menu;
        if (imageVector != null) {
            AbstractC3255y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Menu", Dp.m5183constructorimpl(24.0f), Dp.m5183constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m3002getBlack0d7_KjU(), null);
        int m3306getButtKaPHkGw = StrokeCap.Companion.m3306getButtKaPHkGw();
        int m3316getBevelLxFBmk8 = StrokeJoin.Companion.m3316getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(3.0f, 16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 6.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3527addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3306getButtKaPHkGw, m3316getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menu = build;
        AbstractC3255y.f(build);
        return build;
    }
}
