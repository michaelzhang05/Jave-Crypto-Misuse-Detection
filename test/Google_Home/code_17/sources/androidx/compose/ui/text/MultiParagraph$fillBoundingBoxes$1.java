package androidx.compose.ui.text;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MultiParagraph$fillBoundingBoxes$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ float[] $array;
    final /* synthetic */ Q $currentArrayStart;
    final /* synthetic */ P $currentHeight;
    final /* synthetic */ long $range;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$fillBoundingBoxes$1(long j8, float[] fArr, Q q8, P p8) {
        super(1);
        this.$range = j8;
        this.$array = fArr;
        this.$currentArrayStart = q8;
        this.$currentHeight = p8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ParagraphInfo) obj);
        return I.f8278a;
    }

    public final void invoke(ParagraphInfo paragraphInfo) {
        long j8 = this.$range;
        float[] fArr = this.$array;
        Q q8 = this.$currentArrayStart;
        P p8 = this.$currentHeight;
        long TextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m4695getMinimpl(j8) ? paragraphInfo.getStartIndex() : TextRange.m4695getMinimpl(j8)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m4694getMaximpl(j8) ? paragraphInfo.getEndIndex() : TextRange.m4694getMaximpl(j8)));
        paragraphInfo.getParagraph().mo4546fillBoundingBoxes8ffj60Q(TextRange, fArr, q8.f34160a);
        int m4693getLengthimpl = q8.f34160a + (TextRange.m4693getLengthimpl(TextRange) * 4);
        for (int i8 = q8.f34160a; i8 < m4693getLengthimpl; i8 += 4) {
            int i9 = i8 + 1;
            float f8 = fArr[i9];
            float f9 = p8.f34159a;
            fArr[i9] = f8 + f9;
            int i10 = i8 + 3;
            fArr[i10] = fArr[i10] + f9;
        }
        q8.f34160a = m4693getLengthimpl;
        p8.f34159a += paragraphInfo.getParagraph().getHeight();
    }
}
