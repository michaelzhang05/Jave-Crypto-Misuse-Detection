package K5;

import android.text.Editable;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public int f5980c = 1;

    @Override // K5.c
    public Object[] b(Editable editable, int i8) {
        int i9 = this.f5978a;
        int i10 = (i8 - 1) * i9;
        if (i8 > 2) {
            i10 -= (i8 - 2) * i9;
        }
        return new Object[]{new LeadingMarginSpan.Standard(i10)};
    }

    @Override // K5.c
    public void c(Editable text) {
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(text, "text");
        a(text);
        text.setSpan(this, text.length(), text.length(), 17);
        int i8 = this.f5980c;
        this.f5980c = i8 + 1;
        text.append((CharSequence) String.valueOf(i8)).append(". ");
    }
}
