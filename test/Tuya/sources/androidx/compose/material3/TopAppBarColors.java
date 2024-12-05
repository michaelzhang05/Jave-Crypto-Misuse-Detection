package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC3151p;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TopAppBarColors {
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    public /* synthetic */ TopAppBarColors(long j8, long j9, long j10, long j11, long j12, AbstractC3151p abstractC3151p) {
        this(j8, j9, j10, j11, j12);
    }

    @Composable
    /* renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m1945containerColorXeAY9LY$material3_release(float f8, Composer composer, int i8) {
        composer.startReplaceableGroup(-1456204135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1456204135, i8, -1, "androidx.compose.material3.TopAppBarColors.containerColor (AppBar.kt:896)");
        }
        long m3022lerpjxsXWHM = ColorKt.m3022lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3022lerpjxsXWHM;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        if (Color.m2972equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m2972equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m2972equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m2972equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m2972equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionIconContentColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m1946getActionIconContentColor0d7_KjU$material3_release() {
        return this.actionIconContentColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m1947getNavigationIconContentColor0d7_KjU$material3_release() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m1948getTitleContentColor0d7_KjU$material3_release() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m2978hashCodeimpl(this.containerColor) * 31) + Color.m2978hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m2978hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m2978hashCodeimpl(this.titleContentColor)) * 31) + Color.m2978hashCodeimpl(this.actionIconContentColor);
    }

    private TopAppBarColors(long j8, long j9, long j10, long j11, long j12) {
        this.containerColor = j8;
        this.scrolledContainerColor = j9;
        this.navigationIconContentColor = j10;
        this.titleContentColor = j11;
        this.actionIconContentColor = j12;
    }
}
