package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@Immutable
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j8, TextRange textRange, AbstractC3151p abstractC3151p) {
        this(annotatedString, j8, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4924copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j8, TextRange textRange, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i8 & 2) != 0) {
            j8 = textFieldValue.selection;
        }
        if ((i8 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4926copy3r_uNRQ(annotatedString, j8, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4926copy3r_uNRQ(AnnotatedString annotatedString, long j8, TextRange textRange) {
        return new TextFieldValue(annotatedString, j8, textRange, (AbstractC3151p) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (TextRange.m4685equalsimpl0(this.selection, textFieldValue.selection) && AbstractC3159y.d(this.composition, textFieldValue.composition) && AbstractC3159y.d(this.annotatedString, textFieldValue.annotatedString)) {
            return true;
        }
        return false;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m4928getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m4929getSelectiond9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int i8;
        int hashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m4693hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        if (textRange != null) {
            i8 = TextRange.m4693hashCodeimpl(textRange.m4696unboximpl());
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m4695toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j8, TextRange textRange, AbstractC3151p abstractC3151p) {
        this(str, j8, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4927copy3r_uNRQ(String str, long j8, TextRange textRange) {
        AbstractC3151p abstractC3151p = null;
        return new TextFieldValue(new AnnotatedString(str, null, null, 6, abstractC3151p), j8, textRange, abstractC3151p);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j8, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m4698coerceIn8ffj60Q(j8, 0, getText().length());
        this.composition = textRange != null ? TextRange.m4680boximpl(TextRangeKt.m4698coerceIn8ffj60Q(textRange.m4696unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4925copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j8, TextRange textRange, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = textFieldValue.selection;
        }
        if ((i8 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4927copy3r_uNRQ(str, j8, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j8, TextRange textRange, int i8, AbstractC3151p abstractC3151p) {
        this(annotatedString, (i8 & 2) != 0 ? TextRange.Companion.m4697getZerod9O1mEE() : j8, (i8 & 4) != 0 ? null : textRange, (AbstractC3151p) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j8, TextRange textRange, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? TextRange.Companion.m4697getZerod9O1mEE() : j8, (i8 & 4) != 0 ? null : textRange, (AbstractC3151p) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextFieldValue(java.lang.String r8, long r9, androidx.compose.ui.text.TextRange r11) {
        /*
            r7 = this;
            androidx.compose.ui.text.AnnotatedString r6 = new androidx.compose.ui.text.AnnotatedString
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r6
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextFieldValue.<init>(java.lang.String, long, androidx.compose.ui.text.TextRange):void");
    }
}
