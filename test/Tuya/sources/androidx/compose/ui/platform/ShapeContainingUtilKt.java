package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;

/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        if (CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
            return true;
        }
        return false;
    }

    public static final boolean isInOutline(Outline outline, float f8, float f9, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f8, f9);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f8, f9, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f8, f9, path, path2);
        }
        throw new L5.p();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f8, float f9, Path path, Path path2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            path = null;
        }
        if ((i8 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f8, f9, path, path2);
    }

    private static final boolean isInPath(Path path, float f8, float f9, Path path2, Path path3) {
        Rect rect = new Rect(f8 - 0.005f, f9 - 0.005f, f8 + 0.005f, f9 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo2869opN5in7k0(path, path2, PathOperation.Companion.m3241getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f8, float f9) {
        if (rect.getLeft() <= f8 && f8 < rect.getRight() && rect.getTop() <= f9 && f9 < rect.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f8, float f9, Path path, Path path2) {
        Path path3;
        RoundRect roundRect = rounded.getRoundRect();
        if (f8 >= roundRect.getLeft() && f8 < roundRect.getRight() && f9 >= roundRect.getTop() && f9 < roundRect.getBottom()) {
            if (!cornersFit(roundRect)) {
                if (path2 == null) {
                    path3 = AndroidPath_androidKt.Path();
                } else {
                    path3 = path2;
                }
                path3.addRoundRect(roundRect);
                return isInPath(path3, f8, f9, path, path2);
            }
            float m2710getXimpl = CornerRadius.m2710getXimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            float m2711getYimpl = CornerRadius.m2711getYimpl(roundRect.m2785getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right = roundRect.getRight() - CornerRadius.m2710getXimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs());
            float m2711getYimpl2 = CornerRadius.m2711getYimpl(roundRect.m2786getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right2 = roundRect.getRight() - CornerRadius.m2710getXimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs());
            float bottom = roundRect.getBottom() - CornerRadius.m2711getYimpl(roundRect.m2784getBottomRightCornerRadiuskKHJgLs());
            float bottom2 = roundRect.getBottom() - CornerRadius.m2711getYimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs());
            float m2710getXimpl2 = CornerRadius.m2710getXimpl(roundRect.m2783getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            if (f8 < m2710getXimpl && f9 < m2711getYimpl) {
                return m4496isWithinEllipseVE1yxkc(f8, f9, roundRect.m2785getTopLeftCornerRadiuskKHJgLs(), m2710getXimpl, m2711getYimpl);
            }
            if (f8 < m2710getXimpl2 && f9 > bottom2) {
                return m4496isWithinEllipseVE1yxkc(f8, f9, roundRect.m2783getBottomLeftCornerRadiuskKHJgLs(), m2710getXimpl2, bottom2);
            }
            if (f8 > right && f9 < m2711getYimpl2) {
                return m4496isWithinEllipseVE1yxkc(f8, f9, roundRect.m2786getTopRightCornerRadiuskKHJgLs(), right, m2711getYimpl2);
            }
            if (f8 > right2 && f9 > bottom) {
                return m4496isWithinEllipseVE1yxkc(f8, f9, roundRect.m2784getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
            }
            return true;
        }
        return false;
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m4496isWithinEllipseVE1yxkc(float f8, float f9, long j8, float f10, float f11) {
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        float m2710getXimpl = CornerRadius.m2710getXimpl(j8);
        float m2711getYimpl = CornerRadius.m2711getYimpl(j8);
        if (((f12 * f12) / (m2710getXimpl * m2710getXimpl)) + ((f13 * f13) / (m2711getYimpl * m2711getYimpl)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
