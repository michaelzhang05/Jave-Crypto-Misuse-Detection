package androidx.transition;

import androidx.annotation.NonNull;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public class TransitionListenerAdapter implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(@NonNull Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionEnd(Transition transition, boolean z8) {
        e.a(this, transition, z8);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionStart(Transition transition, boolean z8) {
        e.b(this, transition, z8);
    }
}
