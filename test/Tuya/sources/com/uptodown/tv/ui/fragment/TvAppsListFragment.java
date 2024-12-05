package com.uptodown.tv.ui.fragment;

import L5.I;
import L5.t;
import X4.C1498h;
import X4.C1501k;
import X5.n;
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
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.T;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TvAppsListFragment extends VerticalGridSupportFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final a f29901e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f29902a;

    /* renamed from: b, reason: collision with root package name */
    private C1501k f29903b;

    /* renamed from: c, reason: collision with root package name */
    private int f29904c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29905d;

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
            if ((obj instanceof C1498h) && TvAppsListFragment.this.getActivity() != null && viewHolder != null) {
                h5.b bVar = (h5.b) TvAppsListFragment.this.getActivity();
                AbstractC3159y.f(bVar);
                bVar.o((C1498h) obj, viewHolder);
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
                ArrayObjectAdapter arrayObjectAdapter = TvAppsListFragment.this.f29902a;
                AbstractC3159y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < TvAppsListFragment.this.f29904c && indexOf >= TvAppsListFragment.this.f29904c - 5 && !TvAppsListFragment.this.f29905d) {
                    TvAppsListFragment.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29908a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29910a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppsListFragment f29911b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29912c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppsListFragment tvAppsListFragment, T t8, P5.d dVar) {
                super(2, dVar);
                this.f29911b = tvAppsListFragment;
                this.f29912c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29911b, this.f29912c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29910a == 0) {
                    t.b(obj);
                    try {
                        this.f29911b.v((ArrayList) this.f29912c.f33761a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f29911b.f29905d = false;
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            X4.I i8;
            int i9;
            JSONArray jSONArray;
            Integer num;
            Resources resources;
            Object e8 = Q5.b.e();
            int i10 = this.f29908a;
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
                    TvAppsListFragment.this.f29905d = true;
                    FragmentActivity requireActivity = TvAppsListFragment.this.requireActivity();
                    AbstractC3159y.h(requireActivity, "requireActivity()");
                    C3312F c3312f = new C3312F(requireActivity);
                    if (TvAppsListFragment.this.f29903b != null) {
                        C1501k c1501k = TvAppsListFragment.this.f29903b;
                        AbstractC3159y.f(c1501k);
                        int c8 = c1501k.c();
                        if (c8 != -2) {
                            if (c8 != -1) {
                                C1501k c1501k2 = TvAppsListFragment.this.f29903b;
                                AbstractC3159y.f(c1501k2);
                                if (c1501k2.n()) {
                                    C1501k c1501k3 = TvAppsListFragment.this.f29903b;
                                    AbstractC3159y.f(c1501k3);
                                    i8 = c3312f.f0(c1501k3.c(), 75, TvAppsListFragment.this.f29904c);
                                } else {
                                    C1501k c1501k4 = TvAppsListFragment.this.f29903b;
                                    AbstractC3159y.f(c1501k4);
                                    i8 = c3312f.b0(c1501k4.c(), 75, TvAppsListFragment.this.f29904c);
                                }
                            } else {
                                i8 = c3312f.a0(75, TvAppsListFragment.this.f29904c);
                            }
                        } else {
                            i8 = c3312f.H(75, TvAppsListFragment.this.f29904c);
                        }
                    } else {
                        i8 = null;
                    }
                    if (i8 != null && !i8.b() && i8.d() != null) {
                        String d8 = i8.d();
                        AbstractC3159y.f(d8);
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
                            t8.f33761a = new ArrayList();
                            Context context = TvAppsListFragment.this.getContext();
                            if (context != null && (resources = context.getResources()) != null) {
                                num = kotlin.coroutines.jvm.internal.b.c(resources.getDimensionPixelSize(R.dimen.tv_card_height));
                            } else {
                                num = null;
                            }
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jsonObjectTop = jSONArray.getJSONObject(i11);
                                C1498h.b bVar = C1498h.f12542L0;
                                AbstractC3159y.h(jsonObjectTop, "jsonObjectTop");
                                C1498h a8 = bVar.a(jsonObjectTop);
                                ((ArrayList) t8.f33761a).add(a8);
                                if (num != null) {
                                    s.h().l(a8.k0(num.intValue())).d();
                                }
                                TvAppsListFragment.this.f29904c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c9 = C2812b0.c();
                a aVar = new a(TvAppsListFragment.this, t8, null);
                this.f29908a = 1;
                if (AbstractC2825i.g(c9, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29913a;

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
            int i8 = this.f29913a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppsListFragment tvAppsListFragment = TvAppsListFragment.this;
                this.f29913a = 1;
                if (tvAppsListFragment.t(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.l
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
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new d(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            String string = getString(R.string.no_data_available);
            AbstractC3159y.h(string, "getString(R.string.no_data_available)");
            r(string);
        }
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter = this.f29902a;
            AbstractC3159y.f(arrayObjectAdapter);
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
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.e());
        this.f29902a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null && extras.containsKey("category")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("category", C1501k.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = extras.getParcelable("category");
            }
            this.f29903b = (C1501k) parcelable;
        }
        C1501k c1501k = this.f29903b;
        if (c1501k != null) {
            charSequence = c1501k.f();
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
