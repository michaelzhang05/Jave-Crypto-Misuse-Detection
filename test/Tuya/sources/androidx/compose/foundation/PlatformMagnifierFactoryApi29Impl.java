package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3159y;

@RequiresApi(29)
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @StabilityInferred(parameters = 0)
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
            AbstractC3159y.i(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo368updateWko1d7g(long j8, long j9, float f8) {
            if (!Float.isNaN(f8)) {
                getMagnifier().setZoom(f8);
            }
            if (OffsetKt.m2754isSpecifiedk4lQ0M(j9)) {
                getMagnifier().show(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8), Offset.m2735getXimpl(j9), Offset.m2736getYimpl(j9));
            } else {
                getMagnifier().show(Offset.m2735getXimpl(j8), Offset.m2736getYimpl(j8));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifierImpl create(MagnifierStyle style, View view, Density density, float f8) {
        AbstractC3159y.i(style, "style");
        AbstractC3159y.i(view, "view");
        AbstractC3159y.i(density, "density");
        if (AbstractC3159y.d(style, MagnifierStyle.Companion.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo449toSizeXkaWNTQ = density.mo449toSizeXkaWNTQ(style.m346getSizeMYxV2XQ$foundation_release());
        float mo448toPx0680j_4 = density.mo448toPx0680j_4(style.m344getCornerRadiusD9Ej5fM$foundation_release());
        float mo448toPx0680j_42 = density.mo448toPx0680j_4(style.m345getElevationD9Ej5fM$foundation_release());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo449toSizeXkaWNTQ != Size.Companion.m2812getUnspecifiedNHjbRc()) {
            builder.setSize(Z5.a.d(Size.m2804getWidthimpl(mo449toSizeXkaWNTQ)), Z5.a.d(Size.m2801getHeightimpl(mo449toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(mo448toPx0680j_4)) {
            builder.setCornerRadius(mo448toPx0680j_4);
        }
        if (!Float.isNaN(mo448toPx0680j_42)) {
            builder.setElevation(mo448toPx0680j_42);
        }
        if (!Float.isNaN(f8)) {
            builder.setInitialZoom(f8);
        }
        builder.setClippingEnabled(style.getClippingEnabled$foundation_release());
        Magnifier build = builder.build();
        AbstractC3159y.h(build, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(build);
    }
}
