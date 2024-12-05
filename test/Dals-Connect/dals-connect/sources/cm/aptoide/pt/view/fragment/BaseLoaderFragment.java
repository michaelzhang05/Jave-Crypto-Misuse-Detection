package cm.aptoide.pt.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.view.LoadInterface;
import cm.aptoide.pt.view.swipe.LoaderLayoutHandler;

/* loaded from: classes.dex */
public abstract class BaseLoaderFragment extends UIComponentFragment implements LoadInterface {
    private boolean create = true;
    private LoaderLayoutHandler loaderLayoutHandler;

    public void bindViews(View view) {
        LoaderLayoutHandler loaderLayoutHandler = this.loaderLayoutHandler;
        if (loaderLayoutHandler != null) {
            loaderLayoutHandler.bindViews(view);
        }
        if (this.create) {
            return;
        }
        finishLoading();
    }

    protected LoaderLayoutHandler createLoaderLayoutHandler() {
        if (getViewsToShowAfterLoadingId().length > 0) {
            return new LoaderLayoutHandler(this, getViewsToShowAfterLoadingId());
        }
        return new LoaderLayoutHandler(this, getViewToShowAfterLoadingId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finishLoading() {
        LoaderLayoutHandler loaderLayoutHandler = this.loaderLayoutHandler;
        if (loaderLayoutHandler != null) {
            loaderLayoutHandler.finishLoading();
        }
    }

    protected abstract int getViewToShowAfterLoadingId();

    protected abstract int[] getViewsToShowAfterLoadingId();

    public boolean isCreate() {
        return this.create;
    }

    public abstract void load(boolean z, boolean z2, Bundle bundle);

    @Override // cm.aptoide.pt.view.fragment.UIComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.loaderLayoutHandler = createLoaderLayoutHandler();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LoaderLayoutHandler loaderLayoutHandler = this.loaderLayoutHandler;
        if (loaderLayoutHandler != null) {
            loaderLayoutHandler.unbindViews();
            this.loaderLayoutHandler = null;
        }
    }

    @Override // com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.create = false;
    }

    @Override // cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        load(this.create, false, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finishLoading(Throwable th) {
        LoaderLayoutHandler loaderLayoutHandler = this.loaderLayoutHandler;
        if (loaderLayoutHandler != null) {
            loaderLayoutHandler.finishLoading(th);
        }
        CrashReport.getInstance().log(th);
    }
}
