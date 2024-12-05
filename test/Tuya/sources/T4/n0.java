package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class n0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10772a;

    /* renamed from: b, reason: collision with root package name */
    public final C1371g f10773b;

    /* renamed from: c, reason: collision with root package name */
    public final K f10774c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f10775d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f10776e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10777f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10778g;

    private n0(RelativeLayout relativeLayout, C1371g c1371g, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f10772a = relativeLayout;
        this.f10773b = c1371g;
        this.f10774c = k8;
        this.f10775d = recyclerView;
        this.f10776e = toolbar;
        this.f10777f = textView;
        this.f10778g = textView2;
    }

    public static n0 a(View view) {
        int i8 = R.id.app_info_selected_popup;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.app_info_selected_popup);
        if (findChildViewById != null) {
            C1371g a8 = C1371g.a(findChildViewById);
            i8 = R.id.loading_view_top_by_cat_fragment;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_top_by_cat_fragment);
            if (findChildViewById2 != null) {
                K a9 = K.a(findChildViewById2);
                i8 = R.id.recyclerview_top_cat;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview_top_cat);
                if (recyclerView != null) {
                    i8 = R.id.toolbar_top_by_cat;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_top_by_cat);
                    if (toolbar != null) {
                        i8 = R.id.tv_no_data_top_cat;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_top_cat);
                        if (textView != null) {
                            i8 = R.id.tv_toolbar_title_top_by_cat;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_top_by_cat);
                            if (textView2 != null) {
                                return new n0((RelativeLayout) view, a8, a9, recyclerView, toolbar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static n0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static n0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.top_by_category_fragment, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10772a;
    }
}
