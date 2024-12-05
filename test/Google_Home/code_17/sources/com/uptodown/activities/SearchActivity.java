package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1483h0;
import Z4.InterfaceC1590d;
import a5.C1633E;
import a5.C1641h;
import a6.InterfaceC1668n;
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
import com.uptodown.views.InstantAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.M;
import l6.X;
import o5.C3674n;
import o5.C3678r;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class SearchActivity extends AbstractActivityC2683a {

    /* renamed from: U, reason: collision with root package name */
    public static final b f29861U = new b(null);

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC3390x0 f29864P;

    /* renamed from: Q, reason: collision with root package name */
    private G4.E f29865Q;

    /* renamed from: R, reason: collision with root package name */
    private a f29866R;

    /* renamed from: T, reason: collision with root package name */
    private final ActivityResultLauncher f29868T;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29862N = O5.l.b(new c());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29863O = new ViewModelLazy(U.b(v.class), new k(this), new j(this), new l(null, this));

    /* renamed from: S, reason: collision with root package name */
    private boolean f29867S = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class a extends ArrayAdapter implements Filterable {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f29869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f29870b;

        /* renamed from: com.uptodown.activities.SearchActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0694a extends Filter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f29871a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f29872b;

            C0694a(SearchActivity searchActivity, a aVar) {
                this.f29871a = searchActivity;
                this.f29872b = aVar;
            }

            @Override // android.widget.Filter
            public CharSequence convertResultToString(Object resultValue) {
                AbstractC3255y.i(resultValue, "resultValue");
                String a8 = ((C1633E) resultValue).a();
                AbstractC3255y.f(a8);
                return a8;
            }

            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                AbstractC3255y.i(charSequence, "charSequence");
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext = this.f29871a.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3674n a8 = aVar.a(applicationContext);
                a8.a();
                ArrayList r02 = a8.r0();
                a8.l();
                if (charSequence.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int size = r02.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String a9 = ((C1633E) r02.get(i8)).a();
                        if (a9 != null && j6.n.H(a9, charSequence, false, 2, null)) {
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
                AbstractC3255y.i(charSequence, "charSequence");
                AbstractC3255y.i(filterResults, "filterResults");
                this.f29872b.clear();
                Object obj = filterResults.values;
                AbstractC3255y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    this.f29872b.add((C1633E) it.next());
                }
                if (filterResults.count > 0) {
                    a aVar = this.f29871a.f29866R;
                    AbstractC3255y.f(aVar);
                    aVar.notifyDataSetChanged();
                } else {
                    a aVar2 = this.f29871a.f29866R;
                    AbstractC3255y.f(aVar2);
                    aVar2.notifyDataSetInvalidated();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchActivity searchActivity, Context context) {
            super(context, -1);
            AbstractC3255y.i(context, "context");
            this.f29870b = searchActivity;
            LayoutInflater from = LayoutInflater.from(context);
            AbstractC3255y.h(from, "from(context)");
            this.f29869a = from;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(SearchActivity this$0, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(view, "view");
            if (UptodownApp.f29058B.a0()) {
                Object tag = view.getTag();
                AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.String");
                C3674n.a aVar = C3674n.f36505t;
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                C3674n a8 = aVar.a(applicationContext);
                a8.a();
                int K8 = a8.K((String) tag);
                a8.l();
                if (K8 > 0) {
                    a aVar2 = this$0.f29866R;
                    AbstractC3255y.f(aVar2);
                    aVar2.getFilter().filter(this$0.p3().f12342b.f12351b.getText().toString());
                }
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Filterable
        public Filter getFilter() {
            return new C0694a(this.f29870b, this);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i8, View view, ViewGroup parent) {
            LinearLayout linearLayout;
            AbstractC3255y.i(parent, "parent");
            C1633E c1633e = (C1633E) getItem(i8);
            if (c1633e != null) {
                if (view != null) {
                    linearLayout = (LinearLayout) view;
                } else {
                    View inflate = this.f29869a.inflate(R.layout.recent_search_item, parent, false);
                    AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    linearLayout = (LinearLayout) inflate;
                }
                TextView textView = (TextView) linearLayout.findViewById(R.id.tv_query_recent_search_item);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_delete_recent_search_item);
                imageView.setTag(c1633e.a());
                final SearchActivity searchActivity = this.f29870b;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchActivity.a.b(SearchActivity.this, view2);
                    }
                });
                textView.setTypeface(H4.j.f3824g.u());
                textView.setText(c1633e.a());
                return linearLayout;
            }
            View inflate2 = this.f29869a.inflate(R.layout.recent_search_item, parent, false);
            AbstractC3255y.g(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) inflate2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1483h0 invoke() {
            return C1483h0.c(SearchActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String D32 = SearchActivity.this.D3(String.valueOf(editable));
            int length = D32.length();
            if (2 <= length && length < 40) {
                SearchActivity.this.E3(D32, 2);
            } else {
                if (SearchActivity.this.f29864P != null) {
                    InterfaceC3390x0 interfaceC3390x0 = SearchActivity.this.f29864P;
                    AbstractC3255y.f(interfaceC3390x0);
                    InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
                }
                if (SearchActivity.this.f29865Q != null) {
                    G4.E e8 = SearchActivity.this.f29865Q;
                    AbstractC3255y.f(e8);
                    e8.c(new ArrayList());
                }
            }
            if (String.valueOf(editable).length() <= 0) {
                G4.E e9 = SearchActivity.this.f29865Q;
                if (e9 != null) {
                    e9.c(new ArrayList());
                }
                SearchActivity.this.p3().f12342b.f12353d.setVisibility(4);
                SearchActivity.this.p3().f12342b.f12354e.setVisibility(0);
                return;
            }
            SearchActivity.this.p3().f12342b.f12353d.setVisibility(0);
            SearchActivity.this.p3().f12342b.f12354e.setVisibility(8);
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
        final /* synthetic */ LinearLayoutManager f29875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchActivity f29876b;

        e(LinearLayoutManager linearLayoutManager, SearchActivity searchActivity) {
            this.f29875a = linearLayoutManager;
            this.f29876b = searchActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int childCount = this.f29875a.getChildCount();
                int itemCount = this.f29875a.getItemCount();
                int findFirstVisibleItemPosition = this.f29875a.findFirstVisibleItemPosition();
                SearchActivity searchActivity = this.f29876b;
                String D32 = searchActivity.D3(searchActivity.p3().f12342b.f12351b.getText().toString());
                if (D32.length() > 2 && childCount + findFirstVisibleItemPosition >= itemCount && !this.f29876b.q3().d()) {
                    this.f29876b.G3(D32);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC1590d {
        f() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0()) {
                SearchActivity.this.F2(app.i());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29878a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchActivity f29880a;

            a(SearchActivity searchActivity) {
                this.f29880a = searchActivity;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
            
                if (r4.b().size() == 0) goto L8;
             */
            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(o5.AbstractC3685y r4, S5.d r5) {
                /*
                    Method dump skipped, instructions count: 395
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.SearchActivity.g.a.emit(o5.y, S5.d):java.lang.Object");
            }
        }

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29878a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L c8 = SearchActivity.this.q3().c();
                a aVar = new a(SearchActivity.this);
                this.f29878a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29881a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29882b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchActivity f29883c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29884d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i8, SearchActivity searchActivity, String str, S5.d dVar) {
            super(2, dVar);
            this.f29882b = i8;
            this.f29883c = searchActivity;
            this.f29884d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f29882b, this.f29883c, this.f29884d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29881a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                long j8 = this.f29882b * 1000;
                this.f29881a = 1;
                if (X.b(j8, this) == e8) {
                    return e8;
                }
            }
            v q32 = this.f29883c.q3();
            SearchActivity searchActivity = this.f29883c;
            q32.b(searchActivity, searchActivity.D3(this.f29884d), 0);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29885a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29887c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, S5.d dVar) {
            super(2, dVar);
            this.f29887c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f29887c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29885a == 0) {
                O5.t.b(obj);
                v q32 = SearchActivity.this.q3();
                SearchActivity searchActivity = SearchActivity.this;
                String D32 = searchActivity.D3(this.f29887c);
                G4.E e8 = SearchActivity.this.f29865Q;
                AbstractC3255y.f(e8);
                q32.b(searchActivity, D32, e8.getItemCount());
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f29888a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29888a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f29889a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29889a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29890a = function0;
            this.f29891b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29890a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29891b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public SearchActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.f3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SearchActivity.I3(SearchActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f29868T = registerForActivityResult;
    }

    private final void A3() {
        try {
            this.f29868T.launch(new Intent("android.speech.action.RECOGNIZE_SPEECH"));
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            Toast.makeText(this, getString(R.string.feature_not_supported), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B3(ArrayList arrayList) {
        this.f29865Q = new G4.E(arrayList, new f(), this);
    }

    private final String C3(String str) {
        return new j6.j("[^a-zA-Z0-9 ]+").f(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D3(String str) {
        AbstractC3255y.f(str);
        return j6.n.A(str, "/", "", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3(String str, int i8) {
        InterfaceC3390x0 d8;
        InterfaceC3390x0 interfaceC3390x0 = this.f29864P;
        if (interfaceC3390x0 != null) {
            AbstractC3255y.f(interfaceC3390x0);
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        d8 = AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(i8, this, str, null), 3, null);
        this.f29864P = d8;
    }

    static /* synthetic */ void F3(SearchActivity searchActivity, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        searchActivity.E3(str, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String str) {
        InterfaceC3390x0 d8;
        if (this.f29867S) {
            InterfaceC3390x0 interfaceC3390x0 = this.f29864P;
            if (interfaceC3390x0 != null) {
                AbstractC3255y.f(interfaceC3390x0);
                if (!interfaceC3390x0.b()) {
                    return;
                }
            }
            if (this.f29865Q != null) {
                q3().e(true);
                G4.E e8 = this.f29865Q;
                if (e8 != null) {
                    e8.d(true);
                }
                d8 = AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(str, null), 3, null);
                this.f29864P = d8;
            }
        }
    }

    private final void H3(String str) {
        C1633E c1633e = new C1633E();
        c1633e.c(C3(str));
        c1633e.d(String.valueOf(System.currentTimeMillis()));
        C3674n a8 = C3674n.f36505t.a(this);
        a8.a();
        Iterator it = a8.r0().iterator();
        while (true) {
            if (it.hasNext()) {
                if (j6.n.s(((C1633E) it.next()).a(), str, true)) {
                    break;
                }
            } else {
                a8.N0(c1633e);
                break;
            }
        }
        a8.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(SearchActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1 && activityResult.getData() != null) {
            Intent data = activityResult.getData();
            AbstractC3255y.f(data);
            ArrayList<String> stringArrayListExtra = data.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra != null) {
                str = stringArrayListExtra.get(0);
            } else {
                str = null;
            }
            this$0.p3().f12342b.f12351b.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1483h0 p3() {
        return (C1483h0) this.f29862N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v q3() {
        return (v) this.f29863O.getValue();
    }

    private final void r3(Intent intent) {
        String stringExtra;
        if (AbstractC3255y.d("android.intent.action.SEARCH", intent.getAction()) && (stringExtra = intent.getStringExtra(MBridgeConstans.DYNAMIC_VIEW_WX_QUERY)) != null) {
            F3(this, stringExtra, 0, 2, null);
        }
    }

    private final void s3() {
        Object systemService = getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(p3().f12342b.f12351b.getWindowToken(), 0);
    }

    private final void t3() {
        setContentView(p3().getRoot());
        ImageView imageView = (ImageView) findViewById(R.id.iv_back_search_bar);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: D4.g3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchActivity.u3(SearchActivity.this, view);
                }
            });
        }
        p3().f12342b.f12353d.setOnClickListener(new View.OnClickListener() { // from class: D4.h3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.v3(SearchActivity.this, view);
            }
        });
        p3().f12342b.f12354e.setOnClickListener(new View.OnClickListener() { // from class: D4.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.w3(SearchActivity.this, view);
            }
        });
        p3().f12342b.f12351b.requestFocus();
        InstantAutoCompleteTextView instantAutoCompleteTextView = p3().f12342b.f12351b;
        j.a aVar = H4.j.f3824g;
        instantAutoCompleteTextView.setTypeface(aVar.u());
        p3().f12342b.f12351b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: D4.j3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean x32;
                x32 = SearchActivity.x3(SearchActivity.this, textView, i8, keyEvent);
                return x32;
            }
        });
        this.f29866R = new a(this, this);
        p3().f12342b.f12351b.setAdapter(this.f29866R);
        p3().f12342b.f12351b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: D4.k3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                SearchActivity.y3(SearchActivity.this, adapterView, view, i8, j8);
            }
        });
        InstantAutoCompleteTextView instantAutoCompleteTextView2 = p3().f12342b.f12351b;
        AbstractC3255y.h(instantAutoCompleteTextView2, "binding.includeSearchBar.actvSearchBar");
        instantAutoCompleteTextView2.addTextChangedListener(new d());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        p3().f12344d.setLayoutManager(linearLayoutManager);
        p3().f12344d.setItemAnimator(new DefaultItemAnimator());
        p3().f12344d.addOnScrollListener(new e(linearLayoutManager, this));
        p3().f12343c.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.z3(view);
            }
        });
        p3().f12345e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(SearchActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(SearchActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.p3().f12342b.f12351b.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(SearchActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.A3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x3(SearchActivity this$0, TextView v8, int i8, KeyEvent keyEvent) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(v8, "v");
        if (i8 != 3) {
            return false;
        }
        String obj = v8.getText().toString();
        if (obj.length() > 0) {
            this$0.s3();
            F3(this$0, obj, 0, 2, null);
            Bundle bundle = new Bundle();
            bundle.putString(MimeTypes.BASE_TYPE_TEXT, obj);
            C3678r t22 = this$0.t2();
            if (t22 != null) {
                t22.b("search", bundle);
            }
            this$0.H3(obj);
            this$0.p3().f12342b.f12351b.dismissDropDown();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(SearchActivity this$0, AdapterView adapterView, View view, int i8, long j8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(adapterView, "adapterView");
        if (UptodownApp.f29058B.a0()) {
            Object itemAtPosition = adapterView.getItemAtPosition(i8);
            AbstractC3255y.g(itemAtPosition, "null cannot be cast to non-null type com.uptodown.models.RecentSearch");
            C1633E c1633e = (C1633E) itemAtPosition;
            if (c1633e.a() != null) {
                String a8 = c1633e.a();
                AbstractC3255y.f(a8);
                F3(this$0, a8, 0, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t3();
        a aVar = this.f29866R;
        AbstractC3255y.f(aVar);
        aVar.getFilter().filter(p3().f12342b.f12351b.getText().toString());
        Intent intent = getIntent();
        if (intent != null) {
            r3(intent);
        }
        p3().f12343c.f11842b.setVisibility(8);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new g(null), 2, null);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3255y.i(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        AbstractC3255y.h(menuInflater, "menuInflater");
        menuInflater.inflate(R.menu.menu_search, menu);
        Object systemService = getSystemService("search");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.app.SearchManager");
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
        AbstractC3255y.i(intent, "intent");
        super.onNewIntent(intent);
        r3(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        s3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(p3().f12342b.f12351b, 1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startSearch(null, false, new Bundle(), false);
        return true;
    }
}
