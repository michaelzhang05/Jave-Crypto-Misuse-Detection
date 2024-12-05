package c;

import R7.a;
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
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893g extends Fragment implements a.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f14830g = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f14831h;

    /* renamed from: a, reason: collision with root package name */
    public TextView f14832a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f14833b;

    /* renamed from: c, reason: collision with root package name */
    public C1891e f14834c;

    /* renamed from: d, reason: collision with root package name */
    public J7.c f14835d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f14836e;

    /* renamed from: f, reason: collision with root package name */
    public Typeface f14837f;

    /* renamed from: c.g$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        String simpleName = C1893g.class.getSimpleName();
        AbstractC3159y.h(simpleName, "GBCPurposesFragment::class.java.simpleName");
        f14831h = simpleName;
    }

    @Override // R7.a.b
    public void b(R7.d item) {
        AbstractC3159y.i(item, "item");
    }

    @Override // R7.a.b
    public void d(R7.d item) {
        AbstractC3159y.i(item, "item");
    }

    public final void h() {
        RecyclerView.Adapter adapter;
        C1891e c1891e = this.f14834c;
        if (c1891e == null) {
            AbstractC3159y.y("viewModel");
            c1891e = null;
        }
        RecyclerView recyclerView = this.f14833b;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter != null) {
            List<R7.d> gbcList = ((R7.a) adapter).f8874a;
            c1891e.getClass();
            AbstractC3159y.i(gbcList, "gbcList");
            for (R7.d dVar : gbcList) {
                if (AbstractC3159y.d(dVar.f8913b, Boolean.TRUE)) {
                    C1895i.f14839a.d(dVar.f8912a.f1047a, GBCConsentValue.GRANTED);
                } else {
                    C1895i.f14839a.d(dVar.f8912a.f1047a, GBCConsentValue.DENIED);
                }
            }
            SharedStorage sharedStorage = c1891e.f14826a;
            N7.a aVar = N7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, C1895i.f14839a.a(sharedStorage.k(aVar), C1895i.f14841c));
            ChoiceCmpCallback choiceCmpCallback = c1891e.f14827b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(new GoogleBasicConsents(c1891e.a(gbcList, "adStorage"), c1891e.a(gbcList, "adUserData"), c1891e.a(gbcList, "adPersonalization"), c1891e.a(gbcList, "analyticsStorage")));
            }
            AbstractC2829k.d(C2842q0.f31799a, C2812b0.b(), null, new C1890d(null), 2, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.inmobi.cmp.presentation.components.switchlist.SwitchAdapter");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f14834c = (C1891e) new ViewModelProvider(viewModelStore, new C1892f()).get(C1891e.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3875m, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…tainer, container, false)");
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (r8.f2360b == com.inmobi.cmp.core.model.portalconfig.GBCConsentValue.GRANTED) goto L61;
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
        throw new UnsupportedOperationException("Method not decompiled: c.C1893g.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
