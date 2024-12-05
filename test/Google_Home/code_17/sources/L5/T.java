package l5;

import a5.C1641h;
import a5.C1644k;
import a6.InterfaceC1668n;
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
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class T extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: f, reason: collision with root package name */
    public static final a f34464f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f34465a;

    /* renamed from: b, reason: collision with root package name */
    private C1644k f34466b;

    /* renamed from: c, reason: collision with root package name */
    private int f34467c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34468d;

    /* renamed from: e, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f34469e = new f(this);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final T a(C1644k category) {
            AbstractC3255y.i(category, "category");
            T t8 = new T();
            t8.setArguments(category.z());
            return t8;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
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
            if ((obj instanceof C1641h) && T.this.getActivity() != null && viewHolder != null) {
                k5.b bVar = (k5.b) T.this.getActivity();
                AbstractC3255y.f(bVar);
                bVar.o((C1641h) obj, viewHolder);
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
                ArrayObjectAdapter arrayObjectAdapter = T.this.f34465a;
                AbstractC3255y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < T.this.f34467c && indexOf >= T.this.f34467c - 5 && !T.this.f34468d) {
                    T.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34472a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f34474a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f34475b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f34476c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(T t8, kotlin.jvm.internal.T t9, S5.d dVar) {
                super(2, dVar);
                this.f34475b = t8;
                this.f34476c = t9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f34475b, this.f34476c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f34474a == 0) {
                    O5.t.b(obj);
                    try {
                        this.f34475b.v((ArrayList) this.f34476c.f34162a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f34475b.f34468d = false;
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
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
            int i10 = this.f34472a;
            if (i10 != 0) {
                if (i10 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                try {
                    T.this.f34468d = true;
                    FragmentActivity requireActivity = T.this.requireActivity();
                    AbstractC3255y.h(requireActivity, "requireActivity()");
                    C3660F c3660f = new C3660F(requireActivity);
                    if (T.this.f34466b != null) {
                        C1644k c1644k = T.this.f34466b;
                        AbstractC3255y.f(c1644k);
                        int b8 = c1644k.b();
                        if (b8 != -2) {
                            if (b8 != -1) {
                                C1644k c1644k2 = T.this.f34466b;
                                AbstractC3255y.f(c1644k2);
                                if (c1644k2.s()) {
                                    C1644k c1644k3 = T.this.f34466b;
                                    AbstractC3255y.f(c1644k3);
                                    i8 = c3660f.f0(c1644k3.b(), 75, T.this.f34467c);
                                } else {
                                    C1644k c1644k4 = T.this.f34466b;
                                    AbstractC3255y.f(c1644k4);
                                    i8 = c3660f.b0(c1644k4.b(), 75, T.this.f34467c);
                                }
                            } else {
                                i8 = c3660f.a0(75, T.this.f34467c);
                            }
                        } else {
                            i8 = c3660f.H(75, T.this.f34467c);
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
                            Context context = T.this.getContext();
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
                                    com.squareup.picasso.s.h().l(a8.k0(num.intValue())).d();
                                }
                                T.this.f34467c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c8 = C3347b0.c();
                a aVar = new a(T.this, t8, null);
                this.f34472a = 1;
                if (AbstractC3360i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34477a;

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
            int i8 = this.f34477a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                T t8 = T.this;
                this.f34477a = 1;
                if (t8.t(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public T() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.e());
        this.f34465a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.S
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
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new d(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if ((arrayList == null || arrayList.isEmpty()) && getContext() != null) {
            String string = getString(R.string.no_data_available);
            AbstractC3255y.h(string, "getString(R.string.no_data_available)");
            r(string);
        }
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter = this.f34465a;
            AbstractC3255y.f(arrayObjectAdapter);
            arrayObjectAdapter.add(arrayList.get(i8));
        }
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.f34469e;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (this.f34466b == null && (arguments = getArguments()) != null) {
            C1644k c1644k = new C1644k(0, null, null, 7, null);
            this.f34466b = c1644k;
            AbstractC3255y.f(c1644k);
            c1644k.y(arguments);
        }
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
        setOnItemViewSelectedListener(new c());
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f34467c == 0) {
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
