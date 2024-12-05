package Q3;

import android.view.View;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    private final ScrollView f8222a;

    /* renamed from: b, reason: collision with root package name */
    public final BrandZoneView f8223b;

    /* renamed from: c, reason: collision with root package name */
    public final ChallengeZoneView f8224c;

    /* renamed from: d, reason: collision with root package name */
    public final InformationZoneView f8225d;

    private c(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.f8222a = scrollView;
        this.f8223b = brandZoneView;
        this.f8224c = challengeZoneView;
        this.f8225d = informationZoneView;
    }

    public static c a(View view) {
        int i8 = P3.d.f7941b;
        BrandZoneView brandZoneView = (BrandZoneView) ViewBindings.findChildViewById(view, i8);
        if (brandZoneView != null) {
            i8 = P3.d.f7942c;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) ViewBindings.findChildViewById(view, i8);
            if (challengeZoneView != null) {
                i8 = P3.d.f7943d;
                InformationZoneView informationZoneView = (InformationZoneView) ViewBindings.findChildViewById(view, i8);
                if (informationZoneView != null) {
                    return new c((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f8222a;
    }
}
