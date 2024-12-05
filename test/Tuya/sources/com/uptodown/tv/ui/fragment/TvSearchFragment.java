package com.uptodown.tv.ui.fragment;

import L5.I;
import L5.t;
import X4.C1498h;
import X5.n;
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
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TvSearchFragment extends SearchSupportFragment implements SearchSupportFragment.SearchResultProvider {

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f29965a;

    /* renamed from: b, reason: collision with root package name */
    private String f29966b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f29967c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29968a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1498h f29970c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.tv.ui.fragment.TvSearchFragment$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0712a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29971a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvSearchFragment f29972b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1498h f29973c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0712a(TvSearchFragment tvSearchFragment, C1498h c1498h, P5.d dVar) {
                super(2, dVar);
                this.f29972b = tvSearchFragment;
                this.f29973c = c1498h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0712a(this.f29972b, this.f29973c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0712a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29971a == 0) {
                    t.b(obj);
                    Intent intent = new Intent(this.f29972b.getActivity(), (Class<?>) TvAppDetailActivity.class);
                    intent.putExtra("appInfo", this.f29973c);
                    this.f29972b.startActivity(intent);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1498h c1498h, P5.d dVar) {
            super(2, dVar);
            this.f29970c = c1498h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f29970c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONObject jSONObject;
            Object e8 = Q5.b.e();
            int i9 = this.f29968a;
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
                    AbstractC3159y.h(requireContext, "requireContext()");
                    X4.I Q8 = new C3312F(requireContext).Q(this.f29970c.i());
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3159y.f(d8);
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
                            this.f29970c.b(jSONObject);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                J0 c8 = C2812b0.c();
                C0712a c0712a = new C0712a(TvSearchFragment.this, this.f29970c, null);
                this.f29968a = 1;
                if (AbstractC2825i.g(c8, c0712a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29974a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, P5.d dVar) {
            super(2, dVar);
            this.f29976c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29976c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29974a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                String str = this.f29976c;
                this.f29974a = 1;
                if (tvSearchFragment.y(str, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29977a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1498h f29979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C1498h c1498h, P5.d dVar) {
            super(2, dVar);
            this.f29979c = c1498h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29979c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29977a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvSearchFragment tvSearchFragment = TvSearchFragment.this;
                C1498h c1498h = this.f29979c;
                this.f29977a = 1;
                if (tvSearchFragment.t(c1498h, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements SearchBar.SearchBarListener {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(TvSearchFragment this$0) {
            AbstractC3159y.i(this$0, "this$0");
            this$0.focusOnResults();
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onKeyboardDismiss(String query) {
            AbstractC3159y.i(query, "query");
            Handler handler = new Handler(Looper.getMainLooper());
            final TvSearchFragment tvSearchFragment = TvSearchFragment.this;
            handler.postDelayed(new Runnable() { // from class: i5.Q
                @Override // java.lang.Runnable
                public final void run() {
                    TvSearchFragment.d.b(TvSearchFragment.this);
                }
            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQueryChange(String str) {
            if (str != null && str.length() > 2 && !g6.n.s(str, TvSearchFragment.this.f29966b, true)) {
                TvSearchFragment.this.f29966b = str;
                TvSearchFragment.this.x(str);
            }
        }

        @Override // androidx.leanback.widget.SearchBar.SearchBarListener
        public void onSearchQuerySubmit(String str) {
            if (str != null && str.length() > 2 && !g6.n.s(str, TvSearchFragment.this.f29966b, true)) {
                TvSearchFragment.this.f29966b = str;
                TvSearchFragment.this.x(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29981a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29983c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29984a;

            a(P5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29984a == 0) {
                    t.b(obj);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, P5.d dVar) {
            super(2, dVar);
            this.f29983c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29983c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusOnResults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(TvSearchFragment this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
        this$0.v((C1498h) obj);
    }

    private final OnItemViewClickedListener s() {
        return new OnItemViewClickedListener() { // from class: i5.P
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                TvSearchFragment.j(TvSearchFragment.this, viewHolder, obj, viewHolder2, row);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C1498h c1498h, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new a(c1498h, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void u(String str) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(str, null), 3, null);
    }

    private final void v(C1498h c1498h) {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(c1498h, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        ArrayObjectAdapter arrayObjectAdapter = this.f29965a;
        AbstractC3159y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (!TextUtils.isEmpty(str)) {
            u(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(String str, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new e(str, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str, List list) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.e());
        AbstractC3159y.f(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayObjectAdapter.add((C1498h) it.next());
        }
        HeaderItem headerItem = new HeaderItem(str);
        ArrayObjectAdapter arrayObjectAdapter2 = this.f29965a;
        AbstractC3159y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(new ListRow(headerItem, arrayObjectAdapter));
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public ObjectAdapter getResultsAdapter() {
        ArrayObjectAdapter arrayObjectAdapter = this.f29965a;
        AbstractC3159y.f(arrayObjectAdapter);
        return arrayObjectAdapter;
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29965a = new ArrayObjectAdapter(new ListRowPresenter());
        setSearchResultProvider(this);
        setOnItemViewClickedListener(s());
        this.f29967c = new ArrayList();
        setSpeechRecognitionCallback(new SpeechRecognitionCallback() { // from class: i5.O
            @Override // androidx.leanback.widget.SpeechRecognitionCallback
            public final void recognizeSpeech() {
                TvSearchFragment.w();
            }
        });
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextChange(String str) {
        if (str != null && str.length() > 2 && !g6.n.s(str, this.f29966b, true)) {
            this.f29966b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public boolean onQueryTextSubmit(String str) {
        if (str != null && str.length() > 2 && !g6.n.s(str, this.f29966b, true)) {
            this.f29966b = str;
            x(str);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        SearchBar searchBar = (SearchBar) view.findViewById(R.id.lb_search_bar);
        if (searchBar != null) {
            searchBar.setSearchBarListener(new d());
        }
    }
}
