package W4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* renamed from: W4.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1486j implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f12356a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12357b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12358c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f12359d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f12360e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f12361f;

    private C1486j(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        this.f12356a = linearLayout;
        this.f12357b = imageView;
        this.f12358c = imageView2;
        this.f12359d = relativeLayout;
        this.f12360e = textView;
        this.f12361f = textView2;
    }

    public static C1486j a(View view) {
        int i8 = R.id.iv_virustotal_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_virustotal_button);
        if (imageView != null) {
            i8 = R.id.iv_wishlist_button;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_wishlist_button);
            if (imageView2 != null) {
                i8 = R.id.rl_status_loading;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_status_loading);
                if (relativeLayout != null) {
                    i8 = R.id.tv_open_download_button;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_download_button);
                    if (textView != null) {
                        i8 = R.id.tv_status_download;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_download);
                        if (textView2 != null) {
                            return new C1486j((LinearLayout) view, imageView, imageView2, relativeLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f12356a;
    }
}
