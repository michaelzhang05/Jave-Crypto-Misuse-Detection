package J2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* loaded from: classes4.dex */
public final class u implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final View f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f4900b;

    private u(View view, RecyclerView recyclerView) {
        this.f4899a = view;
        this.f4900b = recyclerView;
    }

    public static u a(View view) {
        int i8 = AbstractC3403A.f34728P;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            return new u(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static u b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC3405C.f34801x, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f4899a;
    }
}
