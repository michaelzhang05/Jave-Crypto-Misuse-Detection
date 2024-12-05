package com.uptodown.activities;

import E4.j;
import L5.C1224h;
import L5.InterfaceC1227k;
import T4.C1374h0;
import W4.InterfaceC1481d;
import X4.C1498h;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.SearchActivity;
import com.uptodown.activities.w;
import com.uptodown.views.InstantAutoCompleteTextView;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.InterfaceC2855x0;
import i6.M;
import i6.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.U;
import l5.AbstractC3337y;
import l5.C3326n;
import l5.C3330r;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public final class SearchActivity extends AbstractActivityC2489a {

    /* renamed from: U, reason: collision with root package name */
    public static final b f28807U = new b(null);

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC2855x0 f28810P;

    /* renamed from: Q, reason: collision with root package name */
    private D4.E f28811Q;

    /* renamed from: R, reason: collision with root package name */
    private a f28812R;

    /* renamed from: T, reason: collision with root package name */
    private final ActivityResultLauncher f28814T;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1227k f28808N = L5.l.b(new c());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1227k f28809O = new ViewModelLazy(U.b(w.class), new k(this), new j(this), new l(null, this));

    /* renamed from: S, reason: collision with root package name */
    private boolean f28813S = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class a extends ArrayAdapter implements Filterable {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f28816b;

        /* renamed from: com.uptodown.activities.SearchActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0698a extends Filter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f28817a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f28818b;

            C0698a(SearchActivity searchActivity, a aVar) {
                this.f28817a = searchActivity;
                this.f28818b = aVar;
            }

            @Override // android.widget.Filter
            public CharSequence convertResultToString(Object resultValue) {
                AbstractC3159y.i(resultValue, "resultValue");
                String a8 = ((X4.E) resultValue).a();
                AbstractC3159y.f(a8);
                return a8;
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                AbstractC3159y.i(charSequence, "charSequence");
                C3326n.a aVar = C3326n.f34504t;
                Context applicationContext = this.f28817a.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3326n a8 = aVar.a(applicationContext);
                a8.a();
                ArrayList r02 = a8.r0();
                a8.g();
                if (charSequence.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = r02.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String a9 = ((X4.E) r02.get(i8)).a();
                        if (a9 != null && g6.n.H(a9, charSequence, false, 2, null)) {
                            arrayList.add(r02.get(i8));
                        }
                    }
                    r02 = arrayList;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = r02;
                filterResults.count = r02.size();
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                AbstractC3159y.i(charSequence, "charSequence");
                AbstractC3159y.i(filterResults, "filterResults");
                this.f28818b.clear();
                Object obj = filterResults.values;
                AbstractC3159y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    this.f28818b.add((X4.E) it.next());
                }
                if (filterResults.count > 0) {
                    a aVar = this.f28817a.f28812R;
                    AbstractC3159y.f(aVar);
                    aVar.notifyDataSetChanged();
                } else {
                    a aVar2 = this.f28817a.f28812R;
                    AbstractC3159y.f(aVar2);
                    aVar2.notifyDataSetInvalidated();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchActivity searchActivity, Context context) {
            super(context, -1);
            AbstractC3159y.i(context, "context");
            this.f28816b = searchActivity;
            LayoutInflater from = LayoutInflater.from(context);
            AbstractC3159y.h(from, "from(context)");
            this.f28815a = from;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SearchActivity this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(view, "view");
            if (UptodownApp.f28003B.a0()) {
                Object tag = view.getTag();
                AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.String");
                C3326n.a aVar = C3326n.f34504t;
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3159y.h(applicationContext, "applicationContext");
                C3326n a8 = aVar.a(applicationContext);
                a8.a();
                int K8 = a8.K((String) tag);
                a8.g();
                if (K8 > 0) {
                    a aVar2 = this$0.f28812R;
                    AbstractC3159y.f(aVar2);
                    aVar2.getFilter().filter(this$0.p3().f10685b.f10694b.getText().toString());
                }
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            return new C0698a(this.f28816b, this);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i8, View view, ViewGroup parent) {
            LinearLayout linearLayout;
            AbstractC3159y.i(parent, "parent");
            X4.E e8 = (X4.E) getItem(i8);
            if (e8 != null) {
                if (view != null) {
                    linearLayout = (LinearLayout) view;
                } else {
                    View inflate = this.f28815a.inflate(R.layout.recent_search_item, parent, false);
                    AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    linearLayout = (LinearLayout) inflate;
                }
                TextView textView = (TextView) linearLayout.findViewById(R.id.tv_query_recent_search_item);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_delete_recent_search_item);
                imageView.setTag(e8.a());
                final SearchActivity searchActivity = this.f28816b;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchActivity.a.b(SearchActivity.this, view2);
                    }
                });
                textView.setTypeface(E4.j.f2274g.u());
                textView.setText(e8.a());
                return linearLayout;
            }
            View inflate2 = this.f28815a.inflate(R.layout.recent_search_item, parent, false);
            AbstractC3159y.g(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) inflate2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1374h0 invoke() {
            return C1374h0.c(SearchActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String C32 = SearchActivity.this.C3(String.valueOf(editable));
            int length = C32.length();
            if (2 <= length && length < 40) {
                SearchActivity.this.D3(C32, 2);
            } else {
                if (SearchActivity.this.f28810P != null) {
                    InterfaceC2855x0 interfaceC2855x0 = SearchActivity.this.f28810P;
                    AbstractC3159y.f(interfaceC2855x0);
                    InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
                }
                if (SearchActivity.this.f28811Q != null) {
                    D4.E e8 = SearchActivity.this.f28811Q;
                    AbstractC3159y.f(e8);
                    e8.c(new ArrayList());
                }
            }
            if (String.valueOf(editable).length() <= 0) {
                D4.E e9 = SearchActivity.this.f28811Q;
                if (e9 != null) {
                    e9.c(new ArrayList());
                }
                SearchActivity.this.p3().f10685b.f10696d.setVisibility(4);
                SearchActivity.this.p3().f10685b.f10697e.setVisibility(0);
                return;
            }
            SearchActivity.this.p3().f10685b.f10696d.setVisibility(0);
            SearchActivity.this.p3().f10685b.f10697e.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f28821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f28822b;

        e(LinearLayoutManager linearLayoutManager, SearchActivity searchActivity) {
            this.f28821a = linearLayoutManager;
            this.f28822b = searchActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3159y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int childCount = this.f28821a.getChildCount();
                int itemCount = this.f28821a.getItemCount();
                int findFirstVisibleItemPosition = this.f28821a.findFirstVisibleItemPosition();
                SearchActivity searchActivity = this.f28822b;
                String C32 = searchActivity.C3(searchActivity.p3().f10685b.f10694b.getText().toString());
                if (C32.length() > 2 && childCount + findFirstVisibleItemPosition >= itemCount && !this.f28822b.q3().d()) {
                    this.f28822b.F3(C32);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC1481d {
        f() {
        }

        @Override // W4.InterfaceC1481d
        public void b(C1498h app) {
            AbstractC3159y.i(app, "app");
            if (UptodownApp.f28003B.a0()) {
                SearchActivity.this.F2(app.i());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28824a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f28826a;

            a(SearchActivity searchActivity) {
                this.f28826a = searchActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3337y abstractC3337y, P5.d dVar) {
                if (AbstractC3159y.d(abstractC3337y, AbstractC3337y.a.f34547a)) {
                    this.f28826a.p3().f10685b.f10698f.setVisibility(0);
                } else if (abstractC3337y instanceof AbstractC3337y.c) {
                    AbstractC3337y.c cVar = (AbstractC3337y.c) abstractC3337y;
                    this.f28826a.f28813S = ((w.b) cVar.a()).b();
                    if (this.f28826a.f28811Q == null) {
                        this.f28826a.B3(((w.b) cVar.a()).c());
                        this.f28826a.p3().f10687d.setAdapter(this.f28826a.f28811Q);
                    } else if (this.f28826a.p3().f10685b.f10694b.getText().toString().length() <= 0) {
                        D4.E e8 = this.f28826a.f28811Q;
                        AbstractC3159y.f(e8);
                        e8.c(new ArrayList());
                    } else {
                        if (this.f28826a.p3().f10687d.getAdapter() == null) {
                            this.f28826a.p3().f10687d.setAdapter(this.f28826a.f28811Q);
                        }
                        if (((w.b) cVar.a()).a()) {
                            D4.E e9 = this.f28826a.f28811Q;
                            AbstractC3159y.f(e9);
                            e9.c(((w.b) cVar.a()).c());
                        } else if (((w.b) cVar.a()).c().size() > 0) {
                            D4.E e10 = this.f28826a.f28811Q;
                            AbstractC3159y.f(e10);
                            e10.a(((w.b) cVar.a()).c());
                        }
                        D4.E e11 = this.f28826a.f28811Q;
                        AbstractC3159y.f(e11);
                        if (e11.b().size() == 0) {
                            this.f28826a.p3().f10688e.setVisibility(0);
                            this.f28826a.p3().f10687d.setVisibility(8);
                        } else {
                            this.f28826a.p3().f10688e.setVisibility(8);
                            this.f28826a.p3().f10687d.setVisibility(0);
                        }
                    }
                    this.f28826a.q3().e(false);
                    D4.E e12 = this.f28826a.f28811Q;
                    if (e12 != null) {
                        e12.d(false);
                    }
                    this.f28826a.p3().f10686c.f10185b.setVisibility(8);
                    this.f28826a.p3().f10685b.f10698f.setVisibility(4);
                } else {
                    AbstractC3159y.d(abstractC3337y, AbstractC3337y.b.f34548a);
                }
                return L5.I.f6487a;
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28824a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K c8 = SearchActivity.this.q3().c();
                a aVar = new a(SearchActivity.this);
                this.f28824a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchActivity f28829c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, SearchActivity searchActivity, String str, P5.d dVar) {
            super(2, dVar);
            this.f28828b = i8;
            this.f28829c = searchActivity;
            this.f28830d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new h(this.f28828b, this.f28829c, this.f28830d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28827a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                long j8 = this.f28828b * 1000;
                this.f28827a = 1;
                if (X.b(j8, this) == e8) {
                    return e8;
                }
            }
            w q32 = this.f28829c.q3();
            SearchActivity searchActivity = this.f28829c;
            q32.b(searchActivity, searchActivity.C3(this.f28830d), 0);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28831a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, P5.d dVar) {
            super(2, dVar);
            this.f28833c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new i(this.f28833c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28831a == 0) {
                L5.t.b(obj);
                w q32 = SearchActivity.this.q3();
                SearchActivity searchActivity = SearchActivity.this;
                String C32 = searchActivity.C3(this.f28833c);
                D4.E e8 = SearchActivity.this.f28811Q;
                AbstractC3159y.f(e8);
                q32.b(searchActivity, C32, e8.getItemCount());
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f28834a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f28834a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f28835a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f28835a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f28837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f28836a = function0;
            this.f28837b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28836a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f28837b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public SearchActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: A4.e3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SearchActivity.H3(SearchActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f28814T = registerForActivityResult;
    }

    private final void A3() {
        try {
            this.f28814T.launch(new Intent("android.speech.action.RECOGNIZE_SPEECH"));
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            Toast.makeText(this, getString(R.string.feature_not_supported), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(ArrayList arrayList) {
        this.f28811Q = new D4.E(arrayList, new f(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C3(String str) {
        AbstractC3159y.f(str);
        return g6.n.A(str, "/", "", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(String str, int i8) {
        InterfaceC2855x0 d8;
        InterfaceC2855x0 interfaceC2855x0 = this.f28810P;
        if (interfaceC2855x0 != null) {
            AbstractC3159y.f(interfaceC2855x0);
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        d8 = AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(i8, this, str, null), 3, null);
        this.f28810P = d8;
    }

    static /* synthetic */ void E3(SearchActivity searchActivity, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        searchActivity.D3(str, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(String str) {
        InterfaceC2855x0 d8;
        if (this.f28813S) {
            InterfaceC2855x0 interfaceC2855x0 = this.f28810P;
            if (interfaceC2855x0 != null) {
                AbstractC3159y.f(interfaceC2855x0);
                if (!interfaceC2855x0.b()) {
                    return;
                }
            }
            if (this.f28811Q != null) {
                q3().e(true);
                D4.E e8 = this.f28811Q;
                if (e8 != null) {
                    e8.d(true);
                }
                d8 = AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(str, null), 3, null);
                this.f28810P = d8;
            }
        }
    }

    private final void G3(String str) {
        X4.E e8 = new X4.E();
        e8.c(str);
        e8.d(String.valueOf(System.currentTimeMillis()));
        C3326n a8 = C3326n.f34504t.a(this);
        a8.a();
        Iterator it = a8.r0().iterator();
        while (true) {
            if (it.hasNext()) {
                if (g6.n.s(((X4.E) it.next()).a(), str, true)) {
                    break;
                }
            } else {
                a8.N0(e8);
                break;
            }
        }
        a8.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(SearchActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Intent data = activityResult.getData();
            AbstractC3159y.f(data);
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra != null) {
                str = stringArrayListExtra.get(0);
            } else {
                str = null;
            }
            this$0.p3().f10685b.f10694b.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1374h0 p3() {
        return (C1374h0) this.f28808N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w q3() {
        return (w) this.f28809O.getValue();
    }

    private final void r3(Intent intent) {
        String stringExtra;
        if (AbstractC3159y.d("android.intent.action.SEARCH", intent.getAction()) && (stringExtra = intent.getStringExtra(MBridgeConstans.DYNAMIC_VIEW_WX_QUERY)) != null) {
            E3(this, stringExtra, 0, 2, null);
        }
    }

    private final void s3() {
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(p3().f10685b.f10694b.getWindowToken(), 0);
    }

    private final void t3() {
        setContentView(p3().getRoot());
        ImageView imageView = (ImageView) findViewById(R.id.iv_back_search_bar);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: A4.f3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchActivity.u3(SearchActivity.this, view);
                }
            });
        }
        p3().f10685b.f10696d.setOnClickListener(new View.OnClickListener() { // from class: A4.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.v3(SearchActivity.this, view);
            }
        });
        p3().f10685b.f10697e.setOnClickListener(new View.OnClickListener() { // from class: A4.h3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.w3(SearchActivity.this, view);
            }
        });
        p3().f10685b.f10694b.requestFocus();
        InstantAutoCompleteTextView instantAutoCompleteTextView = p3().f10685b.f10694b;
        j.a aVar = E4.j.f2274g;
        instantAutoCompleteTextView.setTypeface(aVar.u());
        p3().f10685b.f10694b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: A4.i3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean x32;
                x32 = SearchActivity.x3(SearchActivity.this, textView, i8, keyEvent);
                return x32;
            }
        });
        this.f28812R = new a(this, this);
        p3().f10685b.f10694b.setAdapter(this.f28812R);
        p3().f10685b.f10694b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: A4.j3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                SearchActivity.y3(SearchActivity.this, adapterView, view, i8, j8);
            }
        });
        InstantAutoCompleteTextView instantAutoCompleteTextView2 = p3().f10685b.f10694b;
        AbstractC3159y.h(instantAutoCompleteTextView2, "binding.includeSearchBar.actvSearchBar");
        instantAutoCompleteTextView2.addTextChangedListener(new d());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        p3().f10687d.setLayoutManager(linearLayoutManager);
        p3().f10687d.setItemAnimator(new DefaultItemAnimator());
        p3().f10687d.addOnScrollListener(new e(linearLayoutManager, this));
        p3().f10686c.f10185b.setOnClickListener(new View.OnClickListener() { // from class: A4.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.z3(view);
            }
        });
        p3().f10688e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(SearchActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            this$0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(SearchActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            this$0.p3().f10685b.f10694b.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(SearchActivity this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (UptodownApp.f28003B.a0()) {
            this$0.A3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x3(SearchActivity this$0, TextView v8, int i8, KeyEvent keyEvent) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(v8, "v");
        if (i8 != 3) {
            return false;
        }
        String obj = v8.getText().toString();
        if (obj.length() > 0) {
            this$0.s3();
            E3(this$0, obj, 0, 2, null);
            Bundle bundle = new Bundle();
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, obj);
            C3330r t22 = this$0.t2();
            if (t22 != null) {
                t22.b("search", bundle);
            }
            this$0.G3(obj);
            this$0.p3().f10685b.f10694b.dismissDropDown();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(SearchActivity this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(adapterView, "adapterView");
        if (UptodownApp.f28003B.a0()) {
            Object itemAtPosition = adapterView.getItemAtPosition(i8);
            AbstractC3159y.g(itemAtPosition, "null cannot be cast to non-null type com.uptodown.models.RecentSearch");
            X4.E e8 = (X4.E) itemAtPosition;
            if (e8.a() != null) {
                String a8 = e8.a();
                AbstractC3159y.f(a8);
                E3(this$0, a8, 0, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t3();
        a aVar = this.f28812R;
        AbstractC3159y.f(aVar);
        aVar.getFilter().filter(p3().f10685b.f10694b.getText().toString());
        Intent intent = getIntent();
        if (intent != null) {
            r3(intent);
        }
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), C2812b0.c(), null, new g(null), 2, null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3159y.i(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        AbstractC3159y.h(menuInflater, "menuInflater");
        menuInflater.inflate(R.menu.menu_search, menu);
        Object systemService = getSystemService("search");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.SearchManager");
        SearchManager searchManager = (SearchManager) systemService;
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setIconifiedByDefault(false);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC3159y.i(intent, "intent");
        super.onNewIntent(intent);
        r3(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        s3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2489a, F4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("input_method");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(p3().f10685b.f10694b, 1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startSearch(null, false, new Bundle(), false);
        return true;
    }
}
