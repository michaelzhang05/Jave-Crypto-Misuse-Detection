package l5;

import a5.C1644k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import com.uptodown.R;
import com.uptodown.tv.ui.activity.TvSearchActivity;
import h5.C2960a;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends BrowseSupportFragment {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34505c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static C3333p f34506d;

    /* renamed from: e, reason: collision with root package name */
    private static C3331n f34507e;

    /* renamed from: f, reason: collision with root package name */
    private static T f34508f;

    /* renamed from: a, reason: collision with root package name */
    private BackgroundManager f34509a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f34510b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private static final class b extends BrowseSupportFragment.FragmentFactory {
        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentFactory
        public Fragment createFragment(Object obj) {
            AbstractC3255y.g(obj, "null cannot be cast to non-null type androidx.leanback.widget.Row");
            long id = ((Row) obj).getHeaderItem().getId();
            if (id == 1) {
                if (r.f34506d == null) {
                    r.f34506d = new C3333p();
                }
                return r.f34506d;
            }
            if (id == 2) {
                if (r.f34507e == null) {
                    r.f34507e = new C3331n();
                }
                return r.f34507e;
            }
            if (id == 3) {
                if (r.f34508f == null) {
                    r.f34508f = T.f34464f.a(new C1644k(-1, "Top", null, 4, null));
                }
                return r.f34508f;
            }
            if (id == 4) {
                return new C3336t();
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends PresenterSelector {
        c() {
        }

        @Override // androidx.leanback.widget.PresenterSelector
        public Presenter getPresenter(Object o8) {
            AbstractC3255y.i(o8, "o");
            return new j5.j();
        }
    }

    private final void o() {
        PageRow pageRow = new PageRow(new C2960a(1L, "Home", R.drawable.vector_tv_header_home));
        ArrayObjectAdapter arrayObjectAdapter = this.f34510b;
        AbstractC3255y.f(arrayObjectAdapter);
        arrayObjectAdapter.add(pageRow);
        PageRow pageRow2 = new PageRow(new C2960a(2L, "Games", R.drawable.vector_tv_header_games));
        ArrayObjectAdapter arrayObjectAdapter2 = this.f34510b;
        AbstractC3255y.f(arrayObjectAdapter2);
        arrayObjectAdapter2.add(pageRow2);
        PageRow pageRow3 = new PageRow(new C2960a(3L, "Top", R.drawable.vector_tv_header_top));
        ArrayObjectAdapter arrayObjectAdapter3 = this.f34510b;
        AbstractC3255y.f(arrayObjectAdapter3);
        arrayObjectAdapter3.add(pageRow3);
        PageRow pageRow4 = new PageRow(new C2960a(4L, "Management", R.drawable.vector_tv_header_management));
        ArrayObjectAdapter arrayObjectAdapter4 = this.f34510b;
        AbstractC3255y.f(arrayObjectAdapter4);
        arrayObjectAdapter4.add(pageRow4);
    }

    private final void p() {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ListRowPresenter());
        this.f34510b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        o();
        startEntranceTransition();
    }

    private final void q() {
        setHeadersState(1);
        setHeaderPresenterSelector(new c());
        setBadgeDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_uptodown_app_store_white));
        setHeadersTransitionOnBackEnabled(true);
        setBrandColor(ContextCompat.getColor(requireContext(), R.color.tv_background_gradient_end));
        setSearchAffordanceColor(ContextCompat.getColor(requireContext(), R.color.transparent));
        setOnSearchClickedListener(new View.OnClickListener() { // from class: l5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.r(r.this, view);
            }
        });
        prepareEntranceTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(r this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getActivity(), (Class<?>) TvSearchActivity.class));
    }

    @Override // androidx.leanback.app.BrowseSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q();
        p();
        BackgroundManager backgroundManager = BackgroundManager.getInstance(getActivity());
        this.f34509a = backgroundManager;
        if (backgroundManager != null) {
            backgroundManager.attach(requireActivity().getWindow());
        }
        getMainFragmentRegistry().registerFragment(PageRow.class, new b());
    }
}
