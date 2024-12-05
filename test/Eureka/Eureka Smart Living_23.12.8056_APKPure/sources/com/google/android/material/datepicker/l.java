package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f0;

/* loaded from: classes.dex */
public final class l<S> extends q {

    /* renamed from: d0, reason: collision with root package name */
    private int f4992d0;

    /* renamed from: e0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f4993e0;

    /* loaded from: classes.dex */
    class a extends p {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l I1(d dVar, int i6, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.y1(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f4992d0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4993e0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.f4992d0 = bundle.getInt("THEME_RES_ID_KEY");
        f0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f4993e0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(u(), this.f4992d0));
        new a();
        throw null;
    }
}
