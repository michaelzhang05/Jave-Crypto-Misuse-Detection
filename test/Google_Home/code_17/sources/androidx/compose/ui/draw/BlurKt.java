package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m2629blur1fqSgw(Modifier modifier, float f8, float f9, Shape shape) {
        int m3327getDecal3opZhB0;
        boolean z8;
        if (shape != null) {
            m3327getDecal3opZhB0 = TileMode.Companion.m3326getClamp3opZhB0();
            z8 = true;
        } else {
            m3327getDecal3opZhB0 = TileMode.Companion.m3327getDecal3opZhB0();
            z8 = false;
        }
        float f10 = 0;
        if ((Dp.m5182compareTo0680j_4(f8, Dp.m5183constructorimpl(f10)) > 0 && Dp.m5182compareTo0680j_4(f9, Dp.m5183constructorimpl(f10)) > 0) || z8) {
            return GraphicsLayerModifierKt.graphicsLayer(modifier, new BlurKt$blur$1(f8, f9, m3327getDecal3opZhB0, shape, z8));
        }
        return modifier;
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2630blur1fqSgw$default(Modifier modifier, float f8, float f9, BlurredEdgeTreatment blurredEdgeTreatment, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2633boximpl(BlurredEdgeTreatment.Companion.m2640getRectangleGoahg());
        }
        return m2629blur1fqSgw(modifier, f8, f9, blurredEdgeTreatment.m2639unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m2631blurF8QBwvs(Modifier modifier, float f8, Shape shape) {
        return m2629blur1fqSgw(modifier, f8, f8, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2632blurF8QBwvs$default(Modifier modifier, float f8, BlurredEdgeTreatment blurredEdgeTreatment, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m2633boximpl(BlurredEdgeTreatment.Companion.m2640getRectangleGoahg());
        }
        return m2631blurF8QBwvs(modifier, f8, blurredEdgeTreatment.m2639unboximpl());
    }
}
