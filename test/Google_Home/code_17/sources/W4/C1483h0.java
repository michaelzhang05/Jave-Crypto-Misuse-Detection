package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1483h0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12341a;

    /* renamed from: b, reason: collision with root package name */
    public final C1485i0 f12342b;

    /* renamed from: c, reason: collision with root package name */
    public final K f12343c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f12344d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12345e;

    private C1483h0(RelativeLayout relativeLayout, C1485i0 c1485i0, K k8, RecyclerView recyclerView, TextView textView) {
        this.f12341a = relativeLayout;
        this.f12342b = c1485i0;
        this.f12343c = k8;
        this.f12344d = recyclerView;
        this.f12345e = textView;
    }

    public static C1483h0 a(View view) {
        int i8 = R.id.include_search_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_search_bar);
        if (findChildViewById != null) {
            C1485i0 a8 = C1485i0.a(findChildViewById);
            i8 = R.id.loading_view_search;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_view_search);
            if (findChildViewById2 != null) {
                K a9 = K.a(findChildViewById2);
                i8 = R.id.rv_search_activity;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_search_activity);
                if (recyclerView != null) {
                    i8 = R.id.tv_msg_search_activity;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_msg_search_activity);
                    if (textView != null) {
                        return new C1483h0((RelativeLayout) view, a8, a9, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1483h0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1483h0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.search_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12341a;
    }
}
