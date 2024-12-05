package c;

import U7.a;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.C3377q0;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1999g extends Fragment implements a.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f15542g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f15543h;

    /* renamed from: a, reason: collision with root package name */
    public TextView f15544a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f15545b;

    /* renamed from: c, reason: collision with root package name */
    public C1997e f15546c;

    /* renamed from: d, reason: collision with root package name */
    public M7.c f15547d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f15548e;

    /* renamed from: f, reason: collision with root package name */
    public Typeface f15549f;

    /* renamed from: c.g$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        String simpleName = C1999g.class.getSimpleName();
        AbstractC3255y.h(simpleName, "GBCPurposesFragment::class.java.simpleName");
        f15543h = simpleName;
    }

    @Override // U7.a.b
    public void c(U7.d item) {
        AbstractC3255y.i(item, "item");
    }

    @Override // U7.a.b
    public void d(U7.d item) {
        AbstractC3255y.i(item, "item");
    }

    public final void h() {
        RecyclerView.Adapter adapter;
        C1997e c1997e = this.f15546c;
        if (c1997e == null) {
            AbstractC3255y.y("viewModel");
            c1997e = null;
        }
        RecyclerView recyclerView = this.f15545b;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter != null) {
            List<U7.d> gbcList = ((U7.a) adapter).f10500a;
            c1997e.getClass();
            AbstractC3255y.i(gbcList, "gbcList");
            for (U7.d dVar : gbcList) {
                if (AbstractC3255y.d(dVar.f10539b, Boolean.TRUE)) {
                    C2001i.f15551a.d(dVar.f10538a.f2642a, GBCConsentValue.GRANTED);
                } else {
                    C2001i.f15551a.d(dVar.f10538a.f2642a, GBCConsentValue.DENIED);
                }
            }
            SharedStorage sharedStorage = c1997e.f15538a;
            Q7.a aVar = Q7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, C2001i.f15551a.a(sharedStorage.k(aVar), C2001i.f15553c));
            ChoiceCmpCallback choiceCmpCallback = c1997e.f15539b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(new GoogleBasicConsents(c1997e.a(gbcList, "adStorage"), c1997e.a(gbcList, "adUserData"), c1997e.a(gbcList, "adPersonalization"), c1997e.a(gbcList, "analyticsStorage")));
            }
            AbstractC3364k.d(C3377q0.f34651a, C3347b0.b(), null, new C1996d(null), 2, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.inmobi.cmp.presentation.components.switchlist.SwitchAdapter");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f15546c = (C1997e) new ViewModelProvider(viewModelStore, new C1998f()).get(C1997e.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5870m, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…tainer, container, false)");
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r8.f3910b == com.inmobi.cmp.core.model.portalconfig.GBCConsentValue.GRANTED) goto L61;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.C1999g.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
