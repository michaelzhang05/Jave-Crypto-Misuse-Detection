package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static float a(FontScalingLinear fontScalingLinear, long j8) {
        if (TextUnitType.m5398equalsimpl0(TextUnit.m5369getTypeUIouoOA(j8), TextUnitType.Companion.m5403getSpUIouoOA())) {
            return Dp.m5183constructorimpl(TextUnit.m5370getValueimpl(j8) * fontScalingLinear.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long b(FontScalingLinear fontScalingLinear, float f8) {
        return TextUnitKt.getSp(f8 / fontScalingLinear.getFontScale());
    }
}
