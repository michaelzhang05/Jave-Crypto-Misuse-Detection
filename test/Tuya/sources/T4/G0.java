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
public final class G0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10116a;

    /* renamed from: b, reason: collision with root package name */
    public final K f10117b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f10118c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f10119d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f10120e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10121f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f10122g;

    private G0(RelativeLayout relativeLayout, K k8, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f10116a = relativeLayout;
        this.f10117b = k8;
        this.f10118c = recyclerView;
        this.f10119d = toolbar;
        this.f10120e = textView;
        this.f10121f = textView2;
        this.f10122g = textView3;
    }

    public static G0 a(View view) {
        int i8 = R.id.loading_view_wishlist;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_wishlist);
        if (findChildViewById != null) {
            K a8 = K.a(findChildViewById);
            i8 = R.id.rv_wishlist;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_wishlist);
            if (recyclerView != null) {
                i8 = R.id.toolbar_wishlist;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_wishlist);
                if (toolbar != null) {
                    i8 = R.id.tv_explore_wishlist;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_explore_wishlist);
                    if (textView != null) {
                        i8 = R.id.tv_no_items_wishlist;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items_wishlist);
                        if (textView2 != null) {
                            i8 = R.id.tv_title_wishlist;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_wishlist);
                            if (textView3 != null) {
                                return new G0((RelativeLayout) view, a8, recyclerView, toolbar, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static G0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static G0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.wishlist_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10116a;
    }
}
