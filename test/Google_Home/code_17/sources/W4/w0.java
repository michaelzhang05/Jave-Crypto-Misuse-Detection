package W4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* loaded from: classes5.dex */
public final class w0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12610a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12611b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f12612c;

    /* renamed from: d, reason: collision with root package name */
    public final RelativeLayout f12613d;

    private w0(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout2) {
        this.f12610a = relativeLayout;
        this.f12611b = imageView;
        this.f12612c = imageView2;
        this.f12613d = relativeLayout2;
    }

    public static w0 a(View view) {
        int i8 = R.id.iv_avatar_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_item);
        if (imageView != null) {
            i8 = R.id.iv_locked_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_locked_item);
            if (imageView2 != null) {
                i8 = R.id.rl_shadow_avatar_item;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_shadow_avatar_item);
                if (relativeLayout != null) {
                    return new w0((RelativeLayout) view, imageView, imageView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static w0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_avatar_turbo, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12610a;
    }
}
