package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks$VerticalMaxHeight$1 extends AbstractC3160z implements X5.o {
    public static final IntrinsicMeasureBlocks$VerticalMaxHeight$1 INSTANCE = new IntrinsicMeasureBlocks$VerticalMaxHeight$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements X5.n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i8) {
            AbstractC3159y.i(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3160z implements X5.n {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i8) {
            AbstractC3159y.i(intrinsicSize, "$this$intrinsicSize");
            return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i8));
        }
    }

    IntrinsicMeasureBlocks$VerticalMaxHeight$1() {
        super(3);
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((List<? extends IntrinsicMeasurable>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i8, int i9) {
        int intrinsicSize;
        AbstractC3159y.i(measurables, "measurables");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        intrinsicSize = RowColumnImplKt.intrinsicSize(measurables, anonymousClass1, anonymousClass2, i8, i9, layoutOrientation, layoutOrientation);
        return Integer.valueOf(intrinsicSize);
    }
}
