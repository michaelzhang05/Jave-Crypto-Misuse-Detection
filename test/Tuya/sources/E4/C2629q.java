package e4;

import M5.AbstractC1246t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2629q implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final C2629q f30798a = new C2629q();

    /* renamed from: e4.q$a */
    /* loaded from: classes4.dex */
    private static final class a implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30799a = new a();

        private a() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 == 0) {
                return 0;
            }
            int i9 = (i8 / 2) + i8;
            if (i8 % 2 == 0) {
                return i9 - 1;
            }
            return i9;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 == 0) {
                return 0;
            }
            return i8 - (i8 / 3);
        }
    }

    private C2629q() {
    }

    private final String a(String str) {
        return AbstractC1246t.w0(g6.n.O0(str, 2), "-", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        AbstractC3159y.i(text, "text");
        return new TransformedText(new AnnotatedString(a(text.getText()), null, null, 6, null), a.f30799a);
    }
}
