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
import com.uptodown.util.views.UsernameTextView;

/* loaded from: classes5.dex */
public final class x0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12619a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12620b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12621c;

    /* renamed from: d, reason: collision with root package name */
    public final K f12622d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f12623e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f12624f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f12625g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f12626h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f12627i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12628j;

    /* renamed from: k, reason: collision with root package name */
    public final UsernameTextView f12629k;

    /* renamed from: l, reason: collision with root package name */
    public final View f12630l;

    private x0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, K k8, RelativeLayout relativeLayout2, RecyclerView recyclerView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, UsernameTextView usernameTextView, View view) {
        this.f12619a = relativeLayout;
        this.f12620b = imageView;
        this.f12621c = imageView2;
        this.f12622d = k8;
        this.f12623e = relativeLayout2;
        this.f12624f = recyclerView;
        this.f12625g = toolbar;
        this.f12626h = textView;
        this.f12627i = textView2;
        this.f12628j = textView3;
        this.f12629k = usernameTextView;
        this.f12630l = view;
    }

    public static x0 a(View view) {
        int i8 = R.id.iv_avatar_user_comment;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_user_comment);
        if (imageView != null) {
            i8 = R.id.iv_turbo_mark_user_comment;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_user_comment);
            if (imageView2 != null) {
                i8 = R.id.loading_view_user_comments;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.loading_view_user_comments);
                if (findChildViewById != null) {
                    K a8 = K.a(findChildViewById);
                    i8 = R.id.rl_info_user_comment;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_info_user_comment);
                    if (relativeLayout != null) {
                        i8 = R.id.rv_user_comments;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_user_comments);
                        if (recyclerView != null) {
                            i8 = R.id.toolbar_user_comments;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar_user_comments);
                            if (toolbar != null) {
                                i8 = R.id.tv_date_user_comment;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_user_comment);
                                if (textView != null) {
                                    i8 = R.id.tv_error_user_comments;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_error_user_comments);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_toolbar_title_user_comments;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_toolbar_title_user_comments);
                                        if (textView3 != null) {
                                            i8 = R.id.tv_username_user_comment;
                                            UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_user_comment);
                                            if (usernameTextView != null) {
                                                i8 = R.id.v_separator_user_comments;
                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_separator_user_comments);
                                                if (findChildViewById2 != null) {
                                                    return new x0((RelativeLayout) view, imageView, imageView2, a8, relativeLayout, recyclerView, toolbar, textView, textView2, textView3, usernameTextView, findChildViewById2);
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

    public static x0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static x0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_comments_activity, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12619a;
    }
}