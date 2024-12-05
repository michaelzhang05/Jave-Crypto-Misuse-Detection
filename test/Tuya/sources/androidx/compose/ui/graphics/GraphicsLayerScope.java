package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;

/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m3145getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            long a8;
            a8 = T0.a(graphicsLayerScope);
            return a8;
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m3146getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            int b8;
            b8 = T0.b(graphicsLayerScope);
            return b8;
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            RenderEffect c8;
            c8 = T0.c(graphicsLayerScope);
            return c8;
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3147getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            long d8;
            d8 = T0.d(graphicsLayerScope);
            return d8;
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m3148getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            long e8;
            e8 = T0.e(graphicsLayerScope);
            return e8;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3149roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j8) {
            int a8;
            a8 = androidx.compose.ui.unit.a.a(graphicsLayerScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3150roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f8) {
            int b8;
            b8 = androidx.compose.ui.unit.a.b(graphicsLayerScope, f8);
            return b8;
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m3151setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j8) {
            T0.f(graphicsLayerScope, j8);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m3152setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i8) {
            T0.g(graphicsLayerScope, i8);
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
            T0.h(graphicsLayerScope, renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m3153setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j8) {
            T0.i(graphicsLayerScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3154toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j8) {
            float a8;
            a8 = androidx.compose.ui.unit.b.a(graphicsLayerScope, j8);
            return a8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3155toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f8) {
            float c8;
            c8 = androidx.compose.ui.unit.a.c(graphicsLayerScope, f8);
            return c8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3157toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j8) {
            long e8;
            e8 = androidx.compose.ui.unit.a.e(graphicsLayerScope, j8);
            return e8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3158toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j8) {
            float f8;
            f8 = androidx.compose.ui.unit.a.f(graphicsLayerScope, j8);
            return f8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3159toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f8) {
            float g8;
            g8 = androidx.compose.ui.unit.a.g(graphicsLayerScope, f8);
            return g8;
        }

        @Stable
        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            Rect h8;
            h8 = androidx.compose.ui.unit.a.h(graphicsLayerScope, dpRect);
            return h8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3160toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j8) {
            long i8;
            i8 = androidx.compose.ui.unit.a.i(graphicsLayerScope, j8);
            return i8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3161toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f8) {
            long b8;
            b8 = androidx.compose.ui.unit.b.b(graphicsLayerScope, f8);
            return b8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3162toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f8) {
            long j8;
            j8 = androidx.compose.ui.unit.a.j(graphicsLayerScope, f8);
            return j8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3156toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i8) {
            float d8;
            d8 = androidx.compose.ui.unit.a.d(graphicsLayerScope, i8);
            return d8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3163toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i8) {
            long k8;
            k8 = androidx.compose.ui.unit.a.k(graphicsLayerScope, i8);
            return k8;
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo3136getAmbientShadowColor0d7_KjU();

    float getCameraDistance();

    boolean getClip();

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    int mo3137getCompositingStrategyNrFUSI();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    long mo3138getSizeNHjbRc();

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo3139getSpotShadowColor0d7_KjU();

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo3140getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f8);

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo3141setAmbientShadowColor8_81llA(long j8);

    void setCameraDistance(float f8);

    void setClip(boolean z8);

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    void mo3142setCompositingStrategyaDBOjCE(int i8);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f8);

    void setRotationY(float f8);

    void setRotationZ(float f8);

    void setScaleX(float f8);

    void setScaleY(float f8);

    void setShadowElevation(float f8);

    void setShape(Shape shape);

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo3143setSpotShadowColor8_81llA(long j8);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo3144setTransformOrigin__ExYCQ(long j8);

    void setTranslationX(float f8);

    void setTranslationY(float f8);
}
