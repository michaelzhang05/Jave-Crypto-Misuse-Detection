package N5;

import android.text.Editable;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes5.dex */
public final class e extends c {
    @Override // N5.c
    public Object[] b(Editable editable, int i8) {
        int i9 = 10;
        if (i8 > 1) {
            i9 = 10 - this.f7758b.getLeadingMargin(true);
            if (i8 > 2) {
                i9 -= (i8 - 2) * this.f7757a;
            }
        }
        return new Object[]{new LeadingMarginSpan.Standard((i8 - 1) * this.f7757a), new BulletSpan(i9)};
    }
}
