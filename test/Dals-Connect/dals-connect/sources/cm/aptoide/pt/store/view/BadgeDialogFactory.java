package cm.aptoide.pt.store.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.store.view.GridStoreMetaWidget;
import cm.aptoide.pt.themes.ThemeManager;

/* loaded from: classes.dex */
public class BadgeDialogFactory {
    public static final float MEDAL_SCALE = 1.25f;
    private final Context context;
    private int normalMedalSize;
    private int selectedMedalSize;
    private final ThemeManager themeManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.store.view.BadgeDialogFactory$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge;

        static {
            int[] iArr = new int[GridStoreMetaWidget.HomeMeta.Badge.values().length];
            $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge = iArr;
            try {
                iArr[GridStoreMetaWidget.HomeMeta.Badge.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge[GridStoreMetaWidget.HomeMeta.Badge.BRONZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge[GridStoreMetaWidget.HomeMeta.Badge.SILVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge[GridStoreMetaWidget.HomeMeta.Badge.GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge[GridStoreMetaWidget.HomeMeta.Badge.PLATINUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public BadgeDialogFactory(Context context, ThemeManager themeManager) {
        this.context = context;
        this.themeManager = themeManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void createViewModel(final cm.aptoide.pt.store.view.GridStoreMetaWidget.HomeMeta.Badge r48, final android.content.res.Resources r49, cm.aptoide.pt.store.view.GridStoreMetaWidget.HomeMeta.Badge r50, final android.view.View r51, final boolean r52) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.pt.store.view.BadgeDialogFactory.createViewModel(cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge, android.content.res.Resources, cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge, android.view.View, boolean):void");
    }

    private int getProgressColor(int i2, int i3, GridStoreMetaWidget.HomeMeta.Badge badge, GridStoreMetaWidget.HomeMeta.Badge badge2, GridStoreMetaWidget.HomeMeta.Badge badge3) {
        return (badge3.ordinal() > badge.ordinal() || badge3.ordinal() > badge2.ordinal()) ? badge3.ordinal() <= badge.ordinal() ? i3 : this.themeManager.getAttributeForTheme(R.attr.storeBadgeDialogProgress).resourceId : i2;
    }

    private boolean isRankLocked(GridStoreMetaWidget.HomeMeta.Badge badge, GridStoreMetaWidget.HomeMeta.Badge badge2) {
        return badge.ordinal() < badge2.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.NONE, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.BRONZE, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewModel$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.SILVER, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewModel$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.GOLD, view, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createViewModel$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.PLATINUM, view, z);
    }

    private void setBackground(ImageView imageView, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(gradientDrawable);
        } else {
            imageView.setBackgroundDrawable(gradientDrawable);
        }
    }

    private void setDrawableColor(Resources resources, int i2, TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        int length = compoundDrawables.length;
        for (int i3 = 0; i3 < length; i3++) {
            Drawable drawable = compoundDrawables[i3];
            if (drawable != null) {
                drawable.mutate();
                drawable.setColorFilter(new PorterDuffColorFilter(resources.getColor(i2), PorterDuff.Mode.SRC_IN));
                compoundDrawables[i3] = drawable;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private void setupMedal(ImageView imageView, boolean z, int i2, Resources resources) {
        if (z) {
            imageView.getLayoutParams().width = this.selectedMedalSize;
            imageView.getLayoutParams().height = this.selectedMedalSize;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.requestLayout();
        } else {
            imageView.getLayoutParams().width = this.normalMedalSize;
            imageView.getLayoutParams().height = this.normalMedalSize;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.requestLayout();
        }
        Drawable drawable = imageView.getDrawable();
        setDrawableColor(resources, i2, drawable);
        imageView.setImageDrawable(drawable);
        setBackground(imageView, resources.getColor(R.color.white));
    }

    public Dialog create(GridStoreMetaWidget.HomeMeta.Badge badge, boolean z) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.context, this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId)).inflate(R.layout.store_badge_dialog, (ViewGroup) null);
        int i2 = ((ImageView) inflate.findViewById(R.id.bronze_medal)).getLayoutParams().width;
        this.normalMedalSize = i2;
        this.selectedMedalSize = (int) (i2 * 1.25f);
        createViewModel(badge, inflate.getContext().getResources(), badge, inflate, z);
        final AlertDialog create = new AlertDialog.Builder(this.context).setView(inflate).create();
        inflate.findViewById(R.id.ok_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.store.view.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                create.dismiss();
            }
        });
        return create;
    }

    private void setDrawableColor(Resources resources, int i2, Drawable... drawableArr) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(resources.getColor(i2), PorterDuff.Mode.SRC_IN));
            }
        }
    }
}
