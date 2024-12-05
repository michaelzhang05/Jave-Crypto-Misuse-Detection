package k5;

import a5.C1641h;
import a5.C1648o;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvSearchActivity;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3678r;

/* loaded from: classes5.dex */
public abstract class b extends FragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    private UptodownApp f34124a;

    /* renamed from: b, reason: collision with root package name */
    private C3678r f34125b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34126c;

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C1648o f34127a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f34128b;

        public a(b bVar, C1648o download) {
            AbstractC3255y.i(download, "download");
            this.f34128b = bVar;
            this.f34127a = download;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f34128b.getSupportFragmentManager().getFragments();
            AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                String string = this.f34128b.getString(R.string.tv_msg_download_complete, this.f34127a.X());
                AbstractC3255y.h(string, "getString(R.string.tv_ms…_complete, download.name)");
                Toast.makeText(fragment.getContext(), string, 1).show();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getSource() == 8194) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean n() {
        return this.f34126c;
    }

    public final void o(C1641h appInfo, Presenter.ViewHolder itemViewHolder) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(itemViewHolder, "itemViewHolder");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        if (SettingsPreferences.f30353b.N(this)) {
            View view = itemViewHolder.view;
            if (view instanceof ImageCardView) {
                AbstractC3255y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
                startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this, ((ImageCardView) view).getMainImageView(), "transition_name").toBundle());
                return;
            }
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f34124a = (UptodownApp) application;
        this.f34125b = new C3678r(this);
        C3655A.f36474a.d().add(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C3655A.f36474a.d().remove(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f34126c = false;
        UptodownApp uptodownApp = this.f34124a;
        AbstractC3255y.f(uptodownApp);
        uptodownApp.m1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f34126c = true;
        UptodownApp uptodownApp = this.f34124a;
        AbstractC3255y.f(uptodownApp);
        uptodownApp.n1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startActivity(new Intent(this, (Class<?>) TvSearchActivity.class));
        return true;
    }
}
