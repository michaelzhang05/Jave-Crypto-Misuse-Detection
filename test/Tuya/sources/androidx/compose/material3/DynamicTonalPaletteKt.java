package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class DynamicTonalPaletteKt {
    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        AbstractC3159y.i(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m1569darkColorSchemeG1PFcw$default(dynamicTonalPalette.m1915getPrimary800d7_KjU(), dynamicTonalPalette.m1909getPrimary200d7_KjU(), dynamicTonalPalette.m1910getPrimary300d7_KjU(), dynamicTonalPalette.m1916getPrimary900d7_KjU(), dynamicTonalPalette.m1911getPrimary400d7_KjU(), dynamicTonalPalette.m1928getSecondary800d7_KjU(), dynamicTonalPalette.m1922getSecondary200d7_KjU(), dynamicTonalPalette.m1923getSecondary300d7_KjU(), dynamicTonalPalette.m1929getSecondary900d7_KjU(), dynamicTonalPalette.m1941getTertiary800d7_KjU(), dynamicTonalPalette.m1935getTertiary200d7_KjU(), dynamicTonalPalette.m1936getTertiary300d7_KjU(), dynamicTonalPalette.m1942getTertiary900d7_KjU(), dynamicTonalPalette.m1881getNeutral100d7_KjU(), dynamicTonalPalette.m1890getNeutral900d7_KjU(), dynamicTonalPalette.m1881getNeutral100d7_KjU(), dynamicTonalPalette.m1890getNeutral900d7_KjU(), dynamicTonalPalette.m1897getNeutralVariant300d7_KjU(), dynamicTonalPalette.m1902getNeutralVariant800d7_KjU(), 0L, dynamicTonalPalette.m1890getNeutral900d7_KjU(), dynamicTonalPalette.m1883getNeutral200d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m1900getNeutralVariant600d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme(Context context) {
        AbstractC3159y.i(context, "context");
        TonalPalette dynamicTonalPalette = dynamicTonalPalette(context);
        return ColorSchemeKt.m1571lightColorSchemeG1PFcw$default(dynamicTonalPalette.m1911getPrimary400d7_KjU(), dynamicTonalPalette.m1908getPrimary1000d7_KjU(), dynamicTonalPalette.m1916getPrimary900d7_KjU(), dynamicTonalPalette.m1907getPrimary100d7_KjU(), dynamicTonalPalette.m1915getPrimary800d7_KjU(), dynamicTonalPalette.m1924getSecondary400d7_KjU(), dynamicTonalPalette.m1921getSecondary1000d7_KjU(), dynamicTonalPalette.m1929getSecondary900d7_KjU(), dynamicTonalPalette.m1920getSecondary100d7_KjU(), dynamicTonalPalette.m1937getTertiary400d7_KjU(), dynamicTonalPalette.m1934getTertiary1000d7_KjU(), dynamicTonalPalette.m1942getTertiary900d7_KjU(), dynamicTonalPalette.m1933getTertiary100d7_KjU(), dynamicTonalPalette.m1892getNeutral990d7_KjU(), dynamicTonalPalette.m1881getNeutral100d7_KjU(), dynamicTonalPalette.m1892getNeutral990d7_KjU(), dynamicTonalPalette.m1881getNeutral100d7_KjU(), dynamicTonalPalette.m1903getNeutralVariant900d7_KjU(), dynamicTonalPalette.m1897getNeutralVariant300d7_KjU(), 0L, dynamicTonalPalette.m1883getNeutral200d7_KjU(), dynamicTonalPalette.m1891getNeutral950d7_KjU(), 0L, 0L, 0L, 0L, dynamicTonalPalette.m1899getNeutralVariant500d7_KjU(), 0L, 0L, 466092032, null);
    }

    @RequiresApi(31)
    public static final TonalPalette dynamicTonalPalette(Context context) {
        AbstractC3159y.i(context, "context");
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Blue_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Blue_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.GM2_grey_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Indigo_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Indigo_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Pink_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Pink_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Purple_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Purple_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Red_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Red_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Teal_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.Teal_800), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default_50), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default_700), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default_dark_60_percent_opacity), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_device_default_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accent_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.autofill_background_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.autofill_background_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.autofilled_highlight), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_device_default), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_holo_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_holo_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_device_default_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_device_default_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_floating_device_default_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_floating_device_default_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_floating_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_floating_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_holo_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_holo_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_leanback_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_leanback_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.background_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_dark_disabled), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_dark_inverse), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_disabled_holo_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_disabled_holo_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_holo_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_holo_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_inverse_holo_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_inverse_holo_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_light_disabled), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.bright_foreground_light_inverse), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_colored_background_material), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_colored_borderless_text_material), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_colored_text_material), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_default_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_default_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.btn_watch_default_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.button_material_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.button_material_light), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.button_normal_device_default_dark), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.car_accent), colorResourceHelper.m1504getColorWaAFU9c(context, android.R.color.car_accent_dark), null);
    }
}