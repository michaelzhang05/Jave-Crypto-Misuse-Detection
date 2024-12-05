package com.uptodown.tv.ui.fragment;

import L5.I;
import L5.t;
import N4.q;
import N4.w;
import X4.C1505o;
import X5.n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import l5.C3329q;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class TvMyDownloadsFragment extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final a f29935e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f29936a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f29937b;

    /* renamed from: c, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f29938c = new d(this);

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f29939d = new ArrayList();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj instanceof File) {
                TvMyDownloadsFragment.this.o((File) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29941a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29943a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyDownloadsFragment f29944b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyDownloadsFragment tvMyDownloadsFragment, P5.d dVar) {
                super(2, dVar);
                this.f29944b = tvMyDownloadsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29944b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29943a == 0) {
                    t.b(obj);
                    if (this.f29944b.f29939d != null) {
                        this.f29944b.r();
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29941a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    ArrayList arrayList = new ArrayList();
                    if (TvMyDownloadsFragment.this.getContext() != null) {
                        C3329q c3329q = new C3329q();
                        Context requireContext = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3159y.h(requireContext, "requireContext()");
                        ArrayList d8 = c3329q.d(requireContext);
                        C3329q c3329q2 = new C3329q();
                        Context requireContext2 = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3159y.h(requireContext2, "requireContext()");
                        d8.addAll(c3329q2.a(requireContext2));
                        PackageManager pm = TvMyDownloadsFragment.this.requireContext().getPackageManager();
                        Iterator it = d8.iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            String name = file.getName();
                            AbstractC3159y.h(name, "file.name");
                            boolean z8 = false;
                            if (g6.n.r(name, ".apk", false, 2, null)) {
                                AbstractC3159y.h(pm, "pm");
                                String absolutePath = file.getAbsolutePath();
                                AbstractC3159y.h(absolutePath, "file.absolutePath");
                                PackageInfo c8 = q.c(pm, absolutePath, 128);
                                if (c8 != null) {
                                    try {
                                        Bundle bundle = c8.applicationInfo.metaData;
                                        if (bundle != null && bundle.containsKey("com.android.vending.splits.required")) {
                                            Object obj2 = c8.applicationInfo.metaData.get("com.android.vending.splits.required");
                                            AbstractC3159y.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                            z8 = ((Boolean) obj2).booleanValue();
                                        }
                                    } catch (Exception e9) {
                                        e9.printStackTrace();
                                    }
                                    if (!z8) {
                                        arrayList.add(file);
                                    }
                                } else {
                                    String name2 = file.getName();
                                    AbstractC3159y.h(name2, "file.name");
                                    if (!g6.n.C(name2, "split_config", false, 2, null)) {
                                        arrayList.add(file);
                                    }
                                }
                            } else {
                                w.a aVar = w.f7281b;
                                String name3 = file.getName();
                                AbstractC3159y.h(name3, "file.name");
                                if (aVar.a(name3)) {
                                    arrayList.add(file);
                                }
                            }
                        }
                        TvMyDownloadsFragment.this.f29939d = arrayList;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c9 = C2812b0.c();
                a aVar2 = new a(TvMyDownloadsFragment.this, null);
                this.f29941a = 1;
                if (AbstractC2825i.g(c9, aVar2, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends BrowseSupportFragment.MainFragmentAdapter {
        d(TvMyDownloadsFragment tvMyDownloadsFragment) {
            super(tvMyDownloadsFragment);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29945a;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29945a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyDownloadsFragment tvMyDownloadsFragment = TvMyDownloadsFragment.this;
                this.f29945a = 1;
                if (tvMyDownloadsFragment.s(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final File file) {
        AlertDialog alertDialog = this.f29937b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (getActivity() != null && !requireActivity().isFinishing() && file != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3159y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.tv_apk_clicked_dialog, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.tv_install)).setOnClickListener(new View.OnClickListener() { // from class: i5.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.p(TvMyDownloadsFragment.this, file, view);
                }
            });
            ((TextView) inflate.findViewById(R.id.tv_delete)).setOnClickListener(new View.OnClickListener() { // from class: i5.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.q(file, this, view);
                }
            });
            builder.setView(inflate);
            AlertDialog create = builder.create();
            this.f29937b = create;
            if (create != null) {
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TvMyDownloadsFragment this$0, File file, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        String name = file.getName();
        AbstractC3159y.h(name, "fileDownloadedClicked.name");
        C1505o Y7 = a8.Y(name);
        a8.g();
        if (Y7 == null || Y7.Z() <= 0 || Y7.Z() >= 100) {
            UptodownApp.a aVar2 = UptodownApp.f28003B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            UptodownApp.a.Z(aVar2, file, requireActivity, null, 4, null);
        }
        AlertDialog alertDialog = this$0.f29937b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(File file, TvMyDownloadsFragment this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (file.delete()) {
            C3326n.a aVar = C3326n.f34504t;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C3326n a8 = aVar.a(requireContext);
            a8.a();
            String name = file.getName();
            AbstractC3159y.h(name, "fileDownloadedClicked.name");
            a8.A(name);
            a8.g();
            ArrayObjectAdapter arrayObjectAdapter = this$0.f29936a;
            AbstractC3159y.f(arrayObjectAdapter);
            arrayObjectAdapter.remove(file);
        }
        AlertDialog alertDialog = this$0.f29937b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        ArrayObjectAdapter arrayObjectAdapter = this.f29936a;
        AbstractC3159y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        ArrayList arrayList = this.f29939d;
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter2 = this.f29936a;
            AbstractC3159y.f(arrayObjectAdapter2);
            ArrayList arrayList2 = this.f29939d;
            AbstractC3159y.f(arrayList2);
            arrayObjectAdapter2.add(arrayList2.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    private final void t() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.f29938c;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.n());
        this.f29936a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        setTitle(getString(R.string.downloads_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        t();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        try {
            C3326n.a aVar = C3326n.f34504t;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            C3326n a8 = aVar.a(requireContext);
            a8.a();
            a8.i1();
            a8.g();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.onPause();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C3335w.f34546a.g(context);
        }
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void u(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                ArrayObjectAdapter arrayObjectAdapter = this.f29936a;
                AbstractC3159y.f(arrayObjectAdapter);
                ArrayObjectAdapter arrayObjectAdapter2 = this.f29936a;
                AbstractC3159y.f(arrayObjectAdapter2);
                arrayObjectAdapter.notifyArrayItemRangeChanged(0, arrayObjectAdapter2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                ArrayObjectAdapter arrayObjectAdapter3 = this.f29936a;
                AbstractC3159y.f(arrayObjectAdapter3);
                ArrayObjectAdapter arrayObjectAdapter4 = this.f29936a;
                AbstractC3159y.f(arrayObjectAdapter4);
                arrayObjectAdapter3.notifyArrayItemRangeChanged(0, arrayObjectAdapter4.size());
                return;
            default:
                return;
        }
    }
}
