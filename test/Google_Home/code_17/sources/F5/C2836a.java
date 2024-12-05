package f5;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2836a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2836a f31959a = new C2836a();

    public final String a() {
        DateFormat timeInstance = DateFormat.getTimeInstance();
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        timeInstance.format(new Date(System.currentTimeMillis()));
        long timeInMillis = (timeInstance.getCalendar().getTimeInMillis() - (((r0.get(12) * MBridgeCommon.DEFAULT_LOAD_TIMEOUT) + (r0.get(13) * 1000)) + r0.get(14))) / 1000;
        return k.f31966a.c("$(=a%·!45J&S" + timeInMillis);
    }

    public final String b() {
        if ("".length() != 0) {
            return "";
        }
        return "https://secure.uptodown.com:443";
    }
}
