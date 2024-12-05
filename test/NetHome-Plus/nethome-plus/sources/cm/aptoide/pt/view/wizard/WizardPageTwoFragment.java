package cm.aptoide.pt.view.wizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.R;
import cm.aptoide.pt.util.MarketResourceFormatter;
import cm.aptoide.pt.view.BackButton;
import cm.aptoide.pt.view.BackButtonFragment;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class WizardPageTwoFragment extends BackButtonFragment {
    private BackButton.ClickHandler clickHandler;

    @Inject
    MarketResourceFormatter marketResourceFormatter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$onViewCreated$0() {
        return false;
    }

    public static Fragment newInstance() {
        return new WizardPageTwoFragment();
    }

    private void setText(View view) {
        ((TextView) view.findViewById(R.id.title)).setText(R.string.wizard_title_viewpager_two);
        ((TextView) view.findViewById(R.id.description)).setText(this.marketResourceFormatter.formatString(getContext(), R.string.wizard_sub_title_viewpager_two, new String[0]));
        ((ImageView) view.findViewById(R.id.wizard_icon)).setImageResource(R.drawable.wizard_2);
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_wizard_model_page, viewGroup, false);
        setText(inflate);
        return inflate;
    }

    @Override // com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        unregisterClickHandler(this.clickHandler);
        super.onDestroyView();
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e eVar = new BackButton.ClickHandler() { // from class: cm.aptoide.pt.view.wizard.e
            @Override // cm.aptoide.pt.view.BackButton.ClickHandler
            public final boolean handle() {
                return WizardPageTwoFragment.lambda$onViewCreated$0();
            }
        };
        this.clickHandler = eVar;
        registerClickHandler(eVar);
    }
}
