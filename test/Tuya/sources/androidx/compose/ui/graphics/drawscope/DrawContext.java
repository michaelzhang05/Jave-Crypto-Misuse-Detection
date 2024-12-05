package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface DrawContext {
    Canvas getCanvas();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo3420getSizeNHjbRc();

    DrawTransform getTransform();

    void setCanvas(Canvas canvas);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    /* renamed from: setSize-uvyYCjk */
    void mo3421setSizeuvyYCjk(long j8);
}
