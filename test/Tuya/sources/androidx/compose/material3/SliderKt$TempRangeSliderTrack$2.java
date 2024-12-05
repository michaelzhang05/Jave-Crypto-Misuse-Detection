package androidx.compose.material3;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class SliderKt$TempRangeSliderTrack$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ P $thumbRadiusPx;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ P $tickSize;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$TempRangeSliderTrack$2(P p8, State<Color> state, float f8, float f9, float f10, State<Color> state2, float[] fArr, State<Color> state3, State<Color> state4, P p9) {
        super(1);
        this.$thumbRadiusPx = p8;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f8;
        this.$positionFractionEnd = f9;
        this.$positionFractionStart = f10;
        this.$activeTrackColor = state2;
        this.$tickFractions = fArr;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
        this.$tickSize = p9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f6487a;
    }

    public final void invoke(DrawScope Canvas) {
        AbstractC3159y.i(Canvas, "$this$Canvas");
        boolean z8 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbRadiusPx.f33758a, Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m2804getWidthimpl(Canvas.mo3414getSizeNHjbRc()) - this.$thumbRadiusPx.f33758a, Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()));
        long j8 = z8 ? Offset2 : Offset;
        long j9 = z8 ? Offset : Offset2;
        long m2981unboximpl = this.$inactiveTrackColor.getValue().m2981unboximpl();
        float f8 = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j10 = j9;
        long j11 = j8;
        c.C(Canvas, m2981unboximpl, j8, j9, f8, companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        c.C(Canvas, this.$activeTrackColor.getValue().m2981unboximpl(), OffsetKt.Offset(Offset.m2735getXimpl(j11) + ((Offset.m2735getXimpl(j10) - Offset.m2735getXimpl(j11)) * this.$positionFractionStart), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2735getXimpl(j11) + ((Offset.m2735getXimpl(j10) - Offset.m2735getXimpl(j11)) * this.$positionFractionEnd), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] fArr = this.$tickFractions;
        float f9 = this.$positionFractionEnd;
        float f10 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f11 = fArr[i8];
            Boolean valueOf = Boolean.valueOf(f11 > f9 || f11 < f10);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f11));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        P p8 = this.$tickSize;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Offset.m2724boximpl(OffsetKt.Offset(Offset.m2735getXimpl(OffsetKt.m2758lerpWko1d7g(j11, j10, ((Number) it.next()).floatValue())), Offset.m2736getYimpl(Canvas.mo3413getCenterF1C5BW0()))));
            }
            long j12 = j11;
            long j13 = j10;
            c.H(Canvas, arrayList, PointMode.Companion.m3254getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2981unboximpl(), p8.f33758a, StrokeCap.Companion.m3302getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            p8 = p8;
            j11 = j12;
            j10 = j13;
        }
    }
}
