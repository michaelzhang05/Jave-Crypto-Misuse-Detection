package g4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import e4.l;
import e4.m;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2879a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f32055a;

    /* renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f32056b;

    private C2879a(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f32055a = constraintLayout;
        this.f32056b = fragmentContainerView;
    }

    public static C2879a a(View view) {
        int i8 = l.f31688a;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i8);
        if (fragmentContainerView != null) {
            return new C2879a((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C2879a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C2879a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(m.f31689a, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f32055a;
    }
}
