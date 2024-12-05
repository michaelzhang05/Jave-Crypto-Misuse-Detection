package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i8) {
        int lineCount = textLayout.getLineCount();
        for (int i9 = 0; i9 < lineCount; i9++) {
            if (textLayout.getLineBottom(i9) > i8) {
                return i9;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z8) {
        if (!z8 || TextUnit.m5367equalsimpl0(textStyle.m4733getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m5367equalsimpl0(textStyle.m4733getLetterSpacingXSAIIZE(), TextUnit.Companion.m5381getUnspecifiedXSAIIZE())) {
            return false;
        }
        int m4738getTextAligne0LSkKk = textStyle.m4738getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5083equalsimpl0(m4738getTextAligne0LSkKk, companion.m5093getUnspecifiede0LSkKk()) || TextAlign.m5083equalsimpl0(textStyle.m4738getTextAligne0LSkKk(), companion.m5092getStarte0LSkKk()) || TextAlign.m5083equalsimpl0(textStyle.m4738getTextAligne0LSkKk(), companion.m5089getJustifye0LSkKk())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m4558toLayoutAlignaXe7zB0(int i8) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5083equalsimpl0(i8, companion.m5090getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m5083equalsimpl0(i8, companion.m5091getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m5083equalsimpl0(i8, companion.m5087getCentere0LSkKk())) {
            return 2;
        }
        if (TextAlign.m5083equalsimpl0(i8, companion.m5092getStarte0LSkKk()) || !TextAlign.m5083equalsimpl0(i8, companion.m5088getEnde0LSkKk())) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m4559toLayoutBreakStrategyxImikfE(int i8) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m5024equalsimpl0(i8, companion.m5030getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m5024equalsimpl0(i8, companion.m5029getHighQualityfcGXIks())) {
            return 1;
        }
        if (!LineBreak.Strategy.m5024equalsimpl0(i8, companion.m5028getBalancedfcGXIks())) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m4560toLayoutHyphenationFrequency3fSNIE(int i8) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m4993equalsimpl0(i8, companion.m4997getAutovmbZdU8())) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        Hyphens.m4993equalsimpl0(i8, companion.m4998getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m4561toLayoutLineBreakStylehpcqdu8(int i8) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m5035equalsimpl0(i8, companion.m5039getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m5035equalsimpl0(i8, companion.m5040getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m5035equalsimpl0(i8, companion.m5041getNormalusljTpc())) {
            return 2;
        }
        if (!LineBreak.Strictness.m5035equalsimpl0(i8, companion.m5042getStrictusljTpc())) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m4562toLayoutLineBreakWordStylewPN0Rpw(int i8) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        if (LineBreak.WordBreak.m5047equalsimpl0(i8, companion.m5051getDefaultjp8hJ3c()) || !LineBreak.WordBreak.m5047equalsimpl0(i8, companion.m5052getPhrasejp8hJ3c())) {
            return 0;
        }
        return 1;
    }
}
