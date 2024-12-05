package com.uptodown.tv.ui.fragment;

import O5.I;
import O5.t;
import Q4.q;
import Q4.w;
import a5.C1648o;
import a6.InterfaceC1668n;
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
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3674n;
import o5.C3677q;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class TvMyDownloadsFragment extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30967e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f30968a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f30969b;

    /* renamed from: c, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f30970c = new d(this);

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f30971d = new ArrayList();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
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
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30973a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30975a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyDownloadsFragment f30976b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyDownloadsFragment tvMyDownloadsFragment, S5.d dVar) {
                super(2, dVar);
                this.f30976b = tvMyDownloadsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30976b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30975a == 0) {
                    t.b(obj);
                    if (this.f30976b.f30971d != null) {
                        this.f30976b.r();
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30973a;
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
                        C3677q c3677q = new C3677q();
                        Context requireContext = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3255y.h(requireContext, "requireContext()");
                        ArrayList d8 = c3677q.d(requireContext);
                        C3677q c3677q2 = new C3677q();
                        Context requireContext2 = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3255y.h(requireContext2, "requireContext()");
                        d8.addAll(c3677q2.a(requireContext2));
                        PackageManager pm = TvMyDownloadsFragment.this.requireContext().getPackageManager();
                        Iterator it = d8.iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            String name = file.getName();
                            AbstractC3255y.h(name, "file.name");
                            boolean z8 = false;
                            if (n.r(name, ".apk", false, 2, null)) {
                                AbstractC3255y.h(pm, "pm");
                                String absolutePath = file.getAbsolutePath();
                                AbstractC3255y.h(absolutePath, "file.absolutePath");
                                PackageInfo c8 = q.c(pm, absolutePath, 128);
                                if (c8 != null) {
                                    try {
                                        Bundle bundle = c8.applicationInfo.metaData;
                                        if (bundle != null && bundle.containsKey("com.android.vending.splits.required")) {
                                            Object obj2 = c8.applicationInfo.metaData.get("com.android.vending.splits.required");
                                            AbstractC3255y.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
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
                                    AbstractC3255y.h(name2, "file.name");
                                    if (!n.C(name2, "split_config", false, 2, null)) {
                                        arrayList.add(file);
                                    }
                                }
                            } else {
                                w.a aVar = w.f9241b;
                                String name3 = file.getName();
                                AbstractC3255y.h(name3, "file.name");
                                if (aVar.a(name3)) {
                                    arrayList.add(file);
                                }
                            }
                        }
                        TvMyDownloadsFragment.this.f30971d = arrayList;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c9 = C3347b0.c();
                a aVar2 = new a(TvMyDownloadsFragment.this, null);
                this.f30973a = 1;
                if (AbstractC3360i.g(c9, aVar2, this) == e8) {
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
    public static final class d extends BrowseSupportFragment.MainFragmentAdapter {
        d(TvMyDownloadsFragment tvMyDownloadsFragment) {
            super(tvMyDownloadsFragment);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30977a;

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30977a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyDownloadsFragment tvMyDownloadsFragment = TvMyDownloadsFragment.this;
                this.f30977a = 1;
                if (tvMyDownloadsFragment.s(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final File file) {
        AlertDialog alertDialog = this.f30969b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (getActivity() != null && !requireActivity().isFinishing() && file != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3255y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.tv_apk_clicked_dialog, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.tv_install)).setOnClickListener(new View.OnClickListener() { // from class: l5.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.p(TvMyDownloadsFragment.this, file, view);
                }
            });
            ((TextView) inflate.findViewById(R.id.tv_delete)).setOnClickListener(new View.OnClickListener() { // from class: l5.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.q(file, this, view);
                }
            });
            builder.setView(inflate);
            AlertDialog create = builder.create();
            this.f30969b = create;
            if (create != null) {
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TvMyDownloadsFragment this$0, File file, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        String name = file.getName();
        AbstractC3255y.h(name, "fileDownloadedClicked.name");
        C1648o Y7 = a8.Y(name);
        a8.l();
        if (Y7 == null || Y7.Z() <= 0 || Y7.Z() >= 100) {
            UptodownApp.a aVar2 = UptodownApp.f29058B;
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            UptodownApp.a.Z(aVar2, file, requireActivity, null, 4, null);
        }
        AlertDialog alertDialog = this$0.f30969b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(File file, TvMyDownloadsFragment this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (file.delete()) {
            C3674n.a aVar = C3674n.f36505t;
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C3674n a8 = aVar.a(requireContext);
            a8.a();
            String name = file.getName();
            AbstractC3255y.h(name, "fileDownloadedClicked.name");
            a8.D(name);
            a8.l();
            ArrayObjectAdapter arrayObjectAdapter = this$0.f30968a;
            AbstractC3255y.f(arrayObjectAdapter);
            arrayObjectAdapter.remove(file);
        }
        AlertDialog alertDialog = this$0.f30969b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        ArrayObjectAdapter arrayObjectAdapter = this.f30968a;
        AbstractC3255y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        ArrayList arrayList = this.f30971d;
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter2 = this.f30968a;
            AbstractC3255y.f(arrayObjectAdapter2);
            ArrayList arrayList2 = this.f30971d;
            AbstractC3255y.f(arrayList2);
            arrayObjectAdapter2.add(arrayList2.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
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
        return this.f30970c;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.n());
        this.f30968a = arrayObjectAdapter;
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
            C3674n.a aVar = C3674n.f36505t;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            C3674n a8 = aVar.a(requireContext);
            a8.a();
            a8.i1();
            a8.l();
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
            C3683w.f36547a.g(context);
        }
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void u(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                ArrayObjectAdapter arrayObjectAdapter = this.f30968a;
                AbstractC3255y.f(arrayObjectAdapter);
                ArrayObjectAdapter arrayObjectAdapter2 = this.f30968a;
                AbstractC3255y.f(arrayObjectAdapter2);
                arrayObjectAdapter.notifyArrayItemRangeChanged(0, arrayObjectAdapter2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                ArrayObjectAdapter arrayObjectAdapter3 = this.f30968a;
                AbstractC3255y.f(arrayObjectAdapter3);
                ArrayObjectAdapter arrayObjectAdapter4 = this.f30968a;
                AbstractC3255y.f(arrayObjectAdapter4);
                arrayObjectAdapter3.notifyArrayItemRangeChanged(0, arrayObjectAdapter4.size());
                return;
            default:
                return;
        }
    }
}
