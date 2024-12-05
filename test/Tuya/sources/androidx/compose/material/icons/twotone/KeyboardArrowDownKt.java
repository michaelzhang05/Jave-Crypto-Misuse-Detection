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
public final class KeyboardArrowDownKt {
    private static ImageVector _keyboardArrowDown;

    public static final ImageVector getKeyboardArrowDown(Icons.TwoTone twoTone) {
        AbstractC3159y.i(twoTone, "<this>");
        ImageVector imageVector = _keyboardArrowDown;
        if (imageVector != null) {
            AbstractC3159y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.KeyboardArrowDown", Dp.m5178constructorimpl(24.0f), Dp.m5178constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw = StrokeCap.Companion.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk8 = StrokeJoin.Companion.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.41f, 8.59f);
        pathBuilder.lineTo(12.0f, 13.17f);
        pathBuilder.lineToRelative(4.59f, -4.58f);
        pathBuilder.lineTo(18.0f, 10.0f);
        pathBuilder.lineToRelative(-6.0f, 6.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardArrowDown = build;
        AbstractC3159y.f(build);
        return build;
    }
}
