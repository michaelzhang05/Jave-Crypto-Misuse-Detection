package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CorePalette {

    /* renamed from: a1, reason: collision with root package name */
    public TonalPalette f17036a1;

    /* renamed from: a2, reason: collision with root package name */
    public TonalPalette f17037a2;

    /* renamed from: a3, reason: collision with root package name */
    public TonalPalette f17038a3;
    public TonalPalette error;

    /* renamed from: n1, reason: collision with root package name */
    public TonalPalette f17039n1;

    /* renamed from: n2, reason: collision with root package name */
    public TonalPalette f17040n2;

    private CorePalette(int i8, boolean z8) {
        Hct fromInt = Hct.fromInt(i8);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z8) {
            this.f17036a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f17037a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f17038a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f17039n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f17040n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f17036a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f17037a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f17038a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f17039n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f17040n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i8) {
        return new CorePalette(i8, true);
    }

    public static CorePalette of(int i8) {
        return new CorePalette(i8, false);
    }
}
