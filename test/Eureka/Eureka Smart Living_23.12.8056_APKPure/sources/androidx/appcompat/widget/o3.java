package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class o3 extends t2 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1183c = false;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f1184b;

    public o3(Context context, Resources resources) {
        super(resources);
        this.f1184b = new WeakReference(context);
    }

    public static boolean b() {
        return f1183c;
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i6) {
        return super.getAnimation(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i6) {
        return super.getBoolean(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i6) {
        return super.getColor(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i6) {
        return super.getColorStateList(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i6) {
        return super.getDimension(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i6) {
        return super.getDimensionPixelOffset(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i6) {
        return super.getDimensionPixelSize(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6) {
        Context context = (Context) this.f1184b.get();
        return context != null ? s2.h().t(context, this, i6) : a(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i6, int i7) {
        return super.getDrawableForDensity(i6, i7);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i6, int i7, int i8) {
        return super.getFraction(i6, i7, i8);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i6) {
        return super.getIntArray(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i6) {
        return super.getInteger(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i6) {
        return super.getLayout(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i6) {
        return super.getMovie(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i6, int i7) {
        return super.getQuantityString(i6, i7);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i6, int i7) {
        return super.getQuantityText(i6, i7);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i6) {
        return super.getResourceEntryName(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i6) {
        return super.getResourceName(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i6) {
        return super.getResourcePackageName(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i6) {
        return super.getResourceTypeName(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i6) {
        return super.getString(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i6) {
        return super.getStringArray(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i6) {
        return super.getText(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i6) {
        return super.getTextArray(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i6, TypedValue typedValue, boolean z5) {
        super.getValue(i6, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i6, int i7, TypedValue typedValue, boolean z5) {
        super.getValueForDensity(i6, i7, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i6) {
        return super.getXml(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i6) {
        return super.obtainTypedArray(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i6) {
        return super.openRawResource(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i6) {
        return super.openRawResourceFd(i6);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i6, Resources.Theme theme) {
        return super.getDrawable(i6, theme);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i6, int i7, Resources.Theme theme) {
        return super.getDrawableForDensity(i6, i7, theme);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i6, int i7, Object[] objArr) {
        return super.getQuantityString(i6, i7, objArr);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i6, Object[] objArr) {
        return super.getString(i6, objArr);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i6, CharSequence charSequence) {
        return super.getText(i6, charSequence);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z5) {
        super.getValue(str, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.t2, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i6, TypedValue typedValue) {
        return super.openRawResource(i6, typedValue);
    }
}
