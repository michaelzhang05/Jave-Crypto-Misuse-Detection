package androidx.compose.foundation.text.selection;

import O5.I;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        final /* synthetic */ Function0 $center;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0) {
            super(1);
            this.$center = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m2729boximpl(m1096invoketuRUvjQ((Density) obj));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m1096invoketuRUvjQ(Density magnifier) {
            AbstractC3255y.i(magnifier, "$this$magnifier");
            return ((Offset) this.$center.invoke()).m2750unboximpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3256z implements Function1 {
        final /* synthetic */ Density $density;
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Density density, MutableState<IntSize> mutableState) {
            super(1);
            this.$density = density;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1097invokeEaSLcWc(((DpSize) obj).m5289unboximpl());
            return I.f8278a;
        }

        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
        public final void m1097invokeEaSLcWc(long j8) {
            MutableState<IntSize> mutableState = this.$magnifierSize$delegate;
            Density density = this.$density;
            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState, IntSizeKt.IntSize(density.mo447roundToPx0680j_4(DpSize.m5281getWidthD9Ej5fM(j8)), density.mo447roundToPx0680j_4(DpSize.m5279getHeightD9Ej5fM(j8))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.$density = density;
        this.$magnifierSize$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Function0 center) {
        AbstractC3255y.i(center, "center");
        return MagnifierKt.magnifier$default(Modifier.Companion, new AnonymousClass1(center), null, 0.0f, MagnifierStyle.Companion.getTextDefault(), new AnonymousClass2(this.$density, this.$magnifierSize$delegate), 6, null);
    }
}
