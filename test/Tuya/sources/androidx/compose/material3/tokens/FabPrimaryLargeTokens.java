package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FabPrimaryLargeTokens {
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final float ContainerWidth;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusIconColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverIconColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float LoweredContainerElevation;
    private static final float LoweredFocusContainerElevation;
    private static final float LoweredHoverContainerElevation;
    private static final float LoweredPressedContainerElevation;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedIconColor;
    public static final FabPrimaryLargeTokens INSTANCE = new FabPrimaryLargeTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2075getLevel3D9Ej5fM();
        float f8 = (float) 96.0d;
        ContainerHeight = Dp.m5178constructorimpl(f8);
        ContainerShape = ShapeKeyTokens.CornerExtraLarge;
        ContainerWidth = Dp.m5178constructorimpl(f8);
        FocusContainerElevation = elevationTokens.m2075getLevel3D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusIconColor = colorSchemeKeyTokens;
        HoverContainerElevation = elevationTokens.m2076getLevel4D9Ej5fM();
        HoverIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        IconSize = Dp.m5178constructorimpl((float) 36.0d);
        LoweredContainerElevation = elevationTokens.m2073getLevel1D9Ej5fM();
        LoweredFocusContainerElevation = elevationTokens.m2073getLevel1D9Ej5fM();
        LoweredHoverContainerElevation = elevationTokens.m2074getLevel2D9Ej5fM();
        LoweredPressedContainerElevation = elevationTokens.m2073getLevel1D9Ej5fM();
        PressedContainerElevation = elevationTokens.m2075getLevel3D9Ej5fM();
        PressedIconColor = colorSchemeKeyTokens;
    }

    private FabPrimaryLargeTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2088getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2089getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m2090getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2091getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2092getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2093getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getLoweredContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2094getLoweredContainerElevationD9Ej5fM() {
        return LoweredContainerElevation;
    }

    /* renamed from: getLoweredFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2095getLoweredFocusContainerElevationD9Ej5fM() {
        return LoweredFocusContainerElevation;
    }

    /* renamed from: getLoweredHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2096getLoweredHoverContainerElevationD9Ej5fM() {
        return LoweredHoverContainerElevation;
    }

    /* renamed from: getLoweredPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2097getLoweredPressedContainerElevationD9Ej5fM() {
        return LoweredPressedContainerElevation;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2098getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }
}
