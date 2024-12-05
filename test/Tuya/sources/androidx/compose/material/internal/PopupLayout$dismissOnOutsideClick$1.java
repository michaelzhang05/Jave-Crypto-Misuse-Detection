package androidx.compose.material.internal;

import X5.n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends AbstractC3160z implements n {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // X5.n
    /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(Offset offset, IntRect bounds) {
        AbstractC3159y.i(bounds, "bounds");
        boolean z8 = false;
        if (offset != null && (Offset.m2735getXimpl(offset.m2745unboximpl()) < bounds.getLeft() || Offset.m2735getXimpl(offset.m2745unboximpl()) > bounds.getRight() || Offset.m2736getYimpl(offset.m2745unboximpl()) < bounds.getTop() || Offset.m2736getYimpl(offset.m2745unboximpl()) > bounds.getBottom())) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
