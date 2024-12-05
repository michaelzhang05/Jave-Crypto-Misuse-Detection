package i5;

import X4.C1498h;
import X4.C1501k;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BrowseSupportFragment;
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
import com.uptodown.R;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class T extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31612f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f31613a;

    /* renamed from: b, reason: collision with root package name */
    private C1501k f31614b;

    /* renamed from: c, reason: collision with root package name */
    private int f31615c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31616d;

    /* renamed from: e, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f31617e = new f(this);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final T a(C1501k category) {
            AbstractC3159y.i(category, "category");
            T t8 = new T();
            t8.setArguments(category.I());
            return t8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if ((obj instanceof C1498h) && T.this.getActivity() != null && viewHolder != null) {
                h5.b bVar = (h5.b) T.this.getActivity();
                AbstractC3159y.f(bVar);
                bVar.o((C1498h) obj, viewHolder);
            }
        }
    }

    /* loaded from: classes5.dex */
    private final class c implements OnItemViewSelectedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj != null) {
                ArrayObjectAdapter arrayObjectAdapter = T.this.f31613a;
                AbstractC3159y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < T.this.f31615c && indexOf >= T.this.f31615c - 5 && !T.this.f31616d) {
                    T.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f31620a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f31622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f31623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f31624c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, kotlin.jvm.internal.T t9, P5.d dVar) {
                super(2, dVar);
                this.f31623b = t8;
                this.f31624c = t9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f31623b, this.f31624c, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f31622a == 0) {
                    L5.t.b(obj);
                    try {
                        this.f31623b.v((ArrayList) this.f31624c.f33761a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f31623b.f31616d = false;
                    return L5.I.f6487a;
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
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            X4.I i8;
            int i9;
            JSONArray jSONArray;
            Integer num;
            Resources resources;
            Object e8 = Q5.b.e();
            int i10 = this.f31620a;
            if (i10 != 0) {
                if (i10 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                try {
                    T.this.f31616d = true;
                    FragmentActivity requireActivity = T.this.requireActivity();
                    AbstractC3159y.h(requireActivity, "requireActivity()");
                    C3312F c3312f = new C3312F(requireActivity);
                    if (T.this.f31614b != null) {
                        C1501k c1501k = T.this.f31614b;
                        AbstractC3159y.f(c1501k);
                        int c8 = c1501k.c();
                        if (c8 != -2) {
                            if (c8 != -1) {
                                C1501k c1501k2 = T.this.f31614b;
                                AbstractC3159y.f(c1501k2);
                                if (c1501k2.n()) {
                                    C1501k c1501k3 = T.this.f31614b;
                                    AbstractC3159y.f(c1501k3);
                                    i8 = c3312f.f0(c1501k3.c(), 75, T.this.f31615c);
                                } else {
                                    C1501k c1501k4 = T.this.f31614b;
                                    AbstractC3159y.f(c1501k4);
                                    i8 = c3312f.b0(c1501k4.c(), 75, T.this.f31615c);
                                }
                            } else {
                                i8 = c3312f.a0(75, T.this.f31615c);
                            }
                        } else {
                            i8 = c3312f.H(75, T.this.f31615c);
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
                            Context context = T.this.getContext();
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
                                    com.squareup.picasso.s.h().l(a8.k0(num.intValue())).d();
                                }
                                T.this.f31615c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c9 = C2812b0.c();
                a aVar = new a(T.this, t8, null);
                this.f31620a = 1;
                if (AbstractC2825i.g(c9, aVar, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f31625a;

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f31625a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                T t8 = T.this;
                this.f31625a = 1;
                if (t8.t(this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    public T() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.e());
        this.f31613a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.S
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    T.s(dialogInterface, i8);
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
        return L5.I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if ((arrayList == null || arrayList.isEmpty()) && getContext() != null) {
            String string = getString(R.string.no_data_available);
            AbstractC3159y.h(string, "getString(R.string.no_data_available)");
            r(string);
        }
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter = this.f31613a;
            AbstractC3159y.f(arrayObjectAdapter);
            arrayObjectAdapter.add(arrayList.get(i8));
        }
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.f31617e;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (this.f31614b == null && (arguments = getArguments()) != null) {
            C1501k c1501k = new C1501k(0, null, null, 7, null);
            this.f31614b = c1501k;
            AbstractC3159y.f(c1501k);
            c1501k.G(arguments);
        }
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
        setOnItemViewSelectedListener(new c());
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f31615c == 0) {
            u();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends BrowseSupportFragment.MainFragmentAdapter {
        f(T t8) {
            super(t8);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
        }
    }
}
