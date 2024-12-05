package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$SpanStyleSaver$2 extends AbstractC3256z implements Function1 {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SpanStyle invoke(Object obj) {
        AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Color.Companion companion = Color.Companion;
        Saver<Color, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        Color restore = (AbstractC3255y.d(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
        AbstractC3255y.f(restore);
        long m2986unboximpl = restore.m2986unboximpl();
        Object obj3 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        TextUnit restore2 = (AbstractC3255y.d(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(companion2).restore(obj3);
        AbstractC3255y.f(restore2);
        long m5379unboximpl = restore2.m5379unboximpl();
        Object obj4 = list.get(2);
        FontWeight restore3 = (AbstractC3255y.d(obj4, bool) || obj4 == null) ? null : SaversKt.getSaver(FontWeight.Companion).restore(obj4);
        Object obj5 = list.get(3);
        FontStyle fontStyle = obj5 != null ? (FontStyle) obj5 : null;
        Object obj6 = list.get(4);
        FontSynthesis fontSynthesis = obj6 != null ? (FontSynthesis) obj6 : null;
        Object obj7 = list.get(6);
        String str = obj7 != null ? (String) obj7 : null;
        Object obj8 = list.get(7);
        TextUnit restore4 = (AbstractC3255y.d(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(companion2).restore(obj8);
        AbstractC3255y.f(restore4);
        long m5379unboximpl2 = restore4.m5379unboximpl();
        Object obj9 = list.get(8);
        BaselineShift restore5 = (AbstractC3255y.d(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(BaselineShift.Companion).restore(obj9);
        Object obj10 = list.get(9);
        TextGeometricTransform restore6 = (AbstractC3255y.d(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(TextGeometricTransform.Companion).restore(obj10);
        Object obj11 = list.get(10);
        LocaleList restore7 = (AbstractC3255y.d(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(LocaleList.Companion).restore(obj11);
        Object obj12 = list.get(11);
        Color restore8 = (AbstractC3255y.d(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(companion).restore(obj12);
        AbstractC3255y.f(restore8);
        long m2986unboximpl2 = restore8.m2986unboximpl();
        Object obj13 = list.get(12);
        TextDecoration restore9 = (AbstractC3255y.d(obj13, bool) || obj13 == null) ? null : SaversKt.getSaver(TextDecoration.Companion).restore(obj13);
        Object obj14 = list.get(13);
        return new SpanStyle(m2986unboximpl, m5379unboximpl, restore3, fontStyle, fontSynthesis, (FontFamily) null, str, m5379unboximpl2, restore5, restore6, restore7, m2986unboximpl2, restore9, (AbstractC3255y.d(obj14, bool) || obj14 == null) ? null : SaversKt.getSaver(Shadow.Companion).restore(obj14), (PlatformSpanStyle) null, (DrawStyle) null, 49184, (AbstractC3247p) null);
    }
}
