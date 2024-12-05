package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1473c0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12128a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f12129b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12130c;

    /* renamed from: d, reason: collision with root package name */
    public final K f12131d;

    /* renamed from: e, reason: collision with root package name */
    public final View f12132e;

    /* renamed from: f, reason: collision with root package name */
    public final NestedScrollView f12133f;

    /* renamed from: g, reason: collision with root package name */
    public final C1475d0 f12134g;

    /* renamed from: h, reason: collision with root package name */
    public final C1477e0 f12135h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f12136i;

    /* renamed from: j, reason: collision with root package name */
    public final RecyclerView f12137j;

    /* renamed from: k, reason: collision with root package name */
    public final Toolbar f12138k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f12139l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f12140m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f12141n;

    private C1473c0(RelativeLayout relativeLayout, EditText editText, ImageView imageView, K k8, View view, NestedScrollView nestedScrollView, C1475d0 c1475d0, C1477e0 c1477e0, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        this.f12128a = relativeLayout;
        this.f12129b = editText;
        this.f12130c = imageView;
        this.f12131d = k8;
        this.f12132e = view;
        this.f12133f = nestedScrollView;
        this.f12134g = c1475d0;
        this.f12135h = c1477e0;
        this.f12136i = relativeLayout2;
        this.f12137j = recyclerView;
        this.f12138k = toolbar;
        this.f12139l = textView;
        this.f12140m = textView2;
        this.f12141n = textView3;
    }

    public static C1473c0 a(View view) {
        int i8 = R.id.et_reply;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_reply);
        if (editText != null) {
            i8 = R.id.iv_user_avatar_reply;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_user_avatar_reply);
            if (imageView != null) {
                i8 = R.id.loading_view_replies;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_replies);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.login_wall;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.login_wall);
                    if (findChildViewById2 != null) {
                        i8 = R.id.nsv_replies;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nsv_replies);
                        if (nestedScrollView != null) {
                            i8 = R.id.review;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.review);
                            if (findChildViewById3 != null) {
                                C1475d0 a9 = C1475d0.a(findChildViewById3);
                                i8 = R.id.review_turbo;
                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.review_turbo);
                                if (findChildViewById4 != null) {
                                    C1477e0 a10 = C1477e0.a(findChildViewById4);
                                    i8 = R.id.rl_user_reply;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_user_reply);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rv_reply;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_reply);
                                        if (recyclerView != null) {
                                            i8 = R.id.toolbar_reply;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_reply);
                                            if (toolbar != null) {
                                                i8 = R.id.tv_app_name_reply;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name_reply);
                                                if (textView != null) {
                                                    i8 = R.id.tv_no_answer;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_answer);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_send_reply;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_send_reply);
                                                        if (textView3 != null) {
                                                            return new C1473c0((RelativeLayout) view, editText, imageView, a8, findChildViewById2, nestedScrollView, a9, a10, relativeLayout, recyclerView, toolbar, textView, textView2, textView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C1473c0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C1473c0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.replies_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12128a;
    }
}
