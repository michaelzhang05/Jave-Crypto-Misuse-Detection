package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
abstract class q extends Fragment {

    /* renamed from: c0, reason: collision with root package name */
    protected final LinkedHashSet f5015c0 = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G1(p pVar) {
        return this.f5015c0.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H1() {
        this.f5015c0.clear();
    }
}
