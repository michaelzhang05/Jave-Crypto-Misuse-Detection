package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    public static final ImageVector materialIcon(String name, Function1 block) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(block, "block");
        return ((ImageVector.Builder) block.invoke(new ImageVector.Builder(name, Dp.m5178constructorimpl(24.0f), Dp.m5178constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null))).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1418materialPathYwgOQQI(ImageVector.Builder materialPath, float f8, float f9, int i8, Function1 pathBuilder) {
        AbstractC3159y.i(materialPath, "$this$materialPath");
        AbstractC3159y.i(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.Companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw = StrokeCap.Companion.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk8 = StrokeJoin.Companion.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3522addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), i8, "", solidColor, f8, null, f9, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1419materialPathYwgOQQI$default(ImageVector.Builder materialPath, float f8, float f9, int i8, Function1 pathBuilder, int i9, Object obj) {
        float f10;
        float f11;
        int i10;
        if ((i9 & 1) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i9 & 2) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f9;
        }
        if ((i9 & 4) != 0) {
            i10 = VectorKt.getDefaultFillType();
        } else {
            i10 = i8;
        }
        AbstractC3159y.i(materialPath, "$this$materialPath");
        AbstractC3159y.i(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.Companion.m2997getBlack0d7_KjU(), null);
        int m3301getButtKaPHkGw = StrokeCap.Companion.m3301getButtKaPHkGw();
        int m3311getBevelLxFBmk8 = StrokeJoin.Companion.m3311getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3522addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), i10, "", solidColor, f10, null, f11, 1.0f, m3301getButtKaPHkGw, m3311getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
