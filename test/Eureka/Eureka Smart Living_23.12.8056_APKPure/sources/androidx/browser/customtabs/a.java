package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1420b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1421c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1422d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f1423a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f1424b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1425c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f1426d;

        public a a() {
            return new a(this.f1423a, this.f1424b, this.f1425c, this.f1426d);
        }

        public C0016a b(int i6) {
            this.f1423a = Integer.valueOf(i6 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1419a = num;
        this.f1420b = num2;
        this.f1421c = num3;
        this.f1422d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1419a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1420b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1421c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1422d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
