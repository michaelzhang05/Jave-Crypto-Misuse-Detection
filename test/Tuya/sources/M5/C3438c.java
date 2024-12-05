package m5;

import X4.I;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONObject;

/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3438c {
    public final I a(JSONObject jsonToZip, JSONObject jSONObject, Y4.d dVar, Context context, String url) {
        Bundle bundle;
        String sb;
        String sb2;
        String d8;
        AbstractC3159y.i(jsonToZip, "jsonToZip");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(url, "url");
        I i8 = new I();
        try {
            try {
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (dVar != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(NotificationCompat.CATEGORY_MESSAGE, "********INI SEND MULTIPART CALL********\nUrl: " + url);
                    dVar.send(137, bundle2);
                }
                C3437b c3437b = new C3437b(dVar);
                C3312F.a aVar = C3312F.f34485c;
                SettingsPreferences.a aVar2 = SettingsPreferences.f29323b;
                c3437b.j("lang", aVar.b(aVar2.q(context)));
                String jSONObject2 = jsonToZip.toString();
                AbstractC3159y.h(jSONObject2, "jsonToZip.toString()");
                byte[] a8 = aVar.a(jSONObject2);
                c3437b.g("zipped", valueOf, a8);
                c3437b.i();
                c3437b.d(new URL(url), valueOf);
                c3437b.c("lang", aVar.b(aVar2.q(context)));
                c3437b.a("zipped", valueOf, a8, jSONObject);
                c3437b.e();
                i8 = c3437b.f(true);
                if (dVar != null && i8.d() != null) {
                    try {
                        String d9 = i8.d();
                        AbstractC3159y.f(d9);
                        d8 = new JSONObject(d9).toString(2);
                    } catch (Exception unused) {
                        d8 = i8.d();
                    }
                    String str = "********RESPONSE MULTIPART CALL********\n" + d8;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                    dVar.send(137, bundle3);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                if (dVar != null) {
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
                    dVar.send(137, bundle4);
                }
                if (dVar != null) {
                    bundle = new Bundle();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
                if (dVar != null) {
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
                    dVar.send(137, bundle5);
                }
                if (dVar != null) {
                    bundle = new Bundle();
                }
            }
            if (dVar != null) {
                bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                dVar.send(137, bundle);
            }
            return i8;
        } catch (Throwable th) {
            if (dVar != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                dVar.send(137, bundle6);
            }
            throw th;
        }
    }
}
