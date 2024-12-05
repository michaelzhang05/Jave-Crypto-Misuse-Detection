package cm.aptoide.pt.reviews;

import android.view.View;
import cm.aptoide.pt.dataprovider.model.v7.GetAppMeta;
import cm.aptoide.pt.view.recycler.widget.Widget;

/* loaded from: classes.dex */
public class ReviewsRatingWidget extends Widget<ReviewsRatingDisplayable> {
    private RatingBarsLayout ratingBarsLayout;
    private RatingTotalsLayout ratingTotalsLayout;

    public ReviewsRatingWidget(View view) {
        super(view);
    }

    private void setupRating(GetAppMeta.App app) {
        this.ratingTotalsLayout.setup(app.getStats().getGlobalRating());
        this.ratingBarsLayout.setup(app.getStats().getGlobalRating());
    }

    @Override // cm.aptoide.pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.ratingTotalsLayout = new RatingTotalsLayout(view);
        this.ratingBarsLayout = new RatingBarsLayout(view);
    }

    @Override // cm.aptoide.pt.view.recycler.widget.Widget
    public void bindView(ReviewsRatingDisplayable reviewsRatingDisplayable, int i2) {
        setupRating(reviewsRatingDisplayable.getAppMeta());
    }
}
