package androidx.compose.ui.text.platform.extensions;

import L5.I;
import X5.o;
import X5.p;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends AbstractC3160z implements o {
    final /* synthetic */ p $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, p pVar) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = pVar;
    }

    @Override // X5.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return I.f6487a;
    }

    public final void invoke(SpanStyle spanStyle, int i8, int i9) {
        Spannable spannable = this.$this_setFontAttributes;
        p pVar = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m4653getFontStyle4Lr2A7w = spanStyle.m4653getFontStyle4Lr2A7w();
        FontStyle m4799boximpl = FontStyle.m4799boximpl(m4653getFontStyle4Lr2A7w != null ? m4653getFontStyle4Lr2A7w.m4805unboximpl() : FontStyle.Companion.m4809getNormal_LCdwA());
        FontSynthesis m4654getFontSynthesisZQGJjVo = spanStyle.m4654getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) pVar.invoke(fontFamily, fontWeight, m4799boximpl, FontSynthesis.m4810boximpl(m4654getFontSynthesisZQGJjVo != null ? m4654getFontSynthesisZQGJjVo.m4818unboximpl() : FontSynthesis.Companion.m4819getAllGVVA2EU()))), i8, i9, 33);
    }
}
