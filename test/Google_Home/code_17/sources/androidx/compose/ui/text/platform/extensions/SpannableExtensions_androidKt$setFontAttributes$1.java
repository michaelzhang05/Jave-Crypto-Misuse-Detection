package androidx.compose.ui.text.platform.extensions;

import O5.I;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ InterfaceC1670p $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, InterfaceC1670p interfaceC1670p) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = interfaceC1670p;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return I.f8278a;
    }

    public final void invoke(SpanStyle spanStyle, int i8, int i9) {
        Spannable spannable = this.$this_setFontAttributes;
        InterfaceC1670p interfaceC1670p = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m4658getFontStyle4Lr2A7w = spanStyle.m4658getFontStyle4Lr2A7w();
        FontStyle m4804boximpl = FontStyle.m4804boximpl(m4658getFontStyle4Lr2A7w != null ? m4658getFontStyle4Lr2A7w.m4810unboximpl() : FontStyle.Companion.m4814getNormal_LCdwA());
        FontSynthesis m4659getFontSynthesisZQGJjVo = spanStyle.m4659getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) interfaceC1670p.invoke(fontFamily, fontWeight, m4804boximpl, FontSynthesis.m4815boximpl(m4659getFontSynthesisZQGJjVo != null ? m4659getFontSynthesisZQGJjVo.m4823unboximpl() : FontSynthesis.Companion.m4824getAllGVVA2EU()))), i8, i9, 33);
    }
}
