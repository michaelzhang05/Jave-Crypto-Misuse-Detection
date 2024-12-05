package com.uptodown.tv.ui.fragment;

import O5.I;
import O5.t;
import a5.C1641h;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.SpeechRecognitionCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvSearchFragment;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TvSearchFragment extends SearchSupportFragment implements SearchSupportFragment.SearchResultProvider {

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f30997a;

    /* renamed from: b, reason: collision with root package name */
    private String f30998b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f30999c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31000a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1641h f31002c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.tv.ui.fragment.TvSearchFragment$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0707a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f31003a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvSearchFragment f31004b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1641h f31005c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0707a(TvSearchFragment tvSearchFragment, C1641h c1641h, S5.d dVar) {
                super(2, dVar);
                this.f31004b = tvSearchFragment;
                this.f31005c = c1641h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0707a(this.f31004b, this.f31005c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f31003a == 0) {
                    t.b(obj);
                    Intent intent = new Intent(this.f31004b.getActivity(), (Class<?>) TvAppDetailActivity.class);
                    intent.putExtra("appInfo", this.f31005c);
                    this.f31004b.startActivity(intent);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0707a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1641h c1641h, S5.d dVar) {
            super(2, dVar);
            this.f31002c = c1641h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f31002c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONObject jSONObject;
            Object e8 = T5.b.e();
            int i9 = this.f31000a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    Context requireContext = TvSearchFragment.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    a5.I Q8 = new C3660F(requireContext).Q(this.f31002c.i());
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8);
                        if (!jSONObject2.isNull("success")) {
                            i8 = jSONObject2.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (i8 == 1 && jSONObject != null) {
                            this.f31002c.a(jSONObject);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                C0707a c0707a = new C0707a(TvSearchFragment.this, this.f31002c, null);
                this.f31000a = 1;
                if (AbstractC3360i.g(c8, c0707a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31006a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, S5.d dVar) {
            super(2, dVar);
            this.f31008c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f31008c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f31006a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                String str = this.f31008c;
                this.f31006a = 1;
                if (tvSearchFragment.y(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31009a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1641h f31011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1641h c1641h, S5.d dVar) {
            super(2, dVar);
            this.f31011c = c1641h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f31011c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f31009a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                C1641h c1641h = this.f31011c;
                this.f31009a = 1;
                if (tvSearchFragment.t(c1641h, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements SearchBar.SearchBarListener {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TvSearchFragment this$0) {
            AbstractC3255y.i(this$0, "this$0");
            this$0.focusOnResults();
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onKeyboardDismiss(String query) {
            AbstractC3255y.i(query, "query");
            Handler handler = new Handler(Looper.getMainLooper());
            final TvSearchFragment tvSearchFragment = TvSearchFragment.this;
            handler.postDelayed(new Runnable() { // from class: l5.Q
                @Override // java.lang.Runnable
                public final void run() {
                    TvSearchFragment.d.b(TvSearchFragment.this);
                }
            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQueryChange(String str) {
            if (str != null && str.length() > 2 && !n.s(str, TvSearchFragment.this.f30998b, true)) {
                TvSearchFragment.this.f30998b = str;
                TvSearchFragment.this.x(str);
            }
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQuerySubmit(String str) {
            if (str != null && str.length() > 2 && !n.s(str, TvSearchFragment.this.f30998b, true)) {
                TvSearchFragment.this.f30998b = str;
                TvSearchFragment.this.x(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f31013a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31015c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f31016a;

            a(S5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f31016a == 0) {
                    t.b(obj);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, S5.d dVar) {
            super(2, dVar);
            this.f31015c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f31015c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[Catch: Exception -> 0x0077, TryCatch #0 {Exception -> 0x0077, blocks: (B:12:0x0022, B:14:0x0059, B:16:0x005f, B:18:0x0072, B:19:0x007b, B:21:0x0081, B:23:0x0090, B:26:0x009a, B:28:0x00a2, B:30:0x00a8, B:31:0x00b5, B:33:0x00bb, B:35:0x00d8, B:37:0x00eb, B:40:0x00ee), top: B:11:0x0022 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvSearchFragment.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusOnResults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TvSearchFragment this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
        this$0.v((C1641h) obj);
    }

    private final OnItemViewClickedListener s() {
        return new OnItemViewClickedListener() { // from class: l5.P
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                TvSearchFragment.j(TvSearchFragment.this, viewHolder, obj, viewHolder2, row);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C1641h c1641h, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new a(c1641h, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    private final void u(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(str, null), 3, null);
    }

    private final void v(C1641h c1641h) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(c1641h, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        ArrayObjectAdapter arrayObjectAdapter = this.f30997a;
        AbstractC3255y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (!TextUtils.isEmpty(str)) {
            u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(String str, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new e(str, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str, List list) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.e());
        AbstractC3255y.f(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayObjectAdapter.add((C1641h) it.next());
        }
        HeaderItem headerItem = new HeaderItem(str);
        ArrayObjectAdapter arrayObjectAdapter2 = this.f30997a;
        AbstractC3255y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(new ListRow(headerItem, arrayObjectAdapter));
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public ObjectAdapter getResultsAdapter() {
        ArrayObjectAdapter arrayObjectAdapter = this.f30997a;
        AbstractC3255y.f(arrayObjectAdapter);
        return arrayObjectAdapter;
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30997a = new ArrayObjectAdapter(new ListRowPresenter());
        setSearchResultProvider(this);
        setOnItemViewClickedListener(s());
        this.f30999c = new ArrayList();
        setSpeechRecognitionCallback(new SpeechRecognitionCallback() { // from class: l5.O
            @Override // androidx.leanback.widget.SpeechRecognitionCallback
            public final void recognizeSpeech() {
                TvSearchFragment.w();
            }
        });
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextChange(String str) {
        if (str != null && str.length() > 2 && !n.s(str, this.f30998b, true)) {
            this.f30998b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextSubmit(String str) {
        if (str != null && str.length() > 2 && !n.s(str, this.f30998b, true)) {
            this.f30998b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        SearchBar searchBar = (SearchBar) view.findViewById(R.id.lb_search_bar);
        if (searchBar != null) {
            searchBar.setSearchBarListener(new d());
        }
    }
}
