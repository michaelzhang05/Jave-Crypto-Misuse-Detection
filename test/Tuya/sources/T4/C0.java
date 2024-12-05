package T4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;

/* loaded from: classes4.dex */
public final class C0 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f10051a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f10052b;

    /* renamed from: c, reason: collision with root package name */
    public final YouTubePlayerView f10053c;

    private C0(RelativeLayout relativeLayout, FrameLayout frameLayout, YouTubePlayerView youTubePlayerView) {
        this.f10051a = relativeLayout;
        this.f10052b = frameLayout;
        this.f10053c = youTubePlayerView;
    }

    public static C0 a(View view) {
        int i8 = R.id.youtube_full_screen;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.youtube_full_screen);
        if (frameLayout != null) {
            i8 = R.id.youtube_view;
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ViewBindings.findChildViewById(view, R.id.youtube_view);
            if (youTubePlayerView != null) {
                return new C0((RelativeLayout) view, frameLayout, youTubePlayerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z8) {
        View inflate = layoutInflater.inflate(R.layout.video_youtube, viewGroup, false);
        if (z8) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f10051a;
    }
}
