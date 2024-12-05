package t1;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.regex.Pattern;
import u1.C3800a;

/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3775f {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f38216a = Pattern.compile("^[0-1]*$", 2);

    public static ZonedDateTime a(String str) {
        if (f38216a.matcher(str).matches() && str.length() == 36) {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(m.a(str) * 100), ZoneId.of("UTC"));
        }
        throw new C3800a("Undecodable Datetime '" + str + "'");
    }

    public static String b(ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null) {
            return m.b(zonedDateTime.toInstant().toEpochMilli() / 100, 36);
        }
        return m.b(0L, 36);
    }
}
