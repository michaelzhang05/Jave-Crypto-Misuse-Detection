package cm.aptoide.pt.promotions;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.promotions.PromotionAppClick;
import java.text.DecimalFormat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class PromotionAppDownloadingViewHolder extends RecyclerView.c0 {
    private TextView appDescription;
    private ImageView appIcon;
    private TextView appName;
    private TextView appRewardMessage;
    private ImageView cancelDownload;
    private LinearLayout downloadControlsLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private ImageView pauseDownload;
    private final rx.s.b<PromotionAppClick> promotionAppClick;
    private ImageView resumeDownload;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.promotions.PromotionAppDownloadingViewHolder$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr;
            try {
                iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PromotionAppDownloadingViewHolder(View view, rx.s.b<PromotionAppClick> bVar) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(R.id.app_icon);
        this.appName = (TextView) view.findViewById(R.id.app_name);
        this.appDescription = (TextView) view.findViewById(R.id.app_description);
        this.downloadProgressBar = (ProgressBar) view.findViewById(R.id.promotions_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(R.id.promotions_download_progress_number);
        this.pauseDownload = (ImageView) view.findViewById(R.id.promotions_download_pause_download);
        this.cancelDownload = (ImageView) view.findViewById(R.id.promotions_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(R.id.promotions_download_resume_download);
        this.downloadControlsLayout = (LinearLayout) view.findViewById(R.id.install_controls_layout);
        this.appRewardMessage = (TextView) view.findViewById(R.id.app_reward);
        this.promotionAppClick = bVar;
    }

    private SpannableString handleRewardMessage(float f2, String str, double d2, boolean z) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String d3 = Double.toString(Math.floor(f2));
        if (z) {
            string = this.itemView.getContext().getString(R.string.FIATpromotion_update_to_get_short, d3, str + decimalFormat.format(d2));
        } else {
            string = this.itemView.getContext().getString(R.string.FIATpromotion_install_to_get_short, d3, str + decimalFormat.format(d2));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getContext().getResources().getColor(R.color.promotions_reward)), string.indexOf(d3), string.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDownloadState$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    private void setAppCardHeader(PromotionViewApp promotionViewApp) {
        ImageLoader.with(this.itemView.getContext()).load(promotionViewApp.getAppIcon(), this.appIcon);
        this.appName.setText(promotionViewApp.getName());
        this.appDescription.setText(promotionViewApp.getDescription());
        this.appRewardMessage.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
    }

    private void setDownloadState(int i2, final PromotionViewApp promotionViewApp) {
        DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        switch (AnonymousClass1.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()]) {
            case 1:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i2);
                this.downloadProgressValue.setText(String.valueOf(i2) + "%");
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.a1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppDownloadingViewHolder.this.a(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            case 2:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.d1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppDownloadingViewHolder.this.b(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            case 3:
                this.downloadProgressBar.setIndeterminate(false);
                this.downloadProgressBar.setProgress(i2);
                this.downloadProgressValue.setText(String.valueOf(i2) + "%");
                this.pauseDownload.setVisibility(8);
                this.cancelDownload.setVisibility(0);
                this.cancelDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppDownloadingViewHolder.this.c(promotionViewApp, view);
                    }
                });
                this.resumeDownload.setVisibility(0);
                this.resumeDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.c1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppDownloadingViewHolder.this.d(promotionViewApp, view);
                    }
                });
                this.downloadControlsLayout.setLayoutParams(layoutParams2);
                return;
            case 4:
            case 5:
            case 6:
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.b1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppDownloadingViewHolder.this.e(promotionViewApp, view);
                    }
                });
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                return;
            default:
                return;
        }
    }

    public void setApp(PromotionViewApp promotionViewApp) {
        setAppCardHeader(promotionViewApp);
        setDownloadState(promotionViewApp.getDownloadModel().getProgress(), promotionViewApp);
    }
}
