package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandButton.java */
/* loaded from: classes.dex */
final class b extends Preference {
    private long V;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, List<Preference> list, long j2) {
        super(context);
        Y0();
        Z0(list);
        this.V = j2 + 1000000;
    }

    private void Y0() {
        K0(q.a);
        H0(o.a);
        Q0(r.f1376b);
        N0(androidx.room.j.MAX_BIND_PARAMETER_CNT);
    }

    private void Z0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence V = preference.V();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(V)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.L())) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(V)) {
                charSequence = charSequence == null ? V : C().getString(r.f1379e, charSequence, V);
            }
        }
        O0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.preference.Preference
    public long G() {
        return this.V;
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        super.j0(lVar);
        lVar.d(false);
    }
}
