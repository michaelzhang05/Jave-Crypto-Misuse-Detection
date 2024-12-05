package androidx.compose.ui.graphics.vector;

import M5.AbstractC1246t;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = AbstractC1246t.m();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m3301getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m3312getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m2917getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m3006getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m3232getNonZeroRgk1Os();

    public static final List<PathNode> PathData(Function1 function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        if (str == null) {
            return EmptyPath;
        }
        return new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m3540rgbEqualOWjLjI(long j8, long j9) {
        if (Color.m2977getRedimpl(j8) == Color.m2977getRedimpl(j9) && Color.m2976getGreenimpl(j8) == Color.m2976getGreenimpl(j9) && Color.m2974getBlueimpl(j8) == Color.m2974getBlueimpl(j9)) {
            return true;
        }
        return false;
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (colorFilter instanceof BlendModeColorFilter) {
            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
            int m2921getBlendMode0nO6VwU = blendModeColorFilter.m2921getBlendMode0nO6VwU();
            BlendMode.Companion companion = BlendMode.Companion;
            if (BlendMode.m2888equalsimpl0(m2921getBlendMode0nO6VwU, companion.m2917getSrcIn0nO6VwU()) || BlendMode.m2888equalsimpl0(blendModeColorFilter.m2921getBlendMode0nO6VwU(), companion.m2919getSrcOver0nO6VwU())) {
                return true;
            }
        } else if (colorFilter == null) {
            return true;
        }
        return false;
    }
}
