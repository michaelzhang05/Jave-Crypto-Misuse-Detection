package h5;

import X4.C1498h;
import X4.C1505o;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3330r;

/* loaded from: classes5.dex */
public abstract class b extends FragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    private UptodownApp f31403a;

    /* renamed from: b, reason: collision with root package name */
    private C3330r f31404b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31405c;

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C1505o f31406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f31407b;

        public a(b bVar, C1505o download) {
            AbstractC3159y.i(download, "download");
            this.f31407b = bVar;
            this.f31406a = download;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f31407b.getSupportFragmentManager().getFragments();
            AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                String string = this.f31407b.getString(R.string.tv_msg_download_complete, this.f31406a.X());
                AbstractC3159y.h(string, "getString(R.string.tv_ms…_complete, download.name)");
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
        return this.f31405c;
    }

    public final void o(C1498h appInfo, Presenter.ViewHolder itemViewHolder) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(itemViewHolder, "itemViewHolder");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        if (SettingsPreferences.f29323b.N(this)) {
            View view = itemViewHolder.view;
            if (view instanceof ImageCardView) {
                AbstractC3159y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
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
        AbstractC3159y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f31403a = (UptodownApp) application;
        this.f31404b = new C3330r(this);
        C3307A.f34473a.d().add(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C3307A.f34473a.d().remove(this);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f31405c = false;
        UptodownApp uptodownApp = this.f31403a;
        AbstractC3159y.f(uptodownApp);
        uptodownApp.m1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f31405c = true;
        UptodownApp uptodownApp = this.f31403a;
        AbstractC3159y.f(uptodownApp);
        uptodownApp.n1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startActivity(new Intent(this, (Class<?>) TvSearchActivity.class));
        return true;
    }
}
