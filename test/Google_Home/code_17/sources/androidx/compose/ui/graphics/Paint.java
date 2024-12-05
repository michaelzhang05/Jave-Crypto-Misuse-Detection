package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* loaded from: classes.dex */
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo2854getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo2855getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo2856getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo2857getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo2858getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo2859getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f8);

    void setAntiAlias(boolean z8);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo2860setBlendModes9anfk8(int i8);

    /* renamed from: setColor-8_81llA */
    void mo2861setColor8_81llA(long j8);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo2862setFilterQualityvDHp3xo(int i8);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo2863setStrokeCapBeK7IIE(int i8);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo2864setStrokeJoinWw9F2mQ(int i8);

    void setStrokeMiterLimit(float f8);

    void setStrokeWidth(float f8);

    /* renamed from: setStyle-k9PVt8s */
    void mo2865setStylek9PVt8s(int i8);
}
