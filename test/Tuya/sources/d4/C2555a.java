package d4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import b4.l;
import b4.m;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2555a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f30175a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f30176b;

    private C2555a(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f30175a = constraintLayout;
        this.f30176b = fragmentContainerView;
    }

    public static C2555a a(View view) {
        int i8 = l.f14682a;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i8);
        if (fragmentContainerView != null) {
            return new C2555a((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C2555a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C2555a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(m.f14683a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f30175a;
    }
}
