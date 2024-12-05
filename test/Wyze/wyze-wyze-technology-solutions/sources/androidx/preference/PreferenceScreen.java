package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.j;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean e0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.d.g.a(context, m.f1364h, R.attr.preferenceScreenStyle));
        this.e0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public boolean f1() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void k0() {
        j.b e2;
        if (H() != null || F() != null || e1() == 0 || (e2 = R().e()) == null) {
            return;
        }
        e2.onNavigateToScreen(this);
    }

    public boolean m1() {
        return this.e0;
    }
}
