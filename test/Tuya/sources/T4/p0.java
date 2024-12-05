package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class p0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10800a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f10801b;

    /* renamed from: c, reason: collision with root package name */
    public final K f10802c;

    /* renamed from: d, reason: collision with root package name */
    public final RadioButton f10803d;

    /* renamed from: e, reason: collision with root package name */
    public final RadioButton f10804e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f10805f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f10806g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f10807h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f10808i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f10809j;

    private p0(RelativeLayout relativeLayout, LinearLayout linearLayout, K k8, RadioButton radioButton, RadioButton radioButton2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f10800a = relativeLayout;
        this.f10801b = linearLayout;
        this.f10802c = k8;
        this.f10803d = radioButton;
        this.f10804e = radioButton2;
        this.f10805f = recyclerView;
        this.f10806g = toolbar;
        this.f10807h = textView;
        this.f10808i = textView2;
        this.f10809j = textView3;
    }

    public static p0 a(View view) {
        int i8 = R.id.ll_order_by_upcoming_releases;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_order_by_upcoming_releases);
        if (linearLayout != null) {
            i8 = R.id.loading_view_upcoming_releases;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_upcoming_releases);
            if (findChildViewById != null) {
                K a8 = K.a(findChildViewById);
                i8 = R.id.rb_date_ur;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_date_ur);
                if (radioButton != null) {
                    i8 = R.id.rb_name_ur;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_name_ur);
                    if (radioButton2 != null) {
                        i8 = R.id.rv_upcoming_releases;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_upcoming_releases);
                        if (recyclerView != null) {
                            i8 = R.id.toolbar_upcoming_releases;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_upcoming_releases);
                            if (toolbar != null) {
                                i8 = R.id.tv_label_order_by_ur;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_order_by_ur);
                                if (textView != null) {
                                    i8 = R.id.tv_no_items_upcoming_releases;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_items_upcoming_releases);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_title_upcoming_releases;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_upcoming_releases);
                                        if (textView3 != null) {
                                            return new p0((RelativeLayout) view, linearLayout, a8, radioButton, radioButton2, recyclerView, toolbar, textView, textView2, textView3);
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

    public static p0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static p0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.upcoming_releases_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10800a;
    }
}
