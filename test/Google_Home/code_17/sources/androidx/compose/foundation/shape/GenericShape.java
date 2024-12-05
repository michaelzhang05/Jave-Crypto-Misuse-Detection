package androidx.compose.foundation.shape;

import a6.InterfaceC1669o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final InterfaceC1669o builder;

    public GenericShape(InterfaceC1669o builder) {
        AbstractC3255y.i(builder, "builder");
        this.builder = builder;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo336createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        AbstractC3255y.i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m2797boximpl(j8), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        GenericShape genericShape;
        if (this == obj) {
            return true;
        }
        InterfaceC1669o interfaceC1669o = null;
        if (obj instanceof GenericShape) {
            genericShape = (GenericShape) obj;
        } else {
            genericShape = null;
        }
        if (genericShape != null) {
            interfaceC1669o = genericShape.builder;
        }
        return AbstractC3255y.d(interfaceC1669o, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
