package Q4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9160a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final c a(Context newBase, Locale locale) {
            Context createConfigurationContext;
            AbstractC3255y.i(newBase, "newBase");
            Configuration configuration = newBase.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                configuration.setLocale(locale);
                b.a();
                LocaleList a8 = androidx.compose.ui.text.platform.extensions.b.a(new Locale[]{locale});
                LocaleList.setDefault(a8);
                configuration.setLocales(a8);
                createConfigurationContext = newBase.createConfigurationContext(configuration);
                AbstractC3255y.h(createConfigurationContext, "newBase.createConfigurationContext(configuration)");
            } else {
                configuration.setLocale(locale);
                createConfigurationContext = newBase.createConfigurationContext(configuration);
                AbstractC3255y.h(createConfigurationContext, "newBase.createConfigurationContext(configuration)");
            }
            return new c(createConfigurationContext);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public c(Context context) {
        super(context);
    }
}