package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.AnyThread;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LocaleManagerCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        static LocaleList localeManagerGetSystemLocales(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    private LocaleManagerCompat() {
    }

    @NonNull
    @AnyThread
    public static LocaleListCompat getApplicationLocales(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication(context);
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication));
            }
            return LocaleListCompat.getEmptyLocaleList();
        }
        return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
    }

    @VisibleForTesting
    static LocaleListCompat getConfigurationLocales(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getLocales(configuration);
        }
        return LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(configuration.locale));
    }

    @RequiresApi(33)
    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }

    @NonNull
    @AnyThread
    public static LocaleListCompat getSystemLocales(@NonNull Context context) {
        LocaleListCompat emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManagerForApplication = getLocaleManagerForApplication(context);
            if (localeManagerForApplication != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication));
            }
            return emptyLocaleList;
        }
        return getConfigurationLocales(Resources.getSystem().getConfiguration());
    }
}
