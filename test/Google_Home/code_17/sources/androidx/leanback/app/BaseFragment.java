package androidx.leanback.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.transition.TransitionListener;
import androidx.leanback.util.StateMachine;

@Deprecated
/* loaded from: classes3.dex */
public class BaseFragment extends BrandedFragment {
    Object mEntranceTransition;
    final StateMachine.State STATE_START = new StateMachine.State("START", true, false);
    final StateMachine.State STATE_ENTRANCE_INIT = new StateMachine.State("ENTRANCE_INIT");
    final StateMachine.State STATE_ENTRANCE_ON_PREPARED = new StateMachine.State("ENTRANCE_ON_PREPARED", true, false) { // from class: androidx.leanback.app.BaseFragment.1
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BaseFragment.this.mProgressBarManager.show();
        }
    };
    final StateMachine.State STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW = new StateMachine.State("ENTRANCE_ON_PREPARED_ON_CREATEVIEW") { // from class: androidx.leanback.app.BaseFragment.2
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BaseFragment.this.onEntranceTransitionPrepare();
        }
    };
    final StateMachine.State STATE_ENTRANCE_PERFORM = new StateMachine.State("STATE_ENTRANCE_PERFORM") { // from class: androidx.leanback.app.BaseFragment.3
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BaseFragment.this.mProgressBarManager.hide();
            BaseFragment.this.onExecuteEntranceTransition();
        }
    };
    final StateMachine.State STATE_ENTRANCE_ON_ENDED = new StateMachine.State("ENTRANCE_ON_ENDED") { // from class: androidx.leanback.app.BaseFragment.4
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BaseFragment.this.onEntranceTransitionEnd();
        }
    };
    final StateMachine.State STATE_ENTRANCE_COMPLETE = new StateMachine.State("ENTRANCE_COMPLETE", true, false);
    final StateMachine.Event EVT_ON_CREATE = new StateMachine.Event("onCreate");
    final StateMachine.Event EVT_ON_CREATEVIEW = new StateMachine.Event("onCreateView");
    final StateMachine.Event EVT_PREPARE_ENTRANCE = new StateMachine.Event("prepareEntranceTransition");
    final StateMachine.Event EVT_START_ENTRANCE = new StateMachine.Event("startEntranceTransition");
    final StateMachine.Event EVT_ENTRANCE_END = new StateMachine.Event("onEntranceTransitionEnd");
    final StateMachine.Condition COND_TRANSITION_NOT_SUPPORTED = new StateMachine.Condition("EntranceTransitionNotSupport") { // from class: androidx.leanback.app.BaseFragment.5
        @Override // androidx.leanback.util.StateMachine.Condition
        public boolean canProceed() {
            return !TransitionHelper.systemSupportsEntranceTransitions();
        }
    };
    final StateMachine mStateMachine = new StateMachine();
    final ProgressBarManager mProgressBarManager = new ProgressBarManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ValidFragment"})
    public BaseFragment() {
    }

    protected Object createEntranceTransition() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createStateMachineStates() {
        this.mStateMachine.addState(this.STATE_START);
        this.mStateMachine.addState(this.STATE_ENTRANCE_INIT);
        this.mStateMachine.addState(this.STATE_ENTRANCE_ON_PREPARED);
        this.mStateMachine.addState(this.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW);
        this.mStateMachine.addState(this.STATE_ENTRANCE_PERFORM);
        this.mStateMachine.addState(this.STATE_ENTRANCE_ON_ENDED);
        this.mStateMachine.addState(this.STATE_ENTRANCE_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createStateMachineTransitions() {
        this.mStateMachine.addTransition(this.STATE_START, this.STATE_ENTRANCE_INIT, this.EVT_ON_CREATE);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_INIT, this.STATE_ENTRANCE_COMPLETE, this.COND_TRANSITION_NOT_SUPPORTED);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_INIT, this.STATE_ENTRANCE_COMPLETE, this.EVT_ON_CREATEVIEW);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_INIT, this.STATE_ENTRANCE_ON_PREPARED, this.EVT_PREPARE_ENTRANCE);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW, this.EVT_ON_CREATEVIEW);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_PERFORM, this.EVT_START_ENTRANCE);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW, this.STATE_ENTRANCE_PERFORM);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_PERFORM, this.STATE_ENTRANCE_ON_ENDED, this.EVT_ENTRANCE_END);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_ENDED, this.STATE_ENTRANCE_COMPLETE);
    }

    public final ProgressBarManager getProgressBarManager() {
        return this.mProgressBarManager;
    }

    void internalCreateEntranceTransition() {
        Object createEntranceTransition = createEntranceTransition();
        this.mEntranceTransition = createEntranceTransition;
        if (createEntranceTransition == null) {
            return;
        }
        TransitionHelper.addTransitionListener(createEntranceTransition, new TransitionListener() { // from class: androidx.leanback.app.BaseFragment.7
            @Override // androidx.leanback.transition.TransitionListener
            public void onTransitionEnd(Object obj) {
                BaseFragment baseFragment = BaseFragment.this;
                baseFragment.mEntranceTransition = null;
                baseFragment.mStateMachine.fireEvent(baseFragment.EVT_ENTRANCE_END);
            }
        });
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        createStateMachineStates();
        createStateMachineTransitions();
        this.mStateMachine.start();
        super.onCreate(bundle);
        this.mStateMachine.fireEvent(this.EVT_ON_CREATE);
    }

    protected void onEntranceTransitionEnd() {
    }

    protected void onEntranceTransitionPrepare() {
    }

    protected void onEntranceTransitionStart() {
    }

    void onExecuteEntranceTransition() {
        final View view = getView();
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.leanback.app.BaseFragment.6
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (FragmentUtil.getContext(BaseFragment.this) != null && BaseFragment.this.getView() != null) {
                    BaseFragment.this.internalCreateEntranceTransition();
                    BaseFragment.this.onEntranceTransitionStart();
                    BaseFragment baseFragment = BaseFragment.this;
                    Object obj = baseFragment.mEntranceTransition;
                    if (obj != null) {
                        baseFragment.runEntranceTransition(obj);
                        return false;
                    }
                    baseFragment.mStateMachine.fireEvent(baseFragment.EVT_ENTRANCE_END);
                    return false;
                }
                return true;
            }
        });
        view.invalidate();
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStateMachine.fireEvent(this.EVT_ON_CREATEVIEW);
    }

    public void prepareEntranceTransition() {
        this.mStateMachine.fireEvent(this.EVT_PREPARE_ENTRANCE);
    }

    protected void runEntranceTransition(Object obj) {
    }

    public void startEntranceTransition() {
        this.mStateMachine.fireEvent(this.EVT_START_ENTRANCE);
    }
}