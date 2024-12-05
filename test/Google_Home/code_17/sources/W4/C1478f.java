package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1478f implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12210a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12211b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12212c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f12213d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f12214e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f12215f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f12216g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12217h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12218i;

    private C1478f(RelativeLayout relativeLayout, ImageView imageView, K k8, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12210a = relativeLayout;
        this.f12211b = imageView;
        this.f12212c = k8;
        this.f12213d = relativeLayout2;
        this.f12214e = recyclerView;
        this.f12215f = toolbar;
        this.f12216g = textView;
        this.f12217h = textView2;
        this.f12218i = textView3;
    }

    public static C1478f a(View view) {
        int i8 = R.id.iv_logo_afa;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_afa);
        if (imageView != null) {
            i8 = R.id.loading_view_app_files;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_app_files);
            if (findChildViewById != null) {
                K a8 = K.a(findChildViewById);
                i8 = R.id.rl_header_afa;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_header_afa);
                if (relativeLayout != null) {
                    i8 = R.id.rv_app_files;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_app_files);
                    if (recyclerView != null) {
                        i8 = R.id.toolbar_afa;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_afa);
                        if (toolbar != null) {
                            i8 = R.id.tv_app_name_afa;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_afa);
                            if (textView != null) {
                                i8 = R.id.tv_date_afa;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_afa);
                                if (textView2 != null) {
                                    i8 = R.id.tv_no_data_afa;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_data_afa);
                                    if (textView3 != null) {
                                        return new C1478f((RelativeLayout) view, imageView, a8, relativeLayout, recyclerView, toolbar, textView, textView2, textView3);
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

    public static C1478f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1478f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.app_files_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12210a;
    }
}
