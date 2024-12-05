package com.uptodown.tv.ui.fragment;

import O5.I;
import O5.t;
import a5.C1641h;
import a5.C1644k;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvAppsListFragment;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TvAppsListFragment extends VerticalGridSupportFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30933e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f30934a;

    /* renamed from: b, reason: collision with root package name */
    private C1644k f30935b;

    /* renamed from: c, reason: collision with root package name */
    private int f30936c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30937d;

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
            if ((obj instanceof C1641h) && TvAppsListFragment.this.getActivity() != null && viewHolder != null) {
                k5.b bVar = (k5.b) TvAppsListFragment.this.getActivity();
                AbstractC3255y.f(bVar);
                bVar.o((C1641h) obj, viewHolder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements OnItemViewSelectedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj != null) {
                ArrayObjectAdapter arrayObjectAdapter = TvAppsListFragment.this.f30934a;
                AbstractC3255y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < TvAppsListFragment.this.f30936c && indexOf >= TvAppsListFragment.this.f30936c - 5 && !TvAppsListFragment.this.f30937d) {
                    TvAppsListFragment.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30940a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30942a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppsListFragment f30943b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30944c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppsListFragment tvAppsListFragment, T t8, S5.d dVar) {
                super(2, dVar);
                this.f30943b = tvAppsListFragment;
                this.f30944c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30943b, this.f30944c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30942a == 0) {
                    t.b(obj);
                    try {
                        this.f30943b.v((ArrayList) this.f30944c.f34162a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f30943b.f30937d = false;
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a5.I i8;
            int i9;
            JSONArray jSONArray;
            Integer num;
            Resources resources;
            Object e8 = T5.b.e();
            int i10 = this.f30940a;
            if (i10 != 0) {
                if (i10 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                try {
                    TvAppsListFragment.this.f30937d = true;
                    FragmentActivity requireActivity = TvAppsListFragment.this.requireActivity();
                    AbstractC3255y.h(requireActivity, "requireActivity()");
                    C3660F c3660f = new C3660F(requireActivity);
                    if (TvAppsListFragment.this.f30935b != null) {
                        C1644k c1644k = TvAppsListFragment.this.f30935b;
                        AbstractC3255y.f(c1644k);
                        int b8 = c1644k.b();
                        if (b8 != -2) {
                            if (b8 != -1) {
                                C1644k c1644k2 = TvAppsListFragment.this.f30935b;
                                AbstractC3255y.f(c1644k2);
                                if (c1644k2.s()) {
                                    C1644k c1644k3 = TvAppsListFragment.this.f30935b;
                                    AbstractC3255y.f(c1644k3);
                                    i8 = c3660f.f0(c1644k3.b(), 75, TvAppsListFragment.this.f30936c);
                                } else {
                                    C1644k c1644k4 = TvAppsListFragment.this.f30935b;
                                    AbstractC3255y.f(c1644k4);
                                    i8 = c3660f.b0(c1644k4.b(), 75, TvAppsListFragment.this.f30936c);
                                }
                            } else {
                                i8 = c3660f.a0(75, TvAppsListFragment.this.f30936c);
                            }
                        } else {
                            i8 = c3660f.H(75, TvAppsListFragment.this.f30936c);
                        }
                    } else {
                        i8 = null;
                    }
                    if (i8 != null && !i8.b() && i8.d() != null) {
                        String d8 = i8.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            i9 = jSONObject.getInt("success");
                        } else {
                            i9 = 0;
                        }
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONArray = null;
                        }
                        if (i9 == 1 && jSONArray != null) {
                            t8.f34162a = new ArrayList();
                            Context context = TvAppsListFragment.this.getContext();
                            if (context != null && (resources = context.getResources()) != null) {
                                num = kotlin.coroutines.jvm.internal.b.c(resources.getDimensionPixelSize(R.dimen.tv_card_height));
                            } else {
                                num = null;
                            }
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jsonObjectTop = jSONArray.getJSONObject(i11);
                                C1641h.b bVar = C1641h.f14163L0;
                                AbstractC3255y.h(jsonObjectTop, "jsonObjectTop");
                                C1641h a8 = bVar.a(jsonObjectTop);
                                ((ArrayList) t8.f34162a).add(a8);
                                if (num != null) {
                                    s.h().l(a8.k0(num.intValue())).d();
                                }
                                TvAppsListFragment.this.f30936c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(TvAppsListFragment.this, t8, null);
                this.f30940a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30945a;

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
            int i8 = this.f30945a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppsListFragment tvAppsListFragment = TvAppsListFragment.this;
                this.f30945a = 1;
                if (tvAppsListFragment.t(this) == e8) {
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

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvAppsListFragment.s(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            builder.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            String string = getString(R.string.no_data_available);
            AbstractC3255y.h(string, "getString(R.string.no_data_available)");
            r(string);
        }
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter = this.f30934a;
            AbstractC3255y.f(arrayObjectAdapter);
            arrayObjectAdapter.add(arrayList.get(i8));
        }
    }

    private final void w() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
        setOnItemViewSelectedListener(new c());
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.e());
        this.f30934a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null && extras.containsKey("category")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("category", C1644k.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = extras.getParcelable("category");
            }
            this.f30935b = (C1644k) parcelable;
        }
        C1644k c1644k = this.f30935b;
        if (c1644k != null) {
            charSequence = c1644k.h();
        } else {
            charSequence = null;
        }
        setTitle(charSequence);
        if (bundle == null) {
            prepareEntranceTransition();
        }
        w();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u();
    }
}
