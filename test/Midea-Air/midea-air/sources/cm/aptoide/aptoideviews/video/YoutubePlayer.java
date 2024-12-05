package cm.aptoide.aptoideviews.video;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.aptoide.aptoideviews.ExtensionsKt;
import cm.aptoide.aptoideviews.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: YoutubePlayer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fJ\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcm/aptoide/aptoideviews/video/YoutubePlayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentEnableSubtitles", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/Boolean;", "currentVideoId", HttpUrl.FRAGMENT_ENCODE_SET, "threadHandler", "Landroid/os/Handler;", "loadVideo", HttpUrl.FRAGMENT_ENCODE_SET, "videoId", "enableSubtitles", "setListeners", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class YoutubePlayer extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private Boolean currentEnableSubtitles;
    private String currentVideoId;
    private final Handler threadHandler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final void setListeners() {
        int i2 = R.id.webview;
        ((YoutubeWebViewPlayer) _$_findCachedViewById(i2)).setOnPageFinishedAction(new YoutubePlayer$setListeners$1(this));
        ((YoutubeWebViewPlayer) _$_findCachedViewById(i2)).setOnErrorAction(new YoutubePlayer$setListeners$2(this));
        ((TextView) _$_findCachedViewById(R.id.status_text)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.video.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YoutubePlayer.m12setListeners$lambda0(YoutubePlayer.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setListeners$lambda-0, reason: not valid java name */
    public static final void m12setListeners$lambda0(YoutubePlayer youtubePlayer, View view) {
        l.f(youtubePlayer, "this$0");
        ((ProgressBar) youtubePlayer._$_findCachedViewById(R.id.progress_bar)).setVisibility(0);
        ((TextView) youtubePlayer._$_findCachedViewById(R.id.status_text)).setVisibility(8);
        ExtensionsKt.safeLet(youtubePlayer.currentVideoId, youtubePlayer.currentEnableSubtitles, new YoutubePlayer$setListeners$3$1(youtubePlayer));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void loadVideo(String videoId, boolean enableSubtitles) {
        l.f(videoId, "videoId");
        this.currentVideoId = videoId;
        this.currentEnableSubtitles = Boolean.valueOf(enableSubtitles);
        ((YoutubeWebViewPlayer) _$_findCachedViewById(R.id.webview)).loadVideo(videoId, enableSubtitles);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.threadHandler = new Handler();
        setLayoutTransition(new LayoutTransition());
        FrameLayout.inflate(context, R.layout.youtube_player, this);
        setListeners();
    }
}
