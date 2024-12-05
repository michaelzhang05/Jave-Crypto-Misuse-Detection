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
public final class v0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f12596a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f12597b;

    /* renamed from: c, reason: collision with root package name */
    public final RelativeLayout f12598c;

    private v0(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2) {
        this.f12596a = relativeLayout;
        this.f12597b = imageView;
        this.f12598c = relativeLayout2;
    }

    public static v0 a(View view) {
        int i8 = R.id.iv_avatar_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_item);
        if (imageView != null) {
            i8 = R.id.rl_shadow_avatar_item;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_shadow_avatar_item);
            if (relativeLayout != null) {
                return new v0((RelativeLayout) view, imageView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static v0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.user_avatar, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f12596a;
    }
}
