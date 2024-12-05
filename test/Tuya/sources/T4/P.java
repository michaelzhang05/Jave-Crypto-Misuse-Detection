package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class P implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10293a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f10294b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f10295c;

    /* renamed from: d, reason: collision with root package name */
    public final K f10296d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f10297e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10298f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f10299g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f10300h;

    /* renamed from: i, reason: collision with root package name */
    public final SearchView f10301i;

    /* renamed from: j, reason: collision with root package name */
    public final Toolbar f10302j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f10303k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f10304l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f10305m;

    private P(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, K k8, Q q8, RecyclerView recyclerView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, SearchView searchView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f10293a = relativeLayout;
        this.f10294b = imageView;
        this.f10295c = imageView2;
        this.f10296d = k8;
        this.f10297e = q8;
        this.f10298f = recyclerView;
        this.f10299g = relativeLayout2;
        this.f10300h = relativeLayout3;
        this.f10301i = searchView;
        this.f10302j = toolbar;
        this.f10303k = textView;
        this.f10304l = textView2;
        this.f10305m = textView3;
    }

    public static P a(View view) {
        int i8 = R.id.iv_resume_downloads_queue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_resume_downloads_queue);
        if (imageView != null) {
            i8 = R.id.iv_search_options_my_downloads;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_search_options_my_downloads);
            if (imageView2 != null) {
                i8 = R.id.loading_view_my_downloads;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_my_downloads);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.my_downloads_filters;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.my_downloads_filters);
                    if (findChildViewById2 != null) {
                        Q a9 = Q.a(findChildViewById2);
                        i8 = R.id.recyclerview;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerview);
                        if (recyclerView != null) {
                            i8 = R.id.rl_resume_downloads_queue;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_resume_downloads_queue);
                            if (relativeLayout != null) {
                                i8 = R.id.rl_search_my_downloads;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_search_my_downloads);
                                if (relativeLayout2 != null) {
                                    i8 = R.id.search_view_my_downloads;
                                    SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.search_view_my_downloads);
                                    if (searchView != null) {
                                        i8 = R.id.toolbar_downloads;
                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_downloads);
                                        if (toolbar != null) {
                                            i8 = R.id.tv_downloads_queue;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads_queue);
                                            if (textView != null) {
                                                i8 = R.id.tv_no_items;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items);
                                                if (textView2 != null) {
                                                    i8 = R.id.tv_toolbar_title_downloads;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_downloads);
                                                    if (textView3 != null) {
                                                        return new P((RelativeLayout) view, imageView, imageView2, a8, a9, recyclerView, relativeLayout, relativeLayout2, searchView, toolbar, textView, textView2, textView3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static P c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static P d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.my_downloads, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10293a;
    }
}
