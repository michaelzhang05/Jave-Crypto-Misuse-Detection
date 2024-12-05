package l5;

import a5.O;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3336t extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f34512a;

    public C3336t() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(4);
        listRowPresenter.setShadowEnabled(false);
        this.f34512a = new ArrayObjectAdapter(listRowPresenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3336t this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3255y.i(this$0, "this$0");
        if (obj instanceof h5.b) {
            int b8 = ((h5.b) obj).b();
            if (b8 != 0) {
                if (b8 != 1) {
                    if (b8 != 2) {
                        if (b8 != 3) {
                            if (b8 == 4) {
                                this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) SettingsPreferences.class));
                                return;
                            }
                            return;
                        }
                        this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) TvMyDownloadsActivity.class));
                        return;
                    }
                    Intent intent = new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class);
                    intent.putExtra("rollback", true);
                    this$0.startActivity(intent);
                    return;
                }
                this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class));
                return;
            }
            Intent intent2 = new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class);
            intent2.putExtra("updates", true);
            this$0.startActivity(intent2);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        BrowseSupportFragment.FragmentHost fragmentHost;
        super.onCreate(bundle);
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(getString(R.string.manage_apps));
            O.b bVar = a5.O.f14043l;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            int b8 = bVar.b(requireContext);
            if (b8 > 0) {
                str = " (" + b8 + ')';
            } else {
                str = "";
            }
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.l());
            h5.b bVar2 = new h5.b();
            bVar2.e(0);
            bVar2.f(getString(R.string.updates) + str);
            bVar2.d(R.drawable.vector_tv_updates);
            arrayObjectAdapter.add(bVar2);
            h5.b bVar3 = new h5.b();
            bVar3.e(1);
            bVar3.f(getString(R.string.mis_apps_title));
            bVar3.d(R.drawable.vector_tv_installed);
            arrayObjectAdapter.add(bVar3);
            h5.b bVar4 = new h5.b();
            bVar4.e(2);
            bVar4.f(getString(R.string.rollback_title));
            bVar4.d(R.drawable.vector_tv_rollback);
            arrayObjectAdapter.add(bVar4);
            h5.b bVar5 = new h5.b();
            bVar5.e(3);
            bVar5.f(getString(R.string.downloads_title));
            bVar5.d(R.drawable.vector_tv_downloads);
            arrayObjectAdapter.add(bVar5);
            h5.b bVar6 = new h5.b();
            bVar6.e(4);
            bVar6.f(getString(R.string.settings));
            bVar6.d(R.drawable.vector_tv_settings);
            arrayObjectAdapter.add(bVar6);
            this.f34512a.add(new ListRow(headerItem, arrayObjectAdapter));
            setAdapter(this.f34512a);
            BrowseSupportFragment.MainFragmentAdapter mainFragmentAdapter = getMainFragmentAdapter();
            if (mainFragmentAdapter != null && (fragmentHost = mainFragmentAdapter.getFragmentHost()) != null) {
                fragmentHost.notifyDataReady(getMainFragmentAdapter());
            }
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: l5.s
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3336t.i(C3336t.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }
}
