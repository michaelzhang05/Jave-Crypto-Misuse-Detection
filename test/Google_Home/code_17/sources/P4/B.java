package p4;

import P5.AbstractC1378t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class B implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    private final String f36970a = " / ";

    /* loaded from: classes4.dex */
    public static final class a implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f36972b;

        a(List list, List list2) {
            this.f36971a = list;
            this.f36972b = list2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            return ((Number) this.f36971a.get(i8)).intValue();
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            List list = this.f36972b;
            int i9 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() < i8 && (i9 = i9 + 1) < 0) {
                        AbstractC1378t.v();
                    }
                }
            }
            return i8 - i9;
        }
    }

    private final List a(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            int i10 = i9 + 1;
            Integer valueOf = Integer.valueOf(i9);
            Integer num = null;
            if (!Character.isDigit(charAt)) {
                valueOf = null;
            }
            if (valueOf != null) {
                num = Integer.valueOf(valueOf.intValue() + 1);
            }
            if (num != null) {
                arrayList.add(num);
            }
            i8++;
            i9 = i10;
        }
        return AbstractC1378t.H0(AbstractC1378t.G0(AbstractC1378t.e(0), AbstractC1378t.g0(arrayList, 1)), Integer.valueOf(str.length()));
    }

    private final List b(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            int i10 = i9 + 1;
            Integer valueOf = Integer.valueOf(i9);
            if (Character.isDigit(charAt)) {
                valueOf = null;
            }
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        boolean z8;
        boolean z9;
        int i8;
        AbstractC3255y.i(text, "text");
        if ((!j6.n.u(text)) && text.charAt(0) != '0' && text.charAt(0) != '1') {
            z8 = true;
        } else {
            z8 = false;
        }
        if (text.length() > 1 && Integer.parseInt(j6.n.U0(text.getText(), 2)) > 12) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 && !z9) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        int i9 = i8 ^ 1;
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < text.length(); i10++) {
            sb.append(text.charAt(i10));
            if (i10 == i9) {
                sb.append(this.f36970a);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new a(a(sb2), b(sb2)));
    }
}
