package p4;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3255y;
import p4.Y;

/* loaded from: classes4.dex */
public final class Z implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    private final Y.a f37347a;

    /* loaded from: classes4.dex */
    public static final class a implements OffsetMapping {
        a() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 <= 2) {
                return i8;
            }
            if (i8 <= 5) {
                return i8 + 1;
            }
            return 7;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 <= 3) {
                return i8;
            }
            if (i8 > 6) {
                return 6;
            }
            return i8 - 1;
        }
    }

    public Z(Y.a format) {
        AbstractC3255y.i(format, "format");
        this.f37347a = format;
    }

    private final TransformedText a(AnnotatedString annotatedString) {
        int length = annotatedString.getText().length();
        String str = "";
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = str + Character.toUpperCase(annotatedString.getText().charAt(i8));
            if (i8 == 2) {
                str2 = str2 + " ";
            }
            str = str2;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), new a());
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        AbstractC3255y.i(text, "text");
        if (this.f37347a instanceof Y.a.C0829a) {
            return a(text);
        }
        return new TransformedText(text, OffsetMapping.Companion.getIdentity());
    }
}
