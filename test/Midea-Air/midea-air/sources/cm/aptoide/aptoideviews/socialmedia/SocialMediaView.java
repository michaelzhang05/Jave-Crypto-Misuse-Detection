package cm.aptoide.aptoideviews.socialmedia;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cm.aptoide.aptoideviews.R;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import rx.e;

/* compiled from: SocialMediaView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\u000f"}, d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onFacebookClicked", "Lrx/Observable;", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "onInstagramClicked", "onSocialMediaClick", "onTikTokClicked", "onTwitterClicked", "SocialMediaType", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialMediaView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;

    /* compiled from: SocialMediaView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "INSTAGRAM_CLICK", "TWITTER_CLICK", "FACEBOOK_CLICK", "TIKTOK_CLICK", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum SocialMediaType {
        INSTAGRAM_CLICK,
        TWITTER_CLICK,
        FACEBOOK_CLICK,
        TIKTOK_CLICK
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        this._$_findViewCache = new LinkedHashMap();
        FrameLayout.inflate(context, R.layout.social_media_view, this);
    }

    private final e<SocialMediaType> onFacebookClicked() {
        e X = e.g.a.c.a.a((ImageView) _$_findCachedViewById(R.id.facebook_button)).X(new rx.m.e() { // from class: cm.aptoide.aptoideviews.socialmedia.d
            @Override // rx.m.e
            public final Object call(Object obj) {
                SocialMediaView.SocialMediaType m8onFacebookClicked$lambda0;
                m8onFacebookClicked$lambda0 = SocialMediaView.m8onFacebookClicked$lambda0((Void) obj);
                return m8onFacebookClicked$lambda0;
            }
        });
        l.e(X, "clicks(facebook_button).…ediaType.FACEBOOK_CLICK }");
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFacebookClicked$lambda-0, reason: not valid java name */
    public static final SocialMediaType m8onFacebookClicked$lambda0(Void r0) {
        return SocialMediaType.FACEBOOK_CLICK;
    }

    private final e<SocialMediaType> onInstagramClicked() {
        e X = e.g.a.c.a.a((ImageView) _$_findCachedViewById(R.id.instagram_button)).X(new rx.m.e() { // from class: cm.aptoide.aptoideviews.socialmedia.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                SocialMediaView.SocialMediaType m9onInstagramClicked$lambda1;
                m9onInstagramClicked$lambda1 = SocialMediaView.m9onInstagramClicked$lambda1((Void) obj);
                return m9onInstagramClicked$lambda1;
            }
        });
        l.e(X, "clicks(instagram_button)…diaType.INSTAGRAM_CLICK }");
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInstagramClicked$lambda-1, reason: not valid java name */
    public static final SocialMediaType m9onInstagramClicked$lambda1(Void r0) {
        return SocialMediaType.INSTAGRAM_CLICK;
    }

    private final e<SocialMediaType> onTikTokClicked() {
        e X = e.g.a.c.a.a((ImageView) _$_findCachedViewById(R.id.tiktok_button)).X(new rx.m.e() { // from class: cm.aptoide.aptoideviews.socialmedia.a
            @Override // rx.m.e
            public final Object call(Object obj) {
                SocialMediaView.SocialMediaType m10onTikTokClicked$lambda3;
                m10onTikTokClicked$lambda3 = SocialMediaView.m10onTikTokClicked$lambda3((Void) obj);
                return m10onTikTokClicked$lambda3;
            }
        });
        l.e(X, "clicks(tiktok_button).ma…lMediaType.TIKTOK_CLICK }");
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTikTokClicked$lambda-3, reason: not valid java name */
    public static final SocialMediaType m10onTikTokClicked$lambda3(Void r0) {
        return SocialMediaType.TIKTOK_CLICK;
    }

    private final e<SocialMediaType> onTwitterClicked() {
        e X = e.g.a.c.a.a((ImageView) _$_findCachedViewById(R.id.twitter_button)).X(new rx.m.e() { // from class: cm.aptoide.aptoideviews.socialmedia.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                SocialMediaView.SocialMediaType m11onTwitterClicked$lambda2;
                m11onTwitterClicked$lambda2 = SocialMediaView.m11onTwitterClicked$lambda2((Void) obj);
                return m11onTwitterClicked$lambda2;
            }
        });
        l.e(X, "clicks(twitter_button).m…MediaType.TWITTER_CLICK }");
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTwitterClicked$lambda-2, reason: not valid java name */
    public static final SocialMediaType m11onTwitterClicked$lambda2(Void r0) {
        return SocialMediaType.TWITTER_CLICK;
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

    public final e<SocialMediaType> onSocialMediaClick() {
        e<SocialMediaType> c0 = e.c0(onFacebookClicked(), onInstagramClicked(), onTwitterClicked(), onTikTokClicked());
        l.e(c0, "merge(\n      onFacebookC…  onTikTokClicked()\n    )");
        return c0;
    }
}
