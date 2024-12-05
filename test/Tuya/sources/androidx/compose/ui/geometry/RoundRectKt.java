package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f8, float f9, float f10, float f11, float f12, float f13) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f12, f13);
        return new RoundRect(f8, f9, f10, f11, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m2787RoundRectZAM2FJo(Rect rect, long j8, long j9, long j10, long j11) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j8, j9, j10, j11, null);
    }

    /* renamed from: RoundRect-ZAM2FJo$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m2788RoundRectZAM2FJo$default(Rect rect, long j8, long j9, long j10, long j11, int i8, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        if ((i8 & 2) != 0) {
            j12 = CornerRadius.Companion.m2720getZerokKHJgLs();
        } else {
            j12 = j8;
        }
        if ((i8 & 4) != 0) {
            j13 = CornerRadius.Companion.m2720getZerokKHJgLs();
        } else {
            j13 = j9;
        }
        if ((i8 & 8) != 0) {
            j14 = CornerRadius.Companion.m2720getZerokKHJgLs();
        } else {
            j14 = j10;
        }
        if ((i8 & 16) != 0) {
            j15 = CornerRadius.Companion.m2720getZerokKHJgLs();
        } else {
            j15 = j11;
        }
        return m2787RoundRectZAM2FJo(rect, j12, j13, j14, j15);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m2789RoundRectgG7oq9Y(float f8, float f9, float f10, float f11, long j8) {
        return RoundRect(f8, f9, f10, f11, CornerRadius.m2710getXimpl(j8), CornerRadius.m2711getYimpl(j8));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m2790RoundRectsniSvfs(Rect rect, long j8) {
        return RoundRect(rect, CornerRadius.m2710getXimpl(j8), CornerRadius.m2711getYimpl(j8));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()), CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        if (roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect)) {
            return true;
        }
        return false;
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        if (CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) && roundRect.getWidth() <= CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) * 2.0d && roundRect.getHeight() <= CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) * 2.0d) {
            return true;
        }
        return false;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        if (roundRect.getLeft() < roundRect.getRight() && roundRect.getTop() < roundRect.getBottom()) {
            return false;
        }
        return true;
    }

    public static final boolean isFinite(RoundRect roundRect) {
        float left = roundRect.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            float top = roundRect.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                float right = roundRect.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    float bottom = roundRect.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(RoundRect roundRect) {
        if ((CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && ((CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) == 0.0f)))) {
            return true;
        }
        return false;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        if (CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs())) {
            return true;
        }
        return false;
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f8) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f8), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f8), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f8), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f8), CornerRadiusKt.m2721lerp3Ry4LBc(roundRect.m2785getTopLeftCornerRadiuskKHJgLs(), roundRect2.m2785getTopLeftCornerRadiuskKHJgLs(), f8), CornerRadiusKt.m2721lerp3Ry4LBc(roundRect.m2786getTopRightCornerRadiuskKHJgLs(), roundRect2.m2786getTopRightCornerRadiuskKHJgLs(), f8), CornerRadiusKt.m2721lerp3Ry4LBc(roundRect.m2784getBottomRightCornerRadiuskKHJgLs(), roundRect2.m2784getBottomRightCornerRadiuskKHJgLs(), f8), CornerRadiusKt.m2721lerp3Ry4LBc(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m2783getBottomLeftCornerRadiuskKHJgLs(), f8), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m2791translateUv8p0NA(RoundRect roundRect, long j8) {
        return new RoundRect(Offset.m2735getXimpl(j8) + roundRect.getLeft(), Offset.m2736getYimpl(j8) + roundRect.getTop(), Offset.m2735getXimpl(j8) + roundRect.getRight(), Offset.m2736getYimpl(j8) + roundRect.getBottom(), roundRect.m2785getTopLeftCornerRadiuskKHJgLs(), roundRect.m2786getTopRightCornerRadiuskKHJgLs(), roundRect.m2784getBottomRightCornerRadiuskKHJgLs(), roundRect.m2783getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(Rect rect, float f8, float f9) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f8, f9);
    }
}
