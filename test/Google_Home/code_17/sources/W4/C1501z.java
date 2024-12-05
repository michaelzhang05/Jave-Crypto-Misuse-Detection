package W4;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.views.ScrollableTextView;

/* renamed from: W4.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1501z implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12679a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12680b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12681c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f12682d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f12683e;

    /* renamed from: f, reason: collision with root package name */
    public final RelativeLayout f12684f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f12685g;

    /* renamed from: h, reason: collision with root package name */
    public final RelativeLayout f12686h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f12687i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f12688j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f12689k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f12690l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f12691m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f12692n;

    /* renamed from: o, reason: collision with root package name */
    public final ScrollableTextView f12693o;

    /* renamed from: p, reason: collision with root package name */
    public final ScrollableTextView f12694p;

    private C1501z(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ScrollableTextView scrollableTextView, ScrollableTextView scrollableTextView2) {
        this.f12679a = relativeLayout;
        this.f12680b = imageView;
        this.f12681c = imageView2;
        this.f12682d = imageView3;
        this.f12683e = progressBar;
        this.f12684f = relativeLayout2;
        this.f12685g = relativeLayout3;
        this.f12686h = relativeLayout4;
        this.f12687i = relativeLayout5;
        this.f12688j = textView;
        this.f12689k = textView2;
        this.f12690l = textView3;
        this.f12691m = textView4;
        this.f12692n = textView5;
        this.f12693o = scrollableTextView;
        this.f12694p = scrollableTextView2;
    }

    public static C1501z a(View view) {
        int i8 = R.id.iv_cancel_downloading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel_downloading);
        if (imageView != null) {
            i8 = R.id.iv_resume_downloading;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_resume_downloading);
            if (imageView2 != null) {
                i8 = R.id.iv_status_pre_register;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_status_pre_register);
                if (imageView3 != null) {
                    i8 = R.id.pb_download_button;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_download_button);
                    if (progressBar != null) {
                        i8 = R.id.rl_status_download;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_download);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_status_downloading;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_downloading);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_status_loading;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_loading);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_status_pre_register;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_pre_register);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.tv_enqueue_download;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_enqueue_download);
                                        if (textView != null) {
                                            i8 = R.id.tv_open_download_button;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_download_button);
                                            if (textView2 != null) {
                                                i8 = R.id.tv_percentage_downloaded;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_percentage_downloaded);
                                                if (textView3 != null) {
                                                    i8 = R.id.tv_size_downloaded;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_downloaded);
                                                    if (textView4 != null) {
                                                        i8 = R.id.tv_size_total;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size_total);
                                                        if (textView5 != null) {
                                                            i8 = R.id.tv_status_download;
                                                            ScrollableTextView scrollableTextView = (ScrollableTextView) ViewBindings.findChildViewById(view, R.id.tv_status_download);
                                                            if (scrollableTextView != null) {
                                                                i8 = R.id.tv_status_pre_register;
                                                                ScrollableTextView scrollableTextView2 = (ScrollableTextView) ViewBindings.findChildViewById(view, R.id.tv_status_pre_register);
                                                                if (scrollableTextView2 != null) {
                                                                    return new C1501z((RelativeLayout) view, imageView, imageView2, imageView3, progressBar, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5, scrollableTextView, scrollableTextView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12679a;
    }
}
