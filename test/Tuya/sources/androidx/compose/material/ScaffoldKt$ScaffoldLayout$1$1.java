package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $bottomBar;
    final /* synthetic */ o $content;
    final /* synthetic */ n $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ n $snackbar;
    final /* synthetic */ n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ n $bottomBar;
        final /* synthetic */ o $content;
        final /* synthetic */ n $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ boolean $isFabDocked;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ n $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ n $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, n nVar, n nVar2, n nVar3, int i8, int i9, boolean z8, int i10, long j8, n nVar4, int i11, o oVar) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = nVar;
            this.$snackbar = nVar2;
            this.$fab = nVar3;
            this.$fabPosition = i8;
            this.$layoutWidth = i9;
            this.$isFabDocked = z8;
            this.$layoutHeight = i10;
            this.$looseConstraints = j8;
            this.$bottomBar = nVar4;
            this.$$dirty = i11;
            this.$content = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f6487a;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01e6 A[LOOP:3: B:48:0x01e4->B:49:0x01e6, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02a8 A[LOOP:4: B:68:0x02a6->B:69:0x02a8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02db A[LOOP:5: B:72:0x02d9->B:73:0x02db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x030b A[LOOP:6: B:76:0x0309->B:77:0x030b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0328 A[LOOP:7: B:80:0x0326->B:81:0x0328, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0346 A[LOOP:8: B:84:0x0344->B:85:0x0346, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0364  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(androidx.compose.ui.layout.Placeable.PlacementScope r30) {
            /*
                Method dump skipped, instructions count: 906
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.AnonymousClass1.invoke(androidx.compose.ui.layout.Placeable$PlacementScope):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(n nVar, n nVar2, n nVar3, int i8, boolean z8, n nVar4, int i9, o oVar) {
        super(2);
        this.$topBar = nVar;
        this.$snackbar = nVar2;
        this.$fab = nVar3;
        this.$fabPosition = i8;
        this.$isFabDocked = z8;
        this.$bottomBar = nVar4;
        this.$$dirty = i9;
        this.$content = oVar;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1323invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1323invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3159y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5146getMaxWidthimpl = Constraints.m5146getMaxWidthimpl(j8);
        int m5145getMaxHeightimpl = Constraints.m5145getMaxHeightimpl(j8);
        return MeasureScope.CC.q(SubcomposeLayout, m5146getMaxWidthimpl, m5145getMaxHeightimpl, null, new AnonymousClass1(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m5146getMaxWidthimpl, this.$isFabDocked, m5145getMaxHeightimpl, Constraints.m5137copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content), 4, null);
    }
}
