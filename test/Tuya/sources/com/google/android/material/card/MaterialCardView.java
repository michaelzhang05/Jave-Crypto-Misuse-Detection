package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final String LOG_TAG = "MaterialCardView";

    @NonNull
    private final MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private OnCheckedChangeListener onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {com.google.android.material.R.attr.state_dragged};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CheckedIconGravity {
    }

    /* loaded from: classes3.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z8);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void forceRippleRedrawIfNeeded() {
        if (Build.VERSION.SDK_INT > 26) {
            this.cardViewHelper.forceRippleRedraw();
        }
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.getBackground().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.getCardBackgroundColor();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.getCardForegroundColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.cardViewHelper.getCheckedIcon();
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.getCheckedIconGravity();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.cardViewHelper.getCheckedIconMargin();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.cardViewHelper.getCheckedIconSize();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.getCheckedIconTint();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.cardViewHelper.getUserContentPadding().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.cardViewHelper.getUserContentPadding().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.cardViewHelper.getUserContentPadding().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.cardViewHelper.getUserContentPadding().top;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getProgress() {
        return this.cardViewHelper.getProgress();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.cardViewHelper.getCornerRadius();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.getRippleColor();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.cardViewHelper.getShapeAppearanceModel();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.cardViewHelper.getStrokeColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.getStrokeColorStateList();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.cardViewHelper.getStrokeWidth();
    }

    public boolean isCheckable() {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null && materialCardViewHelper.isCheckable()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cardViewHelper.updateClickable();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.cardViewHelper.getBackground());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        this.cardViewHelper.recalculateCheckedIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAncestorContentPadding(int i8, int i9, int i10, int i11) {
        super.setContentPadding(i8, i9, i10, i11);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.isBackgroundOverwritten()) {
                Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.setBackgroundOverwritten(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i8) {
        this.cardViewHelper.setCardBackgroundColor(ColorStateList.valueOf(i8));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f8) {
        super.setCardElevation(f8);
        this.cardViewHelper.updateElevation();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.cardViewHelper.setCardForegroundColor(colorStateList);
    }

    public void setCheckable(boolean z8) {
        this.cardViewHelper.setCheckable(z8);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.checked != z8) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.cardViewHelper.setCheckedIcon(drawable);
    }

    public void setCheckedIconGravity(int i8) {
        if (this.cardViewHelper.getCheckedIconGravity() != i8) {
            this.cardViewHelper.setCheckedIconGravity(i8);
        }
    }

    public void setCheckedIconMargin(@Dimension int i8) {
        this.cardViewHelper.setCheckedIconMargin(i8);
    }

    public void setCheckedIconMarginResource(@DimenRes int i8) {
        if (i8 != -1) {
            this.cardViewHelper.setCheckedIconMargin(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i8) {
        this.cardViewHelper.setCheckedIcon(AppCompatResources.getDrawable(getContext(), i8));
    }

    public void setCheckedIconSize(@Dimension int i8) {
        this.cardViewHelper.setCheckedIconSize(i8);
    }

    public void setCheckedIconSizeResource(@DimenRes int i8) {
        if (i8 != 0) {
            this.cardViewHelper.setCheckedIconSize(getResources().getDimensionPixelSize(i8));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.cardViewHelper.setCheckedIconTint(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z8) {
        super.setClickable(z8);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.updateClickable();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i8, int i9, int i10, int i11) {
        this.cardViewHelper.setUserContentPadding(i8, i9, i10, i11);
    }

    public void setDragged(boolean z8) {
        if (this.dragged != z8) {
            this.dragged = z8;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f8) {
        super.setMaxCardElevation(f8);
        this.cardViewHelper.updateInsets();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z8) {
        super.setPreventCornerOverlap(z8);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.cardViewHelper.setProgress(f8);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f8) {
        super.setRadius(f8);
        this.cardViewHelper.setCornerRadius(f8);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.cardViewHelper.setRippleColor(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i8) {
        this.cardViewHelper.setRippleColor(AppCompatResources.getColorStateList(getContext(), i8));
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        this.cardViewHelper.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i8) {
        setStrokeColor(ColorStateList.valueOf(i8));
    }

    public void setStrokeWidth(@Dimension int i8) {
        this.cardViewHelper.setStrokeWidth(i8);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z8) {
        super.setUseCompatPadding(z8);
        this.cardViewHelper.updateInsets();
        this.cardViewHelper.updateContentPadding();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.setChecked(this.checked, true);
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.checked);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.cardViewHelper.setCardBackgroundColor(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.cardViewHelper.setStrokeColor(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.checked = r8
            r7.dragged = r8
            r0 = 1
            r7.isParentCardViewDoneInitializing = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.MaterialCardViewHelper r0 = new com.google.android.material.card.MaterialCardViewHelper
            r0.<init>(r7, r9, r10, r6)
            r7.cardViewHelper = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.setCardBackgroundColor(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.setUserContentPadding(r9, r10, r1, r2)
            r0.loadFromAttributes(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
