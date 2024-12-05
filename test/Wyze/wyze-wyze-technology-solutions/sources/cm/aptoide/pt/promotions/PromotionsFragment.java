package cm.aptoide.pt.promotions;

import android.app.AlertDialog;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.promotions.PromotionAppClick;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.util.AppBarStateChangeListener;
import cm.aptoide.pt.utils.GenericDialogs;
import cm.aptoide.pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import rx.exceptions.OnErrorNotImplementedException;

/* loaded from: classes.dex */
public class PromotionsFragment extends NavigationTrackFragment implements PromotionsView {
    private AppBarLayout appBarLayout;
    private Drawable backArrow;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private rx.k errorMessageSubscription;
    private View genericErrorView;
    private View genericErrorViewRetry;
    private ProgressBar loading;
    private Button promotionAction;
    private rx.s.b<PromotionAppClick> promotionAppClick;
    private TextView promotionFirstMessage;
    private rx.s.b<Void> promotionOverDialogClick;
    private TextView promotionTitle;
    private PromotionsAdapter promotionsAdapter;
    private RecyclerView promotionsList;

    @Inject
    PromotionsPresenter promotionsPresenter;
    private View promotionsView;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private ImageView toolbarImage;
    private ImageView toolbarImagePlaceholder;
    private TextView toolbarTitle;
    private View walletActiveView;
    private View walletInactiveView;
    private Window window;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.promotions.PromotionsFragment$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.DOWNGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr2;
            try {
                iArr2[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[AppBarStateChangeListener.State.values().length];
            $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = iArr3;
            try {
                iArr3[AppBarStateChangeListener.State.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private int getButtonMessage(int i2) {
        if (i2 == 0) {
            return R.string.appview_button_update;
        }
        if (i2 != 1 && i2 != 3) {
            if (i2 == 4) {
                return R.string.promotion_claim_button;
            }
            if (i2 == 5) {
                return R.string.holidayspromotion_button_claimed;
            }
            if (i2 != 6) {
                throw new IllegalArgumentException("Wrong view type of promotion app");
            }
        }
        return R.string.install;
    }

    private PromotionAppClick.ClickType getClickType(int i2) {
        if (i2 == 0) {
            return PromotionAppClick.ClickType.UPDATE;
        }
        if (i2 == 1) {
            return PromotionAppClick.ClickType.DOWNLOAD;
        }
        if (i2 == 3) {
            return PromotionAppClick.ClickType.INSTALL_APP;
        }
        if (i2 == 4) {
            return PromotionAppClick.ClickType.CLAIM;
        }
        if (i2 == 6) {
            return PromotionAppClick.ClickType.DOWNGRADE;
        }
        throw new IllegalArgumentException("Wrong view type of promotion app");
    }

    private int getState(PromotionViewApp promotionViewApp) {
        DownloadModel downloadModel = promotionViewApp.getDownloadModel();
        if (downloadModel.isDownloading()) {
            return 2;
        }
        int i2 = AnonymousClass2.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return promotionViewApp.isClaimed() ? 5 : 4;
        }
        if (i2 == 4) {
            return 0;
        }
        throw new IllegalArgumentException("Invalid type of download action");
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(R.string.error_occured));
        }
    }

    private SpannableString handleRewardMessage(float f2, String str, double d2, boolean z) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String d3 = Double.toString(Math.floor(f2));
        if (z) {
            string = getString(R.string.FIATpromotion_update_to_get_short, d3, str + decimalFormat.format(d2));
        } else {
            string = getString(R.string.FIATpromotion_install_to_get_short, d3, str + decimalFormat.format(d2));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.promotions_reward)), string.indexOf(d3), string.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStatusBar(boolean z) {
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                if (i2 > 23 && !this.themeManager.isThemeDark()) {
                    this.window.getDecorView().setSystemUiVisibility(8192);
                }
                this.window.setStatusBarColor(getResources().getColor(this.themeManager.getAttributeForTheme(R.attr.statusBarColorSecondary).resourceId));
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.window.setStatusBarColor(getResources().getColor(R.color.black_87_alpha));
            this.window.getDecorView().setSystemUiVisibility(0);
        }
    }

    private boolean isWalletInstalled() {
        Iterator<ApplicationInfo> it = getContext().getPackageManager().getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setWalletItemClickListener$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.NAVIGATE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showErrorDialog$22(GenericDialogs.EResponse eResponse) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showErrorDialog$23(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showPromotionOverDialog$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(AlertDialog alertDialog, View view) {
        this.promotionOverDialogClick.onNext(null);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void k(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.INSTALL_APP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    private void setClaimedButton() {
        this.promotionAction.setEnabled(false);
        this.promotionAction.setBackgroundColor(getResources().getColor(R.color.grey_fog_light));
        this.promotionAction.setTextColor(getResources().getColor(R.color.black));
        SpannableString spannableString = new SpannableString("  " + getResources().getString(R.string.holidayspromotion_button_claimed).toUpperCase());
        Drawable d2 = c.a.k.a.a.d(getContext(), R.drawable.ic_promotion_claimed_check);
        d2.setBounds(0, 0, d2.getIntrinsicWidth(), d2.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(d2, 1), 0, 1, 18);
        this.promotionAction.setTransformationMethod(null);
        this.promotionAction.setText(spannableString);
    }

    private void setWalletItemClickListener(final PromotionViewApp promotionViewApp) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionsFragment.this.e(promotionViewApp, view);
            }
        };
        this.walletInactiveView.setOnClickListener(onClickListener);
        this.walletActiveView.setOnClickListener(onClickListener);
    }

    private void setupRecyclerView() {
        this.promotionsList.setAdapter(this.promotionsAdapter);
        this.promotionsList.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView.l itemAnimator = this.promotionsList.getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.q) {
            ((androidx.recyclerview.widget.q) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId).I0(rx.l.c.a.b()).H0(new rx.m.b() { // from class: cm.aptoide.pt.promotions.w1
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsFragment.lambda$showErrorDialog$22((GenericDialogs.EResponse) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.promotions.d2
            @Override // rx.m.b
            public final void call(Object obj) {
                PromotionsFragment.lambda$showErrorDialog$23((Throwable) obj);
                throw null;
            }
        });
    }

    private void showWallet(final PromotionViewApp promotionViewApp, boolean z) {
        if (promotionViewApp.getDownloadModel().isDownloading()) {
            this.walletActiveView.setVisibility(0);
            this.walletInactiveView.setVisibility(8);
            ImageView imageView = (ImageView) this.walletActiveView.findViewById(R.id.app_icon);
            TextView textView = (TextView) this.walletActiveView.findViewById(R.id.app_name);
            TextView textView2 = (TextView) this.walletActiveView.findViewById(R.id.app_reward);
            TextView textView3 = (TextView) this.walletActiveView.findViewById(R.id.app_description);
            ProgressBar progressBar = (ProgressBar) this.walletActiveView.findViewById(R.id.promotions_download_progress_bar);
            TextView textView4 = (TextView) this.walletActiveView.findViewById(R.id.promotions_download_progress_number);
            ImageView imageView2 = (ImageView) this.walletActiveView.findViewById(R.id.promotions_download_pause_download);
            ImageView imageView3 = (ImageView) this.walletActiveView.findViewById(R.id.promotions_download_cancel_button);
            ImageView imageView4 = (ImageView) this.walletActiveView.findViewById(R.id.promotions_download_resume_download);
            LinearLayout linearLayout = (LinearLayout) this.walletActiveView.findViewById(R.id.install_controls_layout);
            ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), imageView);
            textView.setText(promotionViewApp.getName());
            textView3.setText(promotionViewApp.getDescription());
            textView2.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
            DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
            int i2 = AnonymousClass2.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
            if (i2 == 1) {
                progressBar.setIndeterminate(false);
                progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
                textView4.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
                imageView2.setVisibility(0);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.y1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionsFragment.this.g(promotionViewApp, view);
                    }
                });
                imageView3.setVisibility(8);
                imageView4.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            if (i2 == 2) {
                progressBar.setIndeterminate(true);
                imageView2.setVisibility(0);
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.s1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionsFragment.this.h(promotionViewApp, view);
                    }
                });
                imageView3.setVisibility(8);
                imageView4.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return;
                    }
                    showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(R.string.error_occured));
                    return;
                } else {
                    progressBar.setIndeterminate(true);
                    imageView2.setVisibility(0);
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.u1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PromotionsFragment.this.k(promotionViewApp, view);
                        }
                    });
                    imageView3.setVisibility(8);
                    imageView4.setVisibility(8);
                    linearLayout.setLayoutParams(layoutParams);
                    return;
                }
            }
            progressBar.setIndeterminate(false);
            progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
            textView4.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
            imageView2.setVisibility(8);
            imageView3.setVisibility(0);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PromotionsFragment.this.i(promotionViewApp, view);
                }
            });
            imageView4.setVisibility(0);
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PromotionsFragment.this.j(promotionViewApp, view);
                }
            });
            linearLayout.setLayoutParams(layoutParams2);
            return;
        }
        if (promotionViewApp.getDownloadModel().hasError()) {
            handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
        }
        this.walletActiveView.setVisibility(8);
        this.walletInactiveView.setVisibility(0);
        ImageView imageView5 = (ImageView) this.walletInactiveView.findViewById(R.id.app_icon);
        TextView textView5 = (TextView) this.walletInactiveView.findViewById(R.id.app_name);
        TextView textView6 = (TextView) this.walletInactiveView.findViewById(R.id.app_description);
        TextView textView7 = (TextView) this.walletInactiveView.findViewById(R.id.app_reward);
        ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), imageView5);
        textView5.setText(promotionViewApp.getName());
        textView6.setText(promotionViewApp.getDescription());
        textView7.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
        this.promotionAction.setText(getContext().getString(getButtonMessage(getState(promotionViewApp)), Float.valueOf(promotionViewApp.getAppcValue())));
        if (getState(promotionViewApp) == 5) {
            if (!isWalletInstalled()) {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.appc_gradient_rounded));
                this.promotionAction.setText(getContext().getString(R.string.appview_button_install));
                this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionsFragment.this.l(promotionViewApp, view);
                    }
                });
            } else {
                setClaimedButton();
            }
            this.promotionsAdapter.isWalletInstalled(z);
            return;
        }
        if (getState(promotionViewApp) == 4) {
            this.promotionAction.setEnabled(true);
            this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.card_border_rounded_green));
            this.promotionAction.setTextColor(-1);
            this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PromotionsFragment.this.m(promotionViewApp, view);
                }
            });
            this.promotionsAdapter.isWalletInstalled(true);
            return;
        }
        this.promotionAction.setEnabled(true);
        this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.appc_gradient_rounded));
        if (promotionViewApp.isClaimed()) {
            this.promotionAction.setText(getContext().getString(R.string.appview_button_install));
        }
        this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionsFragment.this.n(promotionViewApp, view);
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionAppClick> appCardClick() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.m1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionAppClick) obj).getClickType().equals(PromotionAppClick.ClickType.NAVIGATE));
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionViewApp> cancelDownload() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.f2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getClickType() == PromotionAppClick.ClickType.CANCEL_DOWNLOAD);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.x1
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionViewApp app;
                app = ((PromotionAppClick) obj).getApp();
                return app;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionViewApp> claimAppClick() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.t1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getClickType() == PromotionAppClick.ClickType.CLAIM);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.l1
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionViewApp app;
                app = ((PromotionAppClick) obj).getApp();
                return app;
            }
        });
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionViewApp> installButtonClick() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.c2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r2.getClickType() == PromotionAppClick.ClickType.UPDATE || r2.getClickType() == PromotionAppClick.ClickType.INSTALL_APP || r2.getClickType() == PromotionAppClick.ClickType.DOWNLOAD || r2.getClickType() == PromotionAppClick.ClickType.DOWNGRADE);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.z1
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionViewApp app;
                app = ((PromotionAppClick) obj).getApp();
                return app;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void lockPromotionApps(boolean z) {
        this.promotionsAdapter.isWalletInstalled(z);
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.window = getActivity().getWindow();
        this.promotionOverDialogClick = rx.s.b.g1();
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_promotions, viewGroup, false);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.window = null;
        this.promotionAppClick = null;
        this.promotionOverDialogClick = null;
        rx.k kVar = this.errorMessageSubscription;
        if (kVar == null || kVar.isUnsubscribed()) {
            return;
        }
        this.errorMessageSubscription.unsubscribe();
    }

    @Override // com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.themeManager.resetToBaseTheme();
        if (Build.VERSION.SDK_INT >= 16) {
            this.window.getDecorView().setSystemUiVisibility(256);
        }
        this.toolbarTitle = null;
        this.toolbar = null;
        this.promotionsList = null;
        this.promotionsAdapter = null;
        this.collapsingToolbarLayout = null;
        this.appBarLayout = null;
        this.backArrow = null;
        this.walletActiveView = null;
        this.walletInactiveView = null;
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.promotionsList = (RecyclerView) view.findViewById(R.id.fragment_promotions_promotions_list);
        this.promotionAppClick = rx.s.b.g1();
        this.promotionsAdapter = new PromotionsAdapter(new ArrayList(), new PromotionsViewHolderFactory(this.promotionAppClick, this.themeManager));
        this.toolbarImage = (ImageView) view.findViewById(R.id.app_graphic);
        this.toolbarImagePlaceholder = (ImageView) view.findViewById(R.id.app_graphic_placeholder);
        this.promotionTitle = (TextView) view.findViewById(R.id.promotions_title);
        this.promotionFirstMessage = (TextView) view.findViewById(R.id.promotions_message_1);
        this.walletActiveView = view.findViewById(R.id.promotion_wallet_active);
        View findViewById = view.findViewById(R.id.promotion_wallet_inactive);
        this.walletInactiveView = findViewById;
        this.promotionAction = (Button) findViewById.findViewById(R.id.promotion_app_action_button);
        this.loading = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.promotionsView = view.findViewById(R.id.promotions_view);
        View findViewById2 = view.findViewById(R.id.generic_error);
        this.genericErrorView = findViewById2;
        this.genericErrorViewRetry = findViewById2.findViewById(R.id.retry);
        this.toolbarTitle = (TextView) view.findViewById(R.id.toolbar_title);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.toolbar = toolbar;
        toolbar.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        androidx.appcompat.app.a supportActionBar = dVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(true);
        }
        this.backArrow = this.toolbar.getNavigationIcon();
        this.appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.transparent));
        this.collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.transparent));
        this.appBarLayout.b(new AppBarStateChangeListener() { // from class: cm.aptoide.pt.promotions.PromotionsFragment.1
            private void configureAppBarLayout(Drawable drawable, int i2, boolean z) {
                PromotionsFragment.this.toolbar.setBackgroundDrawable(drawable);
                PromotionsFragment.this.toolbarTitle.setTextColor(i2);
                if (Build.VERSION.SDK_INT >= 21) {
                    PromotionsFragment.this.handleStatusBar(z);
                }
                if (PromotionsFragment.this.backArrow != null) {
                    PromotionsFragment.this.backArrow.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                }
            }

            @Override // cm.aptoide.pt.util.AppBarStateChangeListener
            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                Resources resources = PromotionsFragment.this.getResources();
                int i2 = AnonymousClass2.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()];
                if (i2 != 1) {
                    if (i2 != 4) {
                        PromotionsFragment.this.toolbarTitle.setVisibility(8);
                        configureAppBarLayout(resources.getDrawable(R.drawable.editorial_up_bottom_black_gradient), resources.getColor(R.color.white), false);
                    } else {
                        PromotionsFragment.this.toolbarTitle.setVisibility(0);
                        configureAppBarLayout(resources.getDrawable(R.drawable.transparent), resources.getColor(PromotionsFragment.this.themeManager.getAttributeForTheme(R.attr.textColorBlackAlpha).resourceId), true);
                    }
                }
            }
        });
        setupRecyclerView();
        attachPresenter(this.promotionsPresenter);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionViewApp> pauseDownload() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.v1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getClickType() == PromotionAppClick.ClickType.PAUSE_DOWNLOAD);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.i1
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionViewApp app;
                app = ((PromotionAppClick) obj).getApp();
                return app;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<Void> promotionOverDialogClick() {
        return this.promotionOverDialogClick;
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<PromotionViewApp> resumeDownload() {
        return this.promotionAppClick.D(new rx.m.e() { // from class: cm.aptoide.pt.promotions.r1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getClickType() == PromotionAppClick.ClickType.RESUME_DOWNLOAD);
                return valueOf;
            }
        }).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.p1
            @Override // rx.m.e
            public final Object call(Object obj) {
                PromotionViewApp app;
                app = ((PromotionAppClick) obj).getApp();
                return app;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<Void> retryClicked() {
        return e.g.a.c.a.a(this.genericErrorViewRetry);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void setPromotionMessage(String str) {
        this.promotionFirstMessage.setText(str);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showDownloadError(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().hasError()) {
            handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
        }
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showErrorView() {
        this.toolbarImage.setVisibility(8);
        this.loading.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(0);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showLoading() {
        this.toolbarImagePlaceholder.setVisibility(0);
        this.toolbarImage.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(8);
        this.loading.setVisibility(0);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showPromotionApp(PromotionViewApp promotionViewApp, boolean z) {
        if (promotionViewApp.getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
            showWallet(promotionViewApp, z);
            setWalletItemClickListener(promotionViewApp);
        } else {
            this.promotionsAdapter.setPromotionApp(promotionViewApp);
        }
        this.loading.setVisibility(8);
        this.toolbarImagePlaceholder.setVisibility(8);
        this.toolbarImage.setVisibility(0);
        this.promotionsView.setVisibility(0);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showPromotionFeatureGraphic(String str) {
        ImageLoader.with(getContext()).load(str, this.toolbarImage);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showPromotionOverDialog() {
        this.loading.setVisibility(8);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.promotions_promotion_over_dialog, (ViewGroup) null);
        final AlertDialog create = new AlertDialog.Builder(getContext()).setView(inflate).create();
        create.setCancelable(false);
        inflate.findViewById(R.id.dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionsFragment.this.f(create, view);
            }
        });
        create.show();
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void showPromotionTitle(String str) {
        this.promotionTitle.setText(str);
        this.toolbarTitle.setText(str);
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public rx.e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), null, getResources().getString(R.string.root_access_dialog), this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId).X(new rx.m.e() { // from class: cm.aptoide.pt.promotions.e2
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.pt.promotions.PromotionsView
    public void updateClaimStatus(String str) {
        if (str.equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
            setClaimedButton();
            this.promotionsAdapter.isWalletInstalled(true);
        } else {
            this.promotionsAdapter.updateClaimStatus(str);
        }
    }
}
