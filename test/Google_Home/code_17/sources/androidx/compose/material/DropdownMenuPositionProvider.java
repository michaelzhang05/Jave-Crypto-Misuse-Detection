package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

@Immutable
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final InterfaceC1668n onPositionCalculated;

    /* renamed from: androidx.compose.material.DropdownMenuPositionProvider$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements InterfaceC1668n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        public final void invoke(IntRect intRect, IntRect intRect2) {
            AbstractC3255y.i(intRect, "<anonymous parameter 0>");
            AbstractC3255y.i(intRect2, "<anonymous parameter 1>");
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((IntRect) obj, (IntRect) obj2);
            return I.f8278a;
        }
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j8, Density density, InterfaceC1668n interfaceC1668n, AbstractC3247p abstractC3247p) {
        this(j8, density, interfaceC1668n);
    }

    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1239copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j8, Density density, InterfaceC1668n interfaceC1668n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i8 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i8 & 4) != 0) {
            interfaceC1668n = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1241copyrOJDEFc(j8, density, interfaceC1668n);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1015calculatePositionllwVHH4(IntRect anchorBounds, long j8, LayoutDirection layoutDirection, long j9) {
        InterfaceC2998g k8;
        Object obj;
        Object obj2;
        AbstractC3255y.i(anchorBounds, "anchorBounds");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        int mo447roundToPx0680j_4 = this.density.mo447roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo447roundToPx0680j_42 = this.density.mo447roundToPx0680j_4(DpOffset.m5244getXD9Ej5fM(this.contentOffset));
        int mo447roundToPx0680j_43 = this.density.mo447roundToPx0680j_4(DpOffset.m5246getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + mo447roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo447roundToPx0680j_42) - IntSize.m5349getWidthimpl(j9);
        int m5349getWidthimpl = IntSize.m5349getWidthimpl(j8) - IntSize.m5349getWidthimpl(j9);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer valueOf = Integer.valueOf(left);
            Integer valueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m5349getWidthimpl = 0;
            }
            k8 = AbstractC3001j.k(valueOf, valueOf2, Integer.valueOf(m5349getWidthimpl));
        } else {
            Integer valueOf3 = Integer.valueOf(right);
            Integer valueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m5349getWidthimpl(j8)) {
                m5349getWidthimpl = 0;
            }
            k8 = AbstractC3001j.k(valueOf3, valueOf4, Integer.valueOf(m5349getWidthimpl));
        }
        Iterator it = k8.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + IntSize.m5349getWidthimpl(j9) <= IntSize.m5349getWidthimpl(j8)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom() + mo447roundToPx0680j_43, mo447roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo447roundToPx0680j_43) - IntSize.m5348getHeightimpl(j9);
        Iterator it2 = AbstractC3001j.k(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m5348getHeightimpl(j9) / 2)), Integer.valueOf((IntSize.m5348getHeightimpl(j8) - IntSize.m5348getHeightimpl(j9)) - mo447roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo447roundToPx0680j_4 && intValue2 + IntSize.m5348getHeightimpl(j9) <= IntSize.m5348getHeightimpl(j8) - mo447roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m5349getWidthimpl(j9) + right, IntSize.m5348getHeightimpl(j9) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1240component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final InterfaceC1668n component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1241copyrOJDEFc(long j8, Density density, InterfaceC1668n onPositionCalculated) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j8, density, onPositionCalculated, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m5243equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && AbstractC3255y.d(this.density, dropdownMenuPositionProvider.density) && AbstractC3255y.d(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1242getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final InterfaceC1668n getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m5248hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m5251toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j8, Density density, InterfaceC1668n onPositionCalculated) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(onPositionCalculated, "onPositionCalculated");
        this.contentOffset = j8;
        this.density = density;
        this.onPositionCalculated = onPositionCalculated;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j8, Density density, InterfaceC1668n interfaceC1668n, int i8, AbstractC3247p abstractC3247p) {
        this(j8, density, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC1668n, null);
    }
}
