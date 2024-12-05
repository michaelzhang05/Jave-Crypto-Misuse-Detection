package K;

import Q.AbstractC1400p;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final T.a f4968c = new T.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    private final String f4969a;

    /* renamed from: b, reason: collision with root package name */
    private final P.l f4970b = new P.l(null);

    public f(String str) {
        this.f4969a = AbstractC1400p.f(str);
    }

    public static O.g a(String str) {
        if (str == null) {
            return O.h.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f4970b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f15891h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f4969a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f15889f;
            } else {
                f4968c.b("Unable to revoke access!", new Object[0]);
            }
            f4968c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e8) {
            f4968c.b("IOException when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        } catch (Exception e9) {
            f4968c.b("Exception when revoking access: ".concat(String.valueOf(e9.toString())), new Object[0]);
        }
        this.f4970b.f(status);
    }
}
