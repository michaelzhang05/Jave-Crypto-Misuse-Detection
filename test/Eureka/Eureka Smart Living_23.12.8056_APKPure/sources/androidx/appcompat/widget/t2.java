package androidx.appcompat.widget;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t2 extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1249a;

    public t2(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1249a = resources;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a(int i6) {
        return super.getDrawable(i6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i6) {
        return this.f1249a.getAnimation(i6);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i6) {
        return this.f1249a.getBoolean(i6);
    }

    @Override // android.content.res.Resources
    public int getColor(int i6) {
        return this.f1249a.getColor(i6);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i6) {
        return this.f1249a.getColorStateList(i6);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1249a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i6) {
        return this.f1249a.getDimension(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i6) {
        return this.f1249a.getDimensionPixelOffset(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i6) {
        return this.f1249a.getDimensionPixelSize(i6);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1249a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i6, Resources.Theme theme) {
        return androidx.core.content.res.h.e(this.f1249a, i6, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i6, int i7) {
        return androidx.core.content.res.h.f(this.f1249a, i6, i7, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i6, int i7, int i8) {
        return this.f1249a.getFraction(i6, i7, i8);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1249a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i6) {
        return this.f1249a.getIntArray(i6);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i6) {
        return this.f1249a.getInteger(i6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i6) {
        return this.f1249a.getLayout(i6);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i6) {
        return this.f1249a.getMovie(i6);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7) {
        return this.f1249a.getQuantityString(i6, i7);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i6, int i7) {
        return this.f1249a.getQuantityText(i6, i7);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i6) {
        return this.f1249a.getResourceEntryName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i6) {
        return this.f1249a.getResourceName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i6) {
        return this.f1249a.getResourcePackageName(i6);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i6) {
        return this.f1249a.getResourceTypeName(i6);
    }

    @Override // android.content.res.Resources
    public String getString(int i6) {
        return this.f1249a.getString(i6);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i6) {
        return this.f1249a.getStringArray(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6) {
        return this.f1249a.getText(i6);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i6) {
        return this.f1249a.getTextArray(i6);
    }

    @Override // android.content.res.Resources
    public void getValue(int i6, TypedValue typedValue, boolean z5) {
        this.f1249a.getValue(i6, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i6, int i7, TypedValue typedValue, boolean z5) {
        g.a.a(this.f1249a, i6, i7, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i6) {
        return this.f1249a.getXml(i6);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1249a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i6) {
        return this.f1249a.obtainTypedArray(i6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6) {
        return this.f1249a.openRawResource(i6);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i6) {
        return this.f1249a.openRawResourceFd(i6);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1249a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1249a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1249a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i6, int i7, Resources.Theme theme) {
        return androidx.core.content.res.h.f(this.f1249a, i6, i7, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i6, int i7, Object... objArr) {
        return this.f1249a.getQuantityString(i6, i7, objArr);
    }

    @Override // android.content.res.Resources
    public String getString(int i6, Object... objArr) {
        return this.f1249a.getString(i6, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i6, CharSequence charSequence) {
        return this.f1249a.getText(i6, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z5) {
        this.f1249a.getValue(str, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i6, TypedValue typedValue) {
        return this.f1249a.openRawResource(i6, typedValue);
    }
}
