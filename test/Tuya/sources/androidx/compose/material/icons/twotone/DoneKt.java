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
public final class DoneKt {
    private static ImageVector _done;

    public static final ImageVector getDone(Icons.TwoTone twoTone) {
        AbstractC3159y.i(twoTone, "<this>");
        ImageVector imageVector = _done;
        if (imageVector != null) {
            AbstractC3159y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Done", Dp.m5178constructorimpl(24.0f), Dp.m5178constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw = StrokeCap.Companion.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk8 = StrokeJoin.Companion.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.2f);
        pathBuilder.lineTo(4.8f, 12.0f);
        pathBuilder.lineToRelative(-1.4f, 1.4f);
        pathBuilder.lineTo(9.0f, 19.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.lineToRelative(-1.4f, -1.4f);
        pathBuilder.lineTo(9.0f, 16.2f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3522addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _done = build;
        AbstractC3159y.f(build);
        return build;
    }
}
