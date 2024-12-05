package androidx.compose.material3.internal;

import a6.InterfaceC1668n;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(Offset offset, IntRect bounds) {
        AbstractC3255y.i(bounds, "bounds");
        boolean z8 = false;
        if (offset != null && (Offset.m2740getXimpl(offset.m2750unboximpl()) < bounds.getLeft() || Offset.m2740getXimpl(offset.m2750unboximpl()) > bounds.getRight() || Offset.m2741getYimpl(offset.m2750unboximpl()) < bounds.getTop() || Offset.m2741getYimpl(offset.m2750unboximpl()) > bounds.getBottom())) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
