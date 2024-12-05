package L7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6325a = new a();

    public static Date a(a aVar, String dateString, String str, Locale locale, int i8) {
        String format;
        if ((i8 & 2) != 0) {
            format = "yyyy-MM-dd'T'HH:mm:ss";
        } else {
            format = null;
        }
        AbstractC3255y.i(dateString, "dateString");
        AbstractC3255y.i(format, "format");
        AbstractC3255y.i(locale, "locale");
        return new SimpleDateFormat(format, locale).parse(dateString);
    }
}
