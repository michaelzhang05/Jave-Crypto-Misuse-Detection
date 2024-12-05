package cm.aptoide.pt.search.view.item;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.pt.app.view.screenshots.ScreenshotsAdapter;
import cm.aptoide.pt.dataprovider.model.v7.Malware;
import cm.aptoide.pt.download.view.Download;
import cm.aptoide.pt.download.view.DownloadClick;
import cm.aptoide.pt.download.view.DownloadStatusModel;
import cm.aptoide.pt.download.view.DownloadViewStatusHelper;
import cm.aptoide.pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.search.model.SearchAppResult;
import cm.aptoide.pt.search.model.SearchAppResultWrapper;
import cm.aptoide.pt.utils.AptoideUtils;
import cm.aptoide.pt.view.app.AppScreenshot;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: SearchResultViewHolder.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcm/aptoide/pt/search/view/item/SearchResultViewHolder;", "Lcm/aptoide/pt/search/view/item/SearchResultItemView;", "Lcm/aptoide/pt/search/model/SearchAppResult;", "itemView", "Landroid/view/View;", "itemClickSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/search/model/SearchAppResultWrapper;", "downloadClickSubject", "Lcm/aptoide/pt/download/view/DownloadClick;", "screenShotClick", "Lcm/aptoide/pt/app/view/screenshots/ScreenShotClickEvent;", "query", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/view/View;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Lrx/subjects/PublishSubject;Ljava/lang/String;)V", "adapter", "Lcm/aptoide/pt/app/view/screenshots/ScreenshotsAdapter;", "appInfoViewHolder", "Lcm/aptoide/pt/home/AppSecondaryInfoViewHolder;", "downloadViewStatusHelper", "Lcm/aptoide/pt/download/view/DownloadViewStatusHelper;", "setAppInfo", HttpUrl.FRAGMENT_ENCODE_SET, "result", "setDownloadStatus", "app", "setup", "setupMediaAdapter", "screenshots", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/view/app/AppScreenshot;", "Companion", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchResultViewHolder extends SearchResultItemView<SearchAppResult> {
    public static final int LAYOUT = 2131493170;
    private final ScreenshotsAdapter adapter;
    private final AppSecondaryInfoViewHolder appInfoViewHolder;
    private final rx.s.b<DownloadClick> downloadClickSubject;
    private final DownloadViewStatusHelper downloadViewStatusHelper;
    private final rx.s.b<SearchAppResultWrapper> itemClickSubject;
    private final String query;
    private final rx.s.b<ScreenShotClickEvent> screenShotClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewHolder(View view, rx.s.b<SearchAppResultWrapper> bVar, rx.s.b<DownloadClick> bVar2, rx.s.b<ScreenShotClickEvent> bVar3, String str) {
        super(view);
        l.f(view, "itemView");
        l.f(bVar, "itemClickSubject");
        l.f(bVar2, "downloadClickSubject");
        l.f(bVar3, "screenShotClick");
        this.itemClickSubject = bVar;
        this.downloadClickSubject = bVar2;
        this.screenShotClick = bVar3;
        this.query = str;
        Context context = view.getContext();
        l.e(context, "itemView.context");
        this.downloadViewStatusHelper = new DownloadViewStatusHelper(context);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, new DecimalFormat("0.0"));
        ScreenshotsAdapter screenshotsAdapter = new ScreenshotsAdapter(Collections.emptyList(), Collections.emptyList(), bVar3, 128);
        this.adapter = screenshotsAdapter;
        int i2 = R.id.media_rv;
        ((RecyclerView) view.findViewById(i2)).setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((RecyclerView) view.findViewById(i2)).setNestedScrollingEnabled(false);
        ((RecyclerView) view.findViewById(i2)).setAdapter(screenshotsAdapter);
    }

    private final void setAppInfo(final SearchAppResult result) {
        ((TextView) this.itemView.findViewById(R.id.app_name)).setText(result.getAppName());
        ((TextView) this.itemView.findViewById(R.id.downloads)).setText(AptoideUtils.StringU.withSuffix(result.getTotalDownloads()));
        View view = this.itemView;
        int i2 = R.id.app_icon;
        ImageLoader.with(((ImageView) view.findViewById(i2)).getContext()).load(result.getIcon(), (ImageView) this.itemView.findViewById(i2));
        float averageRating = result.getAverageRating();
        if (averageRating <= 0.0f) {
            ((TextView) this.itemView.findViewById(R.id.rating)).setText(R.string.appcardview_title_no_stars);
        } else {
            View view2 = this.itemView;
            int i3 = R.id.rating;
            ((TextView) view2.findViewById(i3)).setVisibility(0);
            ((TextView) this.itemView.findViewById(i3)).setText(new DecimalFormat("0.0").format(averageRating));
        }
        ((TextView) this.itemView.findViewById(R.id.store_name)).setText(result.getStoreName());
        this.appInfoViewHolder.setInfo(result.hasBilling() || result.hasAdvertising(), result.getAverageRating(), false, false);
        int rank = result.getRank();
        if (rank == Malware.Rank.TRUSTED.ordinal()) {
            View view3 = this.itemView;
            int i4 = R.id.app_badge;
            ImageLoader.with(((ImageView) view3.findViewById(i4)).getContext()).load(R.drawable.ic_badges_trusted, (ImageView) this.itemView.findViewById(i4));
        } else if (rank == Malware.Rank.CRITICAL.ordinal()) {
            View view4 = this.itemView;
            int i5 = R.id.app_badge;
            ImageLoader.with(((ImageView) view4.findViewById(i5)).getContext()).load(R.drawable.ic_badges_critical, (ImageView) this.itemView.findViewById(i5));
        } else if (rank == Malware.Rank.WARNING.ordinal()) {
            View view5 = this.itemView;
            int i6 = R.id.app_badge;
            ImageLoader.with(((ImageView) view5.findViewById(i6)).getContext()).load(R.drawable.ic_badges_warning, (ImageView) this.itemView.findViewById(i6));
        } else if (rank == Malware.Rank.UNKNOWN.ordinal()) {
            View view6 = this.itemView;
            int i7 = R.id.app_badge;
            ImageLoader.with(((ImageView) view6.findViewById(i7)).getContext()).load(R.drawable.ic_badges_unknown, (ImageView) this.itemView.findViewById(i7));
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.search.view.item.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SearchResultViewHolder.m310setAppInfo$lambda2(SearchResultViewHolder.this, result, view7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setAppInfo$lambda-2, reason: not valid java name */
    public static final void m310setAppInfo$lambda2(SearchResultViewHolder searchResultViewHolder, SearchAppResult searchAppResult, View view) {
        l.f(searchResultViewHolder, "this$0");
        l.f(searchAppResult, "$result");
        searchResultViewHolder.itemClickSubject.onNext(new SearchAppResultWrapper(searchResultViewHolder.query, searchAppResult, searchResultViewHolder.getAdapterPosition()));
    }

    private final void setupMediaAdapter(List<? extends AppScreenshot> screenshots) {
        this.adapter.updateScreenshots(screenshots);
        this.adapter.updateVideos(Collections.emptyList());
    }

    public final void setDownloadStatus(SearchAppResult app) {
        l.f(app, "app");
        DownloadStatusModel downloadModel = app.getDownloadModel();
        if (app.isHighlightedResult() && downloadModel != null) {
            DownloadViewStatusHelper downloadViewStatusHelper = this.downloadViewStatusHelper;
            Download download = app.getDownload();
            l.e(download, "app.download");
            View view = this.itemView;
            int i2 = R.id.install_button;
            Button button = (Button) view.findViewById(i2);
            l.e(button, "itemView.install_button");
            View view2 = this.itemView;
            int i3 = R.id.download_progress_view;
            DownloadProgressView downloadProgressView = (DownloadProgressView) view2.findViewById(i3);
            l.e(downloadProgressView, "itemView.download_progress_view");
            downloadViewStatusHelper.setDownloadStatus(download, button, downloadProgressView, this.downloadClickSubject);
            List<AppScreenshot> screenshots = app.getScreenshots();
            l.e(screenshots, "app.screenshots");
            setupMediaAdapter(screenshots);
            if (!((Button) this.itemView.findViewById(i2)).hasOnClickListeners()) {
                DownloadViewStatusHelper downloadViewStatusHelper2 = this.downloadViewStatusHelper;
                Download download2 = app.getDownload();
                l.e(download2, "app.download");
                rx.s.b<DownloadClick> bVar = this.downloadClickSubject;
                Button button2 = (Button) this.itemView.findViewById(i2);
                l.e(button2, "itemView.install_button");
                DownloadProgressView downloadProgressView2 = (DownloadProgressView) this.itemView.findViewById(i3);
                l.e(downloadProgressView2, "itemView.download_progress_view");
                downloadViewStatusHelper2.setupListeners(download2, bVar, button2, downloadProgressView2);
            } else if (downloadModel.getAction().equals(DownloadStatusModel.Action.OPEN)) {
                DownloadViewStatusHelper downloadViewStatusHelper3 = this.downloadViewStatusHelper;
                Download download3 = app.getDownload();
                l.e(download3, "app.download");
                rx.s.b<DownloadClick> bVar2 = this.downloadClickSubject;
                Button button3 = (Button) this.itemView.findViewById(i2);
                l.e(button3, "itemView.install_button");
                DownloadProgressView downloadProgressView3 = (DownloadProgressView) this.itemView.findViewById(i3);
                l.e(downloadProgressView3, "itemView.download_progress_view");
                downloadViewStatusHelper3.setupListeners(download3, bVar2, button3, downloadProgressView3);
            }
            ((RecyclerView) this.itemView.findViewById(R.id.media_rv)).setVisibility(0);
            return;
        }
        ((Button) this.itemView.findViewById(R.id.install_button)).setVisibility(8);
        ((DownloadProgressView) this.itemView.findViewById(R.id.download_progress_view)).setVisibility(8);
        ((RecyclerView) this.itemView.findViewById(R.id.media_rv)).setVisibility(8);
    }

    @Override // cm.aptoide.pt.search.view.item.SearchResultItemView
    public void setup(SearchAppResult result) {
        if (result != null) {
            setAppInfo(result);
            setDownloadStatus(result);
        }
    }
}
