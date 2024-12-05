package cm.aptoide.pt.view.fragment;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.pt.R;

/* loaded from: classes.dex */
public abstract class BaseToolbarFragment extends UIComponentFragment {
    private Toolbar toolbar;

    public void bindViews(View view) {
        this.toolbar = (Toolbar) view.findViewById(R.id.toolbar);
    }

    protected boolean displayHomeUpAsEnabled() {
        return false;
    }

    protected Toolbar getToolbar() {
        return this.toolbar;
    }

    protected boolean hasToolbar() {
        return this.toolbar != null;
    }

    @Override // com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.toolbar = null;
    }

    @Override // cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.UiComponent
    public void setupToolbar() {
        if (hasToolbar()) {
            ((androidx.appcompat.app.d) getActivity()).setSupportActionBar(this.toolbar);
            boolean displayHomeUpAsEnabled = displayHomeUpAsEnabled();
            androidx.appcompat.app.a supportActionBar = ((androidx.appcompat.app.d) getActivity()).getSupportActionBar();
            supportActionBar.r(displayHomeUpAsEnabled);
            supportActionBar.v(this.toolbar.getTitle());
            setupToolbarDetails(this.toolbar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar) {
    }

    @Override // cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.UiComponent
    public void setupViews() {
        setupToolbar();
    }
}
