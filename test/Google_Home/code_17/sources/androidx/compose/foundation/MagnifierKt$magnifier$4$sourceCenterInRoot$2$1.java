package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ State<Function1> $updatedSourceCenter$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(Density density, State<? extends Function1> state, MutableState<Offset> mutableState) {
        super(0);
        this.$density = density;
        this.$updatedSourceCenter$delegate = state;
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m2729boximpl(m348invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
    public final long m348invokeF1C5BW0() {
        Function1 invoke$lambda$3;
        invoke$lambda$3 = MagnifierKt$magnifier$4.invoke$lambda$3(this.$updatedSourceCenter$delegate);
        long m2750unboximpl = ((Offset) invoke$lambda$3.invoke(this.$density)).m2750unboximpl();
        if (OffsetKt.m2759isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate)) && OffsetKt.m2759isSpecifiedk4lQ0M(m2750unboximpl)) {
            return Offset.m2745plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate), m2750unboximpl);
        }
        return Offset.Companion.m2755getUnspecifiedF1C5BW0();
    }
}
