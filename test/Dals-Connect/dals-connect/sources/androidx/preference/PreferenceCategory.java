package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.d0.c;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public boolean T0() {
        return !super.Z();
    }

    @Override // androidx.preference.Preference
    public boolean Z() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        TextView textView;
        super.j0(lVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            lVar.itemView.setAccessibilityHeading(true);
            return;
        }
        if (i2 < 21) {
            TypedValue typedValue = new TypedValue();
            if (C().getTheme().resolveAttribute(m.f1358b, typedValue, true) && (textView = (TextView) lVar.a(R.id.title)) != null) {
                if (textView.getCurrentTextColor() != androidx.core.content.a.c(C(), n.a)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public void o0(androidx.core.view.d0.c cVar) {
        c.C0022c q;
        super.o0(cVar);
        if (Build.VERSION.SDK_INT >= 28 || (q = cVar.q()) == null) {
            return;
        }
        cVar.b0(c.C0022c.f(q.c(), q.d(), q.a(), q.b(), true, q.e()));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.f1362f, R.attr.preferenceCategoryStyle));
    }
}
