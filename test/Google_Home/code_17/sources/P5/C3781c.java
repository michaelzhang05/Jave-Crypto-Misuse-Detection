package p5;

import a5.I;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import b5.ResultReceiverC1979d;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3660F;
import org.json.JSONObject;

/* renamed from: p5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3781c {
    public final I a(JSONObject jsonToZip, JSONObject jSONObject, ResultReceiverC1979d resultReceiverC1979d, Context context, String url) {
        Bundle bundle;
        String sb;
        String sb2;
        String d8;
        AbstractC3255y.i(jsonToZip, "jsonToZip");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(url, "url");
        I i8 = new I();
        try {
            try {
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (resultReceiverC1979d != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(NotificationCompat.CATEGORY_MESSAGE, "********INI SEND MULTIPART CALL********\nUrl: " + url);
                    resultReceiverC1979d.send(137, bundle2);
                }
                C3780b c3780b = new C3780b(resultReceiverC1979d);
                C3660F.a aVar = C3660F.f36486c;
                SettingsPreferences.a aVar2 = SettingsPreferences.f30353b;
                c3780b.j("lang", aVar.b(aVar2.q(context)));
                String jSONObject2 = jsonToZip.toString();
                AbstractC3255y.h(jSONObject2, "jsonToZip.toString()");
                byte[] a8 = aVar.a(jSONObject2);
                c3780b.g("zipped", valueOf, a8);
                c3780b.i();
                c3780b.d(new URL(url), valueOf);
                c3780b.c("lang", aVar.b(aVar2.q(context)));
                c3780b.a("zipped", valueOf, a8, jSONObject);
                c3780b.e();
                i8 = c3780b.f(true);
                if (resultReceiverC1979d != null && i8.d() != null) {
                    try {
                        String d9 = i8.d();
                        AbstractC3255y.f(d9);
                        d8 = new JSONObject(d9).toString(2);
                    } catch (Exception unused) {
                        d8 = i8.d();
                    }
                    String str = "********RESPONSE MULTIPART CALL********\n" + d8;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                    resultReceiverC1979d.send(137, bundle3);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                if (resultReceiverC1979d != null) {
                    if (e8.getMessage() != null) {
                        sb2 = "********IOEXCEPTION MULTIPART CALL********\n" + e8.getMessage();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('\n');
                        sb3.append(e8);
                        sb2 = sb3.toString();
                    }
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(NotificationCompat.CATEGORY_MESSAGE, sb2);
                    resultReceiverC1979d.send(137, bundle4);
                }
                if (resultReceiverC1979d != null) {
                    bundle = new Bundle();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
                if (resultReceiverC1979d != null) {
                    if (e9.getMessage() != null) {
                        sb = "********EXCEPTION MULTIPART CALL********\n" + e9.getMessage();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append('\n');
                        sb4.append(e9);
                        sb = sb4.toString();
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString(NotificationCompat.CATEGORY_MESSAGE, sb);
                    resultReceiverC1979d.send(137, bundle5);
                }
                if (resultReceiverC1979d != null) {
                    bundle = new Bundle();
                }
            }
            if (resultReceiverC1979d != null) {
                bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                resultReceiverC1979d.send(137, bundle);
            }
            return i8;
        } catch (Throwable th) {
            if (resultReceiverC1979d != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                resultReceiverC1979d.send(137, bundle6);
            }
            throw th;
        }
    }
}
